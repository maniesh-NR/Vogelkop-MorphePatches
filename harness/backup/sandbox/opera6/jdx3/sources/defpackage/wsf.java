package defpackage;

import android.content.Context;
import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wsf implements ubk {
    public final umi a;
    public final shf c;
    public final qs7 b = new qs7((byte) 20);
    public final qie d = new qie((byte) 19);
    public final mgh e = new mgh((byte) 0);

    public wsf(Context context, umi umiVar) {
        this.a = umiVar;
        this.c = new shf(context, lkk.ONBOARDING);
    }

    public static String b(kl0 kl0Var) {
        return Intrinsics.a(kl0Var, kl0.b) ? "adblocker" : Intrinsics.a(kl0Var, kl0.c) ? "tracker_blocker" : Intrinsics.a(kl0Var, kl0.d) ? "default_browser" : Intrinsics.a(kl0Var, kl0.e) ? "default_browser_failed" : Intrinsics.a(kl0Var, kl0.f) ? "notifications" : Intrinsics.a(kl0Var, kl0.g) ? "pre_screen_consent" : Intrinsics.a(kl0Var, kl0.h) ? "consent_opera" : Intrinsics.a(kl0Var, kl0.i) ? "consent_usercentrics" : Intrinsics.a(kl0Var, kl0.j) ? "welcome_screen" : Intrinsics.a(kl0Var, kl0.k) ? "consent_opera_layer_two" : Intrinsics.a(kl0Var, kl0.l) ? "reached_main_ui" : "unknown";
    }

    public final void a(Function1 function1) {
        v56 v56VarU = qs7.u();
        function1.invoke(new ak0(this.b, v56VarU));
        if (this.e.c(v56VarU)) {
            return;
        }
        new rml(Unit.a, this.a).a(new o5f((Object) this, (byte) 17)).m(this.d);
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
