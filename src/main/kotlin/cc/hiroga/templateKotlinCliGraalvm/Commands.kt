package cc.hiroga.templateKotlinCliGraalvm

import com.github.ajalt.clikt.core.CliktCommand

class Command : CliktCommand() {
    override fun run() = Unit
}

class HelloCommand : CliktCommand(name = "hello") {
    override fun run() {
        println("Hello!")
    }
}
