package org.sky.ormframework.generate.convert;

import org.sky.ormframework.generate.core.type.Int;
import org.sky.ormframework.generate.core.type.Timestamp;
import org.sky.ormframework.generate.core.type.Type;
import org.sky.ormframework.generate.core.type.Varchar;

/**
 * @author ycsky
 *
 * 类型与sql的转换
 */
public class TypeConvertSql {

    /**
     * 将对应的类型转换为sql
     * @param type
     * @return
     */
    public static String convertTypeToSql(Type type){
        if(type instanceof Int){
            return " int(" + ((Int) type).length() + ") ";
        } else if (type instanceof Varchar) {
            return " varchar(" + ((Varchar) type).length() + ") ";
        } else if (type instanceof Timestamp) {
            return " timestamp ";
        }
        return null;
    }
}
