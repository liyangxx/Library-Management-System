package lms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class staffTest {

    @Test
    void testGetSalary() {
        Staff staff = new Staff(1, "John Doe", "Address", 123456789, 50000.0);

        double expectedSalary = 50000.0;
        double actualSalary = staff.getSalary();

        assertEquals(expectedSalary, actualSalary);
    }
}
