package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class w3a extends Drawable implements Drawable.Callback {
    public v3a a;
    public boolean b;
    public final boolean c;

    public w3a(Drawable drawable, int i, boolean z) {
        this(new v3a(drawable, i, z), 0);
        drawable.setCallback(this);
        this.c = z;
    }

    public w3a(v3a v3aVar) {
        this(v3aVar, 0);
        this.c = v3aVar.d;
    }

    public w3a(v3a v3aVar, int i) {
        this.a = v3aVar;
        setBounds(0, 0, v3aVar.a.getIntrinsicWidth(), this.a.a.getIntrinsicHeight());
    }

    public final void a(Canvas canvas) {
        this.a.a.draw(canvas);
    }

    public final int b() {
        return this.a.a.getIntrinsicHeight();
    }

    public final int c() {
        return this.a.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        super.clearColorFilter();
        this.a.a.clearColorFilter();
    }

    public final boolean d(int i) {
        return this.a.a.setLayoutDirection(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        e();
        a(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[PHI: r0
      0x0036: PHI (r0v4 int) = (r0v3 int), (r0v9 int) binds: [B:15:0x0034, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r8 = this;
            v3a r0 = r8.a
            int r1 = r8.getLayoutDirection()
            r2 = 1
            if (r1 == r2) goto La
            r2 = 0
        La:
            android.graphics.Rect r8 = r8.getBounds()
            android.graphics.Rect r1 = r0.e
            android.graphics.drawable.Drawable r3 = r0.a
            int r0 = r0.c
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r0
            if (r4 == 0) goto L3c
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r5 = r0 & r4
            r6 = 3
            r7 = 5
            if (r5 != r4) goto L29
            r4 = -8388612(0xffffffffff7ffffc, float:-3.4028229E38)
            r0 = r0 & r4
            if (r2 == 0) goto L37
            goto L36
        L29:
            r4 = 8388613(0x800005, float:1.175495E-38)
            r5 = r0 & r4
            if (r5 != r4) goto L38
            r4 = -8388614(0xffffffffff7ffffa, float:-3.4028225E38)
            r0 = r0 & r4
            if (r2 != 0) goto L37
        L36:
            r6 = r7
        L37:
            r0 = r0 | r6
        L38:
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r0 = r0 & r2
        L3c:
            int r2 = r3.getIntrinsicWidth()
            int r4 = r3.getIntrinsicHeight()
            android.view.Gravity.apply(r0, r2, r4, r8, r1)
            r3.setBounds(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3a.e():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        this.a.a.getHotspotBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.c) {
            return -1;
        }
        return b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.c) {
            return -1;
        }
        return c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.a.a.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.b && super.mutate() == this) {
            this.a = new v3a(this.a);
            this.b = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return d(i) || (this.a.c & 8388608) != 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.a.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.a.a.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b = colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.a.a.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.a.a.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return super.setState(iArr) | this.a.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.a.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.a.a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) | this.a.a.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
