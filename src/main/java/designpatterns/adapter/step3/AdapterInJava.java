package designpatterns.adapter.step3;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) throws FileNotFoundException {
        //collections
        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list = Collections.list(enumeration);
    }
}
