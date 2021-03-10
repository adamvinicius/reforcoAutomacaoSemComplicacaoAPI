package register;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RegisterTest {

	@Test
	void testRegister() {
		Register register = new Register();
		
		register.setFirstName("Adam");
		register.setLastName("Luchini");
		register.setAddress("Rua mauro");
		register.setEmail("adamvinicius@gmail.com");
		register.setPhone("2124544251");
		register.setGender("masculino");
		
		List<String> hobbies = new ArrayList<>();
		hobbies.add("Cricket");
		hobbies.add("Movies");
		
		register.setHobbies(hobbies);
		
		Language ingles = new Language("English");
		Language japones = new Language("Japanese");
		List<Language> languages = new ArrayList<>();
				
		languages.add(ingles);
		languages.add(japones);
		register.setLanguages(languages);
		
		register.setSkill("APIs");
		register.setCountry("Brazil");
		register.setCountry2("Japan");
		
		DateOfBirth dateOfBirth = new DateOfBirth(1988, 10, 12);
		
		register.setDateOfBirth(dateOfBirth);
		
		register.setPassword("senha123");
		register.setConfirmPassword("senha123");
		register.setFile("base64");
		
		System.out.println(register.toString());
		
	}

	

}
