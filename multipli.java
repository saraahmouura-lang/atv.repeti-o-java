import java.util.Scanner;

public class multiplo {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1= scanner.nextInt();

        System.out.println("digite outro numero: ");
        int num2= scanner.nextInt();

        System.out.println("os multiplos de 3 entre "+num1+" e "+num2+ " são: ");

        for(int i = num1; i <=num2;i++){
            if(i % 3==0){
            System.out.println(i);
            }
    }
    }
}
