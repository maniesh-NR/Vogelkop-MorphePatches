package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import defpackage.ezh;
import defpackage.fxj;
import defpackage.igi;
import defpackage.j1d;
import defpackage.kl7;
import defpackage.y9m;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ResourceManagerInternal {
    public static ResourceManagerInternal e;
    public TypedValue a;
    public boolean b;
    public igi c;
    private final WeakHashMap<Context, j1d> mDrawableCaches = new WeakHashMap<>(0);
    private WeakHashMap<Context, fxj> mTintLists;
    public static final PorterDuff.Mode d = PorterDuff.Mode.SRC_IN;
    public static final ezh f = new ezh((byte) 0, 6);

    public static synchronized ResourceManagerInternal b() {
        ResourceManagerInternal resourceManagerInternal;
        resourceManagerInternal = e;
        if (resourceManagerInternal == null) {
            resourceManagerInternal = new ResourceManagerInternal();
            e = resourceManagerInternal;
        }
        return resourceManagerInternal;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        ezh ezhVar = f;
        ezhVar.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) ezhVar.get(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, km5 km5Var, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            if (km5Var.b) {
                colorStateList = (ColorStateList) km5Var.c;
            } else {
                if (!km5Var.a) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            PorterDuff.Mode mode = km5Var.a ? (PorterDuff.Mode) km5Var.d : d;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterE = e(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable a(int r7, android.content.Context r8) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.util.TypedValue r0 = r6.a
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r6.a = r0
        Lb:
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r7, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r6)
            java.util.WeakHashMap<android.content.Context, j1d> r3 = r6.mDrawableCaches     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Throwable -> Lcc
            j1d r3 = (defpackage.j1d) r3     // Catch: java.lang.Throwable -> Lcc
            r4 = 0
            if (r3 != 0) goto L2c
            monitor-exit(r6)
        L2a:
            r3 = r4
            goto L4b
        L2c:
            java.lang.Object r5 = r3.c(r1)     // Catch: java.lang.Throwable -> Lcc
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto L49
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> Lcc
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto L46
            android.content.res.Resources r3 = r8.getResources()     // Catch: java.lang.Throwable -> Lcc
            android.graphics.drawable.Drawable r3 = r5.newDrawable(r3)     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r6)
            goto L4b
        L46:
            r3.i(r1)     // Catch: java.lang.Throwable -> Lcc
        L49:
            monitor-exit(r6)
            goto L2a
        L4b:
            if (r3 == 0) goto L4e
            return r3
        L4e:
            igi r3 = r6.c
            if (r3 == 0) goto L96
            r3 = 2131231096(0x7f080178, float:1.8078263E38)
            if (r7 != r3) goto L6f
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r3 = 2131231095(0x7f080177, float:1.8078261E38)
            android.graphics.drawable.Drawable r3 = r6.c(r3, r8)
            r5 = 2131231097(0x7f080179, float:1.8078265E38)
            android.graphics.drawable.Drawable r5 = r6.c(r5, r8)
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r3, r5}
            r7.<init>(r3)
            goto L97
        L6f:
            r3 = 2131231131(0x7f08019b, float:1.8078334E38)
            if (r7 != r3) goto L7c
            r7 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r7 = defpackage.igi.M(r6, r8, r7)
            goto L97
        L7c:
            r3 = 2131231130(0x7f08019a, float:1.8078332E38)
            if (r7 != r3) goto L89
            r7 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r7 = defpackage.igi.M(r6, r8, r7)
            goto L97
        L89:
            r3 = 2131231132(0x7f08019c, float:1.8078336E38)
            if (r7 != r3) goto L96
            r7 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r7 = defpackage.igi.M(r6, r8, r7)
            goto L97
        L96:
            r7 = r4
        L97:
            if (r7 == 0) goto Lc9
            int r0 = r0.changingConfigurations
            r7.setChangingConfigurations(r0)
            monitor-enter(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = r7.getConstantState()     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lc3
            java.util.WeakHashMap<android.content.Context, j1d> r3 = r6.mDrawableCaches     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Throwable -> Lc7
            j1d r3 = (defpackage.j1d) r3     // Catch: java.lang.Throwable -> Lc7
            if (r3 != 0) goto Lb9
            j1d r3 = new j1d     // Catch: java.lang.Throwable -> Lc7
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lc7
            java.util.WeakHashMap<android.content.Context, j1d> r4 = r6.mDrawableCaches     // Catch: java.lang.Throwable -> Lc7
            r4.put(r8, r3)     // Catch: java.lang.Throwable -> Lc7
        Lb9:
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lc7
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lc7
            r3.g(r1, r8)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r6)
            return r7
        Lc3:
            monitor-exit(r6)
            return r7
        Lc5:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc7
            throw r7
        Lc7:
            r7 = move-exception
            goto Lc5
        Lc9:
            return r7
        Lca:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lcc
            throw r7
        Lcc:
            r7 = move-exception
            goto Lca
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.a(int, android.content.Context):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable c(int i, Context context) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable drawableA;
        if (!this.b) {
            this.b = true;
            Drawable drawableC = c(2131231158, context);
            if (drawableC == null || (!(drawableC instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                this.b = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableA = a(i, context);
        if (drawableA == null) {
            drawableA = context.getDrawable(i);
        }
        if (drawableA != null) {
            drawableA = h(context, i, z, drawableA);
        }
        if (drawableA != null) {
            kl7.a(drawableA);
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(int i, Context context) {
        ColorStateList colorStateList;
        fxj fxjVar;
        WeakHashMap<Context, fxj> weakHashMap = this.mTintLists;
        colorStateList = (weakHashMap == null || (fxjVar = weakHashMap.get(context)) == null) ? null : (ColorStateList) y9m.u(fxjVar, i);
        if (colorStateList == null) {
            igi igiVar = this.c;
            ColorStateList colorStateListN = igiVar != null ? igiVar.N(i, context) : null;
            if (colorStateListN != null) {
                WeakHashMap<Context, fxj> weakHashMap2 = this.mTintLists;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap<>();
                    this.mTintLists = weakHashMap2;
                }
                fxj fxjVar2 = weakHashMap2.get(context);
                if (fxjVar2 == null) {
                    fxjVar2 = new fxj(0);
                    this.mTintLists.put(context, fxjVar2);
                }
                fxjVar2.b(i, colorStateListN);
            }
            colorStateList = colorStateListN;
        }
        return colorStateList;
    }

    public final synchronized void g(Context context) {
        j1d j1dVar = this.mDrawableCaches.get(context);
        if (j1dVar != null) {
            j1dVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable h(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            r7 = this;
            android.content.res.ColorStateList r0 = r7.f(r9, r8)
            r1 = 0
            if (r0 == 0) goto L1f
            android.graphics.drawable.Drawable r8 = r11.mutate()
            r8.setTintList(r0)
            igi r7 = r7.c
            if (r7 == 0) goto L19
            r7 = 2131231145(0x7f0801a9, float:1.8078363E38)
            if (r9 != r7) goto L19
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L19:
            if (r1 == 0) goto L1e
            r8.setTintMode(r1)
        L1e:
            return r8
        L1f:
            igi r7 = r7.c
            r0 = 2130969110(0x7f040216, float:1.7546893E38)
            r2 = 2130969108(0x7f040214, float:1.7546889E38)
            if (r7 == 0) goto L93
            r3 = 2131231140(0x7f0801a4, float:1.8078353E38)
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r9 != r3) goto L5d
            r7 = r11
            android.graphics.drawable.LayerDrawable r7 = (android.graphics.drawable.LayerDrawable) r7
            android.graphics.drawable.Drawable r9 = r7.findDrawableByLayerId(r6)
            int r10 = defpackage.gll.c(r0, r8)
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.AppCompatDrawableManager.a
            defpackage.igi.s0(r9, r10, r1)
            android.graphics.drawable.Drawable r9 = r7.findDrawableByLayerId(r5)
            int r10 = defpackage.gll.c(r0, r8)
            defpackage.igi.s0(r9, r10, r1)
            android.graphics.drawable.Drawable r7 = r7.findDrawableByLayerId(r4)
            int r8 = defpackage.gll.c(r2, r8)
            defpackage.igi.s0(r7, r8, r1)
            return r11
        L5d:
            r3 = 2131231131(0x7f08019b, float:1.8078334E38)
            if (r9 == r3) goto L6c
            r3 = 2131231130(0x7f08019a, float:1.8078332E38)
            if (r9 == r3) goto L6c
            r3 = 2131231132(0x7f08019c, float:1.8078336E38)
            if (r9 != r3) goto L93
        L6c:
            r7 = r11
            android.graphics.drawable.LayerDrawable r7 = (android.graphics.drawable.LayerDrawable) r7
            android.graphics.drawable.Drawable r9 = r7.findDrawableByLayerId(r6)
            int r10 = defpackage.gll.b(r0, r8)
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.a
            defpackage.igi.s0(r9, r10, r0)
            android.graphics.drawable.Drawable r9 = r7.findDrawableByLayerId(r5)
            int r10 = defpackage.gll.c(r2, r8)
            defpackage.igi.s0(r9, r10, r0)
            android.graphics.drawable.Drawable r7 = r7.findDrawableByLayerId(r4)
            int r8 = defpackage.gll.c(r2, r8)
            defpackage.igi.s0(r7, r8, r0)
            return r11
        L93:
            if (r7 == 0) goto Leb
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.AppCompatDrawableManager.a
            java.lang.Object r4 = r7.b
            int[] r4 = (int[]) r4
            boolean r4 = defpackage.igi.f(r9, r4)
            r5 = 1
            r6 = -1
            if (r4 != 0) goto Lae
            java.lang.Object r0 = r7.d
            int[] r0 = (int[]) r0
            boolean r0 = defpackage.igi.f(r9, r0)
            if (r0 == 0) goto Lb0
            r0 = r2
        Lae:
            r7 = r6
            goto Ld4
        Lb0:
            java.lang.Object r7 = r7.e
            int[] r7 = (int[]) r7
            boolean r7 = defpackage.igi.f(r9, r7)
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            if (r7 == 0) goto Lc0
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto Lae
        Lc0:
            r7 = 2131231117(0x7f08018d, float:1.8078306E38)
            if (r9 != r7) goto Lcb
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 41
            goto Ld4
        Lcb:
            r7 = 2131231099(0x7f08017b, float:1.807827E38)
            if (r9 != r7) goto Ld1
            goto Lae
        Ld1:
            r0 = 0
            r5 = r0
            goto Lae
        Ld4:
            if (r5 == 0) goto Leb
            android.graphics.drawable.Drawable r9 = r11.mutate()
            int r8 = defpackage.gll.c(r0, r8)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.AppCompatDrawableManager.d(r8, r3)
            r9.setColorFilter(r8)
            if (r7 == r6) goto Lee
            r9.setAlpha(r7)
            return r11
        Leb:
            if (r10 == 0) goto Lee
            return r1
        Lee:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.h(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
