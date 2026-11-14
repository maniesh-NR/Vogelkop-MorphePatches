package com.opera.android.widget;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.cbl;
import defpackage.onl;
import defpackage.qa2;
import defpackage.s03;
import defpackage.uz4;
import defpackage.vml;
import defpackage.z89;

/* loaded from: classes.dex */
public class ThumbScroller extends FrameLayout {
    public static final /* synthetic */ int q = 0;
    public final qa2 a;
    public s03 b;
    public ViewPropertyAnimator c;
    public final Rect d;
    public FrameLayout e;
    public ImageView f;
    public int g;
    public int h;
    public zy9 i;
    public final int j;
    public int k;
    public int l;
    public long m;
    public long n;
    public boolean o;
    public final cbl p;

    public ThumbScroller(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new qa2(this, (byte) 1);
        this.d = new Rect();
        this.g = 2;
        this.h = 2;
        this.p = new cbl(this, (byte) 10);
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.c = null;
        }
        s03 s03Var = this.b;
        if (s03Var != null) {
            s03Var.b = true;
            this.b = null;
        }
        removeCallbacks(this.p);
    }

    public final int b() {
        return ((uz4) this.i.a).g;
    }

    public final void c(int i) {
        this.g = i;
        if (i == 1) {
            long j = ((uz4) this.i.a).b.n;
            if (j != 0) {
                N.MpcV7a8V(j, true);
                return;
            }
            return;
        }
        if (i == 2) {
            long j2 = ((uz4) this.i.a).b.n;
            if (j2 != 0) {
                N.MpcV7a8V(j2, false);
            }
        }
    }

    public final void d(boolean z, boolean z2) {
        qa2 qa2Var = this.a;
        if (qa2Var.b) {
            qa2Var.b = false;
            vml.a(qa2Var);
        }
        c(2);
        if (!z) {
            this.f.setAlpha(0.0f);
            this.f.setTranslationX(0.0f);
            setVisibility(4);
        } else {
            a();
            ViewPropertyAnimator listener = this.f.animate().translationX(getWidth()).setDuration(400L).setListener(new z89((byte) 1, this, z2));
            this.c = listener;
            listener.start();
        }
    }

    public final void e() {
        qa2 qa2Var = this.a;
        if (qa2Var.b) {
            qa2Var.b = false;
            vml.a(qa2Var);
        }
        qa2Var.b = true;
        uz4 uz4Var = (uz4) ((ThumbScroller) qa2Var.d).i.a;
        int i = uz4Var.i;
        boolean z = i == 0 || i == uz4Var.j;
        qa2Var.c = !z;
        vml.d(qa2Var, !z ? 1500L : 300L);
        if (this.g != 1) {
            c(1);
            a();
            setVisibility(0);
            ViewPropertyAnimator listener = this.f.animate().alpha(1.0f).translationX(0.0f).setDuration(250L).setListener(new onl(this, (byte) 1));
            this.c = listener;
            listener.start();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout frameLayout = (FrameLayout) findViewById(2131364742);
        this.e = frameLayout;
        frameLayout.setClickable(true);
        ImageView imageView = (ImageView) findViewById(2131364743);
        this.f = imageView;
        imageView.setAlpha(0.0f);
        setVisibility(4);
        this.f.setImageResource(this.h == 2 ? 2131232515 : 2131232516);
        ((Animatable) this.f.getDrawable()).start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (((defpackage.uz4) r0.a).i > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r10.i < r10.j) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        a();
        r10 = new defpackage.s03(r9, (byte) 7);
        r9.b = r10;
        r0 = r9.i;
        r9 = r9.h;
        r0 = (defpackage.uz4) r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r9 != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r9 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r9.n() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        if (r9.q() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r9.H() >= r9.h()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        r0.e = r10;
        r9.b0(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        r10.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        r9.o = true;
        d(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.widget.ThumbScroller.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
