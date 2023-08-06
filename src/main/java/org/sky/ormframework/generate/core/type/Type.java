package org.sky.ormframework.generate.core.type;

/**
 * @author ycsky
 *
 * 列类型
 */
public class Type {

    public static Varchar varchar(int length){
        return new Varchar(length);
    }

    public static Int numberInt(int length){
        return new Int(length);
    }
}
