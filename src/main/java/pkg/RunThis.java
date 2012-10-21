package pkg;

import pkg.clojure.CljApp;

/**
 * Created by IntelliJ IDEA. User: jackdanger Date: 10/20/12 Time: 10:07 PM To change this template
 * use File | Settings | File Templates.
 */
public class RunThis {
  public static void main(String[] args) {
    new JavaApp().hello();
    new CljApp().hello();
  }
}
