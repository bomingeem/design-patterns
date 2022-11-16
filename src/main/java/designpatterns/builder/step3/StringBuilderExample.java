package designpatterns.builder.step3;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship")
                .append("keesun")
                .toString();
        System.out.println(result);
    }
}
