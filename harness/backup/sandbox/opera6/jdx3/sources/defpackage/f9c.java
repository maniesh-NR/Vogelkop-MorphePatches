package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.CustomCollapsingToolbarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.OperaTextInputEditText;

/* loaded from: classes.dex */
public final class f9c extends ltl {
    public final /* synthetic */ byte r = 0;
    public Object s;
    public Object t;
    public Object u;
    public Object v;

    public f9c(cie cieVar, i16 i16Var) {
        super((itl) u7k.j(2131558724).a);
        this.s = cieVar;
        this.t = i16Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f9c(ilh ilhVar, eof eofVar) {
        u7k u7kVarF = u7k.f(4);
        u7kVarF.s(2132018742);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.k = 1;
        super(itlVar);
        this.u = ilhVar;
        this.v = eofVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f9c(va2 va2Var) {
        u7k u7kVarF = u7k.f(4);
        u7kVarF.s(2132017372);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.k = 1;
        super(itlVar);
        this.u = new mj2(this, (byte) 5);
        this.v = va2Var;
    }

    public final void G0() {
        String strTrim = ((zu) this.s).c.getText().toString().trim();
        boolean z = wqm.q(strTrim) != null;
        ((zu) this.s).d.p((TextUtils.isEmpty(strTrim) || z) ? null : getString(2132019332));
        ((pq3) this.t).d.setEnabled(z);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        switch (this.r) {
            case 0:
                super.l0(z);
                i9c i9cVar = (i9c) this.v;
                if (i9cVar != null) {
                    ((i16) i9cVar.f).x(false, z);
                    break;
                }
                break;
            default:
                super.l0(z);
                break;
        }
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        switch (this.r) {
            case 0:
                super.onAttach(context);
                this.u = new r9i(this, context);
                break;
            default:
                super.onAttach(context);
                break;
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        switch (this.r) {
            case 1:
                q9n.v(getActivity().getWindow());
                super.onDestroyView();
                break;
            case 2:
                q9n.v(getActivity().getWindow());
                super.onDestroyView();
                this.s = null;
                break;
            default:
                super.onDestroyView();
                break;
        }
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.r) {
            case 1:
                String strQ = wqm.q(((zu) this.s).c.getText().toString().trim());
                if (strQ == null) {
                    return true;
                }
                ((m93) ((va2) this.v).b).G0(strQ);
                g0();
                return true;
            default:
                return super.onMenuItemClick(menuItem);
        }
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        switch (this.r) {
            case 0:
                super.onViewCreated(view, bundle);
                ViewGroup viewGroup = (ViewGroup) ((View) m5n.f(view, 2131362885));
                View view2 = (View) m5n.f(view, 2131362895);
                View view3 = (View) m5n.f(view, 2131362899);
                cie cieVar = (cie) this.s;
                this.v = new i9c(viewGroup, cieVar, (i16) this.t);
                view2.setEnabled(false);
                i9c i9cVar = (i9c) this.v;
                byte b = 7;
                y0a y0aVar = new y0a(view2, (byte) 7);
                i9cVar.g = y0aVar;
                if (i9cVar.b) {
                    y0aVar.run(Boolean.TRUE);
                }
                ViewGroup viewGroup2 = (ViewGroup) ((i9c) this.v).e;
                viewGroup2.removeView(view2);
                viewGroup2.addView(view2);
                ViewGroup viewGroup3 = (ViewGroup) ((i9c) this.v).e;
                viewGroup3.removeView(view3);
                viewGroup3.addView(view3);
                view2.setOnClickListener(new sma(this, b));
                ImageView imageView = (ImageView) ((View) m5n.f(view, 2131362888));
                gu8.g0(cieVar.o, imageView, ga6.m(imageView, view));
                CustomCollapsingToolbarLayout customCollapsingToolbarLayout = (CustomCollapsingToolbarLayout) ((View) m5n.f(view, 2131362898));
                AppBarLayout appBarLayout = (View) m5n.f(view, 2131362884);
                ((r9i) this.u).W(true);
                e9c e9cVar = new e9c(this, customCollapsingToolbarLayout);
                customCollapsingToolbarLayout.K = new z0c(this, e9cVar, (byte) 1);
                float f = ((CollapsingToolbarLayout) customCollapsingToolbarLayout).s / 255.0f;
                ((r9i) this.u).W(((double) f) < 0.5d);
                e9cVar.b = f;
                q9n.e(appBarLayout, e9cVar);
                break;
            case 1:
                super.onViewCreated(view, bundle);
                ((zu) this.s).c.requestFocus();
                vml.c(new fv2(this, (byte) 9));
                G0();
                break;
            default:
                super.onViewCreated(view, bundle);
                TextInputEditText textInputEditText = (OperaTextInputEditText) ((or2) this.s).f;
                ilh ilhVar = (ilh) this.u;
                textInputEditText.setText(ilhVar.c);
                ((OperaTextInputEditText) ((or2) this.s).b).setText(ilhVar.b);
                ((OperaTextInputEditText) ((or2) this.s).f).requestFocus();
                vml.c(new pjg(this, (byte) 16));
                or2 or2Var = (or2) this.s;
                ((TextInputLayout) or2Var.d).x0 = true;
                ((TextInputLayout) or2Var.e).x0 = true;
                ((pq3) this.t).d.setEnabled(!((OperaTextInputEditText) or2Var.f).getText().toString().isEmpty());
                break;
        }
    }

    @Override // defpackage.ltl
    public final int s0() {
        switch (this.r) {
            case 1:
                return 2132018253;
            default:
                return super.s0();
        }
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        switch (this.r) {
            case 1:
                return 2131232034;
            default:
                return super.t0(context);
        }
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final byte b = 1;
        final byte b2 = 0;
        switch (this.r) {
            case 1:
                pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
                this.t = pq3VarB;
                pq3VarB.d.setText(2132020969);
                ((pq3) this.t).d.setOnClickListener(new View.OnClickListener(this) { // from class: l93
                    public final /* synthetic */ f9c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        f9c f9cVar = this.b;
                        switch (b3) {
                            case 0:
                                String strQ = wqm.q(((zu) f9cVar.s).c.getText().toString().trim());
                                if (strQ != null) {
                                    ((m93) ((va2) f9cVar.v).b).G0(strQ);
                                    f9cVar.g0();
                                    break;
                                }
                                break;
                            default:
                                f9cVar.g0();
                                break;
                        }
                    }
                });
                ((pq3) this.t).c.setText(2132018111);
                ((pq3) this.t).c.setOnClickListener(new View.OnClickListener(this) { // from class: l93
                    public final /* synthetic */ f9c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        f9c f9cVar = this.b;
                        switch (b3) {
                            case 0:
                                String strQ = wqm.q(((zu) f9cVar.s).c.getText().toString().trim());
                                if (strQ != null) {
                                    ((m93) ((va2) f9cVar.v).b).G0(strQ);
                                    f9cVar.g0();
                                    break;
                                }
                                break;
                            default:
                                f9cVar.g0();
                                break;
                        }
                    }
                });
                break;
            case 2:
                pq3 pq3VarB2 = pq3.b(layoutInflater, viewGroup);
                this.t = pq3VarB2;
                pq3VarB2.d.setText(2132020969);
                ((pq3) this.t).d.setOnClickListener(new View.OnClickListener(this) { // from class: klh
                    public final /* synthetic */ f9c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        f9c f9cVar = this.b;
                        switch (b3) {
                            case 0:
                                String string = ((OperaTextInputEditText) ((or2) f9cVar.s).f).getText().toString();
                                if (!string.equals(((ilh) f9cVar.u).c)) {
                                    ((eof) f9cVar.v).run(string);
                                }
                                f9cVar.g0();
                                break;
                            default:
                                f9cVar.g0();
                                break;
                        }
                    }
                });
                ((pq3) this.t).c.setText(2132018111);
                ((pq3) this.t).c.setOnClickListener(new View.OnClickListener(this) { // from class: klh
                    public final /* synthetic */ f9c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        f9c f9cVar = this.b;
                        switch (b3) {
                            case 0:
                                String string = ((OperaTextInputEditText) ((or2) f9cVar.s).f).getText().toString();
                                if (!string.equals(((ilh) f9cVar.u).c)) {
                                    ((eof) f9cVar.v).run(string);
                                }
                                f9cVar.g0();
                                break;
                            default:
                                f9cVar.g0();
                                break;
                        }
                    }
                });
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[PHI: r13
      0x0061: PHI (r13v4 int) = (r13v3 int), (r13v5 int) binds: [B:7:0x0026, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.widget.TextView, com.opera.android.custom_views.OperaTextInputEditText] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.TextView, com.opera.android.custom_views.OperaTextInputEditText] */
    @Override // defpackage.ltl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            r11 = this;
            byte r0 = r11.r
            java.lang.String r1 = "Missing required view with ID: "
            r2 = 2131364968(0x7f0a0c68, float:1.8349788E38)
            r3 = 2131364964(0x7f0a0c64, float:1.834978E38)
            r4 = 0
            switch(r0) {
                case 1: goto L72;
                case 2: goto L12;
                default: goto Le;
            }
        Le:
            super.v0(r12, r13)
            return
        L12:
            r0 = 2131559263(0x7f0d035f, float:1.8743865E38)
            android.view.View r12 = r12.inflate(r0, r13, r4)
            r13.addView(r12)
            r13 = 2131363525(0x7f0a06c5, float:1.8346861E38)
            android.view.View r0 = w1h.j(r13, r12)
            r7 = r0
            com.opera.android.custom_views.OperaTextInputEditText r7 = (com.opera.android.custom_views.OperaTextInputEditText) r7
            if (r7 == 0) goto L61
            r13 = 2131364775(0x7f0a0ba7, float:1.8349397E38)
            android.view.View r0 = w1h.j(r13, r12)
            r8 = r0
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            if (r8 == 0) goto L61
            android.view.View r13 = w1h.j(r3, r12)
            r9 = r13
            com.opera.android.custom_views.OperaTextInputEditText r9 = (com.opera.android.custom_views.OperaTextInputEditText) r9
            if (r9 == 0) goto L5f
            android.view.View r13 = w1h.j(r2, r12)
            r10 = r13
            com.google.android.material.textfield.TextInputLayout r10 = (com.google.android.material.textfield.TextInputLayout) r10
            if (r10 == 0) goto L62
            or2 r5 = new or2
            r6 = r12
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r5.<init>(r6, r7, r8, r9, r10)
            r11.s = r5
            r8.x0 = r4
            r10.x0 = r4
            mj2 r12 = new mj2
            r13 = 11
            r12.<init>(r11, r13)
            r7.addTextChangedListener(r12)
            goto L71
        L5f:
            r2 = r3
            goto L62
        L61:
            r2 = r13
        L62:
            android.content.res.Resources r11 = r12.getResources()
            java.lang.String r11 = r11.getResourceName(r2)
            java.lang.String r11 = r1.concat(r11)
            t3p.q(r11)
        L71:
            return
        L72:
            r0 = 2131558451(0x7f0d0033, float:1.8742218E38)
            android.view.View r12 = r12.inflate(r0, r13, r4)
            r13.addView(r12)
            android.view.View r13 = w1h.j(r3, r12)
            com.opera.android.custom_views.OperaTextInputEditText r13 = (com.opera.android.custom_views.OperaTextInputEditText) r13
            if (r13 == 0) goto La7
            android.view.View r0 = w1h.j(r2, r12)
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            if (r0 == 0) goto La8
            zu r1 = new zu
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r1.<init>(r12, r13, r0)
            r11.s = r1
            java.lang.Object r12 = r11.u
            mj2 r12 = (defpackage.mj2) r12
            r13.addTextChangedListener(r12)
            java.lang.Object r11 = r11.s
            zu r11 = (defpackage.zu) r11
            com.google.android.material.textfield.TextInputLayout r11 = r11.d
            r12 = 1
            r11.q(r12)
            goto Lb7
        La7:
            r2 = r3
        La8:
            android.content.res.Resources r11 = r12.getResources()
            java.lang.String r11 = r11.getResourceName(r2)
            java.lang.String r11 = r1.concat(r11)
            t3p.q(r11)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9c.v0(android.view.LayoutInflater, android.view.ViewGroup):void");
    }
}
