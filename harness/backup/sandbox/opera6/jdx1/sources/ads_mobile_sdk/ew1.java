package ads_mobile_sdk;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import defpackage.f43;
import defpackage.fvo;
import defpackage.mdp;
import defpackage.udj;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ew1 implements fvo {
    public f43 b;
    public FrameLayout c;
    public final AtomicBoolean d;
    public View e;
    public ImageView.ScaleType f;
    public GestureDetector g;
    public final LinkedHashMap h;
    public InternalNativeAd i;

    public ew1(f43 f43Var, FrameLayout frameLayout) {
        this.b = f43Var;
        this.c = frameLayout;
        f43Var.setOnClickListener(this);
        f43 f43Var2 = this.b;
        if (f43Var2 != null) {
            f43Var2.setOnTouchListener(this);
        }
        this.d = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
    }

    public final void a(View view, String str) {
        synchronized (this) {
            if (this.d.get()) {
                return;
            }
            LinkedHashMap linkedHashMap = this.h;
            if (view != null) {
                linkedHashMap.put(str, new WeakReference(view));
            } else {
                linkedHashMap.remove(str);
            }
            if ("3011".equals(str)) {
                return;
            }
            if (view != null) {
                view.setOnTouchListener(this);
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final void a(InternalNativeAd internalNativeAd) {
        Context context;
        synchronized (this) {
            if (this.d.get()) {
                return;
            }
            InternalNativeAd internalNativeAd2 = this.i;
            if (internalNativeAd2 != null) {
                c(internalNativeAd2);
            }
            fvo.Gq.getClass();
            Handler handler = cw1.b;
            handler.post(new ttn(this, (byte) 18));
            b(internalNativeAd);
            String str = internalNativeAd.a.v;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    handler.post(new fmn(this, str, (byte) 16));
                }
            }
            f43 f43Var = this.b;
            if (f43Var != null && (context = f43Var.getContext()) != null) {
                this.g = internalNativeAd.e.e() != 0 ? new GestureDetector(context, new wx1(internalNativeAd.e, new WeakReference(this.b))) : null;
            }
            this.i = internalNativeAd;
        }
    }

    public final View b(String str) {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.h.get(str);
            return weakReference != null ? (View) weakReference.get() : null;
        }
    }

    public final Map b() {
        synchronized (this) {
            if (this.d.get()) {
                return n08.a;
            }
            return rbd.i(this.h);
        }
    }

    public final void b(InternalNativeAd internalNativeAd) throws Throwable {
        ew1 ew1Var;
        Throwable th;
        Throwable th2;
        synchronized (this) {
            try {
                if (!this.d.get()) {
                    qw1 qw1Var = internalNativeAd.q;
                    try {
                        qw1Var.b.b.a(this);
                        qw1Var.c.d.a(this);
                        try {
                            FrameLayout frameLayoutC = c();
                            if (frameLayoutC != null) {
                                mdp mdpVar = qw1Var.a;
                                mdpVar.getClass();
                                mdpVar.i = frameLayoutC;
                                mdpVar.j = true;
                                mdpVar.a(frameLayoutC);
                            }
                            iw1 iw1Var = internalNativeAd.l;
                            iw1Var.getClass();
                            defpackage.na2.B(iw1Var.a, null, null, new udj((Object) iw1Var, (Object) this, (mt5) null, (byte) 21), 3);
                            ew1Var = this;
                            try {
                                internalNativeAd.e.a(new WeakReference(this), this.b, this.h, ew1Var, this);
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            ew1Var = this;
                            th = th2;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        ew1Var = this;
                        th2 = th5;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                ew1Var = this;
            }
        }
    }

    public final FrameLayout c() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.b;
        }
    }

    public final void c(InternalNativeAd internalNativeAd) {
        synchronized (this) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.setClickable(false);
            }
            FrameLayout frameLayout2 = this.c;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            mdp mdpVar = internalNativeAd.q.a;
            View view = mdpVar.i;
            if (view != null) {
                view.removeOnAttachStateChangeListener(mdpVar);
            }
            fp fpVar = mdpVar.o;
            if (fpVar != null) {
                g0 g0Var = mdpVar.h;
                synchronized (g0Var) {
                    g0Var.h.remove(fpVar);
                }
            }
            mdpVar.o = null;
            mdpVar.b();
            mdpVar.i = null;
            internalNativeAd.e.a(this.b);
        }
    }

    public final FrameLayout d() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.c;
        }
    }

    public final ImageView.ScaleType e() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.f;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zt1 zt1Var;
        synchronized (this) {
            if (this.d.get() || this.g != null) {
                return;
            }
            InternalNativeAd internalNativeAd = this.i;
            if (internalNativeAd != null && (zt1Var = internalNativeAd.e) != null) {
                f43 f43Var = this.b;
                LinkedHashMap linkedHashMap = this.h;
                ImageView.ScaleType scaleType = this.f;
                if (scaleType == null) {
                    scaleType = iw1.i;
                }
                zt1Var.a(view, f43Var, linkedHashMap, scaleType);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zt1 zt1Var;
        hg0 hg0Var;
        synchronized (this) {
            if (this.d.get()) {
                return false;
            }
            InternalNativeAd internalNativeAd = this.i;
            if (internalNativeAd == null || (zt1Var = internalNativeAd.e) == null) {
                return false;
            }
            qr0 qr0Var = internalNativeAd.s;
            qr0Var.getClass();
            Boolean bool = Boolean.FALSE;
            fo foVar = fo.a;
            if (!((Boolean) qr0Var.a("gads:report_touch_event_on_intercept_touch:enabled", bool, foVar)).booleanValue()) {
                zt1Var.a(this.b, motionEvent);
            }
            InternalNativeAd internalNativeAd2 = this.i;
            if (internalNativeAd2 != null) {
                qr0 qr0Var2 = internalNativeAd2.s;
                qr0Var2.getClass();
                if (!((Boolean) qr0Var2.a("gads:native_ad_view:on_intercept_touch_event:enabled", Boolean.TRUE, foVar)).booleanValue()) {
                    InternalNativeAd internalNativeAd3 = this.i;
                    if (internalNativeAd3 != null && (hg0Var = internalNativeAd3.t) != null) {
                        hg0Var.a(motionEvent);
                    }
                    if (zt1Var.e() != 0) {
                        zt1Var.f = new WeakReference(view);
                        GestureDetector gestureDetector = this.g;
                        if (gestureDetector != null) {
                            gestureDetector.onTouchEvent(motionEvent);
                        }
                    }
                }
            }
            return false;
        }
    }
}
