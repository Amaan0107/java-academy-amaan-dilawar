package org.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testPunchInAndOut_CorrectTimeCalculation() {
        Employee employee = new Employee();
        employee.punchIn(9.0); // 9 AM
        double workedHours = employee.punchOut(17.0); // 5 PM

        assertEquals(8.0, workedHours, 0.001);
    }

    @Test
    public void testPunchIn_WhenAlreadyWorking() {
        Employee employee = new Employee();
        employee.punchIn(9.0);

        Exception exception = assertThrows(IllegalStateException.class, () -> employee.punchIn(10.0));
        assertEquals("Already punched in.", exception.getMessage());
    }

    @Test
    public void testPunchOut_WithoutPunchIn() {
        Employee employee = new Employee();

        Exception exception = assertThrows(IllegalStateException.class, () -> employee.punchOut(17.0));
        assertEquals("Not punched in.", exception.getMessage());
    }
}

