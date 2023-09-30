public class Check {
    public static void main(String[] args) {
        Main Main = new Main();
        Main.getter();


        boolean Palindrom = Main.isPalindrome();
        if (Palindrom == true) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }

        int size = Main.array_sizing();

        int sum = 0;

        for (int i = 0; size > i; i++) {

            int number = Main.getter();
            sum = Main.sumOfNumbers(number);
        }

        System.out.println("Сумма введеных чисел = " + sum);

    }
}
