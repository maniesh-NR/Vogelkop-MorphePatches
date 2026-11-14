package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class uri implements View.OnTouchListener {
    public final float a;
    public final tri b;
    public float c;
    public View d;

    public uri(Resources resources, tri triVar) {
        this.a = resources.getDimension(2131167420);
        this.b = triVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.d;
        if ((view2 == null || view2 == view) && view.getParent() != null) {
            float rawX = motionEvent.getRawX();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.c = rawX;
                view.setPressed(true);
                return true;
            }
            if (action == 1) {
                view.setPressed(false);
                View view3 = this.d;
                tri triVar = this.b;
                if (view3 == null) {
                    triVar.l(view);
                    return true;
                }
                this.d = null;
                if (((int) (rawX - this.c)) > view.getWidth() / 2) {
                    triVar.d(view);
                    return true;
                }
                view.offsetLeftAndRight(0 - view.getLeft());
                view.invalidate();
                return true;
            }
            if (action == 2) {
                if (this.d == null && Math.abs(rawX - this.c) > this.a) {
                    this.d = view;
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.d != null) {
                    view.offsetLeftAndRight((int) (Math.max(0.0f, rawX - this.c) - view.getLeft()));
                    view.invalidate();
                }
            } else if (action == 3) {
                view.setPressed(false);
                if (this.d != null) {
                    this.d = null;
                    view.offsetLeftAndRight(0 - view.getLeft());
                    view.invalidate();
                    return true;
                }
            }
        }
        return true;
    }
}
