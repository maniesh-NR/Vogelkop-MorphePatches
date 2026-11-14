package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.browser.SimpleUrlLoader;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class l12 implements r12 {
    public final /* synthetic */ pjn a;
    public final /* synthetic */ String b;
    public final /* synthetic */ p12 c;
    public final /* synthetic */ WebContents d;

    public l12(pjn pjnVar, String str, p12 p12Var, WebContents webContents) {
        this.a = pjnVar;
        this.b = str;
        this.c = p12Var;
        this.d = webContents;
    }

    @Override // defpackage.r12
    public final void a() {
        Context context = (Context) this.c.a;
        boolean zM = this.d.m();
        ab abVar = new ab(this, (byte) 14);
        SimpleUrlLoader.a(this.b, "User-Agent: " + cqp.i0(), null).b(zM, new eb(context, abVar, (byte) 2), new wa(abVar, (byte) 4));
    }

    @Override // defpackage.r12
    public final void b() {
        p12 p12Var = this.c;
        Context context = (Context) p12Var.a;
        boolean zM = this.d.m();
        su suVar = new su(this, p12Var, this.a, (byte) 6);
        SimpleUrlLoader.a(this.b, "User-Agent: " + cqp.i0(), null).b(zM, new eb(context, suVar, (byte) 2), new wa(suVar, (byte) 4));
    }

    @Override // defpackage.r12
    public final void c() {
        zz1 zz1Var = (zz1) ((u02) this.a.b).o;
        if (zz1Var != null) {
            int i = zz1.m;
            zz1Var.d(this.b, false);
        }
    }

    @Override // defpackage.r12
    public final void d() {
        Context context = (Context) this.c.a;
        boolean zM = this.d.m();
        wx wxVar = new wx(this.a, context, (byte) 8);
        SimpleUrlLoader.a(this.b, "User-Agent: " + cqp.i0(), null).b(zM, new eb(context, wxVar, (byte) 2), new wa(wxVar, (byte) 4));
    }

    @Override // defpackage.r12
    public final void e() {
        Context context = (Context) this.c.a;
        boolean zM = this.d.m();
        k12 k12Var = new k12(this.a, (byte) 0);
        SimpleUrlLoader.a(this.b, "User-Agent: " + cqp.i0(), null).b(zM, new eb(context, k12Var, (byte) 2), new wa(k12Var, (byte) 4));
    }

    @Override // defpackage.r12
    public final void f() {
        N.M8vd_RmR(this.d, this.b, "");
    }
}
