package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yt5 {
    public final String a;
    public final String b;
    public final Double c;
    public final Uri d;

    public yt5(String str, String str2, Double d, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt5)) {
            return false;
        }
        yt5 yt5Var = (yt5) obj;
        return Intrinsics.a(this.a, yt5Var.a) && Intrinsics.a(this.b, yt5Var.b) && Intrinsics.a(this.c, yt5Var.c) && Intrinsics.a(this.d, yt5Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        return this.d.hashCode() + ((iHashCode2 + (d != null ? d.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
