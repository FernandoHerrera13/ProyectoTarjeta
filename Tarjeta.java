/**La clase Tarjeta nos permite crear un objeto Tarjeta y realizar con ella diversas operaciones
tales como depositar y retirar saldo*/

public class Tarjeta
{
    private float saldo;
    
    public Tarjeta()
    {
        saldo=0;
    }
    
    /**El metodo depositar permite por medio de ciertos chequeos, insertar a la tarjeta cierta cantidad de dinero
     * @param dinero
     */
    public void depositar(float dinero)
    {
        if(saldo>=0)
        {
            saldo=saldo+dinero;
            System.out.println("Tu saldo es de: "+saldo);
        }
        else
        if(dinero<0)
        {
           System.out.println("NO SE PUEDEN HACER DEPOSITOS NEGATIVOS");
        }
    }
    /**Permite sustraer cierta cantidad de dinero siempre y cuando tu saldo sea suficiente
     * @param dinero
     * @return devuelve un entero que representa la cantidad de dinero que acabas de retirar
     */
    
    public float retirar(float dinero)
    {
        if(saldo>=dinero)
        {
            saldo=saldo-dinero;
            System.out.println("Tu retiro es de: "+dinero);
            System.out.println("Tu nuevo saldo es de: "+saldo);
            return 0;
        }
        else
        {
            return 0;
        }
    }
}
