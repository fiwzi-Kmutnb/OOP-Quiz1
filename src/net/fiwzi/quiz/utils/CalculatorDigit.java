package net.fiwzi.quiz.utils;

public class CalculatorDigit {
    public int exec(String str) {
        int sum = -1;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                if(sum == -1)
                    sum = 0;
                sum += ch - '0';
            }
        }
        if(sum == - 1)
            return -1;
        if (sum == 0) return 0;
        return (sum % 9 == 0) ? 9 : (sum % 9);
    }
    public String address(String str) {
        return str.replaceAll("[^0-9]", "");
    }
}
