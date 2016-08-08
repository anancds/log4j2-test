package com.cds.learn.log4j2.app;

import com.cds.learn.log4j2.Hello;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.properties.PropertiesConfigurationBuilder;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloWorld {

    //    private static final Logger logger = LogManager.getLogger("HelloWorld");
    private static final Logger logger = LogManager.getLogger(HelloWorld.class.getName());



    public static void main(String[] args) throws IOException {

        PropertiesConfigurationBuilder builder = new PropertiesConfigurationBuilder();
        ConfigurationSource source = new ConfigurationSource(new FileInputStream("src/log4j2.xml"));




//        System.out.println(HelloWorld.class.getResource("log4j2.xml").getPath());
        logger.info("info!");
        logger.error("hello world!");
        logger.fatal("fatal! ");


        Hello hello = new Hello();
        if (!hello.hello()) {
            logger.error("hello");
        }
    }
}
