package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class dsj implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fsj b;

    public /* synthetic */ dsj(fsj fsjVar, byte b) {
        this.a = b;
        this.b = fsjVar;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        atj atjVarK;
        switch (this.a) {
            case 0:
                fsj fsjVar = this.b;
                fsjVar.b.getViewTreeObserver().addOnGlobalLayoutListener(fsjVar.j);
                View view2 = fsjVar.a;
                Object tag = view2.getTag(2131364495);
                if (tag != null) {
                    atjVarK = (atj) tag;
                } else {
                    Object parent = view2.getParent();
                    View view3 = parent instanceof View ? (View) parent : null;
                    atjVarK = view3 != null ? xug.k(view3) : null;
                }
                fsjVar.a(atjVarK);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        atj atjVarK = null;
        fsj fsjVar = this.b;
        switch (b) {
            case 0:
                fsjVar.b.getViewTreeObserver().removeOnGlobalLayoutListener(fsjVar.j);
                fsjVar.a(null);
                break;
            default:
                View view2 = fsjVar.a;
                Object tag = view2.getTag(2131364495);
                if (tag != null) {
                    atjVarK = (atj) tag;
                } else {
                    Object parent = view2.getParent();
                    View view3 = parent instanceof View ? (View) parent : null;
                    if (view3 != null) {
                        atjVarK = xug.k(view3);
                    }
                }
                fsjVar.a(atjVarK);
                break;
        }
    }
}
