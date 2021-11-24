package me.soushin.template.services

import com.intellij.openapi.project.Project
import me.soushin.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
