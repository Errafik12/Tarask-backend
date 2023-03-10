package com.fr.event;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Properties;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ConfigTestContextInitializer.class})
@SpringBootTest
@ActiveProfiles("dev")
public class ConfigAbstractBaseTest {
    @BeforeClass
    public static void setSystemProperty() {
        Properties properties = System.getProperties();
        properties.setProperty("spring.profiles.active", "dev");
    }
}
