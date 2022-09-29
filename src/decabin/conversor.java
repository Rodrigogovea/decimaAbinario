package decabin;
public class conversor 
{
    private int cosciente, residuo;
    private final pila energizer;
    private String datoBin;
    private int temp;
    conversor()
    {
        energizer = new pila();
        datoBin = "";
    }
    public String convertir10a2(int dato)
    {
        if(dato!= 0)
        {
            cosciente = dato/2;
            residuo = dato % 2;
            energizer.push(residuo);
            convertir10a2(cosciente);
        }
        else
        {
            while(!energizer.verificarVacia())
            {
                temp = energizer.pop();
                if(temp != -1)
                    datoBin+=temp;
            }
        }
        return datoBin;
    }
}
