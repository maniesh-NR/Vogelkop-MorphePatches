package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class o93 implements jjm {
    public boolean a;
    public kjm b;

    public final void b(hjm hjmVar, int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        f(i);
        this.b.o(this, hjmVar);
    }

    public boolean d() {
        return true;
    }

    public gtj e(View view) {
        gtj gtjVarC = gtj.c(view, 2132021497, 5000);
        gtjVarC.f(2132018629, new nf(this, view, (byte) 22));
        return gtjVarC;
    }

    public void f(int i) {
    }

    @Override // defpackage.jjm
    public final void finish(hjm hjmVar) {
        b(hjm.b, 3);
    }

    @Override // defpackage.jjm
    public final void setRequestDismisser(kjm kjmVar) {
        this.b = kjmVar;
    }
}
