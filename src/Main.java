import java.awt.*;

public class Main {

    public static void main(String[] args) {

        CatFamily c1 = new CatFamily();
        c1.CatFamily();
        c1.CatFamily("Egiption cat ", 8);
        c1.CatFamily("Egiption cat ", 1, Color.WHITE);

        Kitty k1 = new Kitty();
        k1.CatFamily();
        k1.CatFamily("Egiption cat ", 2);
        k1.CatFamily("Egiption cat ", 3, Color.GRAY);

        Kitty k2 = new Kitty();
        k2.CatFamily();
        k2.CatFamily("Egiption cat ", 4);
        k2.CatFamily("Egiption cat ", 5, Color.BLACK);
    }
}
