package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class osj {
    public final String a;
    public final String b;
    public final ksj c;

    public osj(String str, String str2, ksj ksjVar) {
        this.a = str;
        this.b = str2;
        this.c = ksjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || osj.class != obj.getClass()) {
            return false;
        }
        osj osjVar = (osj) obj;
        return this.a.equals(osjVar.a) && Intrinsics.a(this.b, osjVar.b) && this.c == osjVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + 1237) * 31);
    }
}
