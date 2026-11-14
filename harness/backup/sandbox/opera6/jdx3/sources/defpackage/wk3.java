package defpackage;

import com.opera.android.suggestion.Suggestion;

/* loaded from: classes.dex */
public final class wk3 implements odb {
    public final x5f a;
    public boolean b;

    public wk3(x5f x5fVar) {
        this.a = x5fVar;
    }

    public final void a(Suggestion suggestion) {
        if (this.b) {
            return;
        }
        this.b = true;
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.E(zpaVar).x(zpaVar).e(5);
            x5fVar.U0(x56VarF);
        }
    }

    public final void b(Suggestion suggestion) {
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.E(zpaVar).x(zpaVar).e(6);
            x5fVar.U0(x56VarF);
        }
    }

    public final void reset() {
        this.b = false;
    }
}
