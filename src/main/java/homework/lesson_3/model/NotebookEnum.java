package homework.lesson_3.model;

public enum NotebookEnum {
    FIRST_NOTE("Masha", "masha26172"),
    SECOND_NOTE("Vika", "vika26172"),
    THIRD_NOTE("Sasha", "sasha26172");

    private final String name;
    private final String login;

    NotebookEnum(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public static boolean checkLogin (String loginData){
        for (NotebookEnum note : NotebookEnum.values()){
            if (note.getLogin().equals(loginData)){return true;}
        }
        return  false;
    }
}
