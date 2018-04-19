package com.piggsoft.fastpigg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FastPiggApplication

fun main(args: Array<String>) {
    runApplication<FastPiggApplication>(*args)
}
