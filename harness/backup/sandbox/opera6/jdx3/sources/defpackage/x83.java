package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.opera.android.ui.catalog.widget.OperaChip;

/* loaded from: classes.dex */
public abstract class x83 extends OperaChip implements w6f {
    public static final ixh K = new ixh(24.0f);
    public static final ixh L = new ixh(18.0f);
    public static final ixh M = new ixh(20.0f);
    public static final lxh N = new lxh(2131232042);
    public final hri A;
    public final i7f B;
    public final Rect C;
    public final TouchDelegate D;
    public final w83 E;
    public final w83 F;
    public final w83 G;
    public final int H;
    public gri I;
    public final int J;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20, types: [v83] */
    public x83(Context context, hri hriVar) {
        super(context, (AttributeSet) null, 2130969035);
        this.A = hriVar;
        this.B = new i7f();
        Rect rect = new Rect();
        this.C = rect;
        this.D = new TouchDelegate(rect, this);
        float fH = z7h.h(context, 4.0f);
        float fH2 = z7h.h(context, 4.0f);
        float fH3 = z7h.h(context, 8.0f);
        float fH4 = z7h.h(context, 8.0f);
        float fH5 = z7h.h(context, 4.0f);
        this.E = new w83(fH, fH2, fH3, fH4, fH5);
        this.F = new w83(z7h.h(context, 6.0f), fH2, fH3, fH4, fH5);
        this.G = new w83(z7h.h(context, 4.0f), z7h.h(context, 4.0f), 0.0f, 0.0f, 0.0f);
        int iK = K.k(context);
        this.H = iK;
        this.I = gri.j;
        this.J = z7h.h(context, 48.0f);
        setLayoutDirection(3);
        tx4 tx4Var = ((Chip) this).e;
        if (tx4Var != null && tx4Var.M != 0.0f) {
            tx4Var.M = 0.0f;
            tx4Var.m0.setStrokeWidth(0.0f);
            if (tx4Var.L0) {
                tx4Var.A(0.0f);
            }
            tx4Var.invalidateSelf();
        }
        float fH6 = z7h.h(getContext(), 32.0f);
        tx4 tx4Var2 = ((Chip) this).e;
        if (tx4Var2 != null && tx4Var2.J != fH6) {
            tx4Var2.J = fH6;
            tx4Var2.invalidateSelf();
            tx4Var2.M();
        }
        float fH7 = z7h.h(getContext(), 100.0f);
        tx4 tx4Var3 = ((Chip) this).e;
        if (tx4Var3 != null && tx4Var3.K != fH7) {
            tx4Var3.K = fH7;
            tx4Var3.k(tx4Var3.l().a(fH7));
        }
        setMaxWidth(z7h.h(getContext(), 200.0f));
        setEllipsize(TextUtils.TruncateAt.END);
        float f = iK;
        tx4 tx4Var4 = ((Chip) this).e;
        if (tx4Var4 != null && tx4Var4.S != f) {
            float fH8 = tx4Var4.H();
            tx4Var4.S = f;
            float fH9 = tx4Var4.H();
            tx4Var4.invalidateSelf();
            if (fH8 != fH9) {
                tx4Var4.M();
            }
        }
        final byte b = 0;
        ((Chip) this).o = false;
        b(((Chip) this).q);
        setOnClickListener(new View.OnClickListener(this) { // from class: v83
            public final /* synthetic */ x83 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, java.lang.Object, x83] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ?? r8 = this.b;
                switch (b2) {
                    case 0:
                        i7f i7fVar = r8.B;
                        g7f g7fVarC = u35.c(i7fVar, i7fVar);
                        while (g7fVarC.hasNext()) {
                            dv7 dv7Var = (dv7) g7fVarC.next();
                            hri hriVar2 = r8.A;
                            ev7 ev7Var = dv7Var.a;
                            vs vsVar = (vs) ev7Var.f;
                            iv7 iv7Var = (iv7) ev7Var.g;
                            int iOrdinal = hriVar2.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    l42 l42Var = (l42) iv7Var.g.g();
                                    if (l42Var != null) {
                                        ev7Var.k(l42Var);
                                        if (((ChipGroup) vsVar.d).indexOfChild(r8) != -1) {
                                            ((HorizontalScrollView) vsVar.e).post(new cn7(ev7Var, (Object) r8, (byte) 3));
                                        }
                                    }
                                } else if (iOrdinal != 2) {
                                    h9o.p();
                                    break;
                                } else {
                                    ev7Var.k((eri) iv7Var.e.g());
                                    if (((ChipGroup) vsVar.d).indexOfChild(r8) != -1) {
                                        ((HorizontalScrollView) vsVar.e).post(new cn7(ev7Var, (Object) r8, (byte) 3));
                                    }
                                }
                            } else if (!r8.isSelected() && !ev7Var.c) {
                                akg akgVar = new akg(iv7Var.d, iv7Var.f, (qe6) ev7Var.j);
                                ev7Var.c = true;
                                ((mrk) ((wzg) ev7Var.h).b).v.y0();
                                akgVar.o(r8);
                            }
                        }
                        break;
                    default:
                        i7f i7fVar2 = r8.B;
                        g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
                        while (g7fVarC2.hasNext()) {
                            dv7 dv7Var2 = (dv7) g7fVarC2.next();
                            hri hriVar3 = r8.A;
                            dv7Var2.getClass();
                            int iOrdinal2 = hriVar3.ordinal();
                            if (iOrdinal2 == 0) {
                                ev7 ev7Var2 = dv7Var2.a;
                                ev7Var2.k((eri) ((iv7) ev7Var2.g).e.g());
                            } else if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                                h9o.p();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        float fK = M.k(getContext());
        tx4 tx4Var5 = ((Chip) this).e;
        if (tx4Var5 != null && tx4Var5.Y != fK) {
            tx4Var5.Y = fK;
            tx4Var5.invalidateSelf();
            if (tx4Var5.W()) {
                tx4Var5.M();
            }
        }
        Drawable drawableF = N.f(getContext());
        tx4 tx4Var6 = ((Chip) this).e;
        if (tx4Var6 != null) {
            tx4Var6.R(drawableF);
        }
        i();
        final byte b2 = 1;
        ((Chip) this).h = new View.OnClickListener(this) { // from class: v83
            public final /* synthetic */ x83 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, java.lang.Object, x83] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                ?? r8 = this.b;
                switch (b22) {
                    case 0:
                        i7f i7fVar = r8.B;
                        g7f g7fVarC = u35.c(i7fVar, i7fVar);
                        while (g7fVarC.hasNext()) {
                            dv7 dv7Var = (dv7) g7fVarC.next();
                            hri hriVar2 = r8.A;
                            ev7 ev7Var = dv7Var.a;
                            vs vsVar = (vs) ev7Var.f;
                            iv7 iv7Var = (iv7) ev7Var.g;
                            int iOrdinal = hriVar2.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    l42 l42Var = (l42) iv7Var.g.g();
                                    if (l42Var != null) {
                                        ev7Var.k(l42Var);
                                        if (((ChipGroup) vsVar.d).indexOfChild(r8) != -1) {
                                            ((HorizontalScrollView) vsVar.e).post(new cn7(ev7Var, (Object) r8, (byte) 3));
                                        }
                                    }
                                } else if (iOrdinal != 2) {
                                    h9o.p();
                                    break;
                                } else {
                                    ev7Var.k((eri) iv7Var.e.g());
                                    if (((ChipGroup) vsVar.d).indexOfChild(r8) != -1) {
                                        ((HorizontalScrollView) vsVar.e).post(new cn7(ev7Var, (Object) r8, (byte) 3));
                                    }
                                }
                            } else if (!r8.isSelected() && !ev7Var.c) {
                                akg akgVar = new akg(iv7Var.d, iv7Var.f, (qe6) ev7Var.j);
                                ev7Var.c = true;
                                ((mrk) ((wzg) ev7Var.h).b).v.y0();
                                akgVar.o(r8);
                            }
                        }
                        break;
                    default:
                        i7f i7fVar2 = r8.B;
                        g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
                        while (g7fVarC2.hasNext()) {
                            dv7 dv7Var2 = (dv7) g7fVarC2.next();
                            hri hriVar3 = r8.A;
                            dv7Var2.getClass();
                            int iOrdinal2 = hriVar3.ordinal();
                            if (iOrdinal2 == 0) {
                                ev7 ev7Var2 = dv7Var2.a;
                                ev7Var2.k((eri) ((iv7) ev7Var2.g).e.g());
                            } else if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                                h9o.p();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        i();
        u7 u7Var = new u7(this, (byte) 16);
        dll dllVarS = q9n.s(this);
        if (dllVarS != null) {
            u8n.b(dllVarS, this, u7Var);
        }
        q(this);
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.B.b((dv7) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.B.c((dv7) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int i5 = this.J;
        int i6 = i5 - width;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = i6 / 2;
        int height = i5 - getHeight();
        int i8 = (height >= 0 ? height : 0) / 2;
        this.C.set(i - i7, i2 - i8, i3 + i7, i4 + i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        gri griVar = this.I;
        if (griVar.e == null || !TextUtils.isEmpty(griVar.d) || griVar.h) {
            return;
        }
        setMeasuredDimension(getMeasuredHeight(), getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(gri griVar) {
        w83 w83Var;
        this.I = griVar;
        boolean z = griVar.c;
        boolean z2 = griVar.h;
        setSelected(z);
        String str = griVar.d;
        if (str == null || str.length() == 0) {
            w83Var = this.G;
        } else {
            int iOrdinal = griVar.f.ordinal();
            if (iOrdinal == 0) {
                w83Var = this.E;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    h9o.p();
                    return;
                }
                w83Var = this.E;
            } else {
                w83Var = this.F;
            }
        }
        float f = z2 ? w83Var.e : 0.0f;
        float f2 = w83Var.a;
        tx4 tx4Var = ((Chip) this).e;
        if (tx4Var != null && tx4Var.d0 != f2) {
            tx4Var.d0 = f2;
            tx4Var.invalidateSelf();
            tx4Var.M();
        }
        float f3 = w83Var.b + f;
        if (tx4Var != null && tx4Var.k0 != f3) {
            tx4Var.k0 = f3;
            tx4Var.invalidateSelf();
            tx4Var.M();
        }
        boolean z3 = griVar.e != null;
        if (tx4Var != null) {
            tx4Var.Q(z3);
        }
        if (tx4Var != null && tx4Var.f0 != 0.0f) {
            float fH = tx4Var.H();
            tx4Var.f0 = 0.0f;
            float fH2 = tx4Var.H();
            tx4Var.invalidateSelf();
            if (fH != fH2) {
                tx4Var.M();
            }
        }
        setText(str);
        float f4 = w83Var.c;
        if (tx4Var != null && tx4Var.g0 != f4) {
            tx4Var.g0 = f4;
            tx4Var.invalidateSelf();
            tx4Var.M();
        }
        float f5 = w83Var.d;
        if (tx4Var != null && tx4Var.h0 != f5) {
            tx4Var.h0 = f5;
            tx4Var.invalidateSelf();
            tx4Var.M();
        }
        if (tx4Var != null) {
            tx4Var.T(z2);
        }
        i();
        q(this);
        cv2 cv2Var = griVar.i;
        if (cv2Var != null) {
            cv2Var.invoke(getContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(View view) {
        Drawable drawable;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(f03.t(isSelected() ? 2130969314 : 2130969255, view.getContext(), 2131101243));
        tx4 tx4Var = ((Chip) this).e;
        if (tx4Var != null && tx4Var.I != colorStateListValueOf) {
            tx4Var.I = colorStateListValueOf;
            tx4Var.onStateChange(tx4Var.getState());
        }
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(f03.t(isSelected() ? 2130969278 : 2130969254, getContext(), 2131101243));
        int iOrdinal = this.I.f.ordinal();
        if (iOrdinal == 0) {
            drawable = this.I.e;
        } else if (iOrdinal != 1) {
            int i = this.H;
            if (iOrdinal == 2) {
                Drawable drawableI0 = j14.i0(2131231296, getContext());
                Drawable colorDrawable = this.I.e;
                if (colorDrawable == null) {
                    colorDrawable = new ColorDrawable(0);
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawableI0, colorDrawable});
                layerDrawable.setLayerGravity(0, 17);
                layerDrawable.setLayerSize(0, i, i);
                layerDrawable.setLayerGravity(1, 17);
                layerDrawable.setLayerSize(1, i, i);
                drawable = layerDrawable;
            } else {
                if (iOrdinal != 3) {
                    h9o.p();
                    return;
                }
                Drawable drawableI02 = j14.i0(2131231296, getContext());
                ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(f03.t(isSelected() ? 2130969252 : 2130969253, getContext(), 2131101243));
                drawableI02.mutate();
                drawableI02.setTintList(colorStateListValueOf3);
                Drawable colorDrawable2 = this.I.e;
                if (colorDrawable2 != null) {
                    ColorStateList colorStateListValueOf4 = ColorStateList.valueOf(f03.t(isSelected() ? 2130969278 : 2130969254, getContext(), 2131101243));
                    colorDrawable2.mutate();
                    colorDrawable2.setTintList(colorStateListValueOf4);
                } else {
                    colorDrawable2 = new ColorDrawable(0);
                }
                int iK = L.k(getContext());
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawableI02, colorDrawable2});
                layerDrawable2.setLayerGravity(0, 17);
                layerDrawable2.setLayerSize(0, i, i);
                layerDrawable2.setLayerGravity(1, 17);
                layerDrawable2.setLayerSize(1, iK, iK);
                drawable = layerDrawable2;
            }
        } else {
            Drawable drawable2 = this.I.e;
            if (drawable2 != null) {
                drawable2.mutate();
                drawable2.setTintList(colorStateListValueOf2);
                drawable = drawable2;
            } else {
                drawable = null;
            }
        }
        if (tx4Var != null) {
            tx4Var.P(drawable);
        }
        setTextColor(colorStateListValueOf2);
        if (tx4Var == null || tx4Var.X == colorStateListValueOf2) {
            return;
        }
        tx4Var.X = colorStateListValueOf2;
        if (tx4Var.W()) {
            tx4Var.V.setTintList(colorStateListValueOf2);
        }
        tx4Var.onStateChange(tx4Var.getState());
    }
}
