package com.claymccoy.pf4jdemo.bjj

import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory
import org.pf4j.Extension
import org.pf4j.Plugin
import org.pf4j.PluginWrapper
import org.pf4j.demo.api.Greeting

class BjjGreetingPlugin(wrapper: PluginWrapper) : Plugin(wrapper) {
    private val logger = LoggerFactory.getLogger(BjjGreetingPlugin::class.java)

    override fun start() {
        logger.info("BjjGreetingPlugin.start()")
        logger.info(StringUtils.upperCase("BjjGreetingPlugin"))
    }

    override fun stop() {
        logger.info("BjjGreetingPlugin.stop()")
    }
}

@Extension
class BjjGreeting : Greeting {
    override fun getGreeting(): String {
        // https://mymmanews.com/what-does-oss-mean-in-regards-to-bjj/
        return "OSS!"
    }
}
