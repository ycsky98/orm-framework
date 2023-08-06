package org.sky.ormframework.generate.core.type;

/**
 * @author ycsky
 * <p>
 * 列类型
 */
public class Type {

    private boolean allowNull;

    public static Varchar varchar(int length) {
        return new Varchar(length);
    }

    public static Int numberInt(int length) {
        return new Int(length);
    }

    public static <T extends Type> T genericType(int length, Class<T> tClass) {

        if (!(Type.class).isAssignableFrom(tClass)) {
            throw new RuntimeException("不支持的类型");
        }

        try {
            return tClass.getConstructor(int.class).newInstance(length);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }


    }

    public boolean isAllowNull() {
        return allowNull;
    }

    public void setAllowNull(boolean allowNull) {
        this.allowNull = allowNull;
    }


}
