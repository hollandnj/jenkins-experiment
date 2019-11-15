import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloUserTest {

    // Failing test
    @Test
    public void getUserGreetingTest(){
        String expectedUserGreeting = "Hello Bob";
        String actualUserGreeting = "";
        assertThat(actualUserGreeting, is(expectedUserGreeting));
    }
}
