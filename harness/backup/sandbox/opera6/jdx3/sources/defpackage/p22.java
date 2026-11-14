package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class p22 implements v5n {
    public final /* synthetic */ x22 a;

    public p22(x22 x22Var) {
        this.a = x22Var;
    }

    @Override // defpackage.v5n
    public final void a(long j, String str, Uri uri) {
        x22 x22Var = this.a;
        r22 r22Var = x22Var.n;
        vsn vsnVarG = r22Var != null ? r22Var.g() : null;
        if (vsnVarG == null || !ju4.a(j, vsnVarG.c.d().g())) {
            return;
        }
        x22Var.l.i(str);
        vsnVarG.d(str.length() > 0);
        vsnVarG.a(uri);
    }

    @Override // defpackage.v5n
    public final void b(long j, String str) {
        x22 x22Var = this.a;
        r22 r22Var = x22Var.n;
        vsn vsnVarG = r22Var != null ? r22Var.g() : null;
        if (vsnVarG == null || !ju4.a(j, vsnVarG.c.d().g())) {
            return;
        }
        x22Var.l.i(str);
        vsnVarG.d(str.length() > 0);
        vsnVarG.h(ux1.c, false, new o22(x22Var, (byte) 0));
    }

    @Override // defpackage.v5n
    public final void c(long j, String str) {
        x22 x22Var = this.a;
        r22 r22Var = x22Var.n;
        vsn vsnVarG = r22Var != null ? r22Var.g() : null;
        if (vsnVarG == null || !ju4.a(j, vsnVarG.c.d().g())) {
            return;
        }
        x22Var.l.i(str);
        vsnVarG.d(str.length() > 0);
        vsnVarG.i(ux1.c);
    }

    @Override // defpackage.v5n
    public final void d(String str) {
        x22 x22Var = this.a;
        r22 r22Var = x22Var.n;
        vsn vsnVarG = r22Var != null ? r22Var.g() : null;
        if (vsnVarG == null) {
            return;
        }
        x22Var.l.i(str);
        vsnVarG.d(str.length() > 0);
    }
}
