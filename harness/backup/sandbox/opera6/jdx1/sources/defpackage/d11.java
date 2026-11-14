package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d11 {
    public final long a;
    public final gql b;
    public final int c;
    public final jrd d;
    public final long e;
    public final gql f;
    public final int g;
    public final jrd h;
    public final long i;
    public final long j;

    public d11(long j, gql gqlVar, int i, jrd jrdVar, long j2, gql gqlVar2, int i2, jrd jrdVar2, long j3, long j4) {
        this.a = j;
        this.b = gqlVar;
        this.c = i;
        this.d = jrdVar;
        this.e = j2;
        this.f = gqlVar2;
        this.g = i2;
        this.h = jrdVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d11.class != obj.getClass()) {
            return false;
        }
        d11 d11Var = (d11) obj;
        return this.a == d11Var.a && this.c == d11Var.c && this.e == d11Var.e && this.g == d11Var.g && this.i == d11Var.i && this.j == d11Var.j && this.b.equals(d11Var.b) && Objects.equals(this.d, d11Var.d) && Objects.equals(this.f, d11Var.f) && Objects.equals(this.h, d11Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
