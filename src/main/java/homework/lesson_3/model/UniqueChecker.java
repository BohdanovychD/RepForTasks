package homework.lesson_3.model;

import homework.lesson_3.exception.LoginExistException;

public class UniqueChecker {
    private String name;
    private String login;

    public UniqueChecker(String name, String login) throws LoginExistException {
        if (NotebookEnum.checkLogin(login)) {
            throw new LoginExistException("Not unique login", login);
        }
        this.name = name;
        this.login = login;
    }

    @Override
    public String toString() {
        return "UniqueChecker{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
