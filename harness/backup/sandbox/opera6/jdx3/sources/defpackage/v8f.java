package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class v8f implements ati, clh {
    public final glh a;
    public final ode b = new ode();
    public final ArrayList c = new ArrayList();

    public v8f(glh glhVar) {
        this.a = glhVar;
        glhVar.f(new o8f(this, (byte) 1));
    }

    @Override // defpackage.clh
    public final void a() {
        this.a.f(new o8f(this, (byte) 1));
    }

    @Override // defpackage.clh
    public final void b(long j) {
        this.a.c(new az4(this, j, (byte) 2), j);
    }

    @Override // defpackage.clh
    public final void c(Collection collection) {
        h6 h6Var = new h6(collection, (byte) 1);
        ArrayList arrayList = this.c;
        o95.v(arrayList, h6Var);
        this.b.r(arrayList);
    }

    @Override // defpackage.clh
    public final void d(long j) {
        this.a.c(new az4(this, j, (byte) 2), j);
    }

    @Override // defpackage.clh
    public final void e(long j) {
        this.a.c(new az4(this, j, (byte) 2), j);
    }

    @Override // defpackage.ysi
    public final void g(esi esiVar) {
    }

    @Override // defpackage.ysi
    public final boolean i() {
        return true;
    }

    @Override // defpackage.ysi
    public final void l() {
        this.a.f(new o8f(this, (byte) 1));
    }

    @Override // defpackage.ysi
    public final ekc m() {
        return this.b;
    }

    @Override // defpackage.ati
    public final void remove(Object obj) {
        this.a.a(Collections.singletonList(Long.valueOf(((ilh) obj).a)), true);
    }
}
