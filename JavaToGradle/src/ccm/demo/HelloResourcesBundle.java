package ccm.demo;

import java.util.ResourceBundle;

public class HelloResourcesBundle {

	public static void main(String[] args) {
		ResourceBundle resource = ResourceBundle.getBundle("HelloMessages");

		System.out.print(resource.getString("ccm.welcome") + "!");
		System.out.println(resource.getString("ccm.name") + "!");
	}

}