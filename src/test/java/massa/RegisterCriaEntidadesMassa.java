package massa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import registerCriaEntidades.DateOfBirth;
import registerCriaEntidades.Languages;
import registerCriaEntidades.RegisterCriaEntidades;

public class RegisterCriaEntidadesMassa {

	DateOfBirth dateOfBirth = new DateOfBirth(1988, 10, 12);

	Languages langEnglish = new Languages("English");
	Languages langJapanese = new Languages("Japanese");		
	
	List<LinkedHashMap<String, Object>> listLanguages = new ArrayList<>();
	
	//listLanguages.add(languages.getLanguages())
	String hobbieCricket = "Cricket";
	String hobbieMovies = "Movies";
	List<String> hobbies = new ArrayList<>();
	

	RegisterCriaEntidades register = new RegisterCriaEntidades("Adam", "Luchini", "mauro", "adamvinicius@gmail.com", "121212121", "male", null, null, 
	                     "APIs", "Brazil", "Japan", dateOfBirth.getDateOfBirth(), "Senha123", "Senha123", "base64");
	
	public RegisterCriaEntidades getRegister(){
		hobbies.add(hobbieCricket);
		hobbies.add(hobbieMovies);
		register.setRegister("hobbies", hobbies);
		
		listLanguages.add(langEnglish.getLanguages());
		listLanguages.add(langJapanese.getLanguages());
		
		register.setRegister("languages", listLanguages);
		
		return register;
	}

}
