/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autorization.Note;

import SaveFile.PropApp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class PropUser {
    public File file;
    public Properties properties;
    public PropUser(String id) {
        properties = new Properties();
        file = new File(id + ".prop");
        if (!file.exists()) try {
            file.createNewFile();
            Note note = new Note();
        } catch (IOException ex) {
            Logger.getLogger(PropApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        else{
            Note note = new Note();
        }
    }
    
    public String getValue (String key){
        String value = "";
        try (FileReader filereader = new FileReader(file)){
            properties.load(filereader);
            value = properties.getProperty(key);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PropApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PropApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    public void setValue (String key, String vulue){
        properties.setProperty(key, vulue);
        try (FileWriter fileWriter = new FileWriter(file) ){
            properties.store(fileWriter, null);
        } catch (IOException ex) {
            Logger.getLogger(PropApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
