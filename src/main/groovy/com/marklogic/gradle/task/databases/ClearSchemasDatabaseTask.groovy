package com.marklogic.gradle.task.databases

import org.gradle.api.tasks.TaskAction

import com.marklogic.gradle.task.MarkLogicTask
import com.rjrudin.marklogic.mgmt.databases.DatabaseManager

class ClearSchemasDatabaseTask extends MarkLogicTask {

    @TaskAction
    void clearModules() {
        println "Clearing all documents in schemas database"
        DatabaseManager mgr = new DatabaseManager(getManageClient())
        mgr.clearDatabase(getAppConfig().getSchemasDatabaseName())
        println "Finished clearing all documents in schemas database"
    }
}
