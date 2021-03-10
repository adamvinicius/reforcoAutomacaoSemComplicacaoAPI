package registerMap;

import java.util.LinkedHashMap;

public class LanguagesMap {
	
	private LinkedHashMap<String, Object> languages = new LinkedHashMap<>();
	
	public LanguagesMap(Object name) {
		languages.put("name", name);
	}
	
	public void setLanguages(String key, Object value) {
		languages.put(key, value);
	}
	
	public LinkedHashMap<String, Object> getLanguages(){
		return languages;
	}
	
	public void removeKey(String key) {
		languages.remove(key);
	}
}
