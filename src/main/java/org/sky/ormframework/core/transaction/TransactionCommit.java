package org.sky.ormframework.core.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ycsky
 *
 * 事务提交
 */
public class TransactionCommit {

    /**
     * 在多线程下进行事务删除
     * <pre>
     *     new Thread(()->{
     *         ..........
     *         Connection connection = pool.getConnection();
     *         TransactionLocal.set(connection);
     *         ........
     *         TransactionCommit.commitForThread();
     *     }).start();
     * </pre>
     *
     * @throws SQLException
     */
    public static void commitForThread() throws SQLException {
        Connection threadConn = TransactionLocal.get();
        threadConn.commit();
        threadConn.close();//会回收到连接池
        //删除当前线程下的事务
        TransactionLocal.remove();
    }

    /**
     * 正常提交事务
     *
     * @param connection
     * @throws SQLException
     */
    public static void commit(Connection connection) throws SQLException {
        connection.commit();
        //使用线程池情况下close会回收到连接池
        connection.close();
    }
}
