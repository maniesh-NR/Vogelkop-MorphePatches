package app.template.patches.opera.ads

import app.morphe.patcher.patch.PatchException
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.opera.OPERA_BETA_COMPATIBILITY
import app.template.patches.opera.OPERA_COMPATIBILITY
import app.template.patches.opera.shared.replaceStringConstants

/**
 * Opera's start page embeds "suggested sites" — sponsored Speed Dial tiles and
 * partner tiles that sync from Opera's partner catalogue into a Room database
 * (`com.opera.android.suggested_sites.SuggestedSitesDatabase`) with the tables
 * `partner_data`, `partner_tree` and `domain_data`.
 *
 * The DAO lambda that refreshes/reads the database contains three SQL queries:
 *
 *   SELECT * FROM partner_data
 *   SELECT * FROM partner_tree LIMIT 1
 *   SELECT * FROM domain_data
 *
 * (verified identical in Opera 103.3.5234.91185 and Opera Beta 104.0.5262.91143)
 *
 * The patch appends `WHERE 0` to each query, so the tables always read as empty:
 * no sponsored tiles are ever shown, while the database schema stays intact and
 * the sync/insert code keeps running harmlessly.
 */
@Suppress("unused")
val operaRemoveSponsoredSpeedDialPatch = bytecodePatch(
    name = "Remove sponsored Speed Dial",
    description = "Stops sponsored/partner tiles from appearing on the start page " +
        "by making Opera's suggested-sites database queries return no rows. " +
        "Regular Speed Dial entries and bookmarks are not affected.",
    default = true,
) {
    compatibleWith(OPERA_COMPATIBILITY, OPERA_BETA_COMPATIBILITY)

    execute {
        val sqlReplacements = mapOf(
            "SELECT * FROM partner_data" to "SELECT * FROM partner_data WHERE 0",
            "SELECT * FROM partner_tree LIMIT 1" to "SELECT * FROM partner_tree WHERE 0 LIMIT 1",
            "SELECT * FROM domain_data" to "SELECT * FROM domain_data WHERE 0",
        )

        var patched = 0
        classDefForEach { classDef ->
            val mutableClass = mutableClassDefByOrNull(classDef.type) ?: return@classDefForEach
            for (method in mutableClass.methods) {
                patched += method.replaceStringConstants(sqlReplacements)
            }
        }

        if (patched < sqlReplacements.size) {
            throw PatchException(
                "Expected ${sqlReplacements.size} suggested-sites SQL constants, " +
                    "found $patched. Is this an unsupported Opera version?",
            )
        }

        println("Opera sponsored Speed Dial: neutralized $patched SQL query(ies).")
    }
}
