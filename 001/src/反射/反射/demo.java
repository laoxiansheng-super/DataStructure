package 反射.反射;/*

 */

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class demo {

    private String name = "1";
   private    String age = "a";
    public String height = "175";
    String a = "4";
    String b = "4";

    public demo() {
    }

    public demo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void test() {
        System.out.println("b");
    }

    private static  void test02() {
        System.out.println("c");
    }


    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("反射.反射.demo");
            //创建运行时对象,默认空参构造
            demo o =(demo) aClass.newInstance();

            //获取当前类所有方法(不包括父类)           //静态方法改变的是invoke里的对象可以是null，可以是类.class,可以是
            Method test = aClass.getDeclaredMethod("test02");
            test.setAccessible(true);
            Object invoke = test.invoke(o);
            System.out.println(invoke);


            //加s返回的是数组
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                //获取注解
                Annotation[] annotation = declaredMethod.getAnnotations();
                for (Annotation annotation1 : annotation) {
                    System.out.println(annotation1);
                }
                //权限修饰符
                System.out.println(Modifier.toString(declaredMethod.getModifiers()));
                //返回值类型
                System.out.println(declaredMethod.getReturnType().getName());
            }


            //获取类和父类的public有方法
            aClass.getMethod("test").invoke(o);
            //加s返回的是数组
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
            System.out.println("--------------------------------------");

            //获取当前类所有属性(不包含父类)
            Field age = aClass.getDeclaredField("age");
            age.setAccessible(true);
            age.set(o,"sss");
            System.out.println(age.get(o));

            //获取当前类所有属性(不包含父类)
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField);
            }

            //获取类及其父类public的属性()
            Field[] fields = aClass.getFields();
            for (Field field : fields) {
                System.out.println(field);
            }



//            //获取父类
//            Class<?> superclass = aClass.getSuperclass();
//            //获取运行时带范型的父类
//            Type genericSuperclass = aClass.getGenericSuperclass();
//            ParameterizedType parameterizedType=(ParameterizedType)  genericSuperclass;
//            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
//            actualTypeArguments[0].getTypeName();
//            System.out.println(((Class) actualTypeArguments[0]).getName());
//            //获取接口
//            Class<?>[] interfaces = (Class<?>[]) aClass.getGenericInterfaces();
//
//
//            //获取当前类及父类的public构造器
//            Constructor<?>[] constructor = aClass.getConstructors();
//            //获取当前类的所有构造器
//            Method[] declaredMethods1 = aClass.getDeclaredMethods();
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
            declaredConstructor.setAccessible(true);
            declaredConstructor.newInstance();


        } catch (ClassNotFoundException e) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
