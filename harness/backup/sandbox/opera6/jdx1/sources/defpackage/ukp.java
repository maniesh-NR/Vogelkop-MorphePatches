package defpackage;

import ads_mobile_sdk.pd;
import ads_mobile_sdk.tt0;
import ads_mobile_sdk.wt0;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class ukp implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt0 b;
    public final /* synthetic */ c5j c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ ukp(wt0 wt0Var, c5j c5jVar, int i, long j, byte b) {
        this.a = b;
        this.b = wt0Var;
        this.c = c5jVar;
        this.d = i;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar;
        switch (this.a) {
            case 0:
                wt0 wt0Var = this.b;
                wt0Var.c.execute(new ukp(wt0Var, this.c, this.d, this.e, (byte) 1));
                break;
            default:
                c5j c5jVar = this.c;
                wt0 wt0Var2 = this.b;
                Context context = wt0Var2.a;
                try {
                    try {
                        pdVar = (pd) new tt0(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode)).d.poll(5000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        pdVar = null;
                    }
                    if (pdVar == null) {
                        k3p k3pVarW = pd.w();
                        k3pVarW.b(32768L);
                        pdVar = (pd) k3pVarW.a();
                    }
                    if (!pdVar.u() || pdVar.q() != 32768) {
                        c5jVar.set(pdVar);
                        break;
                    }
                } catch (Throwable unused2) {
                }
                int i = this.d;
                if (i >= 3) {
                    c5jVar.set((Object) null);
                    break;
                } else {
                    long j = i == 1 ? 100L : this.e << 1;
                    ukp ukpVar = new ukp(wt0Var2, c5jVar, i + 1, j, (byte) 0);
                    if (j <= 0) {
                        ukpVar.run();
                        break;
                    } else {
                        wt0Var2.g.a(ukpVar, j);
                        break;
                    }
                }
                break;
        }
    }
}
