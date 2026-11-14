package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class ajk {

    @NotNull
    public static final zik Companion = new zik();
    public final String a;
    public final String b;

    public /* synthetic */ ajk(int i, String str, String str2) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, yik.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public ajk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajk)) {
            return false;
        }
        ajk ajkVar = (ajk) obj;
        return Intrinsics.a(this.a, ajkVar.a) && Intrinsics.a(this.b, ajkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sko.l("Field(name=", this.a, ", type=", this.b, ")");
    }
}
