package com.derry.s6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KtBase128 {

    public static void main(String[] args) {
        // 1.定义name集合
        List<String> names = new ArrayList<>();
        names.add("Zhangsan");
        names.add("Lisi");
        names.add("Wangwu");

        // 2.定义age集合
        List<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(21);
        ages.add(22);

        // 3.合并以上两个集合
        Map<String, Integer> newMap = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            newMap.put(names.get(i), ages.get(i));
        }

        // 4.给集合添加详细内容，方便输出
        List<String> showList = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : newMap.entrySet()) {
            String result = String.format("you name:%s, you age:%d",
                                           stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            showList.add(result);
        }

        // 5.输出最后的成果 结果
        for (int i = 0; i < showList.size(); i++) {
            System.out.println(showList.get(i));
        }
    }

}
