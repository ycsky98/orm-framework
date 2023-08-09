package org.sky.ormframework.generate.convert.sql;

import org.sky.ormframework.generate.convert.command.CreateTable;
import org.sky.ormframework.generate.core.command.Table;

/**
 * @author ycsky
 *
 * 创建表
 */
public abstract class CreateTableImpl implements CreateTable {

    private static final String CREATE_TABLE = "CREATE TABLE ";

    @Override
    public String generateCreateTableSql(Table table) {
        StringBuffer sql = new StringBuffer().append(CREATE_TABLE);
        sql.append(table.getTableName());
        return sql.toString();
    }
}
