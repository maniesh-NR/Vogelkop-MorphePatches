package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sun {
    public final run a;
    public final String b;

    public sun(run runVar, String str) {
        this.a = runVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sun)) {
            return false;
        }
        sun sunVar = (sun) obj;
        return this.a.equals(sunVar.a) && Intrinsics.a(this.b, sunVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "WebPage(source=" + this.a + ", initScript=" + this.b + ")";
    }
}
