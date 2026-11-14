package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.CustomGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class r8a extends iph {
    public final RecyclerView a;
    public String b;
    public final TextPaint c;
    public final int d;
    public StaticLayout e;

    public r8a(RecyclerView recyclerView, String str) {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        Resources resources = recyclerView.getContext().getResources();
        this.a = recyclerView;
        this.b = str;
        textPaint.setTextSize(resources.getDimensionPixelSize(2131167629));
        pc5 pc5Var = new pc5((Object) this, (byte) 26);
        dll dllVarS = q9n.s(recyclerView);
        if (dllVarS != null) {
            u8n.b(dllVarS, recyclerView, pc5Var);
        }
        pc5Var.a(recyclerView);
        this.d = resources.getDimensionPixelSize(2131167628);
    }

    public final void e() {
        StaticLayout staticLayout = this.e;
        RecyclerView recyclerView = this.a;
        if (staticLayout == null || staticLayout.getWidth() != recyclerView.getWidth()) {
            String str = this.b;
            this.e = new StaticLayout(str, 0, str.length(), this.c, recyclerView.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 1.0f, false);
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        e();
        int iS = RecyclerView.S(view);
        CustomGridLayoutManager customGridLayoutManager = this.a.n;
        if (iS < (customGridLayoutManager instanceof CustomGridLayoutManager ? customGridLayoutManager.b : 1)) {
            rect.set(0, this.d, 0, 0);
        } else {
            rect.setEmpty();
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        e();
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (RecyclerView.S(childAt) == 0) {
                int top = childAt.getTop() - this.a.getPaddingTop();
                int i2 = this.d;
                canvas.save();
                canvas.translate(0.0f, ((i2 - this.e.getHeight()) / 2) + (top - i2));
                this.e.draw(canvas);
                canvas.restore();
                return;
            }
        }
    }
}
