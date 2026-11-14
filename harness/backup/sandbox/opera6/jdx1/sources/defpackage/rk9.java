package defpackage;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rk9 extends tk9 {
    public final /* synthetic */ jr9 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ rh c;
    public final /* synthetic */ ph d;
    public final /* synthetic */ Fragment e;

    public rk9(Fragment fragment, jr9 jr9Var, AtomicReference atomicReference, rh rhVar, ph phVar) {
        this.e = fragment;
        this.a = jr9Var;
        this.b = atomicReference;
        this.c = rhVar;
        this.d = phVar;
    }

    @Override // defpackage.tk9
    public final void a() {
        Fragment fragment = this.e;
        this.b.set(((zh) this.a.mo17apply(null)).d(fragment.generateActivityResultKey(), fragment, this.c, this.d));
    }
}
