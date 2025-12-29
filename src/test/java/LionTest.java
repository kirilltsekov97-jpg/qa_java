import com.example.Felinable;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Mock
    Felinable feline;

    @Test
    void doesHaveMane_male_returnsTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(true, lion.doesHaveMane());

    }

    @Test
    void constructor_throwsException() {
        //Lion lion = new Lion("Кот", feline);
        assertThrows(Exception.class, () -> new Lion("Кот", feline));
    }

    @Test
    void getKittens_returnsValueFromFeline() throws Exception {
        int expectedKittens = 3;
        when(feline.getKittens()).thenReturn(expectedKittens);
        Lion lion = new Lion("Самец", feline);
        int actualKittens = lion.getKittens();
        assertEquals(expectedKittens, actualKittens);
        verify(feline).getKittens();
    }

    @Test
    void getFood() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expected);
        Lion lion = new Lion("Самец", feline);
        assertEquals(expected, lion.getFood());
        verify(feline).getFood("Хищник");
    }
}