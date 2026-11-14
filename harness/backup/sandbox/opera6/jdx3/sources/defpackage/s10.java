package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.icu.util.ULocale;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.widget.ClickAwareCardView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s10 extends o43 implements xa2, View.OnClickListener, ev8 {
    public final z4n f;
    public final tsd g;
    public final r10 h;
    public int i;
    public p10 j;

    /* JADX WARN: Illegal instructions before constructor call */
    public s10(z4n z4nVar, pde pdeVar, tsd tsdVar) {
        FrameLayout frameLayout = z4nVar.a;
        super(frameLayout, 2131363399);
        this.f = z4nVar;
        this.g = tsdVar;
        kze kzeVarZ = p37.z(frameLayout);
        this.h = new r10(this);
        this.i = 2;
        this.j = o10.d;
        ClickAwareCardView clickAwareCardView = z4nVar.b;
        final byte b = 1;
        clickAwareCardView.setClipToOutline(true);
        clickAwareCardView.q = this;
        final byte b2 = 0;
        a26.T(pdeVar, kzeVarZ, new f7f(this) { // from class: k10
            public final /* synthetic */ s10 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                s10 s10Var = this.b;
                switch (b3) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        FrameLayout frameLayout2 = s10Var.f.a;
                        frameLayout2.setPadding(iIntValue, frameLayout2.getPaddingTop(), iIntValue, frameLayout2.getPaddingBottom());
                        break;
                    default:
                        s10Var.f0();
                        break;
                }
            }
        });
        a26.T(tsdVar, kzeVarZ, new f7f(this) { // from class: k10
            public final /* synthetic */ s10 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                s10 s10Var = this.b;
                switch (b3) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        FrameLayout frameLayout2 = s10Var.f.a;
                        frameLayout2.setPadding(iIntValue, frameLayout2.getPaddingTop(), iIntValue, frameLayout2.getPaddingBottom());
                        break;
                    default:
                        s10Var.f0();
                        break;
                }
            }
        });
        u7 u7Var = new u7(this, (byte) 7);
        dll dllVarS = q9n.s(frameLayout);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, frameLayout, u7Var);
    }

    @Override // defpackage.xa2
    public final void J(wa2 wa2Var) {
        wa2Var.c = false;
    }

    @Override // defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        z4n z4nVar = this.f;
        ClickAwareCardView clickAwareCardView = z4nVar.b;
        ClickAwareCardView clickAwareCardView2 = z4nVar.b;
        Locale localeB = cqp.c0(clickAwareCardView.getResources().getConfiguration()).b(0);
        this.i = ULocale.forLocale(localeB).isRightToLeft() != TextUtils.getLayoutDirectionFromLocale(localeB) ? l2c.a(clickAwareCardView2.getContext()) : 2;
        l10 l10VarH0 = h0();
        if (l10VarH0 != null) {
            j0();
            i0();
            f0();
            k0(z4nVar.d, l10VarH0.b);
            k0(z4nVar.e, l10VarH0.c);
            boolean z2 = l10VarH0.i;
            TextView textView = z4nVar.i;
            if (z2) {
                if (textView != null) {
                    k0(textView, l10VarH0.d);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
            clickAwareCardView2.a.d(this.i);
            mq mqVar = (mq) this.b;
            w10 w10Var = (w10) (mqVar != null ? mqVar.d : null);
            cie cieVar = w10Var != null ? w10Var.u : null;
            if (cieVar == null) {
                return;
            }
            cieVar.q0 = !Intrinsics.a(this.j, n10.d);
            cieVar.T = this.h;
        }
    }

    @Override // defpackage.o43, defpackage.ab2
    public final void Y() {
        super.Y();
        mq mqVar = (mq) this.b;
        w10 w10Var = (w10) (mqVar != null ? mqVar.d : null);
        cie cieVar = w10Var != null ? w10Var.u : null;
        if (cieVar != null) {
            cieVar.T = y55.a;
        }
    }

    public final void f0() {
        q10 q10Var;
        int iT;
        z4n z4nVar = this.f;
        Context context = z4nVar.a.getContext();
        l10 l10VarH0 = h0();
        if (l10VarH0 == null) {
            return;
        }
        rmn rmnVar = (rmn) this.g.g();
        int iD = v8k.a.d(context);
        int iR = rmnVar != null ? p37.r(rmnVar.e, iD) : p37.j0(1.0f, iD);
        int defaultColor = f03.u(R.attr.textColorPrimary, context, 2131099830).getDefaultColor();
        if (f03.I(context)) {
            int iY = ipe.Y(defaultColor, l10VarH0.j);
            q10Var = new q10(iY, ipe.Y(defaultColor, l10VarH0.l), ipe.Y(f03.t(2130969303, context, 2131101243), l10VarH0.n), ipe.Y(f03.t(2130969273, context, 2131101243), l10VarH0.p), iY);
        } else {
            int iY2 = ipe.Y(defaultColor, l10VarH0.k);
            q10Var = new q10(iY2, ipe.Y(defaultColor, l10VarH0.m), ipe.Y(f03.t(2130969303, context, 2131101243), l10VarH0.o), ipe.Y(f03.t(2130969273, context, 2131101243), l10VarH0.q), iY2);
        }
        int defaultColor2 = f03.u(R.attr.textColorPrimary, context, 2131099830).getDefaultColor();
        int iT2 = q10Var.c;
        if (((float) ab5.e(iT2, iR)) >= 4.5d) {
            iT = q10Var.d;
        } else {
            iT2 = f03.t(2130969303, context, 2131101243);
            iT = f03.t(2130969273, context, 2131101243);
        }
        yq1 yq1Var = z4nVar.d;
        MaterialButton materialButton = z4nVar.i;
        yq1Var.setTextColor(defaultColor2);
        z4nVar.e.setTextColor(defaultColor2);
        if (materialButton != null) {
            materialButton.setTextColor(iT);
            materialButton.setBackgroundColor(iT2);
        }
        z4nVar.g.setImageTintList(ColorStateList.valueOf(defaultColor2));
    }

    public final void g0() {
        yz yzVar;
        ConstraintLayout constraintLayout = this.f.j;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        mq mqVar = (mq) this.b;
        if (mqVar != null && (yzVar = mqVar.d) != null) {
            mqVar.g.s(yzVar);
        }
        j0();
        mq mqVar2 = (mq) this.b;
        w10 w10Var = (w10) (mqVar2 != null ? mqVar2.d : null);
        cie cieVar = w10Var != null ? w10Var.u : null;
        if (cieVar != null) {
            cieVar.q0 = true;
        }
    }

    public final l10 h0() {
        mq mqVar = (mq) this.b;
        w10 w10Var = (w10) (mqVar != null ? mqVar.d : null);
        if (w10Var == null) {
            return null;
        }
        cie cieVar = w10Var.u;
        return new l10(cieVar.o0, cieVar.q, cieVar.r, cieVar.t, cieVar.a0, cieVar.b0, cieVar.c0, cieVar.d0, cieVar.s, cieVar.e0, cieVar.f0, cieVar.g0, cieVar.h0, cieVar.m0, cieVar.n0, cieVar.k0, cieVar.l0);
    }

    @Override // defpackage.o43, defpackage.cr
    public final void i(boolean z) {
        mq mqVar = (mq) this.b;
        w10 w10Var = (w10) (mqVar != null ? mqVar.d : null);
        cie cieVar = w10Var != null ? w10Var.u : null;
        if (cieVar == null) {
            return;
        }
        if (!z) {
            cieVar.unregister();
            return;
        }
        z4n z4nVar = this.f;
        ClickAwareCardView clickAwareCardView = z4nVar.b;
        ClickAwareCardView clickAwareCardView2 = z4nVar.b;
        ConstraintLayout constraintLayout = z4nVar.c;
        clickAwareCardView.setOnClickListener(null);
        clickAwareCardView2.setOnTouchListener(null);
        clickAwareCardView2.setClickable(false);
        constraintLayout.setOnClickListener(null);
        constraintLayout.setOnTouchListener(null);
        constraintLayout.setClickable(false);
        cieVar.R = clickAwareCardView2;
        List listSingletonList = Collections.singletonList(constraintLayout);
        if (!m5h.d(listSingletonList)) {
            cieVar.Q = new ArrayList(listSingletonList);
        }
        MaterialButton materialButton = z4nVar.i;
        if (materialButton != null) {
            cieVar.S = materialButton;
        }
        cieVar.h(null);
    }

    public final void i0() {
        String str;
        String str2;
        z4n z4nVar = this.f;
        FrameLayout frameLayout = z4nVar.a;
        ClickAwareCardView clickAwareCardView = z4nVar.b;
        Context context = frameLayout.getContext();
        l10 l10VarH0 = h0();
        if (l10VarH0 != null) {
            if (f03.I(context)) {
                str = l10VarH0.e;
                str2 = l10VarH0.g;
            } else {
                str = l10VarH0.f;
                str2 = l10VarH0.h;
            }
            AppCompatImageView appCompatImageView = z4nVar.f;
            ga6 ga6VarM = ga6.m(appCompatImageView, clickAwareCardView);
            if (str == null || str.length() == 0) {
                appCompatImageView.setVisibility(4);
            } else {
                appCompatImageView.setVisibility(0);
                gu8.g0(str, appCompatImageView, ga6VarM);
            }
            AppCompatImageView appCompatImageView2 = z4nVar.h;
            if (appCompatImageView2 != null) {
                ga6 ga6VarM2 = ga6.m(appCompatImageView2, clickAwareCardView);
                if (str2 == null || str2.length() == 0) {
                    appCompatImageView2.setVisibility(4);
                } else {
                    appCompatImageView2.setVisibility(0);
                    gu8.g0(str2, appCompatImageView2, ga6VarM2);
                }
            }
        }
    }

    public final void j0() {
        ConstraintLayout constraintLayout;
        l10 l10VarH0 = h0();
        if (l10VarH0 != null) {
            boolean z = l10VarH0.a;
            z4n z4nVar = this.f;
            p10 p10Var = (!z || ((constraintLayout = z4nVar.j) != null && constraintLayout.getVisibility() == 0)) ? m10.d : n10.d;
            if (Intrinsics.a(this.j, p10Var)) {
                return;
            }
            this.j = p10Var;
            z4nVar.g.setImageResource(p10Var.b);
            n1h.n(z4nVar.g, p10Var.c, 0);
        }
    }

    public final void k0(TextView textView, String str) {
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
        if (this.i != 1) {
            int iJ = cs5.J(str);
            if (iJ == 0 || iJ == 1) {
                this.i = iJ;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yz yzVar;
        if (!Intrinsics.a(view, this.f.g)) {
            mq mqVar = (mq) this.b;
            if (mqVar != null) {
                yz yzVar2 = mqVar.d;
                if (yzVar2 == null || !yzVar2.s()) {
                    mqVar.k();
                    return;
                }
                return;
            }
            return;
        }
        p10 p10Var = this.j;
        if (!Intrinsics.a(p10Var, m10.d)) {
            if (Intrinsics.a(p10Var, n10.d)) {
                g0();
                return;
            } else {
                if (Intrinsics.a(p10Var, o10.d)) {
                    return;
                }
                h9o.p();
                return;
            }
        }
        mq mqVar2 = (mq) this.b;
        w10 w10Var = (w10) (mqVar2 != null ? mqVar2.d : null);
        cie cieVar = w10Var != null ? w10Var.u : null;
        if (cieVar != null) {
            cieVar.g(5);
            mq mqVar3 = (mq) this.b;
            if (mqVar3 == null || (yzVar = mqVar3.d) == null) {
                return;
            }
            mqVar3.g.x(yzVar, mqVar3.c);
            kq kqVar = mqVar3.l;
            if (kqVar != null) {
                kqVar.r(mqVar3);
            }
        }
    }
}
