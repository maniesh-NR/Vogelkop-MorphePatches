package defpackage;

import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class asl extends a45 {
    public boolean M;
    public Function1 N;
    public final p7l O;

    public asl(boolean z, lde ldeVar, boolean z2, q5i q5iVar, Function1 function1) {
        super(ldeVar, null, z2, true, null, q5iVar, new kv4(function1, z, (byte) 1));
        this.M = z;
        this.N = function1;
        this.O = new p7l(this, (byte) 15);
    }

    @Override // defpackage.y3
    public final void W0(q0j q0jVar) {
        o0j.j(q0jVar, this.M ? bsl.a : bsl.b);
        o0j.c(q0jVar, ulp.e);
        o0j.f(q0jVar, new e61(AutofillValue.forToggle(this.M)));
        o0j.b(q0jVar, new ww4(q0jVar, (byte) 1));
    }
}
