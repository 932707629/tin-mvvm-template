package me.soushin.tinmvvm.common.viewmodel

fun mvvmViewModelKt(
    packageName:String,
    clazz:String
)="""
package ${packageName}.viewmodel

import android.app.Application
import me.soushin.tinmvvm.base.BaseViewModel
import ${packageName}.repository.${clazz}Repository

class ${clazz}ViewModel(application: Application) :
       BaseViewModel<${clazz}Repository>(application,${clazz}Repository()) {

}
"""
