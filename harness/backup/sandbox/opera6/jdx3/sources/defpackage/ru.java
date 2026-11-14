package defpackage;

import J.N;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ru extends h53 {
    public static final /* synthetic */ xtb[] D = {new d6h(ru.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentPasswordAddBinding;", 0), new d6h(ru.class, "adapter", "getAdapter()Lcom/opera/android/autofill/passwords/add/InstalledAppsAdapter;", 0)};
    public int A;
    public int B;
    public boolean C;
    public final orm t;
    public final ulp u;
    public final ua7 v;
    public final ktl w;
    public final zyk x;
    public final jp3 y;
    public pu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ru(gjm gjmVar, orm ormVar) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132021107);
        super((itl) u7kVarF.a, true);
        this.t = ormVar;
        this.u = ulp.b;
        this.v = new ua7((Fragment) this, gjmVar);
        this.w = F0(new mc8((byte) 27));
        this.x = z4c.b(new t2(this, (byte) 5));
        this.y = new jp3(new pa(this, (byte) 2));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.u;
    }

    public final tab H0() {
        return (tab) this.y.a(this, D[1]);
    }

    public final hm9 I0() {
        xtb xtbVar = D[0];
        a5n a5nVar = this.w.b;
        Objects.requireNonNull(a5nVar);
        return (hm9) a5nVar;
    }

    public final xu J0() {
        return (xu) this.x.getValue();
    }

    public final void K0(vb0 vb0Var) {
        x5f x5fVar = (x5f) this.t;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            y50 y50Var = new y50(2443, -1, 1);
            y50Var.q(0, 1, vb0Var);
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(46);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 46, am2.q(xb0VarX, 46, 1)) : new hf0(xb0VarX, 46, list)).add(y50Var);
            x5fVar.U0(x56VarF);
        }
    }

    public final void L0() {
        Editable text = I0().f.getText();
        if (text == null || text.length() == 0) {
            I0().e.setImageResource(2131232056);
        } else {
            I0().e.setImageResource(2131232212);
        }
    }

    public final void M0(boolean z) {
        zt1 zt1Var;
        String name;
        if (z) {
            TextInputLayout textInputLayout = I0().g;
            wu wuVar = (wu) J0().e.g();
            String string = null;
            if (wuVar != null && (zt1Var = wuVar.a) != null && (name = zt1Var.getName()) != null) {
                if (name.length() <= 0) {
                    name = null;
                }
                if (name != null) {
                    string = getString(2132018744, new Object[]{name});
                }
            }
            textInputLayout.p(string);
        } else if (I0().g.k.q) {
            I0().g.q(false);
        }
        N0();
    }

    public final void N0() {
        Editable text;
        MaterialButton materialButton = I0().h;
        wu wuVar = (wu) J0().e.g();
        materialButton.setEnabled(((wuVar != null ? wuVar.a : null) == null || (text = I0().f.getText()) == null || text.length() == 0) ? false : true);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        super.l0(z);
        K0(vb0.d);
    }

    @Override // defpackage.h53, defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A = fan.a(24.0f, requireContext().getResources());
        this.B = fan.a(40.0f, requireContext().getResources());
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        xf8.i0(J0().d, getViewLifecycleOwner(), I0().a, (List) null, new k9((Object) this, (byte) 3));
        xf8.i0(J0().e, getViewLifecycleOwner(), I0().a, (List) null, new pb(this, (byte) 7));
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        TextInputLayout textInputLayout = I0().c;
        textInputLayout.t(((Object) textInputLayout.i()) + "*");
        MaterialAutoCompleteTextView materialAutoCompleteTextView = I0().b;
        final byte b = 0;
        materialAutoCompleteTextView.setThreshold(0);
        materialAutoCompleteTextView.setAdapter(H0());
        materialAutoCompleteTextView.setOnClickListener(new gf((Object) materialAutoCompleteTextView, (byte) 8));
        materialAutoCompleteTextView.setOnFocusChangeListener(new nu((byte) 0));
        materialAutoCompleteTextView.setOnItemClickListener(new ou(this, (byte) 0));
        pu puVar = new pu(this, materialAutoCompleteTextView, (byte) 0);
        materialAutoCompleteTextView.addTextChangedListener(puVar);
        this.z = puVar;
        MaterialAutoCompleteTextView materialAutoCompleteTextView2 = I0().b;
        final byte b2 = 1;
        r8n r8nVar = new r8n(this) { // from class: mu
            public final /* synthetic */ ru b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view) {
                byte b3 = b2;
                ru ruVar = this.b;
                switch (b3) {
                    case 0:
                        ruVar.L0();
                        break;
                    default:
                        tab tabVarH0 = ruVar.H0();
                        tabVarH0.c.clear();
                        tabVarH0.notifyDataSetChanged();
                        break;
                }
            }
        };
        dll dllVarS = q9n.s(materialAutoCompleteTextView2);
        if (dllVarS != null) {
            u8n.b(dllVarS, materialAutoCompleteTextView2, r8nVar);
        }
        I0().i.addTextChangedListener(new qu(this, (byte) 1));
        TextInputEditText textInputEditText = I0().f;
        textInputEditText.setPaddingRelative(textInputEditText.getPaddingStart(), textInputEditText.getPaddingTop(), textInputEditText.getPaddingEnd() + this.B, textInputEditText.getPaddingBottom());
        I0().f.addTextChangedListener(new qu(this, (byte) 0));
        CheckableImageButton checkableImageButtonFindViewById = I0().g.findViewById(2131364720);
        if (checkableImageButtonFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = checkableImageButtonFindViewById.getLayoutParams();
            if (layoutParams == null) {
                t3p.q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + this.B);
                checkableImageButtonFindViewById.setLayoutParams(marginLayoutParams);
            }
        }
        M0(false);
        if (((ku) this.v.p()).b) {
            TextInputEditText textInputEditText2 = I0().f;
            J0().getClass();
            textInputEditText2.setText(fsp.v());
        }
        final byte b3 = 2;
        I0().e.setOnClickListener(new View.OnClickListener(this) { // from class: lu
            public final /* synthetic */ ru b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zt1 zt1Var;
                byte b4 = b3;
                ru ruVar = this.b;
                switch (b4) {
                    case 0:
                        ruVar.g0();
                        ruVar.K0(vb0.c);
                        break;
                    case 1:
                        xu xuVarJ0 = ruVar.J0();
                        Editable text = ruVar.I0().i.getText();
                        String string = text != null ? text.toString() : null;
                        String str = string == null ? "" : string;
                        Editable text2 = ruVar.I0().f.getText();
                        String string2 = text2 != null ? text2.toString() : null;
                        String str2 = string2 == null ? "" : string2;
                        q3 q3Var = new q3(view, ruVar, (byte) 4);
                        wu wuVar = (wu) xuVarJ0.e.g();
                        if (wuVar != null && (zt1Var = wuVar.a) != null) {
                            N.MLjUywYX(zt1Var.o(), zt1Var.o(), str, str2, true, new o8f(new su(xuVarJ0, q3Var, zt1Var, str), (byte) 10));
                        }
                        ruVar.K0(vb0.b);
                        break;
                    default:
                        TextInputEditText textInputEditText3 = ruVar.I0().f;
                        ruVar.J0().getClass();
                        textInputEditText3.setText(fsp.v());
                        TextInputEditText textInputEditText4 = ruVar.I0().f;
                        Editable text3 = ruVar.I0().f.getText();
                        textInputEditText4.setSelection(text3 != null ? text3.length() : 0);
                        break;
                }
            }
        });
        AppCompatImageView appCompatImageView = I0().e;
        r8n r8nVar2 = new r8n(this) { // from class: mu
            public final /* synthetic */ ru b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view) {
                byte b32 = b;
                ru ruVar = this.b;
                switch (b32) {
                    case 0:
                        ruVar.L0();
                        break;
                    default:
                        tab tabVarH0 = ruVar.H0();
                        tabVarH0.c.clear();
                        tabVarH0.notifyDataSetChanged();
                        break;
                }
            }
        };
        dll dllVarS2 = q9n.s(appCompatImageView);
        if (dllVarS2 != null) {
            u8n.b(dllVarS2, appCompatImageView, r8nVar2);
        }
        I0().h.setOnClickListener(new View.OnClickListener(this) { // from class: lu
            public final /* synthetic */ ru b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zt1 zt1Var;
                byte b4 = b2;
                ru ruVar = this.b;
                switch (b4) {
                    case 0:
                        ruVar.g0();
                        ruVar.K0(vb0.c);
                        break;
                    case 1:
                        xu xuVarJ0 = ruVar.J0();
                        Editable text = ruVar.I0().i.getText();
                        String string = text != null ? text.toString() : null;
                        String str = string == null ? "" : string;
                        Editable text2 = ruVar.I0().f.getText();
                        String string2 = text2 != null ? text2.toString() : null;
                        String str2 = string2 == null ? "" : string2;
                        q3 q3Var = new q3(view, ruVar, (byte) 4);
                        wu wuVar = (wu) xuVarJ0.e.g();
                        if (wuVar != null && (zt1Var = wuVar.a) != null) {
                            N.MLjUywYX(zt1Var.o(), zt1Var.o(), str, str2, true, new o8f(new su(xuVarJ0, q3Var, zt1Var, str), (byte) 10));
                        }
                        ruVar.K0(vb0.b);
                        break;
                    default:
                        TextInputEditText textInputEditText3 = ruVar.I0().f;
                        ruVar.J0().getClass();
                        textInputEditText3.setText(fsp.v());
                        TextInputEditText textInputEditText4 = ruVar.I0().f;
                        Editable text3 = ruVar.I0().f.getText();
                        textInputEditText4.setSelection(text3 != null ? text3.length() : 0);
                        break;
                }
            }
        });
        N0();
        I0().d.setOnClickListener(new View.OnClickListener(this) { // from class: lu
            public final /* synthetic */ ru b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zt1 zt1Var;
                byte b4 = b;
                ru ruVar = this.b;
                switch (b4) {
                    case 0:
                        ruVar.g0();
                        ruVar.K0(vb0.c);
                        break;
                    case 1:
                        xu xuVarJ0 = ruVar.J0();
                        Editable text = ruVar.I0().i.getText();
                        String string = text != null ? text.toString() : null;
                        String str = string == null ? "" : string;
                        Editable text2 = ruVar.I0().f.getText();
                        String string2 = text2 != null ? text2.toString() : null;
                        String str2 = string2 == null ? "" : string2;
                        q3 q3Var = new q3(view, ruVar, (byte) 4);
                        wu wuVar = (wu) xuVarJ0.e.g();
                        if (wuVar != null && (zt1Var = wuVar.a) != null) {
                            N.MLjUywYX(zt1Var.o(), zt1Var.o(), str, str2, true, new o8f(new su(xuVarJ0, q3Var, zt1Var, str), (byte) 10));
                        }
                        ruVar.K0(vb0.b);
                        break;
                    default:
                        TextInputEditText textInputEditText3 = ruVar.I0().f;
                        ruVar.J0().getClass();
                        textInputEditText3.setText(fsp.v());
                        TextInputEditText textInputEditText4 = ruVar.I0().f;
                        Editable text3 = ruVar.I0().f.getText();
                        textInputEditText4.setSelection(text3 != null ? text3.length() : 0);
                        break;
                }
            }
        });
    }
}
