package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.widget.LottieAnimationView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n2d extends AppCompatImageView {
    public static final h2d n = new h2d();
    public final m2d a;
    public final m2d b;
    public int c;
    public final f3d d;
    public String e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final HashSet j;
    public final HashSet k;
    public n3d l;
    public p2d m;

    public n2d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this;
        this.a = new m2d(lottieAnimationView, (byte) 1);
        this.b = new m2d(lottieAnimationView, (byte) 0);
        this.c = 0;
        this.d = new f3d();
        this.g = false;
        this.h = false;
        this.i = true;
        this.j = new HashSet();
        this.k = new HashSet();
        d(attributeSet, 2130970201);
    }

    public n2d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this;
        this.a = new m2d(lottieAnimationView, (byte) 1);
        this.b = new m2d(lottieAnimationView, (byte) 0);
        this.c = 0;
        this.d = new f3d();
        this.g = false;
        this.h = false;
        this.i = true;
        this.j = new HashSet();
        this.k = new HashSet();
        d(attributeSet, 0);
    }

    public void a(dvb dvbVar, Object obj, ua7 ua7Var) {
        this.d.b(dvbVar, obj, ua7Var);
    }

    public final void c() {
        n3d n3dVar = this.l;
        if (n3dVar != null) {
            m2d m2dVar = this.a;
            synchronized (n3dVar) {
                n3dVar.a.remove(m2dVar);
            }
            n3d n3dVar2 = this.l;
            m2d m2dVar2 = this.b;
            synchronized (n3dVar2) {
                n3dVar2.b.remove(m2dVar2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(AttributeSet attributeSet, int i) {
        String string;
        n3d n3dVarA;
        boolean z;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ghh.a, i, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(13);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(8);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(18);
        x79 x79Var = null;
        if (zHasValue) {
            if (zHasValue2) {
                qp2.o("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
                return;
            } else {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                if (resourceId != 0) {
                    j(resourceId);
                }
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(8);
            if (string2 != null) {
                l(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(18)) != null) {
            if (this.i) {
                Context context = getContext();
                HashMap map = u2d.a;
                String strConcat = "url_".concat(string);
                n3dVarA = u2d.a(strConcat, new r2d(context, string, strConcat, objArr2 == true ? 1 : 0), null);
            } else {
                n3dVarA = u2d.a(null, new r2d(getContext(), string, x79Var, objArr == true ? 1 : 0), null);
            }
            n(n3dVarA);
        }
        this.c = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.h = true;
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        f3d f3dVar = this.d;
        if (z2) {
            f3dVar.b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(16, 1);
            this.j.add(l2d.c);
            f3dVar.b.setRepeatMode(i2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            p(typedArrayObtainStyledAttributes.getInt(15, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            f3dVar.b.d = typedArrayObtainStyledAttributes.getFloat(17, 1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3) && (z = typedArrayObtainStyledAttributes.getBoolean(3, true)) != f3dVar.k) {
            f3dVar.k = z;
            gi5 gi5Var = f3dVar.l;
            if (gi5Var != null) {
                gi5Var.F = z;
            }
            f3dVar.invalidateSelf();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            String string3 = typedArrayObtainStyledAttributes.getString(5);
            f3dVar.i = string3;
            if (f3dVar.getCallback() != null && (x79Var = f3dVar.h) == null) {
                x79Var = new x79(f3dVar.getCallback());
                f3dVar.h = x79Var;
                String str = f3dVar.i;
                if (str != null) {
                    x79Var.e = str;
                }
            }
            if (x79Var != null) {
                x79Var.e = string3;
            }
        }
        f3dVar.g = typedArrayObtainStyledAttributes.getString(10);
        o(typedArrayObtainStyledAttributes.getFloat(12, 0.0f), typedArrayObtainStyledAttributes.hasValue(12));
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        if (f3dVar.j != z3) {
            f3dVar.j = z3;
            if (f3dVar.a != null) {
                f3dVar.d();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            a(new dvb("**"), k3d.F, new ua7(new nkj(nb6.v(typedArrayObtainStyledAttributes.getResourceId(4, -1), getContext()).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(14, 0);
            if (i3 >= vep.B(3).length) {
                i3 = 0;
            }
            f3dVar.F = vep.B(3)[i3];
            f3dVar.f();
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (i4 >= vep.B(3).length) {
                i4 = 0;
            }
            f3dVar.G = vep.B(3)[i4];
        }
        f3dVar.d = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            f3dVar.b.n = typedArrayObtainStyledAttributes.getBoolean(19, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context2 = getContext();
        f30 f30Var = dzm.a;
        f3dVar.c = Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public abstract void f();

    public abstract void h();

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof f3d) && ((f3d) drawable).n) {
            this.d.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        f3d f3dVar = this.d;
        if (drawable2 == f3dVar) {
            super.invalidateDrawable(f3dVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(int i) {
        n3d n3dVarE;
        this.f = i;
        this.e = null;
        if (isInEditMode()) {
            n3dVarE = new n3d(new qua(this, i, (byte) 1), true);
        } else if (this.i) {
            Context context = getContext();
            n3dVarE = u2d.e(context, i, u2d.j(i, context));
        } else {
            n3dVarE = u2d.e(getContext(), i, null);
        }
        n(n3dVarE);
    }

    public final void l(String str) {
        n3d n3dVarA;
        this.e = str;
        this.f = 0;
        byte b = 1;
        if (isInEditMode()) {
            n3dVarA = new n3d(new d9(this, str, (byte) 4), true);
        } else {
            String str2 = null;
            if (this.i) {
                Context context = getContext();
                HashMap map = u2d.a;
                String strJ = sko.j("asset_", str);
                n3dVarA = u2d.a(strJ, new r2d(context.getApplicationContext(), str, strJ, b), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = u2d.a;
                n3dVarA = u2d.a(null, new r2d(context2.getApplicationContext(), str, str2, b), null);
            }
        }
        n(n3dVarA);
    }

    public final void m(p2d p2dVar) {
        LottieAnimationView.r(p2dVar);
        f3d f3dVar = this.d;
        f3dVar.setCallback(this);
        this.m = p2dVar;
        this.g = true;
        boolean zO = f3dVar.o(p2dVar);
        this.g = false;
        if (getDrawable() != f3dVar || zO) {
            if (!zO) {
                boolean zI = f3dVar.i();
                setImageDrawable(null);
                setImageDrawable(f3dVar);
                if (zI) {
                    f3dVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((nll) it.next()).a();
            }
        }
    }

    public final void n(n3d n3dVar) {
        this.j.add(l2d.a);
        this.m = null;
        this.d.e();
        c();
        n3dVar.b(this.a);
        n3dVar.a(this.b);
        this.l = n3dVar;
    }

    public final void o(float f, boolean z) {
        if (z) {
            this.j.add(l2d.b);
        }
        this.d.r(f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.h) {
            return;
        }
        this.d.k();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof j2d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j2d j2dVar = (j2d) parcelable;
        super.onRestoreInstanceState(j2dVar.getSuperState());
        this.e = j2dVar.a;
        HashSet hashSet = this.j;
        l2d l2dVar = l2d.a;
        if (!hashSet.contains(l2dVar) && !TextUtils.isEmpty(this.e)) {
            l(this.e);
        }
        this.f = j2dVar.b;
        if (!hashSet.contains(l2dVar) && (i = this.f) != 0) {
            j(i);
        }
        if (!hashSet.contains(l2d.b)) {
            o(j2dVar.c, false);
        }
        if (!hashSet.contains(l2d.f) && j2dVar.d) {
            h();
        }
        boolean zContains = hashSet.contains(l2d.e);
        f3d f3dVar = this.d;
        if (!zContains) {
            f3dVar.g = j2dVar.e;
        }
        l2d l2dVar2 = l2d.c;
        if (!hashSet.contains(l2dVar2)) {
            int i2 = j2dVar.f;
            hashSet.add(l2dVar2);
            f3dVar.b.setRepeatMode(i2);
        }
        if (hashSet.contains(l2d.d)) {
            return;
        }
        p(j2dVar.g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        j2d j2dVar = new j2d(super.onSaveInstanceState());
        j2dVar.a = this.e;
        j2dVar.b = this.f;
        f3d f3dVar = this.d;
        p3d p3dVar = f3dVar.b;
        p3d p3dVar2 = f3dVar.b;
        j2dVar.c = p3dVar.b();
        if (f3dVar.isVisible()) {
            z = p3dVar2.m;
        } else {
            int i = f3dVar.E;
            z = i == 2 || i == 3;
        }
        j2dVar.d = z;
        j2dVar.e = f3dVar.g;
        j2dVar.f = p3dVar2.getRepeatMode();
        j2dVar.g = p3dVar2.getRepeatCount();
        return j2dVar;
    }

    public final void p(int i) {
        this.j.add(l2d.d);
        this.d.b.setRepeatCount(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        c();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        f3d f3dVar;
        if (!this.g && drawable == (f3dVar = this.d) && f3dVar.i()) {
            f();
        } else if (!this.g && (drawable instanceof f3d)) {
            f3d f3dVar2 = (f3d) drawable;
            if (f3dVar2.i()) {
                f3dVar2.j();
            }
        }
        super.unscheduleDrawable(drawable);
    }
}
