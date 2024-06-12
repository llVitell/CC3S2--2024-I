package org.example;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class NumerosAleatoriosTest {
    @Test
    void numberGeneratedShouldBeInRange() {
        StubNumerosAleatorios stub = new StubNumerosAleatorios();
        int result = stub.obtenerNumeroAleatorio(9,20);
        assertThat(result).isEqualTo(0);
    }
}