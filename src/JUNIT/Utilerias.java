/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUNIT;

import java.util.Scanner;

/**
 *
 * @author Edgar Moctezuma
 */
public class Utilerias {

    public Utilerias()
    {
    }
    
    public String ImporteConLetra(float importe)
    {
        float pesos = Math.round(importe);
        float centavos = (importe - pesos) * 100;
        
        String centavosSt = String.valueOf(centavos);
        if (centavos <= 9)
            centavosSt = "0" + centavosSt;
        
        String conLetra = centavosSt + "/100";
        String importeSt = String.valueOf(importe);
        importeSt = importeSt.substring(0, importeSt.indexOf("."));
        String miles = "";
        if (importeSt.length() == 1 && importeSt.compareTo("1") == 0)
            conLetra = "PESO " + conLetra;
        else
            conLetra = "PESOS " + conLetra;

        int posicion = importeSt.length();
        while(posicion > 0)
        {
            int indice = importeSt.length() - posicion;
            if (posicion == 9 || posicion == 6 || posicion == 3)
                miles = importeSt.substring(indice, indice - 2);
            else if (posicion == 8 || posicion == 5 || posicion == 2)
                miles = importeSt.substring(indice, indice - 1);
            else
                miles = importeSt.substring(indice);

            if(posicion >= 7 && posicion <= 9)
            {
                if (miles.compareTo("1") == 0)
                    conLetra += "MILLON";
                else
                    conLetra += "MILLONES";
            }
            else if (posicion >= 4 && posicion <= 6)
            {
                if (miles.compareTo("1") == 0)
                    conLetra += "MIL";
                else
                    conLetra += "MILES";
            }
            
            conLetra = ObtenerTextoMiles(String.valueOf(miles)) + conLetra;
            
            posicion -= miles.length();
        }
        
        return conLetra;
    }
    
    private String ObtenerTextoMiles(String miles)
    {
        
        String resultado = "";
        
        String misUnidades[] = 
        {"cero", "uno", "dos" ,"tres" ,"cuatro" ,"cinco" ,
            "seis" ,"siete" ,"ocho" ,"nueve","diez"};
        String numerosEspeciales[] = 
        {"once", "doce","trece","catorce", "quince", 
            "diezciseis", "diecisiete", "dieciocho", "diecinueve",
            "veinte","veintiuno", "veintidos", "veintitres",
             "veinticuatro", "veinticinco", "veintiseis", "veintisiete",
             "veintiocho", "veintinueve"};
        String misDecenas[] = 
        {"", "treinta","cuarenta","cincuenta", "sesenta",
            "setenta", "ochenta", "noventa"};
                             
        Scanner scanner = new Scanner(miles);
        int num = scanner.nextInt();
        
        if(num>=0 && num<11)
             resultado = misUnidades[num];         
        else if(num<30)
            resultado = numerosEspeciales[num-11];        
         else if(num<100){
            int unidad = num % 10;
            int decena = num/10;
            if(unidad == 0)
                resultado = misDecenas[decena-2];                
            else
                resultado = misDecenas[decena-2] + " y " + misUnidades[unidad];
        }
        return resultado;
    }
}
