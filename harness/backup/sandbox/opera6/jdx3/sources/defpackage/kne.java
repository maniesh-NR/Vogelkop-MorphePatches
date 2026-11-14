package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class kne {

    @NotNull
    public static final jne Companion = new jne();
    public static final l4c[] c = {null, z4c.a(f7c.b, new vme(7))};
    public final npc a;
    public final List b;

    public /* synthetic */ kne(int i, npc npcVar, List list) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, ine.a.getDescriptor());
            throw null;
        }
        this.a = npcVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kne)) {
            return false;
        }
        kne kneVar = (kne) obj;
        return Intrinsics.a(this.a, kneVar.a) && Intrinsics.a(this.b, kneVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
