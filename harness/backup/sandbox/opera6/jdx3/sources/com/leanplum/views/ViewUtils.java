package com.leanplum.views;

import android.R;
import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import com.leanplum.utils.SizeUtil;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ViewUtils {
    public static void applyBackground(@NonNull View view, int i, boolean z) {
        SizeUtil.init(view.getContext());
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(createRoundRect(z ? SizeUtil.dp20 : 0));
        shapeDrawable.getPaint().setColor(i);
        WeakHashMap weakHashMap = r5n.a;
        view.setBackground(shapeDrawable);
    }

    public static Animation createFadeInAnimation(long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(j);
        return alphaAnimation;
    }

    public static Animation createFadeOutAnimation(long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(j);
        return alphaAnimation;
    }

    private static Shape createRoundRect(int i) {
        float f = i;
        return new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null);
    }

    public static int getThemeId(Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 1024 ? R.style.Theme.Translucent.NoTitleBar.Fullscreen : R.style.Theme.Translucent.NoTitleBar;
    }
}
