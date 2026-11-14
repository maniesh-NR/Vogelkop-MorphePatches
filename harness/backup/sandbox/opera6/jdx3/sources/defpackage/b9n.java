package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.slider.Slider;
import com.google.android.material.slider.h;

/* loaded from: classes.dex */
public final class b9n implements r8n {
    public final ff2 a;
    public final ff2 b;
    public final ff2 c;
    public final ff2 d;
    public final ff2 e;
    public final ff2 f;
    public final ff2 g;
    public final ff2 h;
    public final ff2 i;
    public final ff2 j;
    public final ff2 k;
    public final ff2 l;
    public final ff2 m;
    public final ff2 n;
    public static final int[] o = {2130969844};
    public static final int[] p = {2130969845};
    public static final int[] q = {2130971108};
    public static final int[] r = {2130971109};
    public static final int[] s = {2130971115};
    public static final int[] t = {2130971116};
    public static final int[] u = {2130971117};
    public static final int[] v = {2130971123};
    public static final int[] w = {2130971124};
    public static final int[] x = {2130971125};
    public static final int[] y = {2130971181};
    public static final int[] z = {2130971182};
    public static final int[] A = {2130971183};
    public static final int[] B = {2130971190};

    public b9n(ff2 ff2Var, ff2 ff2Var2, ff2 ff2Var3, ff2 ff2Var4, ff2 ff2Var5, ff2 ff2Var6, ff2 ff2Var7, ff2 ff2Var8, ff2 ff2Var9, ff2 ff2Var10, ff2 ff2Var11, ff2 ff2Var12, ff2 ff2Var13, ff2 ff2Var14) {
        this.a = ff2Var;
        this.b = ff2Var2;
        this.c = ff2Var3;
        this.d = ff2Var4;
        this.e = ff2Var5;
        this.f = ff2Var6;
        this.g = ff2Var7;
        this.h = ff2Var8;
        this.i = ff2Var9;
        this.j = ff2Var10;
        this.k = ff2Var11;
        this.l = ff2Var12;
        this.m = ff2Var13;
        this.n = ff2Var14;
    }

