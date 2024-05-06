/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ficheros.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
/**
 *
 * @author SCIS2-26
 */
public class Archivos {

    public static void main(String[] args) throws IOException  {
     
        File file = new File("./archivo.txt"); 
        
           if (!file.exists()){
               try{
                   file.createNewFile();
                   System.out.println("Archivo creado");
               }catch(IOException e) {
                   System.out.println("No se pudo crear el archivo");
               }
               
           }else {
               System.out.println("El archivo ya existe");
           }
           
           FileReader reader = new FileReader(file, Charset.forName("UTF8"));
           System.out.println(reader.getEncoding());
           
           //Acceder caracter a caracter 
           char [] data = new char [50];
           reader.read(data);
           
           System.out.println(data[3]);
           
           //reader.close();
           
           //Acceder linea a linea 
           BufferedReader buffer = new BufferedReader(reader);
           
           String line;
           while((line=buffer.readLine()) !=null){
               System.out.println("Line: " + line);
           
           }
          
    }
}
