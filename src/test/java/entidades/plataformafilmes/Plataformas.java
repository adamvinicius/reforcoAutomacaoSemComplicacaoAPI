package entidades.plataformafilmes;

import java.util.LinkedHashMap;

public class Plataformas{
    LinkedHashMap<String, Object> plataformas = new LinkedHashMap<>();
    public Plataformas(Object nome, Object url, Object descricao){
        plataformas.put("nome",nome);
        plataformas.put("url",url);
        plataformas.put("descricao",descricao);
    }
    
    public Plataformas(Object nome){
        plataformas.put("nome",nome);
    }

    public LinkedHashMap<String, Object> getPlataformas() {
        return plataformas;
    }
    
    public void setPlataformas(String key, Object value){
        plataformas.put(key, value);
    }
    public void remove(String key){
        plataformas.remove(key);
    }
}
