package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;

/* loaded from: classes.dex */
public final class zdn implements lkf, mkf {
    public final tah a;
    public final aen b;
    public final s2b c;

    public zdn(gjm gjmVar, mw3 mw3Var, nw3 nw3Var, nw3 nw3Var2, nw3 nw3Var3, mw3 mw3Var2, mw3 mw3Var3, Lazy lazy, Lazy lazy2, nw3 nw3Var4, nw3 nw3Var5, mw3 mw3Var4, nw3 nw3Var6, nw3 nw3Var7, mw3 mw3Var5, nw3 nw3Var8, kw3 kw3Var, hw3 hw3Var, x5f x5fVar) {
        tah tahVar = new tah(nw3Var4, lazy, nw3Var, mw3Var5, nw3Var3, nw3Var7, nw3Var8, kw3Var, hw3Var, nw3Var2);
        this.a = tahVar;
        this.b = new aen(tahVar, gjmVar, nw3Var4, mw3Var3, nw3Var5, nw3Var2, lazy, lazy2, hw3Var, mw3Var4, nw3Var6, mw3Var2, nw3Var, nw3Var3, mw3Var, x5fVar);
        this.c = new s2b(mw3Var, (byte) 1);
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        return this.c.a(cls);
    }

    public final Fragment b(Class cls) {
        return this.b.b(cls);
    }
}
