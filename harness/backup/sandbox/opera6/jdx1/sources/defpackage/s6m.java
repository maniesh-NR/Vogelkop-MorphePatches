package defpackage;

/* loaded from: classes.dex */
public final class s6m extends a5 {
    public int d;
    public Object[] e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public s6m(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, (byte) 1);
        this.d = i3;
        Object[] objArr2 = new Object[i3];
        this.e = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        return ((Object[]) this.e[this.d - 1])[((a5) this).b & 31];
    }

    public final void b(int i, int i2) {
        int i3 = (this.d - i2) * 5;
        while (i2 < this.d) {
            Object[] objArr = this.e;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[zwg.l(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (zwg.l(((a5) this).b, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(((a5) this).b, ((this.d - 1) - (i2 / 5)) + 1);
        }
    }

    public final Object next() {
        if (!hasNext()) {
            t3p.y();
            return null;
        }
        Object objA = a();
        int i = ((a5) this).b + 1;
        ((a5) this).b = i;
        if (i == ((a5) this).c) {
            this.f = true;
            return objA;
        }
        c(0);
        return objA;
    }

    public final Object previous() {
        if (!hasPrevious()) {
            t3p.y();
            return null;
        }
        ((a5) this).b--;
        if (this.f) {
            this.f = false;
            return a();
        }
        c(31);
        return a();
    }
}
