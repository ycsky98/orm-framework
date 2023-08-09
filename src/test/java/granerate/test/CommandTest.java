package granerate.test;

import org.sky.ormframework.generate.convert.command.CreateTable;
import org.sky.ormframework.generate.convert.sql.CreateTableColumnImpl;
import org.sky.ormframework.generate.core.command.Create;
import org.sky.ormframework.generate.core.command.Table;
import org.sky.ormframework.generate.core.type.Int;
import org.sky.ormframework.generate.core.type.Type;
import org.sky.ormframework.generate.enums.IndexType;

public class CommandTest {

    public static void main(String[] args) {
        Table table = Create.createTable("demo").
                column("ceshi", Type.varchar(10), "测试")
                .index("alal").indexColumns("123","clou").indexType(IndexType.UNION)
                .and().column("wowo",Type.genericType(10,Int.class));

        CreateTable createTable = new CreateTableColumnImpl();

        System.out.println(createTable.generateCreateTableSql(table) + createTable.generateCreateTableColumnSql(table.getColumns()));
    }




}
