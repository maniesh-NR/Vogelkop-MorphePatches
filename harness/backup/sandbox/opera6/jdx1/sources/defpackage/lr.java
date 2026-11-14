package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class lr implements mc4 {
    public final mc4 b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lr(mc4 mc4Var) {
        this(mc4Var, (byte) 0);
        this.c = (byte) 0;
        this.d = mc4Var;
    }

    public lr(mc4 mc4Var, byte b) {
        this.b = mc4Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lr(mc4 mc4Var, txi txiVar) {
        this(mc4Var, (byte) 0);
        this.c = (byte) 1;
        this.d = txiVar;
    }

    @Override // defpackage.mc4
    public final void a(q3j q3jVar) {
        this.b.a(q3jVar);
    }

    @Override // defpackage.mc4
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.mc4
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.mc4
    public final ListenableFuture d(float f) {
        switch (this.c) {
            case 0:
                return ((mc4) this.d).d(f);
            default:
                return this.b.d(f);
        }
    }

    @Override // defpackage.mc4
    public final void e(tj5 tj5Var) {
        this.b.e(tj5Var);
    }

    @Override // defpackage.mc4
    public final ListenableFuture f(float f) {
        switch (this.c) {
            case 0:
                return ((mc4) this.d).f(f);
            default:
                return this.b.f(f);
        }
    }

    @Override // defpackage.mc4
    public final void g(int i) {
        this.b.g(i);
    }

    @Override // defpackage.mc4
    public final void h(cwa cwaVar) {
        this.b.h(cwaVar);
    }

    @Override // defpackage.mc4
    public final ListenableFuture i(bx7 bx7Var) {
        switch (this.c) {
            case 0:
                return ((mc4) this.d).i(bx7Var);
            default:
                return this.b.i(bx7Var);
        }
    }

    @Override // defpackage.mc4
    public final ListenableFuture j(boolean z) {
        switch (this.c) {
            case 0:
                return ((mc4) this.d).j(z);
            default:
                return this.b.j(z);
        }
    }

    @Override // defpackage.mc4
    public final tj5 k() {
        return this.b.k();
    }

    @Override // defpackage.mc4
    public final void l() {
        this.b.l();
    }

    @Override // defpackage.mc4
    public final ListenableFuture m(ArrayList arrayList, int i, int i2) {
        byte b = this.c;
        mc4 mc4Var = this.b;
        switch (b) {
            case 1:
                jpo.i("Only support one capture config.", arrayList.size() == 1);
                ListenableFuture listenableFutureO = mc4Var.o(i);
                return new ohc(new ArrayList(Collections.singletonList(k1g.i0(k1g.i0(k1g.i0(sr9.a(listenableFutureO), new ur9(listenableFutureO, (byte) 1), n97.a()), new roj(this, arrayList, (byte) 10), n97.a()), new ur9(listenableFutureO, (byte) 2), n97.a()))), true, n97.a());
            default:
                return mc4Var.m(arrayList, i, i2);
        }
    }

    @Override // defpackage.mc4
    public final void n() {
        this.b.n();
    }

    @Override // defpackage.mc4
    public final ListenableFuture o(int i) {
        return this.b.o(i);
    }
}
