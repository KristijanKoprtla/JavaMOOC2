
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations(){
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.translations.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> translations = this.translations.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        return translations.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.translations.remove(word);
    }
    
}
