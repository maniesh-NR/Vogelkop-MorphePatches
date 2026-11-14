package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j2p extends f2p {
    public final jkp b;
    public final /* synthetic */ a3p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2p(a3p a3pVar, Context context) {
        super(context);
        this.c = a3pVar;
        setBackgroundColor(0);
        getSettings().setGeolocationEnabled(a3pVar.h);
        setOnLongClickListener(new j4k((byte) 2));
        if (aap.f().r) {
            this.b = new jkp(this, a3pVar.g, 500L);
        }
    }

    @Override // defpackage.f2p
    public final void c(boolean z) {
        this.c.c.a(z);
    }

    @Override // defpackage.f2p
    public final void d() {
        this.c.i.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c.f0 = -1L;
            this.c.g0.set(false);
        } else if (actionMasked == 1) {
            this.c.f0 = SystemClock.elapsedRealtime();
        }
        jkp jkpVar = this.b;
        if (jkpVar != null) {
            jkpVar.b(this, null, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        Window window;
        View viewPeekDecorView;
        super.onAttachedToWindow();
        p7p p7pVar = this.c.g;
        if (p7pVar != null) {
            Activity activityB = xgh.b(this);
            if (activityB != null && (window = activityB.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null && viewPeekDecorView.isAttachedToWindow() && !xgh.c(viewPeekDecorView)) {
                LinkedHashSet linkedHashSet = p7p.c;
                i = 1005;
            } else {
                if (!isAttachedToWindow() || xgh.c(this)) {
                    return;
                }
                LinkedHashSet linkedHashSet2 = p7p.c;
                i = 1006;
            }
            p7pVar.g(i, null);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        ito[] itoVarArr = ito.a;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        a3p a3pVar;
        n2p n2pVar;
        if (i != 4 || ((n2pVar = (a3pVar = this.c).v) != n2p.EXPANDED && n2pVar != n2p.RESIZED)) {
            return super.onKeyDown(i, keyEvent);
        }
        a3pVar.t();
        return true;
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a3p a3pVar = this.c;
        Rect rect = a3pVar.B;
        Rect rect2 = a3pVar.C;
        boolean z2 = a3pVar.k;
        n2p n2pVar = a3pVar.v;
        if (n2pVar == n2p.HIDDEN && z2) {
            ito[] itoVarArr = ito.a;
            return;
        }
        boolean z3 = this == a3pVar.q;
        Objects.toString(n2pVar);
        ito[] itoVarArr2 = ito.a;
        if (z3) {
            if (a3pVar.J) {
                a3pVar.J = false;
                return;
            }
            n2p n2pVar2 = a3pVar.v;
            if (n2pVar2 == n2p.LOADING || n2pVar2 == n2p.DEFAULT) {
                a3pVar.o();
                a3pVar.m();
            }
            if (!a3pVar.M) {
                a3pVar.i(true);
                if (z2 && !Intrinsics.a(rect2, rect)) {
                    rect2.set(rect);
                    a3pVar.w();
                }
            }
            if (a3pVar.K) {
                a3pVar.K = false;
                if (z2) {
                    a3pVar.v = n2p.DEFAULT;
                    a3pVar.H = true;
                }
                if (!a3pVar.L) {
                    a3pVar.r();
                }
                if (z2) {
                    a3pVar.g("mraid.fireReadyEvent();");
                    if (a3pVar.w) {
                        a3pVar.s();
                    }
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        Map map = a3p.h0;
        ito[] itoVarArr = ito.a;
        a3p a3pVar = this.c;
        if (a3pVar.k) {
            a3pVar.u(i);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        Map map = a3p.h0;
        ito[] itoVarArr = ito.a;
        a3p a3pVar = this.c;
        if (a3pVar.k) {
            a3pVar.u(i);
        }
        if (i == 0) {
            Objects.toString(this);
            onResume();
            return;
        }
        Objects.toString(this);
        Objects.toString(a3pVar.v);
        if (a3pVar.v == n2p.EXPANDED) {
            return;
        }
        onPause();
    }
}
