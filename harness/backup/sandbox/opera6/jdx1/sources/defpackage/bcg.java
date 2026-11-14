package defpackage;

/* loaded from: classes.dex */
public final class bcg extends a5 {
    public final Object[] d;
    public final s6m e;

    public bcg(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2, (byte) 1);
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new s6m(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public final Object next() {
        if (!hasNext()) {
            t3p.y();
            return null;
        }
        s6m s6mVar = this.e;
        if (s6mVar.hasNext()) {
            ((a5) this).b++;
            return s6mVar.next();
        }
        int i = ((a5) this).b;
        ((a5) this).b = i + 1;
        return this.d[i - ((a5) s6mVar).c];
    }

    public final Object previous() {
        if (!hasPrevious()) {
            t3p.y();
            return null;
        }
        int i = ((a5) this).b;
        s6m s6mVar = this.e;
        int i2 = ((a5) s6mVar).c;
        if (i <= i2) {
            ((a5) this).b = i - 1;
            return s6mVar.previous();
        }
        int i3 = i - 1;
        ((a5) this).b = i3;
        return this.d[i3 - i2];
    }
}
