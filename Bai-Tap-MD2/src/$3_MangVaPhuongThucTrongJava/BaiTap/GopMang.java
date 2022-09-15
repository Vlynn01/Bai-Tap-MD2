package $3_MangVaPhuongThucTrongJava.BaiTap;

class GopMang {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        Integer[] b = {5, 6, 7, 0};
        Integer[] both = concat(a, b);

        System.out.print("\nFirst  Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        System.out.print("\nSecond Array : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "\t");
        }

        System.out.print("\nMerged Array : ");
        for (int i = 0; i < both.length; i++) {
            System.out.print(both[i] + "\t");
        }
    }

    public static Integer[] concat(Integer[] a, Integer[] b) {
        int aLen = a.length;
        int bLen = b.length;
        Integer[] c = new Integer[aLen + bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
}