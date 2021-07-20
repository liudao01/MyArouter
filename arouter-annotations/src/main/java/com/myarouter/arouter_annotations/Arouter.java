package com.myarouter.arouter_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liuml on 2021/7/15 13:52
 */
///** Class, interface (including annotation type), or enum declaration */
@Target(ElementType.TYPE) //目标在类上
@Retention(RetentionPolicy.CLASS)
//保留级别是编译期
public @interface Arouter {
    String path();

    String group() default "";

}
