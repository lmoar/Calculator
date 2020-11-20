import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        System.out.println("Введите выражение через пробел: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String operation = sc.next();
        String y = sc.next();


        if (Roman.check(x) && Roman.check(y)) {

                a = Roman.getNum(x);
                b = Roman.getNum(y);

                if (a>10 || b>10) {

                    System.err.println("Превышено значение переменной!");

                }

                else {

                    int result = ArabSol.ArabSol(a, operation, b);

                    if (result > 10) {

                        int i = result / 10 * 10;
                        int j = result % 10;

                        Roman st1 = Roman.checkRom(i);
                        Roman st2 = Roman.checkRom(j);

                        if (j == 0) {

                            String st3 = st1.toString();
                            System.out.println(st3);

                        }

                        else {

                            try {
                                String st3 = st1.toString();
                                String st4 = st2.toString();
                                System.out.println(st3 + st4);
                            } catch (NullPointerException e) {

                                System.err.println("Превышено значение переменной!");

                            }

                        }

                    }

                    else {

                        Roman st1 = Roman.checkRom(result);
                        String st3 = st1.toString();
                        System.out.println(st3);

                    }

                }

            }

        else if (!Roman.check(x) && !Roman.check(y)) {

            try {

                a = Integer.parseInt(x);
                b = Integer.parseInt(y);

                if (a > 10 || b > 10) {

                    System.err.println("Превышено значение переменной!");

                }

                else {

                    System.out.println(ArabSol.ArabSol(a, operation, b));

                }

            } catch (NumberFormatException e) {

                System.err.println("Неверный формат строки!");

            }

        }

        else {

            System.err.println("Неверный формат строки!");

        }

    }

}
