group = "app.morphe.patches.opera"

patches {
    about {
        name = "Morphe Patches for Opera"
        description = "De-ads Opera Browser, Opera Beta and Opera GX: removes " +
            "sponsored Speed Dial tiles, disables the hidden Acceptable-Ads " +
            "partner whitelists and stops third-party ad modules from loading."
        source = "https://github.com/maniesh-NR/Vogelkop-MophePatches"
        author = "maniesh-NR"
        contact = "https://github.com/maniesh-NR/Vogelkop-MophePatches"
        website = "https://morphe.software/"
        license = "GPLv3"
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}
