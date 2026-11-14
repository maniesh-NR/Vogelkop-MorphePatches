package defpackage;

import com.opera.android.browser.OperaDownloadManagerDelegate;

/* loaded from: classes.dex */
public final /* synthetic */ class ikf implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ OperaDownloadManagerDelegate.TargetCallback c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ikf(boolean z, long j, OperaDownloadManagerDelegate.TargetCallback targetCallback, String str, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = targetCallback;
        this.d = str;
        this.e = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OperaDownloadManagerDelegate.onShowDownloadPathDialog(this.a, this.b, this.c, this.d, this.e);
    }
}
