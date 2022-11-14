package designpatterns.singleton;

public class Settings {
    private static Settings instance;

    private Settings() {
    }

    /**
     * 1. synchronized 사용
     */
    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
