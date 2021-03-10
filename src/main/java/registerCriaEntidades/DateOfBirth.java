package registerCriaEntidades;

import java.util.LinkedHashMap;

public class DateOfBirth{
    LinkedHashMap<String, Object> dateOfBirth = new LinkedHashMap<>();
    public DateOfBirth(Object year, Object month, Object day){
    	dateOfBirth.put("year",year);
    	dateOfBirth.put("month",month);
    	dateOfBirth.put("day",day);
    }

    public LinkedHashMap<String, Object> getDateOfBirth() {
        return dateOfBirth;
    }
}
