package app.template.patches.opera.shared

import app.morphe.patcher.util.proxy.mutableTypes.MutableMethod
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21c
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction31c
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction21c
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction31c
import com.android.tools.smali.dexlib2.iface.reference.StringReference
import com.android.tools.smali.dexlib2.immutable.reference.ImmutableStringReference

/**
 * Replaces `const-string` constants in a method by exact string match.
 *
 * Uses only the raw dexlib2 builder API (no dependence on patcher extension
 * names), so it keeps working even if the Morphe patcher DSL changes surface
 * names. Both `const-string` (21c) and `const-string/jumbo` (31c) formats are
 * handled. Instruction indices are not shifted because the replacement has the
 * same format as the original instruction.
 *
 * @return the number of string constants replaced.
 */
fun MutableMethod.replaceStringConstants(replacements: Map<String, String>): Int {
    val implementation = implementation ?: return 0
    if (replacements.isEmpty()) return 0

    data class PendingReplacement(
        val index: Int,
        val register: Int,
        val opcode: Opcode,
        val value: String,
    )

    val pending = mutableListOf<PendingReplacement>()
    for ((index, instruction) in implementation.instructions.withIndex()) {
        if (instruction !is Instruction21c && instruction !is Instruction31c) continue

        val reference = (instruction as ReferenceInstruction).reference as? StringReference
            ?: continue
        val replacement = replacements[reference.string] ?: continue

        pending += PendingReplacement(
            index = index,
            register = (instruction as OneRegisterInstruction).registerA,
            opcode = instruction.opcode,
            value = replacement,
        )
    }

    for (replacement in pending) {
        val newInstruction = if (replacement.opcode == Opcode.CONST_STRING_JUMBO) {
            BuilderInstruction31c(
                replacement.opcode,
                replacement.register,
                ImmutableStringReference(replacement.value),
            )
        } else {
            BuilderInstruction21c(
                replacement.opcode,
                replacement.register,
                ImmutableStringReference(replacement.value),
            )
        }
        implementation.replaceInstruction(replacement.index, newInstruction)
    }

    return pending.size
}
