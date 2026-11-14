package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract class ecf extends bke {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public ecf(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.c = onBackInvokedDispatcher;
        this.d = i;
        this.e = Build.VERSION.SDK_INT == 33 ? new wi(this, (byte) 4) : new dcf(this);
    }

    @Override // defpackage.bke
    public final void d(boolean z) {
        boolean z2 = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (z) {
            if (z2) {
                return;
            }
            this.c.registerOnBackInvokedCallback(this.d, onBackInvokedCallback);
            this.f = true;
            return;
        }
        if (z2) {
            this.c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }
}
