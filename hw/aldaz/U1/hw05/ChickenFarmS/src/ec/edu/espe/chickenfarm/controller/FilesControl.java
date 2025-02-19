/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.controller;

import ec.edu.espe.chickenfarm.model.*;
import java.io.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class FilesControl {
    
    public static void editFile(String fileName, Chicken chicken) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file,true));
            output.println(chicken.getId()+";"+ chicken.getName()+";"+chicken.getColor()+";"+chicken.getAge()+";"+chicken.isIsMolting());
            output.close();
            //System.out.println("\n\nFile has been written succesfully\n");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void readFile(String fileName){
        File file = new File(fileName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            System.out.println("\nid\t|name\t|color\t|age\t|molting\t|");
            while (line != null) {
                data = line.split(";");
                printLine(data);
                line = input.readLine();
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void searchChicken(String fileName,int id) {
        File file = new File(fileName);
        String[] data;
        String idToString=id+"";
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            System.out.println("\nid\t|name\t|color\t|age\t|molting\t|");
            while (line != null) {
                data = line.split(";");
                
                if (idToString.equals(data[0])) {
                    printLine(data);
                    System.out.println();
                }
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void printLine(String[] data) {        
        //for-each use
        for (String fact : data) {
            if ("true".equals(fact)) {
                fact="Y";
            }else if("false".equals(fact)){
                fact="N";
            }
            System.out.print(fact + "\t|");
        }
    }
    
    public static void loadFile(String fileToLoadName) {
        File fileToLoad = new File(fileToLoadName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(fileToLoad));
            var line = input.readLine();
            var fileName = "chickensInfo.csv";
            boolean molting=false;
            while (line != null) {
                Chicken chicken;
                
                data = line.split(";");
                /*data[0]=ID
                data[1]=NAME
                data[2]=COLOR
                data[3]=AGE
                data[4]=MOLTING*/
                if("true".equals(data[4])){
                    molting=true;
                }else if("false".equals(data[4])){
                    molting=false;
                }
                chicken = new Chicken(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), molting);
                editFile(fileName, chicken);
                line = input.readLine();
            }
            input.close();
            System.out.println("\n<THE INFO FROM FILE HAS BEEN ADDED WITH THE EXIT>\n");
        } catch (FileNotFoundException ex) {
            System.out.println("\n<THE FILE DOES NOT EXIST\n");
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            System.out.println("\nTHE FILE CAN´T BE READ D:\n");
            ex.printStackTrace(System.out);
        }
    }
}

