package com.yoyiyi.soleil.binding.event;

/**
 * 类名：Comsumer
 * 描述：TODO
 * 时间：2019/8/16 15:45
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 * @version 1.0
 */
public interface Consumer<T> {

    void accept(T t) throws Exception;

}
