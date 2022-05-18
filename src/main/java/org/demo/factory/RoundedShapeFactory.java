package org.demo.factory;

import org.demo.model.Shape;
import org.demo.model.impl.RoundedRectangle;
import org.demo.model.impl.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }

        return null;
    }
}
