package $4_LopVaDoiTuongTrongJava.BaiTap.XayDungLopStopWatch;

import java.util.Scanner;

public class runWatch {
    public static void main(String[] args) throws InterruptedException {
        StopWatch st = new StopWatch();

        st.start();
        System.out.println(st.getStartTime());
        Scanner sc = new Scanner(System.in);
        sc.next();
        st.end();
        System.out.println(st.getEndTime());
        System.out.println(st.getElapsedTime());
    }
}
