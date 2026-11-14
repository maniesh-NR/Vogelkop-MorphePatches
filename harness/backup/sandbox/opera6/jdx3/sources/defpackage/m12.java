package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class m12 implements r12 {
    public final d5o a;
    public final /* synthetic */ p12 b;
    public final /* synthetic */ u59 c;
    public final /* synthetic */ qs5 d;
    public final /* synthetic */ WebContents e;

    public m12(p12 p12Var, k73 k73Var, u59 u59Var, qs5 qs5Var, WebContents webContents) {
        this.b = p12Var;
        this.c = u59Var;
        this.d = qs5Var;
        this.e = webContents;
        this.a = new d5o((Context) p12Var.a, (gjm) p12Var.b, k73Var);
    }

    @Override // defpackage.r12
    public final void a() {
        d5o d5oVar = this.a;
        ((k73) d5oVar.c).t(new ge5(d5oVar, new ds5(d5oVar, (byte) 0), (byte) 1));
    }

    @Override // defpackage.r12
    public final void b() {
        ((qsh) this.b.d).c(Uri.parse(this.d.e), new ab(this.c, (byte) 15));
    }

    @Override // defpackage.r12
    public final void c() {
        String str = this.d.e;
        zz1 zz1Var = (zz1) ((s62) this.c.b).v.o;
        if (zz1Var != null) {
            int i = zz1.m;
            zz1Var.d(str, false);
        }
    }

    @Override // defpackage.r12
    public final void d() {
        d5o d5oVar = this.a;
        ((k73) d5oVar.c).t(new ge5(d5oVar, new ds5(d5oVar, (byte) 2), (byte) 1));
    }

    @Override // defpackage.r12
    public final void e() {
        d5o d5oVar = this.a;
        ((k73) d5oVar.c).v(2048, ks5.PNG, new ds5(d5oVar, (byte) 1));
    }

    @Override // defpackage.r12
    public final void f() {
        qs5 qs5Var = this.d;
        String str = qs5Var.e;
        sqh sqhVar = qs5Var.k;
        String str2 = sqhVar != null ? sqhVar.a : null;
        if (str2 == null) {
            str2 = "";
        }
        N.M8vd_RmR(this.e, str, str2);
    }
}
