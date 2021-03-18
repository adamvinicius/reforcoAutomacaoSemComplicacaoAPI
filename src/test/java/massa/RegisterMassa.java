package massa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import entidades.DateOfBirth;
import entidades.LanguagesMap;
import entidades.RegisterMap;

public class RegisterMassa {
	public static String url = "https://jsonplaceholder.typicode.com/";
	public static String endpoint = "posts";

	public static DateOfBirth dateOfBirth;

	public static LanguagesMap langEnglish;
	public static LanguagesMap langJapanese;
	public static List<LinkedHashMap<String, Object>> languages;

	public static String hobby1;
	public static String hobby2;
	public static List<Object> hobbies;

	public static RegisterMap registerMap;

	public static void inicializaListas() {
		hobbies.add(hobby1);
		hobbies.add(hobby2);
		registerMap.setRegister("hobbies", hobbies);

		languages.add(langEnglish.getLanguages());
		languages.add(langJapanese.getLanguages());
		registerMap.setRegister("languages", languages);
	}

	public static RegisterMap inicializaRegisterMassa() {
		dateOfBirth = new DateOfBirth(1988, 10, 12);
		langEnglish = new LanguagesMap("English");
		langJapanese = new LanguagesMap("Japanese");
		languages = new ArrayList<>();
		hobby1 = "Cricket";
		hobby2 = "Movies";
		hobbies = new ArrayList<>();
		registerMap = new RegisterMap("Adam", "Luchini", "mauro", "adamvinicius", "121212121", "male", null, null,
				"APIs", "Brazil", "Japan", dateOfBirth.getDateOfBirth(), "Senha123", "Senha123", "base64");

		inicializaListas();
		
		return registerMap;
	}

}
