package dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.function.Function;

@DisplayName("Functional Coding")
public class T2_Function {
    public static float multiplyBy2(float input){
        return input * 2f;
    }
    public static float multiplyBy3(float input){
        return input * 3f;
    }
    Function<Float,Float> multiplyBy5 = (Float input)->{
        return input * 5f;
    };
    Function<Float,Float> multiplyBy6 = input-> input*6;
    Function<Float,Float> multiplyBy7 = input-> input*7;

    @Test
    @DisplayName("multiply by 2")
    public void t1(){
        System.out.println("Muhammad Faizan Abbasi "+new Date());
        float actual = multiplyBy2(10f);
        float expected = 20f;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("multiply by 3")
    public void t2(){
        float actual = multiplyBy3(10f);
        float expected = 30f;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("multiply by 5")
    public void t3(){
        float actual = multiplyBy5.apply(10f);
        float expected = 50f;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("multiply by 6")
    public void t5(){
        float actual = multiplyBy6.apply(10f);
        float expected = 60f;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("multiply by 7")
    public void t4(){
        float actual = multiplyBy7.apply(10f);
        float expected = 70f;
        Assertions.assertEquals(expected,actual);
    }

}
