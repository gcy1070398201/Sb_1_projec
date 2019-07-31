package com.sb;

import com.sb.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sb1ProjecApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext c;

    @Test
    public void textHelloService(){
        boolean b =c.containsBean("helloService");

        System.out.printf("b"+b);
    }

}
