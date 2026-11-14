package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.UpdateAppearance;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.OverScroller;
import android.widget.TextView;
import com.opera.android.media.QuickJumpPlayerView;

/* loaded from: classes.dex */
public final class sgh extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public sgh(View.OnClickListener onClickListener, View view) {
        this.a = (byte) 2;
        this.b = onClickListener;
        this.c = view;
    }

    public sgh(QuickJumpPlayerView quickJumpPlayerView, pgh pghVar) {
        this.a = (byte) 0;
        this.c = quickJumpPlayerView;
        this.b = pghVar;
    }

    public /* synthetic */ sgh(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pgh pghVar = (pgh) obj;
                pghVar.getClass();
                boolean z = motionEvent.getX() < ((float) pghVar.c.getWidth()) / 2.0f;
                if (!(pghVar.i && z) && (!pghVar.j || z)) {
                    return false;
                }
                pghVar.b(z);
                return true;
            case 1:
            default:
                return super.onDoubleTap(motionEvent);
            case 2:
                ((View.OnClickListener) obj).onClick((View) this.c);
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                ((OverScroller) ((w6j) this.c).d).abortAnimation();
                return false;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 3:
                w6j w6jVar = (w6j) this.c;
                boolean zK = w6jVar.k();
                zjn zjnVar = (zjn) w6jVar.a;
                if (!zK || ((ScaleGestureDetector) this.b).isInProgress()) {
                    return false;
                }
                RectF rectFB = zjnVar.b(((lkn) w6jVar.e).getBounds(), ((lkn) w6jVar.e).b(), ((lkn) w6jVar.e).a());
                Rect bounds = ((lkn) w6jVar.e).getBounds();
                int iB = ((lkn) w6jVar.e).b();
                int iA = ((lkn) w6jVar.e).a();
                float fA = zjnVar.a(bounds, iB, iA);
                Rect rect = new Rect(0, 0, Math.round(iB * fA) - bounds.width(), Math.round(iA * fA) - bounds.height());
                ((OverScroller) w6jVar.d).fling(Math.round(rectFB.left), Math.round(rectFB.top), -Math.round(f), -Math.round(f2), rect.left, rect.right, rect.top, rect.bottom);
                ((View) w6jVar.c).postOnAnimation(new y1n((Object) w6jVar, (byte) 22));
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        zt ztVar;
        switch (this.a) {
            case 1:
                TextView textView = (TextView) this.b;
                vwj vwjVar = (vwj) this.c;
                UpdateAppearance updateAppearance = vwjVar.a;
                if (!(updateAppearance instanceof p0d) || !((p0d) updateAppearance).b()) {
                    if (vwjVar.a == null && (ztVar = vwjVar.d) != null) {
                        ztVar.onLongClick(textView);
                        break;
                    }
                } else {
                    textView.cancelLongPress();
                    textView.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 3:
                w6j w6jVar = (w6j) this.c;
                if (!w6jVar.k() || ((ScaleGestureDetector) this.b).isInProgress()) {
                    return false;
                }
                RectF rectFB = ((zjn) w6jVar.a).b(((lkn) w6jVar.e).getBounds(), ((lkn) w6jVar.e).b(), ((lkn) w6jVar.e).a());
                w6jVar.r(rectFB.left + f, rectFB.top + f2);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (((pgh) this.b).e > 0) {
                    return true;
                }
                return ((QuickJumpPlayerView) this.c).performClick();
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                TextView textView = (TextView) obj2;
                vwj vwjVar = (vwj) obj;
                agc agcVar = vwjVar.a;
                if (agcVar == null) {
                    yk4 yk4Var = vwjVar.c;
                    if (yk4Var != null) {
                        yk4Var.onClick(textView);
                        break;
                    }
                } else {
                    agcVar.onClick(textView);
                    break;
                }
                break;
            case 4:
                ((aoo) obj).q((View) obj2);
                break;
        }
        return super.onSingleTapUp(motionEvent);
    }
}
