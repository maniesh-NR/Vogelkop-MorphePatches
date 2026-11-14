package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class qic extends iph {
    public final Rect a = new Rect();
    public final Paint b = new Paint();
    public final int c;
    public final int d;

    public qic(Context context) {
        this.c = fan.a(8.0f, context.getResources());
        this.d = fan.a(1.0f, context.getResources());
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        super.getItemOffsets(rect, view, recyclerView, vphVar);
        if (view.getId() == 2131363332) {
            int bindingAdapterPosition = view.getLayoutParams().a.getBindingAdapterPosition();
            int i = this.c;
            i = (bindingAdapterPosition > 0 ? i + this.d : 0) + i;
        }
        rect.top = i;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        Canvas canvas2;
        int iT = f03.t(2130970698, recyclerView.getContext(), 2131099816);
        Paint paint = this.b;
        paint.setColor(iT);
        canvas.save();
        int width = recyclerView.getWidth();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getId() != 2131363332 || childAt.getLayoutParams().a.getBindingAdapterPosition() <= 0) {
                canvas2 = canvas;
            } else {
                Rect rect = this.a;
                RecyclerView.V(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.top + this.c;
                float f = this.d + iRound;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, iRound, width, f, paint);
            }
            i++;
            canvas = canvas2;
        }
        canvas.restore();
    }
}
