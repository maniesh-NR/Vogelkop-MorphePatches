package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b0j extends ol7 {
    public static final /* synthetic */ int d = 0;
    public final HashSet b;
    public final LayerDrawable c;

    public b0j(LayerDrawable layerDrawable, Integer... numArr) {
        super(layerDrawable);
        this.b = new HashSet(Arrays.asList(numArr));
        this.c = layerDrawable;
    }

    public final HashSet b(LayerDrawable layerDrawable) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            if (!this.b.contains(Integer.valueOf(layerDrawable.getId(i)))) {
                Drawable drawable = layerDrawable.getDrawable(i);
                if (drawable instanceof LayerDrawable) {
                    hashSet.addAll(b((LayerDrawable) drawable));
                } else {
                    hashSet.add(drawable);
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable mutate() {
        this.c.mutate();
        return super/*android.graphics.drawable.Drawable*/.mutate();
    }

    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        Iterator it = b(this.c).iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setColorFilter(i, mode);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Iterator it = b(this.c).iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Iterator it = b(this.c).iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Iterator it = b(this.c).iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Iterator it = b(this.c).iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setTintMode(mode);
        }
    }
}
