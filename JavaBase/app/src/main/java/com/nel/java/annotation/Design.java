package com.nel.java.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description :
 * CreateTime : 2017/9/15 14:46
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2017/9/15 14:46
 * @ModifyDescription :
 */

/**
 * @Target  @Retention  @Inherited  @Documented
 * 四个对注解进行注解的元注解， 负责自定义的注解的属性
 * */

@Target({ElementType.TYPE, ElementType.METHOD}) //表示注解的作用对象
@Retention(RetentionPolicy.RUNTIME)             //表示注解的保留机制
@Inherited                                      //表示该注解可继承
@Documented                                     //表示该注解可生成文档
public @interface Design {
    String author();                            //注解成员，如果注解只有一个成员，则成员名必须是value()，成员类型只能为原始类型
    int data() default 0;                       //注解成员，默认为0
}
