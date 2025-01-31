package org.example.infrastructure;

import java.time.LocalDate;

public class Clock {
    public LocalDate today() {
        return LocalDate.now();
    }
}
