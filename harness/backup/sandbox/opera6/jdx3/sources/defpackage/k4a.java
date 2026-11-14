package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k4a extends Drawable implements Drawable.Callback {
    public int a;
    public final ArrayList b = new ArrayList();

    public final void a() {
        int i = 0;
        int i2 = getLayoutDirection() == 1 ? 1 : 0;
        ArrayList arrayList = this.b;
        int size = (arrayList.size() + 1) / 2;
        float fWidth = (getBounds().width() - this.a) / 2.0f;
        float fHeight = (getBounds().height() - ((size - 1) * r2)) / size;
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            int i4 = i + 1;
            if (i < 0) {
                j95.n();
                throw null;
            }
            int i5 = (i + i2) % 2;
            int i6 = this.a;
            float f = ((i5 + ((((i5 ^ 2) & ((-i5) | i5)) >> 31) & 2)) * fWidth) + (r9 * i6);
            float f2 = ((i / 2) * fHeight) + (r1 * i6);
            ((Drawable) obj).setBounds(getBounds().left + ((int) Math.floor(f)), getBounds().top + ((int) Math.floor(f2)), getBounds().left + ((int) Math.ceil(f + fWidth)), getBounds().top + ((int) Math.ceil(f2 + fHeight)));
            i = i4;
        }
    }

    public final boolean b() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean state = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            state |= ((Drawable) obj).setState(getState());
        }
        return state;
    }

    public final void c(Drawable drawable, int i) {
        if (i >= 0) {
            ArrayList arrayList = this.b;
            if (i > j95.h(arrayList) || Intrinsics.a(arrayList.get(i), drawable)) {
                return;
            }
            arrayList.set(i, drawable);
            a();
            b();
            invalidateSelf();
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((Drawable) obj).setCallback(null);
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((Drawable) obj2).setCallback(this);
        }
        a();
        b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Drawable) obj).draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ArrayList arrayList = this.b;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((Drawable) obj).isStateful()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return b();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
