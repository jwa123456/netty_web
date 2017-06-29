package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by jiang wei on 2017/6/29.
 */
public class JsonUtil {

    public static Map<String, Object> convertJsonToMap(String jsonStr) {
        Map<String, Object> stringObjectMap = JSON.parseObject(jsonStr, new TypeReference<Map<String, Object>>() {
        });
        if (MapUtils.isEmpty(stringObjectMap)) {
            return Collections.emptyMap();
        }
        return stringObjectMap;
    }


    public static <T> List<T> convertJsonToList(String jsonStr, Class<T> clazz) {
        List<T> list = JSON.parseArray(jsonStr, clazz);
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        return list;

    }

}
