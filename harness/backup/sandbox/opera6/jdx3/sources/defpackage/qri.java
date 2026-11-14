package defpackage;

/* loaded from: classes.dex */
public final class qri {
    public final int a;
    public final byte b;
    public final int c;
    public final int d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public qri(int i, int i2, int i3, int i4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qri)) {
            return false;
        }
        qri qriVar = (qri) obj;
        return this.a == qriVar.a && this.b == qriVar.b && this.c == qriVar.c && this.d == qriVar.d && this.e == qriVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
