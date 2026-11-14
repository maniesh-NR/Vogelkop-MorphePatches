package com.opera.android.tabui2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.fo8;
import defpackage.qp3;
import defpackage.vzk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/tabui2/FadeoutRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FadeoutRecyclerView extends RecyclerView {
    public final vzk G0;

    public FadeoutRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        vzk vzkVar = new vzk();
        vzkVar.a = this;
        Paint paint = new Paint();
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        vzkVar.b = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(mode));
        vzkVar.c = paint2;
        vzkVar.d = fo8.c;
        this.G0 = vzkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(Canvas canvas) {
        vzk vzkVar = this.G0;
        RecyclerView recyclerView = (FadeoutRecyclerView) vzkVar.a;
        int scrollY = recyclerView.getScrollY();
        int width = recyclerView.getWidth();
        int height = recyclerView.getHeight() + recyclerView.getScrollY();
        int iSave = canvas.save();
        canvas.clipRect(0, scrollY, width, height);
        try {
            super/*android.view.View*/.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
            if (((fo8) vzkVar.d).a.a()) {
                float scrollY2 = recyclerView.getScrollY();
                iSave = canvas.save();
                canvas.translate(0.0f, scrollY2);
                try {
                    canvas.drawRect(0.0f, 0.0f, recyclerView.getWidth(), ((fo8) vzkVar.d).a.a, (Paint) vzkVar.b);
                } finally {
                }
            }
            if (((fo8) vzkVar.d).b.a()) {
                qp3 qp3Var = ((fo8) vzkVar.d).b;
                int i = qp3Var.a + qp3Var.b;
                float height2 = (recyclerView.getHeight() + recyclerView.getScrollY()) - i;
                iSave = canvas.save();
                canvas.translate(0.0f, height2);
                try {
                    canvas.drawRect(0.0f, 0.0f, recyclerView.getWidth(), i, (Paint) vzkVar.c);
                } finally {
                }
            }
        } finally {
        }
    }
}
