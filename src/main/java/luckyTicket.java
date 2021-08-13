public class luckyTicket {
    public static void main(String[] args) {
        isTicketLucky(1,2,3,4,5,6);

    }




    public static boolean isTicketLucky(int a, int b, int c, int d, int e, int f) {
        if (a+b+c == d+e+f) {
            System.out.println("Ticket is lucky");
            return true;
        } else {
            System.out.println("Try again");
            return false;
        }
    }
}
