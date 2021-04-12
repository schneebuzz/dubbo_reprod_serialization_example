package com.github.sch.types;

public class DataImpl implements DataInt {

    @Override
    public Data getData() {
        System.out.println("Get data");
        return new Data(5, "Hello");
    }

    @Override
    public void setData(Data data) {
        System.out.println("Set data: " + data.toString());
    }
}
