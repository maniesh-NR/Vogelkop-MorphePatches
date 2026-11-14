package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ResourceManagerInternal;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class cq1 {
    public final ImageView a;
    public km5 b;
    public int c = 0;

    public cq1(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            kl7.a(drawable);
            km5 km5Var = this.b;
            if (km5Var != null) {
                int[] drawableState = imageView.getDrawableState();
                PorterDuff.Mode mode = AppCompatDrawableManager.a;
                ResourceManagerInternal.i(drawable, km5Var, drawableState);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = zhh.g;
        ghf ghfVarH = ghf.H(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        Context context2 = imageView.getContext();
        TypedArray typedArray2 = (TypedArray) ghfVarH.c;
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(imageView, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = sgb.F(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                kl7.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(ghfVarH.s(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(kl7.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            ghfVarH.J();
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable drawableF = sgb.F(i, imageView.getContext());
            if (drawableF != null) {
                kl7.a(drawableF);
            }
            imageView.setImageDrawable(drawableF);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
