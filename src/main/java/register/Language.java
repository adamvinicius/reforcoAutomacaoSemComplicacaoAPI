package register;

public class Language {
	private String name;

	@Override
	public String toString() {
		return "Language [getName()=" + getName() + "]";
	}

	public Language(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
