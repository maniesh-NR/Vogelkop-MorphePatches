package defpackage;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zip {
    public final String a;
    public final int b;
    public final long c = SystemClock.elapsedRealtime();

    public zip(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zip)) {
            return false;
        }
        zip zipVar = (zip) obj;
        return Intrinsics.a(this.a, zipVar.a) && this.b == zipVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BpisStateOnAdRequested(bundle=");
        sb.append(this.a);
        sb.append(", status=");
        return fki.s(sb, this.b, ')');
    }
}
