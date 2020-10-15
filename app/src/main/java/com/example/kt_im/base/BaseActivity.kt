package com.example.kt_im.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        init();
    }

    open fun init() {
        //初始化公共的功能 子类可以复写

    }

    //子类实现方法返回布局ID
    abstract fun getLayoutResId(): Int
}