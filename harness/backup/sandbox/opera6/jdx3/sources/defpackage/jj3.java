package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jj3 {
    public final Uri a;
    public final String b;
    public final wx c;

    public jj3(Uri uri, String str, wx wxVar) {
        this.a = uri;
        this.b = str;
        this.c = wxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jj3) {
            jj3 jj3Var = (jj3) obj;
            return Intrinsics.a(this.a, jj3Var.a) && Intrinsics.a(this.b, jj3Var.b) && this.c == jj3Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
