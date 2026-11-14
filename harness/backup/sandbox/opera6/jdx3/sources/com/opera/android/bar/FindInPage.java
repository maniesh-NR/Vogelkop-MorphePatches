package com.opera.android.bar;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.ObservableEditText;
import com.opera.android.custom_views.StylingImageView;
import defpackage.aik;
import defpackage.gbf;
import defpackage.h63;
import defpackage.ic;
import defpackage.pc5;
import defpackage.q9n;
import defpackage.qie;
import defpackage.x39;
import defpackage.y39;
import defpackage.ysl;
import defpackage.z43;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public class FindInPage extends LayoutDirectionLinearLayout {
    public static final /* synthetic */ int w = 0;
    public String c;
    public zg d;
    public int e;
    public int f;
    public boolean g;
    public StylingImageView h;
    public StylingImageView i;
    public StylingImageView j;
    public TextView k;
    public ObservableEditText l;
    public LayoutDirectionLinearLayout m;
    public String n;
    public String o;
    public boolean p;
    public final ic q;
    public final h63 r;
    public final x39 s;
    public final y39 t;
    public final z39 u;
    public qie v;

    public FindInPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = "";
        this.n = "";
        this.o = "";
        this.q = new ic(this, (byte) 5);
        this.r = new h63((Object) this, (byte) 2);
        this.s = new x39(this, (byte) 0);
        this.t = new y39(this, (byte) 0);
        this.u = new z39(this, (byte) 0);
    }

    public final void f() {
        boolean z = this.p;
        bq1 bq1Var = this.l;
        if (z) {
            this.o = aik.c(bq1Var.getText());
        } else {
            this.n = aik.c(bq1Var.getText());
        }
        zg zgVar = this.d;
        if (zgVar != null) {
            N.Mjhb9sjl((WebContents) zgVar.b);
            this.d.d = null;
            this.d = null;
        }
        this.l.clearFocus();
        q9n.u(findViewById(2131362964));
        qie qieVar = this.v;
        if (qieVar != null) {
            gbf gbfVar = (gbf) qieVar.b;
            gbfVar.v.r(Boolean.FALSE);
            z43 z43Var = gbfVar.b;
            ((ysl) z43Var.e).f0(gbfVar.u);
            gbfVar.u.setVisibility(8);
        }
    }

    public final void g() {
        this.i.setEnabled(this.e > 1);
        this.j.setEnabled(this.e > 1);
        this.k.setVisibility(this.l.getText().length() <= 0 ? 8 : 0);
        this.k.setText(getResources().getString(2132019070, Integer.valueOf(this.f), Integer.valueOf(this.e)));
        this.k.setTextColor(this.e > 0 ? this.l.getHintTextColors() : f03.y(this.k.getContext()));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = (StylingImageView) findViewById(2131362962);
        this.i = (StylingImageView) findViewById(2131362970);
        this.j = (StylingImageView) findViewById(2131362969);
        this.k = (TextView) findViewById(2131362963);
        this.l = (ObservableEditText) findViewById(2131362964);
        this.m = (LayoutDirectionLinearLayout) findViewById(2131362965);
        AppCompatImageView appCompatImageView = this.h;
        View.OnClickListener onClickListener = this.q;
        appCompatImageView.setOnClickListener(onClickListener);
        this.i.setOnClickListener(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.l.addTextChangedListener(this.r);
        this.l.setOnEditorActionListener(this.s);
        this.l.setOnFocusChangeListener(this.t);
        this.l.setOnKeyListener(this.u);
        q9n.e(this.k, new pc5(this, (byte) 20));
    }
}
