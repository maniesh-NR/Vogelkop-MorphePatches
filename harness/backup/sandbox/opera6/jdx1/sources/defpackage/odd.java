package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes.dex */
public final class odd extends Animatable2Compat.AnimationCallback {
    public final /* synthetic */ MaterialCheckBox a;

    public odd(MaterialCheckBox materialCheckBox) {
        this.a = materialCheckBox;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        ColorStateList colorStateList = this.a.n;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        super.onAnimationStart(drawable);
        MaterialCheckBox materialCheckBox = this.a;
        ColorStateList colorStateList = materialCheckBox.n;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.r, colorStateList.getDefaultColor()));
        }
    }
}
