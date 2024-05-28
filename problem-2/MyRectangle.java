public class MyRectangle {
    // instance fields
    private MyPoint topLeft;
    private MyPoint botRight;

    // constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.botRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.botRight = botRight;
    }

    // getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBotRight() {
        return botRight;
    }

    public void setBotRight(MyPoint botRight) {
        this.botRight = botRight;
    }

    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        this.topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        this.topLeft.setY(y);
    }

    public int getBotRightX() {
        return botRight.getX();
    }

    public void setBotRightX(int x) {
        this.botRight.setX(x);
    }

    public int getBotRightY() {
        return botRight.getY();
    }

    public void setBotRightY(int y) {
        this.botRight.setY(y);
    }

    public int[] getTopLeftXY() {
        int[] xy = { topLeft.getX(), topLeft.getY() };
        return xy;
    }

    public void setTopLeftXY(int x, int y) {
        this.topLeft.setXY(x, y);
    }

    public int[] getBotRightXY() {
        int[] xy = { botRight.getX(), botRight.getY() };
        return xy;
    }

    public void setBotRightXY(int x, int y) {
        this.botRight.setXY(x, y);
    }

    public MyPoint getBotLeft() {
        return new MyPoint(this.getTopLeftX(), this.getBotRightY());
    }

    public MyPoint getTopRight() {
        return new MyPoint(this.getBotRightX(), this.getTopLeftY());
    }

    // methods
    public double getPerimeter() {
        double side1 = this.topLeft.distance(this.getTopRight());
        double side2 = this.getBotLeft().distance(this.botRight);

        return 2 * (side1 + side2);
    }

    public double getArea() {
        double side1 = this.topLeft.distance(this.getTopRight());
        double side2 = this.getBotLeft().distance(this.botRight);

        return side1 * side2;
    }

    public String toString() {
        return String.format("MyRectangle[botRight=(%d, %d), topLeft=(%d, %d)]", this.getBotRightX(),
                this.getBotRightY(), this.getTopLeftX(), this.getTopLeftY());
    }
}
