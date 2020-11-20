public class ArabSol {

        public static int ArabSol(int a, String operation, int b) {

            int result = 0;

            switch (operation) {

                case "+":
                    result = ArabSol.result1(a, b);
                    break;
                case "-":
                    result = ArabSol.result2(a, b);
                    break;
                case "*":
                    result = ArabSol.result3(a, b);
                    break;
                case "/":
                    result = ArabSol.result4(a, b);
                    break;
                default:
                    System.err.println("Неверная операция");
                    break;

            }

            return result;

        }

        private static int result1 (int a, int b) {

            return a + b;

        }

        private static int result2 (int a, int b) {

            return  a - b;

        }

        private static int result3 (int a, int b) {

            return a * b;

        }

        private static int result4 (int a, int b) {

            return a / b;

        }

}