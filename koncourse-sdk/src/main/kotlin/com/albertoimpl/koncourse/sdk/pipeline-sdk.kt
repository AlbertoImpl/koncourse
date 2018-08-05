package com.albertoimpl.koncourse.sdk


data class Run(var path: String, var args: List<String>)
data class Repository(var repository: String)
data class ImageResource(var type: String, var source: Repository)
data class Config(var platform: String, var image_resource: ImageResource, var run: Run)
data class Plan(var task: String, var config: Config)
data class Job(var name: String, var plan: List<Plan>)
data class Pipeline(var jobs: List<Job>)