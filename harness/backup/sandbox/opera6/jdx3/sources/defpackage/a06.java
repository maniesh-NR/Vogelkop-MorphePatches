package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public class a06 extends ltl {
    public vs r;
    public pq3 s;
    public boolean t;
    public Runnable u;

    /* JADX WARN: Illegal instructions before constructor call */
    public a06() {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132018404);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.k = 1;
        super(itlVar);
    }

    public final void G0(int i) {
        if (i < 5) {
            Context contextRequireContext = requireContext();
            String[] strArr = OperaApplication.K;
            ((OperaApplication) contextRequireContext.getApplicationContext()).N().getClass();
            if (!zwk.h()) {
                vml.d(new br((Object) this, i, (byte) 8), 100L);
                return;
            }
        }
        if (this.t) {
            return;
        }
        this.t = true;
        if (isResumed()) {
            g0();
        }
    }

    public final boolean H0(boolean z) {
        String string = ((OperaTextInputEditText) this.r.e).getText().toString();
        String string2 = ((OperaTextInputEditText) this.r.c).getText().toString();
        if (string.isEmpty() || string2.isEmpty()) {
            ((TextInputLayout) this.r.d).p((CharSequence) null);
            return false;
        }
        boolean zEquals = string.equals(string2);
        vs vsVar = this.r;
        if (zEquals) {
            ((TextInputLayout) vsVar.d).p((CharSequence) null);
            return true;
        }
        TextInputLayout textInputLayout = (TextInputLayout) vsVar.d;
        int i = z ? 0 : 2132019327;
        textInputLayout.p(i != 0 ? getString(i) : null);
        return false;
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.u;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        if (this.t) {
            this.t = false;
            vml.c(new lb4(this, (byte) 27));
        }
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s.d.setEnabled(H0(true));
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.s = pq3VarB;
        pq3VarB.d.setText(getString(2132020969));
        final byte b = 0;
        this.s.d.setOnClickListener(new View.OnClickListener(this) { // from class: xz5
            public final /* synthetic */ a06 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                a06 a06Var = this.b;
                boolean z = false;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                switch (b2) {
                    case 0:
                        if (!a06Var.H0(false)) {
                            a06Var.s.d.setEnabled(false);
                            break;
                        } else {
                            Context contextRequireContext = a06Var.requireContext();
                            String[] strArr = OperaApplication.K;
                            zwk zwkVarN = ((OperaApplication) contextRequireContext.getApplicationContext()).N();
                            String string = ((OperaTextInputEditText) a06Var.r.e).getText().toString();
                            zwkVarN.getClass();
                            avj avjVar = cak.d;
                            if (!(!avj.b(1) ? false : N.MOhWZGtg(string))) {
                                z77 z77VarU = sfe.U(a06Var.getContext());
                                yz5 yz5Var = new yz5(z, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
                                z77VarU.getClass();
                                z77VarU.b(yz5Var, ijm.b);
                                a06Var.g0();
                                break;
                            } else {
                                a06Var.G0(0);
                                break;
                            }
                        }
                    default:
                        a06Var.l0(false);
                        break;
                }
            }
        });
        this.s.c.setText(getString(2132018111));
        final byte b2 = 1;
        this.s.c.setOnClickListener(new View.OnClickListener(this) { // from class: xz5
            public final /* synthetic */ a06 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                a06 a06Var = this.b;
                boolean z = false;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                switch (b22) {
                    case 0:
                        if (!a06Var.H0(false)) {
                            a06Var.s.d.setEnabled(false);
                            break;
                        } else {
                            Context contextRequireContext = a06Var.requireContext();
                            String[] strArr = OperaApplication.K;
                            zwk zwkVarN = ((OperaApplication) contextRequireContext.getApplicationContext()).N();
                            String string = ((OperaTextInputEditText) a06Var.r.e).getText().toString();
                            zwkVarN.getClass();
                            avj avjVar = cak.d;
                            if (!(!avj.b(1) ? false : N.MOhWZGtg(string))) {
                                z77 z77VarU = sfe.U(a06Var.getContext());
                                yz5 yz5Var = new yz5(z, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
                                z77VarU.getClass();
                                z77VarU.b(yz5Var, ijm.b);
                                a06Var.g0();
                                break;
                            } else {
                                a06Var.G0(0);
                                break;
                            }
                        }
                    default:
                        a06Var.l0(false);
                        break;
                }
            }
        });
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558624, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362396;
        TextInputEditText textInputEditText = (OperaTextInputEditText) w1h.j(2131362396, viewInflate);
        if (textInputEditText != null) {
            i = 2131362397;
            TextInputLayout textInputLayoutJ = w1h.j(2131362397, viewInflate);
            if (textInputLayoutJ != null) {
                i = 2131362722;
                OperaTextInputEditText operaTextInputEditText = (OperaTextInputEditText) w1h.j(2131362722, viewInflate);
                if (operaTextInputEditText != null) {
                    i = 2131362723;
                    if (w1h.j(2131362723, viewInflate) != null) {
                        i = 2131363207;
                        if (((StylingTextView) w1h.j(2131363207, viewInflate)) != null) {
                            i = 2131363208;
                            if (((StylingTextView) w1h.j(2131363208, viewInflate)) != null) {
                                i = 2131363209;
                                if (((StylingTextView) w1h.j(2131363209, viewInflate)) != null) {
                                    i = 2131363210;
                                    if (((StylingImageView) w1h.j(2131363210, viewInflate)) != null) {
                                        i = 2131363213;
                                        if (((StylingTextView) w1h.j(2131363213, viewInflate)) != null) {
                                            i = 2131363214;
                                            if (((StylingTextView) w1h.j(2131363214, viewInflate)) != null) {
                                                i = 2131363215;
                                                if (((StylingTextView) w1h.j(2131363215, viewInflate)) != null) {
                                                    this.r = new vs((ViewGroup) viewInflate, (View) textInputEditText, (Object) textInputLayoutJ, (Object) operaTextInputEditText, (byte) 8);
                                                    zz5 zz5Var = new zz5(this);
                                                    textInputEditText.setOnFocusChangeListener(zz5Var);
                                                    ((OperaTextInputEditText) this.r.c).setOnEditorActionListener(zz5Var);
                                                    ((OperaTextInputEditText) this.r.c).addTextChangedListener(zz5Var);
                                                    ((OperaTextInputEditText) this.r.e).addTextChangedListener(zz5Var);
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
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
