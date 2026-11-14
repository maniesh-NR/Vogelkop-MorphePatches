package defpackage;

import androidx.core.app.NotificationCompat;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zz4 {
    public final vv2 a;
    public final hyl b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public zz4(int i, vv2 vv2Var, hyl hylVar) {
        int i2 = vv2Var.d;
        this.a = vv2Var;
        int iA = vv2Var.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        z4o.w(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = vv2Var.b * 1000000;
        long j2 = vv2Var.c;
        String str = tym.a;
        this.e = tym.W(i2, j, j2, RoundingMode.DOWN);
        this.b = hylVar;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[NotificationCompat.FLAG_GROUP_SUMMARY];
        this.n = new int[NotificationCompat.FLAG_GROUP_SUMMARY];
        this.f = i2;
    }

    public final vwi a(int i) {
        return new vwi((this.e / this.f) * this.n[i], this.m[i]);
    }

    public final swi b(long j) {
        if (this.k == 0) {
            vwi vwiVar = new vwi(0L, this.l);
            return new swi(vwiVar, vwiVar);
        }
        int i = (int) (j / (this.e / this.f));
        int iE = tym.e(this.n, i, true, true);
        if (this.n[iE] == i) {
            vwi vwiVarA = a(iE);
            return new swi(vwiVarA, vwiVarA);
        }
        vwi vwiVarA2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.m.length ? new swi(vwiVarA2, a(i2)) : new swi(vwiVarA2, vwiVarA2);
    }
}
