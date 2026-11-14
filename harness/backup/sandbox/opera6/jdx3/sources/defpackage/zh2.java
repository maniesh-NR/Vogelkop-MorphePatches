package defpackage;

import com.opera.android.account.AuthExtension;

/* loaded from: classes.dex */
public final class zh2 implements as6 {
    public final qt3 a;
    public final tcc b;

    public zh2(qt3 qt3Var, tcc tccVar) {
        this.a = qt3Var;
        this.b = tccVar;
        tccVar.a(this);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        this.b.b(this);
        AuthExtension.a.c(this);
    }
}
