package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class isj implements btj, w6f {
    public final esk a;
    public final esk b;
    public final i7f c = new i7f();
    public hsj d;
    public mim e;
    public boolean f;

    public isj(esk eskVar, esk eskVar2) {
        this.a = eskVar;
        this.b = eskVar2;
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.c.b((n9l) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.c.c((n9l) obj);
    }

    @Override // defpackage.btj
    public final void I() {
        hsj hsjVar = this.d;
        if (hsjVar != null) {
            o93 o93Var = hsjVar.b;
            o93Var.b(hjm.b, 3);
            this.d = null;
            g7f g7fVar = new g7f(this.c);
            while (g7fVar.hasNext()) {
                n9l n9lVar = (n9l) g7fVar.next();
                if (n9lVar.a.remove(o93Var)) {
                    n9lVar.a();
                }
            }
        }
    }

    public final void a(o93 o93Var) {
        hsj hsjVar = this.d;
        if (hsjVar == null || hsjVar.b != o93Var) {
            return;
        }
        hsjVar.a.a();
        this.d = null;
        g7f g7fVar = new g7f(this.c);
        while (g7fVar.hasNext()) {
            n9l n9lVar = (n9l) g7fVar.next();
            if (n9lVar.a.remove(o93Var)) {
                n9lVar.a();
            }
        }
        mim mimVar = this.e;
        if (mimVar != null) {
            this.e = null;
            mimVar.run();
        }
    }

    public final hsj b(o93 o93Var) {
        gtj gtjVarE = o93Var.e((ViewGroup) this.a.get());
        gtjVarE.a.a(new pt(o93Var, (byte) 1));
        asj asjVar = gtjVarE.a;
        if (asjVar.c() == null) {
            View view = (View) this.b.get();
            fsj fsjVar = gtjVarE.d;
            if (fsjVar == null) {
                asjVar.f(view);
            } else if (!Intrinsics.a(view, fsjVar.c)) {
                fsjVar.c = view;
                fsjVar.b.postOnAnimation(new csj(fsjVar, (byte) 0));
            }
        }
        if (this.f && gtjVarE.d == null) {
            gtjVarE.d = new fsj(asjVar, gtjVarE.b);
        }
        this.d = new hsj(gtjVarE, o93Var);
        g7f g7fVar = new g7f(this.c);
        while (g7fVar.hasNext()) {
            n9l n9lVar = (n9l) g7fVar.next();
            n9lVar.a.add(o93Var);
            n9lVar.a();
        }
        return this.d;
    }

    @Override // defpackage.btj
    public final int z(o93 o93Var, mim mimVar) {
        if (this.d != null) {
            this.e = mimVar;
            return 2;
        }
        b(o93Var);
        return 1;
    }
}
