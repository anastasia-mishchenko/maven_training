
import org.testng.Assert;
import org.testng.annotations.*;

public class happyTicketTestNg {

    @DataProvider(name = "numbers")
    public static Object[][] ticketNumbers() {
        return new Object[][]{
                {2, 2, 2, 2, 2, 2},
                {1, 2, 3, 4, 5, 5},
                {1, 2, 3}
        };

    }

    ;

    @Test(dataProvider = "numbers")
    public static void verifyTicketIsLucky(int a, int b, int c, int d, int e, int f) {
        Assert.assertEquals(luckyTicket.isTicketLucky(a, b, c, d, e, f), true);
    }

    @Test(dataProvider = "numbers")
    public static void verifyTicketInNotLucky(int a, int b, int c, int d, int e, int f) {
        Assert.assertEquals(luckyTicket.isTicketLucky(a, b, c, d, e, f), false);
    }

    @Test(dataProvider = "numbers")
    public static void verifyTicketLenghtIsEquelsSix(int a, int b, int c, int d, int e, int f) {
        int[] result = {a, b, c, d, e, f};
        Assert.assertEquals(result.length, 6, "Wrong length");
    }



    @BeforeClass
    public void beforeClass(){
        System.out.println("Before all tests");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is test before each test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is test after each test");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After all tests");
    }
}

