package designpatterns.singleton;

public class Settings {
    private static volatile Settings instance;

    private Settings() {
    }

    /**
     * 1. synchronized 사용
     * 2. 이른 초기화(eager initialization) 사용
     * 3. double-checked locking 사용
     */
    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
