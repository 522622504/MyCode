package com.example.mycode.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author JimGw
 * @date 2019/06/21
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface CurrentCounter {
}
