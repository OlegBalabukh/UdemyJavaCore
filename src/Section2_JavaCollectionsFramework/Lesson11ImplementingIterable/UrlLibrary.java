package Section2_JavaCollectionsFramework.Lesson11ImplementingIterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{   // or Iterable<Custom Object>
    private LinkedList<String> urls = new LinkedList<String>();

    //  inner class UrlIterator
    private class UrlIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line = null;

                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }

                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            index++;

            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }
    }

    // constructor
    public UrlLibrary() {
        urls.add("http://www.caveofprogramming.com");
        urls.add("http://www.yahoo.com");
        urls.add("http://www.google.com");
    }

    /////////  custom iterator (Reading html from urls)  /////////
    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    /////////  default iterator (Reading urls)  /////////
    /*
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
    */
}
