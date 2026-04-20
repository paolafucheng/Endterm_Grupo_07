import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {
    // Aquí irán nuestros tests
    @Test
    @DisplayName("Debería disminuir la velocidad al frenar")
    void testFrenar() {
        Vehiculo miCoche = new Vehiculo("Seat", "Ibiza", 120);
        miCoche.acelerar(50);
        miCoche.frenar(20);
        assertEquals(30, miCoche.getVelocidadActual());
    }
}