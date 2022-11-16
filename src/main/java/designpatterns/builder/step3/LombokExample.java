package designpatterns.builder.step3;

import lombok.Builder;

@Builder
public class LombokExample {
    private String title;
    private int nights;
    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();
    }
}
