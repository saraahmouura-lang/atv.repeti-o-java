import java.util.Scanner;
public class seis {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num= scanner.nextInt();

        for( int i = num; i <= 100; i+=6 ){
            System.out.println("os numeros crescendo de 6 em 6 são: "+i);
        }

        scanner.close();
    }
    
}
