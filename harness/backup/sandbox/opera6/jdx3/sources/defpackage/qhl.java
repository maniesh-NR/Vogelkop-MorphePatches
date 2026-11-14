package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qhl {
    public final sf1 a;
    public final long b;
    public final njl c;
    public final i9f d;
    public final wjl e;
    public long f;
    public final sf1 g;
    public final mil h;
    public final ojl i;

    public qhl(mil milVar, i9f i9fVar, ojl ojlVar, wjl wjlVar) {
        sf1 sf1Var = milVar.a;
        long j = milVar.b;
        njl njlVar = ojlVar != null ? ojlVar.a : null;
        this.a = sf1Var;
        this.b = j;
        this.c = njlVar;
        this.d = i9fVar;
        this.e = wjlVar;
        this.f = j;
        this.g = sf1Var;
        this.h = milVar;
        this.i = ojlVar;
    }

    public final List a(Function1 function1) {
        if (!xjl.c(this.f)) {
            return Arrays.asList(new yb5("", 0), new s4j(xjl.f(this.f), xjl.f(this.f)));
        }
        us7 us7Var = (us7) function1.invoke(this);
        if (us7Var != null) {
            return Collections.singletonList(us7Var);
        }
        return null;
    }

    public final Integer b() {
        njl njlVar = this.c;
        if (njlVar == null) {
            return null;
        }
        xbe xbeVar = njlVar.b;
        int iE = xjl.e(this.f);
        i9f i9fVar = this.d;
        return Integer.valueOf(i9fVar.g(xbeVar.c(xbeVar.d(i9fVar.i(iE)), true)));
    }

    public final Integer c() {
        njl njlVar = this.c;
        if (njlVar == null) {
            return null;
        }
        int iF = xjl.f(this.f);
        i9f i9fVar = this.d;
        return Integer.valueOf(i9fVar.g(njlVar.g(njlVar.b.d(i9fVar.i(iF)))));
    }

    public final Integer d() {
        int length;
        njl njlVar = this.c;
        if (njlVar == null) {
            return null;
        }
        int iR = r();
        while (true) {
            sf1 sf1Var = this.a;
            if (iR < sf1Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long j = njlVar.j(length2);
                int i = xjl.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iR) {
                    length = this.d.g(i2);
                    break;
                }
                iR++;
            } else {
                length = sf1Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iG;
        njl njlVar = this.c;
        if (njlVar == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                iG = 0;
                break;
            }
            int length = this.g.b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long j = njlVar.j(length);
            int i = xjl.c;
            int i2 = (int) (j >> 32);
            if (i2 < iR) {
                iG = this.d.g(i2);
                break;
            }
            iR--;
        }
        return Integer.valueOf(iG);
    }

    public final boolean f() {
        njl njlVar = this.c;
        return (njlVar != null ? njlVar.h(r()) : null) != hyh.b;
    }

    public final int g(njl njlVar, int i) {
        int iR = r();
        wjl wjlVar = this.e;
        if (wjlVar.a == null) {
            wjlVar.a = Float.valueOf(njlVar.c(iR).a);
        }
        xbe xbeVar = njlVar.b;
        int iD = xbeVar.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= xbeVar.f) {
            return this.g.b.length();
        }
        float fB = xbeVar.b(iD) - 1.0f;
        float fFloatValue = wjlVar.a.floatValue();
        if ((f() && fFloatValue >= njlVar.f(iD)) || (!f() && fFloatValue <= njlVar.e(iD))) {
            return xbeVar.c(iD, true);
        }
        return this.d.g(xbeVar.g((Float.floatToRawIntBits(r1.floatValue()) << 32) | (Float.floatToRawIntBits(fB) & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(ojl r9, int r10) {
        /*
            r8 = this;
            b2c r0 = r9.b
            njl r1 = r9.a
            if (r0 == 0) goto L13
            b2c r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            voh r9 = r9.y(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            voh r9 = voh.e
        L15:
            mil r0 = r8.h
            long r2 = r0.b
            int r0 = xjl.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            i9f r8 = r8.d
            int r0 = r8.i(r0)
            voh r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r2 = r2 | r9
            xbe r9 = r1.b
            int r9 = r9.g(r2)
            int r8 = r8.g(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhl.h(ojl, int):int");
    }

    public final void i() {
        wjl wjlVar = this.e;
        wjlVar.a = null;
        sf1 sf1Var = this.g;
        if (sf1Var.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            wjlVar.a = null;
            if (sf1Var.b.length() > 0) {
                String str = sf1Var.b;
                long j = this.f;
                int i = xjl.c;
                int iM = nxg.m((int) (j & 4294967295L), str);
                if (iM != -1) {
                    q(iM, iM);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        sf1 sf1Var = this.g;
        String str = sf1Var.b;
        String str2 = sf1Var.b;
        if (str.length() > 0) {
            int iQ = exg.q(xjl.e(this.f), str2);
            if (iQ == xjl.e(this.f) && iQ != str2.length()) {
                iQ = exg.q(iQ + 1, str2);
            }
            q(iQ, iQ);
        }
    }

    public final void k() {
        this.e.a = null;
        sf1 sf1Var = this.g;
        if (sf1Var.b.length() > 0) {
            String str = sf1Var.b;
            long j = this.f;
            int i = xjl.c;
            int iO = nxg.o((int) (j & 4294967295L), str);
            if (iO != -1) {
                q(iO, iO);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        sf1 sf1Var = this.g;
        String str = sf1Var.b;
        String str2 = sf1Var.b;
        if (str.length() > 0) {
            int iR = exg.r(xjl.f(this.f), str2);
            if (iR == xjl.f(this.f) && iR != 0) {
                iR = exg.r(iR - 1, str2);
            }
            q(iR, iR);
        }
    }

    public final void m() {
        wjl wjlVar = this.e;
        wjlVar.a = null;
        sf1 sf1Var = this.g;
        if (sf1Var.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            wjlVar.a = null;
            if (sf1Var.b.length() > 0) {
                String str = sf1Var.b;
                long j = this.f;
                int i = xjl.c;
                int iM = nxg.m((int) (j & 4294967295L), str);
                if (iM != -1) {
                    q(iM, iM);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = xjl.c;
            this.f = upj.c((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = upj.c(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = xjl.c;
        return this.d.i((int) (j & 4294967295L));
    }
}
