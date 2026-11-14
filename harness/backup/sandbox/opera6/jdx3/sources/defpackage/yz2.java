package defpackage;

import android.view.ViewTreeObserver;
import com.opera.android.browser.OperaPageRootView;

/* loaded from: classes.dex */
public final class yz2 extends zz2 {
    public xz2 d;
    public final /* synthetic */ ViewTreeObserver e;
    public final /* synthetic */ ro9 f;
    public final /* synthetic */ ami g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz2(ami amiVar, umi umiVar, ro9 ro9Var, ViewTreeObserver viewTreeObserver, OperaPageRootView operaPageRootView, ro9 ro9Var2) {
        super(umiVar, 1000, ro9Var);
        this.e = viewTreeObserver;
        this.f = ro9Var2;
        this.g = amiVar;
        if (viewTreeObserver.isAlive()) {
            xz2 xz2Var = new xz2(this, operaPageRootView);
            this.d = xz2Var;
            viewTreeObserver.addOnDrawListener(xz2Var);
        }
    }

    @Override // defpackage.zz2
    public final void a(boolean z) {
        ((oml) this.c).cancel(false);
        this.a = true;
        if (this.d != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.d);
            }
            this.d = null;
        }
        if (z) {
            ami amiVar = this.g;
            amiVar.x((ro9) amiVar.g, this.f);
        }
    }

    @Override // defpackage.zz2
    public final void b() {
        ami amiVar = this.g;
        amiVar.y((ro9) amiVar.g, this.f);
        amiVar.t((ro9) this.b);
        amiVar.h = null;
    }
}
