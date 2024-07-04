import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       
    /* O programa irá calcular 12 múltiplos de
        um número digitado pelo usuário;
        */
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Digite um número: "); //O usuário digita um número
        int entry = keyboard.nextInt();

        for(int i = 1; i <= 12; i++){
            System.out.println(entry + "x" + i + " = " + entry*i);          
            
        }
       
    }

}

