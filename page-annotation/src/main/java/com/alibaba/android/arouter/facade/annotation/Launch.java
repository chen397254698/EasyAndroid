package com.alibaba.android.arouter.facade.annotation;

import com.alibaba.android.arouter.facade.enums.LaunchType;
import com.alibaba.android.arouter.facade.enums.SwipeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a page can be route by router.
 *
 * @author Alex <a href="mailto:zhilong.liu@aliyun.com">Contact me.</a>
 * @version 1.0
 * @since 16/8/15 下午9:29
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Launch {

    /**
     * Path of route
     */
    String path() default "";

    /**
     * 启动模式
     */
    LaunchType launchType() default LaunchType.STANDARD;

    /**
     * 进入动画
     */
    SwipeType swipeType() default SwipeType.FROM_LEFT;

    /**
     * Used to merger routes, the group name MUST BE USE THE COMMON WORDS !!!
     */
    String group() default "";

    /**
     * Name of route, used to generate javadoc.
     */
    String name() default "";

    /**
     * Extra data, can be set by user.
     * Ps. U should use the integer num sign the switch, by bits. 10001010101010
     */
    int extras() default Integer.MIN_VALUE;

    /**
     * The priority of route.
     */
    int priority() default -1;
}
