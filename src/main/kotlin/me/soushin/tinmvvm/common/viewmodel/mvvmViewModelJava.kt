package me.soushin.tinmvvm.common.viewmodel

fun mvvmViewModelJava(
    packageName:String,
    clazz:String,
    lowerPkgName:String,
)="""
package ${packageName}.${lowerPkgName};

import android.app.Application;
import ${packageName}.${lowerPkgName}.${clazz}Repository;
import org.jetbrains.annotations.NotNull;
import me.soushin.tinmvvm.base.BaseViewModel;

public class ${clazz}ViewModel extends BaseViewModel<${clazz}Repository> {
    public ${clazz}ViewModel(@NotNull Application application) {
        super(application, new ${clazz}Repository());
    }




}



"""
