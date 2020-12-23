package bit.happens;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixMathTest {

    private MatrixMath mm;

    @Before
    public void setUp() {
        mm = new MatrixMathImpl();
    }

    @Test
    public void testMultiply() {
        double[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] matrixB = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        double[][] expectedResult = {
                {4, 2, 4},
                {10, 5, 10},
                {16, 8, 16}
        };

        assertThat(mm.multiply(matrixA, matrixB)).isEqualTo(expectedResult);

        double[][] expectedResultNow = mm.multiply(matrixA, matrixB);
        mm.printResult(expectedResultNow);
    }
}
