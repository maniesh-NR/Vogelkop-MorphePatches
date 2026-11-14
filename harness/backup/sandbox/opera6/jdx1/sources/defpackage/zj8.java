package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zj8 implements fog {
    public final int a;
    public final afe b;
    public final g51 c;
    public final i11 d;
    public final i11 e;
    public final n1o f;
    public final n1o g;
    public final j11 h;
    public final j11 i;
    public final o1o j;
    public final o1o k;

    public zj8(n27 n27Var, int i, afe afeVar, g51 g51Var) {
        int iM = n27Var.M(48.0f);
        this.a = i;
        this.b = afeVar;
        this.c = g51Var;
        rd3 rd3Var = rbe.n;
        this.d = new i11(rd3Var, rd3Var);
        rd3 rd3Var2 = rbe.p;
        this.e = new i11(rd3Var2, rd3Var2);
        this.f = new n1o(na2.c);
        this.g = new n1o(na2.d);
        sd3 sd3Var = rbe.k;
        sd3 sd3Var2 = rbe.m;
        this.h = new j11(sd3Var, sd3Var2);
        this.i = new j11(sd3Var2, sd3Var);
        this.j = new o1o(sd3Var, iM);
        this.k = new o1o(sd3Var2, iM);
    }

    @Override // defpackage.fog
    public final long b(ccb ccbVar, long j, d2c d2cVar, long j2) {
        ccb ccbVar2;
        char c;
        long j3;
        int iA;
        afe afeVar = this.b;
        if (afeVar != null) {
            afeVar.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + this.a) & 4294967295L);
        int i = (int) (j5 >> 32);
        int i2 = 0;
        List listAsList = Arrays.asList(this.d, this.e, ((int) (ccbVar.a() >> 32)) < i / 2 ? this.f : this.g);
        int size = listAsList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                ccbVar2 = ccbVar;
                c = c2;
                j3 = j4;
                iA = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i4 = (int) (j2 >> c);
            int i5 = size;
            int i6 = i3;
            ccbVar2 = ccbVar;
            List list = listAsList;
            iA = ((iud) listAsList.get(i3)).a(ccbVar2, j5, i4, d2cVar);
            if (i6 == list.size() - 1 || (iA >= 0 && i4 + iA <= i)) {
                break;
            }
            i3 = i6 + 1;
            listAsList = list;
            size = i5;
            c2 = c;
            j4 = j3;
        }
        int i7 = (int) (j5 & j3);
        List listAsList2 = Arrays.asList(this.h, this.i, ((int) (ccbVar2.a() & j3)) < i7 / 2 ? this.j : this.k);
        int size2 = listAsList2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (j2 & j3);
            int iA2 = ((jud) listAsList2.get(i8)).a(ccbVar2, j5, i9);
            if (i8 == listAsList2.size() - 1 || (iA2 >= 0 && i9 + iA2 <= i7)) {
                i2 = iA2;
                break;
            }
        }
        long j6 = (iA << c) | (i2 & j3);
        this.c.invoke(ccbVar2, f03.c(j6, j2));
        return j6;
    }
}
