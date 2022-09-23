package $11_DSA_Stack_Queue.Optional.BaiTap.ChuyenDoiTuHeThapPhanSangHeNhiPhan;


import java.util.Stack;

public class CovertDecimalToBinary {

    public String chuyenSangSoNhiPhan(double number) {
        StringBuilder binary = new StringBuilder();
        int phanNguyen = tachPhanNguyen(number);
        double phanLe = tachPhanLe(number);
        String phanNguyenNhiPhan = chuyenPhanNguyenSangBinary(phanNguyen);
        String phaLeNhiPhan = chuyenPhanThapPhanSangBinary(phanLe);

        binary.append(phanNguyenNhiPhan).append(".").append(phaLeNhiPhan);
        return binary.toString();
    }

    public String chuyenSangSoNhiPhan(int number) {
        String binary;
        binary = chuyenPhanNguyenSangBinary(number);
        return binary;
    }


    private int chiaLayPhanNguyen(int number) {
        return number / 2;
    }

    private String chuyenPhanNguyenSangBinary(int number) {
        StringBuilder binary = new StringBuilder();
        int phanNguyen = number;
        int soDu;
        int size = 0;

        Stack<Integer> stack = new Stack<>();
        do {
            soDu = phanNguyen % 2;
            stack.push(soDu);
            size++;
            if (phanNguyen > 0) {
                phanNguyen = chiaLayPhanNguyen(phanNguyen);
            }

        } while (phanNguyen != 0);

        for (int i = 0; i < size; i++) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    private String chuyenPhanThapPhanSangBinary(double number) {
        StringBuilder string = new StringBuilder();
        double phanLe;
        int bit;

        double result = number;
        do {
            result = result * 2;
            bit = tachPhanNguyen(result);
            phanLe = tachPhanLe(result);
            string.append(bit);
            result = phanLe;
        } while (phanLe != 0);

        return string.toString();
    }

    private double tachPhanLe(double number) {
        int phanNguyen = (int) number;
        return (number - phanNguyen);
    }

    private int tachPhanNguyen(double number) {
        return (int) number;
    }


}