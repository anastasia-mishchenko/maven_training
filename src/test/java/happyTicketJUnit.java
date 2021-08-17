import org.junit.jupiter.api.*;
import org.testng.Assert;

public class happyTicketJUnit {

    @Test
    public void verifyLuckyTicket(){
        boolean actualResult = luckyTicket.isTicketLucky(1,1,1,1,1,1);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void verifyTicketIsNotLucky(){
        boolean actualResult = luckyTicket.isTicketLucky(1,2,3,4,5,6);
        Assert.assertTrue(!actualResult);
    }


    //1,2,3,4,5,6 --> false
    //1,1,1,1,1,1 --> true
    //-1,-1,-1,-1 --> compilation error ( reason: actual and formal argument lists differ in length)
    //a,b,c,d,e,f --> compilation error

//    @Test
//    public void verifyIsTicketLucky(){
//        boolean actResult = luckyTicket.isTicketLucky(-1,-1,-1,-1);
//          }

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
