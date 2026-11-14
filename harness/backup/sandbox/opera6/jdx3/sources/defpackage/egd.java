package defpackage;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
public final class egd {
    public final re7 a;
    public final Uri b;
    public final String c;
    public final int d;
    public final int e;

    public egd(Uri uri) {
        this(uri, null, Integer.MIN_VALUE);
    }

    public egd(Uri uri, String str, int i) {
        this.a = null;
        this.b = uri;
        this.c = str;
        this.d = -1;
        this.e = i;
    }

    public egd(re7 re7Var) {
        this.a = re7Var;
        this.b = null;
        this.c = re7Var.m;
        this.d = -1;
        this.e = Integer.MIN_VALUE;
    }

    public egd(re7 re7Var, Uri uri, String str, int i, int i2) {
        this.a = re7Var;
        this.b = uri;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public final String a() {
        re7 re7Var = this.a;
        if (re7Var != null) {
            return re7Var.f();
        }
        Uri uriC = c();
        String lastPathSegment = uriC.getLastPathSegment();
        return lastPathSegment == null ? uriC.toString() : lastPathSegment;
    }

    public final o29 b() {
        return c5o.m().o(c().toString(), this.c);
    }

    public final Uri c() {
        re7 re7Var = this.a;
        return re7Var == null ? this.b : re7Var.k() ? re7Var.e().i() : Uri.parse(re7Var.t.getUrl());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && egd.class == obj.getClass()) {
            egd egdVar = (egd) obj;
            if (this.d == egdVar.d && this.e == egdVar.e && this.a == egdVar.a && Objects.equals(this.b, egdVar.b) && Objects.equals(this.c, egdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e));
    }
}
