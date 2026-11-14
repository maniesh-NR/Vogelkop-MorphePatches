package defpackage;

/* loaded from: classes.dex */
public final class jrd {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public jrd(int i, long j, Object obj) {
        this(obj, j, -1, -1, i);
    }

    public jrd(long j, Object obj) {
        this(obj, j, -1, -1, -1);
    }

    public jrd(Object obj) {
        this(-1L, obj);
    }

    public jrd(Object obj, long j, int i, int i2, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final jrd a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new jrd(obj, this.d, this.b, this.c, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrd)) {
            return false;
        }
        jrd jrdVar = (jrd) obj;
        return this.a.equals(jrdVar.a) && this.b == jrdVar.b && this.c == jrdVar.c && this.d == jrdVar.d && this.e == jrdVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}
