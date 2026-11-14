package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class njl {
    public final mjl a;
    public final xbe b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public njl(mjl mjlVar, xbe xbeVar, long j) {
        this.a = mjlVar;
        this.b = xbeVar;
        this.c = j;
        ArrayList arrayList = xbeVar.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((tzf) arrayList.get(0)).a.d.d(0) + 0.0f;
        if (!arrayList.isEmpty()) {
            tzf tzfVar = (tzf) CollectionsKt.Q(arrayList);
            fD = tzfVar.a.d.d(r4.g - 1) + 0.0f + tzfVar.f;
        }
        this.e = fD;
        this.f = xbeVar.g;
    }

    public static int d(njl njlVar, int i) {
        return njlVar.b.c(i, false);
    }

    public final hyh a(int i) {
        xbe xbeVar = this.b;
        xbeVar.l(i);
        int length = ((sf1) xbeVar.a.a).b.length();
        ArrayList arrayList = xbeVar.h;
        tzf tzfVar = (tzf) arrayList.get(i == length ? arrayList.size() - 1 : sgb.y(i, arrayList));
        return tzfVar.a.d.f.isRtlCharAt(tzfVar.b(i)) ? hyh.b : hyh.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.voh b(int r10) {
        /*
            r9 = this;
            xbe r9 = r9.b
            r9.k(r10)
            java.util.ArrayList r9 = r9.h
            int r0 = defpackage.sgb.y(r10, r9)
            java.lang.Object r9 = r9.get(r0)
            tzf r9 = (defpackage.tzf) r9
            y81 r0 = r9.a
            int r10 = r9.b(r10)
            java.lang.CharSequence r1 = r0.e
            if (r10 < 0) goto L21
            int r2 = r1.length()
            if (r10 < r2) goto L43
        L21:
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "offset("
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = ") is out of bounds [0,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.b8b.a(r1)
        L43:
            ljl r0 = r0.d
            int r1 = r0.g(r10)
            float r2 = r0.i(r1)
            float r3 = r0.e(r1)
            android.text.Layout r4 = r0.f
            int r1 = r4.getParagraphDirection(r1)
            r5 = 1
            r6 = 0
            if (r1 != r5) goto L5d
            r1 = r5
            goto L5e
        L5d:
            r1 = r6
        L5e:
            boolean r4 = r4.isRtlCharAt(r10)
            if (r1 == 0) goto L7f
            if (r4 != 0) goto L70
            float r1 = r0.j(r10, r6)
            int r10 = r10 + r5
            float r10 = r0.j(r10, r5)
            goto L94
        L70:
            if (r4 == 0) goto L7f
            float r1 = r0.k(r10, r6)
            int r10 = r10 + r5
            float r10 = r0.k(r10, r5)
        L7b:
            r8 = r1
            r1 = r10
            r10 = r8
            goto L94
        L7f:
            if (r4 == 0) goto L8b
            float r1 = r0.j(r10, r6)
            int r10 = r10 + r5
            float r10 = r0.j(r10, r5)
            goto L7b
        L8b:
            float r1 = r0.k(r10, r6)
            int r10 = r10 + r5
            float r10 = r0.k(r10, r5)
        L94:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r2, r10, r3)
            float r10 = r0.left
            float r1 = r0.top
            r2 = 0
            float r1 = r1 + r2
            float r3 = r0.right
            float r0 = r0.bottom
            float r0 = r0 + r2
            float r9 = r9.f
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r4 = (long) r9
            voh r9 = new voh
            float r10 = r10 + r2
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r5 = r5 + r1
            float r2 = r2 + r3
            float r1 = java.lang.Float.intBitsToFloat(r4)
            float r1 = r1 + r0
            r9.<init>(r10, r5, r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njl.b(int):voh");
    }

    public final voh c(int i) {
        xbe xbeVar = this.b;
        xbeVar.l(i);
        int length = ((sf1) xbeVar.a.a).b.length();
        ArrayList arrayList = xbeVar.h;
        tzf tzfVar = (tzf) arrayList.get(i == length ? arrayList.size() - 1 : sgb.y(i, arrayList));
        y81 y81Var = tzfVar.a;
        int iB = tzfVar.b(i);
        CharSequence charSequence = y81Var.e;
        ljl ljlVar = y81Var.d;
        if (iB < 0 || iB > charSequence.length()) {
            b8b.a("offset(" + iB + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fJ = ljlVar.j(iB, false);
        int iG = ljlVar.g(iB);
        float fI = ljlVar.i(iG) + 0.0f;
        float fE = ljlVar.e(iG) + 0.0f;
        float f = 0.0f + fJ;
        int iFloatToRawIntBits = (int) (Float.floatToRawIntBits(tzfVar.f) & 4294967295L);
        return new voh(f, Float.intBitsToFloat(iFloatToRawIntBits) + fI, f, Float.intBitsToFloat(iFloatToRawIntBits) + fE);
    }

    public final float e(int i) {
        xbe xbeVar = this.b;
        xbeVar.m(i);
        ArrayList arrayList = xbeVar.h;
        tzf tzfVar = (tzf) arrayList.get(sgb.z(i, arrayList));
        y81 y81Var = tzfVar.a;
        int i2 = i - tzfVar.d;
        ljl ljlVar = y81Var.d;
        return ljlVar.f.getLineLeft(i2) + (i2 == ljlVar.g + (-1) ? ljlVar.j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof njl) {
            njl njlVar = (njl) obj;
            if (this.a.equals(njlVar.a) && this.b == njlVar.b && gcb.a(this.c, njlVar.c) && this.d == njlVar.d && this.e == njlVar.e && this.f.equals(njlVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        xbe xbeVar = this.b;
        xbeVar.m(i);
        ArrayList arrayList = xbeVar.h;
        tzf tzfVar = (tzf) arrayList.get(sgb.z(i, arrayList));
        y81 y81Var = tzfVar.a;
        int i2 = i - tzfVar.d;
        ljl ljlVar = y81Var.d;
        return ljlVar.f.getLineRight(i2) + (i2 == ljlVar.g + (-1) ? ljlVar.k : 0.0f);
    }

    public final int g(int i) {
        xbe xbeVar = this.b;
        xbeVar.m(i);
        ArrayList arrayList = xbeVar.h;
        tzf tzfVar = (tzf) arrayList.get(sgb.z(i, arrayList));
        y81 y81Var = tzfVar.a;
        return y81Var.d.f.getLineStart(i - tzfVar.d) + tzfVar.b;
    }

    public final hyh h(int i) {
        xbe xbeVar = this.b;
        xbeVar.l(i);
        int length = ((sf1) xbeVar.a.a).b.length();
        ArrayList arrayList = xbeVar.h;
        tzf tzfVar = (tzf) arrayList.get(i == length ? arrayList.size() - 1 : sgb.y(i, arrayList));
        y81 y81Var = tzfVar.a;
        int iB = tzfVar.b(i);
        ljl ljlVar = y81Var.d;
        return ljlVar.f.getParagraphDirection(ljlVar.g(iB)) == 1 ? hyh.a : hyh.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + sko.d(this.e, sko.d(this.d, z1m.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final d91 i(int i, int i2) {
        xbe xbeVar = this.b;
        sf1 sf1Var = (sf1) xbeVar.a.a;
        if (i < 0 || i > i2 || i2 > sf1Var.b.length()) {
            int length = sf1Var.b.length();
            StringBuilder sbO = sko.o(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbO.append(length);
            sbO.append("), or start > end!");
            b8b.a(sbO.toString());
        }
        if (i == i2) {
            return f91.a();
        }
        d91 d91VarA = f91.a();
        sgb.B(xbeVar.h, upj.c(i, i2), new y9b(d91VarA, i, i2, (byte) 3));
        return d91VarA;
    }

    public final long j(int i) {
        int iR;
        int iD;
        int iD2;
        xbe xbeVar = this.b;
        xbeVar.l(i);
        int length = ((sf1) xbeVar.a.a).b.length();
        ArrayList arrayList = xbeVar.h;
        tzf tzfVar = (tzf) arrayList.get(i == length ? arrayList.size() - 1 : sgb.y(i, arrayList));
        y81 y81Var = tzfVar.a;
        int iB = tzfVar.b(i);
        i1 i1VarL = y81Var.d.l();
        if (i1VarL.A(i1VarL.R(iB))) {
            i1VarL.j(iB);
            iR = iB;
            while (iR != -1 && (!i1VarL.A(iR) || i1VarL.w(iR))) {
                iR = i1VarL.R(iR);
            }
        } else {
            i1VarL.j(iB);
            iR = i1VarL.z(iB) ? (!i1VarL.x(iB) || i1VarL.v(iB)) ? i1VarL.R(iB) : iB : i1VarL.v(iB) ? i1VarL.R(iB) : -1;
        }
        if (iR == -1) {
            iR = iB;
        }
        if (i1VarL.w(i1VarL.D(iB))) {
            i1VarL.j(iB);
            iD = iB;
            while (iD != -1 && (i1VarL.A(iD) || !i1VarL.w(iD))) {
                iD = i1VarL.D(iD);
            }
        } else {
            i1VarL.j(iB);
            if (i1VarL.v(iB)) {
                if (!i1VarL.x(iB) || i1VarL.z(iB)) {
                    iD2 = i1VarL.D(iB);
                    iD = iD2;
                } else {
                    iD = iB;
                }
            } else if (i1VarL.z(iB)) {
                iD2 = i1VarL.D(iB);
                iD = iD2;
            } else {
                iD = -1;
            }
        }
        if (iD != -1) {
            iB = iD;
        }
        return tzfVar.a(upj.c(iR, iB), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + gcb.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
