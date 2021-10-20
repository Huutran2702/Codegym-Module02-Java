public class TriangleClassifier {
    public static int classify(double triangleEdge1, double triangleEdge2, double triangleEdge3) {
        if (isTriangle(triangleEdge1, triangleEdge2, triangleEdge3)) {
            if (triangleEdge1 == triangleEdge2 && triangleEdge2 == triangleEdge3) {
                return 3;
            } else if (triangleEdge1 == triangleEdge2 || triangleEdge2 == triangleEdge3 || triangleEdge1 == triangleEdge3) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static boolean isTriangle(double triangleEdge1, double triangleEdge2, double triangleEdge3) {
        if (triangleEdge1 + triangleEdge2 > triangleEdge3
                && triangleEdge2 + triangleEdge3 > triangleEdge1
                && triangleEdge1 + triangleEdge3 > triangleEdge2) {
            return true;
        } else {
            return false;
        }
    }
}
