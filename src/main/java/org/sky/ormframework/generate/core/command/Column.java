package org.sky.ormframework.generate.core.command;

import org.sky.ormframework.generate.core.type.Type;

/**
 * @author ycsky
 *
 * 列
 */
public class Column {

    private String name;

    public Type type;

    private String comment;

    public Column(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public Column(String name, Type type, String comment){
        this.name = name;
        this.type = type;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 是否存在注解
     * @return
     */
    public boolean isComment(){
        return this.comment != null && comment.length() > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Column column = (Column) o;

        if (!name.equals(column.name)) return false;
        if (!type.equals(column.type)) return false;
        return comment.equals(column.comment);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + comment.hashCode();
        return result;
    }
}
