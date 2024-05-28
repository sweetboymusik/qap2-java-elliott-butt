public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("%d, %d", x, y);
    }

    public double distance(int x, int y) {
        int xdiff = this.x - x;
        int ydiff = this.y - y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public double distance(MyPoint another) {
        int xdiff = this.x - another.x;
        int ydiff = this.y - another.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public double distance() {
        int xdiff = this.x - 0;
        int ydiff = this.y - 0;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }
}
