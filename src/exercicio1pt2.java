import java.util.*;
public class exercicio1pt2 {
          public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);
              System.out.println("insira um valor inteiro");
              int var = sc.nextInt();
              int var2=var+1;
              System.out.println("o valor seguinte ao inserido é "+var2);
              int quant = String.valueOf(var).length();
              System.out.println("o valor tem " +quant + " digitos");
              sc.close();
        }


}
