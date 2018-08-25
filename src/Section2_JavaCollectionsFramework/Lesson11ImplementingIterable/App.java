package Section2_JavaCollectionsFramework.Lesson11ImplementingIterable;

public class App {
    public static void main(String[] args) {
        UrlLibrary UrlLibrary = new UrlLibrary();

        // Reading urls
        /*
        for (String url: UrlLibrary) {
            System.out.println(url);
        }
        */

        // Reading html from urls
        for (String html: UrlLibrary) {
            //System.out.println(html.length());
            System.out.println(html);
        }
    }
}
