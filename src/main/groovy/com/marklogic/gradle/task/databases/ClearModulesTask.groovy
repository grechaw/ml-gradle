package com.marklogic.gradle.task.databases

import org.gradle.api.tasks.TaskAction

import com.marklogic.gradle.task.MarkLogicTask
import com.marklogic.rest.mgmt.databases.DatabaseManager

class ClearModulesTask extends MarkLogicTask {

    @TaskAction
    void clearModules() {
        println "Clearing modules database"
        new DatabaseManager(getManageClient()).clearDatabase(getAppConfig().getModulesDatabaseName())
        println "Finished clearing modules database"
    }
}
