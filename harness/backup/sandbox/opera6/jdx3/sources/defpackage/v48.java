package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;

/* loaded from: classes.dex */
public final class v48 extends AlertDialog {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v48(uim uimVar, Context context, byte b) {
        super(context, 2132083349);
        this.a = b;
        this.b = uimVar;
    }

    public final void a(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131559271);
        findViewById(2131362524).setOnClickListener(new gf((Object) this, (byte) 20));
        getWindow().clearFlags(131080);
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        db dbVarB = ((OperaApplication) context.getApplicationContext()).b();
        if (dbVarB.d()) {
            findViewById(2131364500).setVisibility(8);
        } else {
            ((TextView) findViewById(2131364500)).setText(dbVarB.c());
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        byte b = this.a;
        uim uimVar = this.b;
        final byte b2 = 1;
        final byte b3 = 2;
        final byte b4 = 0;
        switch (b) {
            case 0:
                a(bundle);
                w48 w48Var = (w48) uimVar;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                ViewGroup viewGroup = (ViewGroup) findViewById(2131362420);
                View viewInflate = layoutInflaterFrom.inflate(2131558693, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i = 2131363854;
                TextInputEditText textInputEditText = (OperaTextInputEditText) w1h.j(2131363854, viewInflate);
                if (textInputEditText != null) {
                    i = 2131363855;
                    TextInputLayout textInputLayoutJ = w1h.j(2131363855, viewInflate);
                    if (textInputLayoutJ != null) {
                        i = 2131364061;
                        MaterialButton materialButtonJ = w1h.j(2131364061, viewInflate);
                        if (materialButtonJ != null) {
                            w48Var.d = new vs((ViewGroup) viewInflate, (View) textInputEditText, (Object) textInputLayoutJ, (Object) materialButtonJ, (byte) 10);
                            textInputEditText.addTextChangedListener(new mj2(this, (byte) 9));
                            ((MaterialButton) w48Var.d.e).setOnClickListener(new View.OnClickListener(this) { // from class: u48
                                public final /* synthetic */ v48 b;

                                {
                                    this.b = this;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
                                
                                    if (r1 == false) goto L14;
                                 */
                                @Override // android.view.View.OnClickListener
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void onClick(android.view.View r3) {
                                    /*
                                        r2 = this;
                                        byte r0 = r2
                                        r1 = 1
                                        v48 r2 = r2.b
                                        switch(r0) {
                                            case 0: goto L6a;
                                            case 1: goto L10;
                                            default: goto L8;
                                        }
                                    L8:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        r2.h0()
                                        return
                                    L10:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        vs r3 = r2.d
                                        if (r3 == 0) goto L66
                                        java.lang.Object r3 = r3.c
                                        com.opera.android.custom_views.OperaTextInputEditText r3 = (com.opera.android.custom_views.OperaTextInputEditText) r3
                                        android.text.Editable r3 = r3.getText()
                                        boolean r3 = android.text.TextUtils.isEmpty(r3)
                                        if (r3 != 0) goto L55
                                        android.content.Context r3 = r2.requireContext()
                                        java.lang.String[] r0 = com.opera.android.OperaApplication.K
                                        android.content.Context r3 = r3.getApplicationContext()
                                        com.opera.android.OperaApplication r3 = (com.opera.android.OperaApplication) r3
                                        zwk r3 = r3.N()
                                        vs r0 = r2.d
                                        java.lang.Object r0 = r0.c
                                        com.opera.android.custom_views.OperaTextInputEditText r0 = (com.opera.android.custom_views.OperaTextInputEditText) r0
                                        android.text.Editable r0 = r0.getText()
                                        java.lang.String r0 = r0.toString()
                                        r3.getClass()
                                        avj r3 = cak.d
                                        boolean r3 = avj.b(r1)
                                        if (r3 == 0) goto L53
                                        boolean r1 = J.N.MsAgyd3A(r0)
                                    L53:
                                        if (r1 != 0) goto L66
                                    L55:
                                        vs r3 = r2.d
                                        java.lang.Object r3 = r3.d
                                        com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
                                        r0 = 2132019327(0x7f14087f, float:1.9676986E38)
                                        java.lang.String r2 = r2.getString(r0)
                                        r3.p(r2)
                                        goto L69
                                    L66:
                                        r2.h0()
                                    L69:
                                        return
                                    L6a:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        android.content.Context r3 = r3.getContext()
                                        r2.getClass()
                                        java.lang.Object r2 = J.N.MKuJ$OHt()
                                        java.lang.String r2 = (java.lang.String) r2
                                        android.net.Uri r2 = android.net.Uri.parse(r2)
                                        android.net.Uri$Builder r2 = r2.buildUpon()
                                        java.lang.String r0 = ""
                                        android.net.Uri$Builder r2 = r2.path(r0)
                                        android.net.Uri r2 = r2.build()
                                        java.lang.String r2 = r2.toString()
                                        xgf r0 = new xgf
                                        r0.<init>(r2)
                                        r0.n = r1
                                        zi4.u(r3, r0)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.u48.onClick(android.view.View):void");
                                }
                            });
                            TextView textView = (TextView) findViewById(R.id.button1);
                            textView.setVisibility(0);
                            textView.setText(2132018586);
                            textView.setOnClickListener(new View.OnClickListener(this) { // from class: u48
                                public final /* synthetic */ v48 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View v) {
                                    /*
                                        this = this;
                                        byte r0 = r2
                                        r1 = 1
                                        v48 r2 = r2.b
                                        switch(r0) {
                                            case 0: goto L6a;
                                            case 1: goto L10;
                                            default: goto L8;
                                        }
                                    L8:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        r2.h0()
                                        return
                                    L10:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        vs r3 = r2.d
                                        if (r3 == 0) goto L66
                                        java.lang.Object r3 = r3.c
                                        com.opera.android.custom_views.OperaTextInputEditText r3 = (com.opera.android.custom_views.OperaTextInputEditText) r3
                                        android.text.Editable r3 = r3.getText()
                                        boolean r3 = android.text.TextUtils.isEmpty(r3)
                                        if (r3 != 0) goto L55
                                        android.content.Context r3 = r2.requireContext()
                                        java.lang.String[] r0 = com.opera.android.OperaApplication.K
                                        android.content.Context r3 = r3.getApplicationContext()
                                        com.opera.android.OperaApplication r3 = (com.opera.android.OperaApplication) r3
                                        zwk r3 = r3.N()
                                        vs r0 = r2.d
                                        java.lang.Object r0 = r0.c
                                        com.opera.android.custom_views.OperaTextInputEditText r0 = (com.opera.android.custom_views.OperaTextInputEditText) r0
                                        android.text.Editable r0 = r0.getText()
                                        java.lang.String r0 = r0.toString()
                                        r3.getClass()
                                        avj r3 = cak.d
                                        boolean r3 = avj.b(r1)
                                        if (r3 == 0) goto L53
                                        boolean r1 = J.N.MsAgyd3A(r0)
                                    L53:
                                        if (r1 != 0) goto L66
                                    L55:
                                        vs r3 = r2.d
                                        java.lang.Object r3 = r3.d
                                        com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
                                        r0 = 2132019327(0x7f14087f, float:1.9676986E38)
                                        java.lang.String r2 = r2.getString(r0)
                                        r3.p(r2)
                                        goto L69
                                    L66:
                                        r2.h0()
                                    L69:
                                        return
                                    L6a:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        android.content.Context r3 = r3.getContext()
                                        r2.getClass()
                                        java.lang.Object r2 = J.N.MKuJ$OHt()
                                        java.lang.String r2 = (java.lang.String) r2
                                        android.net.Uri r2 = android.net.Uri.parse(r2)
                                        android.net.Uri$Builder r2 = r2.buildUpon()
                                        java.lang.String r0 = ""
                                        android.net.Uri$Builder r2 = r2.path(r0)
                                        android.net.Uri r2 = r2.build()
                                        java.lang.String r2 = r2.toString()
                                        xgf r0 = new xgf
                                        r0.<init>(r2)
                                        r0.n = r1
                                        zi4.u(r3, r0)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.u48.onClick(android.view.View):void");
                                }
                            });
                            TextView textView2 = (TextView) findViewById(R.id.button2);
                            textView2.setVisibility(0);
                            textView2.setText(2132018111);
                            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: u48
                                public final /* synthetic */ v48 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View v) {
                                    /*
                                        this = this;
                                        byte r0 = r2
                                        r1 = 1
                                        v48 r2 = r2.b
                                        switch(r0) {
                                            case 0: goto L6a;
                                            case 1: goto L10;
                                            default: goto L8;
                                        }
                                    L8:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        r2.h0()
                                        return
                                    L10:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        vs r3 = r2.d
                                        if (r3 == 0) goto L66
                                        java.lang.Object r3 = r3.c
                                        com.opera.android.custom_views.OperaTextInputEditText r3 = (com.opera.android.custom_views.OperaTextInputEditText) r3
                                        android.text.Editable r3 = r3.getText()
                                        boolean r3 = android.text.TextUtils.isEmpty(r3)
                                        if (r3 != 0) goto L55
                                        android.content.Context r3 = r2.requireContext()
                                        java.lang.String[] r0 = com.opera.android.OperaApplication.K
                                        android.content.Context r3 = r3.getApplicationContext()
                                        com.opera.android.OperaApplication r3 = (com.opera.android.OperaApplication) r3
                                        zwk r3 = r3.N()
                                        vs r0 = r2.d
                                        java.lang.Object r0 = r0.c
                                        com.opera.android.custom_views.OperaTextInputEditText r0 = (com.opera.android.custom_views.OperaTextInputEditText) r0
                                        android.text.Editable r0 = r0.getText()
                                        java.lang.String r0 = r0.toString()
                                        r3.getClass()
                                        avj r3 = cak.d
                                        boolean r3 = avj.b(r1)
                                        if (r3 == 0) goto L53
                                        boolean r1 = J.N.MsAgyd3A(r0)
                                    L53:
                                        if (r1 != 0) goto L66
                                    L55:
                                        vs r3 = r2.d
                                        java.lang.Object r3 = r3.d
                                        com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
                                        r0 = 2132019327(0x7f14087f, float:1.9676986E38)
                                        java.lang.String r2 = r2.getString(r0)
                                        r3.p(r2)
                                        goto L69
                                    L66:
                                        r2.h0()
                                    L69:
                                        return
                                    L6a:
                                        uim r2 = r2.b
                                        w48 r2 = (defpackage.w48) r2
                                        android.content.Context r3 = r3.getContext()
                                        r2.getClass()
                                        java.lang.Object r2 = J.N.MKuJ$OHt()
                                        java.lang.String r2 = (java.lang.String) r2
                                        android.net.Uri r2 = android.net.Uri.parse(r2)
                                        android.net.Uri$Builder r2 = r2.buildUpon()
                                        java.lang.String r0 = ""
                                        android.net.Uri$Builder r2 = r2.path(r0)
                                        android.net.Uri r2 = r2.build()
                                        java.lang.String r2 = r2.toString()
                                        xgf r0 = new xgf
                                        r0.<init>(r2)
                                        r0.n = r1
                                        zi4.u(r3, r0)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.u48.onClick(android.view.View):void");
                                }
                            });
                            break;
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            default:
                a(bundle);
                f0i f0iVar = (f0i) uimVar;
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(getContext());
                ViewGroup viewGroup2 = (ViewGroup) findViewById(2131362420);
                View viewInflate2 = layoutInflaterFrom2.inflate(2131559270, viewGroup2, false);
                viewGroup2.addView(viewInflate2);
                int i2 = 2131362512;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362512, viewInflate2);
                if (stylingTextView != null) {
                    i2 = 2131362844;
                    MaterialButton materialButtonJ2 = w1h.j(2131362844, viewInflate2);
                    if (materialButtonJ2 != null) {
                        i2 = 2131362979;
                        if (((LayoutDirectionLinearLayout) w1h.j(2131362979, viewInflate2)) != null) {
                            i2 = 2131363856;
                            TextInputEditText textInputEditText2 = (OperaTextInputEditText) w1h.j(2131363856, viewInflate2);
                            if (textInputEditText2 != null) {
                                i2 = 2131363857;
                                TextInputLayout textInputLayoutJ2 = w1h.j(2131363857, viewInflate2);
                                if (textInputLayoutJ2 != null) {
                                    i2 = 2131364064;
                                    MaterialButton materialButtonJ3 = w1h.j(2131364064, viewInflate2);
                                    if (materialButtonJ3 != null) {
                                        i2 = 2131364171;
                                        if (((LinearLayout) w1h.j(2131364171, viewInflate2)) != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewInflate2;
                                            i2 = 2131365077;
                                            OperaIconedMessage operaIconedMessage = (OperaIconedMessage) w1h.j(2131365077, viewInflate2);
                                            if (operaIconedMessage != null) {
                                                f0iVar.g = new y83((ViewGroup) linearLayout, (Object) stylingTextView, (Object) materialButtonJ2, (View) textInputEditText2, (View) textInputLayoutJ2, (Object) materialButtonJ3, (View) operaIconedMessage, (byte) 9);
                                                db dbVar = f0iVar.f;
                                                PasswordManager passwordManager = f0iVar.i;
                                                zzh zzhVar = new zzh(this, b3);
                                                passwordManager.getClass();
                                                PasswordManager.a(zzhVar);
                                                ((OperaTextInputEditText) f0iVar.g.e).addTextChangedListener(new mj2(this, (byte) 12));
                                                boolean zD = dbVar.d();
                                                y83 y83Var = f0iVar.g;
                                                if (zD) {
                                                    ((MaterialButton) y83Var.g).setVisibility(8);
                                                } else {
                                                    ((MaterialButton) y83Var.g).setOnClickListener(new View.OnClickListener(this) { // from class: e0i
                                                        public final /* synthetic */ v48 b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            byte b5 = b4;
                                                            lqm lqmVar = lqm.d;
                                                            v48 v48Var = this.b;
                                                            switch (b5) {
                                                                case 0:
                                                                    f0i f0iVar2 = (f0i) v48Var.b;
                                                                    String strC = f0iVar2.f.c();
                                                                    Uri.Builder builderAppendEncodedPath = dgh.h().buildUpon().appendEncodedPath(vep.h(6));
                                                                    if (!TextUtils.isEmpty(strC)) {
                                                                        builderAppendEncodedPath.appendQueryParameter("username", strC.toString());
                                                                    }
                                                                    vx3 vx3VarA = ay3.a(builderAppendEncodedPath.build().toString(), lqmVar, false);
                                                                    vx3VarA.c(true);
                                                                    ac8.a(new ay3(vx3VarA));
                                                                    l31 l31Var = f0iVar2.k;
                                                                    if (l31Var != null) {
                                                                        l31Var.run();
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    ((f0i) v48Var.b).getClass();
                                                                    vx3 vx3VarA2 = ay3.a("https://help.opera.com/mobile/android/#incorrectPassword", lqmVar, false);
                                                                    vx3VarA2.c(true);
                                                                    ac8.a(new ay3(vx3VarA2));
                                                                    break;
                                                                default:
                                                                    ((f0i) v48Var.b).h0();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                ((MaterialButton) f0iVar.g.d).setOnClickListener(new View.OnClickListener(this) { // from class: e0i
                                                    public final /* synthetic */ v48 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        byte b5 = b2;
                                                        lqm lqmVar = lqm.d;
                                                        v48 v48Var = this.b;
                                                        switch (b5) {
                                                            case 0:
                                                                f0i f0iVar2 = (f0i) v48Var.b;
                                                                String strC = f0iVar2.f.c();
                                                                Uri.Builder builderAppendEncodedPath = dgh.h().buildUpon().appendEncodedPath(vep.h(6));
                                                                if (!TextUtils.isEmpty(strC)) {
                                                                    builderAppendEncodedPath.appendQueryParameter("username", strC.toString());
                                                                }
                                                                vx3 vx3VarA = ay3.a(builderAppendEncodedPath.build().toString(), lqmVar, false);
                                                                vx3VarA.c(true);
                                                                ac8.a(new ay3(vx3VarA));
                                                                l31 l31Var = f0iVar2.k;
                                                                if (l31Var != null) {
                                                                    l31Var.run();
                                                                    break;
                                                                }
                                                                break;
                                                            case 1:
                                                                ((f0i) v48Var.b).getClass();
                                                                vx3 vx3VarA2 = ay3.a("https://help.opera.com/mobile/android/#incorrectPassword", lqmVar, false);
                                                                vx3VarA2.c(true);
                                                                ac8.a(new ay3(vx3VarA2));
                                                                break;
                                                            default:
                                                                ((f0i) v48Var.b).h0();
                                                                break;
                                                        }
                                                    }
                                                });
                                                Button button = (Button) findViewById(R.id.button1);
                                                f0iVar.h = button;
                                                button.setVisibility(0);
                                                TextView textView3 = (TextView) findViewById(R.id.button2);
                                                textView3.setVisibility(0);
                                                textView3.setText(2132018111);
                                                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: e0i
                                                    public final /* synthetic */ v48 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        byte b5 = b3;
                                                        lqm lqmVar = lqm.d;
                                                        v48 v48Var = this.b;
                                                        switch (b5) {
                                                            case 0:
                                                                f0i f0iVar2 = (f0i) v48Var.b;
                                                                String strC = f0iVar2.f.c();
                                                                Uri.Builder builderAppendEncodedPath = dgh.h().buildUpon().appendEncodedPath(vep.h(6));
                                                                if (!TextUtils.isEmpty(strC)) {
                                                                    builderAppendEncodedPath.appendQueryParameter("username", strC.toString());
                                                                }
                                                                vx3 vx3VarA = ay3.a(builderAppendEncodedPath.build().toString(), lqmVar, false);
                                                                vx3VarA.c(true);
                                                                ac8.a(new ay3(vx3VarA));
                                                                l31 l31Var = f0iVar2.k;
                                                                if (l31Var != null) {
                                                                    l31Var.run();
                                                                    break;
                                                                }
                                                                break;
                                                            case 1:
                                                                ((f0i) v48Var.b).getClass();
                                                                vx3 vx3VarA2 = ay3.a("https://help.opera.com/mobile/android/#incorrectPassword", lqmVar, false);
                                                                vx3VarA2.c(true);
                                                                ac8.a(new ay3(vx3VarA2));
                                                                break;
                                                            default:
                                                                ((f0i) v48Var.b).h0();
                                                                break;
                                                        }
                                                    }
                                                });
                                                if (!dbVar.f()) {
                                                    f0iVar.o0(2);
                                                    break;
                                                } else {
                                                    f0iVar.o0(1);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                break;
        }
    }
}
