package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class lf7 extends o93 {
    public boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ orm f;
    public final /* synthetic */ jc0 g;
    public final /* synthetic */ re7 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ rf7 j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ vwh l;
    public final /* synthetic */ BrowserActivity m;

    public lf7(String str, int i, orm ormVar, jc0 jc0Var, re7 re7Var, boolean z, rf7 rf7Var, Context context, vwh vwhVar, BrowserActivity browserActivity) {
        this.d = str;
        this.e = i;
        this.f = ormVar;
        this.g = jc0Var;
        this.h = re7Var;
        this.i = z;
        this.j = rf7Var;
        this.k = context;
        this.l = vwhVar;
        this.m = browserActivity;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        gtj gtjVarE = gtj.e(view, this.d, 5000);
        final orm ormVar = this.f;
        final jc0 jc0Var = this.g;
        final re7 re7Var = this.h;
        final boolean z = this.i;
        final rf7 rf7Var = this.j;
        final Context context = this.k;
        final vwh vwhVar = this.l;
        final BrowserActivity browserActivity = this.m;
        gtjVarE.f(this.e, new View.OnClickListener() { // from class: kf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lf7 lf7Var = this.a;
                if (lf7Var.c) {
                    return;
                }
                lf7Var.c = true;
                re7 re7Var2 = re7Var;
                ((x5f) ormVar).M(jc0Var, re7Var2.c());
                if (z) {
                    rf7Var.p(re7Var2, context, vwhVar, false);
                } else {
                    browserActivity.u1(re7Var2, 4099);
                }
            }
        });
        return gtjVarE;
    }

    @Override // defpackage.o93
    public final void f(int i) {
        if (this.c) {
            return;
        }
        this.c = true;
        ((x5f) this.f).M(jc0.b, this.h.c());
    }
}
