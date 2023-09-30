import java.util.Scanner;
public class Main {
    private int number;
    public Main () {
        this.number = number;
    }
    public boolean isPalindrome() {
        int rev_number = 0;
        int copy_number = number;
        while (number != 0) {
            int last_char = number % 10;
            rev_number = rev_number * 10 + last_char;
            number /= 10;
        }

        if (copy_number == rev_number) {
            return true;
        }

        else {
            return false;
        }
    }

    public int sumOfNumbers(int number) {
        number = number + number;
        return number;
    }

    public int getter(){
        System.out.println("Введите целое число:");
        number = new Scanner(System.in).nextInt();
        return number;
    }

    public int array_sizing () {
        System.out.println("Введите кол-во складываемых чисел:");
        int size = new Scanner(System.in).nextInt();
        return size;
    }
}
