package fcu.iecs.oop.password;

public class PasswordEncorder {

	public String encode(String password) {
		return password.replaceAll("[aA]", "4").replaceAll("[Ee]", "3").replaceAll("[Ii]", "1").replaceAll("[Oo]", "0")
				.replaceAll("[Tt]", "7");
	}
}