    public static float b(Context context, TypedValue typedValue) {
        if (typedValue.type == 5) {
            return TypedValue.complexToDimension(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        TypedValue typedValueC;
        ColorStateList colorStateListF;
        TypedValue typedValueC2;
        ColorStateList colorStateListF2;
        TypedValue typedValueC3;
        ColorStateList colorStateListF3;
        TypedValue typedValueC4;
        ColorStateList colorStateListF4;
        TypedValue typedValueC5;
        ColorStateList colorStateListF5;
        TypedValue typedValueC6;
        ColorStateList colorStateListF6;
        TypedValue typedValueC7;
        ColorStateList colorStateListF7;
        TypedValue typedValueC8;
        ColorStateList colorStateListF8;
        TypedValue typedValueC9;
        ColorStateList colorStateListF9;
        TypedValue typedValueC10;
        TypedValue typedValueC11;
        TypedValue typedValueC12;
        TypedValue typedValueC13;
        TypedValue typedValueC14;
        TypedValue typedValueC15;
        ColorStateList colorStateListF10;
        TypedValue typedValueC16;
        ColorStateList colorStateListF11;
        TypedValue typedValueC17;
        ColorStateList colorStateListF12;
        TypedValue typedValueC18;
        ColorStateList colorStateListF13;
        TypedValue typedValueC19;
        ColorStateList colorStateListF14;
        TypedValue typedValueC20;
        ColorStateList colorStateListF15;
        TypedValue typedValueC21;
        ColorStateList colorStateListF16;
        TypedValue typedValueC22;
        ColorStateList colorStateListF17;
        TypedValue typedValueC23;
        ColorStateList colorStateListF18;
        TypedValue typedValueC24;
        TypedValue typedValueC25;
        TypedValue typedValueC26;
        TypedValue typedValueC27;
        TypedValue typedValueC28;
        if (view != null) {
            boolean z2 = view instanceof Slider;
            ff2 ff2Var = this.m;
            ff2 ff2Var2 = this.l;
            ff2 ff2Var3 = this.k;
            ff2 ff2Var4 = this.j;
            ff2 ff2Var5 = this.i;
            ff2 ff2Var6 = this.h;
            ff2 ff2Var7 = this.f;
            ff2 ff2Var8 = this.c;
            ff2 ff2Var9 = this.a;
            ff2 ff2Var10 = this.n;
            ff2 ff2Var11 = this.e;
            ff2 ff2Var12 = this.b;
            ff2 ff2Var13 = this.g;
            ff2 ff2Var14 = this.d;
            if (z2) {
                Slider slider = (Slider) view;
                if (ff2Var14 != null && (typedValueC28 = ff2Var14.c(slider.getContext())) != null) {
                    slider.N(b(slider.getContext(), typedValueC28));
                }
                if (ff2Var13 != null && (typedValueC27 = ff2Var13.c(slider.getContext())) != null) {
                    slider.R(b(slider.getContext(), typedValueC27));
                }
                if (ff2Var12 != null && (typedValueC26 = ff2Var12.c(slider.getContext())) != null) {
                    slider.L(ff2.g(slider.getContext(), typedValueC26));
                }
                if (ff2Var11 != null && (typedValueC25 = ff2Var11.c(slider.getContext())) != null) {
                    int iG = ff2.g(slider.getContext(), typedValueC25) << 1;
                    slider.T(iG);
                    slider.O(iG);
                }
                if (ff2Var10 != null && (typedValueC24 = ff2Var10.c(slider.getContext())) != null) {
                    slider.X(ff2.g(slider.getContext(), typedValueC24));
                }
                if (ff2Var9 != null && (typedValueC23 = ff2Var9.c(slider.getContext())) != null && (colorStateListF18 = ff2.f(slider.getContext(), typedValueC23)) != null) {
                    slider.M(colorStateListF18);
                }
                if (ff2Var8 != null && (typedValueC22 = ff2Var8.c(slider.getContext())) != null && (colorStateListF17 = ff2.f(slider.getContext(), typedValueC22)) != null) {
                    slider.S(colorStateListF17);
                }
                if (ff2Var7 != null && (typedValueC21 = ff2Var7.c(slider.getContext())) != null && (colorStateListF16 = ff2.f(slider.getContext(), typedValueC21)) != null) {
                    slider.Q(colorStateListF16);
                }
                if (ff2Var6 != null && (typedValueC20 = ff2Var6.c(slider.getContext())) != null && (colorStateListF15 = ff2.f(slider.getContext(), typedValueC20)) != null) {
                    slider.V(colorStateListF15);
                    slider.U(colorStateListF15);
                }
                if (ff2Var5 != null && (typedValueC19 = ff2Var5.c(slider.getContext())) != null && (colorStateListF14 = ff2.f(slider.getContext(), typedValueC19)) != null) {
                    slider.U(colorStateListF14);
                }
                if (ff2Var4 != null && (typedValueC18 = ff2Var4.c(slider.getContext())) != null && (colorStateListF13 = ff2.f(slider.getContext(), typedValueC18)) != null) {
                    slider.V(colorStateListF13);
                }
                if (ff2Var3 != null && (typedValueC17 = ff2Var3.c(slider.getContext())) != null && (colorStateListF12 = ff2.f(slider.getContext(), typedValueC17)) != null) {
                    slider.B0(colorStateListF12);
                }
                if (ff2Var2 != null && (typedValueC16 = ff2Var2.c(slider.getContext())) != null && (colorStateListF11 = ff2.f(slider.getContext(), typedValueC16)) != null) {
                    slider.W(colorStateListF11);
                }
                if (ff2Var == null || (typedValueC15 = ff2Var.c(slider.getContext())) == null || (colorStateListF10 = ff2.f(slider.getContext(), typedValueC15)) == null) {
                    return;
                }
                slider.Y(colorStateListF10);
                return;
            }
            if (view instanceof h) {
                h hVar = (h) view;
                if (ff2Var14 != null && (typedValueC14 = ff2Var14.c(hVar.getContext())) != null) {
                    hVar.N(b(hVar.getContext(), typedValueC14));
                }
                if (ff2Var13 != null && (typedValueC13 = ff2Var13.c(hVar.getContext())) != null) {
                    hVar.R(b(hVar.getContext(), typedValueC13));
                }
                if (ff2Var12 != null && (typedValueC12 = ff2Var12.c(hVar.getContext())) != null) {
                    hVar.L(ff2.g(hVar.getContext(), typedValueC12));
                }
                if (ff2Var11 != null && (typedValueC11 = ff2Var11.c(hVar.getContext())) != null) {
                    int iG2 = ff2.g(hVar.getContext(), typedValueC11) << 1;
                    hVar.T(iG2);
                    hVar.O(iG2);
                }
                if (ff2Var10 != null && (typedValueC10 = ff2Var10.c(hVar.getContext())) != null) {
                    hVar.X(ff2.g(hVar.getContext(), typedValueC10));
                }
                if (ff2Var9 != null && (typedValueC9 = ff2Var9.c(hVar.getContext())) != null && (colorStateListF9 = ff2.f(hVar.getContext(), typedValueC9)) != null) {
                    hVar.M(colorStateListF9);
                }
                if (ff2Var8 != null && (typedValueC8 = ff2Var8.c(hVar.getContext())) != null && (colorStateListF8 = ff2.f(hVar.getContext(), typedValueC8)) != null) {
                    hVar.S(colorStateListF8);
                }
                if (ff2Var7 != null && (typedValueC7 = ff2Var7.c(hVar.getContext())) != null && (colorStateListF7 = ff2.f(hVar.getContext(), typedValueC7)) != null) {
                    hVar.Q(colorStateListF7);
                }
                if (ff2Var6 != null && (typedValueC6 = ff2Var6.c(hVar.getContext())) != null && (colorStateListF6 = ff2.f(hVar.getContext(), typedValueC6)) != null) {
                    hVar.V(colorStateListF6);
                    hVar.U(colorStateListF6);
                }
                if (ff2Var5 != null && (typedValueC5 = ff2Var5.c(hVar.getContext())) != null && (colorStateListF5 = ff2.f(hVar.getContext(), typedValueC5)) != null) {
                    hVar.U(colorStateListF5);
                }
                if (ff2Var4 != null && (typedValueC4 = ff2Var4.c(hVar.getContext())) != null && (colorStateListF4 = ff2.f(hVar.getContext(), typedValueC4)) != null) {
                    hVar.V(colorStateListF4);
                }
                if (ff2Var3 != null && (typedValueC3 = ff2Var3.c(hVar.getContext())) != null && (colorStateListF3 = ff2.f(hVar.getContext(), typedValueC3)) != null) {
                    hVar.Y(colorStateListF3);
                    hVar.W(colorStateListF3);
                }
                if (ff2Var2 != null && (typedValueC2 = ff2Var2.c(hVar.getContext())) != null && (colorStateListF2 = ff2.f(hVar.getContext(), typedValueC2)) != null) {
                    hVar.W(colorStateListF2);
                }
                if (ff2Var == null || (typedValueC = ff2Var.c(hVar.getContext())) == null || (colorStateListF = ff2.f(hVar.getContext(), typedValueC)) == null) {
                    return;
                }
                hVar.Y(colorStateListF);
            }
        }
    }
}
