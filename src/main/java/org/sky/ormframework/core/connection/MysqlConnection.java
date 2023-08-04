package org.sky.ormframework.core.connection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ycsky
 *
 * Mysql连接
 */
public interface MysqlConnection {

    public Connection getConnection() throws SQLException;
}
