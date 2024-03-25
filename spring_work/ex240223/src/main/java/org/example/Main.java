package org.example;

import org.example.component.AA;
import org.example.component.BB;
import org.example.conf.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);

        AA aa = context.getBean(AA.class);
        BB bb = context.getBean(BB.class);

        System.out.println(aa);
        System.out.println(bb);

        String str[] context.getBeanDefinitionNames();
        Arrays.stream(str).forEach(System.out::println);



        }
    }
