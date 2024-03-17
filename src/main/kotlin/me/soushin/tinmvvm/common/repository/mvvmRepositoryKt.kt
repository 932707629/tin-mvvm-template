package me.soushin.tinmvvm.common.repository

fun mvvmRepositoryKt(
    packageName:String,
    clazz:String,
    lowerPkgName:String,

)="""
package ${packageName}.${lowerPkgName}

import me.soushin.tinmvvm.base.BaseRepository

class ${clazz}Repository :BaseRepository(){

}
"""
