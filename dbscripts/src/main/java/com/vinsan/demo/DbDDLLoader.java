package com.vinsan.demo;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDDLLoader {

    private static final Logger logger = LogManager.getLogger(DbDDLLoader.class);

    public static void main(String[] args) throws Exception {

        logger.debug("############Loading DB Scripts (Mocke Run , there is no db connection for this example ############# ");
        for (int i = 0; i < 10; i++) {
            logger.info("Loading DB script {}" ,i );
            Thread.sleep(5000);
        }
        //SpringApplication.run(DemoApplication.class, args);
    }

}
