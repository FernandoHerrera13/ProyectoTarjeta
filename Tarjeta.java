public class Tarjeta
{
    private float saldo;
    
    public Tarjeta()
    {
        saldo=0;
    }
    
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
