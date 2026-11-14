package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselLayoutManager;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView;

/* loaded from: classes.dex */
public final class w1k implements nph {
    public float a;
    public float b;
    public int c = -1;
    public boolean d;
    public final /* synthetic */ SpotlightCarouselRecyclerView e;

    public w1k(SpotlightCarouselRecyclerView spotlightCarouselRecyclerView) {
        this.e = spotlightCarouselRecyclerView;
    }

    public final boolean a(MotionEvent motionEvent) {
        float fAbs = Math.abs(motionEvent.getX() - this.a);
        int i = this.e.G0;
        return fAbs > ((float) i) || Math.abs(motionEvent.getY() - this.b) > ((float) i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView] */
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i;
        int i2;
        ?? r0 = this.e;
        SpotlightCarouselLayoutManager spotlightCarouselLayoutManager = r0.K0;
        if (spotlightCarouselLayoutManager != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.a = motionEvent.getX();
                this.b = motionEvent.getY();
                View viewH = r0.H(motionEvent.getX(), motionEvent.getY());
                this.c = viewH != null ? RecyclerView.S(viewH) : -1;
                this.d = true;
                ViewParent parent = recyclerView.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 1) {
                int i3 = this.c;
                this.c = -1;
                if (this.d) {
                    this.d = false;
                    ViewParent parent2 = recyclerView.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                    }
                }
                if (i3 != -1 && !a(motionEvent)) {
                    Integer numValueOf = null;
                    if (spotlightCarouselLayoutManager.e != 0) {
                        int iR = ((i3 * spotlightCarouselLayoutManager.r()) + spotlightCarouselLayoutManager.s()) - spotlightCarouselLayoutManager.g;
                        int i4 = spotlightCarouselLayoutManager.e + iR;
                        int paddingStart = spotlightCarouselLayoutManager.getPaddingStart();
                        int width = spotlightCarouselLayoutManager.getWidth() - spotlightCarouselLayoutManager.getPaddingEnd();
                        if (iR < paddingStart) {
                            i = spotlightCarouselLayoutManager.g;
                            i2 = i - (paddingStart - iR);
                        } else if (i4 > width) {
                            i = spotlightCarouselLayoutManager.g;
                            i2 = (i4 - width) + i;
                        }
                        numValueOf = Integer.valueOf(cs5.t((int) (i2 < i ? Math.floor(i2 / r8) : Math.ceil(i2 / r8)), 0, spotlightCarouselLayoutManager.p(spotlightCarouselLayoutManager.getItemCount())));
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        int i5 = SpotlightCarouselRecyclerView.L0;
                        spotlightCarouselLayoutManager.startSmoothScroll(new v1k(iIntValue, r0.getContext(), spotlightCarouselLayoutManager));
                        return true;
                    }
                }
            } else if (action == 2) {
                if (a(motionEvent)) {
                    this.c = -1;
                }
                if (this.d && Math.abs(motionEvent.getY() - this.b) > r0.H0) {
                    this.d = false;
                    ViewParent parent3 = recyclerView.getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else if (action == 3) {
                this.c = -1;
                if (this.d) {
                    this.d = false;
                    ViewParent parent4 = recyclerView.getParent();
                    if (parent4 != null) {
                        parent4.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void c(boolean z) {
    }

    public final void d(MotionEvent motionEvent) {
    }
}
