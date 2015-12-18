package com.lgw.androidh5;

/**
 * Created by Administrator on 2015/12/19.
 */
public class Singleton {
    private static Fragment_one one;
    private static Fragment_two two;
    private static Fragment_three three;
    private static Fragment_four four;

    private Singleton() {
    }

    public static synchronized Fragment_one getOne() {
        if (one == null) {
            one = new Fragment_one();
        }
        return one;
    }

    public static synchronized Fragment_two getTwo() {
        if (two == null) {
            two = new Fragment_two();
        }
        return two;
    }

    public static synchronized Fragment_three getThree() {
        if (three == null) {
            three = new Fragment_three();
        }
        return three;
    }

    public static synchronized Fragment_four getFour() {
        if (four == null) {
            four = new Fragment_four();
        }
        return four;
    }
}
