package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f52 extends c52 {
    public final String b;
    public final String c;
    public final Uri d;

    public f52(Uri uri, String str, String str2) {
        super(b52.d);
        this.b = str;
        this.c = str2;
        this.d = uri;
    }

    @Override // defpackage.c52
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f52)) {
            return false;
        }
        f52 f52Var = (f52) obj;
        return Intrinsics.a(this.b, f52Var.b) && Intrinsics.a(this.c, f52Var.c) && Intrinsics.a(this.d, f52Var.d);
    }

    public final int hashCode() {
        int iF = z1m.f(this.b.hashCode() * 31, 31, this.c);
        Uri uri = this.d;
        return iF + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "";
    }
}
