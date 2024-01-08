import java.awt.Desktop;
import java.net.URI;


public class browserEngagement {

    public static void main(String[] args) throws Exception {
        Desktop desk = Desktop.getDesktop();
        desk.browse(new URI("https://www.example.com"));


        // I don't know how to extract title with only using java
        System.out.println();
    }
}
