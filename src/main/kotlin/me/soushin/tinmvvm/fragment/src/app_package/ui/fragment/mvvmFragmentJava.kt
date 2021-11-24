package me.soushin.tinmvvm.fragment.src.app_package.ui.fragment


fun mvvmFragmentJava(
    applicationPackage: String?,
    fragmentClass: String,
    layoutName: String,
    packageName: String
) = """
package ${packageName}.ui.fragment;

import android.os.Bundle;
import android.view.View;
import ${applicationPackage}.BR;
import ${applicationPackage}.R;
import ${applicationPackage}.databinding.Fragment${fragmentClass}Binding;
import ${applicationPackage}.mvvm.viewmodel.${fragmentClass}ViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import me.soushin.tinmvvm.base.DataBindingFragment;
import me.soushin.tinmvvm.config.DataBindingConfig;


public class ${fragmentClass}Fragment extends DataBindingFragment<Fragment${fragmentClass}Binding, ${fragmentClass}ViewModel> {

    @Override
    public void initView(@NotNull View view, @Nullable Bundle savedInstanceState) {

    }

    //配置当前页面的内容 各项参数都可为空
    //BR.xxxxViewModel是kotlin-kapt插件默认生成的 对应xml文件里的xxxxViewModel
    @Nullable
    @Override
    public DataBindingConfig getDataBindingConfig() {
        //演示addBindingParam()的用法
        return new DataBindingConfig(R.layout.${layoutName}, BR.${fragmentClass}ViewModel,${fragmentClass}ViewModel.class);
    }

    public static ${fragmentClass}Fragment newInstance(){
        return new ${fragmentClass}Fragment();
    }
    
    
}
"""
