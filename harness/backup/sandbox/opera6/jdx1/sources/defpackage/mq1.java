package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class mq1 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ dh a;
    public final /* synthetic */ nq1 b;

    public mq1(nq1 nq1Var, dh dhVar) {
        this.b = nq1Var;
        this.a = dhVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
