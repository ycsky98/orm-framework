package org.sky.ormframework.generate.core.type;

/**
 * @author ycsky
 * <p>
 * 列类型
 */
public class Type {

    private boolean allowNull;

    /**
     * 注释
     */
    private String comment = "";

    public static Type varchar(int length) {
        return new Varchar(length);
    }

    public static Type numberInt(int length) {
        return new Int(length);
    }

    public static Type timestamp() {
        return new Timestamp();
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

    /**
     * 添加注释
     * @param comment
     */
    public void setComment(String comment){
        this.comment = comment;
    }

    /**
     * 是否包含注释
     *
     * <pre>
     *     if(hasComment()){
     *         //...有注释
     *     }else{
     *         //...无注释
     *     }
     * </pre>
     * @return
     */
    public boolean hasComment(){
        return this.comment != null && this.comment.length() > 0;
    }

    public boolean isAllowNull() {
        return allowNull;
    }

    public void setAllowNull(boolean allowNull) {
        this.allowNull = allowNull;
    }


}
