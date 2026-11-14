package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class ek9 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public dk9 e;
    public dk9 f;
    public boolean g;
    public int h;
    public final int[] i = new int[2];

    public ek9(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        dk9 dk9Var = this.f;
        View view = this.d;
        if (dk9Var != null) {
            view.removeCallbacks(dk9Var);
        }
        dk9 dk9Var2 = this.e;
        if (dk9Var2 != null) {
            view.removeCallbacks(dk9Var2);
        }
    }

    public abstract gij b();

    public abstract boolean c();

    public boolean d() {
        gij gijVarB = b();
        if (gijVarB == null || !gijVarB.a()) {
            return true;
        }
        gijVarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek9.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        dk9 dk9Var = this.e;
        if (dk9Var != null) {
            this.d.removeCallbacks(dk9Var);
        }
    }
}
