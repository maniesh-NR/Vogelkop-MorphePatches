package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final class f7b implements View.OnAttachStateChangeListener, Callback {
    public final b7f a;
    public final /* synthetic */ g7b b;

    public f7b(g7b g7bVar, b7f b7fVar) {
        this.b = g7bVar;
        this.a = b7fVar;
        g7bVar.addOnAttachStateChangeListener(this);
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        g7b g7bVar = this.b;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g7bVar.getLayoutParams();
        dtl dtlVar = (dtl) g7bVar.p.a.b;
        int i = dtlVar.a;
        int i2 = dtlVar.g ? dtlVar.c : dtlVar.d;
        if (i == marginLayoutParams.topMargin && i2 == marginLayoutParams.bottomMargin) {
            return;
        }
        marginLayoutParams.topMargin = i;
        marginLayoutParams.bottomMargin = i2;
        g7bVar.requestLayout();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.b(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a(this);
    }
}
