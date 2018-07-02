package com.huiwenyuan.effectivejava.directories.lesson3.section10;

/**
 * 慧文院
 * 等价关系性质之对称性
 *
 */
public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {

        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equals(s);
    }

    public static void main(String args[]) {
        CaseInsensitiveString s1 = new CaseInsensitiveString("helloworld");
        CaseInsensitiveString s2 = new CaseInsensitiveString("helloworld");

        System.out.println(s1.equals(s2));
    }
}
