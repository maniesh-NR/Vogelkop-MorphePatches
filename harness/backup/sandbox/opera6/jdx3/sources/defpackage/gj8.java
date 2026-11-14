package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.history.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gj8 extends iph {
    public final int a;
    public final int b;
    public final int c;
    public final Paint d = new Paint();
    public final Rect e = new Rect();
    public final Rect f = new Rect();

    public gj8(Context context) {
        this.a = fan.a(1.0f, context.getResources());
        this.b = fan.a(16.0f, context.getResources());
        this.c = fan.a(4.0f, context.getResources());
    }

    public final void e(Canvas canvas, RecyclerView recyclerView, View view, Rect rect, int i) {
        Canvas canvas2;
        Rect rect2 = this.e;
        RecyclerView.V(rect2, view);
        rect2.offset((int) view.getTranslationX(), (int) view.getTranslationY());
        int i2 = rect2.left;
        Rect rect3 = this.f;
        float f = i2 + rect3.left;
        int iWidth = rect3.width();
        float f2 = ((iWidth - r1) / 2.0f) + f;
        float f3 = f2 + this.a;
        int i3 = i & 1;
        Paint paint = this.d;
        int i4 = this.c;
        if (i3 == 1) {
            float f4 = rect2.top;
            canvas2 = canvas;
            canvas2.drawRect(f2, f4, f3, (rect.top + f4) - i4, paint);
        } else {
            canvas2 = canvas;
        }
        if ((i & 2) == 2) {
            canvas2.drawRect(f2, rect2.top + rect.bottom + i4, f3, rect2.bottom, paint);
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        g gVar;
        wtn wtnVar;
        i iVarM;
        RecyclerView recyclerView2 = recyclerView;
        int iT = f03.t(2130970698, recyclerView2.getContext(), 2131099816);
        Paint paint = this.d;
        paint.setColor(iT);
        int i = 0;
        while (i < recyclerView2.getChildCount()) {
            View childAt = recyclerView2.getChildAt(i);
            lph layoutParams = childAt.getLayoutParams();
            i iVarT = recyclerView2.T(childAt);
            if ((iVarT instanceof hxn) && (gVar = (g) ((hxn) iVarT).f) != null && (wtnVar = gVar.f) != null && wtnVar.e) {
                paint.setAlpha((int) (childAt.getAlpha() * Color.alpha(iT)));
                ArrayList arrayList = wtnVar.f;
                boolean zEquals = ((vtn) arrayList.get(0)).equals(gVar);
                boolean zEquals2 = ((vtn) am2.k(1, arrayList)).equals(gVar);
                View viewFindViewById = childAt.findViewById(2131363129);
                if (viewFindViewById.getVisibility() != 0) {
                    viewFindViewById = childAt.findViewById(2131363256);
                }
                Rect rect = this.f;
                viewFindViewById.getDrawingRect(rect);
                ((ViewGroup) childAt).offsetDescendantRectToMyCoords(viewFindViewById, rect);
                e(canvas, recyclerView2, childAt, rect, (zEquals2 ? 0 : 2) | 1);
                if (zEquals && (iVarM = recyclerView2.M(layoutParams.a.getBindingAdapterPosition() - 1)) != null && (iVarM instanceof fxn)) {
                    View viewFindViewById2 = iVarM.itemView.findViewById(2131363256);
                    viewFindViewById2.getDrawingRect(rect);
                    ((ViewGroup) iVarM.itemView).offsetDescendantRectToMyCoords(viewFindViewById2, rect);
                    rect.inset(0, this.b);
                    e(canvas, recyclerView2, iVarM.itemView, rect, 2);
                }
            }
            i++;
            recyclerView2 = recyclerView;
        }
    }
}
