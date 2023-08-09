package org.sky.ormframework.generate.convert.sql;

import org.sky.ormframework.generate.convert.TypeConvertSql;
import org.sky.ormframework.generate.core.command.Column;

import java.util.List;

/**
 * @author ycsky
 *
 * 构建Table列
 */
public class CreateTableColumnImpl extends CreateTableImpl{

    private static final String RIGHT = "(";

    private static final String LEFT = ")";

    @Override
    public String generateCreateTableColumnSql(List<Column> columns) {
        StringBuffer sql = new StringBuffer(RIGHT);
        int end = columns.size();
        int index = 0;
        for (Column column : columns) {
            if (index == end - 1){
                sql.append(column.getName() + TypeConvertSql.convertTypeToSql(column.getType())).
                        append(column.isComment() ? " COMMENT \"" + column.getComment() + "\" ": "");
                break;
            }
            sql.append(column.getName() + TypeConvertSql.convertTypeToSql(column.getType())).
                    append(column.isComment() ? " COMMENT \"" + column.getComment() + "\"": "")
                    .append(" , ");
            index++;
        }
        sql.append(LEFT);
        return sql.toString();
    }

}
