package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class yln implements tjn {
    public final /* synthetic */ jvg a;
    public final /* synthetic */ bmn b;

    public yln(bmn bmnVar, jvg jvgVar) {
        this.a = jvgVar;
        this.b = bmnVar;
    }

    @Override // defpackage.tjn
    public final int a() {
        return this.b.g;
    }

    @Override // defpackage.tjn
    public final boolean d() {
        return this.b.b.g();
    }

    @Override // defpackage.tjn
    public final String e() {
        return this.b.b.i();
    }

    @Override // defpackage.tjn
    public final String f() {
        return this.b.b.f();
    }

    @Override // defpackage.tjn
    public final void i(View view) {
        Context context = view.getContext();
        jvg jvgVar = this.a;
        b8h.m(context, new s2g(jvgVar, view, (qf) jvgVar.b, (byte) 14));
    }

    @Override // defpackage.tjn
    public final void k(View view) {
        jvg jvgVar = this.a;
        bmn bmnVar = (bmn) jvgVar.c;
        bmnVar.f(ru0.e, null);
        ((qf) jvgVar.b).b();
        bmnVar.h();
    }

    @Override // defpackage.tjn
    public final void n(aln alnVar) {
        ((bmn) this.a.c).e(alnVar.getId());
    }
}
