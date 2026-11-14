package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ofa implements vhi {
    public final int a;
    public final sfa b;
    public int c = -1;

    public ofa(sfa sfaVar, int i) {
        this.b = sfaVar;
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.z4o.w(r0)
            sfa r0 = r6.b
            r0.j()
            int[] r3 = r0.K
            r3.getClass()
            int[] r3 = r0.K
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L2f
            java.util.Set r1 = r0.J
            fyl r0 = r0.I
            eyl r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L35
            r3 = -3
            goto L39
        L2f:
            boolean[] r0 = r0.N
            boolean r2 = r0[r3]
            if (r2 == 0) goto L37
        L35:
            r3 = r5
            goto L39
        L37:
            r0[r3] = r1
        L39:
            r6.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofa.a():void");
    }

    public final boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.vhi
    public final int c(i16 i16Var, qj6 qj6Var, int i) {
        oj9 oj9Var;
        if (this.c == -3) {
            qj6Var.a(4);
            return -4;
        }
        if (b()) {
            int i2 = this.c;
            sfa sfaVar = this.b;
            ArrayList arrayList = sfaVar.n;
            if (!sfaVar.s()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((uea) arrayList.get(i4)).k;
                        int length = sfaVar.v.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (sfaVar.N[i6] && sfaVar.v[i6].B() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    tym.T(arrayList, 0, i4);
                    uea ueaVar = (uea) arrayList.get(0);
                    oj9 oj9Var2 = ueaVar.d;
                    if (!oj9Var2.equals(sfaVar.G)) {
                        sfaVar.k.n(sfaVar.b, oj9Var2, ueaVar.e, ueaVar.f, ueaVar.g);
                    }
                    sfaVar.G = oj9Var2;
                }
                if (arrayList.isEmpty() || ((uea) arrayList.get(0)).f()) {
                    int iC = sfaVar.v[i2].C(i16Var, qj6Var, i, sfaVar.T);
                    if (iC == -5) {
                        oj9 oj9VarD = (oj9) i16Var.c;
                        oj9VarD.getClass();
                        if (i2 == sfaVar.B) {
                            int iL = sgb.l(sfaVar.v[i2].B());
                            while (i3 < arrayList.size() && ((uea) arrayList.get(i3)).k != iL) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                oj9Var = ((uea) arrayList.get(i3)).d;
                            } else {
                                oj9Var = sfaVar.F;
                                oj9Var.getClass();
                            }
                            oj9VarD = oj9VarD.d(oj9Var);
                        }
                        i16Var.c = oj9VarD;
                    }
                    return iC;
                }
            }
        }
        return -3;
    }

    @Override // defpackage.vhi
    public final boolean isReady() {
        if (this.c == -3) {
            return true;
        }
        if (!b()) {
            return false;
        }
        int i = this.c;
        sfa sfaVar = this.b;
        return !sfaVar.s() && sfaVar.v[i].x(sfaVar.T);
    }

    @Override // defpackage.vhi
    public final void maybeThrowError() throws IOException {
        int i = this.c;
        sfa sfaVar = this.b;
        if (i == -2) {
            sfaVar.j();
            throw new g65(sko.k("Unable to bind a sample queue to TrackGroup with MIME type ", sfaVar.I.a(this.a).d[0].n, "."));
        }
        if (i == -1) {
            sfaVar.v();
        } else if (i != -3) {
            sfaVar.v();
            sfaVar.v[i].z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @Override // defpackage.vhi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int skipData(long r4) {
        /*
            r3 = this;
            boolean r0 = r3.b()
            if (r0 == 0) goto L5c
            int r0 = r3.c
            sfa r3 = r3.b
            boolean r1 = r3.s()
            if (r1 != 0) goto L5c
            rfa[] r1 = r3.v
            r1 = r1[r0]
            boolean r2 = r3.T
            int r4 = r1.v(r4, r2)
            java.util.ArrayList r3 = r3.n
            if (r3 == 0) goto L2a
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L40
            r5 = 1
            java.lang.Object r3 = am2.k(r5, r3)
            goto L41
        L2a:
            java.util.Iterator r3 = r3.iterator()
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L40
        L34:
            java.lang.Object r5 = r3.next()
            boolean r2 = r3.hasNext()
            if (r2 != 0) goto L34
            r3 = r5
            goto L41
        L40:
            r3 = 0
        L41:
            uea r3 = (defpackage.uea) r3
            if (r3 == 0) goto L58
            boolean r5 = r3.f()
            if (r5 != 0) goto L58
            int r5 = r1.t()
            int r3 = r3.e(r0)
            int r3 = r3 - r5
            int r4 = java.lang.Math.min(r4, r3)
        L58:
            r1.G(r4)
            return r4
        L5c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofa.skipData(long):int");
    }
}
