package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class db5 implements tfd, k9i {
    public final z62 a;
    public final rd3 b;

    public db5(z62 z62Var, rd3 rd3Var) {
        this.a = z62Var;
        this.b = rd3Var;
    }

    @Override // defpackage.tfd
    public final int a(shb shbVar, List list, int i) {
        int iM = shbVar.M(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iM, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pfd pfdVar = (pfd) list.get(i2);
            float fO = joh.o(joh.m(pfdVar));
            if (fO == 0.0f) {
                int iMin2 = Math.min(pfdVar.c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pfdVar.J(iMin2));
            } else if (fO > 0.0f) {
                f += fO;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pfd pfdVar2 = (pfd) list.get(i3);
            float fO2 = joh.o(joh.m(pfdVar2));
            if (fO2 > 0.0f) {
                iMax = Math.max(iMax, pfdVar2.J(iRound != Integer.MAX_VALUE ? Math.round(iRound * fO2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.tfd
    public final ufd b(vfd vfdVar, List list, long j) {
        return xug.p(this, yo5.i(j), yo5.j(j), yo5.g(j), yo5.h(j), vfdVar.M(this.a.b()), vfdVar, list, new ifg[list.size()], 0, list.size(), (int[]) null, 0);
    }

    @Override // defpackage.tfd
    public final int c(shb shbVar, List list, int i) {
        int iM = shbVar.M(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iM, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pfd pfdVar = (pfd) list.get(i2);
            float fO = joh.o(joh.m(pfdVar));
            if (fO == 0.0f) {
                int iMin2 = Math.min(pfdVar.c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pfdVar.E(iMin2));
            } else if (fO > 0.0f) {
                f += fO;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pfd pfdVar2 = (pfd) list.get(i3);
            float fO2 = joh.o(joh.m(pfdVar2));
            if (fO2 > 0.0f) {
                iMax = Math.max(iMax, pfdVar2.E(iRound != Integer.MAX_VALUE ? Math.round(iRound * fO2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.tfd
    public final int d(shb shbVar, List list, int i) {
        int iM = shbVar.M(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pfd pfdVar = (pfd) list.get(i3);
            float fO = joh.o(joh.m(pfdVar));
            int iC = pfdVar.c(i);
            if (fO == 0.0f) {
                i2 += iC;
            } else if (fO > 0.0f) {
                f += fO;
                iMax = Math.max(iMax, Math.round(iC / fO));
            }
        }
        return ((list.size() - 1) * iM) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.tfd
    public final int e(shb shbVar, List list, int i) {
        int iM = shbVar.M(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pfd pfdVar = (pfd) list.get(i3);
            float fO = joh.o(joh.m(pfdVar));
            int iZ = pfdVar.z(i);
            if (fO == 0.0f) {
                i2 += iZ;
            } else if (fO > 0.0f) {
                f += fO;
                iMax = Math.max(iMax, Math.round(iZ / fO));
            }
        }
        return ((list.size() - 1) * iM) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db5)) {
            return false;
        }
        db5 db5Var = (db5) obj;
        return this.a.equals(db5Var.a) && this.b.equals(db5Var.b);
    }

    public final void f(int i, int[] iArr, int[] iArr2, vfd vfdVar) {
        this.a.e(vfdVar, i, iArr, iArr2);
    }

    public final ufd g(ifg[] ifgVarArr, vfd vfdVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return vfdVar.b0(i3, i2, n08.a, new or3(ifgVarArr, this, i3, i, vfdVar, iArr));
    }

    public final int h(ifg ifgVar) {
        return ifgVar.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final int i(ifg ifgVar) {
        return ifgVar.b;
    }

    public final long j(int i, int i2, int i3, boolean z) {
        return !z ? ap5.a(0, i3, i, i2) : vtp.E(0, i3, i, i2);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
