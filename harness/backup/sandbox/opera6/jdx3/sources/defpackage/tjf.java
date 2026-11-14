package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public class tjf implements pz3 {
    public final View a;
    public final int b;
    public final x1p c;
    public final Function1 d;
    public final sjf e;
    public lz3 f;
    public boolean g;
    public boolean h;
    public kjm i;

    public tjf(View view, x1p x1pVar, Function1 function1) {
        this.a = view;
        this.b = z7h.h(view.getContext(), 8.0f);
        k11 k11Var = k11.a;
        this.c = x1pVar;
        this.d = function1;
        this.e = new sjf(this);
        this.h = true;
    }

    public final void a(boolean z) {
        i(z ? rjf.b : rjf.c);
        this.g = true;
        lz3 lz3Var = this.f;
        if (lz3Var != null) {
            lz3Var.b(hjm.b);
        }
    }

    public int b() {
        return this.b;
    }

    @Override // defpackage.pz3
    public final lz3 c(ViewGroup viewGroup) {
        return new qjf(viewGroup, this);
    }

    public boolean d() {
        return true;
    }

    public k11 e() {
        return k11.a;
    }

    public boolean f() {
        return false;
    }

    @Override // defpackage.jjm
    public final void finish(hjm hjmVar) {
        kjm kjmVar = this.i;
        if (kjmVar != null) {
            kjmVar.o(this, hjmVar);
        }
    }

    public boolean g() {
        return false;
    }

    public long h() {
        return 0L;
    }

    public final void i(rjf rjfVar) {
        if (this.h) {
            boolean z = false;
            if (!d() && rjfVar == rjf.d) {
                z = true;
            }
            this.h = z;
            this.d.invoke(rjfVar);
        }
    }

    public final void j(ViewGroup viewGroup) {
        new qjf(viewGroup, this).f();
    }

    @Override // defpackage.jjm
    public final void setRequestDismisser(kjm kjmVar) {
        this.i = kjmVar;
    }
}
