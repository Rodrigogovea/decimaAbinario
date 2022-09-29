package decabin;
import java.util.Scanner;
public class Decabin 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int dato;
        String valorBin;
        
        Scanner lector = new Scanner(System.in);
        conversor dectobin = new conversor();
        
        System.out.println("Convertir de Dec(10) --> Bin(2)");
        System.out.print("Teclea el valor en Decimal: ");
        dato = lector.nextInt();
        if(dato < 256)
        {
            valorBin = dectobin.convertir10a2(dato);
            System.out.println("El número: " + dato + "(10) --> " + valorBin + "(2)");
        }
        else
            System.out.println("No puedo convertir ese número!!!");
        
        //energizer.push(dato);
        //System.out.println(aux);
        lector.close();
    }
}
