package org.demo.factory;

import org.demo.model.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
