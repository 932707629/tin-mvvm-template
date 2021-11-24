
package me.soushin.tinmvvm.activity.src.app_package.ui

fun mvvmActivityJava(
    applicationPackage:String?,
    activityClass:String,
    layoutName:String,
    packageName:String
)="""
package ${packageName}.ui;

import android.os.Bundle;
import ${applicationPackage}.BR;
import ${applicationPackage}.R;
import ${applicationPackage}.databinding.Activity${activityClass}Binding;
import ${applicationPackage}.mvvm.viewmodel.${activityClass}ViewModel;
import org.jetbrains.annotations.Nullable;
import me.soushin.tinmvvm.base.DataBindingActivity;
import me.soushin.tinmvvm.config.DataBindingConfig;

public class ${activityClass}Activity extends DataBindingActivity<Activity${activityClass}Binding,${activityClass}ViewModel> {
    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        
    }

    @Nullable
    @Override
    public DataBindingConfig getDataBindingConfig() {
        return new DataBindingConfig(R.layout.${layoutName}, BR.${activityClass}ViewModel,${activityClass}ViewModel.class);
    }
    
}
"""
