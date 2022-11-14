package designpatterns.singleton;

public class Settings {
    private static Settings INSTANCE = new Settings();

    private Settings() {
    }

    /**
     * 1. synchronized 사용
     * 2. 이른 초기화(eager initialization) 사용
     */
    public static Settings getInstance() {
        return INSTANCE;
    }
}
