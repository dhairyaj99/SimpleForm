public class FormValidation {
	public FormValidation() {}

    public boolean isFormValid(String name, String lastname, String address, String gender) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        if (lastname == null || lastname.isEmpty()) {
            return false;
        }
        if (gender == null || gender.isEmpty()) {
            return false;
        }
        return true;
    }
}
