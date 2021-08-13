import org.junit.jupiter.api.*;
import org.testng.Assert;

public class luckyTicketTest {

    @Test
    public void verifyLuckyTicket(){
        boolean actualResult = luckyTicket.isTicketLucky(1,1,1,1,1,1);
        Assert.assertTrue(actualResult);
    }

    @org.testng.annotations.Test
    public void verifyTicketIsNotLucky(){
        boolean actualResult = luckyTicket.isTicketLucky(1,2,3,4,5,6);
        Assert.assertTrue(!actualResult);
    }
    //1,2,3,4,5,6 --> false
    //1,1,1,1,1,1 --> true
    //-1,-1,-1,-1 --> true
    //a,b,c,d,e,f --> false

    @Test
    public void verifyIsTicketLucky(){
        boolean actResult = luckyTicket.isTicketLucky(1,2,3,4,5,6);
        Assertions.assertTrue(true,"Lucky");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all tests");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("This is test before each test");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("This is test after each test");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("After all tests");
    }



}
