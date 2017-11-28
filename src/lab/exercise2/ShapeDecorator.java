/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

/**
 *
 * @author L115student
 */
public abstract class ShapeDecorator extends Shape {
    private Shape shapeToBeDecorated;
    
    public ShapeDecorator(Shape shapeToBeDecorated) {
        this.shapeToBeDecorated = shapeToBeDecorated;
    }
    
    public void draw() {
        shapeToBeDecorated.draw();
    }

    public Shape getShapeToBeDecorated() {
        return shapeToBeDecorated;
    }

    public void setShapeToBeDecorated(Shape shapeToBeDecorated) {
        this.shapeToBeDecorated = shapeToBeDecorated;
    }
    
    
}
