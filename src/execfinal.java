    import java.time.LocalDateTime;
    import java.util.Date;
    import java.util.Scanner;
    import java.text.DecimalFormat;
    import java.time.format.DateTimeFormatter;

public class execfinal {

    public static void exec1part1() {
        double valori = 10;
        System.out.println("valor inicial" + valori);
        int valorm = (int) valori;
        System.out.println("valor apos conversao" + valorm);
        double valorf = (double) valorm;
        System.out.println("valor final" + valorf);
    }

    public static void exec1part2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um valor inteiro");
        int var = sc.nextInt();
        int var2 = var + 1;
        System.out.println("o valor seguinte ao inserido é " + var2);
        int quant = String.valueOf(var).length();
        System.out.println("o valor tem " + quant + " digitos");
        sc.close();
    }

    public static void exec1part3() {
        DecimalFormat f = new DecimalFormat("##.00");
        double val1 = 4.78905;
        double val2 = 4.7;
        double val3 = 5.89454;
        double val4 = 5;
        System.out.println(f.format(val1));
        System.out.println(f.format(val2));
        System.out.println(f.format(val3));
        System.out.println(f.format(val4));
    }

    public static void exec1part4() {
        DecimalFormat f = new DecimalFormat("##.000");
        DecimalFormat g = new DecimalFormat("##.00");
        DecimalFormat h = new DecimalFormat("##.0");
        double val = 0.456789 * 100;
        System.out.println("1 casa decimal " + h.format(val) + "%");
        System.out.println("2 casa decimal " + g.format(val) + "%");
        System.out.println("3 casa decimal " + f.format(val) + "%");

    }

    public static void exec1part5() {

        DateTimeFormatter atf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter atf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter atf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter atf4 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        System.out.println(atf1.format(LocalDateTime.now()));
        System.out.println(atf2.format(LocalDateTime.now()));
        System.out.println(atf3.format(LocalDateTime.now()));
        System.out.println(atf4.format(LocalDateTime.now()));


    }

    public static void exec2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um valor monetario em dolars");
        double ler = sc.nextDouble();
        System.out.println(ler * 1.02);
    }

    public static void exec3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor da temperatura");
        double temp = sc.nextDouble();
        System.out.println("1. celsius para kelvin \n 2. kelvin para celsius \n 3.fahrenheit para kelvin \n 4.kelvin para fahrenheit \n 5.celsius para fahrenheit \n 6.fahrenheit para celsius");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println(temp + 273.15);
                break;
            case 2:
                System.out.println(temp - 273.15);
                break;
            case 3:
                System.out.println((temp + 459.67) * (5 / 9));
                break;
            case 4:
                System.out.println((temp * (9 / 5) - 459.67));
                break;
            case 5:
                System.out.println(temp * (9 / 5) + 32);
                break;
            case 6:
                System.out.println((temp - 32) * 5 / 9);
                break;
        }
    }

    public static void exec4() {


    }

    public static void exec5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o numero 1");
        int n1 = sc.nextInt();
        System.out.println("insira o numero 2");
        int n2 = sc.nextInt();
        System.out.println("insira o numero 3");
        int n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.println(n1 +"-" +n2 +"-"+  n3);
                }
                else{
                    System.out.println(n1 +"-" +n3 +"-"+  n2);
                }

            }
            //n3 maior que n1 e n1 maior que n2
            else {

                    System.out.println(n3 +"-" +n1 +"-"+  n2);

            }

        }//n2>n1
        else {
            if (n3 > n1) {
                if (n2 > n3) {
                    System.out.println(n2 + "-" + n3 + "-" + n1);
                } else {
                    System.out.println(n3 + "-" + n2 + "-" + n1);
                }
            }
        }
    }

    public static void main(String[] args) {
        //exec1part1();
        //exec1part2();
        //exec1part3();
        //exec1part4();
        //exec1part5();
        //exec2();
        //exec3();
        //exec4();
        exec5();
    }
}

