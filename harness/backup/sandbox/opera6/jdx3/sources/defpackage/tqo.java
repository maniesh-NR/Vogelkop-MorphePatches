package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.util.Size;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class tqo extends DrawableWrapper {
    public static final zyk h = z4c.b(a43.J);
    public final File a;
    public cno b;
    public final Context c;
    public final zyk d;
    public final AtomicBoolean e;
    public qt6 f;
    public ObjectAnimator g;

    public tqo(Context context, File file, Size size, cno cnoVar) {
        super(null);
        this.a = file;
        this.b = cnoVar;
        this.c = context.getApplicationContext();
        this.d = z4c.b(new qqo(this, (byte) 0));
        this.e = new AtomicBoolean(false);
        this.f = new qt6();
        setDrawable(new c7p(z4c.b(new m53(size, this, (byte) 27))));
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.e.compareAndSet(false, true)) {
            na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new sqo((byte) 0, (mt5) null, this), 3);
        }
        try {
            super.draw(canvas);
        } catch (Exception unused) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getAlpha() {
        Integer num;
        qt6 qt6Var = this.f;
        return (qt6Var == null || (num = (Integer) qt6Var.c) == null) ? super.getAlpha() : num.intValue();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        qt6 qt6Var = this.f;
        return (qt6Var == null || (colorFilter = (ColorFilter) qt6Var.e) == null) ? super.getColorFilter() : colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Boolean bool;
        qt6 qt6Var = this.f;
        return (qt6Var == null || (bool = (Boolean) qt6Var.d) == null) ? super.isAutoMirrored() : bool.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isFilterBitmap() {
        Boolean bool;
        qt6 qt6Var = this.f;
        return (qt6Var == null || (bool = (Boolean) qt6Var.f) == null) ? super.isFilterBitmap() : bool.booleanValue();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        qt6 qt6Var = this.f;
        if (qt6Var != null) {
            qt6Var.a = true;
        }
        return super.mutate();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.g = null;
        super.setAlpha(i);
        qt6 qt6Var = this.f;
        if (qt6Var == null) {
            return;
        }
        qt6Var.c = Integer.valueOf(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
        qt6 qt6Var = this.f;
        if (qt6Var == null) {
            return;
        }
        qt6Var.d = Boolean.valueOf(z);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        qt6 qt6Var = this.f;
        if (qt6Var == null) {
            return;
        }
        qt6Var.e = colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
        qt6 qt6Var = this.f;
        if (qt6Var == null) {
            return;
        }
        qt6Var.f = Boolean.valueOf(z);
    }
}
