package defpackage;

import android.content.Context;
import android.content.Intent;
import com.opera.android.BrowserActivity;
import com.opera.android.qr.ScanQrCodeActivity;

/* loaded from: classes.dex */
public final class rli extends alo {
    public final /* synthetic */ BrowserActivity l;
    public final /* synthetic */ hv3 m;

    public rli(BrowserActivity browserActivity, hv3 hv3Var) {
        super((byte) 12);
        this.l = browserActivity;
        this.m = hv3Var;
    }

    public final void s() {
        joh.h(this.m.a.J0(), new qxh(mfh.q(zeh.a).a(this.l.getResources()).toString()));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
    public final void t() {
        int i = ScanQrCodeActivity.k;
        ?? r2 = this.l;
        r2.D(new Intent((Context) r2, (Class<?>) ScanQrCodeActivity.class), new qj2(this.m, (byte) 12));
    }
}
