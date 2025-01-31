import java.util.*;

class Image {
    private double imageWidth;
    private double imageHeight;
    private String colorCode;

    public Image(double imageWidth, double imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = null;
    }

    public double getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(double imageWidth) {
        this.imageWidth = imageWidth;
    }

    public double getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(double imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String toString(double value) {
        return String.valueOf(value);
    }

}

class ImageLibrary {
    private ArrayList<Image> imageList;

    public ImageLibrary() {
        this.imageList = new ArrayList<Image>();
    }

    public void insertImage(Image image) {
        this.imageList.add(image);
    }

    public Image searchImage(String colorCode) {
        for (Image image : this.imageList) {
            if (image.getColorCode().equalsIgnoreCase(colorCode)) {
                return image;
            }
        }
        return null;
    }

    public Image getImage(String colorCode) {
        return searchImage(colorCode);
    }
    
}

public class ImageController {
    public static void main(String[] args) {
        Image img1 = new Image(200, 100, "red");
        Image img2 = new Image(300, 200, "blue");
        ImageLibrary imageLibrary = new ImageLibrary();
        imageLibrary.insertImage(img1);
        imageLibrary.insertImage(img2);

        String searchColor = "red";

        Image foundImage = imageLibrary.searchImage(searchColor);
        if (foundImage != null) {
            System.out.println("Image found: " + foundImage.toString(foundImage.getImageWidth()));
            System.out.println("Image found: " + foundImage.toString(foundImage.getImageHeight()));
            System.out.println("Image found: " + foundImage.getColorCode());
        } else {
            System.out.println("Image not found");
        }
    }
}