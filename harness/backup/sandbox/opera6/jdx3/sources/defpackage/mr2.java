package defpackage;

import J.N;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.HorizontalScrollView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.CreditCard;
import com.opera.android.autofill.PersonalDataMonitor;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingTextView;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public abstract class mr2 extends ltl {
    public final hr2 A;
    public final orm r;
    public final AutofillManager s;
    public final gw t;
    public cr2 u;
    public pq3 v;
    public ro9 w;
    public String x;
    public fr2 y;
    public PersonalDataMonitor z;

    /* JADX WARN: Illegal instructions before constructor call */
    public mr2(orm ormVar, AutofillManager autofillManager, gw gwVar, int i) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(i);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = 0;
        itlVar.k = 1;
        super(itlVar);
        this.r = ormVar;
        this.s = autofillManager;
        this.t = gwVar;
        this.A = new hr2(this);
    }

    public final String G0() {
        cr2 cr2Var = this.u;
        if (cr2Var == null) {
            cr2Var = null;
        }
        return new Regex("\\s+").replace(String.valueOf(((OperaTextInputEditText) cr2Var.k).getText()), "");
    }

    public final String H0() {
        cr2 cr2Var = this.u;
        if (cr2Var == null) {
            cr2Var = null;
        }
        String strValueOf = String.valueOf(((OperaTextInputEditText) cr2Var.f).getText());
        int length = strValueOf.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = strValueOf.charAt(!z ? i : length) <= ' ';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return strValueOf.subSequence(i, length + 1).toString();
    }

    public String I0() {
        return null;
    }

    public final boolean J0() {
        fr frVarC = ic4.C(H0());
        if (frVarC != null) {
            int i = frVarC.b;
            if (i < 100) {
                i += (Calendar.getInstance().get(1) / 100) * 100;
            }
            int i2 = frVarC.c;
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(1);
            int i4 = calendar.get(2) + 1;
            if (i >= i3 && (i != i3 || i2 >= i4)) {
                return false;
            }
        }
        return true;
    }

    public void K0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        CreditCard creditCard = new CreditCard("", str, 0, "", str3, str4, str5, str6, str7);
        va2 va2Var = new va2(this, (byte) 5);
        nrl nrlVar = this.s.a;
        if (nrlVar.a) {
            N.M3WZIaM8(creditCard, str2, va2Var);
        } else {
            nrlVar.d(new k3(creditCard, str2, va2Var, (byte) 14));
        }
    }

    public final void L0(String str) {
        ColorStateList colorStateListF = f03.F(requireContext());
        int iT = f03.t(2130969119, requireContext(), 2131102430);
        cr2 cr2Var = this.u;
        if (str != null) {
            if (cr2Var == null) {
                cr2Var = null;
            }
            ((StylingTextView) cr2Var.b).setTextColor(iT);
            cr2 cr2Var2 = this.u;
            (cr2Var2 != null ? cr2Var2 : null).e.p(str);
            return;
        }
        if (cr2Var == null) {
            cr2Var = null;
        }
        ((StylingTextView) cr2Var.b).setTextColor(colorStateListF);
        cr2 cr2Var3 = this.u;
        if (cr2Var3 == null) {
            cr2Var3 = null;
        }
        cr2Var3.e.p((CharSequence) null);
    }

    public final void M0() {
        String strG0 = G0();
        this.s.getClass();
        boolean zMSg1Yo08 = N.MSg1Yo08(strG0);
        pq3 pq3Var = this.v;
        if (pq3Var == null) {
            pq3Var = null;
        }
        pq3Var.d.setEnabled(zMSg1Yo08);
        boolean zA = Intrinsics.a((String) N.MyZkOeCB(G0()), "amex");
        cr2 cr2Var = this.u;
        if (zA) {
            ((OperaTextInputEditText) (cr2Var != null ? cr2Var : null).d).setHint(2132017789);
        } else {
            ((OperaTextInputEditText) (cr2Var != null ? cr2Var : null).d).setHint(2132017791);
        }
    }

    @Override // defpackage.ltl
    public final void onPause() {
        super.onPause();
        PersonalDataMonitor personalDataMonitor = this.z;
        if (personalDataMonitor != null) {
            personalDataMonitor.a();
            this.z = null;
        }
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        PersonalDataMonitor personalDataMonitor = this.z;
        AutofillManager autofillManager = this.s;
        if (personalDataMonitor == null) {
            q02 q02Var = new q02(this, (byte) 25);
            autofillManager.getClass();
            this.z = AutofillManager.b(q02Var);
        }
        autofillManager.c(new ab(this, (byte) 26));
    }

    @Override // defpackage.k24
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        cr2 cr2Var = this.u;
        if (cr2Var == null) {
            cr2Var = null;
        }
        this.w = new ro9(((hi4) cr2Var.h).b, new va2(this, (byte) 7));
        byte b = 8;
        requireActivity().getWindow().getDecorView().setImportantForAutofill(8);
        cr2 cr2Var2 = this.u;
        if (cr2Var2 == null) {
            cr2Var2 = null;
        }
        ((OperaTextInputEditText) cr2Var2.k).addTextChangedListener(new l16(this.s));
        cr2 cr2Var3 = this.u;
        if (cr2Var3 == null) {
            cr2Var3 = null;
        }
        ((OperaTextInputEditText) cr2Var3.k).addTextChangedListener(new mj2(this, (byte) 3));
        cr2 cr2Var4 = this.u;
        if (cr2Var4 == null) {
            cr2Var4 = null;
        }
        TextInputLayout textInputLayout = cr2Var4.m;
        nf nfVar = new nf(view, this, b);
        CheckableImageButton checkableImageButton = textInputLayout.c.f;
        checkableImageButton.setOnClickListener(nfVar);
        ic4.J(checkableImageButton);
        cr2 cr2Var5 = this.u;
        TextInputEditText textInputEditText = (OperaTextInputEditText) (cr2Var5 != null ? cr2Var5 : null).f;
        if (cr2Var5 == null) {
            cr2Var5 = null;
        }
        textInputEditText.addTextChangedListener(new hcd((OperaTextInputEditText) cr2Var5.f));
        cr2 cr2Var6 = this.u;
        if (cr2Var6 == null) {
            cr2Var6 = null;
        }
        final byte b2 = 0;
        ((OperaTextInputEditText) cr2Var6.f).addTextChangedListener(new jr2(this, (byte) 0));
        cr2 cr2Var7 = this.u;
        if (cr2Var7 == null) {
            cr2Var7 = null;
        }
        ((OperaTextInputEditText) cr2Var7.f).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: er2
            public final /* synthetic */ mr2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                int i;
                byte b3 = b2;
                mr2 mr2Var = this.b;
                switch (b3) {
                    case 0:
                        if (!z) {
                            fr frVarC = ic4.C(mr2Var.H0());
                            if (frVarC != null && frVarC.b >= 0 && (i = frVarC.c) >= 1 && i <= 12) {
                                if (!mr2Var.J0()) {
                                    mr2Var.L0(null);
                                    break;
                                } else {
                                    mr2Var.L0(mr2Var.requireContext().getString(2132020374));
                                    break;
                                }
                            } else {
                                mr2Var.L0(mr2Var.requireContext().getString(2132020372));
                                break;
                            }
                        } else {
                            mr2Var.L0(null);
                            break;
                        }
                        break;
                    default:
                        if (!z) {
                            String strG0 = mr2Var.G0();
                            mr2Var.s.getClass();
                            boolean zMSg1Yo08 = N.MSg1Yo08(strG0);
                            cr2 cr2Var8 = mr2Var.u;
                            if (!zMSg1Yo08) {
                                (cr2Var8 != null ? cr2Var8 : null).n.p(mr2Var.requireContext().getString(2132017760));
                                break;
                            } else {
                                if (cr2Var8 == null) {
                                    cr2Var8 = null;
                                }
                                cr2Var8.n.p((CharSequence) null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        cr2 cr2Var8 = this.u;
        if (cr2Var8 == null) {
            cr2Var8 = null;
        }
        final byte b3 = 1;
        ((OperaTextInputEditText) cr2Var8.k).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: er2
            public final /* synthetic */ mr2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                int i;
                byte b32 = b3;
                mr2 mr2Var = this.b;
                switch (b32) {
                    case 0:
                        if (!z) {
                            fr frVarC = ic4.C(mr2Var.H0());
                            if (frVarC != null && frVarC.b >= 0 && (i = frVarC.c) >= 1 && i <= 12) {
                                if (!mr2Var.J0()) {
                                    mr2Var.L0(null);
                                    break;
                                } else {
                                    mr2Var.L0(mr2Var.requireContext().getString(2132020374));
                                    break;
                                }
                            } else {
                                mr2Var.L0(mr2Var.requireContext().getString(2132020372));
                                break;
                            }
                        } else {
                            mr2Var.L0(null);
                            break;
                        }
                        break;
                    default:
                        if (!z) {
                            String strG0 = mr2Var.G0();
                            mr2Var.s.getClass();
                            boolean zMSg1Yo08 = N.MSg1Yo08(strG0);
                            cr2 cr2Var82 = mr2Var.u;
                            if (!zMSg1Yo08) {
                                (cr2Var82 != null ? cr2Var82 : null).n.p(mr2Var.requireContext().getString(2132017760));
                                break;
                            } else {
                                if (cr2Var82 == null) {
                                    cr2Var82 = null;
                                }
                                cr2Var82.n.p((CharSequence) null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        cr2 cr2Var9 = this.u;
        if (cr2Var9 == null) {
            cr2Var9 = null;
        }
        ((OperaTextInputEditText) cr2Var9.j).addTextChangedListener(new jr2(this, (byte) 1));
        cr2 cr2Var10 = this.u;
        if (cr2Var10 == null) {
            cr2Var10 = null;
        }
        View view2 = ((hi4) cr2Var10.h).b;
        this.x = I0();
        fr2 fr2Var = new fr2(this, requireContext());
        this.y = fr2Var;
        ro9 ro9Var = this.w;
        if (ro9Var == null) {
            ro9Var = null;
        }
        ((AutoCompleteTextView) ro9Var.d).setAdapter(fr2Var);
        u7 u7Var = new u7(this, (byte) 12);
        q9n.e(view2, u7Var);
        u7Var.a(view2);
        cr2 cr2Var11 = this.u;
        TextInputLayout textInputLayout2 = (cr2Var11 != null ? cr2Var11 : null).n;
        textInputLayout2.t(((Object) (cr2Var11 != null ? cr2Var11 : null).n.i()) + "*");
        M0();
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.v = pq3VarB;
        pq3VarB.d.setText(2132020969);
        pq3 pq3Var = this.v;
        if (pq3Var == null) {
            pq3Var = null;
        }
        final byte b = 0;
        pq3Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: dr2
            public final /* synthetic */ mr2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r14) throws java.lang.NumberFormatException {
                /*
                    Method dump skipped, instructions count: 384
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dr2.onClick(android.view.View):void");
            }
        });
        pq3 pq3Var2 = this.v;
        if (pq3Var2 == null) {
            pq3Var2 = null;
        }
        pq3Var2.c.setText(2132018111);
        pq3 pq3Var3 = this.v;
        final byte b2 = 1;
        (pq3Var3 != null ? pq3Var3 : null).c.setOnClickListener(new View.OnClickListener(this) { // from class: dr2
            public final /* synthetic */ mr2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View v) throws NumberFormatException {
                /*
                    Method dump skipped, instructions count: 384
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dr2.onClick(android.view.View):void");
            }
        });
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558521, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362137;
        View viewJ = w1h.j(2131362137, viewInflate);
        if (viewJ != null) {
            hi4 hi4VarB = hi4.b(viewJ);
            LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) viewInflate;
            i = 2131362485;
            OperaTextInputEditText operaTextInputEditText = (OperaTextInputEditText) w1h.j(2131362485, viewInflate);
            if (operaTextInputEditText != null) {
                i = 2131362486;
                if (((StylingTextView) w1h.j(2131362486, viewInflate)) != null) {
                    i = 2131362487;
                    TextInputLayout textInputLayoutJ = w1h.j(2131362487, viewInflate);
                    if (textInputLayoutJ != null) {
                        i = 2131362823;
                        OperaTextInputEditText operaTextInputEditText2 = (OperaTextInputEditText) w1h.j(2131362823, viewInflate);
                        if (operaTextInputEditText2 != null) {
                            i = 2131362824;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362824, viewInflate);
                            if (stylingTextView != null) {
                                i = 2131362825;
                                TextInputLayout textInputLayoutJ2 = w1h.j(2131362825, viewInflate);
                                if (textInputLayoutJ2 != null) {
                                    i = 2131362869;
                                    OperaTextInputEditText operaTextInputEditText3 = (OperaTextInputEditText) w1h.j(2131362869, viewInflate);
                                    if (operaTextInputEditText3 != null) {
                                        i = 2131363644;
                                        TextInputLayout textInputLayoutJ3 = w1h.j(2131363644, viewInflate);
                                        if (textInputLayoutJ3 != null) {
                                            i = 2131363690;
                                            OperaTextInputEditText operaTextInputEditText4 = (OperaTextInputEditText) w1h.j(2131363690, viewInflate);
                                            if (operaTextInputEditText4 != null) {
                                                i = 2131363691;
                                                TextInputLayout textInputLayoutJ4 = w1h.j(2131363691, viewInflate);
                                                if (textInputLayoutJ4 != null) {
                                                    i = 2131363711;
                                                    OperaTextInputEditText operaTextInputEditText5 = (OperaTextInputEditText) w1h.j(2131363711, viewInflate);
                                                    if (operaTextInputEditText5 != null) {
                                                        i = 2131363712;
                                                        TextInputLayout textInputLayoutJ5 = w1h.j(2131363712, viewInflate);
                                                        if (textInputLayoutJ5 != null) {
                                                            i = 2131364053;
                                                            if (((StylingTextView) w1h.j(2131364053, viewInflate)) != null) {
                                                                i = 2131364612;
                                                                LayoutDirectionLinearLayout layoutDirectionLinearLayout2 = (LayoutDirectionLinearLayout) w1h.j(2131364612, viewInflate);
                                                                if (layoutDirectionLinearLayout2 != null) {
                                                                    i = 2131364613;
                                                                    StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131364613, viewInflate);
                                                                    if (stylingTextView2 != null) {
                                                                        i = 2131364614;
                                                                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) w1h.j(2131364614, viewInflate);
                                                                        if (horizontalScrollView != null) {
                                                                            this.u = new cr2(layoutDirectionLinearLayout, hi4VarB, operaTextInputEditText, textInputLayoutJ, operaTextInputEditText2, stylingTextView, textInputLayoutJ2, operaTextInputEditText3, textInputLayoutJ3, operaTextInputEditText4, textInputLayoutJ4, operaTextInputEditText5, textInputLayoutJ5, layoutDirectionLinearLayout2, stylingTextView2, horizontalScrollView);
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.ltl
    public final boolean w0() {
        return !N.MphJ2uhp();
    }
}
