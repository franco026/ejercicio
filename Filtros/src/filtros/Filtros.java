/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtros;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Franco
 */
public class Filtros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //filtrot("text.txt");
        sinfiltro("text.txt");
        
        
	}
    
    public static void filtrot(String a){
        File archivo;
        FileWriter archivot;
        try{
			
			archivo = new File(a);
			
			Scanner lecto = new Scanner (archivo);
                        
			archivot = new FileWriter("textfiltrot.txt");
			
			String cadena;
			while(lecto.hasNext()){
                            cadena = lecto.next();
				if(cadena.charAt(0)=='t'){
					System.out.print(cadena);
				}
			}
			
			
		lecto.close();
		archivot.close();
		
		}catch(IOException e){
			e.printStackTrace();
		}
    }
    
    public static void sinfiltro(String a){
        
        File archivo;
        FileWriter archivof,archivot,archivo5,archivoa;
		
		try{
			
			archivo = new File(a);
			
			Scanner lecto = new Scanner(archivo);
			
			archivof = new FileWriter("textsinfriltro.txt");
			archivot = new FileWriter("textfiltrot.txt");
			archivo5 = new FileWriter("textfiltro5.txt");
			archivoa = new FileWriter("textfiltroa.txt");
                        
                        String cadena;
			while(lecto.hasNext()){
                                cadena = lecto.next();
				archivof.write(cadena+"\r\n");
				
                                if(cadena.charAt(0)=='t'){
					archivot.write(cadena+"\r\n");
				}
                               
                                if(cadena.length()==5){
					archivo5.write(cadena+"\r\n");
				}
                                
				StringBuilder builder = new StringBuilder(cadena);
				if(cadena.equals(builder.reverse().toString())){
					archivoa.write(cadena+"\r\n");
				}
			}
			
		lecto.close();
		archivof.close();
		archivot.close();
		archivo5.close();
		archivoa.close();
		}catch(IOException e){
			e.printStackTrace();
		}
    }
}
