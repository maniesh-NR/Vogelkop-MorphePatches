package defpackage;

import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class kcf {
    public final Runnable a;
    public final ip1 b;
    public boolean c;
    public final zyk d = z4c.b(new d8e(this, (byte) 9));

    public kcf(Runnable runnable, ip1 ip1Var) {
        this.a = runnable;
        this.b = ip1Var;
    }

    public final void a(ndc ndcVar, gcf gcfVar) {
        tcc lifecycle = ndcVar.getLifecycle();
        if (((qdc) lifecycle).i == qcc.a) {
            return;
        }
        fcf fcfVarCreateNavigationEventHandler$activity = gcfVar.createNavigationEventHandler$activity(new hcf(ndcVar, gcfVar));
        fcfVarCreateNavigationEventHandler$activity.g(false);
        xje.a(c().c, fcfVarCreateNavigationEventHandler$activity);
        jcf jcfVar = new jcf(fcfVarCreateNavigationEventHandler$activity, this, lifecycle);
        lifecycle.a(jcfVar);
        gcfVar.addCloseable$activity(jcfVar);
    }

    public final void b(gcf gcfVar) {
        xje.a(c().c, gcfVar.createNavigationEventHandler$activity(new hcf(null, gcfVar)));
    }

    public final icf c() {
        return (icf) this.d.getValue();
    }

    public final void d() {
        c().b();
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().c.c(new ccf(onBackInvokedDispatcher, 0), 1);
        c().c.c(new ccf(onBackInvokedDispatcher, 1000000), 0);
    }
}
