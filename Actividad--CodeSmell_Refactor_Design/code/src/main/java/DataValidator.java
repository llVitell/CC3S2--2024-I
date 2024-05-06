public class DataValidator {
    public static void main(String[] args) {
        System.out.println(validateEmail("example@example.com"));
    }

    public static boolean validateEmail(String email) {
        String emailRegex =  "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
}
