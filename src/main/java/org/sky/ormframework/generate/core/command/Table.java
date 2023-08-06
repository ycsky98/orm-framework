package org.sky.ormframework.generate.core.command;

import org.sky.ormframework.generate.core.type.Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ycsky
 *
 * table指令
 */
public class Table {

    private String tableName;

    private List<Column> columns = Collections.synchronizedList(new ArrayList<>());

    public Table(String tableName){
        this.tableName = tableName;
    }

    public Table column(String name, Type type){
        this.columns.add(new Column(name, type));
        return this;
    }
}
