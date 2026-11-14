package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class eh5 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ fh5 a;

    public eh5(fh5 fh5Var) {
        this.a = fh5Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        fh5 fh5Var = this.a;
        fh5Var.g.a.clear();
        zyh zyhVar = fh5Var.h;
        synchronized (zyhVar) {
            zyhVar.a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        fh5 fh5Var = this.a;
        fh5Var.g.a.clear();
        zyh zyhVar = fh5Var.h;
        synchronized (zyhVar) {
            zyhVar.a.a();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.t.c.setValue(Boolean.valueOf(z));
    }
}
