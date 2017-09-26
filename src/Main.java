import java.util.*;
public class Main {
    public static void main(String args[]){
        int length = 0;
        int width = 0;
        int base = 0;
        int height = 0;
        int radius = 0;
        int side1 = 0;
        int side2 = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter length of rectangle (positive integer): ");
        length = scnr.nextInt();
        System.out.print("Enter width of rectangle (positive integer): ");
        width = scnr.nextInt();
        System.out.print("Now enter the radius of the circle (positive integer): ");
        radius = scnr.nextInt();


        double perimrect = 2 * (length + width);
        double arearect = length * width;
        double circumcircle = 2 * Math.PI * radius;
        double areacircle = Math.PI * radius * radius;
        double perimtriangle = side1 + side2 + base;
        double areatriangle = height * (base / 2);

        System.out.println("Area of rectangle: " + arearect);
        System.out.println("Area of circle: " + areacircle);
        System.out.println("Perimeter of rectangle: " + perimrect);
        System.out.println("Circumference of circle: " + circumcircle);

        int radiusSphere = 0;
        int diameterRectPrism = 0;
        int heightRectPrism = 0;
        int widthRectPrism = 0;
        int heightCylinder = 0;
        int radiusCylinder = 0;

        System.out.print("Enter the radius of the sphere: ");
        radiusSphere = scnr.nextInt();
        System.out.print("Enter the diameter of the rectangular prism: ");
        diameterRectPrism = scnr.nextInt();
        System.out.print("Enter the height of the rectangular prism: ");
        heightRectPrism = scnr.nextInt();
        System.out.print("Enter the width of the rectangular prism: ");
        widthRectPrism = scnr.nextInt();
        System.out.print("Enter the height of the cylinder: ");
        heightCylinder = scnr.nextInt();
        System.out.print("Enter the radius of the cylinder: ");
        radiusCylinder = scnr.nextInt();

        double surfaceAreaSphere = 4 * Math.PI * radiusSphere * radiusSphere;
        double volumeSphere = 4 * Math.PI * (Math.pow(radiusSphere, 3) /3);
        double surfaceAreaRectPrism = 2 * ((heightRectPrism * diameterRectPrism) + (heightRectPrism * widthRectPrism) + (diameterRectPrism * widthRectPrism));
        double volumeRectPrism = heightRectPrism * diameterRectPrism * widthRectPrism;
        double surfaceAreaCylinder = (2 * Math.PI * radiusCylinder * heightCylinder) + (2 * Math.PI * Math.pow(radiusCylinder, 2));
        double volumeCylinder = Math.PI * radiusCylinder * radiusCylinder * heightCylinder;

        System.out.println("The surface area of the sphere is: " + surfaceAreaSphere);
        System.out.println("The volume of the sphere is: " + volumeSphere);
        System.out.println("The surface area of the rectangular prism is: " + surfaceAreaRectPrism);
        System.out.println("The volume of the rectangular prism is: " + volumeRectPrism);
        System.out.println("The surface area of cylinder is: " + surfaceAreaCylinder);
        System.out.println("The volume of the cylinder is: " + volumeCylinder);

    }
}
