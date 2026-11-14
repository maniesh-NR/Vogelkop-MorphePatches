package defpackage;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a12 implements d12 {
    public static final qie c = new qie((byte) 19);
    public final tcl a;
    public final b59 b;

    public a12(Context context, tcl tclVar) {
        this.a = tclVar;
        this.b = w1h.l(context, tclVar, "web-aria-storage", new bg1[0]);
    }

    @Override // defpackage.d12
    public final void a(ArrayList arrayList, vr9 vr9Var) {
        i(new w02(this, arrayList, (byte) 0), new z02(vr9Var, (byte) 0));
    }

    @Override // defpackage.d12
    public final void b(String str, Runnable runnable) {
        i(new x02(this, str, (byte) 0), new v02(runnable, (byte) 1));
    }

    @Override // defpackage.d12
    public final void c(ra raVar) {
        i(new y02(this, (byte) 1), raVar);
    }

    @Override // defpackage.d12
    public final void d() {
    }

    @Override // defpackage.d12
    public final void e(String str, Function1 function1) {
        i(new x02(this, str, (byte) 1), function1);
    }

    @Override // defpackage.d12
    public final void f(ArrayList arrayList, ra raVar) {
        i(new w02(this, arrayList, (byte) 1), raVar);
    }

    @Override // defpackage.d12
    public final void g(String str, String str2, Runnable runnable) {
        i(new hv((Object) this, (Object) str, (Object) str2, (byte) 1), new v02(runnable, (byte) 2));
    }

    @Override // defpackage.d12
    public final void h() {
    }

    public final void i(Function0 function0, Function1 function1) {
        new rml(Unit.a, this.a).a(new p01(function0, (byte) 2)).t(new ra(function1, (byte) 6)).m(c);
    }
}
