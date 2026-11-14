package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Optional;

/* loaded from: classes.dex */
public final class jba extends LayerDrawable {
    public final View a;
    public final ColorDrawable b;
    public final LinearInterpolator c;
    public Drawable d;
    public ObjectAnimator e;

    public jba(View view) {
        ColorDrawable colorDrawable = new ColorDrawable(f03.C(view.getContext()));
        Drawable drawable = (Drawable) Optional.ofNullable(view.getBackground()).orElse(new ColorDrawable(0));
        super(new Drawable[]{drawable, colorDrawable});
        this.c = new LinearInterpolator();
        setId(0, 1234);
        this.a = view;
        this.b = colorDrawable;
        this.d = drawable;
        colorDrawable.setAlpha(0);
        pc5 pc5Var = new pc5((Object) this, (byte) 28);
        dll dllVarS = q9n.s(view);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, view, pc5Var);
    }

    public final void a(boolean z) {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ColorDrawable colorDrawable = this.b;
        if (!z) {
            colorDrawable.setAlpha(0);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(colorDrawable, "alpha", 66, 0);
        this.e = objectAnimatorOfInt;
        objectAnimatorOfInt.setStartDelay(2500L);
        this.e.setDuration(200L);
        this.e.setRepeatCount(0);
        this.e.setInterpolator(this.c);
        this.e.start();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        invalidateDrawable(this.d);
        return super.onStateChange(iArr);
    }
}
