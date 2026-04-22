public class SandwichSculptor {
    public static void main(String[] args) {
        // A hacer sandwiches
        hoagie cust12Hoagie = new ItalianHoagie();
        cust12Hoagie.makeSandwich();

        System.out.println();

        hoagie cust13Hoagie = new VeggieHoagi();
        cust13Hoagie.makeSandwich();
    }
}