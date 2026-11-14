package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class pw8 extends rph {
    public float a;
    public boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ nw8 d;

    public pw8(xw8 xw8Var, int i, nw8 nw8Var) {
        this.c = i;
        this.d = nw8Var;
    }

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int childCount;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a = motionEvent.getY();
            this.b = true;
            return false;
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        if (this.b && this.a - motionEvent.getY() > this.c && (childCount = recyclerView.getChildCount()) != 0) {
            int iMax = Integer.MIN_VALUE;
            for (int i = 0; i < childCount; i++) {
                iMax = Math.max(iMax, recyclerView.getChildAt(i).getBottom());
            }
            if (iMax <= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                this.d.run();
            }
        }
        this.b = false;
        return false;
    }
}
