package org.sky.ormframework.generate.annotation;

import java.lang.annotation.*;

/**
 * @author ycsky
 *
 * 使用索引(暂时默认索引是index)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Index {
}
