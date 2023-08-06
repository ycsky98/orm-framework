package org.sky.ormframework.generate.core.type;

/**
 * @author ycsky
 *
 * int 类型
 */
public class Int extends Type{

    private int length;

    public Int(int length){
        if (length > 11 || length <= 0)
            throw new RuntimeException("int length > 11 or length <= 0");
        this.length = length;
    }

    public int length(){
        return this.length;
    }
}
