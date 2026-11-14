package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public class d93 {
    public final yla a;
    public final long b;
    public final String c;

    public d93(yla ylaVar, long j, String str) {
        this.a = ylaVar;
        this.b = j;
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d93 d93Var = (d93) obj;
        return this.b == d93Var.b && this.a.equals(d93Var.a) && Objects.equals(this.c, d93Var.c);
    }

    public int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), this.c);
    }
}
