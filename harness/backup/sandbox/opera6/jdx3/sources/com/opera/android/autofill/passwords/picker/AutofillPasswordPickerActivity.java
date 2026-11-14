package com.opera.android.autofill.passwords.picker;

import J.N;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.w;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import defpackage.ab;
import defpackage.ay;
import defpackage.e7d;
import defpackage.gjm;
import defpackage.gwi;
import defpackage.he;
import defpackage.hjf;
import defpackage.ijf;
import defpackage.iz9;
import defpackage.ki;
import defpackage.l24;
import defpackage.li;
import defpackage.lm3;
import defpackage.m24;
import defpackage.mi;
import defpackage.mmm;
import defpackage.n3g;
import defpackage.n7n;
import defpackage.p01;
import defpackage.r7n;
import defpackage.ug;
import defpackage.umi;
import defpackage.v78;
import defpackage.va2;
import defpackage.vml;
import defpackage.vx;
import defpackage.w3g;
import defpackage.wt2;
import defpackage.x7j;
import defpackage.xbf;
import defpackage.xt2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/opera/android/autofill/passwords/picker/AutofillPasswordPickerActivity;", "Lhjf;", "Ln7n;", "Lm24;", "<init>", "()V", "he", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutofillPasswordPickerActivity extends hjf implements n7n, m24 {
    public static final /* synthetic */ int o = 0;
    public v78 j;
    public gwi k;
    public final d5o l;
    public final pad m;
    public iz9 n;

    public AutofillPasswordPickerActivity() {
        xbf xbfVar = this.e;
        d5o d5oVar = new d5o();
        d5oVar.a = xbfVar;
        d5oVar.b = this;
        d5oVar.c = new ay((Object) d5oVar, (byte) 2);
        this.l = d5oVar;
        this.m = new pad((byte) 7);
    }

    public final gjm F() {
        return (gjm) ((ay) this.l.c).get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(w3g w3gVar, String str) {
        iz9 iz9Var = this.n;
        if (iz9Var != null) {
            N.MJtaqBis(w3gVar.f, str, iz9Var.a, iz9Var.b, new ab(this, (byte) 29));
        }
        String strValueOf = String.valueOf(w3gVar.a);
        String str2 = w3gVar.c;
        String str3 = w3gVar.g;
        setResult(-1, new Intent().putExtra("AutofillIntent.EXTRA_DATA", new n3g(strValueOf, str2, str3, w3gVar.f, str, (w3gVar.h || w3gVar.i) ? str3 : w3gVar.b.a)));
        finish();
    }

    public final void H(Function0 function0) {
        F().c(new mmm(), this, new ug(new p01(function0, (byte) 3), (byte) 7));
    }

    @Override // defpackage.m24
    public final void a(l24 l24Var) {
        this.m.t(l24Var);
    }

    @Override // defpackage.m24
    public final void c(l24 l24Var) {
        this.m.A(l24Var);
    }

    @Override // defpackage.hjf
    public final Object getSystemService(String str) {
        if (Intrinsics.a(str, "com.opera.android.BPR_SERVICE")) {
            return this;
        }
        if (!Intrinsics.a(str, "com.opera.android.ui.SECURE_WINDOW_SERVICE")) {
            return super.getSystemService(str);
        }
        gwi gwiVar = this.k;
        if (gwiVar == null) {
            return null;
        }
        return gwiVar;
    }

    @Override // defpackage.n7n
    public final r7n j() {
        v78 v78Var = this.j;
        if (v78Var == null) {
            return null;
        }
        return v78Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558534);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        umi umiVar = vml.d;
        gjm gjmVarF = F();
        byte b = 10;
        vx vxVar = new vx(this, b);
        li liVar = new li(operaApplication, OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0, (byte) 9);
        byte b2 = 1;
        ki kiVar = new ki(liVar, b2);
        mi miVar = (mi) ((xbf) this.l.a).b;
        x7j x7jVar = new x7j(umiVar, gjmVarF, vxVar, kiVar, miVar.i, miVar.o, miVar.r, (byte) 1);
        lm3 lm3Var = new lm3(F(), new va2(this, b));
        this.j = new v78(h1b.v(x7jVar), b2);
        getSupportFragmentManager().B = new ul9(h1b.w(x7jVar, lm3Var), (byte) 1);
        this.k = new gwi(getWindow());
        a(new he(this, b2));
        byte b3 = 0;
        getOnBackPressedDispatcher().a(this, new xt2(this, b3));
        final w supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.o.add(new am9() { // from class: vt2
            public final void onBackStackChanged() {
                int i = AutofillPasswordPickerActivity.o;
                if (supportFragmentManager.J() == 0) {
                    this.finish();
                }
            }
        });
        e7d.a(this, new wt2(this, b3));
    }

    @Override // defpackage.hjf
    public final fi s() {
        return this.l;
    }

    @Override // defpackage.hjf
    /* renamed from: t */
    public final ijf s() {
        return this.l;
    }
}
