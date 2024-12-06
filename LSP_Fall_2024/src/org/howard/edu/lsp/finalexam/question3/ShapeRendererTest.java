package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeRendererTest {
	// Test cases for rendering different shapes

    @Test
    public void testRenderCircle() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("circle");
    }

    @Test
    public void testRenderRectangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("rectangle");
    }

    @Test
    public void testRenderTriangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("triangle");
    }

    @Test
    public void testRenderUnknownShape() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("hexagon");  // Should output: Unknown shape type: hexagon
    }

    // Test the singleton pattern of ShapeFactory
    @Test
    public void testShapeFactorySingleton() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2, "ShapeFactory should be a singleton");
    }

    // Test the shape creation via factory method
    @Test
    public void testShapeCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();

        Shape circle = factory.createShape("circle");
        assertTrue(circle instanceof Circle, "Shape should be a Circle");

        Shape rectangle = factory.createShape("rectangle");
        assertTrue(rectangle instanceof Rectangle, "Shape should be a Rectangle");

        Shape triangle = factory.createShape("triangle");
        assertTrue(triangle instanceof Triangle, "Shape should be a Triangle");

        Shape unknown = factory.createShape("unknown");
        assertNull(unknown, "Unknown shape type should return null");
    }
	

}
