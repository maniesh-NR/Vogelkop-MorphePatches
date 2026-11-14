package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerView;
import com.opera.android.OperaApplication;
import com.opera.android.media.MediaPlayerMini;
import com.opera.android.media.PlayerContainerView;

/* loaded from: classes.dex */
public final class vkd implements ValueAnimator.AnimatorUpdateListener {
    public final Rect a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final MediaPlayerMini e;
    public final sjg f;
    public final ValueAnimator g;
    public final Rect h;
    public final Rect i;

    public vkd(View view, View view2, ViewGroup viewGroup, boolean z, Rect rect) {
        float fFloatValue;
        Rect rect2;
        Context context = view.getContext();
        String[] strArr = OperaApplication.K;
        tjg tjgVarX = ((OperaApplication) context.getApplicationContext()).x();
        float f = 0.0f;
        if (z) {
            fFloatValue = 0.0f;
            f = 1.0f;
        } else {
            fFloatValue = 1.0f;
        }
        vkd vkdVar = (vkd) view.getTag(2131363449);
        if (vkdVar != null) {
            fFloatValue = ((Float) vkdVar.g.getAnimatedValue()).floatValue();
            vkdVar.g.cancel();
        }
        view.setTag(2131363449, this);
        this.a = rect;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
        MediaPlayerMini mediaPlayerMini = (MediaPlayerMini) j7c.n(viewGroup, 2131559047, viewGroup, false);
        this.e = mediaPlayerMini;
        viewGroup.addView(mediaPlayerMini);
        ei eiVar = mediaPlayerMini.a;
        sjg sjgVar = new sjg(3, (PlayerView) eiVar.f);
        this.f = sjgVar;
        boolean z2 = !z;
        if (z) {
            ((PlayerContainerView) eiVar.e).setVisibility(4);
        } else {
            tjgVarX.b(sjgVar, true);
        }
        mediaPlayerMini.setTranslationZ(1.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mediaPlayerMini.getLayoutParams();
        if (rect != null) {
            marginLayoutParams.width = rect.width();
            marginLayoutParams.height = rect.height();
            mediaPlayerMini.setLayoutParams(marginLayoutParams);
        }
        Rect rectT = q9n.t(viewGroup);
        if (rect == null || rect.width() == viewGroup.getWidth()) {
            int height = viewGroup.getHeight();
            Rect rect3 = new Rect(rect);
            rect3.offset(-rectT.left, -rectT.top);
            rect3.bottom = rect3.top + height;
            rect2 = rect3;
        } else {
            rect2 = new Rect(rect);
            rect2.offset(-rectT.left, -rectT.top);
        }
        this.h = rect2;
        this.i = new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(lf1.d);
        valueAnimatorOfFloat.addUpdateListener(this);
        valueAnimatorOfFloat.addListener(new cf1(this, z2, tjgVarX));
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fS;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Rect rect = this.h;
        float f = rect.left;
        Rect rect2 = this.i;
        float fG = v0g.g(rect2.left, f, fFloatValue, f);
        float f2 = rect.top;
        float fG2 = v0g.g(rect2.top, f2, fFloatValue, f2);
        float f3 = rect.right;
        float fG3 = v0g.g(rect2.right, f3, fFloatValue, f3);
        float f4 = rect.bottom;
        float fG4 = v0g.g(rect2.bottom, f4, fFloatValue, f4);
        ViewGroup viewGroup = this.b;
        float width = viewGroup.getWidth() + 0.0f;
        float f5 = (fG3 - fG) / (width - 0.0f);
        View view = this.c;
        view.setScaleX(f5);
        view.setScaleY((fG4 - fG2) / ((viewGroup.getHeight() + 0.0f) - 0.0f));
        float f6 = fG - 0.0f;
        view.setTranslationX(f6);
        float f7 = fG2 - 0.0f;
        view.setTranslationY(f7);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        Rect rect3 = this.a;
        if (rect3 == null || rect.width() != rect2.width()) {
            fS = 1.0f;
        } else {
            float fHeight = rect.top - rect3.height();
            fS = 1.0f - cs5.s((fG2 - fHeight) / (rect.top - fHeight), 0.0f, 1.0f);
        }
        this.d.setAlpha(fS);
        MediaPlayerMini mediaPlayerMini = this.e;
        mediaPlayerMini.setTranslationX(f6);
        mediaPlayerMini.setTranslationY(f7);
        mediaPlayerMini.setAlpha(1.0f - fFloatValue);
    }
}
