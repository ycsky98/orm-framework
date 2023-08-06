package org.sky.ormframework.generate.annotation;

import org.sky.ormframework.generate.enums.IndexType;

import java.lang.annotation.*;

/**
 * @author ycsky
 *
 * 使用索引(暂时默认索引是index)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Index {

    IndexType indexType();
    String indexName();
    String[] indexColumn();

}
