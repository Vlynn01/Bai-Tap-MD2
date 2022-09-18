package $9_Automated_Testing_TDD.BaiTap.ChuongTrinhTinhKetQuaFizzBuzz;

public class FizzBuzzTranslate {
    public static String fizzbuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz) {
            return "FizzBuzz";
        }
        if (isFizz) {
            return "Fizz";
        }
        if (isBuzz) {
            return "Buzz";
        }

        return number + "";
    }
}
