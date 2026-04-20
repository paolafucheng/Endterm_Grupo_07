import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {
    @Test
    void alAcelerarLaVelocidadDebeAumentar() {
        Vehiculo miCoche = new Vehiculo("Seat", "Ibiza", 120);
        miCoche.acelerar(20);
        assertEquals(20, miCoche.getVelocidadActual());
    }
  
    @Test
    void noDebeSuperarLaVelocidadMaxima() {
        Vehiculo miCoche = new Vehiculo("Seat", "Ibiza", 100);
        miCoche.acelerar(155); // Intentamos ir a 150 en un coche de 100
        assertEquals(100, miCoche.getVelocidadActual());
    }
  
    @Test
      @DisplayName("Debería disminuir la velocidad al frenar")
      void testFrenar() {
         Vehiculo miCoche = new Vehiculo("Seat", "Ibiza", 120);
         miCoche.acelerar(50);
         miCoche.frenar(20);
         assertEquals(30, miCoche.getVelocidadActual());
    }
}