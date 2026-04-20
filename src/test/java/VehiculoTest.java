import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {
    @Test
    void alAcelerarLaVelocidadDebeAumentar() {
        Vehiculo miCoche = new Vehiculo("Seat", "Ibiza", 120);
        miCoche.acelerar(20);
        assertEquals(20, miCoche.getVelocidadActual());
    }
}