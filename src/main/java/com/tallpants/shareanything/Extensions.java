package com.tallpants.shareanything;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Extensions {
  private static String gistArray[] = { "Makefile", "Rakefile", "ada", "adb", "ads", "applescript", "as", "ascx", "asm",
    "asmx", "asp", "aspx", "bas", "bash", "bat", "bdsgroup", "bdsproj", "c", "cc", "cfc", "cfm", "cfml", "cgi", "clj",
    "cls", "cmake", "cmd", "coffee", "coffeekup", "cpp", "cpt", "cpy", "crt", "cs", "csh", "cson", "csr", "css",
    "csv", "ctl", "cxx", "dart", "dfm", "dof", "dpk", "dproj", "dtd", "eco", "el", "ent", "erb", "erl", "ex", "exs",
    "f", "f03", "f77", "f90", "f95", "fish", "for", "fpp", "frm", "ftn", "gitattributes", "gitignore", "gitmodules",
    "go", "gpp", "gradle", "groovy", "groupproj", "grunit", "gtmpl", "h", "haml", "hbs", "hh", "hpp", "hrl", "hs",
    "hta", "htaccess", "htc", "htm", "html", "htpasswd", "hxx", "inc", "ini", "int", "itcl", "itk", "jade", "java",
    "jhtm", "jhtml", "js", "json", "json5", "jsp", "jspx", "jsx", "ksh", "less", "lhs", "lisp", "lsp", "lua", "m",
    "mak", "map", "markdown", "master", "md", "metadata", "mk", "mkd", "ml", "mli", "mm", "mxml", "nfm", "noon",
    "npmignore", "ops", "pas", "pasm", "pem", "pg", "php", "php3", "php4", "php5", "phpt", "phtml", "pir", "pl", "pm",
    "pmc", "pod", "pot", "properties", "props", "pt", "pug", "py", "r", "rake", "rb", "resx", "rhtml", "rjs", "rs",
    "rtf", "rxml", "s", "sass", "scala", "scm", "scss", "sh", "shtml", "spec", "sql", "sqlite", "ss", "st", "sty",
    "styl", "stylus", "sv", "svc", "svg", "t", "tcl", "tcsh", "tex", "text", "textile", "tg", "tmpl", "tpl", "ts",
    "tsv", "tsx", "tt", "tt2", "ttml", "txt", "v", "vb", "vh", "vhd", "vhdl", "vim", "x-php", "xhtml", "xml", "xs",
    "xsd", "xsl", "xslt", "yaml", "yml", "zsh" };

  private static String imgurArray[] = { "jpg", "jpeg", "png", "gif", "apng", "tiff", "tif" };

  public static Set<String> gist;
  public static Set<String> imgur;

  static {
    gist = new HashSet<>(Arrays.asList(gistArray));
    imgur = new HashSet<>(Arrays.asList(imgurArray));
  }
}
