package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class gx8 {
    public final hjf a;
    public final dkf b;
    public final pde c;
    public final pde d;

    /* JADX WARN: Multi-variable type inference failed */
    public gx8(hjf hjfVar, hjf hjfVar2, ikc ikcVar) throws Resources.NotFoundException {
        this.a = hjfVar;
        dkf dkfVar = new dkf(hjfVar, 2132083611);
        this.b = dkfVar;
        int iA = a();
        int iW = f03.w(2130970851, dkfVar, 0);
        this.c = new pde(Integer.valueOf(iA < iW ? iW : iA));
        this.d = new pde(Integer.valueOf(a()));
        ikcVar.j(hjfVar2, new cl4(new tu7((Object) this, (byte) 10), (byte) 20));
    }

    public final int a() throws Resources.NotFoundException {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        fp1 fp1Var = this.a;
        Resources resources = fp1Var.getResources();
        int iWidth = r9n.i(fp1Var).width();
        int iOrdinal = ddh.t(iWidth, fp1Var).ordinal();
        if (iOrdinal == 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(2131165735);
        } else if (iOrdinal == 1) {
            dimensionPixelSize = resources.getDimensionPixelSize(2131165738);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
                return 0;
            }
            dimensionPixelSize = iWidth < z7h.h(fp1Var, 976.0f) ? resources.getDimensionPixelSize(2131165736) : resources.getDimensionPixelSize(2131165737);
        }
        int iOrdinal2 = ddh.t(iWidth, fp1Var).ordinal();
        if (iOrdinal2 == 0) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(2131165727);
        } else if (iOrdinal2 == 1) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(2131165730);
        } else {
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                h9o.p();
                return 0;
            }
            dimensionPixelSize2 = iWidth < z7h.h(fp1Var, 976.0f) ? resources.getDimensionPixelSize(2131165728) : resources.getDimensionPixelSize(2131165729);
        }
        int i = (iWidth - dimensionPixelSize2) / 2;
        return dimensionPixelSize < i ? i : dimensionPixelSize;
    }
}
