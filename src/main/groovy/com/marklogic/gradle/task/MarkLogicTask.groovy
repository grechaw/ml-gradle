package com.marklogic.gradle.task

import org.gradle.api.DefaultTask

import com.marklogic.appdeployer.AppConfig
import com.marklogic.appdeployer.AppDeployer
import com.marklogic.appdeployer.command.CommandContext
import com.marklogic.client.DatabaseClient
import com.marklogic.client.DatabaseClientFactory
import com.marklogic.rest.mgmt.ManageClient
import com.marklogic.rest.mgmt.admin.AdminManager;

/**
 * Base class that provides easy access to all of the resources setup by MarkLogicPlugin.
 */
class MarkLogicTask extends DefaultTask {

    AppConfig getAppConfig() {
        getProject().property("mlAppConfig")
    }

    CommandContext getCommandContext() {
        getProject().property("mlCommandContext")
    }

    ManageClient getManageClient() {
        getProject().property("mlManageClient")
    }

    AppDeployer getAppDeployer() {
        getProject().property("mlAppDeployer")
    }

    AdminManager getAdminManager() {
        getProject().property("mlAdminManager")
    }
    
    DatabaseClient newClient() {
        AppConfig config = getAppConfig()
        return DatabaseClientFactory.newClient(config.host, config.restPort, config.getRestAdminUsername(), config.getRestAdminPassword(), config.authentication)
    }
}
