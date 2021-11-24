package me.soushin.tinmvvm.fragment.src.app_package.ui.fragment


fun mvvmFragmentKt(
    applicationPackage: String?,
    fragmentClass: String,
    layoutName: String,
    packageName: String
) = """
package ${packageName}.ui.fragment

import android.os.Bundle
import android.view.View
import ${applicationPackage}.BR
import ${applicationPackage}.R
import ${applicationPackage}.databinding.Fragment${fragmentClass}Binding
import ${applicationPackage}.mvvm.viewmodel.${fragmentClass}ViewModel
import me.soushin.tinmvvm.base.DataBindingFragment
import me.soushin.tinmvvm.config.DataBindingConfig


class ${fragmentClass}Fragment : DataBindingFragment<Fragment${fragmentClass}Binding,${fragmentClass}ViewModel>() {
    companion object {
        fun newInstance():${fragmentClass}Fragment {
            return ${fragmentClass}Fragment()
        }
    }
    
    //配置当前页面的内容 各项参数都可为空
    //BR.xxxxViewModel是kotlin-kapt插件默认生成的 对应xml文件里的xxxxViewModel
    override fun getDataBindingConfig(): DataBindingConfig? {
        return DataBindingConfig(layoutId = R.layout.${layoutName},variableId = BR.${fragmentClass}ViewModel,
            vmClass = ${fragmentClass}ViewModel::class.java)
    }

    override fun initView(view: View,savedInstanceState:Bundle?) {

    }
    
    
}
"""
