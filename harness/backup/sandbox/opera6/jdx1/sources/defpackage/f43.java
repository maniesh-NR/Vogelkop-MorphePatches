package defpackage;

import ads_mobile_sdk.ew1;
import ads_mobile_sdk.fo;
import ads_mobile_sdk.hg0;
import ads_mobile_sdk.qr0;
import ads_mobile_sdk.zt1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f43 extends FrameLayout {
    public final ew1 a;
    public final FrameLayout b;

    public f43(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.b = frameLayout;
        this.a = new ew1(this, frameLayout);
    }

    public f43(AdActivity adActivity) {
        super(adActivity);
        FrameLayout frameLayout = new FrameLayout(adActivity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.b = frameLayout;
        this.a = new ew1(this, frameLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.b;
        if (Intrinsics.a(frameLayout, view)) {
            return;
        }
        super.bringChildToFront(frameLayout);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        zt1 zt1Var;
        hg0 hg0Var;
        ew1 ew1Var = this.a;
        ew1Var.getClass();
        synchronized (ew1Var) {
            if (ew1Var.d.get()) {
                return false;
            }
            InternalNativeAd internalNativeAd = ew1Var.i;
            if (internalNativeAd == null || (zt1Var = internalNativeAd.e) == null) {
                return false;
            }
            qr0 qr0Var = internalNativeAd.s;
            qr0Var.getClass();
            Boolean bool = Boolean.FALSE;
            fo foVar = fo.a;
            if (((Boolean) qr0Var.a("gads:report_touch_event_on_intercept_touch:enabled", bool, foVar)).booleanValue()) {
                zt1Var.a(ew1Var.b, motionEvent);
            }
            InternalNativeAd internalNativeAd2 = ew1Var.i;
            if (internalNativeAd2 != null) {
                qr0 qr0Var2 = internalNativeAd2.s;
                qr0Var2.getClass();
                if (((Boolean) qr0Var2.a("gads:native_ad_view:on_intercept_touch_event:enabled", Boolean.TRUE, foVar)).booleanValue()) {
                    InternalNativeAd internalNativeAd3 = ew1Var.i;
                    if (internalNativeAd3 != null && (hg0Var = internalNativeAd3.t) != null) {
                        hg0Var.a(motionEvent);
                    }
                    if (zt1Var.e() != 0) {
                        zt1Var.f = new WeakReference(this);
                        GestureDetector gestureDetector = ew1Var.g;
                        if (gestureDetector != null) {
                            gestureDetector.onTouchEvent(motionEvent);
                        }
                    }
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (Intrinsics.a(this.b, view)) {
            return;
        }
        super.removeView(view);
    }
}
