package org.example;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
    @Test
    void constructorShouldSetAmountAndCurrency() {
        // Arrange
        int amount = 100;
        String currency = "USD";

        // Act
        Money money = new Money(amount,currency);

        // Assert
        assertThat(money.equals(new Money(amount,currency))).isEqualTo(true);
    }

}