package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.cod;
import defpackage.xuf;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xuf xufVar = (xuf) it.next();
            BitmapDrawable bitmapDrawable = xufVar.a;
            if (bitmapDrawable != null) {
                bitmapDrawable.draw(canvas);
            }
            long drawingTime = getDrawingTime();
            BitmapDrawable bitmapDrawable2 = xufVar.a;
            Rect rect = xufVar.c;
            if (xufVar.k) {
                z = false;
            } else {
                float fMax = xufVar.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - xufVar.i) / xufVar.e)) : 0.0f;
                Interpolator interpolator = xufVar.d;
                float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
                int i = (int) (xufVar.g * interpolation);
                Rect rect2 = xufVar.f;
                rect.top = rect2.top + i;
                rect.bottom = rect2.bottom + i;
                float fG = v0g.g(xufVar.h, 1.0f, interpolation, 1.0f);
                xufVar.b = fG;
                if (bitmapDrawable2 != null) {
                    bitmapDrawable2.setAlpha((int) (fG * 255.0f));
                    bitmapDrawable2.setBounds(rect);
                }
                if (xufVar.j && fMax >= 1.0f) {
                    xufVar.k = true;
                    c5o c5oVar = xufVar.l;
                    if (c5oVar != null) {
                        d dVar = (d) c5oVar.b;
                        dVar.K.remove((cod) c5oVar.a);
                        dVar.G.notifyDataSetChanged();
                    }
                }
                z = !xufVar.k;
            }
            if (!z) {
                it.remove();
            }
        }
    }
}
