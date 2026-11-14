package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class yqk implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrk b;

    public /* synthetic */ yqk(mrk mrkVar, byte b) {
        this.a = b;
        this.b = mrkVar;
    }

    public final Object get() {
        byte b = this.a;
        mrk mrkVar = this.b;
        switch (b) {
            case 0:
                return mrkVar.b;
            case 1:
                return ru9.c(mrkVar.b.getContext());
            case 2:
                return Integer.valueOf(rc5.d.k(((CoordinatorLayout) mrkVar.y.a).getContext()));
            default:
                return cqp.f0(((CoordinatorLayout) mrkVar.y.a).getContext());
        }
    }
}
