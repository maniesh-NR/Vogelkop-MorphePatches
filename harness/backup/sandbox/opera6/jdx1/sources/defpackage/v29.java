package defpackage;

import java.io.IOException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class v29 extends v19 implements c8o {
    @Override // defpackage.c8o
    public final Object d(mt5 mt5Var, Object obj) throws IOException {
        if (this.c.get()) {
            qp2.n("This scope has already been closed.");
            return null;
        }
        Object objU = wyh.U(this.a, new u29(this, obj, null), (nt5) mt5Var);
        return objU == px5.a ? objU : Unit.a;
    }
}
