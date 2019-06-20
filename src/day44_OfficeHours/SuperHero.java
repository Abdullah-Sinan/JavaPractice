package day44_OfficeHours;

public class SuperHero {
     private String name;
     
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
		
	// this method returns encrypted version of name
	// if name is batman , so this method will return ******
	// if name is superman , so this method will return ********
	public static String encryptName(String name) {
    String encryptedName = "";
	// batman --> ******
	for (int i = 0; i < name.length(); i++) {
		// 4 letters -> 4 stars ****
		// 5 letters -> 5 stars *****
		encryptedName += "*";
		}
	// ****** : 6 letters.
	// + " : " + encryptedName.length() + " letters."
	return encryptedName ;
		
	}

	public char[] getEncryptName() {
		// TODO Auto-generated method stub
		return null;
	}

}
