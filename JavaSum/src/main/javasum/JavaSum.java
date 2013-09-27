package main.javasum;

import java.util.List;

/**
 * @author yron
 */
public class JavaSum {

    public Integer sum(List<Integer> list) {
        Integer res = 0;
        for (Integer i : list) res += i;
        return res;
    }

    public String sum(List<String> list) {
        String res = "";
        for (String s : list) res += s;
        return res;
    }

}
