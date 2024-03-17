package me.soushin.tinmvvm.common.repository

fun mvvmRepositoryJava(
    packageName:String,
    clazz:String,
    lowerPkgName:String,

)="""
package ${packageName}.${lowerPkgName};

import me.soushin.tinmvvm.base.BaseRepository;

public class ${clazz}Repository extends BaseRepository {
    
    
    
}
"""
