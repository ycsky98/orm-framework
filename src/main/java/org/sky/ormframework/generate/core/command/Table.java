package org.sky.ormframework.generate.core.command;

import org.sky.ormframework.generate.core.type.Type;
import org.sky.ormframework.generate.enums.IndexType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ycsky
 * <p>
 * table指令
 */
public class Table {

    private final List<Column> columns = Collections.synchronizedList(new ArrayList<>());
    private final List<IndexSetting> indices = Collections.synchronizedList(new ArrayList<>());
    private final String tableName;

    public Table(String tableName) {
        this.tableName = tableName;
    }

    public Table column(String name, Type type) {
        this.columns.add(new Column(name, type));
        return this;
    }

    public IndexSetting index(String indexName) {
        IndexSetting indexSetting = new IndexSetting(indexName);
        indices.add(indexSetting);
        return indexSetting;
    }

    public class IndexSetting {
        Table table = Table.this;
        IndexType indexType;
        String indexName;
        String[] indexColumns;

        public IndexSetting(String indexName) {
            this.indexName = indexName;
        }

        public IndexSetting indexType(IndexType indexType) {
            this.indexType = indexType;
            return this;
        }

        public IndexSetting indexColumns(String... indexColumns) {
            this.indexColumns = indexColumns;
            return this;

        }

        public Table and() {
            return table;
        }
    }


}
