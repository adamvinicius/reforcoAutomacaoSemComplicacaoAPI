package entidades.plataformafilmes;

import java.util.LinkedHashMap;

public class Categorias{
    LinkedHashMap<String, Object> categorias = new LinkedHashMap<>();
    public Categorias(Object tipo){
        categorias.put("tipo",tipo);
    }

    public LinkedHashMap<String, Object> getCategorias() {
        return categorias;
    }
    public void setCategorias(String key, Object value){
        categorias.put(key, value);
    }
    public void remove(String key){
        categorias.remove(key);
    }
}
