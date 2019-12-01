
import java.util.Scanner;
public class Password
{
    public static void main (String [] args){
        Scanner x=new Scanner (System.in);
        int s;
        int clave=1602;
        System.out.println ("Ingrese la contraseña (4 digitos numericos)");
        for(int i=1; i<4;i++){
            
            s=x.nextInt();
            if (s!= clave){
                System.out.println ("La contraseña es incorrecta, le quedan " +(3-i)+" intentos");
                if (i==3){
                System.out.println ("Lo sentimos excedio los intentos permitidos"); break;}
            } else {
                System.out.println("La contraseña ingresada es la correcta, telefono desbloqueado");
                break;
            }
        }
        
    }
    
}
