package org.sky.ormframework.generate.core.command;

/**
 * @author ycsky
 *
 * create 指令
 */
public class Create {

    public static Table createTable(String name){
        return new Table(name);
    }
}
