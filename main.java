public class PasswordVerifier {
    public static void verifyPassword(String password) throws Exception {
        // Проверка длины пароля
        if (password.length() < 8) {
            throw new Exception("Пароль должен содержать не менее 8 символов.");
        }

        // Проверка наличия цифры в пароле
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new Exception("Пароль должен содержать хотя бы одну цифру.");
        }

        // Проверка наличия заглавной буквы в пароле
        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            throw new Exception("Пароль должен содержать хотя бы одну заглавную букву.");
        }
    }

    public static void main(String[] args) {
        try {
            // Примеры
            verifyPassword("Pass1234"); // Пароль корректный
            verifyPassword("abc");      // Исключение: Пароль должен содержать не менее 8 символов.
            verifyPassword("abcdefg");  // Исключение: Пароль должен содержать хотя бы одну цифру.
            verifyPassword("abcdefgh"); // Исключение: Пароль должен содержать хотя бы одну заглавную букву.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
