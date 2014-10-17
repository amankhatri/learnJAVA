import org.opencv.core.Core;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	    new DetectFace().run();
	}

}
