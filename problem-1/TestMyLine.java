public class TestMyLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(2, 5);
        MyPoint point2 = new MyPoint(7, 3);

        MyLine line1 = new MyLine(point1, point2);
        MyLine line2 = new MyLine(4, 3, 9, 1);

        System.out.println("Line 1 info:");
        System.out.println(line1);
        System.out.println("Begin x: " + line1.getBeginX());
        System.out.println("Begin y: " + line1.getBeginY());
        System.out.println("Begin x/y: " + line1.getBeginXY()[0] + ", " + line1.getBeginXY()[1]);

        System.out.println("End x: " + line1.getEndX());
        System.out.println("End y: " + line1.getEndY());
        System.out.println("End x/y: " + line1.getEndXY()[0] + ", " + line1.getEndXY()[1]);

        System.out.println("Gradient: " + line1.getGradient());
        System.out.println("Length: " + line1.getLength());
        System.out.println("End: " + line1.getEnd());
        System.out.println("Begin: " + line1.getBegin());

        System.out.println("\nLine 2 info:");
        System.out.println("End: " + line2.getEnd());
        System.out.println("Begin: " + line2.getBegin());

        line2.setBeginX(0);
        line2.setBeginY(8);
        line2.setBeginXY(8, 0);
        line2.setEndX(5);
        line2.setEndY(1);
        line2.setEndXY(1, 5);
        System.out.println(line2);

        line2.setBegin(point1);
        line2.setEnd(point2);
        System.out.println(line2);
    }

}
