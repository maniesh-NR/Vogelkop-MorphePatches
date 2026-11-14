package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class cne {

    @NotNull
    public static final bne Companion = new bne();
    public final mme a;

    public /* synthetic */ cne(int i, mme mmeVar) {
        if (1 == (i & 1)) {
            this.a = mmeVar;
        } else {
            x7d.I(i, 1, ane.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cne) && Intrinsics.a(this.a, ((cne) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
