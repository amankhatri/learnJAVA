import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

/*This class can store a list of url*/
public class Urlibrary implements Iterable<String>{
	private LinkedList<String> urls = new LinkedList<String>();
	/*I will create an inner class here because If I create an inner class
	 * it will have access to urls directly. I can do this seperately by 
	 * creating a new class and passing urls as a parameter to its constructor
	 * .*/
	private class UrlIterator implements Iterator<String>{
		/*I want to keep track to where the iterator is point so 
		 * we will have index variable*/
		private int index = 0;
		@Override
		public boolean hasNext() {
			// This will return true if index is less then the
			// number of urls 
			return index < urls.size();
		}

		@Override
		public String next() {
			/*Here I have to increment the index and return the next urls
			 * but before incrememnting it I want to return html page
			 * of the url*/
			/*Now I want to read whatever is on html using stringbuilder*/
			StringBuilder sb = new StringBuilder();
			try {
				URL url = new URL(urls.get(index));
				/*now i can download html. To do that I need a buffered reader
				 * */
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

				String line = null;
				while((line = br.readLine())!= null){
					sb.append(line);
					sb.append("\n");
				}
				br.close();
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;
			return sb.toString();
			
		}
		
		@Override
		public void remove(){
			urls.remove(index);
			
		}
		
	}
	
	public Urlibrary(){
		urls.add("https://www.caveofprogramming.com/");
		urls.add("https://www.facebook.com/caveofprogramming/");
		urls.add("https://www.bbc.uk/");
	}
	/*Default and easiest iterator*/
	/*public Iterator<String> iterator() {
		/* Iterator is the sole method in Iterable which needs to be implemented
		 * and since  Urlibrary implements Iterable<String> this method would have
		 * to point to each of the string urls. I have return an interator object
		 * from this method. Iterator object is something that has method 
		 * hasNext() next and remove. It is capable of pointing to the objects
		 * over which you want to iterate*/
		/*now this will return objects of urls linked list. This is the 
		 * simplest possible way. */
	/*	return urls.iterator();
	}*/
	
	
	/*Custom Iterator where I will not only iterate through the urls above 
	 * but will also download the pages in */
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}
	
	
	
	
}
