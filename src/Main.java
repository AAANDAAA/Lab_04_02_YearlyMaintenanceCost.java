// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        double totalCost;
        System.out.println("Enter the maintenance cost for each of the season: ");

        System.out.println("Spring: ");
        double spring = 2000.00;
        System.out.println(spring);

        System.out.println("Summer: ");
        double summer = 2000.00;
        System.out.println(summer);

        System.out.println("Fall: ");
        double fall = 2000.00;
        System.out.println(fall);

        System.out.println("Winter: ");
        double winter = 2000.00;
        System.out.println(winter);

        totalCost = spring + summer + fall + winter; //calculation
        System.out.println("The total cost for all 4 season is: $" + totalCost);

    }
}