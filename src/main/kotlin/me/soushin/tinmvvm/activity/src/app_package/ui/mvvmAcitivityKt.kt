
package me.soushin.tinmvvm.activity.src.app_package.ui

fun mvvmActivityKt(
    applicationPackage:String?,
    activityClass:String,
    layoutName:String,
    packageName:String
)="""
package ${packageName}.ui

import android.os.Bundle
import ${applicationPackage}.BR
import ${applicationPackage}.R
import ${applicationPackage}.databinding.Activity${activityClass}Binding
import ${applicationPackage}.mvvm.viewmodel.${activityClass}ViewModel
import me.soushin.tinmvvm.base.DataBindingActivity
import me.soushin.tinmvvm.config.DataBindingConfig


class ${activityClass}Activity : DataBindingActivity<Activity${activityClass}Binding,${activityClass}ViewModel>() {

    //配置当前页面的内容 各项参数都可为空
    //BR.xxxxViewModel是kotlin-kapt插件默认生成的 对应xml文件里的xxxxViewModel
    override fun getDataBindingConfig(): DataBindingConfig? {
        return DataBindingConfig(layoutId = R.layout.${layoutName},variableId = BR.${activityClass}ViewModel,
        vmClass = ${activityClass}ViewModel::class.java);
    }
    
    override fun initView(savedInstanceState:Bundle?) {

    }

    
    } 
"""
