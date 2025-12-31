import com.example.Animal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getFoodReturnsPlants() throws Exception {
        Animal animal = new Animal();
        assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    void getFoodReturnsMeat() throws Exception {
        Animal animal = new Animal();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
    }

    @Test
    void getFoodThrowsException() {
        Animal animal = new Animal();
        Exception ex = assertThrows(Exception.class, () -> animal.getFood("АВТО"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", ex.getMessage());
    }

    @Test
    void getFamilyReturnsString() {
        Animal animal = new Animal();
        assertNotNull(animal.getFamily());
    }
}
