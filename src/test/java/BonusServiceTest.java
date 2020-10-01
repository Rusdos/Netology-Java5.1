import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNotRegisteredAndAboveTheLimit() {
        BonusService service = new BonusService();

        long amount = 50000022;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndAboveTheLimit() {
        BonusService service = new BonusService();

        long amount = 100000049;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndAmountNegative() {
        BonusService service = new BonusService();

        long amount = 10000049;
        boolean registered = true;

        long actual = service.calculate(amount, registered);
        assertTrue(actual > 0, "Сумма покупки не должна быть отрицательной");

    }

    @Test
    void shouldCalculateRegisteredAndZeroAmount() {
        BonusService service = new BonusService();

        long amount = 10000;
        boolean registered = true;

        long actual = service.calculate(amount, registered);
        assertTrue(actual > 0, "Сумма покупки должна быть больше нуля");
    }


}