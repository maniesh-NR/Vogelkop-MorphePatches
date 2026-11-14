package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class rtl {
    public final Toolbar a;
    public int b;
    public final View c;
    public final Drawable d;
    public final Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public ne m;
    public final int n;
    public final Drawable o;

    public rtl(Toolbar toolbar, boolean z) throws Resources.NotFoundException {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        CharSequence charSequence = toolbar.w;
        this.h = charSequence;
        this.i = toolbar.x;
        this.g = charSequence != null;
        this.f = toolbar.q();
        ghf ghfVarH = ghf.H(2130968585, 0, toolbar.getContext(), (AttributeSet) null, zhh.a);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        int i = 15;
        this.o = ghfVarH.t(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 8) != 0) {
                    toolbar.D(text);
                    if (this.g) {
                        r5n.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                b(text2);
            }
            Drawable drawableT = ghfVarH.t(20);
            if (drawableT != null) {
                this.e = drawableT;
                d();
            }
            Drawable drawableT2 = ghfVarH.t(17);
            if (drawableT2 != null) {
                this.d = drawableT2;
                d();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                if ((this.b & 4) != 0) {
                    toolbar.A(drawable);
                } else {
                    toolbar.A(null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.s.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.k = resourceId2;
                yq1 yq1Var = toolbar.b;
                if (yq1Var != null) {
                    yq1Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.l = resourceId3;
                yq1 yq1Var2 = toolbar.c;
                if (yq1Var2 != null) {
                    yq1Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0 && toolbar.j != resourceId4) {
                toolbar.j = resourceId4;
                if (resourceId4 == 0) {
                    toolbar.i = toolbar.getContext();
                } else {
                    toolbar.i = new ContextThemeWrapper(toolbar.getContext(), resourceId4);
                }
            }
        } else {
            if (toolbar.q() != null) {
                this.o = toolbar.q();
            } else {
                i = 11;
            }
            this.b = i;
        }
        ghfVarH.J();
        if (2132017154 != this.n) {
            this.n = 2132017154;
            if (TextUtils.isEmpty(toolbar.p())) {
                int i2 = this.n;
                this.j = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                c();
            }
        }
        this.j = toolbar.p();
        toolbar.B(new wke(this));
    }

    public final void a(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    c();
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.A(drawable);
                } else {
                    toolbar.A(null);
                }
            }
            if ((i2 & 3) != 0) {
                d();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.D(this.h);
                    toolbar.C(this.i);
                } else {
                    toolbar.D(null);
                    toolbar.C(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.C(charSequence);
        }
    }

    public final void c() {
        if ((this.b & 4) != 0) {
            CharSequence charSequence = this.j;
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            Toolbar toolbar = this.a;
            if (!zIsEmpty) {
                toolbar.z(charSequence);
            } else {
                int i = this.n;
                toolbar.z(i != 0 ? toolbar.getContext().getText(i) : null);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        Drawable drawable2;
        int i = this.b;
        if ((i & 2) != 0) {
            int i2 = i & 1;
            drawable = this.d;
            if (i2 != 0 && (drawable2 = this.e) != null) {
                drawable = drawable2;
            }
        } else {
            drawable = null;
        }
        this.a.y(drawable);
    }
}
