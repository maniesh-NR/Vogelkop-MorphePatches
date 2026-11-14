package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.opera.android.browser.OperaPageRootView;

/* loaded from: classes.dex */
public final class xz2 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public xz2(View view, h3l h3lVar) {
        this.c = h3lVar;
        this.d = view;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    public xz2(yz2 yz2Var, OperaPageRootView operaPageRootView) {
        this.c = operaPageRootView;
        this.d = yz2Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((oml) ((yz2) obj).c).cancel(false);
                    ((OperaPageRootView) this.c).postOnAnimation(new fv2(this, (byte) 3));
                    break;
                }
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ((View) obj).post(new qlk(this, (byte) 24));
                    break;
                }
                break;
        }
    }
}
