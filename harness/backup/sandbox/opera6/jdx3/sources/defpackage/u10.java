package defpackage;

import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public final class u10 implements ea2 {
    public final x5f a;
    public final pde b;
    public final tsd c;

    public u10(x5f x5fVar, pde pdeVar, tsd tsdVar) {
        this.a = x5fVar;
        this.b = pdeVar;
        this.c = tsdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010c A[PHI: r8
      0x010c: PHI (r8v1 int) = (r8v0 int), (r8v2 int) binds: [B:38:0x00db, B:40:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e A[PHI: r9
      0x010e: PHI (r9v1 int) = (r9v0 int), (r9v2 int), (r9v3 int) binds: [B:32:0x00b7, B:34:0x00c4, B:36:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ea2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ab2 k(android.view.ViewGroup r25, int r26) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u10.k(android.view.ViewGroup, int):ab2");
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        if (!(ja2Var instanceof x10)) {
            return 0;
        }
        w10 w10Var = (w10) ((x10) ja2Var).d;
        w06 w06Var = w10Var.u.d;
        switch (w06Var == null ? -1 : t10.a[w06Var.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case SizeUtil.textSize0_1 /* 18 */:
            case 19:
            case SizeUtil.textSize0 /* 20 */:
            case 21:
            case SizeUtil.textSize1 /* 22 */:
            case 23:
            case SizeUtil.textSize2 /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
                uz uzVar = w10Var.n;
                dl dlVarH = w10Var.h();
                String str = w10Var.g;
                u50 u50VarH = yo.h(w10Var.i);
                q50 q50Var = dlVarH.b;
                String str2 = uzVar != null ? uzVar.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                this.a.p(str, u50VarH, q50Var, str2, 0L, false, w10Var.e(), null);
                return 2131558755;
            case 0:
            default:
                h9o.p();
                return 0;
            case 1:
                return w10Var.u.o0 ? 2131558467 : 2131558466;
        }
    }
}
