package com.foolishpuma.helloworld.ws.ping

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingWSController {

    @RequestMapping("/ping")
    fun ping(): Boolean {
        return true
    }

    @RequestMapping("/ping2")
    fun ping2(): Boolean {
        return false
    }
}