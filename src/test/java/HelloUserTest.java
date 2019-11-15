import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloUserTest {

    @Test
    public void getUserGreetingTest(){
        String expectedUserGreeting = "Hello Bob";
        String actualUserGreeting = Hello.getGreeting("Bob");
        assertThat(actualUserGreeting, is(expectedUserGreeting));
    }

    @Test
    public void getFlakyResultTest(){
        assertThat( Math.random() < 0.5, is(true));
    }
}
