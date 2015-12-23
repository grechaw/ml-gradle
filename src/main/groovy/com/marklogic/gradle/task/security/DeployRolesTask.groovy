package com.marklogic.gradle.task.security

import org.gradle.api.tasks.TaskAction

import com.marklogic.gradle.task.MarkLogicTask

class DeployRolesTask extends MarkLogicTask {

    @TaskAction
    void deployRoles() {
        invokeDeployerCommandWithClassName("DeployRolesCommand")
    }
}
