package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lqf extends p10 {
    public static final lqf d = new lqf(1, 0, 2);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        int[] iArr;
        qt9 qt9Var;
        int iC;
        int iX = r05Var.x(0);
        if (lqjVar.n != 0) {
            mh5.a("Cannot move a group while inserting");
        }
        if (iX < 0) {
            mh5.a("Parameter offset is out of bounds");
        }
        if (iX != 0) {
            int i = lqjVar.t;
            int i2 = lqjVar.v;
            int i3 = lqjVar.u;
            int i4 = i;
            while (true) {
                iArr = lqjVar.b;
                if (iX <= 0) {
                    break;
                }
                i4 += iArr[(lqjVar.q(i4) * 5) + 3];
                if (i4 > i3) {
                    mh5.a("Parameter offset is out of bounds");
                }
                iX--;
            }
            int i5 = iArr[(lqjVar.q(i4) * 5) + 3];
            int iF = lqjVar.f(lqjVar.q(lqjVar.t), lqjVar.b);
            int iF2 = lqjVar.f(lqjVar.q(i4), lqjVar.b);
            int i6 = i4 + i5;
            int iF3 = lqjVar.f(lqjVar.q(i6), lqjVar.b);
            int i7 = iF3 - iF2;
            lqjVar.w(i7, Math.max(lqjVar.t - 1, 0));
            lqjVar.v(i5);
            int[] iArr2 = lqjVar.b;
            int iQ = lqjVar.q(i6) * 5;
            System.arraycopy(iArr2, iQ, iArr2, lqjVar.q(i) * 5, ((i5 * 5) + iQ) - iQ);
            if (i7 > 0) {
                Object[] objArr = lqjVar.c;
                int iG = lqjVar.g(iF2 + i7);
                System.arraycopy(objArr, iG, objArr, iF, lqjVar.g(iF3 + i7) - iG);
            }
            int i8 = iF2 + i7;
            int i9 = i8 - iF;
            int i10 = lqjVar.k;
            int i11 = lqjVar.l;
            int length = lqjVar.c.length;
            int i12 = lqjVar.m;
            int i13 = i + i5;
            int i14 = i;
            while (i14 < i13) {
                int iQ2 = lqjVar.q(i14);
                int i15 = i9;
                int[] iArr3 = iArr2;
                iArr3[(iQ2 * 5) + 4] = lqj.h(lqj.h(lqjVar.f(iQ2, iArr2) - i15, i12 < iQ2 ? 0 : i10, i11, length), lqjVar.k, lqjVar.l, lqjVar.c.length);
                i14++;
                i9 = i15;
                iArr2 = iArr3;
                i10 = i10;
            }
            int i16 = i6 + i5;
            int iO = lqjVar.o();
            int iB = kqj.b(lqjVar.d, i6, iO);
            ArrayList arrayList = new ArrayList();
            if (iB >= 0) {
                while (iB < lqjVar.d.size() && (iC = lqjVar.c((qt9Var = (qt9) lqjVar.d.get(iB)))) >= i6 && iC < i16) {
                    arrayList.add(qt9Var);
                }
            }
            int i17 = i - i6;
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                qt9 qt9Var2 = (qt9) arrayList.get(i18);
                int iC2 = lqjVar.c(qt9Var2) + i17;
                if (iC2 >= lqjVar.g) {
                    qt9Var2.a = -(iO - iC2);
                } else {
                    qt9Var2.a = iC2;
                }
                lqjVar.d.add(kqj.b(lqjVar.d, iC2, iO), qt9Var2);
            }
            if (lqjVar.H(i6, i5)) {
                mh5.a("Unexpectedly removed anchors");
            }
            lqjVar.l(i2, lqjVar.u, i);
            if (i7 > 0) {
                lqjVar.I(i8, i7, i6 - 1);
            }
        }
    }
}
