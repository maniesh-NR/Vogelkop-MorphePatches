package defpackage;

import J.N;
import android.animation.LayoutTransition;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.OperaRadioGroup;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class awi extends e93 implements o37 {
    public static final SparseArray y;
    public final vzk r;
    public final ysj s;
    public final ua7 t;
    public ei u;
    public lh4 v;
    public String w;
    public boolean x;

    static {
        SparseArray sparseArray = new SparseArray();
        for (l7j l7jVar : l7j.values()) {
            int iOrdinal = l7jVar.ordinal();
            if (iOrdinal == 0) {
                sparseArray.put(2131362554, l7jVar);
            } else if (iOrdinal == 1) {
                sparseArray.put(2131362550, l7jVar);
            } else if (iOrdinal == 2) {
                sparseArray.put(2131362555, l7jVar);
            } else if (iOrdinal == 3) {
                sparseArray.put(2131362551, l7jVar);
            }
        }
        y = sparseArray;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public awi(gjm gjmVar, ydn ydnVar, wc7 wc7Var, ysj ysjVar) {
        u7k u7kVarF = u7k.f(4);
        u7kVarF.s(2132021010);
        super((itl) u7kVarF.a);
        vzk vzkVar = new vzk();
        vzkVar.c = new dzg(vzkVar, (byte) 1);
        vzkVar.d = new ode();
        vzkVar.a = ydnVar;
        vzkVar.b = wc7Var;
        vzkVar.h0();
        this.r = vzkVar;
        this.s = ysjVar;
        this.t = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.e93
    public final int G0() {
        return -1;
    }

    @Override // defpackage.e93
    public final void H0(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559288, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i2 = 2131362550;
        if (((OperaListItem) w1h.j(2131362550, viewInflate)) != null) {
            i2 = 2131362551;
            ConstraintLayout constraintLayout = (OperaListItem) w1h.j(2131362551, viewInflate);
            if (constraintLayout != null) {
                i2 = 2131362552;
                TextInputEditText textInputEditText = (OperaTextInputEditText) w1h.j(2131362552, viewInflate);
                if (textInputEditText != null) {
                    i2 = 2131362553;
                    TextInputLayout textInputLayoutJ = w1h.j(2131362553, viewInflate);
                    if (textInputLayoutJ != null) {
                        i2 = 2131362554;
                        if (((OperaListItem) w1h.j(2131362554, viewInflate)) != null) {
                            i2 = 2131362555;
                            if (((OperaListItem) w1h.j(2131362555, viewInflate)) != null) {
                                i2 = 2131362556;
                                OperaRadioGroup operaRadioGroup = (OperaRadioGroup) w1h.j(2131362556, viewInflate);
                                if (operaRadioGroup != null) {
                                    i2 = 2131362557;
                                    if (((SeparatorView) w1h.j(2131362557, viewInflate)) != null) {
                                        i2 = 2131363216;
                                        yq1 yq1Var = (StylingTextView) w1h.j(2131363216, viewInflate);
                                        if (yq1Var != null) {
                                            i2 = 2131363217;
                                            OperaIconedMessage operaIconedMessage = (OperaIconedMessage) w1h.j(2131363217, viewInflate);
                                            if (operaIconedMessage != null) {
                                                i2 = 2131364972;
                                                ConstraintLayout constraintLayout2 = (OperaListItem) w1h.j(2131364972, viewInflate);
                                                if (constraintLayout2 != null) {
                                                    this.u = new ei((ViewGroup) viewInflate, (View) constraintLayout, (View) textInputEditText, (View) textInputLayoutJ, (View) operaRadioGroup, (View) yq1Var, (View) operaIconedMessage, (View) constraintLayout2, (byte) 10);
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
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public final void I0(CharSequence charSequence) {
        if (this.u == null || TextUtils.equals(charSequence, this.w)) {
            return;
        }
        this.w = aik.c(charSequence);
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        vzk vzkVar = this.r;
        if (zIsEmpty) {
            K0();
        } else {
            String string = charSequence.toString();
            ((wc7) vzkVar.b).getClass();
            if (N.MLC1dld3(string)) {
                K0();
                String string2 = charSequence.toString();
                lh4 lh4Var = this.v;
                if (lh4Var != null) {
                    lh4Var.b = null;
                }
                lh4 lh4Var2 = new lh4(new eof((Object) this, (Object) string2, (byte) 16), (byte) 0);
                this.v = lh4Var2;
                ((wc7) vzkVar.b).getClass();
                N.MkRRLkEl(string2, lh4Var2);
            } else {
                String string3 = getString(2132018844);
                this.u.e.c.h(0);
                z28 z28Var = this.u.e.c;
                TextInputLayout textInputLayout = z28Var.a;
                z28Var.f.setImageDrawable((Drawable) null);
                this.u.e.p(string3);
            }
        }
        ((wc7) vzkVar.b).a.Y("dns_over_https_custom_server_template", charSequence.toString());
        J0();
    }

    public final void J0() {
        ei eiVar = this.u;
        this.x = ((OperaRadioGroup) eiVar.f).a == ((OperaListItem) eiVar.c).getId() && this.u.e.k.q;
    }

    public final void K0() {
        this.u.e.q(false);
        this.u.e.c.h(0);
        z28 z28Var = this.u.e.c;
        TextInputLayout textInputLayout = z28Var.a;
        z28Var.f.setImageDrawable((Drawable) null);
        this.u.e.r(getString(2132018845, new Object[]{"https://opera.cloudflare-dns.com/dns-query"}));
    }

    public final void L0(bwi bwiVar) {
        if (bwiVar == null) {
            return;
        }
        String string = bwiVar.b ? getString(2132022254) : getString(2132022280);
        ((OperaIconedMessage) this.u.h).a(getString(2132021013, new Object[]{string, string}));
        OperaIconedMessage operaIconedMessage = (OperaIconedMessage) this.u.h;
        xkf xkfVar = bwiVar.a ? xkf.WARNING : xkf.INFO;
        j06 j06Var = xkf.b;
        TypedArray typedArrayObtainStyledAttributes = operaIconedMessage.getContext().obtainStyledAttributes(xkfVar.a, xkf.c);
        j06Var.getClass();
        j06.h(operaIconedMessage, typedArrayObtainStyledAttributes);
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        if (this.x) {
            w0a w0aVar = new w0a((byte) 4);
            ysj ysjVar = this.s;
            ysjVar.getClass();
            ysjVar.b(w0aVar, ijm.b);
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        lh4 lh4Var = this.v;
        if (lh4Var != null) {
            lh4Var.b = null;
        }
        vzk vzkVar = this.r;
        wc7 wc7Var = (wc7) vzkVar.b;
        wc7Var.c.c((dzg) vzkVar.c);
        this.u = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LayoutTransition layoutTransition = ((LinearLayout) this.u.b).getLayoutTransition();
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        LayoutTransition layoutTransition2 = ((OperaRadioGroup) this.u.f).getLayoutTransition();
        layoutTransition2.disableTransitionType(2);
        layoutTransition2.disableTransitionType(3);
        phj.u0((StylingTextView) this.u.g, n1h.d(getString(2132021884), new owj[]{new owj("<terms>", "</terms>", new jng(3, ((StylingTextView) this.u.g).getContext(), null)), new owj("<privacy>", "</privacy>", new jng(2, ((StylingTextView) this.u.g).getContext(), null))}));
        ei eiVar = this.u;
        ((OperaListItem) eiVar.i).u = new yvi(this);
        ((OperaRadioGroup) eiVar.f).c = new yvi(this);
        ((OperaTextInputEditText) eiVar.d).setOnFocusChangeListener(new zp2(this, (byte) 6));
        ((OperaTextInputEditText) this.u.d).setOnEditorActionListener(new ys7(this, (byte) 2));
        ((OperaTextInputEditText) this.u.d).addTextChangedListener(new zvi(this));
        vzk vzkVar = this.r;
        ((ode) vzkVar.d).j(getViewLifecycleOwner(), new qzg(this, (byte) 7));
        wc7 wc7Var = (wc7) vzkVar.b;
        wc7Var.c.b((dzg) vzkVar.c);
        OperaIconedMessage operaIconedMessage = (OperaIconedMessage) this.u.h;
        kkf kkfVar = new kkf(this, (byte) 15);
        dll dllVarS = q9n.s(operaIconedMessage);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, operaIconedMessage, kkfVar);
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
