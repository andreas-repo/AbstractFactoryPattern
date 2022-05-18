package org.demo;

import org.demo.factory.AbstractFactory;
import org.demo.factory.FactoryProducer;
import org.demo.model.Shape;

public class Application {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        //get an object of rectangle shape
        Shape shape1 = abstractFactory.getShape("RECTANGLE");
        //call draw method og rectangle shape
        shape1.draw();
        //get an object of square shape
        Shape shape2 = abstractFactory.getShape("SQUARE");
        //call draw method of square shape
        shape2.draw();
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of rounded rectangle shape
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of rounded rectangle shape
        shape3.draw();
        //get an object of rounded square shape
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of rounded square shape
        shape4.draw();


    }
}
