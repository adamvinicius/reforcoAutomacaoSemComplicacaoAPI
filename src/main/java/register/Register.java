package register;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Register {

	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	private String address;
	private String email;
	private String phone;
	private String gender;
	private List<String> hobbies;
	private List<Language> languages;
	private String skill;
	private String country;
	private String country2;
	@JsonProperty("date_of_birth")
	private DateOfBirth dateOfBirth;
	private String password;
	@JsonProperty("confirm_password")
	private String confirmPassword;
	private String file;
	
	
	
	@Override
	public String toString() {
		String valores = "Register [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAddress()="
				+ getAddress() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone() + ", getGender()="
				+ getGender() + ", getHobbies()=" + getHobbies() + ", getLanguages()=";
		for (Language language : getLanguages()) {
			valores += language.toString();
		}
		
		valores += ", getSkill()=" + getSkill() + ", getCountry()=" + getCountry() + ", getCountry2()=" + getCountry2()
				+ ", getDateOfBirth()=" + getDateOfBirth().toString() + ", getPassword()=" + getPassword()
				+ ", getConfirmPassword()=" + getConfirmPassword() + ", getFile()=" + getFile() + "]";
		return valores;
	}

	public Register() {
		
	}
		
	public Register(String firstName, String lastName, String address, String email, String phone, String gender,
			List<String> hobbies, List<Language> languages, String skill, String country, String country2,
			DateOfBirth dateOfBirth, String password, String confirmPassword, String file) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.hobbies = hobbies;
		this.languages = languages;
		this.skill = skill;
		this.country = country;
		this.country2 = country2;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.file = file;
	}
	
	public Register(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}




	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry2() {
		return country2;
	}
	public void setCountry2(String country2) {
		this.country2 = country2;
	}
	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	
	
	
	
	
	
}
