package com.jstarczewski;


public class Test {

    public Test(int value) {
        this.value = value;
    }

    int value;

    @Override
    public String toString() {
        return "Test{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return value == test.value;
    }

    @Override
    public int hashCode() {
        return  (super.hashCode())  + 17;
    }
}
