package registerCriaEntidades;

import java.util.LinkedHashMap;
import java.util.List;

public class RegisterCriaEntidades{
    LinkedHashMap<String, Object> register = new LinkedHashMap<>();
    public RegisterCriaEntidades(Object firstName, Object lastName, Object address, Object email, 
                     Object phone, Object gender, List<Object> listHobbies, List<LinkedHashMap<String, Object>> listLanguages, 
                     Object skill, Object country, Object country2, LinkedHashMap<String, Object> dateOfBirth, 
                     Object password, Object confirmPassword, Object file){
        register.put("first_name",firstName);
        register.put("last_name",lastName);
        register.put("address",address);
        register.put("email",email);
        register.put("phone",phone);
        register.put("gender",gender);
        register.put("hobbies",listHobbies);
        register.put("languages",listLanguages);
        register.put("skill",skill);
        register.put("country",country);
        register.put("country2",country2);
        register.put("date_of_birth",dateOfBirth);
        register.put("password",password);
        register.put("confirm_password",confirmPassword);
        register.put("file",file);
    }

    public LinkedHashMap<String, Object> getRegister() {
        return register;
    }
    
    public void setRegister(String key, Object value) {
    	register.put(key, value);
    }
    
    public void removeKey(String key) {
    	register.remove(key);
    }
}
