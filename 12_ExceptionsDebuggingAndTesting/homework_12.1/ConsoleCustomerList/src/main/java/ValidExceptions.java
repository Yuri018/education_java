public class ValidExceptions {

    static class ValidEmailException extends Exception {

        public ValidEmailException() {
            super("Wrong E-Mail. " +
                    "Correct format: vasily.petrov@gmail.com");
        }
    }

    static class ValidPhoneException extends RuntimeException {

        public ValidPhoneException() {
            super("Wrong Phone number. " +
                    "Correct format: +79215637722");
        }
    }
}