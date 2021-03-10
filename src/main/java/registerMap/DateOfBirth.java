package registerMap;

import java.util.LinkedHashMap;

public class DateOfBirth {

	private LinkedHashMap<String, Object> dateOfBirth = new LinkedHashMap<>();
	
	public DateOfBirth(Object year, Object month, Object day) {
		dateOfBirth.put("year", year);
		dateOfBirth.put("month", month);
		dateOfBirth.put("day", day);
	}
	
	public void setDateOfBirth(String key, Object value) {
		dateOfBirth.put(key, value);
	}

	public LinkedHashMap<String, Object> getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void removeKey(String key) {
		dateOfBirth.remove(key);
	}
}
