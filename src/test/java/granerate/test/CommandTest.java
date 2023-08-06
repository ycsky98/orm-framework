package granerate.test;

import org.sky.ormframework.generate.core.command.Create;
import org.sky.ormframework.generate.core.command.Table;
import org.sky.ormframework.generate.core.type.Type;
import org.sky.ormframework.generate.core.type.Varchar;

public class CommandTest {

    public static void main(String[] args) {
        Create.createTable("").
                column("", Type.varchar(10));
    }
}
