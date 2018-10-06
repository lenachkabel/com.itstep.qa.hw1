package com.itstep.qa.runner;

import javafx.scene.shape.Circle;

public class CircleRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        circle.setRadius(3);
        System.out.println("Площадь круга "+ circle.getRadius());
        System.out.println("Радиус круга");
    }
}
