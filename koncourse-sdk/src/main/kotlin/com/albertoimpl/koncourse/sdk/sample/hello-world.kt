package com.albertoimpl.koncourse.sdk.sample

import com.albertoimpl.koncourse.sdk.*

fun main(args: Array<String>) {
    val result = Pipeline(
            listOf(
                    Job("hello-world",
                            listOf(
                                    Plan("say-hello",
                                            Config("linux",
                                                    ImageResource("docker-image", Repository("alpine")),
                                                    Run("echo", listOf("Hello, world!"))
                                            )
                                    )
                            )
                    )
            )
    )

    generate("hello-world.yml", result)
}