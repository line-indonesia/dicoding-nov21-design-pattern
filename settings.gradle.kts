enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "medan-perang-tidak-diketahui"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("kt", "1.5.31")
            alias("kt-test").to("org.jetbrains.kotlin", "kotlin-test").versionRef("kt")
        }
    }
}