package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class va6 extends lim implements mzk, cll {
    public final x5f a;
    public final SettingsManager b;
    public final dll c;
    public final nzk d;
    public boolean e;

    public va6(x5f x5fVar, SettingsManager settingsManager, dll dllVar, nzk nzkVar) {
        this.a = x5fVar;
        this.b = settingsManager;
        this.c = dllVar;
        this.d = nzkVar;
    }

    @Override // defpackage.cll
    public final void K() {
        boolean zP = this.b.P(this.d);
        if (this.e != zP) {
            this.e = zP;
            x5f x5fVar = this.a;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                am2.g(zpaVar, x56VarF).b.r(24, 1, zP);
                x5fVar.U0(x56VarF);
            }
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        SettingsManager settingsManager = this.b;
        nzk nzkVar = this.d;
        boolean zP = settingsManager.P(nzkVar);
        this.e = zP;
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            am2.g(zpaVar, x56VarF).b.r(24, 1, zP);
            x5fVar.U0(x56VarF);
        }
        boolean z = nzkVar.a;
        if (x5fVar.h) {
            zpa zpaVar2 = x5fVar.d;
            x56 x56VarF2 = zpa.F();
            x56VarF2.J(zpaVar2).r(8, 1, z);
            x5fVar.U0(x56VarF2);
        }
        this.c.F(this);
        nzkVar.b.b(this);
    }

    @Override // defpackage.mzk
    public final void k(boolean z) {
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.J(zpaVar).r(8, 1, z);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.c.H(this);
        this.d.b.c(this);
    }
}
