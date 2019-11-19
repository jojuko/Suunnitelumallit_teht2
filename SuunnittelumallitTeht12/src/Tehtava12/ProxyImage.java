package Tehtava12;

public class ProxyImage implements Image{
	
	private final String filename;
    private RealImage image;
    
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }


	@Override
	public void showImage() {
		if(image == null) {
			System.out.println("Proxy image " + filename);
		}
		else {
			image.showImage();
		}
		
		
	}

}
