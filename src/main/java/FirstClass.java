public class FirstClass {
        public static void main(String[] args) {
            printThreeWords();
        }
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        {

            CheckSumSign();
        }
        public static void CheckSumSign() {
            int a = 5;
            int b = 6;
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

    }
