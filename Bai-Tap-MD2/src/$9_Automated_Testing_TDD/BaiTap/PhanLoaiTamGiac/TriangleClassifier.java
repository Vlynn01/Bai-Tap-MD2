package $9_Automated_Testing_TDD.BaiTap.PhanLoaiTamGiac;

public class TriangleClassifier {
    public static String edge(double canhA, double canhB, double canhC) {
        if (canhA == canhB && canhA == canhC) {
            return "Tam giác đều";
        }
        else if ((canhA == canhB) || (canhA == canhC) || (canhB == canhC)){
            return "Tam giác cân";
        }else if((canhA + canhB) > canhC || (canhB + canhC) > canhA) {
            return "Tam giác thường";
        }else {
            return "Không phải tam giác";
        }
    }
}