package defpackage;

/* loaded from: classes.dex */
public final class qal {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final nal d;

    public qal(CharSequence charSequence, int i, int i2, nal nalVar) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = nalVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qal)) {
            return false;
        }
        qal qalVar = (qal) obj;
        return this.a.equals(qalVar.a) && this.b == qalVar.b && this.c == qalVar.c && this.d == qalVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
