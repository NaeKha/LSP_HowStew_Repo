package org.howard.edu.lsp.finalexam.question3;



//Concrete implementation for shapes and the shape interface 
//The Shape interface
interface Shape {
 void draw();
}

//Concrete implementation of Circle
class Circle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Concrete implementation of Rectangle
class Rectangle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Concrete implementation of Triangle
class Triangle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Triangle");
 }
}

//Singleton Factory Class
class ShapeFactory {
 private static ShapeFactory instance;

 // Private constructor for Singleton pattern
 private ShapeFactory() {}

 // Method to get the singleton instance of ShapeFactory
 public static ShapeFactory getInstance() {
     if (instance == null) {
         instance = new ShapeFactory();
     }
     return instance;
 }

 // Factory method to create Shape instances
 public Shape createShape(String shapeType) {
     if (shapeType.equalsIgnoreCase("circle")) {
         return new Circle();
     } else if (shapeType.equalsIgnoreCase("rectangle")) {
         return new Rectangle();
     } else if (shapeType.equalsIgnoreCase("triangle")) {
         return new Triangle();
     } else {
         System.out.println("Unknown shape type: " + shapeType);
         return null;
     }
 }
}

// ShapeRenderer class that uses the Shapefactory 
public class ShapeRenderer {
	public void renderShape(String shapeType) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape shape = shapeFactory.createShape(shapeType);

        if (shape != null) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon  
    }
}

