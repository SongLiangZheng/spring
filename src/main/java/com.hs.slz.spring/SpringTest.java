package com.hs.slz.spring;

import com.hs.slz.spring.dto.Man;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = (Man)ctx.getBean("man");
        man.run();
        ctx.close();
    }

}
