package defpackage;

import android.content.Context;
import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class osf implements ubk {
    public final umi a;
    public final shf c;
    public final psp b = new psp();
    public final qie d = new qie((byte) 19);
    public final mgh e = new mgh((byte) 0);

    public osf(Context context, umi umiVar) {
        this.a = umiVar;
        this.c = new shf(context, lkk.BEHAVIOR);
    }

    public final void a(Function1 function1) {
        t56 t56VarF = psp.f();
        function1.invoke(new yj0(this.b, t56VarF));
        if (this.e.c(t56VarF)) {
            return;
        }
        new rml(Unit.a, this.a).a(new msf(this, (byte) 1)).m(this.d);
    }

    @Override // defpackage.ubk
    public final void i(r rVar) {
        this.c.N(rVar);
    }

    @Override // defpackage.ubk
    public final void m(r rVar) {
        this.c.f(rVar);
    }

    @Override // defpackage.ubk
    public final void n(long j, boolean z) {
        new rml(Unit.a, this.a).a(new h5f(this, j, z)).m(this.d);
    }

    @Override // defpackage.ubk
    public final void setEnabled(boolean z) {
    }
}
