package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.utilities.DisplayUtil;

/* loaded from: classes.dex */
public final class l0e extends GestureDetector.SimpleOnGestureListener {
    public final int a;
    public boolean b;
    public float c;
    public boolean d;
    public final /* synthetic */ m0e e;

    public l0e(m0e m0eVar) {
        this.e = m0eVar;
        DisplayUtil.f(m0eVar.e.getContext());
        this.a = DisplayUtil.d;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return false;
        }
        this.b = true;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        z5l z5lVar = (z5l) this.e.d.b;
        zc3 zc3Var = z5lVar.z;
        zc3Var.d = 3.0f;
        boolean zO = z5lVar.f.O(zed.b(-f), 0);
        zc3Var.d = 1.0f;
        return zO;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.b) {
            f += motionEvent2.getX() - motionEvent.getX();
            motionEvent2.getY();
            motionEvent.getY();
            motionEvent2.getX();
            motionEvent2.getY();
            this.c = 0.0f;
            this.b = false;
        } else if (this.a <= 240) {
            float f3 = this.c;
            float f4 = (f3 == 0.0f || Math.signum(f3) == Math.signum(f)) ? f : 0.0f;
            float f5 = this.c;
            this.c = ((f - f5) / 2.0f) + f5;
            f = f4;
        }
        RecyclerView recyclerView = this.e.c;
        if (!this.d) {
            this.d = true;
            recyclerView.Y().J(1, 0);
        }
        float f6 = recyclerView.getResources().getDisplayMetrics().density * 4.0f;
        float f7 = f / f6;
        recyclerView.e0(zed.b((Math.signum(f7) * (Math.abs(f7) > 1.0f ? (Math.signum(f7) * (2.0f * f7)) - 1.0f : (float) Math.pow(f7, 2.0d)) * 0.5f * f6 * 3.0f) + f), 0, (MotionEvent) null);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view = (View) cqp.Q(this.e.g, motionEvent.getX(), motionEvent.getY(), new uvc((byte) 14));
        if (view != null) {
            return view.performClick();
        }
        return false;
    }
}
