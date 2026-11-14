package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class n6c {
    public final int a;
    public final List b;
    public final boolean c;
    public final rd3 d;
    public final sd3 e;
    public final d2c f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final p12 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public boolean s;
    public int t = LinearLayoutManager.INVALID_OFFSET;
    public final int[] u;

    public n6c(int i, List list, boolean z, rd3 rd3Var, sd3 sd3Var, d2c d2cVar, int i2, int i3, int i4, long j, Object obj, Object obj2, p12 p12Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = rd3Var;
        this.e = sd3Var;
        this.f = d2cVar;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = p12Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            ifg ifgVar = (ifg) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? ifgVar.b : ifgVar.a;
            iMax = Math.max(iMax, !z2 ? ifgVar.b : ifgVar.a);
        }
        this.m = i5;
        this.r = iMax;
        this.u = new int[this.b.size() << 1];
        if (this.c) {
            this.q = this.g;
            this.o = i5;
            this.n = iMax;
            this.p = 0;
            return;
        }
        this.q = 0;
        this.o = iMax;
        this.n = i5;
        this.p = this.g;
    }

    public final int a() {
        int i;
        int i2;
        if (this.c) {
            i = this.o;
            i2 = this.q;
        } else {
            i = this.n;
            i2 = this.p;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final long b(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.l;
            return this.c ? i2 & 4294967295L : i2 << 32;
        }
        int i3 = i << 1;
        int[] iArr = this.u;
        return (iArr[i3] << 32) | (iArr[i3 + 1] & 4294967295L);
    }

    public final void c(p1d p1dVar) {
        if (this.t == Integer.MIN_VALUE) {
            d8b.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ifg ifgVar = (ifg) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = ifgVar.b;
            } else {
                int i3 = ifgVar.a;
            }
            long jB = b(i);
            sko.s(((see) this.k.a).g(this.i));
            long jC = ybb.c(jB, this.h);
            if (z) {
                p1d.r(p1dVar, ifgVar, jC);
            } else {
                p1d.n(p1dVar, ifgVar, jC);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final void d(int i, int i2, int i3) throws pxb {
        int i4;
        this.l = i;
        boolean z = this.c;
        this.t = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ifg ifgVar = (ifg) list.get(i5);
            int i6 = i5 << 1;
            int[] iArr = this.u;
            if (z) {
                rd3 rd3Var = this.d;
                if (rd3Var == null) {
                    throw o18.k("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = rd3Var.a(ifgVar.a, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = ifgVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                sd3 sd3Var = this.e;
                if (sd3Var == null) {
                    throw o18.k("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = sd3Var.a(ifgVar.b, i3);
                i4 = ifgVar.a;
            }
            i += i4;
        }
    }
}
