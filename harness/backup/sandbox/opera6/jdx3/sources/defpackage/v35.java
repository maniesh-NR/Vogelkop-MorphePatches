package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.BrowserActivity;
import com.opera.android.widget.ClickAwareCardView;
import org.chromium.components.browser_ui.widget.list_view.AppMenuListView;

/* loaded from: classes.dex */
public final class v35 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v35(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                int i = ydb.H;
                ydb ydbVar = (ydb) obj;
                if (ydbVar.D) {
                    if (ydbVar.z.isQuickScaleEnabled()) {
                        return true;
                    }
                    ydbVar.e = true;
                    float fH = ydbVar.h();
                    float f = ydbVar.f();
                    float fG = ydbVar.g();
                    float f2 = fH + ydbVar.y;
                    if (f2 <= f) {
                        fG = f2;
                    }
                    ydbVar.p(Math.min(ydbVar.f(), Math.max(fG, ydbVar.g())), motionEvent.getX(), motionEvent.getY(), ydbVar.m);
                }
                return super.onDoubleTap(motionEvent);
            case 7:
                hdo hdoVar = (hdo) obj;
                hdoVar.j = motionEvent.getX();
                hdoVar.k = motionEvent.getY();
                hdoVar.l = (byte) 1;
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                int i = ydb.H;
                ydb ydbVar = (ydb) this.b;
                AnimatorSet animatorSet = ydbVar.w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    ydbVar.w = null;
                }
                return !ydbVar.l;
            case 3:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 2:
                ydb ydbVar = (ydb) this.b;
                if (!ydbVar.F || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || ydbVar.z.isInProgress() || SystemClock.uptimeMillis() - ydbVar.G <= 150) {
                    return false;
                }
                if (!(ydbVar.h() > 1.0f ? true : !ydbVar.u.contains(ydbVar.b(ydbVar.b)))) {
                    return false;
                }
                byte b = 2;
                if (Math.abs(f) <= (ydbVar.n << 2) && Math.abs(f2) <= (ydbVar.n << 2)) {
                    return false;
                }
                float fMin = Math.min(Math.max(2.0f, ydbVar.h() / 2.0f), 3.0f);
                float width = ydbVar.getWidth() * fMin * (f / ydbVar.o);
                float height = ydbVar.getHeight() * fMin * (f2 / ydbVar.o);
                ydbVar.e = true;
                long jMin = (long) Math.min(Math.max(300.0d, Math.sqrt(Math.pow(height, 2.0d) + Math.pow(width, 2.0d)) / 5.0d), 800.0d);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, width).setDuration(jMin);
                ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, height).setDuration(jMin);
                AnimatorSet animatorSet = ydbVar.w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    ydbVar.w = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                ydbVar.w = animatorSet2;
                animatorSet2.playTogether(duration, duration2);
                ydbVar.w.setDuration(jMin);
                ydbVar.w.setInterpolator(new DecelerateInterpolator());
                ydbVar.w.start();
                duration2.addUpdateListener(new e0b(ydbVar, duration, duration2));
                ydbVar.w.addListener(new df1(ydbVar, b));
                ydbVar.postInvalidate();
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM;
        i iVarT;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ydb ydbVar = (ydb) obj;
                if (ydbVar.isLongClickable() && !ydbVar.z.isInProgress()) {
                    ydbVar.setPressed(true);
                    ydbVar.performLongClick();
                    break;
                }
                break;
            case 3:
                flb flbVar = (flb) obj;
                RecyclerView recyclerView = flbVar.v;
                blb blbVar = flbVar.q;
                if (recyclerView != null && (viewM = flbVar.m(motionEvent)) != null && (iVarT = flbVar.v.T(viewM)) != null) {
                    RecyclerView recyclerView2 = flbVar.v;
                    if ((blb.e(blbVar.h(recyclerView2, iVarT), recyclerView2.getLayoutDirection()) & 16711680) != 0 && motionEvent.getPointerId(0) == flbVar.p) {
                        flbVar.e = flbVar.g;
                        flbVar.f = flbVar.h;
                        flbVar.m = 0.0f;
                        flbVar.l = 0.0f;
                        if (blbVar.m()) {
                            flbVar.r(iVarT, 2);
                            break;
                        }
                    }
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        switch (this.a) {
            case 2:
                ydb ydbVar = (ydb) this.b;
                if (ydbVar.F && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ydbVar.z.isInProgress()) {
                    if (ydbVar.h() > 1.0f) {
                        z = true;
                    } else {
                        z = !ydbVar.u.contains(ydbVar.b(ydbVar.b));
                    }
                    if (z) {
                        ydbVar.e = true;
                        ydbVar.k(-f, -f2);
                        ydbVar.invalidate();
                        return true;
                    }
                }
                return false;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ClickAwareCardView clickAwareCardView = (ClickAwareCardView) obj;
                View viewB = fan.b(clickAwareCardView, clickAwareCardView, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (viewB != null && (onClickListener = clickAwareCardView.q) != null) {
                    onClickListener.onClick(viewB);
                }
                return true;
            case 1:
                ota otaVar = (ota) obj;
                otaVar.performClick();
                ghf ghfVar = otaVar.e;
                if (ghfVar != null) {
                    zhj.b(wg7.class).c((BrowserActivity) ((wjh) ghfVar.d).b);
                }
                return true;
            case 2:
                return true;
            case 3:
            case 4:
            default:
                return super.onSingleTapConfirmed(motionEvent);
            case 5:
                ((i) ((sue) obj)).itemView.performClick();
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                return !((ydb) obj).l;
            case 3:
            case 5:
            default:
                return super.onSingleTapUp(motionEvent);
            case 4:
                fge fgeVar = (fge) obj;
                RecyclerView recyclerView = fgeVar.A;
                if (recyclerView != null) {
                    recyclerView.requestFocus();
                    q9n.u(fgeVar.A);
                }
                return true;
            case 6:
                AppMenuListView appMenuListView = (AppMenuListView) obj;
                int pointerCount = motionEvent.getPointerCount();
                int[] iArr = new int[pointerCount];
                for (int i = 0; i < pointerCount; i++) {
                    iArr[i] = motionEvent.getToolType(i);
                }
                motionEvent.getAction();
                motionEvent.getSource();
                motionEvent.getMetaState();
                appMenuListView.getClass();
                return true;
        }
    }
}
