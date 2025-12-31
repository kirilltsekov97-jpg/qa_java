import com.example.Feline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class FelineTest {

    @Test
    void eatMeat_returnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    void getFamilyReturnsFelineFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    void getKittensReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getKittnesReturnsSameCount() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}
