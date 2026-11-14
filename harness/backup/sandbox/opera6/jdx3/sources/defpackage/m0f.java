package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0f {
    public final String a;
    public final String b;

    public m0f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0f)) {
            return false;
        }
        m0f m0fVar = (m0f) obj;
        return this.a.equals(m0fVar.a) && Intrinsics.a(this.b, m0fVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return sko.l("Button(text=", this.a, ", link=", this.b, ")");
    }
}
