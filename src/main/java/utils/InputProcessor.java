package utils;

import com.alibaba.fastjson.JSON;
import serverbaseentity.InputHeader;
import serverbaseentity.ReturnMessage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jiang wei on 2017/6/28.
 */
public class InputProcessor {
    public static ReturnMessage inputProcessor(String header, String body) {
        InputHeader inputHeader = JSON.parseObject(header, InputHeader.class);
        String returnMessage = "";
        if (inputHeader == null) {
            return new ReturnMessage(Boolean.FALSE, "error input format!");
        }
        try {
            Class<?> cls = Class.forName(inputHeader.getClazz());
            Method method = cls.getDeclaredMethod(inputHeader.getMethod(), String.class);
            Object invoke = method.invoke(cls.newInstance(), body);
            returnMessage = invoke.toString();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return new ReturnMessage(Boolean.FALSE, "not found class!");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return new ReturnMessage(Boolean.FALSE, "not method class!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return new ReturnMessage(Boolean.TRUE, returnMessage);
    }


}
