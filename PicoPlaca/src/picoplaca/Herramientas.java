/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ALIEN
 */
public class Herramientas {
    
    public void validarPlaca( ){
      Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{3,4}");
        Matcher matcher;
        String cadena = "";
        Boolean bol = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese una cadena");
            cadena = sc.nextLine();
            matcher = pattern.matcher(cadena);
            if (matcher.matches()) {
            bol = true;
            } else
                bol = false;
        }while(bol==false); 
        verificarPicoYPlaca(cadena);
    }
    public void verificarPicoYPlaca( String placa){
        int n=placa.length(); 
        char dig =placa.charAt(n-1);
        System.out.println("el utimo digito de su placa es :"+dig);
        switch (dig) {
            case '1': case '2':
            System.out.println ("LUNES");
            break;
            case '3': case '4':
            System.out.println ("MARTES");
            break;
            case '5': case '6':
            System.out.println ("MIERCOLES");
            case '7': case '8':
            System.out.println ("JUEVES");
            break;
            default: System.out.println ("VIERNES"); break;
        }
    }
}
