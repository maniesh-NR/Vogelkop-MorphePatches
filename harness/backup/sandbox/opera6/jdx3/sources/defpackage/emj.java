package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class emj extends a7f {
    public Object c;
    public Object d;
    public tee e;
    public tee f;
    public or4 g;
    public final tji h = new tji((Object) this, (byte) 19);
    public final txi i;

    public emj() {
        nqi nqiVar = new nqi((Object) this, (byte) 7);
        ytj.b(ytj.a);
        synchronized (ytj.c) {
            ytj.h = CollectionsKt.W(nqiVar, ytj.h);
        }
        this.i = new txi(nqiVar, (byte) 8);
    }

    @Override // defpackage.a7f
    public final void b(or4 or4Var) {
        this.d = null;
        this.f = null;
    }

    @Override // defpackage.a7f
    public final void c() {
        synchronized (this.b) {
            this.c = this.d;
            if (this.f == null) {
                this.e = null;
            } else {
                tee teeVar = this.e;
                if (teeVar == null) {
                    tee teeVar2 = jmi.a;
                    teeVar = new tee();
                    this.e = teeVar;
                }
                this.e = this.f;
                this.f = teeVar;
            }
        }
    }

    @Override // defpackage.a7f
    public final void d() {
        this.i.d();
        this.d = null;
        this.f = null;
        synchronized (this.b) {
            this.g = null;
            this.c = null;
            this.e = null;
        }
    }

    @Override // defpackage.a7f
    public final Function1 e(or4 or4Var) {
        or4 or4Var2 = this.g;
        if (or4Var2 != null && !or4Var2.equals(or4Var)) {
            bpg.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.g = or4Var;
        return this.h;
    }

    @Override // defpackage.a7f
    public final void f(or4 or4Var) {
        this.g = null;
        this.d = null;
        this.f = null;
        c();
    }
}
