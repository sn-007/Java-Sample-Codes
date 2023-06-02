public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        // Logic to load the image from disk
        System.out.println("Loading image from disk: " + filename);
    }

    @Override
    public void display() {
        // Logic to display the image
        System.out.println("Displaying image: " + filename);
    }
}