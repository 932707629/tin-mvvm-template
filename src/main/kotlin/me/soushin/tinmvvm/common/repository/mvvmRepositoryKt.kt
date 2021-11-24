package me.soushin.tinmvvm.common.repository

fun mvvmRepositoryKt(
    packageName:String,
    clazz:String
)="""
package ${packageName}.repository

import me.soushin.tinmvvm.base.BaseRepository

class ${clazz}Repository :BaseRepository(){

}
"""
