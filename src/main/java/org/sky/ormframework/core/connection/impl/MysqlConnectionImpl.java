package org.sky.ormframework.core.connection.impl;

import org.sky.ormframework.core.connection.MysqlConnection;
import org.sky.ormframework.core.transaction.TransactionLocal;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ycsky
 *
 * mysql数据源
 */
public class MysqlConnectionImpl implements MysqlConnection {

    private DataSource dataSource;

    public MysqlConnectionImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public Connection getConnection() throws SQLException {
        Connection connection = this.dataSource.getConnection();
        TransactionLocal.set(connection);
        return connection;
    }
}
