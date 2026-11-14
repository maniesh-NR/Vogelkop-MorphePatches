package defpackage;

import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class bx3 extends hji {
    public final /* synthetic */ re7 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ OperaApplication c;
    public final /* synthetic */ cx3 d;

    public bx3(cx3 cx3Var, re7 re7Var, boolean z, OperaApplication operaApplication) {
        this.a = re7Var;
        this.b = z;
        this.c = operaApplication;
        this.d = cx3Var;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        return this.d.d(this.a, this.b, mejVar);
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        if (hjmVar == hjm.b) {
            x5f x5fVar = this.c.L().c;
            nc0 nc0VarC = this.a.c();
            if (x5fVar.h) {
                x5fVar.N(kc0.b, null, false, false, false, false, nc0VarC);
            }
        }
    }
}
