package defpackage;

import android.content.Context;
import android.content.Intent;
import com.opera.android.BrowserActivity;
import com.opera.android.qr.ScanQrCodeActivity;

/* loaded from: classes.dex */
public final class c7k extends mzg {
    public final /* synthetic */ byte b;
    public final /* synthetic */ nwf c;

    public /* synthetic */ c7k(nwf nwfVar, byte b) {
        this.b = b;
        this.c = nwfVar;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3, hjf] */
    public final void g() {
        byte b = this.b;
        nwf nwfVar = this.c;
        switch (b) {
            case 0:
                BrowserActivity browserActivity = nwfVar.b.a;
                int i = BrowserActivity.E1;
                browserActivity.d1();
                break;
            case 1:
                nwfVar.b.i();
                break;
            case 2:
                nwfVar.b.m();
                break;
            case 3:
                nwfVar.b.s();
                break;
            case 4:
                nwfVar.b.m();
                break;
            default:
                hv3 hv3Var = nwfVar.b;
                int i2 = ScanQrCodeActivity.k;
                ?? r4 = hv3Var.a;
                hv3 hv3Var2 = r4.Z0;
                if (!fr3.Q((Context) r4, "android.permission.CAMERA")) {
                    f03.U(r4.j, "android.permission.CAMERA", new rli(r4, hv3Var2));
                    break;
                } else {
                    l5b l5bVar = q9n.c;
                    q9n.v(r4.getWindow());
                    r4.D(new Intent((Context) r4, (Class<?>) ScanQrCodeActivity.class), new qj2(hv3Var2, (byte) 12));
                    break;
                }
        }
    }

    public final void o() {
        byte b = this.b;
        nwf nwfVar = this.c;
        switch (b) {
            case 0:
                nwfVar.x(rq0.b);
                break;
            case 1:
                nwfVar.x(rq0.g);
                break;
            case 2:
                nwfVar.x(rq0.h);
                break;
            case 3:
                nwfVar.x(rq0.i);
                break;
            case 4:
                nwfVar.x(rq0.d);
                break;
            default:
                nwfVar.x(rq0.c);
                break;
        }
    }
}
