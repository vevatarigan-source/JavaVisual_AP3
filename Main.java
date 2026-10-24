import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // Mini-Challenge 5: Membuat karakter baru
        Character hero = new Character(
            "Veva",
            CharacterType.MAGE,
            5
        );

        // Mengatur mana karakter
        hero.setMana(100);

        // Menampilkan informasi karakter
        System.out.println("=== MINI-CHALLENGE AP3 ===");
        System.out.println(hero);

        // Memanggil getter mana
        System.out.println("Mana: " + hero.getMana());

        // Memanggil isAlive()
        System.out.println("Apakah karakter hidup? " + hero.isAlive());
    }
}
