package com.opera.android;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import defpackage.e3g;
import defpackage.kc;
import defpackage.lf1;
import defpackage.lv3;
import defpackage.tah;
import defpackage.wmj;

/* loaded from: classes.dex */
public class LoadingView extends RelativeLayout {
    public tah a;
    public lv3 b;
    public boolean c;
    public boolean d;

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(boolean z) {
        if (this.c) {
            this.c = false;
            tah tahVar = this.a;
            AnimatorSet animatorSet = (AnimatorSet) tahVar.j;
            if (animatorSet != null) {
                animatorSet.cancel();
                yne.b.c((ImageView) tahVar.h);
                if (!z) {
                    tahVar.x();
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((FrameLayout) tahVar.g, "alpha", 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((FrameLayout) tahVar.g, "scaleX", 2.5f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((FrameLayout) tahVar.g, "scaleY", 2.5f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat((LoadingView) tahVar.d, "alpha", 1.0f, 0.0f);
                LinearInterpolator linearInterpolator = lf1.f;
                objectAnimatorOfFloat.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat3.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat4.setInterpolator(linearInterpolator);
                AnimatorSet animatorSet2 = new AnimatorSet();
                tahVar.j = animatorSet2;
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                ((AnimatorSet) tahVar.j).addListener(new kc(tahVar));
                ((AnimatorSet) tahVar.j).start();
            }
        }
    }

    public final void b(tah tahVar) {
        tah tahVar2 = this.a;
        if (tahVar2 != tahVar) {
            if (tahVar2 != null) {
                AnimatorSet animatorSet = (AnimatorSet) tahVar2.j;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    tahVar2.j = null;
                }
                ((LoadingView) tahVar2.d).setAlpha(1.0f);
                ((LoadingView) tahVar2.d).removeView((FrameLayout) tahVar2.g);
                tahVar2.d = null;
            }
            this.a = tahVar;
            if (tahVar != null) {
                Context context = getContext();
                if (((FrameLayout) tahVar.g) == null) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    tahVar.g = frameLayout;
                    frameLayout.setPadding(1, 1, 1, 1);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    ImageView imageView = new ImageView(context);
                    tahVar.h = imageView;
                    imageView.setLayoutParams(layoutParams);
                    ((FrameLayout) tahVar.g).addView((ImageView) tahVar.h);
                    wmj wmjVar = new wmj(context);
                    tahVar.i = wmjVar;
                    wmjVar.e = true;
                    wmjVar.setLayoutParams(layoutParams);
                    ((FrameLayout) tahVar.g).addView((wmj) tahVar.i);
                    tahVar.k = new e3g((ImageView) tahVar.h);
                }
                tahVar.d = this;
                addView((FrameLayout) tahVar.g);
            }
        }
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        boolean zOnSetAlpha = super.onSetAlpha(i);
        lv3 lv3Var = this.b;
        if (lv3Var != null) {
            xf8.F0(lv3Var.a.y1, Float.valueOf(this.d ? getAlpha() : 0.0f));
        }
        return zOnSetAlpha;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.d = z;
        lv3 lv3Var = this.b;
        if (lv3Var != null) {
            xf8.F0(lv3Var.a.y1, Float.valueOf(z ? getAlpha() : 0.0f));
        }
    }
}
