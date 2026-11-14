package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class bn2 extends c06 {
    public final Context a;
    public final t55 b;
    public final t55 c;
    public final String d;

    public bn2(Context context, t55 t55Var, t55 t55Var2, String str) {
        if (context == null) {
            t3p.q("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (t55Var == null) {
            t3p.q("Null wallClock");
            throw null;
        }
        this.b = t55Var;
        if (t55Var2 == null) {
            t3p.q("Null monotonicClock");
            throw null;
        }
        this.c = t55Var2;
        if (str != null) {
            this.d = str;
        } else {
            t3p.q("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c06) {
            bn2 bn2Var = (bn2) ((c06) obj);
            if (this.a.equals(bn2Var.a) && this.b.equals(bn2Var.b) && this.c.equals(bn2Var.c) && this.d.equals(bn2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return z1m.l(sb, this.d, "}");
    }
}
