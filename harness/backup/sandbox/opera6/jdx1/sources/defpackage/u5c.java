package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u5c {
    public final Function1 a;
    public tn c;
    public int f;
    public final p8f b = new p8f((byte) 7);
    public int d = -1;
    public int e = -1;

    public u5c(Function1 function1) {
        this.a = function1;
    }

    public final t5c a(int i, long j, boolean z, Function1 function1) {
        tn tnVar = this.c;
        if (tnVar == null) {
            return kn7.a;
        }
        xsg xsgVar = (xsg) tnVar.d;
        boolean z2 = xsgVar instanceof x91;
        usg usgVar = new usg(tnVar, i, this.b, function1);
        usgVar.d = new yo5(j);
        if (!z2) {
            xsgVar.a(usgVar);
        } else if (z) {
            x91 x91Var = (x91) xsgVar;
            x91Var.b.add(new vyg(1, usgVar));
            if (!x91Var.c) {
                x91Var.c = true;
                x91Var.a.post(x91Var);
            }
        } else {
            x91 x91Var2 = (x91) xsgVar;
            x91Var2.b.add(new vyg(0, usgVar));
            if (!x91Var2.c) {
                x91Var2.c = true;
                x91Var2.a.post(x91Var2);
            }
        }
        Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
        return usgVar;
    }
}
