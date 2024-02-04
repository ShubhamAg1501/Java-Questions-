
// Shape.java (Base class)
package com.codewithharry.shape;

public class Shape {
    // Base class for all shapes
}

// Rectangle.java
package com.codewithharry.shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters and setters for dimensions
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Methods for volume and surface area specific to Rectangle
    public double calculateArea() {
        return length * width;
    }
}

// Square.java
package com.codewithharry.shape;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

// Circle.java
package com.codewithharry.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters and setters for dimensions
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Methods for volume and surface area specific to Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder.java
package com.codewithharry.shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Getters and setters for dimensions
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Methods for volume and surface area specific to Cylinder
    public double calculateVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    public double calculateSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }
}

// Sphere.java
package com.codewithharry.shape;

public class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    // Methods for volume and surface area specific to Sphere
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
}

