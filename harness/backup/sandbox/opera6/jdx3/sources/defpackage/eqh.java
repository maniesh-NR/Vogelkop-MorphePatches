package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class eqh extends oph implements View.OnTouchListener, GestureDetector.OnGestureListener, nph {
    public final RecyclerView a;
    public final View.OnLongClickListener b;
    public final GestureDetector c;
    public boolean d;
    public boolean e;
    public boolean f;

    public eqh(RecyclerView recyclerView, View.OnLongClickListener onLongClickListener) {
        this.a = recyclerView;
        this.b = onLongClickListener;
        GestureDetector gestureDetector = new GestureDetector(recyclerView.getContext(), this);
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        recyclerView.o(this);
        recyclerView.setOnTouchListener(this);
        recyclerView.n(this);
    }

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f = false;
            this.d = false;
        }
        return this.f;
    }

    public final void c(boolean z) {
        this.d = z;
    }

    public final void d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f = false;
            this.d = false;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.e || this.d) {
            return;
        }
        View.OnLongClickListener onLongClickListener = this.b;
        RecyclerView recyclerView = this.a;
        if (onLongClickListener.onLongClick(recyclerView)) {
            if (recyclerView.isHapticFeedbackEnabled()) {
                recyclerView.performHapticFeedback(0);
            }
            recyclerView.L0();
            recyclerView.stopNestedScroll();
            recyclerView.requestDisallowInterceptTouchEvent(true);
            this.f = true;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        this.e = i != 0;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.c.onTouchEvent(motionEvent);
    }
}
