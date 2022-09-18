package $9_Automated_Testing_TDD.BaiTap.PhanLoaiTamGiac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {
    @Test
    @DisplayName("TestCase")
    void tesCase() {
        double canhA = 2;
        double canhB = 2;
        double canhC = 2;

        String expect = "Tam giác đều";
        assertEquals(expect, TriangleClassifier.edge(canhA,canhB,canhC));
    }@Test
    @DisplayName("TestCase1")
    void tesCase1() {
        double canhA = 2;
        double canhB = 2;
        double canhC = 3;

        String expect = "Tam giác cân";
        assertEquals(expect, TriangleClassifier.edge(canhA,canhB,canhC));
    }
    @Test
    @DisplayName("TestCase2")
    void tesCase2() {
        double canhA = 3;
        double canhB = 4;
        double canhC = 5;

        String expect = "Tam giác thường";
        assertEquals(expect, TriangleClassifier.edge(canhA,canhB,canhC));
    }
    @Test
    @DisplayName("TestCase3")
    void tesCase3() {
        double canhA = 3;
        double canhB = 4;
        double canhC = 5;

        String expect = "Tam giác thường";
        assertEquals(expect, TriangleClassifier.edge(canhA,canhB,canhC));
    }
    @Test
    @DisplayName("TestCase4")
    void tesCase4() {
        double canhA = 8;
        double canhB = 2;
        double canhC = 3;

        String expect = "Không phải tam giác";
        assertEquals(expect, TriangleClassifier.edge(canhA,canhB,canhC));
    }
    @Test
    @DisplayName("TestCase5")
    void tesCase5() {
        double canhA = -1;
        double canhB = 2;
        double canhC = 1;

        String expect = "Không phải tam giác";
        assertEquals(expect, TriangleClassifier.edge(canhA,canhB,canhC));
    }




}