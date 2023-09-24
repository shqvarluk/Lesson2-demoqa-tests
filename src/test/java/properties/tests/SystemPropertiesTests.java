package properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void systemPropertiesTest() {
        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser");

        System.out.println(browser);
    }

    @Test
    void systemPropertiesTest2() {
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser);
    }

    @Test
    void systemPropertiesTest3() {
        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser);
    }

    @Test
    @Tag("property")
    void systemPropertiesTest4() {
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser);
    }

    @Test
    @Tag("hello")
    void systemPropertiesTest5() {
        String name = System.getProperty("name", "default student");
        String message = String.format("Hello, %s!", name);

        System.out.println(message);
    }
}
