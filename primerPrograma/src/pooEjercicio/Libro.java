
package pooEjercicio;


public class Libro 
{
int hojas;
boolean pasta_dura;
String editorial;
int tomo;
boolean libro_nuevo;
int peso;

    


public Libro()
{
    peso = 500;
    editorial = "patito";
}

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

public void dime_pasta(String pasta_dura)
{
        
        if(pasta_dura=="si")
        {
            this.pasta_dura=true;
            
        }
        else
        {
            this.pasta_dura=false;
        }
}



}