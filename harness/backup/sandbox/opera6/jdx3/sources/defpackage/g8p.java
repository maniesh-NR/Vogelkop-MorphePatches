package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class g8p implements ooo {
    public View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ t8p c;

    public g8p(t8p t8pVar, View view) {
        this.c = t8pVar;
        this.b = view;
    }

    public final void a() {
        this.c.G = true;
    }

    public final void b() {
        View view = this.a;
        View view2 = this.b;
        if (view2 == view) {
            this.c.c.a(view2);
        }
    }

    public final void c() {
    }

    public final Integer d() {
        return null;
    }

    public final int e() {
        return 0;
    }

    public final boolean f() {
        return this.c.G;
    }

    public final int g() {
        return 2000;
    }

    public final int h() {
        return 50;
    }

    public final void i(View view) {
        t8p t8pVar = this.c;
        t8pVar.u(2);
        this.a = view;
        sc scVar = t8pVar.o;
        if (scVar != null) {
            scVar.h();
        }
    }
}
