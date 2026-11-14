package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tch {
    public final String a;

    public tch(String str) {
        sch schVar = sch.a;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tch)) {
            return false;
        }
        sch schVar = sch.a;
        return Intrinsics.a(this.a, ((tch) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (sch.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
