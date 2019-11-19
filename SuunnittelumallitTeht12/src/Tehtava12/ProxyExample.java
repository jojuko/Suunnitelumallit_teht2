package Tehtava12;
import java.util.*;

public class ProxyExample {
	
	public static void main(final String[] arguments) {
		
		List<Image> album = new ArrayList<Image>();
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        Image image4 = new ProxyImage("HiRes_10MB_Photo4");

        album.add(image1);
        album.add(image2);
        album.add(image3);
        album.add(image4);
        
        for(Image image : album) {
        	image.showImage();
        }
        for(Image image : album) {
        	image.displayImage();
        	image.showImage();
        }
    }

}
