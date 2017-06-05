package com.chance;

import java.util.List;

/**
 * Created by Chance on 16/08/12.
 */
public class MainTest {

    public static void main(String[] args) {
        getDatasByClass();
        getDatasByCssQuery();
        getDatasByCssQueryUserBaidu();
    }

    public static void getDatasByClass() {
        Rule rule = new Rule(
                "http://www1.sxcredit.gov.cn/public/infocomquery.do?method=publicIndexQuery",
                new String[]{"query.enterprisename", "query.registationnumber"}, new String[]{"兴网", ""},
                "cont_right", Rule.CLASS, Rule.POST);
        List<LinkTypeData> extracts = ExtractService.extract(rule);
        printf(extracts);
    }

    public static void getDatasByCssQuery() {
        Rule rule = new Rule("http://www.11315.com/search",
                new String[]{"name"}, new String[]{"兴网"},
                "div.g-mn div.con-model", Rule.SELECTION, Rule.GET);
        List<LinkTypeData> extracts = ExtractService.extract(rule);
        printf(extracts);
    }

    public static void getDatasByCssQueryUserBaidu() {
        Rule rule = new Rule("http://news.baidu.com/ns",
                new String[]{"word"}, new String[]{"支付宝"},
                null, -1, Rule.GET);
        List<LinkTypeData> extracts = ExtractService.extract(rule);
        printf(extracts);
    }

    public static void printf(List<LinkTypeData> datas) {
        for (LinkTypeData data : datas) {
            System.out.println(data.getLinkText());
            System.out.println(data.getLinkHref());
            System.out.println("***********************************");
        }
    }
}
