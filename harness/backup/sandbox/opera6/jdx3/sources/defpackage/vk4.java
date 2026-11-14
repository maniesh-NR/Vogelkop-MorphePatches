package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.opera.android.custom_views.CardView;

/* loaded from: classes.dex */
public final class vk4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final /* synthetic */ CardView c;

    public vk4(CardView cardView) {
        this.c = cardView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        CardView cardView = this.c;
        if (cardView.k.isLaidOut()) {
            View view = cardView.k;
            Rect rect = this.b;
            view.getDrawingRect(rect);
            cardView.offsetDescendantRectToMyCoords(cardView.k, rect);
            Rect rect2 = this.a;
            if (rect.equals(rect2)) {
                return;
            }
            rect2.set(rect);
            cardView.invalidate();
        }
    }
}
