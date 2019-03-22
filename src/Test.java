import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        JSONObject object = JSONObject
                .parseObject("{\"boolean\":true,\"string\":\"string\",\"list\":[1,2,3],\"int\":2}");
        //string
        String s = object.getString("string");
        System.out.println(s);
        //int
        int i = object.getIntValue("int");
        System.out.println(i);
        //boolean
        boolean b = object.getBooleanValue("boolean");
        System.out.println(b);
        //list
        List<Integer> integers = JSON.parseArray(object.getJSONArray("list").toJSONString(),Integer.class);
        integers.forEach(System.out::println);
        //null
        System.out.println(object.getString("null"));
    }
}
