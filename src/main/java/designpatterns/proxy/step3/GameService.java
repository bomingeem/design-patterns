package designpatterns.proxy.step3;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    public void startGame() {
        System.out.println("이 자리에 오신 여러분들 진심으로 환영합니다.");
    }
}
