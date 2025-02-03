package Assignments.Answers.Assignment_1.Q5;

import Assignments.Answers.Assignment_1.Q4.*;

class ImageLibrary {
    private Image[] images;
    private int size;

    public ImageLibrary(int capacity) {
        this.images = new Image[capacity];
        this.size = 0;
    }

    public void insertImage(Image image) {

        if (size < images.length) {
            images[size++] = image;
        } else {
            System.out.println("Image library is full.");
        }

    }

    public Image searchImage(String colorCode) {
        for (int i = 0; i < size; i++) {
            if (images[i].getColorCode().equalsIgnoreCase(colorCode)) {
                return images[i];
            }
        }
        return null;
    }

    public Image getImage(int index) {
        if (index >= 0 && index < size) {
            return images[index];
        }
        return null;
    }

    public void displayAllImages() {
        for (int i = 0; i < size; i++) {
            System.out.println(images[i].toString());
        }
    }
}

public class ImageController {
    public static void main(String[] args) {
        
        ImageLibrary imageLibrary = new ImageLibrary(10);
        Image image1 = new Image(1920, 1080, "#FFFFFF");
        Image image2 = new Image(1280, 720, "#FF5733");
        imageLibrary.insertImage(image1);
        imageLibrary.insertImage(image2);
        System.out.println("All Images:");
        imageLibrary.displayAllImages();
        String searchColorCode = "#FF5733";
        Image searchedImage = imageLibrary.searchImage(searchColorCode);
        if (searchedImage != null) {
            System.out.println("Searched Image: " + searchedImage.toString());
        } else {
            System.out.println("Image with color code " + searchColorCode + " not found.");
        }
        int index = 0;
        Image imageAtIndex = imageLibrary.getImage(index);
        if (imageAtIndex != null) {
            System.out.println("Image at Index " + index + ": " + imageAtIndex.toString());
        } else {
            System.out.println("No image at index " + index);
        }
    }
}
