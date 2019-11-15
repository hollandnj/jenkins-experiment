import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloUserTest {

    @Test
    public void getUserGreetingTest() {
        String expectedUserGreeting = "Hello Bob";
        String actualUserGreeting = Hello.getGreeting("Bob");
        assertThat(actualUserGreeting, is(expectedUserGreeting));
    }

    @Test
    public void ratherSlowTest() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Just a moment...");
            Thread.sleep(5000);
        }
    }

//    @Test
//    public void thisAlwaysFailsTest(){
//        assertThat("black", is("white"));


    @Test
    public void flakyResultTest1() {
        assertThat(Math.random() < 0.9, is(true));
    }
    @Test
    public void flakyResultTest2() {
        assertThat(Math.random() < 0.9, is(true));
    }
    @Test
    public void flakyResultTest3() {
        assertThat(Math.random() < 0.9, is(true));
    }
    @Test
    public void flakyResultTest4() {
        assertThat(Math.random() < 0.9, is(true));
    }
    @Test
    public void flakyResultTest5() {
        assertThat(Math.random() < 0.9, is(true));
    }
    @Test
    public void flakyResultTest6() {
        assertThat(Math.random() < 0.9, is(true));
    }
}

