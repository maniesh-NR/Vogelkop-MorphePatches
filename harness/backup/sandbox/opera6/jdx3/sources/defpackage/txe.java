package defpackage;

import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
public final class txe implements View.OnAttachStateChangeListener, pwe {
    public final qwe a;
    public final View b;

    public txe(qwe qweVar, View view) {
        this.a = qweVar;
        this.b = view;
        if (view.isAttachedToWindow()) {
            qweVar.b.b(this);
            LightingColorFilter lightingColorFilter = (LightingColorFilter) qweVar.a.b;
            if (lightingColorFilter != null) {
                Paint paint = new Paint();
                paint.setColorFilter(lightingColorFilter);
                view.setLayerType(2, paint);
            } else {
                view.setLayerType(0, null);
            }
        }
        view.addOnAttachStateChangeListener(this);
    }

    @Override // defpackage.pwe
    public final void a(bp bpVar) {
        LightingColorFilter lightingColorFilter = (LightingColorFilter) bpVar.b;
        View view = this.b;
        if (lightingColorFilter == null) {
            view.setLayerType(0, null);
            return;
        }
        Paint paint = new Paint();
        paint.setColorFilter(lightingColorFilter);
        view.setLayerType(2, paint);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        qwe qweVar = this.a;
        qweVar.b.b(this);
        LightingColorFilter lightingColorFilter = (LightingColorFilter) qweVar.a.b;
        View view2 = this.b;
        if (lightingColorFilter == null) {
            view2.setLayerType(0, null);
            return;
        }
        Paint paint = new Paint();
        paint.setColorFilter(lightingColorFilter);
        view2.setLayerType(2, paint);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b.c(this);
    }
}
