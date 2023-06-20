public class aims {
    public static void main(String[] args) {
        // Create a new cart
        cart user_01_cart = new cart();

        // Create new dvds object
        DigitalVideoDisc dvd_01 = new DigitalVideoDisc("The lion king", "Animation",
                "Roger Aller", 87, 19.95f);
        DigitalVideoDisc dvd_02 = new DigitalVideoDisc("Star war", "Science Fiction",
                "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd_03 = new DigitalVideoDisc("Only title");
        DigitalVideoDisc dvd_04 = new DigitalVideoDisc("Aladin", "Animation", 12.5f);
        DigitalVideoDisc dvd_05 = new DigitalVideoDisc("Aladin", "Animation", "Davis", 18.99f);

        user_01_cart.addDigitalVideoDisc(dvd_01);
        user_01_cart.addDigitalVideoDisc(dvd_02);
        user_01_cart.addDigitalVideoDisc(dvd_02);
        user_01_cart.addDigitalVideoDisc(dvd_02);
        user_01_cart.addDigitalVideoDisc(dvd_02);
        user_01_cart.addDigitalVideoDisc(dvd_04);
        user_01_cart.addDigitalVideoDisc(dvd_04);
        user_01_cart.addDigitalVideoDisc(dvd_04);
        user_01_cart.removeDigitalVideoDisc(dvd_01);
        user_01_cart.removeDigitalVideoDisc(dvd_03);
        user_01_cart.removeDigitalVideoDisc(dvd_02);
        System.out.println(user_01_cart.totalCost());

    }
}
