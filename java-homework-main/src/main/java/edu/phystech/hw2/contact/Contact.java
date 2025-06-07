package edu.phystech.hw2.contact;


public record Contact(String username, String email) implements Comparable<Contact> {

    public static final String UNKNOWN_EMAIL = "unknown@gmail.com";

    // Вложенный класс исключения
    public static class InvalidContactFieldException extends RuntimeException {
        private final String fieldName;

        public InvalidContactFieldException(String fieldName, String message) {
            super(message);
            this.fieldName = fieldName;
        }

        public String getFieldName() {
            return fieldName;
        }
    }

    public Contact {
        if (username == null || username.trim().isEmpty()) {
            throw new InvalidContactFieldException("username", "Username cannot be empty or blank");
        }

        if (email == null || email.isEmpty()) {
            email = UNKNOWN_EMAIL;
        } else {
            if (!email.matches("[^@\\s]+@gmail\\.com")) {
                throw new InvalidContactFieldException("email", "Email must be a valid gmail.com address");
            }
        }
        username = username.trim();
    }

    public Contact(String username) {
        this(username, UNKNOWN_EMAIL);
    }

    @Override
    public int compareTo(Contact o) {
        return Integer.compare(this.username.length(), o.username.length());
    }
}