package com.xat.utils;

import com.alibaba.fastjson.JSONObject;
import com.xat.CreditApply;

public class Test {
    public static void main(String[] args) {
        CreditApply creditApply = new CreditApply();
        DxmExtended dxmExtended = new DxmExtended("1","男");
        creditApply.setExtended(dxmExtended);
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(creditApply));
        System.out.println(jsonObject.toJSONString());


    }


}
