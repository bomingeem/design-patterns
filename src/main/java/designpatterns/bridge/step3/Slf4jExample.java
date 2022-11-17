package designpatterns.bridge.step3;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Slf4jExample {
    private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        logger.info("hello logger");
    }
}
