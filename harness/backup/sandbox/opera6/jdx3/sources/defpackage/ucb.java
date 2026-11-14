package defpackage;

import android.content.Context;
import android.content.Intent;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.qr.ScanQrCodeActivity;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ucb implements cdb {
    public final /* synthetic */ byte a;
    public final BrowserActivity b;

    public /* synthetic */ ucb(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3, hjf] */
    @Override // defpackage.cdb
    public final void execute() {
        byte b = this.a;
        ?? r9 = this.b;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                ((OperaApplication) r9.getApplication()).v().a.V(1, "live_scores_enabled");
                break;
            case 1:
                new zhj(new wzg(null, wg7.class, (byte) 4), null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(r9);
                break;
            default:
                r9.n0(false, false);
                r9.o1(1);
                hv3 hv3Var = r9.Z0;
                if (!fr3.Q((Context) r9, "android.permission.CAMERA")) {
                    f03.U(r9.j, "android.permission.CAMERA", new rli(r9, hv3Var));
                    break;
                } else {
                    l5b l5bVar = q9n.c;
                    q9n.v(r9.getWindow());
                    r9.D(new Intent((Context) r9, (Class<?>) ScanQrCodeActivity.class), new qj2(hv3Var, (byte) 12));
                    break;
                }
        }
    }
}
