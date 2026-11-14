package defpackage;

import android.R;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.leanplum.core.BuildConfig;
import com.opera.android.custom_views.Spinner;

/* loaded from: classes.dex */
public final class pj2 extends ltl {
    public TextView r;
    public EditText s;
    public EditText t;
    public Button u;
    public Spinner v;
    public String w;
    public String x;
    public final db y;
    public final nj2 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public pj2(db dbVar) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132021588);
        super((itl) u7kVarF.a);
        this.z = new nj2(this, (byte) 0);
        this.y = dbVar;
    }

    public final void G0(boolean z) {
        this.u.setVisibility(z ? 8 : 0);
        this.v.setVisibility(z ? 0 : 8);
        boolean z2 = !z;
        this.t.setEnabled(z2);
        this.s.setEnabled(z2);
        if (z) {
            this.r.setVisibility(8);
        }
    }

    @Override // defpackage.ltl
    public final void onPause() {
        this.y.h(this.z);
        super.onPause();
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        this.y.a(this.z);
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558509, viewGroup, true);
        this.r = (TextView) viewInflate.findViewById(2131362729);
        this.s = (EditText) viewInflate.findViewById(2131364500);
        this.t = (EditText) viewInflate.findViewById(2131362664);
        this.u = (Button) viewInflate.findViewById(2131362398);
        this.v = (Spinner) viewInflate.findViewById(2131363198);
        mj2 mj2Var = new mj2(this, (byte) 0);
        this.s.addTextChangedListener(mj2Var);
        this.t.addTextChangedListener(mj2Var);
        this.u.setOnClickListener(new ic(this, (byte) 2));
        Bundle arguments = getArguments();
        this.s.setText(arguments.getCharSequence("1"));
        this.t.setText(arguments.getCharSequence("2"));
        this.w = arguments.getString(BuildConfig.BUILD_NUMBER);
        this.x = arguments.getString("3");
        TextView textView = (TextView) viewInflate.findViewById(2131362539);
        String string = getString(2132021379);
        String string2 = getString(2132021773);
        String string3 = getString(2132021592, new Object[]{string, string2});
        SpannableString spannableString = new SpannableString(string3);
        boolean zV = f03.V(2130971218, textView.getContext());
        int iIndexOf = string3.indexOf(string);
        int iT = f03.t(R.attr.textColorLink, getContext(), 2131101243);
        spannableString.setSpan(new oj2(this, iT, "https://www.opera.com/privacy", new qxh(string), zV), iIndexOf, string.length() + iIndexOf, 33);
        int iIndexOf2 = string3.indexOf(string2);
        spannableString.setSpan(new oj2(this, iT, "https://www.opera.com/terms", new qxh(string2), zV), iIndexOf2, string2.length() + iIndexOf2, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }
}
