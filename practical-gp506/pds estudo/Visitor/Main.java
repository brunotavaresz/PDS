package Visitor;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        InfoVisitor visitor = new InfoVisitor();
        circle.accept(visitor);
        rectangle.accept(visitor);
    }

    interface Visitor {
        void visit(Circle circle);
        void visit(Rectangle rectangle);
    }

    static class Circle {
        int radius;

        Circle(int radius) {
            this.radius = radius;
        }

        void showCircleInfo() {
            System.out.println("Circle with radius " + this.radius);
        }

        void accept(Visitor visitor) {
            visitor.visit(this);
        }

    }

    static class Rectangle {
        int comprimento;
        int largura;

        Rectangle(int comprimento, int largura) {
            this.comprimento = comprimento;
            this.largura = largura;
        }

        public void showRectangleInfo() {
            System.out.println("Rectangle with width " + this.comprimento + " and height " + this.largura);
        }
    
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    static class InfoVisitor implements Visitor{
        
        public void visit(Circle circle) {
            circle.showCircleInfo();
        }

        public void visit(Rectangle rectangle){
            rectangle.showRectangleInfo();
        }
    }
}
