package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fz1 implements jx1 {
    public final String a;
    public final String b;
    public final Uri c;
    public final ez1 d;

    public /* synthetic */ fz1(Uri uri, String str, String str2) {
        this(str, str2, uri, ez1.c);
    }

    public fz1(String str, String str2, Uri uri, ez1 ez1Var) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = ez1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz1)) {
            return false;
        }
        fz1 fz1Var = (fz1) obj;
        return Intrinsics.a(this.a, fz1Var.a) && Intrinsics.a(this.b, fz1Var.b) && Intrinsics.a(this.c, fz1Var.c) && this.d == fz1Var.d;
    }

    @Override // defpackage.jx1
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iF = z1m.f(this.a.hashCode() * 31, 31, this.b);
        Uri uri = this.c;
        return this.d.hashCode() + ((iF + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
