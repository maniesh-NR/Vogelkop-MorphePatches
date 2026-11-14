package defpackage;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class vt5 implements kz3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l53 b;

    public /* synthetic */ vt5(l53 l53Var, byte b) {
        this.a = b;
        this.b = l53Var;
    }

    @Override // defpackage.kz3
    public final void g(lz3 lz3Var) {
        byte b = this.a;
        l53 l53Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = ((wt5) l53Var).c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewParent parent2 = ((ioc) l53Var).d.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
        }
    }
}
