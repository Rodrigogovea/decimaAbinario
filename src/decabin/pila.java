package decabin;
public class pila 
{
    int[] stack = new int[8];
    int posicion = 0;
    int max = 8;
    boolean vacia = true;
    int aux;
    public void push(int dato)
    {
        if(posicion > max)
            System.out.println("La pila ya está llena!!!");
        else if(posicion == -1)
            System.out.println("Pila vaciá!");
        else
        {
            
            stack[posicion] = dato;
            posicion++;
            vacia=false;
        }
    }
    public int pop()
    {
        if(posicion == 0)
            vacia = true;
        else
        {
            posicion--;
            aux = stack[posicion];
            stack[posicion] = 0; 
            return aux;
        }
        return -1;
    }
    public void mostrarElementos()
    {
        if(verificarVacia())
            System.out.println("La pila está vaciá!");
        else
        {
            for(int i=(posicion-1); i>=0; i--)
            {
                System.out.println("|" + stack[i] +"|");
                System.out.println("----");
            }
        }
    }
    public boolean verificarVacia()
    {
        return this.vacia;
    }
}
