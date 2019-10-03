package pooEjercicio;


public class Libro 
{
private double hojas;
private boolean pasta_dura;
private String editorial;
private boolean libro_nuevo;
private  double peso;
private double peso_total;
private double peso_hojas;

//se meodifica
public Libro()
{
    peso = 0;
}
///////////////////////////////////////////////////////////////////
//Setter

public void dime_hojas(int numero_hojas)
{
    hojas = numero_hojas;
}

//getter

public String total_hojas ()
{
    return "El libro contendra " + hojas + "hojas";
}
/////////////////////////////////////////////////////////////////////////////////////
public void dime_pasta(String pasta_dura)
{
        
        if(pasta_dura.equalsIgnoreCase("si"))
        {
            this.pasta_dura=true;
            
        }
        else
        {
            this.pasta_dura=false;
        }
    
}

public String pasta()
{
    if(pasta_dura==true)
    {
        return "El libro tendra pasta dura ";
    }
    else
    {
        return"El libro no tendra pasta dura";
    }
}
/////////////////////////////////////////////////////////////////////////////////
public void establece_editorial(String editorial_libro)
{
    editorial = editorial_libro;    
}

public String dime_editorial()
{
    return "El libro tiene la editorial: " + editorial;
}

public void establece_nuevo(String libro_nuevo)
{
    if(libro_nuevo.equalsIgnoreCase("si"))
    {
        this.libro_nuevo = true;
    }
    else
    {
        this.libro_nuevo = false;
    }
}

public String dime_nuevo()
        {
            if(libro_nuevo=true)
            {
                return "El libro es nuevo";
            }
            else
            {
                return "El libro no es nuevo";
            }
        }
public void establece_peso_hojas(double hojas_libro)
{
    hojas = hojas_libro;
    peso_hojas = hojas_libro * 0.01;
}

public String establece_peso()
{
    
    peso_total = peso + peso_hojas;
    
    if(pasta_dura= true)
    {
        peso_total = peso_total + 5;
        
    }
    
    return "El peso total del libro es:  " + peso_total + "con un total de páginas de" + hojas ;
}

public int dime_precio()
{
    int precio_final = 0;
    
    if(pasta_dura=true)
    {
        precio_final += 300;
    }
    if (libro_nuevo=true)
    {
        precio_final+=100;
    }
    if(hojas>=200)
    {
        precio_final+=200;
    }
    if(hojas>=600)
    {
        precio_final+=400;
    }
    
    return precio_final;
    
}

}