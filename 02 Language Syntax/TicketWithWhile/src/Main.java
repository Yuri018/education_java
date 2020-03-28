public class Main
{
    public static void main(String[] args)
    {
        int ticket = 200000;
        while (ticket <= 235000)
        {
            if (ticket >= 200000 && ticket <= 210000)
            {
                System.out.println("Билет № " + ticket);
            }
            else if (ticket >= 220000)
            {
                System.out.println("Билет № " + ticket);
            }
            ticket++;
        }
    }
}
