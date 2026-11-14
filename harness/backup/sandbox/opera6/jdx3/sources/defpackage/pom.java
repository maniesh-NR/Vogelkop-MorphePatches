package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class pom extends lim {
    public final Context a;
    public final umi b;
    public final x5f c;
    public final b59 d;
    public final ud7 e = new ud7(this, (byte) 3);
    public final ssi f = new ssi(this, (byte) 18);
    public final boolean g;
    public final int h;
    public boolean i;

    public pom(Context context, umi umiVar, x5f x5fVar, int i, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = umiVar;
        this.c = x5fVar;
        this.d = w1h.l(applicationContext, umiVar, "upgrade_message", new bg1[0]);
        this.h = i;
        this.g = z;
    }

    public final void R(gt0 gt0Var) {
        roj rojVar = new roj(this, gt0Var, (byte) 6);
        t1 t1Var = new t1(this.a, (byte) 11);
        umi umiVar = this.b;
        nml nmlVarB = umiVar.b(t1Var);
        nmlVarB.b(umiVar.f(new kqd(rojVar, (byte) 12)));
        nmlVarB.a(null);
    }

    public final void S() {
        if (this.i) {
            hom.t(this.a).H(this.e);
            vml.a(this.f);
            this.i = false;
        }
    }

    public final void T(int i) {
        int i2;
        Context context = this.a;
        nv6 nv6VarB = ru9.c(context).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("startpage.upgrade_page_will_be_shown", false);
        nv6VarB.w();
        if (i != 0) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.d.get();
            i2 = sharedPreferences.getInt("last_checksum", 0);
            j.b(sharedPreferences, "last_checksum", i);
        } else {
            i2 = 0;
        }
        if (this.h == 1) {
            crk crkVar = new crk(this, (byte) 24);
            t1 t1Var = new t1(context, (byte) 11);
            umi umiVar = this.b;
            nml nmlVarB = umiVar.b(t1Var);
            nmlVarB.b(umiVar.f(new kqd(crkVar, (byte) 12)));
            nmlVarB.a(null);
            return;
        }
        if (this.g) {
            R(gt0.c);
            return;
        }
        if (i == 0) {
            R(gt0.d);
            return;
        }
        String str = ((fom) hom.t(context).i()).b;
        if (TextUtils.isEmpty(str)) {
            R(gt0.e);
            return;
        }
        if (i == i2) {
            R(gt0.f);
            return;
        }
        vx3 vx3VarA = ay3.a(str, lqm.q, false);
        vx3VarA.c(true);
        vx3VarA.a(true);
        vx3VarA.f = false;
        am2.v(vx3VarA);
        R(gt0.b);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.i = true;
        vml.d(this.f, 5000L);
        hom.t(this.a).F(this.e);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        S();
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) throws InterruptedException {
        if (this.i) {
            this.f.run();
        }
    }
}
