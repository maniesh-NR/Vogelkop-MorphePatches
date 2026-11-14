package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class vn9 {
    public final hyl a;
    public iyl d;
    public bv6 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final oj9 j;
    public boolean m;
    public final dyl b = new dyl();
    public final g1g c = new g1g();
    public final g1g k = new g1g(1);
    public final g1g l = new g1g();

    public vn9(hyl hylVar, iyl iylVar, bv6 bv6Var, oj9 oj9Var) {
        this.a = hylVar;
        this.d = iylVar;
        this.e = bv6Var;
        this.j = oj9Var;
        this.d = iylVar;
        this.e = bv6Var;
        hylVar.g(oj9Var);
        e();
    }

    public final int a() {
        int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i | 1073741824 : i;
    }

    public final cyl b() {
        if (!this.m) {
            return null;
        }
        dyl dylVar = this.b;
        bv6 bv6Var = dylVar.a;
        String str = tym.a;
        int i = bv6Var.a;
        cyl cylVar = dylVar.m;
        if (cylVar == null) {
            cylVar = this.d.a.l[i];
        }
        if (cylVar == null || !cylVar.a) {
            return null;
        }
        return cylVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        g1g g1gVar;
        cyl cylVarB = b();
        if (cylVarB == null) {
            return 0;
        }
        int length = cylVarB.d;
        dyl dylVar = this.b;
        if (length != 0) {
            g1gVar = dylVar.n;
        } else {
            byte[] bArr = cylVarB.e;
            String str = tym.a;
            int length2 = bArr.length;
            g1g g1gVar2 = this.l;
            g1gVar2.L(bArr, length2);
            length = bArr.length;
            g1gVar = g1gVar2;
        }
        boolean z = dylVar.k && dylVar.l[this.f];
        boolean z2 = z || i2 != 0;
        g1g g1gVar3 = this.k;
        g1gVar3.a[0] = (byte) ((z2 ? NotificationCompat.FLAG_HIGH_PRIORITY : 0) | length);
        g1gVar3.N(0);
        hyl hylVar = this.a;
        hylVar.b(g1gVar3, 1, 1);
        hylVar.b(g1gVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        g1g g1gVar4 = this.c;
        if (!z) {
            g1gVar4.K(8);
            byte[] bArr2 = g1gVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            hylVar.b(g1gVar4, 8, 1);
            return length + 9;
        }
        g1g g1gVar5 = dylVar.n;
        int iH = g1gVar5.H();
        g1gVar5.O(-2);
        int i3 = (iH * 6) + 2;
        if (i2 != 0) {
            g1gVar4.K(i3);
            byte[] bArr3 = g1gVar4.a;
            g1gVar5.k(bArr3, 0, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            g1gVar4 = g1gVar5;
        }
        hylVar.b(g1gVar4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
        dyl dylVar = this.b;
        dylVar.d = 0;
        dylVar.p = 0L;
        dylVar.q = false;
        dylVar.k = false;
        dylVar.o = false;
        dylVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
