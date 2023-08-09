package org.sky.ormframework.generate.convert.command;

import org.sky.ormframework.generate.core.command.Column;
import org.sky.ormframework.generate.core.command.Table;

import java.util.List;

/**
 * @author ycsky
 *
 * 创建表
 */
public interface CreateTable {

    public String generateCreateTableSql(Table table);

    public String generateCreateTableColumnSql(List<Column> columns);
}
