package com.tallpants.shareanything;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Share {
  public static URL share(File file) throws UnirestException {
    String split[] = file.getName().split("\\.");
    if (split.length < 2) {
      // anonfile
      return null;
    }

    String fileExtension = split[split.length - 1];

    try {
      if (fileExtension.equals("shareanythingsnippet")) {
        return Hosts.gistRaw(file);
      }

      double sizeMB = Math.ceil(file.length() / 1000000);

      if (sizeMB <= 10 && Extensions.imgur.contains(fileExtension)) {
        return Hosts.imgur(file);
      } else if (sizeMB <= 1 && Extensions.gist.contains(fileExtension)) {
          return Hosts.gist(file);
      } else {
        // anonfile
        return null;
      }
    } catch (IOException e) {
      System.out.println(e.toString());
      return null;
    }
  }
}
