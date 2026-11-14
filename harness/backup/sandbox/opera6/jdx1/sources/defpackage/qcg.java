package defpackage;

/* loaded from: classes.dex */
public final class qcg {
    public final long a;
    public final boolean b;
    public final float c;
    public final ikl d;
    public final ikl e;
    public final fsf f;
    public final fef g;
    public final boolean h;

    public qcg(long j, boolean z, float f, ikl iklVar, ikl iklVar2, fsf fsfVar, fef fefVar, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = f;
        this.d = iklVar;
        this.e = iklVar2;
        this.f = fsfVar;
        this.g = fefVar;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcg)) {
            return false;
        }
        qcg qcgVar = (qcg) obj;
        long j = qcgVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && this.b == qcgVar.b && gh7.b(this.c, qcgVar.c) && this.d.equals(qcgVar.d) && this.e.equals(qcgVar.e) && this.f == qcgVar.f && this.g == qcgVar.g && this.h == qcgVar.h;
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + fki.l(this.e, fki.l(this.d, sko.d(this.c, fki.k(Long.hashCode(this.a) * 31, 31, this.b), 31), 961), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
