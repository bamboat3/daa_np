import java.util.Stack;

public class MaximaPlaneSwap {

    public static void main(String[] args) {

        Point[] P = new Point[11];
        P[0] = new Point(2, 5);
        P[1] = new Point(3, 13);
        P[2] = new Point(4, 11);
        P[3] = new Point(5, 1);
        P[4] = new Point(7, 7);
        P[5] = new Point(9, 10);
        P[6] = new Point(10, 5);
        P[7] = new Point(12, 12);
        P[8] = new Point(13, 3);
        P[9] = new Point(14, 10);
        P[10] = new Point(15, 7);

        MaximaPlaneSwap m = new MaximaPlaneSwap();
        m.PLANE_SWEEP_MAXIMA(11, P);
    }

    public void PLANE_SWEEP_MAXIMA(int n, Point[] P) {

        Stack<Point> s = new Stack<Point>();

        for (int i = 0; i < n; i++) {
            while ((!s.empty()) && (s.peek().y <= P[i].y)) {
                s.pop();

            } // end while
            s.push(P[i]);

        } // end outer for loop

        // output the contents of stack s;
        Object[] p = s.toArray();
        for (Object point : p) {
            System.out.println("(" + ((Point) point).x + "," + ((Point) point).y + ")");
        }
    }// end MAXIMA
}// end class

class Point {
    int x;
    int y;

    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }

}
