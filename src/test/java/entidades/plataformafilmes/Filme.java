package entidades.plataformafilmes;

import java.util.LinkedHashMap;
import java.util.List;

public class Filme{
    LinkedHashMap<String, Object> filme = new LinkedHashMap<>();
    public Filme(Object nome, Object descricao, Object duracao, List<LinkedHashMap<String, Object>> listCategorias, 
                     List<LinkedHashMap<String, Object>> listPlataformas){
        filme.put("nome",nome);
        filme.put("descricao",descricao);
        filme.put("duracao",duracao);
        filme.put("categorias",listCategorias);
        filme.put("plataformas",listPlataformas);
    }

    public LinkedHashMap<String, Object> getFilme() {
        return filme;
    }
    public void setFilme(String key, Object value){
        filme.put(key, value);
    }
    public void remove(String key){
        filme.remove(key);
    }
}
