package dao;

import org.example.service.CounterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T3_Consumer {
    public static void printToWebPage(String input){
        System.out.print(" "+input);
    }
    @Test
    @DisplayName("T1 consumer test ")
    public void t2(){
        System.out.println("Muhammad Faizan Abbasi"+new Date());
        List<String> listAbc = new ArrayList<>();
        CounterService.generate(listAbc::add,'z');
        int expected = 26;
        int actual =  listAbc.size();
        listAbc.forEach(System.out::print);
        System.out.println();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("t3 check for z")
    public void t3(){
        List<String> listAbc = new ArrayList<>();
        CounterService.generate(listAbc::add,'z', 'Z');
        listAbc.forEach(System.out::print);
        System.out.println();
        int expected = 26;
        int actual =  listAbc.indexOf("Z");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("t5 to find the size for z,Z and A")
    public void t4(){
        List<String> listAbc = new ArrayList<>();
        CounterService.generate(listAbc::add,'z', 'Z','A');
        listAbc.forEach(System.out::print);
        System.out.println();
        int expected = 78;
        int actual =  listAbc.size();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("T1 consumer test ")
    public void t6(){
        System.out.println("Muhammad Faizan Abbasi"+new Date());
        List<String> listAbc = new ArrayList<>();
        CounterService.generate(listAbc::add,'a','A');
        int expected = 26;
        int actual =  listAbc.size();
        listAbc.forEach(System.out::print);
        System.out.println();
        Assertions.assertEquals(expected, actual);
    }
}
