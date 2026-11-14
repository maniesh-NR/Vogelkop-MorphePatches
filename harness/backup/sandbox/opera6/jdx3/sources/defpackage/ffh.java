package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ffh implements gfh {
    public final hmi a;

    public ffh(hmi hmiVar) {
        this.a = hmiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffh) && Intrinsics.a(this.a, ((ffh) obj).a);
    }

    public final int hashCode() {
        hmi hmiVar = this.a;
        if (hmiVar == null) {
            return 0;
        }
        return hmiVar.hashCode();
    }

    public final String toString() {
        return "";
    }
}
