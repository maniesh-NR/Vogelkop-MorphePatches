package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m01 {
    public final yv a;
    public final String b;
    public final String c;
    public final byte d;

    static {
        yv yvVar = yv.b;
    }

    public m01(yv yvVar, String str, String str2, int i) {
        this(yvVar, str, str2, i, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m01(yv yvVar, String str, String str2, int i, long j) {
        this.a = yvVar;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m01.class != obj.getClass()) {
            return false;
        }
        m01 m01Var = (m01) obj;
        return this.d == m01Var.d && Objects.equals(this.a, m01Var.a) && Objects.equals(this.b, m01Var.b) && Objects.equals(this.c, m01Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, null, this.b, this.c, Integer.valueOf(this.d));
    }
}
