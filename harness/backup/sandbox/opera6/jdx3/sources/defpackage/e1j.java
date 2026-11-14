package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class e1j extends lim implements p5j, hxl {
    public boolean a;
    public final /* synthetic */ f1j b;

    public e1j(f1j f1jVar) {
        this.b = f1jVar;
        boolean zB = f1jVar.b();
        this.a = zB;
        boolean z = zB && f1jVar.a();
        fp1 fp1Var = f1jVar.a;
        fp1Var.getPackageManager().setComponentEnabledSetting(new ComponentName((Context) fp1Var, "com.opera.android.MyFlowSendActivity"), z ? 1 : 2, 1);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        f1j f1jVar;
        boolean zB;
        if (!"my_flow_visible".equals(str) || this.a == (zB = (f1jVar = this.b).b())) {
            return;
        }
        this.a = zB;
        fp1 fp1Var = f1jVar.a;
        fp1Var.getPackageManager().setComponentEnabledSetting(new ComponentName((Context) fp1Var, "com.opera.android.MyFlowSendActivity"), zB ? 1 : 2, 1);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        f1j f1jVar = this.b;
        f1jVar.d.F(this);
        f1jVar.c.F(this);
    }

    @Override // defpackage.hxl
    public final void i() {
        f1j f1jVar = this.b;
        boolean zB = f1jVar.b();
        if (this.a == zB) {
            return;
        }
        this.a = zB;
        fp1 fp1Var = f1jVar.a;
        fp1Var.getPackageManager().setComponentEnabledSetting(new ComponentName((Context) fp1Var, "com.opera.android.MyFlowSendActivity"), zB ? 1 : 2, 1);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        f1j f1jVar = this.b;
        f1jVar.d.H(this);
        f1jVar.c.H(this);
    }

    @Override // defpackage.hxl
    public final void x(int i) {
        f1j f1jVar = this.b;
        boolean zB = f1jVar.b();
        if (this.a == zB) {
            return;
        }
        this.a = zB;
        fp1 fp1Var = f1jVar.a;
        fp1Var.getPackageManager().setComponentEnabledSetting(new ComponentName((Context) fp1Var, "com.opera.android.MyFlowSendActivity"), zB ? 1 : 2, 1);
    }

    @Override // defpackage.hxl
    public final void z() {
    }
}
