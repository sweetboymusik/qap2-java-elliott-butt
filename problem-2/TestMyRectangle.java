public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(5, 7);

        MyRectangle rect1 = new MyRectangle(point1, point2);
        MyRectangle rect2 = new MyRectangle(4, 2, 6, 1);

        System.out.println("Rext 1 info:");
        System.out.println(rect1);
        System.out.println("Bot right x: " + rect1.getBotRightX());
        System.out.println("Bot right y: " + rect1.getBotRightY());
        System.out.println("Bot right x/y: " + rect1.getBotRightXY()[0] + ", " + rect1.getBotRightXY()[1]);

        System.out.println("Top left x: " + rect1.getTopLeftX());
        System.out.println("Top left y: " + rect1.getTopLeftY());
        System.out.println("Top left x/y: " + rect1.getTopLeftXY()[0] + ", " + rect1.getTopLeftXY()[1]);

        System.out.println("Area: " + rect1.getArea());
        System.out.println("Length: " + rect1.getPerimeter());

        System.out.println("\nRect 2 info:");
        System.out.println("Bot right: " + rect2.getBotRight());
        System.out.println("Top left: " + rect2.getTopLeft());

        rect2.setBotRightX(9);
        rect2.setBotRightY(11);
        rect2.setBotRight(new MyPoint(11, 9));
        rect2.setTopLeftX(4);
        rect2.setTopLeftY(17);
        rect2.setTopLeft(new MyPoint(17, 4));
        System.out.println(rect2);
    }
}
