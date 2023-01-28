import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FormValidationTest {
	private FormValidation formValidation = new FormValidation();

	@Test
	public void testIsFormValid() {
	    // Test case 1: All fields are non-empty
	    String name = "John";
	    String lastname = "Doe";
	    String address = "123 Main St";
	    String gender = "male";
	    assertEquals(formValidation.isFormValid(name, lastname, address, gender), true);
	    System.out.println("Test case 1 passed");

	    // Test case 2: Name field is empty
	    name = "";
	    lastname = "Doe";
	    address = "123 Main St";
	    gender = "male";
	    assertEquals(formValidation.isFormValid(name, lastname, address, gender), false);
	    System.out.println("Test case 2 passed");

	    // Test case 3: Last Name field is empty
	    name = "John";
	    lastname = "";
	    address = "123 Main St";
	    gender = "male";
	    assertEquals(formValidation.isFormValid(name, lastname, address, gender), false);
	    System.out.println("Test case 3 passed");

	    // Test case 4: Gender field is empty
	    name = "John";
	    lastname = "Doe";
	    address = "123 Main St";
	    gender = "";
	    assertEquals(formValidation.isFormValid(name, lastname, address, gender), false);
	    System.out.println("Test case 4 passed");

	    // Test case 5: All fields are empty
	    name = "";
	    lastname = "";
	    address = "";
	    gender = "";
	    assertEquals(formValidation.isFormValid(name, lastname, address, gender), false);
	    System.out.println("Test case 5 passed");
	}

}
