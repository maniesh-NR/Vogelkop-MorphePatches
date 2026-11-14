package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i37 extends wak implements iak {
    public final Function0 b;
    public final iuj c;
    public h37 d = new h37(ytj.h().g());

    public i37(Function0 function0, iuj iujVar) {
        this.b = function0;
        this.c = iujVar;
    }

    @Override // defpackage.vak
    public final void b(yak yakVar) {
        this.d = (h37) yakVar;
    }

    @Override // defpackage.vak
    public final yak c() {
        return this.d;
    }

    @Override // defpackage.iak
    public final Object getValue() {
        Function1 function1E = ytj.h().e();
        if (function1E != null) {
            function1E.invoke(this);
        }
        ttj ttjVarH = ytj.h();
        return h((h37) ytj.g(this.d, ttjVarH), ttjVarH, true, this.b).f;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.h37 h(defpackage.h37 r21, defpackage.ttj r22, boolean r23, kotlin.jvm.functions.Function0 r24) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i37.h(h37, ttj, boolean, kotlin.jvm.functions.Function0):h37");
    }

    public final h37 i() {
        ttj ttjVarH = ytj.h();
        return h((h37) ytj.g(this.d, ttjVarH), ttjVarH, false, this.b);
    }

    public final String toString() {
        h37 h37Var = (h37) ytj.f(this.d);
        return "DerivedState(value=" + (h37Var.c(this, ytj.h()) ? String.valueOf(h37Var.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
