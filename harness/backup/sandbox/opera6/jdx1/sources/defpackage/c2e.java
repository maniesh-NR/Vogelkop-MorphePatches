package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c2e {
    public final String a;
    public final String b;

    public c2e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2e)) {
            return false;
        }
        c2e c2eVar = (c2e) obj;
        return Intrinsics.a(this.a, c2eVar.a) && Intrinsics.a(this.b, c2eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sko.l("MissionInfoUiState(title=", this.a, ", message=", this.b, ")");
    }
}
