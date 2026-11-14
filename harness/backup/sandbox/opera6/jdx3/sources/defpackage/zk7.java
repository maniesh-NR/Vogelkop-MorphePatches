package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class zk7 extends iph {
    public final yk7 a;
    public final xk7 b;
    public Drawable c;
    public boolean d;
    public RecyclerView e;
    public final z61 f = new z61(this, (byte) 6);
    public final wk7 g;

    public zk7(yk7 yk7Var, xk7 xk7Var) {
        wk7 wk7Var = new wk7(this, (byte) 0);
        this.g = wk7Var;
        this.a = yk7Var;
        this.b = xk7Var;
        Drawable drawableF = yk7Var.f();
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        this.c = drawableF;
        drawableF.setCallback(wk7Var);
        this.c.setVisible(false, false);
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        int bindingAdapterPosition;
        super.onDrawOver(canvas, recyclerView, vphVar);
        this.d = true;
        boolean z = false;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            i iVarT = recyclerView.T(recyclerView.getChildAt(i));
            if (iVarT != null && (bindingAdapterPosition = iVarT.getBindingAdapterPosition()) != -1 && this.b.b(bindingAdapterPosition)) {
                if (true != this.c.isVisible()) {
                    this.c.setVisible(true, false);
                }
                int iRound = Math.round(iVarT.itemView.getX());
                int iRound2 = Math.round(iVarT.itemView.getY());
                this.c.setBounds(iRound, iRound2, iVarT.itemView.getWidth() + iRound, iVarT.itemView.getHeight() + iRound2);
                this.c.draw(canvas);
                z = true;
            }
        }
        if (!z && this.c.isVisible()) {
            this.c.setVisible(false, false);
        }
        RecyclerView recyclerView2 = this.e;
        if (recyclerView2 != recyclerView) {
            z61 z61Var = this.f;
            if (recyclerView2 != null) {
                recyclerView2.removeOnAttachStateChangeListener(z61Var);
            }
            this.e = recyclerView;
            recyclerView.addOnAttachStateChangeListener(z61Var);
        }
        this.d = false;
    }
}
