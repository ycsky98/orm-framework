package org.sky.ormframework.core.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ycsky
 *
 * 事务提交
 */
public class TransactionCommit {

    public static void commit() throws SQLException {
        //对当前线程的事务进行提交
        TransactionLocal.get().commit();
        //删除当前线程下的事务
        TransactionLocal.remove();
    }
}
