package defpackage;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mz3 implements kz3 {
    public final /* synthetic */ lz3 a;
    public final /* synthetic */ z8b b;

    public mz3(z8b z8bVar, lz3 lz3Var) {
        this.a = lz3Var;
        Objects.requireNonNull(z8bVar);
        this.b = z8bVar;
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        this.a.c.c(this);
        z8b z8bVar = this.b;
        Pair pair = (Pair) z8bVar.a;
        if (pair != null) {
            ((pz3) pair.first).finish(hjmVar);
        }
        z8bVar.a = null;
    }
}
