package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class fth implements nx5, dth {
    public static final rh4 e = new rh4();
    public final CoroutineContext a;
    public final h b;
    public final fth c = this;
    public volatile CoroutineContext d;

    public fth(CoroutineContext coroutineContext, h hVar) {
        this.a = coroutineContext;
        this.b = hVar;
    }

    @Override // defpackage.dth
    public final void a() {
    }

    @Override // defpackage.dth
    public final void b() {
        d();
    }

    @Override // defpackage.dth
    public final void c() {
        d();
    }

    public final void d() {
        synchronized (this.c) {
            CoroutineContext coroutineContext = this.d;
            if (coroutineContext == null) {
                this.d = e;
            } else {
                o0g.q(coroutineContext, new kj9((byte) 0));
            }
        }
    }

    public final CoroutineContext l() {
        CoroutineContext coroutineContextPlus;
        rh4 rh4Var = this.d;
        if (rh4Var != null && rh4Var != e) {
            return rh4Var;
        }
        di5 di5Var = (di5) this.a.get(di5.b);
        eth ethVar = di5Var != null ? new eth(di5Var, this) : h.a;
        synchronized (this.c) {
            coroutineContextPlus = this.d;
            if (coroutineContextPlus == null) {
                CoroutineContext coroutineContext = this.a;
                coroutineContextPlus = coroutineContext.plus(new ynb(coroutineContext.get(ulp.h))).plus(this.b).plus(ethVar);
            } else if (coroutineContextPlus == e) {
                CoroutineContext coroutineContext2 = this.a;
                ynb ynbVar = new ynb(coroutineContext2.get(ulp.h));
                ynbVar.B(new kj9((byte) 0));
                coroutineContextPlus = coroutineContext2.plus(ynbVar).plus(this.b).plus(ethVar);
            }
            this.d = coroutineContextPlus;
        }
        return coroutineContextPlus;
    }
}
