package me.soushin.tinmvvm.common.viewmodel

fun mvvmViewModelJava(
    packageName:String,
    clazz:String
)="""
package ${packageName}.viewmodel;

import android.app.Application;
import ${packageName}.repository.${clazz}Repository;
import org.jetbrains.annotations.NotNull;
import me.soushin.tinmvvm.base.BaseViewModel;

public class ${clazz}ViewModel extends BaseViewModel<${clazz}Repository> {
    public ${clazz}ViewModel(@NotNull Application application) {
        super(application, new ${clazz}Repository());
    }




}



"""
