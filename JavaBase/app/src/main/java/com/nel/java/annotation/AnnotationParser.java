package com.nel.java.annotation;

import java.lang.reflect.Method;

/**
 * Description :
 * CreateTime : 2017/9/15 15:00
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2017/9/15 15:00
 * @ModifyDescription :
 */

public class AnnotationParser {

    public static void main(String[] argv) {
        AnnotationParser annotationParser = new AnnotationParser();
        try {
            annotationParser.parser();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void parser() throws ClassNotFoundException {
        Class c = Class.forName("com.nel.java.annotation.Person");
        if (c.isAnnotationPresent(Design.class)) {
            Design design = (Design) c.getAnnotation(Design.class);
            System.out.println("name : " + c.getName() + "; data : " + design.data());
        }

        Method[] methods = c.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Design.class)) {
                Design design = method.getAnnotation(Design.class);
                System.out.println("name : " + method.getName() + "; data : " + design.data());
            }
        }
    }
}
