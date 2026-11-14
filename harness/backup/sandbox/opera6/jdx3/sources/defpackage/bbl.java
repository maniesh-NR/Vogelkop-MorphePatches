package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class bbl extends mzg {
    public final /* synthetic */ byte b;
    public final /* synthetic */ nwf c;
    public final /* synthetic */ View d;

    public /* synthetic */ bbl(nwf nwfVar, View view, byte b) {
        this.b = b;
        this.c = nwfVar;
        this.d = view;
    }

    public final void g() {
        byte b = this.b;
        View view = this.d;
        nwf nwfVar = this.c;
        switch (b) {
            case 0:
                BrowserActivity browserActivity = nwfVar.b.a;
                int i = BrowserActivity.E1;
                browserActivity.m0();
                browserActivity.v1();
                break;
            case 1:
                nwfVar.b.k(view);
                break;
            case 2:
                nwfVar.b.u(view);
                break;
            case 3:
                nwfVar.b.a.g1(null);
                break;
            default:
                BrowserActivity browserActivity2 = nwfVar.b.a;
                int i2 = BrowserActivity.E1;
                browserActivity2.s1(view, 2, true);
                break;
        }
    }

    public final void o() {
        byte b = this.b;
        nwf nwfVar = this.c;
        switch (b) {
            case 0:
                nwfVar.v(ph0.b);
                break;
            case 1:
                nwfVar.v(ph0.e);
                break;
            case 2:
                nwfVar.v(ph0.d);
                break;
            case 3:
                nwfVar.v(ph0.m);
                break;
            default:
                nwfVar.v(ph0.n);
                break;
        }
    }
}
