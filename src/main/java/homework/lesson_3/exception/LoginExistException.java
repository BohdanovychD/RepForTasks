package homework.lesson_3.exception;

public class LoginExistException extends Exception {
    private String login;

    public LoginExistException(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}