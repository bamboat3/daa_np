public class Maxima {

    public static void main(String[] args) {

        Point[] P = new Point[12];
        P[0] = new Point(2, 5);
        P[1] = new Point(4, 4);
        P[2] = new Point(4, 11);
        P[3] = new Point(5, 1);
        P[4] = new Point(7, 7);
        P[5] = new Point(7, 13);
        P[6] = new Point(9, 10);
        P[7] = new Point(11, 5);
        P[8] = new Point(12, 12);
        P[9] = new Point(13, 3);
        P[10] = new Point(14, 10);
        P[11] = new Point(15, 7);

        Maxima m = new Maxima();
        m.MAXIMA(12, P);
    }

    public void MAXIMA(int n, Point[] P) {
        for (int i = 0; i < n; i++) {
            boolean maximal = true;
            for (int j = 0; j < n; j++) {
                if ((i != j) && (P[i].x <= P[j].x) && (P[i].y <= P[j].y)) {
                    maximal = false;
                    break;
                }
            } // end inner for loop

            if (maximal) {
                System.out.println(P[i].x + "," + P[i].y);
            }
        } // end outer for loop

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