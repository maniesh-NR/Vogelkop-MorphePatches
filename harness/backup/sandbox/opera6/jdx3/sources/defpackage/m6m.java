package defpackage;

import android.net.Uri;
import com.leanplum.internal.Clock;
import com.leanplum.internal.Constants;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m6m {
    public final b59 a;
    public final x5f b;
    public dpj c;
    public qq8 d;
    public k6m e;
    public boolean f;
    public boolean g;
    public final lg h;
    public final q6e i;
    public final SettingsManager j;
    public final xnh k;
    public final l6m l;
    public final l6m m;
    public final j25 n;
    public final kv1 o;
    public int p;

    /* JADX WARN: Multi-variable type inference failed */
    public m6m(BrowserActivity browserActivity, lg lgVar) {
        this.a = w1h.l(browserActivity, vml.d, "trending-topics", new bg1[0]);
        String[] strArr = OperaApplication.K;
        this.b = ((OperaApplication) browserActivity.getApplicationContext()).L().c;
        j25 j25Var = new j25(this, (byte) 7);
        this.n = j25Var;
        kv1 kv1Var = new kv1(this, (byte) 4);
        this.o = kv1Var;
        this.h = lgVar;
        q6e q6eVarI = ((OperaApplication) browserActivity.getApplicationContext()).I();
        this.i = q6eVarI;
        SettingsManager settingsManagerJ = ((OperaApplication) browserActivity.getApplicationContext()).J();
        this.j = settingsManagerJ;
        xnh xnhVarT = xnh.t(browserActivity);
        this.k = xnhVarT;
        bml bmlVarU = bml.u(browserActivity);
        l6m l6mVar = new l6m(this, xnhVarT);
        this.l = l6mVar;
        l6m l6mVar2 = new l6m(this, bmlVarU);
        this.m = l6mVar2;
        xnhVarT.F(l6mVar);
        bmlVarU.F(l6mVar2);
        q6eVarI.F(kv1Var);
        settingsManagerJ.F(j25Var);
    }

    public final void a(boolean z) {
        int i = 0;
        if (this.j.i("enable_trending_searches") && !gco.a(this.i.b()) && this.l.a && ((wnh) this.k.i()).a(64)) {
            i = 1;
        }
        int i2 = this.p;
        dpj dpjVar = null;
        if (i == i2) {
            if (z) {
                if (i2 != 0 && vep.A(i2) == 0) {
                    dpjVar = new dpj((byte) 6);
                }
                this.c = dpjVar;
                if (this.f) {
                    b(true);
                    return;
                } else {
                    this.g = true;
                    return;
                }
            }
            return;
        }
        if (i2 != 0) {
            z = true;
        }
        this.p = i;
        if (i != 0 && vep.A(i) == 0) {
            dpjVar = new dpj((byte) 6);
        }
        this.c = dpjVar;
        if (this.f) {
            b(z);
        } else if (z) {
            this.g = true;
        }
    }

    public final void b(boolean z) {
        this.f = true;
        if (this.c != null) {
            if (this.g) {
                this.g = false;
                z = true;
            }
            String lowerCase = Locale.getDefault().getCountry().toLowerCase(Locale.US);
            this.c.getClass();
            String strB = vsi.b();
            k6m k6mVar = new k6m(lowerCase, strB);
            if (!z) {
                if (k6mVar.equals(this.e)) {
                    return;
                }
                qq8 qq8Var = this.d;
                if (qq8Var != null && k6mVar.equals((k6m) qq8Var.c)) {
                    qq8 qq8Var2 = this.d;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = qq8Var2.a;
                    if (j > jCurrentTimeMillis && j <= jCurrentTimeMillis + Clock.DAY_MILLIS) {
                        return;
                    }
                }
            }
            this.e = k6mVar;
            dpj dpjVar = this.c;
            n9h n9hVar = new n9h(this, k6mVar, (byte) 10);
            dpjVar.getClass();
            Uri uriBuild = new Uri.Builder().scheme("https").authority("www.google.com").path("complete/search").appendQueryParameter(Constants.Params.CLIENT, "opera-mobile").appendQueryParameter("hl", strB).appendQueryParameter("gl", lowerCase).appendQueryParameter("q", "").build();
            t9f t9fVar = (t9f) xne.b.get();
            fvh fvhVar = new fvh();
            fvhVar.h(uriBuild.toString());
            fvhVar.b(e74.o);
            t9fVar.c(new kvh(fvhVar)).enqueue(new qsh(dpjVar, n9hVar));
        }
    }
}
