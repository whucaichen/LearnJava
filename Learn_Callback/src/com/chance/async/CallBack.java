package com.chance.async;

/**
 * 这是一个回调接口
 * @author xiaanming
 *
 */
public interface CallBack {
    /**
     * 这个是小李知道答案时要调用的函数告诉小王，也就是回调函数
     * @param result 是答案
     */
    public void solve(String result);
}
/*
JAVA的CALLBACK通过接口来实现。
例：
1.class A,class B
2.class A实现接口operate
3.class B拥有一个参数为operate接口类型的函数test(operate o)
4.class A运行时调用class B中test函数,以自身传入参数
5.class B已取得A，就可以随时回调A所实现的operate接口中的方法
 */