public class MyLine {
    // instance variables
    private MyPoint begin;
    private MyPoint end;

    // constructors
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // getters and setters
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        int xy[] = { begin.getX(), begin.getY() };
        return xy;
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY() {
        int xy[] = { end.getX(), end.getY() };
        return xy;
    }

    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength() {
        return this.begin.distance(this.end);
    }

    public double getGradient() {
        int xDiff = this.getBeginX() - this.getEndX();
        int yDiff = this.getBeginY() - this.getEndY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return String.format("MyLine[begin=(%d, %d), end=(%d, %d)]", this.getBeginX(), this.getBeginY(), this.getEndX(),
                this.getEndY());
    }
}
