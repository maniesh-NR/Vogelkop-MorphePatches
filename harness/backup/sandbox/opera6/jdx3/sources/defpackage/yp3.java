package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class yp3 extends mzg {
    public final /* synthetic */ byte b;
    public final /* synthetic */ bq3 c;
    public final /* synthetic */ View d;

    public /* synthetic */ yp3(bq3 bq3Var, View view, byte b) {
        this.b = b;
        this.c = bq3Var;
        this.d = view;
    }

    public final void g() {
        byte b = this.b;
        bq3 bq3Var = this.c;
        switch (b) {
            case 0:
                BrowserActivity browserActivity = bq3Var.a.a;
                int i = BrowserActivity.E1;
                browserActivity.m0();
                browserActivity.v1();
                break;
            case 1:
                bq3Var.a.a.g1(null);
                break;
            default:
                BrowserActivity browserActivity2 = bq3Var.a.a;
                int i2 = BrowserActivity.E1;
                browserActivity2.s1(this.d, 2, true);
                break;
        }
    }

    public final void o() {
        byte b = this.b;
        bq3 bq3Var = this.c;
        switch (b) {
            case 0:
                bq3Var.u(ph0.b);
                break;
            case 1:
                bq3Var.u(ph0.m);
                break;
            default:
                bq3Var.u(ph0.n);
                break;
        }
    }
}
