package defpackage;

import J.N;
import com.opera.android.browser.chromium.OperaBrowserContext;
import com.opera.android.downloads.DownloadItem;
import com.opera.android.downloads.DownloadManagerObserver;
import com.opera.android.downloads.DownloadPauseManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class xf7 extends DownloadManagerObserver {
    public final DownloadPauseManager b;
    public final umi c;
    public final /* synthetic */ ag7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf7(ag7 ag7Var, OperaBrowserContext operaBrowserContext, umi umiVar) {
        super(operaBrowserContext);
        this.d = ag7Var;
        this.b = (DownloadPauseManager) N.M9HCHaTE(operaBrowserContext.a);
        this.c = umiVar;
    }

    public boolean a() {
        return false;
    }

    @Override // com.opera.android.downloads.DownloadManagerObserver
    public void onDownloadCreated(DownloadItem downloadItem, String str, int i, int i2) {
        cv3 cv3Var;
        ag7 ag7Var = this.d;
        ArrayList arrayList = ag7Var.a;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (((cv3) obj).a(this, downloadItem, i)) {
                i3++;
            }
        }
        if (i3 != 0 || (cv3Var = ag7Var.e) == null) {
            return;
        }
        cv3Var.a(this, downloadItem, i);
    }
}
