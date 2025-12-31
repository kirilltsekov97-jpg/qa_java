import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    void doesHaveManeMaleReturnsTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(true, lion.doesHaveMane());
    }

    @Test
    void constructorThrowsException() {
        assertThrows(Exception.class, () -> new Lion("Кот", feline));
    }

    @Test
    void getKittensReturnsValueFromFeline() throws Exception {
        int expectedKittens = 3;
        when(feline.getKittens()).thenReturn(expectedKittens);

        Lion lion = new Lion("Самец", feline);

        int actualKittens = lion.getKittens();
        assertEquals(expectedKittens, actualKittens);
        verify(feline).getKittens();
    }

    @Test
    void getFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expected);

        Lion lion = new Lion("Самец", feline);

        assertEquals(expected, lion.getFood());
        verify(feline).getFood("Хищник");
    }
}
