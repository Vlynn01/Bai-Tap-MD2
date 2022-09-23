package $11_DSA_Stack_Queue.Optional.BaiTap.KiemTraDauNgoacTrongBieuThucSuDungStack;

import java.util.Stack;

public class CheckBracket {
    private final String  string;
    private String[] stringArrays;

    public CheckBracket(String string) {
        this.string = string;
        stringToArray();
    }

    private void stringToArray() {
        this.stringArrays = this.string.split("");
    }

    public boolean isOK() {
        String[] strings = this.stringArrays;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for (String element : strings) {
            if (element.equals("(")) {
                stack.push(element);
                left.append(element);
            } else if (element.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    right.append(element);
                }
            }
        }
        return (left.length()) == (right.length());

    }


}