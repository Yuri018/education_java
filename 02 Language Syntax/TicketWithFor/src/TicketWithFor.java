public class TicketWithFor
{
    public static void main(String[] args)
    {

        for (int ticket = 200000; ticket <= 235000; ticket++)
            if (ticket <= 210000)
            {
                System.out.println("Билет № " + ticket);

            } else if (ticket >= 220000)
            {
                System.out.println("Билет № " + ticket);
            }
    }
}
