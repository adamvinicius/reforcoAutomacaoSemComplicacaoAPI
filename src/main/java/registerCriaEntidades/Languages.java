package registerCriaEntidades;

import java.util.LinkedHashMap;

public class Languages{
    LinkedHashMap<String, Object> languages = new LinkedHashMap<>();
    public Languages(Object name){
        languages.put("name",name);
    }

    public LinkedHashMap<String, Object> getLanguages() {
        return languages;
    }
    
    public void setLanguages(String key, Object value) {
    	languages.put(key, value);
    }
    
    public void removeKey(String key) {
    	languages.remove(key);
    }
}