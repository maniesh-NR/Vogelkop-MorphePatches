package defpackage;

/* loaded from: classes.dex */
public final class dcg extends a5 {
    public final zbg d;
    public int e;
    public s6m f;
    public int g;

    public dcg(zbg zbgVar, int i) {
        super(i, zbgVar.h, (byte) 1);
        this.d = zbgVar;
        this.e = zbgVar.m();
        this.g = -1;
        b();
    }

    public final void a() {
        if (this.e == this.d.m()) {
            return;
        }
        t40.e();
    }

    public final void add(Object obj) {
        a();
        int i = ((a5) this).b;
        zbg zbgVar = this.d;
        zbgVar.add(i, obj);
        ((a5) this).b++;
        ((a5) this).c = zbgVar.d();
        this.e = zbgVar.m();
        this.g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        zbg zbgVar = this.d;
        Object[] objArr = zbgVar.f;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int i = (zbgVar.h - 1) & (-32);
        int i2 = ((a5) this).b;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (zbgVar.d / 5) + 1;
        s6m s6mVar = this.f;
        if (s6mVar == null) {
            this.f = new s6m(objArr, i2, i, i3);
            return;
        }
        ((a5) s6mVar).b = i2;
        ((a5) s6mVar).c = i;
        s6mVar.d = i3;
        Object[] objArr2 = s6mVar.e;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            s6mVar.e = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        s6mVar.f = r0;
        s6mVar.b(i2 - r0, 1);
    }

    public final Object next() {
        a();
        if (!hasNext()) {
            t3p.y();
            return null;
        }
        int i = ((a5) this).b;
        this.g = i;
        s6m s6mVar = this.f;
        zbg zbgVar = this.d;
        if (s6mVar == null) {
            Object[] objArr = zbgVar.g;
            ((a5) this).b = i + 1;
            return objArr[i];
        }
        if (s6mVar.hasNext()) {
            ((a5) this).b++;
            return s6mVar.next();
        }
        Object[] objArr2 = zbgVar.g;
        int i2 = ((a5) this).b;
        ((a5) this).b = i2 + 1;
        return objArr2[i2 - ((a5) s6mVar).c];
    }

    public final Object previous() {
        a();
        if (!hasPrevious()) {
            t3p.y();
            return null;
        }
        int i = ((a5) this).b;
        this.g = i - 1;
        s6m s6mVar = this.f;
        zbg zbgVar = this.d;
        if (s6mVar == null) {
            Object[] objArr = zbgVar.g;
            int i2 = i - 1;
            ((a5) this).b = i2;
            return objArr[i2];
        }
        int i3 = ((a5) s6mVar).c;
        if (i <= i3) {
            ((a5) this).b = i - 1;
            return s6mVar.previous();
        }
        Object[] objArr2 = zbgVar.g;
        int i4 = i - 1;
        ((a5) this).b = i4;
        return objArr2[i4 - i3];
    }

    public final void remove() {
        a();
        int i = this.g;
        if (i == -1) {
            h9o.e();
            return;
        }
        zbg zbgVar = this.d;
        zbgVar.g(i);
        int i2 = this.g;
        if (i2 < ((a5) this).b) {
            ((a5) this).b = i2;
        }
        ((a5) this).c = zbgVar.d();
        this.e = zbgVar.m();
        this.g = -1;
        b();
    }

    public final void set(Object obj) {
        a();
        int i = this.g;
        if (i == -1) {
            h9o.e();
            return;
        }
        zbg zbgVar = this.d;
        zbgVar.set(i, obj);
        this.e = zbgVar.m();
        b();
    }
}
