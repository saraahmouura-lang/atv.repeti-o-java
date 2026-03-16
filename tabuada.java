import java.util.Scanner;
public class tabuada {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num= scanner.nextInt();

        System.out.println("TABUADAS");

        System.out.println();
        System.out.println("adição: ");
        System.out.println();
        for(int i = 1;i <= 10; i++){
            System.out.println(num+"+"+i+"="+(num+i));
        }
        System.out.println();
        System.out.println("subtração: ");
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.println(num+"-"+i+"="+(num-i));
        }
        System.out.println();
        System.out.println("multiplicação: ");
        System.out.println();
        for(int i = 1; i <= 10; i++ ){
            System.out.println(num+"x" +i+ "="+(num*i));
        }
        System.out.println();
        System.out.println("divisão: ");
        System.out.println();
        for(int i = 1;i <= 10; i++ ){
            System.out.println(num+ "/"+i+"="+(num/i));
        }

    scanner.close();  
    }
}
