package org.example2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserNotificationTest {
    @Test
    void emailsShouldSendCorrectly(){
        MockMailServer mock = new MockMailServer();
        boolean resultado = mock.sendEmail("A","B","Mensaje de prueba");
        assertThat(resultado).isEqualTo(true);
    }
}
