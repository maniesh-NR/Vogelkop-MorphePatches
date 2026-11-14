package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class y4g extends lim {
    public final /* synthetic */ byte a;
    public final x5f b;
    public final w6f c;
    public final Object d;
    public final Object e;
    public Object f;

    public y4g(BrowserActivity browserActivity, ydn ydnVar, qim qimVar, x5f x5fVar, tcc tccVar) {
        this.a = (byte) 1;
        this.e = new gzg(this, (byte) 2);
        this.c = ydnVar;
        this.d = qimVar;
        this.b = x5fVar;
        tccVar.a(this);
    }

    public y4g(zwk zwkVar, SettingsManager settingsManager, x5f x5fVar) {
        this.a = (byte) 0;
        this.e = new x4g(this);
        this.f = new j25(this, (byte) 4);
        this.c = zwkVar;
        this.d = settingsManager;
        this.b = x5fVar;
    }

    public final void R() {
        ydn ydnVar = (ydn) this.c;
        if (bg7.b(ydnVar) == 0) {
            bg7 bg7Var = (bg7) this.f;
            if (bg7Var != null) {
                bg7Var.finish(hjm.b);
                this.f = null;
                return;
            }
            return;
        }
        qim qimVar = (qim) this.d;
        if (((bg7) this.f) == null) {
            bg7 bg7Var2 = new bg7(this, ydnVar, qimVar, this.b);
            this.f = bg7Var2;
            z77 z77Var = qimVar.c;
            z77Var.getClass();
            z77Var.b(bg7Var2, ijm.b);
        }
    }

    public final void S() {
        if (((zwk) this.c).b) {
            boolean zC = zwk.c(3);
            boolean z = ((SettingsManager) this.d).i("enable_sync") && zwk.f();
            x5f x5fVar = this.b;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                b66 b66VarF = x56VarF.F(zpaVar);
                if (z) {
                    im0 im0Var = zC ? im0.b : im0.c;
                    b66VarF.getClass();
                    b66VarF.q(30, 1, im0Var);
                } else {
                    b66VarF.getClass();
                    b66VarF.q(30, 1, im0.d);
                }
                x5fVar.U0(x56VarF);
            }
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        switch (this.a) {
            case 0:
                ((zwk) this.c).F((x4g) this.e);
                ((SettingsManager) this.d).F((j25) this.f);
                S();
                break;
            default:
                ((ydn) this.c).F((gzg) this.e);
                break;
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.e;
        w6f w6fVar = this.c;
        switch (b) {
            case 0:
                ndcVar.getLifecycle().b(this);
                ((zwk) w6fVar).H((x4g) obj);
                ((SettingsManager) this.d).H((j25) this.f);
                break;
            default:
                ndcVar.getLifecycle().b(this);
                ((ydn) w6fVar).H((gzg) obj);
                break;
        }
    }
}
