package cc.hiroga.templateKotlinCliGraalvm

import com.github.ajalt.clikt.core.subcommands

fun main(args: Array<String>) {
    Command().subcommands(HelloCommand()).main(args)
}
