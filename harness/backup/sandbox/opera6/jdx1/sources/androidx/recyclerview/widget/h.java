package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import defpackage.hph;
import defpackage.r5n;
import defpackage.uph;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public h(RecyclerView recyclerView) {
        this.g = recyclerView;
        alb albVar = RecyclerView.E0;
        this.d = albVar;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), albVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.g;
        recyclerView.E0(2);
        this.b = 0;
        this.a = 0;
        alb albVar = this.d;
        alb albVar2 = RecyclerView.E0;
        if (albVar != albVar2) {
            this.d = albVar2;
            this.c = new OverScroller(recyclerView.getContext(), albVar2);
        }
        this.c.fling(0, 0, i, i2, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r5n.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        int height;
        RecyclerView recyclerView = this.g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            if (iAbs > iAbs2) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / height) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.E0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.E0(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        RecyclerView recyclerView = this.g;
        int[] iArr = recyclerView.t0;
        if (recyclerView.n == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.u();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.a;
            int i4 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int iT = RecyclerView.t(i3, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int iT2 = RecyclerView.t(i4, recyclerView.J, recyclerView.L, recyclerView.getHeight());
            int[] iArr2 = recyclerView.t0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.Y().v(iT, iT2, 1, iArr2, (int[]) null)) {
                iT -= iArr[0];
                iT2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.s(iT, iT2);
            }
            if (recyclerView.m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.w0(iT, iT2, iArr);
                int i5 = iArr[0];
                int i6 = iArr[1];
                iT -= i5;
                iT2 -= i6;
                uph uphVar = recyclerView.n.mSmoothScroller;
                if (uphVar != null && !uphVar.isPendingInitialRun() && uphVar.isRunning()) {
                    int iB = recyclerView.h0.b();
                    if (iB == 0) {
                        uphVar.stop();
                    } else if (uphVar.getTargetPosition() >= iB) {
                        uphVar.setTargetPosition(iB - 1);
                        uphVar.onAnimation(i5, i6);
                    } else {
                        uphVar.onAnimation(i5, i6);
                    }
                }
                i = i5;
                i2 = i6;
            } else {
                i = 0;
                i2 = 0;
            }
            int i7 = iT;
            int i8 = iT2;
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.t0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.Y().w(i, i2, i7, i8, (int[]) null, 1, iArr3);
            int i9 = i2;
            int i10 = i7 - iArr[0];
            int i11 = i8 - iArr[1];
            if (i != 0 || i9 != 0) {
                recyclerView.A(i, i9);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
            uph uphVar2 = recyclerView.n.mSmoothScroller;
            if ((uphVar2 == null || !uphVar2.isPendingInitialRun()) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i12 = i10 < 0 ? -currVelocity : i10 > 0 ? currVelocity : 0;
                    if (i11 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i11 <= 0) {
                        currVelocity = 0;
                    }
                    if (i12 < 0) {
                        recyclerView.C();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i12);
                        }
                    } else if (i12 > 0) {
                        recyclerView.D();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i12);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.E();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.B();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (i12 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                a aVar = recyclerView.g0;
                int[] iArr4 = aVar.c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                aVar.d = 0;
            } else {
                b();
                b bVar = recyclerView.f0;
                if (bVar != null) {
                    bVar.a(recyclerView, i, i9);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                hph.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        uph uphVar3 = recyclerView.n.mSmoothScroller;
        if (uphVar3 != null && uphVar3.isPendingInitialRun()) {
            uphVar3.onAnimation(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.E0(0);
            recyclerView.Y().K(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = r5n.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
