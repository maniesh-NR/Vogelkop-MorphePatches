package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class aq3 extends mzg {
    public final /* synthetic */ byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ t0h d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aq3(t0h t0hVar, Object obj, boolean z, byte b) {
        this.b = b;
        this.d = t0hVar;
        this.e = obj;
        this.c = z;
    }

    private final void s() {
    }

    public final void g() {
        byte b = this.b;
        boolean z = this.c;
        Object obj = this.e;
        t0h t0hVar = this.d;
        switch (b) {
            case 0:
                BrowserActivity browserActivity = ((bq3) t0hVar).a.a;
                int i = BrowserActivity.E1;
                browserActivity.w1((View) obj, z);
                break;
            case 1:
                ((b9g) t0hVar).a.p((String) obj, z);
                break;
            default:
                BrowserActivity browserActivity2 = ((nwf) t0hVar).b.a;
                int i2 = BrowserActivity.E1;
                browserActivity2.w1((View) obj, z);
                break;
        }
    }

    public final void o() {
        byte b = this.b;
        ph0 ph0Var = ph0.i;
        ph0 ph0Var2 = ph0.g;
        boolean z = this.c;
        t0h t0hVar = this.d;
        switch (b) {
            case 0:
                bq3 bq3Var = (bq3) t0hVar;
                if (z) {
                    ph0Var = ph0Var2;
                }
                bq3Var.u(ph0Var);
                break;
            case 1:
                break;
            default:
                nwf nwfVar = (nwf) t0hVar;
                if (z) {
                    ph0Var = ph0Var2;
                }
                nwfVar.v(ph0Var);
                break;
        }
    }
}
