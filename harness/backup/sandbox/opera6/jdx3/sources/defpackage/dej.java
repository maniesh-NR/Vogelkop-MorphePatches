package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public abstract class dej implements pim, ndc {
    public final i7f a = new i7f();
    public final mej b;

    public dej(mej mejVar) {
        this.b = mejVar;
        mejVar.i(new of(this, (byte) 2));
    }

    public abstract View a(Context context);

    public final void b() {
        this.b.Q(hjm.a);
    }

    public void c(hjm hjmVar) {
        i7f i7fVar = this.a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((y6f) g7fVarC.next()).a(hjmVar);
        }
    }

    public final tcc getLifecycle() {
        return this.b.getLifecycle();
    }
}
