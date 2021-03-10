package massa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import registerMap.DateOfBirth;
import registerMap.LanguagesMap;
import registerMap.RegisterMap;

public class RegisterMassa {

	public static DateOfBirth dateOfBirth = new DateOfBirth(1988, 10, 12);
	
	public static LanguagesMap langEnglish = new LanguagesMap("English");
	public static LanguagesMap langJapanese = new LanguagesMap("Japanese");
	public static List<LinkedHashMap<String, Object>> languages = new ArrayList<>();
	
	public static String hobbieCricket = "Cricket";
	public static String hobbieMovies = "Movies";
	public static List<Object> hobbies = new ArrayList<>();
	
	public static RegisterMap registerMap = new RegisterMap("Adam", "Luchini", "mauro", "adamvinicius", 
			"121212121", "male", null, null, "APIs", "Brazil", "Japan", 
			dateOfBirth.getDateOfBirth(), "Senha123", "Senha123", "base64");
	
	public static RegisterMap getRegisterMap() {
		hobbies.add(hobbieCricket);
		hobbies.add(hobbieMovies);
		registerMap.setRegister("hobbies", hobbies);
		
		languages.add(langEnglish.getLanguages());
		languages.add(langJapanese.getLanguages());
		
		return registerMap;
		
	}
	
}
