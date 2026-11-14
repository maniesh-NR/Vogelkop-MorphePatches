package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class g31 {
    public final Context a;
    public ClipboardManager b;

    public g31(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.a.getSystemService("clipboard");
        this.b = clipboardManager2;
        return clipboardManager2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.sf1 r23) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g31.b(sf1):void");
    }
}
