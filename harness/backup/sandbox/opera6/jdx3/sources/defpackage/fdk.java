package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class fdk {

    @NotNull
    public static final edk Companion = new edk();
    public final v3f a;
    public final ebb b;

    public /* synthetic */ fdk(int i, v3f v3fVar, ebb ebbVar) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, ddk.a.getDescriptor());
            throw null;
        }
        this.a = v3fVar;
        this.b = ebbVar;
    }

    public fdk(v3f v3fVar, ebb ebbVar) {
        this.a = v3fVar;
        this.b = ebbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdk)) {
            return false;
        }
        fdk fdkVar = (fdk) obj;
        return Intrinsics.a(this.a, fdkVar.a) && Intrinsics.a(this.b, fdkVar.b);
    }

    public final int hashCode() {
        v3f v3fVar = this.a;
        int iHashCode = (v3fVar == null ? 0 : v3fVar.hashCode()) * 31;
        ebb ebbVar = this.b;
        return iHashCode + (ebbVar != null ? ebbVar.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
