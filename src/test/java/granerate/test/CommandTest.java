package granerate.test;

import org.sky.ormframework.generate.core.command.Create;
import org.sky.ormframework.generate.core.command.Table;
import org.sky.ormframework.generate.core.type.Int;
import org.sky.ormframework.generate.core.type.Type;
import org.sky.ormframework.generate.core.type.Varchar;
import org.sky.ormframework.generate.enums.IndexType;

public class CommandTest {

    public static void main(String[] args) {
        Create.createTable("").
                column("", Type.varchar(10))
                .index("alal").indexColumns("123","clou").indexType(IndexType.UNION)
                .and().column("wowo",Type.genericType(10,Int.class));
        ;

        ;

    }




}
