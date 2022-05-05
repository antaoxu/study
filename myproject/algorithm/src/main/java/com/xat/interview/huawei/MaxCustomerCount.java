package com.xat.interview.huawei;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 淡漠
 * @date 2022-05-05
 */
public class MaxCustomerCount {
    /*
     * 题目说明：
     *
     * 举办一场8小时的聚会，时间段从12：00到20：00点，让来访的客人事先填好到达的时间和离开的时间，
     * 为了掌握聚会期间的座位数目，需要先估计不同时间的最大客人数量。
     *
     * 1.到达和离开的时间，以整点计算，输入为整数，比如“12，18”表示客人到达的时间为12点后13点前，离开的时间是17点后18点前。
     * 2.按小时区间统计客人的数量，需要统计[12，13),[13,14)….[19，20)共有8个时间段的最大客人数量。
     * 3.假设邀请的客人最多100个。
     *
     *  假设输入：
     * 12,15
     * 16,17
     * 12,20
     * -1,-1
     * 程序要求的输出结果为：
     * [12,13):2
     * [13,14):2
     * [14,15):2
     * [15,16):1
     * [16,17):2
     * [17,18):1
     * [18,19):1
     * [19,20):1
     *
     * 解题思路如下：
     *
     * 如上图，就是要将每个时间段的值加入map做一个统计。
     */

    public static void main(String[] args) {
        //构造输入
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        Map<String,Integer> map = new HashMap<>();
        for (String s : list) {
            String[] temp = s.split(",");
            int min = Integer.parseInt(temp[0]);
            int max = Integer.parseInt(temp[0]);
            if (min > max || min < 12 || max > 20){
                continue;
            }

            for (int i = min; i < max; i++){
                String key = "["+i+","+i+1+")"+":";
                if (map.containsKey(key)){
                    map.put(key,map.get(key)+1);
                }
                map.put(key,1);
            }
        }
        map.entrySet().stream().sorted( Map.Entry.<String,Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2) ->o1,LinkedHashMap::new));
        map.entrySet().forEach(e -> System.out.println(e.getKey()+e.getValue()));
    }
}
