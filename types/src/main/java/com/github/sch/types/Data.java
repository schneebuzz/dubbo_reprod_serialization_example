package com.github.sch.types;

public class Data {

    private final int foo;
    private final String bar;

    Data() {
        this.foo = 0;
        this.bar = null;
    }

    public Data(int foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public int getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }

    @Override
    public String toString() {
        return "Data{" +
                "foo=" + foo +
                ", bar='" + bar + '\'' +
                '}';
    }
}
