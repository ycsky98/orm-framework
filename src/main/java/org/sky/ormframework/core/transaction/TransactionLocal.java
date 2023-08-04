package org.sky.ormframework.core.transaction;

import java.sql.Connection;

/**
 * @author yangcong
 *
 * 用于线程隔离当前事务
 */
public class TransactionLocal {

    private static ThreadLocal<Connection> transactionLocal = new ThreadLocal<Connection>();

    public static void set(Connection connection){
        transactionLocal.set(connection);
    }

    public static Connection get(){
        return transactionLocal.get();
    }

    public static void remove(){
        transactionLocal.remove();
    }
}
