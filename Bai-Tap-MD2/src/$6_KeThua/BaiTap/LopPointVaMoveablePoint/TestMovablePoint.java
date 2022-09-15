package $6_KeThua.BaiTap.LopPointVaMoveablePoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovavlePoint movavlePoint= new MovavlePoint();
        System.out.println(movavlePoint);

        movavlePoint=new MovavlePoint(12.3f, 35.5f, 53.2f, 12.4f);
        System.out.println(movavlePoint);

        movavlePoint= new MovavlePoint(43.3f, 53.4f, 6.3f, 12.7f);
        System.out.println(movavlePoint);
    }
}
