package steps;

import java.util.LinkedHashMap;
import java.util.List;

import entidades.DateOfBirth;
import entidades.LanguagesMap;
import entidades.RegisterMap;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import massa.RegisterMassa;
import utils.RestUtils;

public class RegisterSteps {

	String url = "";
	String endpoint = "";
	RegisterMap register;
	DateOfBirth dateOfBirth;
	List<Object> hobbies;
	List<LinkedHashMap<String, Object>> languages;
		
	@Dado("que sejam preenchidos os valores do Register")
	public void queSejamPreenchidosOsValoresDoRegister() {
	    url = RegisterMassa.url;
	    endpoint = RegisterMassa.endpoint;
	    register = RegisterMassa.inicializaRegisterMassa();
	    hobbies = RegisterMassa.hobbies;
	    languages = RegisterMassa.languages;
	    dateOfBirth = RegisterMassa.dateOfBirth;
	    
	    RestUtils.setBaseUri(url);
	    
	}
	@Quando("que seja realizado o POST do Register")
	public void queSejaRealizadoOPOSTDoRegister() {
	    RestUtils.postRequest(endpoint, register.getRegister());
	    System.out.println(RestUtils.getBody());
	}
	
	@Quando("o campo {string} seja alterado para {string} do Register")
	public void oCampoSejaAlteradoParaDoRegister(String key, String value) {
	    register.setRegister(key, value);
	}
	
	@Quando("o campo {string} seja alterado para {int} do date_of_birth de Register")
	public void oCampoSejaAlteradoParaDoDateOfBirthDeRegister(String key, Integer value) {
	    dateOfBirth.setDateOfBirth(key, value);    
	}
	
	@Quando("o indice {int} seja alterado para {string} do hobbies de Register")
	public void oIndiceSejaAlteradoParaDoHobbiesDeRegister(Integer indice, String value) {
	    hobbies.set(indice, value);
	}

	
	@Quando("o indice {int} onde o campo {string} seja alterado para {string} do languages de Register")
	public void oIndiceOndeOCampoSejaAlteradoParaDoLanguagesDeRegister(Integer indice, String key, String value) {
	    LanguagesMap language = new LanguagesMap(value);
	    
		languages.set(indice, language.getLanguages());
	}














}
