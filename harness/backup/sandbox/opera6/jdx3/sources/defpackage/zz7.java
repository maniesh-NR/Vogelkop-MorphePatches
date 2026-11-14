package defpackage;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;

/* loaded from: classes.dex */
public final class zz7 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public final GestureDetector a;
    public final RecyclerView b;
    public final ark c;

    public zz7(RecyclerView recyclerView, ark arkVar) {
        this.a = new GestureDetector(recyclerView.getContext(), this);
        this.b = recyclerView;
        this.c = arkVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean zContains;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        View view = this.b;
        f fVar = ((RecyclerView) view).n;
        if (fVar == null) {
            zContains = false;
        } else {
            Rect rect = new Rect();
            int childCount = fVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = fVar.getChildAt(i);
                rect.union(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            zContains = rect.contains((int) x, (int) y);
        }
        if (zContains) {
            return false;
        }
        this.c.onClick(view);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
