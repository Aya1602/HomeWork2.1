import java.awt.*;

public class CatFamily extends Animals {

    public final void CatFamily(){}
    public void CatFamily(String subspecies, int age){
        System.out.println("kitty's subspecies  " + subspecies);
    }
    public void CatFamily(String subspecies, int age, Color color){
        System.out.println("kitty's subspecies  " + subspecies + " and kitty " + age + " years old");
    }
}
