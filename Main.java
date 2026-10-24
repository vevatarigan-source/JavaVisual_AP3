import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {

        Character c1 = new Character(
            "Aragorn", CharacterType.WARRIOR, 5
        );

        Character c2 = new Character(
            "Gandalf", CharacterType.MAGE, 7
        );

        Character c3 = new Character(
            "Legolas", CharacterType.ARCHER, 4
        );

        System.out.println("=== DAFTAR KARAKTER ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n=== DEMO LEVEL UP ===");
        System.out.println("Sebelum level up:");
        System.out.println(c1);

        c1.levelUp();

        System.out.println("Sesudah level up:");
        System.out.println(c1);
    }
}
