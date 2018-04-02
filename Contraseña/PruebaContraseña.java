import java.util.Scanner;
public class PruebaContraseña {
    
    public static void main (String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del array");
        
        Password listaContra[] = new Password[sc.nextInt()];
        
        Boolean listaFuerte[] = new Boolean[listaContra.length];
        
        for(int i=0; i<listaContra.length;i++){
            System.out.println("¿Que tipo de contraseña deseas?");
            System.out.println("1. Automatica");
            System.out.println("2. Manual");
            int opt = 0;
            do{
                opt = sc.nextInt(3);
            }while(opt >2 || opt < 1);
            
            switch(opt){
            case 1:
                System.out.println("Indica el tamaño de la contraseña");
                listaContra[i] = new Password(sc.nextInt());
                break;
            case 2:
                System.out.println("Indica la contraseña");
                listaContra[i] = new Password(sc.next());
                break;
            }
            listaFuerte[i] = listaContra[i].esFuerte();
        }
        
        System.out.println();
        System.out.println("-----------------");
        System.out.println("VALOR      FUERTE");
        System.out.println();
        
        for(int j=0; j<listaContra.length; j++){
            System.out.println( listaContra[j].getContraseña() + "      " +listaFuerte[j]);
        }
    }
}