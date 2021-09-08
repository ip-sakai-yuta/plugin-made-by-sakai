package com.github.ipsakaiyuta.pluginmadebysakai.services

import com.intellij.openapi.project.Project
import com.github.ipsakaiyuta.pluginmadebysakai.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
