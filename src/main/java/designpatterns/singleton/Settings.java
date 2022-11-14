package designpatterns.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    /**
     * 1. synchronized 사용
     * 2. 이른 초기화(eager initialization) 사용
     * 3. double-checked locking 사용
     * 4. static inner 클래스 사용 (권장하는 방법 중 하나)
     */
    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    //직렬화 대응 방안
    protected Object readResolve() {
        return getInstance();
    }
}
