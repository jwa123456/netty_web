package service;

import com.alibaba.fastjson.JSON;
import org.apache.commons.collections4.MapUtils;
import utils.JsonUtil;

import java.util.Collections;
import java.util.Map;

/**
 * Created by jiang wei on 2017/6/28.
 */
public class TestService {
    public String testInput(String body) {
        Map<String, Object> jsonToMap = JsonUtil.convertJsonToMap(body);
        if (MapUtils.isEmpty(jsonToMap)) {
            return JSON.toJSONString(Collections.emptyMap());
        }

        return String.valueOf(jsonToMap.get("aaa"));
    }
}
