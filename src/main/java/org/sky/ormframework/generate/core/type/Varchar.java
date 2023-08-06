package org.sky.ormframework.generate.core.type;

public class Varchar extends Type{

    private int length;

    public Varchar(int length){
        if (length <= 0)
            throw new RuntimeException("varchar length <= 0");
        this.length = length;
    }

    public int length(){
        return this.length;
    }
}
