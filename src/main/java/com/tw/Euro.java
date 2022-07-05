package com.tw;

import java.util.Objects;

public class Euro {
    private final int value;

    Euro(int value) {
        this.value = value;
    }

    public boolean checkEquality(Euro euro) {
        return this.value == euro.value;
    }

}
