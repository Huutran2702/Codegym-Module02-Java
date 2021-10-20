import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void classifyTest() {
        double triangleEdge1 = 2;
        double triangleEdge2 = 2;
        double triangleEdge3 = 2;
        int result = TriangleClassifier.classify(triangleEdge1,triangleEdge2,triangleEdge3);
        int expected = 3;
       assertEquals(expected,result);
    }
    @Test
    void classifyTest1() {
        double triangleEdge1 = 3;
        double triangleEdge2 = 3;
        double triangleEdge3 = 4;
        int result = TriangleClassifier.classify(triangleEdge1,triangleEdge2,triangleEdge3);
        int expected = 2;
        assertEquals(expected,result);
    }
    @Test
    void classifyTest2() {
        double triangleEdge1 = 3;
        double triangleEdge2 = 4;
        double triangleEdge3 = 6;
        int result = TriangleClassifier.classify(triangleEdge1,triangleEdge2,triangleEdge3);
        int expected = 1;
        assertEquals(expected,result);
    }
    @Test
    void classifyTest3() {
        double triangleEdge1 = 1;
        double triangleEdge2 = 1;
        double triangleEdge3 = 2;
        int result = TriangleClassifier.classify(triangleEdge1,triangleEdge2,triangleEdge3);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    void classifyTest4() {
        double triangleEdge1 = -1;
        double triangleEdge2 = 1;
        double triangleEdge3 = 2;
        int result = TriangleClassifier.classify(triangleEdge1,triangleEdge2,triangleEdge3);
        int expected = 0;
        assertEquals(expected,result);
    }
}