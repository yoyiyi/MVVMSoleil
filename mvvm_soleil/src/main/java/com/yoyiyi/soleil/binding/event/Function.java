package com.yoyiyi.soleil.binding.event;

import androidx.annotation.NonNull;

/**
 * 类名：Function
 * 描述：TODO
 * 时间：2019/8/16 15:44
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 * @version 1.0
 */
public interface Function<T, R> {

    R call(@NonNull T t);
}
