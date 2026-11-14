package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class z46 extends tq3 implements sni {
    public final tni r;
    public final kp5 s;
    public vq3 t;

    public z46(Context context, int i) {
        super(context, i);
        this.s = new kp5(this);
        dx3 dx3VarP = q9n.p(context);
        if (dx3VarP != null) {
            this.r = dx3VarP.l;
        }
    }

    @Override // defpackage.sni
    public final void Y(boolean z) {
        vq3 vq3Var = this.t;
        if (vq3Var != null) {
            vq3Var.Y(z);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (c37.r().l(1, keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        if (this.r != null) {
            return;
        }
        addContentView(new y46(this, getContext()), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // defpackage.tq3
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tni tniVar = this.r;
        if (tniVar != null) {
            tniVar.a(this);
        }
    }

    @Override // defpackage.tq3
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tni tniVar = this.r;
        if (tniVar != null) {
            tniVar.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tq3
    public final void onStart() {
        super.onStart();
        View decorView = getWindow().getDecorView();
        WeakHashMap weakHashMap = r5n.a;
        m5n.a(decorView, this.s);
        q9n.i(getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStop() {
        super.onStop();
        View decorView = getWindow().getDecorView();
        WeakHashMap weakHashMap = r5n.a;
        m5n.e(decorView, this.s);
    }

    @Override // defpackage.tq3
    public final void setContentView(int i) {
        super.setContentView(i);
        h();
        oup.o0(this);
    }

    @Override // defpackage.tq3
    public final void setContentView(View view) {
        super.setContentView(view);
        h();
        oup.o0(this);
    }

    @Override // defpackage.tq3
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        h();
        oup.o0(this);
    }
}
