package com.github.lntcs.autoresizedrawable.services

import com.intellij.openapi.project.Project
import com.github.lntcs.autoresizedrawable.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
