import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadorTest {
    private Calculador calculador;

    @BeforeEach
    public void setup(){
        calculador = new Calculador();
    }
    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }
    @Test
    public void testRes_PositiveNumbers_ShouldReturnCorrectRes() {
        // Arrange
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(5, resultado, "10 - 5 deberia ser 5");
    }
    @Test
    public void testMul_PositiveNumbers_ShouldReturnCorrectMul() {
        // Arrange
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(50, resultado, "10 * 5 deberia ser 50");
    }
    @Test
    public void testMul_NegativeNumbers_ShouldReturnCorrectMul() {
        // Arrange
        int numeroA = -10;
        int numeroB = -5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(50, resultado, "-10 * -5 deberia ser 50");
    }
    @Test
    public void testDiv_PositiveNumbers_ShouldReturnCorrectDiv() {
        // Arrange
        int numeroA = 10;
        int numeroB = 5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(2, resultado, "10 / 5 deberia ser 2");
    }
    @Test
    public void testDiv_NegativeNumbers_ShouldReturnCorrectDiv() {
        // Arrange
        int numeroA = -10;
        int numeroB = -5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(2, resultado, "-10 / -5 deberia ser 2");
    }
    @Test
    public void testDiv_DivisonByZero_ShouldReturnException() {
        // Arrange
        int numeroA = 10;
        int numeroB = 0;

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> calculador.division(numeroA, numeroB), "10 / 0 no es posible");
    }
}
