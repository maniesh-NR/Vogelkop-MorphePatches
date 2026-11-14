package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vha {
    public final String a;
    public final String b;

    public vha(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vha)) {
            return false;
        }
        vha vhaVar = (vha) obj;
        return Intrinsics.a(this.a, vhaVar.a) && Intrinsics.a(this.b, vhaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sko.l("ActionsV1GetCrashIdHostData(version=", this.a, ", name=", this.b, ")");
    }
}
