package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class sn9 implements n7a, rki, w7n {
    public final Fragment a;
    public final v7n b;
    public final ld9 c;
    public qdc d = null;
    public qki e = null;

    public sn9(Fragment fragment, v7n v7nVar, ld9 ld9Var) {
        this.a = fragment;
        this.b = v7nVar;
        this.c = ld9Var;
    }

    public final void a(occ occVar) {
        this.d.e(occVar);
    }

    public final void b() {
        if (this.d == null) {
            this.d = new qdc(this, true);
            ijd ijdVar = new ijd(this, new j3i(this, (byte) 8));
            this.e = new qki(ijdVar);
            ijdVar.b();
            this.c.run();
        }
    }

    public final g06 getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        dde ddeVar = new dde(0);
        if (application != null) {
            ddeVar.a(q7n.d, application);
        }
        ddeVar.a(kki.a, fragment);
        ddeVar.a(kki.b, this);
        if (fragment.getArguments() != null) {
            ddeVar.a(kki.c, fragment.getArguments());
        }
        return ddeVar;
    }

    @Override // defpackage.ndc
    public final tcc getLifecycle() {
        b();
        return this.d;
    }

    @Override // defpackage.rki
    public final pki getSavedStateRegistry() {
        b();
        return this.e.b;
    }

    @Override // defpackage.w7n
    public final v7n getViewModelStore() {
        b();
        return this.b;
    }
}
