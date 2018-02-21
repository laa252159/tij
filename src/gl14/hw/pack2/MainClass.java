package gl14.hw.pack2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import gl14.hw.pack1.Iface;
import gl14.hw.pack1.OuterPackageClass;

public class MainClass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Iface obj = OuterPackageClass.getHiddenClass();
        Method[] methods = obj.getClass().getDeclaredMethods();
        for(Method method : methods){
            method.setAccessible(true);
            method.invoke(obj);
        }
    }
}
