package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class cpe {

    @NotNull
    public static final bpe Companion = new bpe();
    public final zoe a;
    public final zoe b;

    public /* synthetic */ cpe(int i, zoe zoeVar, zoe zoeVar2) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, ape.a.getDescriptor());
            throw null;
        }
        this.a = zoeVar;
        this.b = zoeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpe)) {
            return false;
        }
        cpe cpeVar = (cpe) obj;
        return Intrinsics.a(this.a, cpeVar.a) && Intrinsics.a(this.b, cpeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
