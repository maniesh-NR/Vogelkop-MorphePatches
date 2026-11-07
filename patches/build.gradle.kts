group = "app.morphe.patches.opera"

patches {
    about {
        name = "Morphe Patches for Opera"
        description = "De-ads Opera Browser, Opera Beta and Opera GX: removes " +
            "sponsored Speed Dial tiles, disables the hidden Acceptable-Ads " +
            "partner whitelists and stops third-party ad modules from loading."
        source = "https://github.com/maniesh-NR/Vogelkop-MorphePatches"
        author = "maniesh-NR"
        contact = "https://github.com/maniesh-NR/Vogelkop-MorphePatches"
        website = "https://morphe.software/add-source?github=maniesh-NR/Vogelkop-MorphePatches"
        license = "AGPL-3.0"
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}

// Separate configuration so gson is available at runtime for the
// generatePatchesList task but never bundled into the APK.
val patchListGeneratorClasspath: Configuration by configurations.creating

dependencies {
    compileOnly(libs.gson)
    patchListGeneratorClasspath(libs.gson)
}

tasks {
    register<JavaExec>("generatePatchesList") {
        description = "Generates patches-list.json from the compiled patches bundle"

        dependsOn(build)

        classpath = sourceSets["main"].runtimeClasspath + patchListGeneratorClasspath
        mainClass.set("util.PatchListGeneratorKt")
    }
}
