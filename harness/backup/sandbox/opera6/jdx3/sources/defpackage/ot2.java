package defpackage;

import androidx.fragment.app.w;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.settings.SettingsManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ot2 implements jt2 {
    public final BrowserActivity a;
    public final gjm b;
    public final du3 c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final wv1 h;
    public final Lazy i;
    public final du3 j;
    public final wv1 k;
    public final w l;

    public ot2(BrowserActivity browserActivity, gjm gjmVar, du3 du3Var, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, wv1 wv1Var, Lazy lazy5, du3 du3Var2, wv1 wv1Var2, w wVar) {
        this.a = browserActivity;
        this.b = gjmVar;
        this.c = du3Var;
        this.d = lazy;
        this.e = lazy2;
        this.f = lazy3;
        this.g = lazy4;
        this.h = wv1Var;
        this.i = lazy5;
        this.j = du3Var2;
        this.k = wv1Var2;
        this.l = wVar;
    }

    public final void a(int... iArr) {
        this.b.e(new tw(new oba(2, 0, iArr)), false);
    }

    public final void b(int... iArr) {
        ((wh2) this.f.get()).b(this.a, new kt2(this, iArr, (byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
    public final void c(Address address, Function1 function1) {
        AutofillManager autofillManager = (AutofillManager) this.e.get();
        ?? r3 = this.a;
        ds2 ds2Var = new ds2(autofillManager, new gw(r3), address);
        ds2Var.F = new tr2(function1);
        zhj.a(ds2Var, 4099).c(r3);
    }

    public final void d() {
        q02 q02Var = new q02(this, (byte) 29);
        boolean z = wi2.l;
        fp1 fp1Var = this.a;
        if (!z) {
            String[] strArr = OperaApplication.K;
            SettingsManager settingsManagerJ = ((OperaApplication) fp1Var.getApplicationContext()).J();
            if (!wi2.l) {
                wi2.j = settingsManagerJ;
                wi2.k = u55.Ro;
                wi2.l = true;
            }
        }
        wi2.i.b(fp1Var, q02Var);
    }

    public final void e(int... iArr) {
        kt2 kt2Var = new kt2(this, iArr, (byte) 1);
        boolean z = wi2.l;
        fp1 fp1Var = this.a;
        if (!z) {
            String[] strArr = OperaApplication.K;
            SettingsManager settingsManagerJ = ((OperaApplication) fp1Var.getApplicationContext()).J();
            if (!wi2.l) {
                wi2.j = settingsManagerJ;
                wi2.k = u55.Ro;
                wi2.l = true;
            }
        }
        wi2.i.b(fp1Var, kt2Var);
    }

    public final void f(Runnable runnable) {
        yu2 yu2Var = (yu2) this.i.get();
        if (!yu2Var.b()) {
            runnable.run();
            return;
        }
        nej nejVar = ((qim) this.c.get()).d;
        pf pfVar = new pf(yu2Var, runnable, (byte) 0);
        nejVar.getClass();
        nejVar.b(pfVar, ijm.b);
    }
}
