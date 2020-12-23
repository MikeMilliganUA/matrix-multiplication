package bit.happens;

public class MatrixMathImpl implements MatrixMath {

    @Override
    public double[][] multiply(double[][] a, double[][] b) {

        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < c[0].length; i++)
            for (int j = 0; j < c.length; j++)
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
        return c;
    }

    @Override
    public void printResult(double[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(" " + c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
