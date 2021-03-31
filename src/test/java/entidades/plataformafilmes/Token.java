package entidades.plataformafilmes;

import java.util.LinkedHashMap;

public class Token{
    LinkedHashMap<String, Object> token = new LinkedHashMap<>();
    public Token(Object email, Object senha){
        token.put("email",email);
        token.put("senha",senha);
    }

    public LinkedHashMap<String, Object> getToken() {
        return token;
    }
    
    public void setToken(String key, Object value) {
    	token.put(key, value);
    }
}
