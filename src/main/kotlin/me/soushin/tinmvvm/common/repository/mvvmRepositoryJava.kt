package me.soushin.tinmvvm.common.repository

fun mvvmRepositoryJava(
    packageName:String,
    clazz:String
)="""
package ${packageName}.repository;

import me.soushin.tinmvvm.base.BaseRepository;

public class ${clazz}Repository extends BaseRepository {
    
    
    
}
"""
