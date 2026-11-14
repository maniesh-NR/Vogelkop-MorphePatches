package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.opera.android.Lazy;
import com.opera.android.settings.SettingsManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q0o extends l7n {
    public static final long k;
    public static final /* synthetic */ int l = 0;
    public final xbf b;
    public final pch c;
    public final tzn d;
    public pyl f;
    public boolean h;
    public boolean i;
    public boolean j;
    public final pde e = new pde(null);
    public List g = l08.a;

    static {
        on7 on7Var = pn7.b;
        k = cs5.x0(2, un7.e);
    }

    public q0o(xbf xbfVar, pch pchVar, tzn tznVar) {
        this.b = xbfVar;
        this.c = pchVar;
        this.d = tznVar;
    }

    public final void f() {
        if (((SharedPreferences) this.c.a.a.get()).getInt("pushed.sequence", 0) != 2 && this.f == null) {
            this.e.r(new k0o(j0o.a, false, new q0n((byte) 15), 2));
            return;
        }
        pyl pylVar = this.f;
        if (pylVar == null) {
            List listG = g();
            this.g = listG;
            pyl pylVar2 = new pyl(listG, (Bundle) null);
            this.f = pylVar2;
            pylVar2.r(p7n.a(this));
            pylVar = pylVar2;
        }
        na2.B(p7n.a(this), (CoroutineContext) null, (rx5) null, new cek(pylVar, this, (mt5) null, (byte) 10), 3);
    }

    public final List g() {
        jjg jjgVar = new jjg(this, (byte) 17);
        xbf xbfVar = this.b;
        r65 r65Var = (r65) xbfVar.b;
        e0o e0oVar = new e0o(r65Var, (sdf) xbfVar.e, (SettingsManager) xbfVar.f, jjgVar);
        i0o i0oVar = new i0o(r65Var, (t1) xbfVar.d, (Lazy) xbfVar.g);
        m0o m0oVar = m0o.a;
        m0o m0oVar2 = m0o.b;
        c0o c0oVar = (c0o) xbfVar.c;
        Class<c0o> cls = c0o.class;
        int i = 0;
        int i2 = 0;
        return Arrays.asList(new o0o(m0oVar, (List) null, Arrays.asList(new o0o(m0oVar2, Arrays.asList(new cfn(0, c0oVar, cls, "isFirstRun", "isFirstRun()Z", 0, (byte) 7), new cfn(0, c0oVar, cls, "canOfferDefaultBrowser", "canOfferDefaultBrowser()Z", i, (byte) 8)), (List) null, (Function1) null, (xm6) null, 28), new o0o(m0o.c, Arrays.asList(new cfn(i2, c0oVar, cls, "isFirstRun", "isFirstRun()Z", i, (byte) 9), new cfn(i2, c0oVar, cls, "needsNotificationPermission", "needsNotificationPermission()Z", i, (byte) 10), new cfn(i2, c0oVar, cls, "isNotificationOnboardingEnabled", "isNotificationOnboardingEnabled()Z", i, (byte) 11)), (List) null, (Function1) null, (xm6) null, 28), new o0o(m0o.d, Collections.singletonList(new cfn(0, c0oVar, cls, "isCmpIntroductionDue", "isCmpIntroductionDue()Z", i, (byte) 12)), (List) null, (Function1) null, (xm6) null, 28)), new lrk(1, g0o.a, g0o.class, "screen", "screen(Lcom/opera/android/startup/WelcomeOnboardingContext;)Lcom/opera/android/startup/WelcomeOnboardingScreen;", 0, (byte) 23), (xm6) null, 18), new o0o(m0o.e, Collections.singletonList(new cfn(0, e0oVar, e0o.class, "shouldShow", "shouldShow()Z", 0, (byte) 13)), (List) null, new lrk(1, e0oVar, e0o.class, "screen", "screen(Lcom/opera/android/startup/WelcomeOnboardingContext;)Lcom/opera/android/startup/WelcomeOnboardingScreen;", 0, (byte) 24), (xm6) null, 20), new o0o(m0o.f, Collections.singletonList(new cfn(0, i0oVar, i0o.class, "shouldShow", "shouldShow()Z", 0, (byte) 6)), (List) null, new lrk(1, i0oVar, i0o.class, "screen", "screen(Lcom/opera/android/startup/WelcomeOnboardingContext;)Lcom/opera/android/startup/WelcomeOnboardingScreen;", 0, (byte) 22), new xm6(1, i0oVar, i0o.class, "preload", "preload(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, (byte) 3), 4));
    }
}
