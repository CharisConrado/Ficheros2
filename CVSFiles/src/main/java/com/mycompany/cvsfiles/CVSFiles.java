/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cvsfiles;

import com.mycompany.cvsfiles.manageFiles.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author SCIS2-16
 */
public class CVSFiles {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./data.csv");
        
        ReadFile readFile = new ReadFile(file);
        
        List<String> data = readFile.loadData();
        
        for(String line: data){
            // System.out.println(line);
            String[] splited = new String [3];
            splited = line.split(";");
            System.out.println("Hola " + splited[1] + " " + splited[2] + " " + " Tu codigo es "+ splited[0]);
        }
    }
}
