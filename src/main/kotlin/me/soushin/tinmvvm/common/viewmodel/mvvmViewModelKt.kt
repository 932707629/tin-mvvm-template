package me.soushin.tinmvvm.common.viewmodel

fun mvvmViewModelKt(
    packageName:String,
    clazz:String,
    lowerPkgName:String,

)="""
package ${packageName}.${lowerPkgName}

import android.app.Application
import me.soushin.tinmvvm.base.BaseViewModel
import ${packageName}.${lowerPkgName}.${clazz}Repository

class ${clazz}ViewModel(application: Application) :
       BaseViewModel<${clazz}Repository>(application,${clazz}Repository()) {

}
"""
