package stepdefs.hook

import webservice.mock.MockService

import static cucumber.api.groovy.Hooks.World

/**
 * Created by zhangd on 28/08/2017.
 * World hook for MockService
 */
World {
    new MockService()
}
