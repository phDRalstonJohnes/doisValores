import java.util.Scanner;
public class doisValores{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int valor1;
        int valor2;
        int resultado;
        
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();
        
        System.out.print(resultado = valor1 * valor2);
        
    }
}