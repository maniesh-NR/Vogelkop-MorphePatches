package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.tabs.TabLayout;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a9n implements r8n {
    public final /* synthetic */ byte a;
    public final ff2 b;
    public final ff2 c;
    public final ff2 d;
    public final ff2 e;
    public final ff2 f;
    public final ff2 g;
    public static final int[] h = {2130969012};
    public static final int[] i = {2130969021};
    public static final int[] j = {2130969033};
    public static final int[] k = {2130970647};
    public static final int[] l = {2130969067};
    public static final int[] m = {2130969007};
    public static final int[] n = {2130968736};
    public static final int[] o = {2130969893};
    public static final int[] p = {2130970357};
    public static final int[] q = {2130970442};
    public static final int[] r = {2130970563};
    public static final int[] s = {2130971152};
    public static final int[] t = {2130969630};
    public static final int[] u = {2130970839};
    public static final int[] v = {2130970890};
    public static final int[] w = {2130970891};
    public static final int[] x = {2130971151};
    public static final int[] y = {2130971152};
    public static final int[] z = {R.attr.thumb};
    public static final int[] A = {R.attr.indeterminateDrawable};
    public static final int[] B = {R.attr.progressDrawable};
    public static final int[] C = {R.attr.progressTint};
    public static final int[] D = {R.attr.progressBackgroundTint};
    public static final int[] E = {R.attr.thumbTint};
    public static final int[] F = {2130970955};
    public static final int[] G = {2130970958};
    public static final int[] H = {2130970971};
    public static final int[] I = {2130970974};
    public static final int[] J = {2130970977};
    public static final int[] K = {2130970978};

    public /* synthetic */ a9n(ff2 ff2Var, ff2 ff2Var2, ff2 ff2Var3, ff2 ff2Var4, ff2 ff2Var5, ff2 ff2Var6, byte b) {
        this.a = b;
        this.b = ff2Var;
        this.c = ff2Var2;
        this.d = ff2Var3;
        this.e = ff2Var4;
        this.f = ff2Var5;
        this.g = ff2Var6;
    }

    public static ColorStateList b(Context context, ff2 ff2Var) {
        TypedValue typedValueC;
        if (ff2Var == null || (typedValueC = ff2Var.c(context)) == null) {
            return null;
        }
        return ff2.f(context, typedValueC);
    }

    public static ColorStateList c(Context context, ff2 ff2Var, ff2 ff2Var2) throws Resources.NotFoundException, NumberFormatException {
        TypedValue typedValueC;
        if (ff2Var != null) {
            TypedValue typedValueC2 = ff2Var.c(context);
            if (typedValueC2 == null) {
                return null;
            }
            return ff2.f(context, typedValueC2);
        }
        Integer numValueOf = (ff2Var2 == null || (typedValueC = ff2Var2.c(context)) == null) ? null : Integer.valueOf(typedValueC.resourceId);
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        int[] iArr = {R.attr.textColor};
        TypedValue typedValue = new TypedValue();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, iArr);
        typedArrayObtainStyledAttributes.getValue(0, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        return ff2.f(context, typedValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r8n
    public final void a(View view) throws Resources.NotFoundException, NumberFormatException {
        TypedValue typedValueC;
        ColorStateList colorStateListF;
        tx4 tx4Var;
        Drawable drawable;
        TypedValue typedValueC2;
        ColorStateList colorStateListF2;
        tx4 tx4Var2;
        TypedValue typedValueC3;
        ColorStateList colorStateListF3;
        TypedValue typedValueC4;
        ColorStateList colorStateListF4;
        tx4 tx4Var3;
        TypedValue typedValueC5;
        ColorStateList colorStateListF5;
        tx4 tx4Var4;
        TypedValue typedValueC6;
        ColorStateList colorStateListF6;
        tx4 tx4Var5;
        TypedValue typedValueC7;
        TypedValue typedValueC8;
        TypedValue typedValueC9;
        TypedValue typedValueC10;
        TypedValue typedValueC11;
        TypedValue typedValueC12;
        TypedValue typedValueC13;
        TypedValue typedValueC14;
        TypedValue typedValueC15;
        TypedValue typedValueC16;
        TypedValue typedValueC17;
        TypedValue typedValueC18;
        TypedValue typedValueC19;
        TypedValue typedValueC20;
        TypedValue typedValueC21;
        TypedValue typedValueC22;
        TypedValue typedValueC23;
        TypedValue typedValueC24;
        byte b = this.a;
        Integer numValueOf = null;
        colorStateListF = null;
        ColorStateList colorStateListF7 = null;
        numValueOf = null;
        ff2 ff2Var = this.e;
        ff2 ff2Var2 = this.f;
        ff2 ff2Var3 = this.g;
        ff2 ff2Var4 = this.d;
        ff2 ff2Var5 = this.c;
        ff2 ff2Var6 = this.b;
        switch (b) {
            case 0:
                Chip chip = (Chip) view;
                Context context = view.getContext();
                Objects.requireNonNull(chip);
                if (ff2Var6 != null && (typedValueC6 = ff2Var6.c(context)) != null && (colorStateListF6 = ff2.f(context, typedValueC6)) != null && (tx4Var5 = chip.e) != null && tx4Var5.I != colorStateListF6) {
                    tx4Var5.I = colorStateListF6;
                    tx4Var5.onStateChange(tx4Var5.getState());
                }
                if (ff2Var5 != null && (typedValueC5 = ff2Var5.c(context)) != null && (colorStateListF5 = ff2.f(context, typedValueC5)) != null && (tx4Var4 = chip.e) != null) {
                    tx4Var4.T = true;
                    if (tx4Var4.R != colorStateListF5) {
                        tx4Var4.R = colorStateListF5;
                        if (tx4Var4.V()) {
                            tx4Var4.Q.setTintList(colorStateListF5);
                        }
                        tx4Var4.onStateChange(tx4Var4.getState());
                    }
                }
                if (ff2Var4 != null && (typedValueC4 = ff2Var4.c(context)) != null && (colorStateListF4 = ff2.f(context, typedValueC4)) != null && (tx4Var3 = chip.e) != null && tx4Var3.L != colorStateListF4) {
                    tx4Var3.L = colorStateListF4;
                    if (tx4Var3.L0) {
                        tx4Var3.y(colorStateListF4);
                    }
                    tx4Var3.onStateChange(tx4Var3.getState());
                }
                if (ff2Var != null && (typedValueC3 = ff2Var.c(context)) != null && (colorStateListF3 = ff2.f(context, typedValueC3)) != null) {
                    tx4 tx4Var6 = chip.e;
                    if (tx4Var6 != null && tx4Var6.N != colorStateListF3) {
                        tx4Var6.N = colorStateListF3;
                        tx4Var6.G0 = null;
                        tx4Var6.onStateChange(tx4Var6.getState());
                    }
                    chip.e.getClass();
                    chip.l();
                }
                if (ff2Var2 != null && (typedValueC2 = ff2Var2.c(context)) != null && (colorStateListF2 = ff2.f(context, typedValueC2)) != null && (tx4Var2 = chip.e) != null && tx4Var2.X != colorStateListF2) {
                    tx4Var2.X = colorStateListF2;
                    if (tx4Var2.W()) {
                        tx4Var2.V.setTintList(colorStateListF2);
                    }
                    tx4Var2.onStateChange(tx4Var2.getState());
                }
                if (ff2Var3 != null && (typedValueC = ff2Var3.c(context)) != null && (colorStateListF = ff2.f(context, typedValueC)) != null && (tx4Var = chip.e) != null && tx4Var.c0 != colorStateListF) {
                    tx4Var.c0 = colorStateListF;
                    if (tx4Var.a0 && (drawable = tx4Var.b0) != null && tx4Var.Z) {
                        drawable.setTintList(colorStateListF);
                    }
                    tx4Var.onStateChange(tx4Var.getState());
                    break;
                }
                break;
            case 1:
                Context context2 = view.getContext();
                OperaIconedMessage operaIconedMessage = (OperaIconedMessage) view;
                ei eiVar = operaIconedMessage.a;
                if (ff2Var6 != null && (typedValueC12 = ff2Var6.c(context2)) != null) {
                    operaIconedMessage.setBackgroundTintList(ff2.f(context2, typedValueC12));
                }
                if (ff2Var5 != null && (typedValueC11 = ff2Var5.c(context2)) != null) {
                    ((ImageView) eiVar.e).setImageTintList(ff2.f(context2, typedValueC11));
                }
                if (ff2Var4 != null && (typedValueC10 = ff2Var4.c(context2)) != null) {
                    ((TextView) eiVar.i).setTextColor(ff2.f(context2, typedValueC10));
                }
                if (ff2Var != null && (typedValueC9 = ff2Var.c(context2)) != null) {
                    ((MaterialButton) eiVar.f).setTextColor(ff2.f(context2, typedValueC9));
                }
                if (ff2Var2 != null && (typedValueC8 = ff2Var2.c(context2)) != null) {
                    ColorStateList colorStateListF8 = ff2.f(context2, typedValueC8);
                    eiVar.g.setTextColor(colorStateListF8);
                    eiVar.g.H(colorStateListF8);
                }
                if (ff2Var3 != null && (typedValueC7 = ff2Var3.c(context2)) != null) {
                    ((TextView) eiVar.h).setTextColor(ff2.f(context2, typedValueC7));
                    break;
                }
                break;
            case 2:
                Context context3 = view.getContext();
                ColorStateList colorStateListF9 = (ff2Var6 == null || (typedValueC16 = ff2Var6.c(context3)) == null) ? null : ff2.f(context3, typedValueC16);
                Context context4 = view.getContext();
                ColorStateList colorStateListF10 = (ff2Var5 == null || (typedValueC15 = ff2Var5.c(context4)) == null) ? null : ff2.f(context4, typedValueC15);
                Integer numValueOf2 = (ff2Var4 == null || (typedValueC14 = ff2Var4.c(view.getContext())) == null) ? null : Integer.valueOf(typedValueC14.resourceId);
                ColorStateList colorStateListC = c(view.getContext(), ff2Var, ff2Var4);
                Context context5 = view.getContext();
                if (ff2Var2 != null && (typedValueC13 = ff2Var2.c(context5)) != null) {
                    numValueOf = Integer.valueOf(typedValueC13.resourceId);
                }
                ColorStateList colorStateListC2 = c(view.getContext(), ff2Var3, ff2Var2);
                OperaListItem operaListItem = (OperaListItem) view;
                bpd bpdVar = operaListItem.A;
                operaListItem.F();
                if (colorStateListF9 != null) {
                    operaListItem.x(new exh(colorStateListF9));
                }
                if (colorStateListF10 != null) {
                    operaListItem.A(new exh(colorStateListF10));
                }
                if (numValueOf2 != null) {
                    ((OperaTextView) ((bpd) operaListItem.B).b).setTextAppearance(numValueOf2.intValue());
                }
                if (colorStateListC != null) {
                    operaListItem.D(new exh(colorStateListC));
                }
                if (numValueOf != null) {
                    ((OperaTextView) bpdVar.b).setTextAppearance(numValueOf.intValue());
                }
                if (colorStateListC2 != null) {
                    ((OperaTextView) bpdVar.b).setTextColor(new exh(colorStateListC2).b(((OperaListItem) bpdVar.c).getContext()));
                    break;
                }
                break;
            case 3:
                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) view;
                Context context6 = view.getContext();
                if (ff2Var6 != null && (typedValueC22 = ff2Var6.c(context6)) != null) {
                    int thumbOffset = appCompatSeekBar.getThumbOffset();
                    appCompatSeekBar.setThumb(ff2.h(context6, typedValueC22));
                    appCompatSeekBar.setThumbOffset(thumbOffset);
                }
                if (ff2Var5 != null && (typedValueC21 = ff2Var5.c(context6)) != null) {
                    appCompatSeekBar.setIndeterminateDrawable(ff2.h(context6, typedValueC21));
                }
                if (ff2Var4 != null && (typedValueC20 = ff2Var4.c(context6)) != null) {
                    appCompatSeekBar.setProgressDrawable(ff2.h(context6, typedValueC20));
                }
                if (ff2Var != null && (typedValueC19 = ff2Var.c(context6)) != null) {
                    appCompatSeekBar.setProgressTintList(ff2.f(context6, typedValueC19));
                }
                if (ff2Var2 != null && (typedValueC18 = ff2Var2.c(context6)) != null) {
                    appCompatSeekBar.setProgressBackgroundTintList(ff2.f(context6, typedValueC18));
                }
                if (ff2Var3 != null && (typedValueC17 = ff2Var3.c(context6)) != null) {
                    appCompatSeekBar.setThumbTintList(ff2.f(context6, typedValueC17));
                }
                view.refreshDrawableState();
                break;
            default:
                TabLayout tabLayout = (TabLayout) view;
                Context context7 = tabLayout.getContext();
                Drawable drawableH = (ff2Var6 == null || (typedValueC24 = ff2Var6.c(context7)) == null) ? null : ff2.h(context7, typedValueC24);
                if (drawableH != null) {
                    tabLayout.j(drawableH);
                }
                ColorStateList colorStateListB = b(context7, ff2Var5);
                if (colorStateListB != null) {
                    int defaultColor = colorStateListB.getDefaultColor();
                    tabLayout.o = defaultColor;
                    Drawable drawable2 = tabLayout.n;
                    if (defaultColor != 0) {
                        drawable2.setTint(defaultColor);
                    } else {
                        drawable2.setTintList(null);
                    }
                    tabLayout.n(false);
                }
                ColorStateList colorStateListB2 = b(context7, ff2Var4);
                if (colorStateListB2 != null) {
                    k5l k5lVar = tabLayout.d;
                    if (tabLayout.m != colorStateListB2) {
                        tabLayout.m = colorStateListB2;
                        for (int i2 = 0; i2 < k5lVar.getChildCount(); i2++) {
                            o5l childAt = k5lVar.getChildAt(i2);
                            if (childAt instanceof o5l) {
                                Context context8 = tabLayout.getContext();
                                int i3 = o5l.j;
                                childAt.b(context8);
                            }
                        }
                    }
                }
                ColorStateList colorStateListB3 = b(context7, ff2Var3);
                if (colorStateListB3 == null) {
                    if (ff2Var2 != null && (typedValueC23 = ff2Var2.c(context7)) != null) {
                        TypedArray typedArrayObtainStyledAttributes = context7.obtainStyledAttributes(typedValueC23.resourceId, new int[]{R.attr.textColor});
                        TypedValue typedValue = new TypedValue();
                        typedArrayObtainStyledAttributes.getValue(0, typedValue);
                        typedArrayObtainStyledAttributes.recycle();
                        colorStateListF7 = ff2.f(context7, typedValue);
                    }
                    colorStateListB3 = colorStateListF7;
                }
                if (colorStateListB3 == null) {
                    colorStateListB3 = tabLayout.l;
                }
                if (colorStateListB3 != null) {
                    ColorStateList colorStateListB4 = b(context7, ff2Var);
                    if (colorStateListB4 != null) {
                        tabLayout.l(TabLayout.c(colorStateListB3.getDefaultColor(), colorStateListB4.getDefaultColor()));
                        break;
                    } else {
                        tabLayout.l(colorStateListB3);
                        break;
                    }
                }
                break;
        }
    }
}
