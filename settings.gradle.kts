rootProject.name = "spring-bean-creation-deadlock-test"

include(
    ":application-spring-boot-337",
)

project(":application-spring-boot-337").projectDir = file("application/sb-337")
