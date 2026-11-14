package com.opera.android.ui.catalog.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.amf;
import defpackage.b8h;
import defpackage.bmf;
import defpackage.cmf;
import defpackage.cxh;
import defpackage.dmf;
import defpackage.exh;
import defpackage.gpj;
import defpackage.hm3;
import defpackage.imf;
import defpackage.ixh;
import defpackage.lxh;
import defpackage.ohh;
import defpackage.olf;
import defpackage.plf;
import defpackage.pt1;
import defpackage.pxh;
import defpackage.qlf;
import defpackage.qxh;
import defpackage.rlf;
import defpackage.slf;
import defpackage.tlf;
import defpackage.ulf;
import defpackage.vlf;
import defpackage.wlf;
import defpackage.xlf;
import defpackage.ylf;
import defpackage.zlf;
import defpackage.zvd;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/opera/android/ui/catalog/widget/OperaListItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/Checkable;", "bpd", "vlf", "i41", "uup", "catalog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class OperaListItem extends ConstraintLayout implements Checkable {
    public static final /* synthetic */ int C = 0;
    public final bpd A;
    public final dmf B;
    public final pt1 p;
    public int q;
    public final zvd r;
    public final hm3 s;
    public View.OnClickListener t;
    public vlf u;
    public final Integer v;
    public i41 w;
    public uup x;
    public final boolean y;
    public pxh z;

    public OperaListItem(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OperaListItem(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super(context, attributeSet, i, 0);
        LayoutInflater.from(context).inflate(2131559182, (ViewGroup) this);
        int i2 = 2131362701;
        if (w1h.j(2131362701, this) != null) {
            i2 = 2131362704;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131362704, this);
            if (frameLayout != null) {
                i2 = 2131362705;
                LinearLayout linearLayout = (LinearLayout) w1h.j(2131362705, this);
                if (linearLayout != null) {
                    i2 = 2131362707;
                    if (w1h.j(2131362707, this) != null) {
                        i2 = 2131364551;
                        if (w1h.j(2131364551, this) != null) {
                            i2 = 2131364554;
                            FrameLayout frameLayout2 = (FrameLayout) w1h.j(2131364554, this);
                            if (frameLayout2 != null) {
                                i2 = 2131364555;
                                if (w1h.j(2131364555, this) != null) {
                                    i2 = 2131364596;
                                    OperaTextView operaTextViewJ = w1h.j(2131364596, this);
                                    if (operaTextViewJ != null) {
                                        i2 = 2131363525;
                                        OperaTextView operaTextViewJ2 = w1h.j(2131363525, this);
                                        if (operaTextViewJ2 != null) {
                                            this.p = new pt1(this, frameLayout, linearLayout, frameLayout2, operaTextViewJ, operaTextViewJ2);
                                            gpj gpjVarS = ddh.s(r9n.i(context).height(), context);
                                            gpj gpjVar = gpj.a;
                                            boolean zD = gpjVarS.d();
                                            i41 ylfVar = amf.l;
                                            byte b = 2;
                                            this.q = zD ? 10 : 2;
                                            this.r = new zvd(this, (byte) 7);
                                            this.s = new hm3(this, b);
                                            this.w = ylfVar;
                                            uup plfVar = rlf.h;
                                            this.x = plfVar;
                                            this.A = new bpd((byte) 28, this, operaTextViewJ2, false);
                                            this.B = new dmf(this, operaTextViewJ);
                                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohh.b, 0, i);
                                            if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getResourceId(0, 0) != 2130970694) {
                                                this.y = true;
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                                                int i3 = typedArrayObtainStyledAttributes.getInt(5, 0);
                                                if (i3 == 1) {
                                                    plfVar = new plf();
                                                } else if (i3 == 2) {
                                                    plfVar = new olf();
                                                } else if (i3 == 3) {
                                                    plfVar = new slf();
                                                } else if (i3 == 4) {
                                                    plfVar = new tlf();
                                                } else if (i3 == 5) {
                                                    plfVar = new qlf();
                                                }
                                                y(plfVar);
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(12)) {
                                                int i4 = typedArrayObtainStyledAttributes.getInt(12, 0);
                                                if (i4 == 1) {
                                                    ylfVar = xlf.l;
                                                } else if (i4 == 2) {
                                                    ylfVar = new ylf();
                                                } else if (i4 == 3) {
                                                    ylfVar = new zlf();
                                                } else if (i4 == 4) {
                                                    ylfVar = new wlf();
                                                } else if (i4 == 5) {
                                                    ylfVar = new bmf();
                                                }
                                                B(ylfVar);
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                                                setChecked(typedArrayObtainStyledAttributes.getBoolean(1, false));
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                                                v(new lxh(typedArrayObtainStyledAttributes.getResourceId(2, 0)));
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                                                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                                                uup uupVar = this.x;
                                                plf plfVar2 = (plf) (uupVar instanceof plf ? uupVar : null);
                                                if (plfVar2 != null) {
                                                    imf imfVar = plfVar2.h;
                                                    ImageView imageView = (imfVar == null ? null : imfVar).c;
                                                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                                    if (layoutParams == null) {
                                                        t3p.q("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                        throw null;
                                                    }
                                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                    layoutParams2.height = dimensionPixelSize;
                                                    layoutParams2.width = dimensionPixelSize;
                                                    imageView.setLayoutParams(layoutParams2);
                                                }
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                                                ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(4);
                                                x(colorStateList3 != null ? new exh(colorStateList3) : null);
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                                                z(new lxh(typedArrayObtainStyledAttributes.getResourceId(6, 0)));
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(9)) {
                                                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
                                                i41 i41Var = this.w;
                                                ylf ylfVar2 = (ylf) (i41Var instanceof ylf ? i41Var : null);
                                                if (ylfVar2 != null) {
                                                    imf imfVar2 = ylfVar2.l;
                                                    ImageView imageView2 = (imfVar2 == null ? null : imfVar2).c;
                                                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                                                    if (layoutParams3 == null) {
                                                        t3p.q("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                        throw null;
                                                    }
                                                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                    layoutParams4.height = dimensionPixelSize2;
                                                    layoutParams4.width = dimensionPixelSize2;
                                                    imageView2.setLayoutParams(layoutParams4);
                                                }
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(10)) {
                                                ColorStateList colorStateList4 = typedArrayObtainStyledAttributes.getColorStateList(10);
                                                A(colorStateList4 != null ? new exh(colorStateList4) : null);
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(8)) {
                                                int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
                                                i41 i41Var2 = this.w;
                                                ylf ylfVar3 = (ylf) (i41Var2 instanceof ylf ? i41Var2 : null);
                                                if (ylfVar3 != null) {
                                                    imf imfVar3 = ylfVar3.l;
                                                    ImageView imageView3 = (imfVar3 == null ? null : imfVar3).c;
                                                    ViewGroup.LayoutParams layoutParams5 = imageView3.getLayoutParams();
                                                    if (layoutParams5 == null) {
                                                        t3p.q("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                        throw null;
                                                    }
                                                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                                                    layoutParams6.setMarginStart(dimensionPixelSize3);
                                                    imageView3.setLayoutParams(layoutParams6);
                                                }
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                                                int i5 = typedArrayObtainStyledAttributes.getInt(11, 17);
                                                this.v = Integer.valueOf(i5);
                                                View viewD = this.w.D();
                                                if (viewD != null) {
                                                    ViewGroup.LayoutParams layoutParams7 = viewD.getLayoutParams();
                                                    if (layoutParams7 == null) {
                                                        t3p.q("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                        throw null;
                                                    }
                                                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                                                    layoutParams8.gravity = i5;
                                                    viewD.setLayoutParams(layoutParams8);
                                                }
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(13)) {
                                                String string = typedArrayObtainStyledAttributes.getString(13);
                                                C(string != null ? new qxh(string) : null);
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(14)) {
                                                operaTextViewJ.setMaxLines(typedArrayObtainStyledAttributes.getInteger(14, Integer.MAX_VALUE));
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                                                operaTextViewJ.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(15, 0));
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(16) && (colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(16)) != null) {
                                                D(new exh(colorStateList2));
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(17)) {
                                                String string2 = typedArrayObtainStyledAttributes.getString(17);
                                                E(string2 != null ? new qxh(string2) : null);
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(18)) {
                                                operaTextViewJ2.setMaxLines(typedArrayObtainStyledAttributes.getInteger(18, Integer.MAX_VALUE));
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(19)) {
                                                operaTextViewJ2.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(19, 0));
                                            }
                                            if (typedArrayObtainStyledAttributes.hasValue(20) && (colorStateList = typedArrayObtainStyledAttributes.getColorStateList(20)) != null) {
                                                operaTextViewJ2.setTextColor(new exh(colorStateList).b(getContext()));
                                            }
                                            G(this.q);
                                            typedArrayObtainStyledAttributes.recycle();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static void H(OperaListItem operaListItem, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i4 = operaListItem.q;
        int i5 = ((~i2) & i4) | i;
        operaListItem.q = i5;
        if (i4 != i5) {
            operaListItem.G(i5);
        }
    }

    public static boolean r(int i, int... iArr) {
        for (int i2 : iArr) {
            if ((i2 & i) == 0) {
                return false;
            }
        }
        return true;
    }

    public final void A(exh exhVar) {
        i41 i41Var = this.w;
        ColorStateList colorStateListB = null;
        if (!(i41Var instanceof ylf)) {
            i41Var = null;
        }
        ylf ylfVar = (ylf) i41Var;
        if (ylfVar != null) {
            imf imfVar = ylfVar.l;
            ImageView imageView = (imfVar == null ? null : imfVar).c;
            if (exhVar != null) {
                colorStateListB = exhVar.b((imfVar != null ? imfVar : null).c.getContext());
            }
            imageView.setImageTintList(colorStateListB);
        }
    }

    public final void B(i41 i41Var) {
        if (i41Var.getClass().equals(this.w.getClass())) {
            return;
        }
        this.w = i41Var;
        pt1 pt1Var = this.p;
        ((FrameLayout) pt1Var.e).removeAllViews();
        i41Var.F((FrameLayout) pt1Var.e);
        Integer num = this.v;
        if (num != null) {
            int iIntValue = num.intValue();
            View viewD = i41Var.D();
            if (viewD != null) {
                ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
                if (layoutParams == null) {
                    t3p.q("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                } else {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = iIntValue;
                    viewD.setLayoutParams(layoutParams2);
                }
            }
        }
        int iA = i41Var.A();
        int i = this.q;
        int i2 = (i & (-3)) | iA;
        this.q = i2;
        if (i != i2) {
            G(i2);
        }
        if (i41Var instanceof cmf) {
            ((cmf) i41Var).t0().setOnCheckedChangeListener(this.s);
        }
        J();
    }

    public final void C(pxh pxhVar) {
        this.B.V(pxhVar);
    }

    public final void D(cxh cxhVar) {
        dmf dmfVar = this.B;
        ((OperaTextView) ((bpd) dmfVar).b).setTextColor(cxhVar.b(((OperaListItem) ((bpd) dmfVar).c).getContext()));
    }

    public final void E(pxh pxhVar) {
        this.A.V(pxhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        Drawable drawable;
        if (this.y) {
            return;
        }
        if (this.t != null) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(2130970694, typedValue, true);
            drawable = getContext().getDrawable(typedValue.resourceId);
        } else {
            drawable = null;
        }
        setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void G(int i) {
        int iK = (r(i, 1) ? r(i, 8) ? new ixh(64.0f) : new ixh(72.0f) : new ixh(56.0f)).k(getContext());
        if (iK != ((ConstraintLayout) this).e) {
            ((ConstraintLayout) this).e = iK;
            requestLayout();
        }
        if (r(i, 2)) {
            setPaddingRelative(getResources().getDimensionPixelSize(2131165871), 0, getPaddingEnd(), 0);
        } else {
            setPaddingRelative(0, 0, getPaddingEnd(), 0);
        }
        ((LinearLayout) this.p.g).setVisibility(r(i, 4) ? 0 : 8);
        u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(boolean z) throws Resources.NotFoundException {
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        i41 i41Var = this.w;
        if (i41Var instanceof cmf) {
            if (i41Var instanceof wlf) {
                string4 = z ? getResources().getString(2132018213) : getResources().getString(2132021997);
                string5 = getResources().getString(2132021901);
            } else if (i41Var instanceof bmf) {
                string4 = z ? getResources().getString(2132021995) : getResources().getString(2132021994);
                string5 = getResources().getString(2132021028);
            } else {
                string4 = "";
                string5 = null;
            }
            WeakHashMap weakHashMap = r5n.a;
            str = "";
            new d5n(2131364694, CharSequence.class, 64, 30, (byte) 1).a(this, string4);
            r5n.k(this, s8.g, string5, (la) null);
        } else {
            str = "";
        }
        if (this.x instanceof ulf) {
            if (r(this.q, 4)) {
                WeakHashMap weakHashMap2 = r5n.a;
                new d5n(2131364694, CharSequence.class, 64, 30, (byte) 1).a(this, str);
                return;
            }
            uup uupVar = this.x;
            if (uupVar == null) {
                string = null;
            } else {
                if (uupVar instanceof tlf) {
                    string2 = z ? getResources().getString(2132021995) : getResources().getString(2132021994);
                    string = getResources().getString(2132021902);
                } else if (uupVar instanceof olf) {
                    if (z) {
                        string = getResources().getString(2132021903);
                        string3 = getResources().getString(2132018213);
                    } else {
                        string = getResources().getString(2132021901);
                        string3 = getResources().getString(2132021997);
                    }
                    string2 = string3;
                } else {
                    if (uupVar instanceof slf) {
                        string2 = z ? getResources().getString(2132021995) : getResources().getString(2132021994);
                        string = getResources().getString(2132021028);
                    }
                    string = null;
                }
                str = string2;
            }
            WeakHashMap weakHashMap3 = r5n.a;
            new d5n(2131364694, CharSequence.class, 64, 30, (byte) 1).a(this, str);
            r5n.k(this, s8.g, string, (la) null);
        }
    }

    public final void J() {
        boolean z = (this.w instanceof cmf) || (this.x instanceof ulf);
        View.OnClickListener onClickListener = this.t;
        zvd zvdVar = this.r;
        if (z) {
            if (onClickListener == null) {
                setOnClickListener(zvdVar);
            }
        } else if (onClickListener == zvdVar) {
            setOnClickListener(null);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        i41 i41Var = this.w;
        cmf cmfVar = i41Var instanceof cmf ? (cmf) i41Var : null;
        if (cmfVar == null || !cmfVar.isChecked()) {
            uup uupVar = this.x;
            ulf ulfVar = uupVar instanceof ulf ? (ulf) uupVar : null;
            if (ulfVar == null || !ulfVar.isChecked()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        Context context = getContext();
        gpj gpjVarS = ddh.s(r9n.i(context).height(), context);
        gpj gpjVar = gpj.a;
        if (gpjVarS.d()) {
            H(this, 8, 0, 2);
        } else {
            H(this, 0, 8, 1);
        }
    }

    public final void s() {
        View.OnClickListener onClickListener = this.t;
        boolean z = (onClickListener == this.r || onClickListener == null) ? false : true;
        if (this.x.J() && z) {
            H(this, 4, 0, 2);
        } else {
            H(this, 0, 4, 1);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) throws Resources.NotFoundException {
        i41 i41Var = this.w;
        cmf cmfVar = i41Var instanceof cmf ? (cmf) i41Var : null;
        if (cmfVar != null) {
            cmfVar.setChecked(z);
        }
        uup uupVar = this.x;
        ulf ulfVar = uupVar instanceof ulf ? (ulf) uupVar : null;
        if (ulfVar != null) {
            ulfVar.setChecked(z);
        }
        I(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setEnabled(boolean z) {
        super/*android.view.View*/.setEnabled(z);
        View viewD = this.w.D();
        if (viewD != null) {
            viewD.setEnabled(z);
        }
        this.x.H(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super/*android.view.View*/.setOnClickListener(onClickListener);
        this.t = onClickListener;
        F();
        s();
    }

    public final void t(boolean z) {
        vlf vlfVar = this.u;
        this.u = null;
        setChecked(z);
        this.u = vlfVar;
        I(z);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        i41 i41Var = this.w;
        cmf cmfVar = i41Var instanceof cmf ? (cmf) i41Var : null;
        if (cmfVar != null) {
            cmfVar.toggle();
        }
        uup uupVar = this.x;
        ulf ulfVar = uupVar instanceof ulf ? (ulf) uupVar : null;
        if (ulfVar != null) {
            ulfVar.toggle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r4 = this;
            int r0 = r4.q
            r1 = 4
            int[] r1 = new int[]{r1}
            boolean r0 = r(r0, r1)
            if (r0 != 0) goto L18
            uup r0 = r4.x
            boolean r1 = r0 instanceof defpackage.qlf
            if (r1 != 0) goto L18
            r1 = 0
            r0.I(r1)
            goto L5e
        L18:
            uup r0 = r4.x
            r1 = 1
            r0.I(r1)
            uup r0 = r4.x
            pxh r1 = r4.z
            pt1 r2 = r4.p
            if (r1 != 0) goto L34
            android.view.View r1 = r2.c
            com.opera.android.ui.catalog.widget.OperaTextView r1 = (com.opera.android.ui.catalog.widget.OperaTextView) r1
            java.lang.CharSequence r1 = r1.getText()
            qxh r3 = new qxh
            r3.<init>(r1)
            r1 = r3
        L34:
            r0.G(r1)
            android.view.View r0 = r2.c
            com.opera.android.ui.catalog.widget.OperaTextView r0 = (com.opera.android.ui.catalog.widget.OperaTextView) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.Object r1 = r2.f
            com.opera.android.ui.catalog.widget.OperaTextView r1 = (com.opera.android.ui.catalog.widget.OperaTextView) r1
            java.lang.CharSequence r1 = r1.getText()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r4.setContentDescription(r0)
        L5e:
            i41 r4 = r4.w
            r4.g0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.ui.catalog.widget.OperaListItem.u():void");
    }

    public final void v(b8h b8hVar) {
        uup uupVar = this.x;
        if (!(uupVar instanceof plf)) {
            uupVar = null;
        }
        plf plfVar = (plf) uupVar;
        if (plfVar != null) {
            plfVar.O(b8hVar);
        }
    }

    public final void w(View.OnClickListener onClickListener) {
        uup uupVar = this.x;
        if (!(uupVar instanceof plf)) {
            uupVar = null;
        }
        plf plfVar = (plf) uupVar;
        if (plfVar != null) {
            imf imfVar = plfVar.h;
            (imfVar != null ? imfVar : null).c.setOnClickListener(onClickListener);
            s();
        }
    }

    public final void x(cxh cxhVar) {
        uup uupVar = this.x;
        ColorStateList colorStateListB = null;
        if (!(uupVar instanceof plf)) {
            uupVar = null;
        }
        plf plfVar = (plf) uupVar;
        if (plfVar != null) {
            imf imfVar = plfVar.h;
            ImageView imageView = (imfVar != null ? imfVar : null).c;
            if (cxhVar != null) {
                colorStateListB = cxhVar.b((imfVar != null ? imfVar : null).c.getContext());
            }
            imageView.setImageTintList(colorStateListB);
        }
    }

    public final void y(uup uupVar) {
        if (uupVar.getClass().equals(this.x.getClass())) {
            return;
        }
        this.x = uupVar;
        pt1 pt1Var = this.p;
        ((FrameLayout) pt1Var.b).removeAllViews();
        uupVar.v((FrameLayout) pt1Var.b);
        if (uupVar instanceof ulf) {
            ((ulf) uupVar).O().setOnCheckedChangeListener(this.s);
        }
        J();
    }

    public final void z(b8h b8hVar) {
        i41 i41Var = this.w;
        if (!(i41Var instanceof ylf)) {
            i41Var = null;
        }
        ylf ylfVar = (ylf) i41Var;
        if (ylfVar != null) {
            imf imfVar = ylfVar.l;
            (imfVar == null ? null : imfVar).c.setImageDrawable(b8hVar.f((imfVar != null ? imfVar : null).c.getContext()));
        }
    }
}
