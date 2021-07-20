package com.myrouter.compiler;

import com.google.auto.service.AutoService;
import com.sun.org.apache.xalan.internal.xslt.Process;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;

/**
 * Created by liuml on 2021/7/15 19:44
 */
// 自动为ProcessorTest注册，生成META-INF文件
@AutoService(Process.class)
@SupportedAnnotationTypes("com.myarouter.arouter_annotations.Arouter")//用于指示注释处理器支持的注释类型的注释, 简单来说是标记需要处理的注解,那些注解需要做处理

public class ArouterProcessor extends AbstractProcessor {//需要继承AbstractProcessor




    // 服务：在编译的时候干活
    // 如果没有在任何地方使用，此函数是不会工作的
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {


        // false不干活了      true干完了
        return false;
    }
}