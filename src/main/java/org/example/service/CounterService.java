package org.example.service;

import java.util.function.Consumer;

public class CounterService {
    public static void generate(Consumer<String> consumer,char... modes) {
       for (char mode: modes){
           generate(consumer,mode);
       }
    }

    private static void generate(Consumer<String> consumer,char mode) {
        switch (mode){
            case 'A' -> counterABC(consumer);
            case 'a' -> counterAbc(consumer);
            case 'Z' -> counterBCA(consumer);
            case 'z' -> counterBca(consumer);
        }
    }
    public static void counterABC(Consumer<String> consumer) {
        for (char start = 'A';start <='Z'; start++){
            consumer.accept(""+start);
        }
    }
    public static void counterAbc(Consumer<String> consumer) {
        for (char start = 'A';start <='Z'; start++){
            consumer.accept(""+start);
        }
    }
    public static void counterBCA(Consumer<String> consumer) {
        for (char start = 'Z';start >='A'; start--){
            consumer.accept(""+start);
        }
    }
    public static void counterBca(Consumer<String> consumer) {
        for (char start = 'z';start >='a'; start--){
            consumer.accept(""+start);
        }
    }
}
