package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ss7 extends lj {
    public i53 A;
    public ml3 B;
    public qm3 C;
    public final dl3 r;
    public final mj2 s;
    public cr2 t;
    public pq3 u;
    public al3 v;
    public w80 w;
    public ole x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ss7(int i, int i2) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(i);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = i2;
        itlVar.k = 1;
        itlVar.d = true;
        super(itlVar);
        this.r = new dl3(this, (byte) 3);
        this.s = new mj2(this, (byte) 6);
        this.C = qm3.b;
    }

    public static void L0(al3 al3Var, ml3 ml3Var, ss7 ss7Var, w80 w80Var, ole oleVar) {
        Bundle bundle = new Bundle();
        if (al3Var != null) {
            if (al3Var.getId() == -1) {
                bundle.putParcelable("bookmark", jkj.j(al3Var));
            } else {
                bundle.putLong("bookmark-id", al3Var.getId());
            }
        }
        if (ml3Var != null) {
            bundle.putLong("bookmark-parent", ml3Var.getId());
        }
        bundle.putBoolean("show-snackbar", false);
        bundle.putInt("dialog-source", w80Var.a);
        ss7Var.setArguments(bundle);
        ss7Var.x = oleVar;
    }

    public al3 G0(al3 al3Var, String str) {
        return lkj.k(-1L, str, ((OperaTextInputEditText) this.t.f).getText().toString());
    }

    public x80 H0() {
        return x80.c;
    }

    public final boolean I0(CharSequence charSequence) {
        if (this.B == null) {
            return false;
        }
        String strTrim = charSequence != null ? charSequence.toString().trim() : "";
        if (strTrim.isEmpty()) {
            return false;
        }
        al3 al3Var = this.v;
        long id = (al3Var == null || !al3Var.g()) ? -1L : this.v.getId();
        for (al3 al3Var2 : this.B.i()) {
            if (al3Var2.g() && al3Var2.getId() != id) {
                String title = al3Var2.getTitle();
                if (strTrim.equals(title != null ? title.trim() : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean J0() {
        return !TextUtils.isEmpty(((OperaTextInputEditText) this.t.f).getText().toString());
    }

    public void K0() {
        this.u.d.setEnabled(J0());
    }

    public final void M0(vb0 vb0Var) {
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        w80 w80Var = this.w;
        x80 x80VarH0 = H0();
        boolean z = this.z;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(zpaVar);
            v80 v80Var = new v80(2443, -1, 4);
            v80Var.r(3, 1, z);
            v80Var.q(0, 1, vb0Var);
            v80Var.q(1, w80Var != null ? 1 : 0, w80Var);
            v80Var.q(2, 1, x80VarH0);
            List list = (List) qd0VarB.n(36);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 36, vep.t(qd0VarB, 36, 1)) : new hf0(qd0VarB, 36, list)).add(v80Var);
            x5fVar.U0(x56VarF);
        }
    }

    public final void N0() {
        ((OperaTextInputEditText) this.t.d).requestFocus();
        TextInputEditText textInputEditText = (OperaTextInputEditText) this.t.d;
        textInputEditText.setSelection(aik.c(textInputEditText.getText()).length());
        vml.c(new bn7(this, (byte) 4));
    }

    public final void O0() {
        ml3 ml3Var = this.B;
        if (ml3Var == null || ml3Var.b() == null) {
            ((StylingImageView) this.t.k).setImageDrawable(alo.A(2131232090, requireContext()));
        } else {
            ((StylingImageView) this.t.k).setImageDrawable(alo.z(requireContext(), this.B.b()));
        }
    }

    public final void P0() {
        if (this.t == null || this.u == null) {
            return;
        }
        ml3 ml3Var = this.B;
        if (ml3Var == null || ml3Var.h()) {
            ((StylingTextView) this.t.l).setText(2132018047);
        } else {
            ((StylingTextView) this.t.l).setText(alo.J(this.B, getResources()));
        }
        K0();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (z) {
            M0(vb0.d);
        } else {
            M0(vb0.c);
        }
        super.l0(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    @Override // defpackage.ltl, defpackage.ryl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.content.Context r8 = r7.requireContext()
            java.lang.String[] r0 = com.opera.android.OperaApplication.K
            android.content.Context r8 = r8.getApplicationContext()
            com.opera.android.OperaApplication r8 = (com.opera.android.OperaApplication) r8
            i53 r8 = r8.g()
            r7.A = r8
            android.os.Bundle r8 = r7.getArguments()
            java.lang.String r0 = "bookmark-id"
            r1 = -1
            long r3 = r8.getLong(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L40
            i53 r0 = r7.A
            com.opera.android.bookmarks.h r0 = (com.opera.android.bookmarks.h) r0
            al3 r0 = r0.m(r3, r5)
            r7.v = r0
            if (r0 == 0) goto L55
            i53 r3 = r7.A
            com.opera.android.bookmarks.h r3 = (com.opera.android.bookmarks.h) r3
            com.opera.android.bookmarks.c r3 = r3.o()
            ml3 r0 = r0.a(r3)
            goto L56
        L40:
            java.lang.String r0 = "bookmark-parent"
            long r3 = r8.getLong(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L55
            i53 r0 = r7.A
            com.opera.android.bookmarks.h r0 = (com.opera.android.bookmarks.h) r0
            al3 r0 = r0.m(r3, r5)
            ml3 r0 = (defpackage.ml3) r0
            goto L56
        L55:
            r0 = r6
        L56:
            java.lang.String r3 = "show-snackbar"
            r4 = 0
            boolean r3 = r8.getBoolean(r3, r4)
            r7.y = r3
            java.lang.String r3 = "dialog-source"
            int r8 = r8.getInt(r3)
            if (r8 == 0) goto L76
            if (r8 == r5) goto L73
            r3 = 2
            if (r8 != r3) goto L6f
            w80 r8 = defpackage.w80.d
            goto L78
        L6f:
            hai.d()
            return
        L73:
            w80 r8 = defpackage.w80.c
            goto L78
        L76:
            w80 r8 = defpackage.w80.b
        L78:
            r7.w = r8
            if (r0 != 0) goto L9a
            i53 r8 = r7.A
            com.opera.android.bookmarks.h r8 = (com.opera.android.bookmarks.h) r8
            b59 r0 = r8.j
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "last_folder"
            long r0 = r0.getLong(r3, r1)
            al3 r8 = r8.m(r0, r5)
            boolean r0 = r8 instanceof defpackage.ml3
            if (r0 == 0) goto L99
            r6 = r8
            ml3 r6 = (defpackage.ml3) r6
        L99:
            r0 = r6
        L9a:
            if (r0 != 0) goto La4
            i53 r8 = r7.A
            com.opera.android.bookmarks.h r8 = (com.opera.android.bookmarks.h) r8
            com.opera.android.bookmarks.c r0 = r8.o()
        La4:
            ml3 r8 = r7.B
            if (r8 == r0) goto Lbf
            if (r8 == 0) goto Lac
            r7.z = r5
        Lac:
            r7.B = r0
            i53 r8 = r7.A
            com.opera.android.bookmarks.h r8 = (com.opera.android.bookmarks.h) r8
            com.opera.android.bookmarks.c r8 = r8.o()
            qm3 r8 = defpackage.qm3.a(r0, r8)
            r7.C = r8
            r7.P0()
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss7.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        q9n.v(getActivity().getWindow());
        this.A.f(this.r);
        super.onDestroyView();
        this.t = null;
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ole oleVar;
        if (menuItem.getItemId() == 2131362505 && this.v != null && (oleVar = this.x) != null) {
            this.z = true;
            ul3 ul3Var = (ul3) oleVar.a;
            UndoBar undoBar = ul3Var.i;
            if (undoBar == null) {
                nkm nkmVar = (nkm) ul3Var.d.get();
                rl3 rl3Var = new rl3(((qim) ul3Var.e.get()).e, (byte) 0);
                in3 in3Var = ul3Var.a;
                UndoBar undoBar2 = new UndoBar(nkmVar.a, rl3Var, in3Var, in3Var, true);
                ul3Var.i = undoBar2;
                undoBar = undoBar2;
            }
            if (undoBar.h != 2132018038) {
                undoBar.h = 2132018038;
                undoBar.f();
            }
            Object[] objArr = {this.v};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            undoBar.c(Collections.unmodifiableList(arrayList));
            g0();
        }
        return true;
    }

    @Override // defpackage.k24
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.v == null) {
            N0();
        }
        cr2 cr2Var = this.t;
        cr2Var.e.x0 = true;
        cr2Var.c.x0 = true;
        P0();
        TextInputEditText textInputEditText = (OperaTextInputEditText) this.t.d;
        TextWatcher textWatcher = this.s;
        textInputEditText.addTextChangedListener(textWatcher);
        ((OperaTextInputEditText) this.t.f).addTextChangedListener(textWatcher);
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.u = pq3VarB;
        pq3VarB.d.setText(2132020969);
        this.u.d.setOnClickListener(new rs7(this, (byte) 1));
        this.u.c.setText(2132018111);
        this.u.c.setOnClickListener(new rs7(this, (byte) 2));
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = 0;
        View viewInflate = layoutInflater.inflate(2131558552, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131361934;
        LinearLayout linearLayout = (LinearLayout) w1h.j(2131361934, viewInflate);
        if (linearLayout != null) {
            i = 2131361935;
            ConstraintLayout constraintLayoutJ = w1h.j(2131361935, viewInflate);
            if (constraintLayoutJ != null) {
                i = 2131361936;
                ImageView imageView = (ImageView) w1h.j(2131361936, viewInflate);
                if (imageView != null) {
                    i = 2131361937;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131361937, viewInflate);
                    if (stylingTextView != null) {
                        i = 2131362150;
                        TextInputLayout textInputLayoutJ = w1h.j(2131362150, viewInflate);
                        if (textInputLayoutJ != null) {
                            i = 2131363256;
                            ?? r12 = (StylingImageView) w1h.j(2131363256, viewInflate);
                            if (r12 != 0) {
                                i = 2131363263;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363263, viewInflate);
                                if (stylingTextView2 != null) {
                                    i = 2131363852;
                                    if (((StylingTextView) w1h.j(2131363852, viewInflate)) != null) {
                                        i = 2131364048;
                                        ImageButton imageButton = (ImageButton) w1h.j(2131364048, viewInflate);
                                        if (imageButton != null) {
                                            i = 2131364205;
                                            LayoutDirectionRelativeLayout layoutDirectionRelativeLayout = (LayoutDirectionRelativeLayout) w1h.j(2131364205, viewInflate);
                                            if (layoutDirectionRelativeLayout != null) {
                                                i = 2131363525;
                                                OperaTextInputEditText operaTextInputEditText = (OperaTextInputEditText) w1h.j(2131363525, viewInflate);
                                                if (operaTextInputEditText != null) {
                                                    i = 2131364775;
                                                    TextInputLayout textInputLayoutJ2 = w1h.j(2131364775, viewInflate);
                                                    if (textInputLayoutJ2 != null) {
                                                        i = 2131364964;
                                                        OperaTextInputEditText operaTextInputEditText2 = (OperaTextInputEditText) w1h.j(2131364964, viewInflate);
                                                        if (operaTextInputEditText2 != null) {
                                                            this.t = new cr2((LinearLayout) viewInflate, linearLayout, constraintLayoutJ, imageView, stylingTextView, textInputLayoutJ, (StylingImageView) r12, stylingTextView2, imageButton, layoutDirectionRelativeLayout, operaTextInputEditText, textInputLayoutJ2, operaTextInputEditText2);
                                                            textInputLayoutJ2.x0 = false;
                                                            textInputLayoutJ.x0 = false;
                                                            pc5 pc5Var = new pc5(this, (byte) 5);
                                                            dll dllVarS = q9n.s(r12);
                                                            if (dllVarS != null) {
                                                                u8n.b(dllVarS, r12, pc5Var);
                                                            }
                                                            O0();
                                                            ((LayoutDirectionRelativeLayout) this.t.n).setOnClickListener(new rs7(this, b));
                                                            this.A.a(this.r);
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
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        if (itdVar.findItem(2131362505) != null) {
            itdVar.findItem(2131362505).setVisible(this.x != null);
        }
    }
}
