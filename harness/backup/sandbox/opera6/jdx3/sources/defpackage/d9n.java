package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d9n implements r8n {
    public final ff2 a;
    public final mgh b;
    public final mgh c;
    public final mgh d;
    public final mgh e;
    public final mgh f;
    public final ff2 g;
    public final ff2 h;
    public final ff2 i;
    public final ff2 j;
    public final ff2 k;
    public final ff2 l;
    public static final int[] m = {R.attr.textColorHint};
    public static final int[] n = {2130969866};
    public static final int[] o = {2130969865};
    public static final int[] p = {2130969854};
    public static final int[] q = {2130969853};
    public static final int[] r = {2130969461};
    public static final int[] s = {2130969460};
    public static final int[] t = {2130969459};
    public static final int[] u = {2130969458};
    public static final int[] v = {2130969653};
    public static final int[] w = {2130969652};
    public static final int[] x = {2130968835};
    public static final int[] y = {2130968836};
    public static final int[] z = {2130970839};
    public static final int[] A = {2130969630};
    public static final int[] B = {2130969648};
    public static final int[] C = {2130970897};

    public d9n(ff2 ff2Var, mgh mghVar, mgh mghVar2, mgh mghVar3, mgh mghVar4, mgh mghVar5, ff2 ff2Var2, ff2 ff2Var3, ff2 ff2Var4, ff2 ff2Var5, ff2 ff2Var6, ff2 ff2Var7) {
        this.a = ff2Var;
        this.b = mghVar;
        this.c = mghVar2;
        this.d = mghVar3;
        this.e = mghVar4;
        this.f = mghVar5;
        this.g = ff2Var2;
        this.h = ff2Var3;
        this.i = ff2Var4;
        this.j = ff2Var5;
        this.k = ff2Var6;
        this.l = ff2Var7;
    }

    public static mgh b(zg zgVar, int[] iArr, int[] iArr2) {
        ff2 ff2VarA = ff2.a(zgVar, iArr);
        ff2 ff2VarA2 = ff2.a(zgVar, iArr2);
        if (ff2VarA == null && ff2VarA2 == null) {
            return null;
        }
        return new mgh(ff2VarA, ff2VarA2, (byte) 10);
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
        int i;
        TypedValue typedValueC9;
        ColorStateList colorStateListF8;
        TypedValue typedValueC10;
        int i2;
        TypedValue typedValueC11;
        ColorStateList colorStateListF9;
        TypedValue typedValueC12;
        int i3;
        TypedValue typedValueC13;
        ColorStateList colorStateListF10;
        TypedValue typedValueC14;
        int i4;
        TypedValue typedValueC15;
        ColorStateList colorStateListF11;
        TypedValue typedValueC16;
        int i5;
        TypedValue typedValueC17;
        ColorStateList colorStateListF12;
        TextInputLayout textInputLayout = (TextInputLayout) view;
        Context context = view.getContext();
        Objects.requireNonNull(textInputLayout);
        z28 z28Var = textInputLayout.c;
        l6b l6bVar = textInputLayout.k;
        ff2 ff2Var = this.a;
        if (ff2Var != null && (typedValueC17 = ff2Var.c(context)) != null && (colorStateListF12 = ff2.f(context, typedValueC17)) != null) {
            textInputLayout.i0 = colorStateListF12;
            textInputLayout.j0 = colorStateListF12;
            if (textInputLayout.e != null) {
                textInputLayout.E(false, false);
            }
        }
        mgh mghVar = this.b;
        if (mghVar != null) {
            ff2 ff2Var2 = (ff2) mghVar.c;
            if (ff2Var2 != null && (typedValueC16 = ff2Var2.c(context)) != null && (i5 = typedValueC16.resourceId) != 0) {
                v85 v85Var = textInputLayout.v0;
                v85Var.q(i5);
                textInputLayout.j0 = v85Var.p;
                if (textInputLayout.e != null) {
                    textInputLayout.E(false, false);
                    textInputLayout.D();
                }
            }
            ff2 ff2Var3 = (ff2) mghVar.b;
            if (ff2Var3 != null && (typedValueC15 = ff2Var3.c(context)) != null && (colorStateListF11 = ff2.f(context, typedValueC15)) != null && textInputLayout.j0 != colorStateListF11) {
                if (textInputLayout.i0 == null) {
                    textInputLayout.v0.r(colorStateListF11);
                }
                textInputLayout.j0 = colorStateListF11;
                if (textInputLayout.e != null) {
                    textInputLayout.E(false, false);
                }
            }
        }
        mgh mghVar2 = this.c;
        if (mghVar2 != null) {
            ff2 ff2Var4 = (ff2) mghVar2.c;
            if (ff2Var4 != null && (typedValueC14 = ff2Var4.c(context)) != null && (i4 = typedValueC14.resourceId) != 0) {
                l6bVar.z = i4;
                yq1 yq1Var = l6bVar.y;
                if (yq1Var != null) {
                    yq1Var.setTextAppearance(i4);
                }
            }
            ff2 ff2Var5 = (ff2) mghVar2.b;
            if (ff2Var5 != null && (typedValueC13 = ff2Var5.c(context)) != null && (colorStateListF10 = ff2.f(context, typedValueC13)) != null) {
                l6bVar.A = colorStateListF10;
                yq1 yq1Var2 = l6bVar.y;
                if (yq1Var2 != null) {
                    yq1Var2.setTextColor(colorStateListF10);
                }
            }
        }
        mgh mghVar3 = this.d;
        if (mghVar3 != null) {
            ff2 ff2Var6 = (ff2) mghVar3.c;
            if (ff2Var6 != null && (typedValueC12 = ff2Var6.c(context)) != null && (i3 = typedValueC12.resourceId) != 0 && textInputLayout.r != i3) {
                textInputLayout.r = i3;
                textInputLayout.y();
            }
            ff2 ff2Var7 = (ff2) mghVar3.b;
            if (ff2Var7 != null && (typedValueC11 = ff2Var7.c(context)) != null && (colorStateListF9 = ff2.f(context, typedValueC11)) != null && textInputLayout.z != colorStateListF9) {
                textInputLayout.z = colorStateListF9;
                textInputLayout.y();
            }
        }
        mgh mghVar4 = this.e;
        if (mghVar4 != null) {
            ff2 ff2Var8 = (ff2) mghVar4.c;
            if (ff2Var8 != null && (typedValueC10 = ff2Var8.c(context)) != null && (i2 = typedValueC10.resourceId) != 0 && textInputLayout.q != i2) {
                textInputLayout.q = i2;
                textInputLayout.y();
            }
            ff2 ff2Var9 = (ff2) mghVar4.b;
            if (ff2Var9 != null && (typedValueC9 = ff2Var9.c(context)) != null && (colorStateListF8 = ff2.f(context, typedValueC9)) != null && textInputLayout.A != colorStateListF8) {
                textInputLayout.A = colorStateListF8;
                textInputLayout.y();
            }
        }
        mgh mghVar5 = this.f;
        if (mghVar5 != null) {
            ff2 ff2Var10 = (ff2) mghVar5.c;
            if (ff2Var10 != null && (typedValueC8 = ff2Var10.c(context)) != null && (i = typedValueC8.resourceId) != 0) {
                l6bVar.u = i;
                yq1 yq1Var3 = l6bVar.r;
                if (yq1Var3 != null) {
                    l6bVar.h.v(yq1Var3, i);
                }
            }
            ff2 ff2Var11 = (ff2) mghVar5.b;
            if (ff2Var11 != null && (typedValueC7 = ff2Var11.c(context)) != null && (colorStateListF7 = ff2.f(context, typedValueC7)) != null) {
                l6bVar.v = colorStateListF7;
                yq1 yq1Var4 = l6bVar.r;
                if (yq1Var4 != null) {
                    yq1Var4.setTextColor(colorStateListF7);
                }
            }
        }
        ff2 ff2Var12 = this.i;
        if (ff2Var12 != null && (typedValueC6 = ff2Var12.c(context)) != null && (colorStateListF6 = ff2.f(context, typedValueC6)) != null) {
            r3k r3kVar = textInputLayout.b;
            if (r3kVar.e != colorStateListF6) {
                r3kVar.e = colorStateListF6;
                ic4.k(r3kVar.a, r3kVar.d, colorStateListF6, r3kVar.f);
            }
        }
        ff2 ff2Var13 = this.j;
        if (ff2Var13 != null && (typedValueC5 = ff2Var13.c(context)) != null && (colorStateListF5 = ff2.f(context, typedValueC5)) != null && z28Var.j != colorStateListF5) {
            z28Var.j = colorStateListF5;
            ic4.k(z28Var.a, z28Var.f, colorStateListF5, z28Var.k);
        }
        ff2 ff2Var14 = this.k;
        if (ff2Var14 != null && (typedValueC4 = ff2Var14.c(context)) != null && (colorStateListF4 = ff2.f(context, typedValueC4)) != null && z28Var.d != colorStateListF4) {
            z28Var.d = colorStateListF4;
            ic4.k(z28Var.a, z28Var.c, colorStateListF4, z28Var.e);
        }
        ff2 ff2Var15 = this.l;
        if (ff2Var15 != null && (typedValueC3 = ff2Var15.c(context)) != null && (colorStateListF3 = ff2.f(context, typedValueC3)) != null) {
            z28Var.n.setTextColor(colorStateListF3);
        }
        ff2 ff2Var16 = this.g;
        if (ff2Var16 != null && (typedValueC2 = ff2Var16.c(context)) != null && (colorStateListF2 = ff2.f(context, typedValueC2)) != null) {
            textInputLayout.o(colorStateListF2);
        }
        ff2 ff2Var17 = this.h;
        if (ff2Var17 == null || (typedValueC = ff2Var17.c(context)) == null || (colorStateListF = ff2.f(context, typedValueC)) == null || textInputLayout.n0 == colorStateListF) {
            return;
        }
        textInputLayout.n0 = colorStateListF;
        textInputLayout.H();
    }
}
