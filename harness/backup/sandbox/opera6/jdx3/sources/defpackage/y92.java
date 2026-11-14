package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y92 extends w92 {
    public final Uri a;
    public final String b;
    public final String c;
    public final z92 d;

    public y92(z92 z92Var, Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = z92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y92)) {
            return false;
        }
        y92 y92Var = (y92) obj;
        return Intrinsics.a(this.a, y92Var.a) && Intrinsics.a(this.b, y92Var.b) && Intrinsics.a(this.c, y92Var.c) && Intrinsics.a(this.d, y92Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
