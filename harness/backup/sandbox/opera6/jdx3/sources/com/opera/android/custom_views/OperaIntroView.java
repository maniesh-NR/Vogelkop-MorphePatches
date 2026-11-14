package com.opera.android.custom_views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.opera.android.custom_views.OperaIntroView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.dlf;
import defpackage.ea3;
import defpackage.elf;
import defpackage.flf;
import defpackage.i3d;
import defpackage.kqd;
import defpackage.lf1;
import defpackage.nli;
import defpackage.oll;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public class OperaIntroView extends ThemeableLottieAnimationView implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int F = 0;
    public final PriorityQueue A;
    public elf B;
    public int C;
    public float D;
    public Float E;
    public final nli y;
    public final dlf z;

    public OperaIntroView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new nli();
        dlf dlfVar = new dlf();
        this.z = dlfVar;
        this.A = new PriorityQueue();
        this.C = 0;
        i3d i3dVar = new i3d("color0", 2130969966);
        i3d i3dVar2 = new i3d("color1", 2130969967);
        PointF pointF = k3d.a;
        z(i3dVar, i3dVar2, new i3d(2130969967, 2, "color1", false));
        v(i3d.a("progressBar"), k3d.j, new kqd((Object) this, (byte) 19));
        dlfVar.addUpdateListener(this);
    }

    public final void A() {
        if (this.B == null) {
            return;
        }
        int iCeil = (int) Math.ceil(B() * 100.0f);
        while (true) {
            PriorityQueue priorityQueue = this.A;
            if (priorityQueue.isEmpty() || ((Integer) priorityQueue.peek()).intValue() > iCeil) {
                return;
            } else {
                this.B.onProgress(((Integer) priorityQueue.poll()).intValue());
            }
        }
    }

    public final float B() {
        Object animatedValue = this.z.getAnimatedValue();
        if (animatedValue != null) {
            return ((Float) animatedValue).floatValue();
        }
        Float f = this.E;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void C(int i) {
        if (this.C == i) {
            return;
        }
        this.C = i;
        ((n2d) this).d.b.addListener(new ea3(this, i, (byte) 2));
        p(0);
    }

    public final void D(elf elfVar, List list) {
        PriorityQueue priorityQueue = this.A;
        priorityQueue.clear();
        this.B = elfVar;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                num.getClass();
                priorityQueue.offer(num);
            }
        }
    }

    public final void E(float f, int i) {
        if (this.D > f) {
            return;
        }
        float fB = B();
        dlf dlfVar = this.z;
        boolean zIsRunning = dlfVar.isRunning();
        float f2 = ((n2d) this).d.b.h;
        boolean z = ((int) f2) >= 156 && ((int) f2) < 237;
        dlfVar.cancel();
        dlfVar.setFloatValues(fB, f);
        dlfVar.setDuration(i);
        dlfVar.setInterpolator(zIsRunning ? lf1.c : lf1.a);
        if (z) {
            dlfVar.start();
        }
        invalidate();
        this.D = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        A();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof flf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final flf flfVar = (flf) parcelable;
        super.onRestoreInstanceState(((g3) flfVar).a);
        u(new oll() { // from class: clf
            @Override // defpackage.oll
            public final void a() {
                int i = OperaIntroView.F;
                flf flfVar2 = flfVar;
                float f = flfVar2.e;
                OperaIntroView operaIntroView = this.a;
                if (f > 0.0f) {
                    float f2 = flfVar2.d;
                    if (operaIntroView.E == null) {
                        operaIntroView.E = Float.valueOf(f2);
                        operaIntroView.D = f2;
                    }
                    operaIntroView.E(f, flfVar2.f);
                }
                int i2 = flfVar2.c;
                if (i2 != 0) {
                    operaIntroView.C(i2);
                }
                ((n2d) operaIntroView).j.add(l2d.f);
                ((n2d) operaIntroView).d.n();
            }
        });
    }

    public final Parcelable onSaveInstanceState() {
        return new flf(super.onSaveInstanceState(), this.C, B(), this.D, (int) this.z.getDuration());
    }
}
