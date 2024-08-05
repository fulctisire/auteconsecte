  import java.awt.Desktop;
  import java.net.URI;

  public class UrlOpener {

      public static void openUrl(String url) {
          try {
              Desktop.getDesktop().browse(new URI(url));
              System.out.println("Opened URL successfully: " + url);
          } catch (Exception e) {
              System.err.println("Error opening URL: " + e.getMessage());
          }
      }

      public static void main(String[] args) {
          openUrl("https://example.com");
      }
  }
  