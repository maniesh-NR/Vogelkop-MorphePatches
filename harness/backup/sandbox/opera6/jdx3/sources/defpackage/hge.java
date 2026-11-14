package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class hge implements hxl {
    public final bf9 a;
    public final SettingsManager b;
    public final x5f c;
    public wi0 d;

    public hge(bf9 bf9Var, SettingsManager settingsManager, x5f x5fVar) {
        this.a = bf9Var;
        this.b = settingsManager;
        this.c = x5fVar;
        settingsManager.F(new s9(this, (byte) 23));
        bf9Var.F(this);
    }

    public final void a() {
        bf9 bf9Var = this.a;
        wi0 wi0Var = (!bf9Var.t() || bf9Var.r() < 2) ? wi0.d : this.b.i("my_flow_visible") ? wi0.b : wi0.c;
        if (wi0Var != this.d) {
            this.d = wi0Var;
            x5f x5fVar = this.c;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                b66 b66VarF = x56VarF.F(zpaVar);
                b66VarF.getClass();
                b66VarF.q(55, 1, wi0Var);
                x5fVar.U0(x56VarF);
            }
        }
    }

    @Override // defpackage.hxl
    public final void i() {
        a();
    }

    @Override // defpackage.hxl
    public final void x(int i) {
        a();
    }

    @Override // defpackage.hxl
    public final void z() {
    }
}
