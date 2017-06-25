import com.mashape.unirest.http.exceptions.UnirestException;
import com.tallpants.shareanything.Share;

import java.io.File;

public class App {
  public static void main(String[] args) {
    String projectDirectory = System.getProperty("user.dir");
    File f = new File(projectDirectory + "/samples", "image.png");
    try {
      System.out.println(Share.share(f).toString());
    } catch (UnirestException e) {
      System.out.println(e.toString());
    }
  }
}
