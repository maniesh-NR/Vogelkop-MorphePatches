package defpackage;

import J.N;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y73 extends lim {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;

    public /* synthetic */ y73() {
        this.a = (byte) 3;
    }

    public /* synthetic */ y73(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    public y73(jh3 jh3Var, tcc tccVar, qp2 qp2Var) {
        this.a = (byte) 0;
        this.c = new yqa((byte) 10);
        N.MwwLnzkg(new b83(this, (byte) 1), new ArrayList());
        tccVar.a(this);
    }

    public y73(rld rldVar, tcc tccVar) {
        this.a = (byte) 4;
        this.c = rldVar;
        tccVar.a(this);
        this.b = true;
    }

    public y73(tc6 tc6Var, boolean z) {
        this.a = (byte) 1;
        this.b = z;
        this.c = tc6Var;
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        switch (this.a) {
            case 0:
                ndcVar.getLifecycle().b(this);
                this.b = true;
                yqa yqaVar = (yqa) this.c;
                a4g a4gVar = (a4g) yqaVar.c;
                yqaVar.q(null);
                if (a4gVar != null) {
                    a4gVar.a();
                    break;
                }
                break;
            default:
                super.onDestroy(ndcVar);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        switch (this.a) {
            case 2:
                this.b = false;
                ((xw8) this.c).d();
                break;
            case 3:
                this.b = false;
                break;
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        switch (this.a) {
            case 2:
                this.b = true;
                ((xw8) this.c).d();
                break;
            case 3:
                this.b = true;
                gl6 gl6Var = (gl6) this.c;
                if (gl6Var != null) {
                    this.c = null;
                    gl6Var.run();
                    break;
                }
                break;
            case 4:
                if (this.b) {
                    ndcVar.getLifecycle().b(this);
                    break;
                }
                break;
            case 5:
                if (!this.b) {
                    this.b = true;
                    slk slkVar = (slk) this.c;
                    new r62(slkVar.h, new eof(slkVar, new o8f(this, (byte) 23), (byte) 23), (byte) 1);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        switch (this.a) {
            case 1:
                tc6 tc6Var = (tc6) this.c;
                ydn ydnVar = tc6Var.v;
                SettingsManager settingsManager = tc6Var.u;
                ndcVar.getLifecycle().b(this);
                if (this.b && !ydnVar.d.a) {
                    settingsManager.V(1, "compression");
                }
                jjm b76Var = settingsManager.i("compression") ? new b76((byte) 1) : new tf7(tc6Var.w, settingsManager, ydnVar);
                z77 z77Var = tc6Var.y;
                z77Var.getClass();
                z77Var.b(b76Var, ijm.b);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        switch (this.a) {
            case 4:
                rld rldVar = (rld) this.c;
                xbf xbfVar = rldVar.n;
                if (xbfVar != null) {
                    ((gig) ((ode) xbfVar.c).g()).pause();
                    rldVar.q.n((pod) rldVar.n.d);
                }
                ndcVar.getLifecycle().b(this);
                break;
        }
    }
}
