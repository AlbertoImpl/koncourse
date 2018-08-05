package com.albertoimpl.koncourse.sdk

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule
import java.io.File

fun generate(path: String, result: Pipeline) {
    val mapper =
            ObjectMapper(YAMLFactory())
                    .registerModule(KotlinModule())
                    .configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true)
    mapper.writeValue(File(path), result)
}