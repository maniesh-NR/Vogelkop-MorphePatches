package defpackage;

import android.content.Context;
import android.view.Window;

/* loaded from: classes.dex */
public final class gwi {
    public final Window a;
    public int b;

    public gwi(Window window) {
        this.a = window;
    }

    public static gwi a(Context context) {
        gwi gwiVar = (gwi) context.getSystemService("com.opera.android.ui.SECURE_WINDOW_SERVICE");
        if (gwiVar != null) {
            return gwiVar;
        }
        qp2.g("Trying to use a Context without support?");
        return null;
    }

    public final void b(boolean z) {
        int i = this.b;
        Window window = this.a;
        if (z) {
            int i2 = i + 1;
            this.b = i2;
            if (i2 == 1) {
                window.addFlags(8192);
                return;
            }
            return;
        }
        int i3 = i - 1;
        this.b = i3;
        if (i3 == 0) {
            window.clearFlags(8192);
        }
    }
}
