package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.opera.android.browser.chromium.OperaBrowserContext;
import com.opera.android.downloads.DownloadItem;
import com.opera.api.Callback;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class yf7 extends xf7 {
    public final ArrayList e;
    public final rf7 f;
    public boolean g;
    public final HashMap h;

    public yf7(ag7 ag7Var, rf7 rf7Var, umi umiVar) {
        super(ag7Var, new OperaBrowserContext(false), umiVar);
        this.e = new ArrayList();
        this.h = new HashMap();
        this.f = rf7Var;
    }

    @Override // defpackage.xf7, com.opera.android.downloads.DownloadManagerObserver
    public final void onDownloadCreated(DownloadItem downloadItem, String str, int i, int i2) {
        Callback callback = (Callback) this.h.remove(downloadItem.p());
        if (callback == null && !this.g) {
            super.onDownloadCreated(downloadItem, str, i, i2);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            re7 re7VarA = this.f.a(this, downloadItem, str.startsWith("/") ? Uri.fromFile(new File(str)) : Uri.parse(str), i, Integer.MIN_VALUE, true);
            if (callback != null) {
                callback.run(re7VarA);
            }
        }
    }
}
