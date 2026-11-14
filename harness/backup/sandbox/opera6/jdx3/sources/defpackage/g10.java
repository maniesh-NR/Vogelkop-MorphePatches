package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class g10 extends l00 implements ya2 {
    public final LinearLayout E;
    public final jsd F;
    public final w00 G;

    public g10(View view, kze kzeVar) {
        super(view, new f10(view), kzeVar);
        LinearLayout linearLayout = new LinearLayout(view.getContext());
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        jsd jsdVar = new jsd(view.getContext());
        this.F = jsdVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.height = -2;
        jsdVar.setLayoutParams(layoutParams);
        h0(jsdVar);
        this.G = new w00(view.getContext());
        vwj.a(this.p);
    }

    public static void n0(View view) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.removeRule(3);
        layoutParams.addRule(10);
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CharSequence o0(cie cieVar, View view) {
        String str;
        String str2 = cieVar.z;
        String[] strArr = aik.a;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (cieVar.d != w06.f ? !(!cieVar.s || (str = cieVar.t) == null) : !(!cieVar.J || (str = cieVar.K) == null)) {
            str3 = str;
        }
        int i = x00.f;
        if (!TextUtils.isEmpty(str3)) {
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new x00(view.getContext()), 0, spannableString.length(), 33);
            str3 = spannableString;
        }
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) str3);
        return spannableStringBuilder;
    }

    public static void p0(int i, View view) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.removeRule(10);
        layoutParams.addRule(3, i);
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.ya2
    public final void R() {
        u0g u0gVar;
        x10 x10VarM0 = Z();
        if (x10VarM0.d()) {
            u0gVar = x10VarM0.a;
            x10VarM0.a = null;
        } else {
            u0gVar = null;
        }
        Parcelable parcelable = u0gVar != null ? (Parcelable) u0gVar.get(2131362883) : null;
        q0(parcelable instanceof Bundle ? (Bundle) parcelable : Bundle.EMPTY);
    }

    @Override // defpackage.xv8, defpackage.o43, defpackage.ab2
    public void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        Z().p = new sz(this);
        f0().u.T = this.G;
    }

    @Override // defpackage.ab2
    public final void X(boolean z) {
        if (z) {
            return;
        }
        TextView textView = this.p;
        CharSequence text = textView.getText();
        phj.Z(textView);
        gf gfVar = new gf((Object) this, (byte) 10);
        int i = x00.f;
        if (text instanceof Spannable) {
            x00[] x00VarArr = (x00[]) ((Spannable) text).getSpans(0, text.length(), x00.class);
            if (x00VarArr.length > 0) {
                x00VarArr[0].e = gfVar;
            }
        }
        R();
    }

    @Override // defpackage.o43, defpackage.ab2
    public final void Y() {
        super.Y();
        t();
        Z().p = null;
        f0().u.T = y55.a;
    }

    @Override // defpackage.l00, defpackage.bu8, defpackage.o43, defpackage.cr
    public final void i(boolean z) {
        super.i(z);
        LinearLayout linearLayout = this.E;
        if (!z) {
            ViewParent parent = linearLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(linearLayout);
                return;
            }
            return;
        }
        fjo fjoVar = (fjo) this.F.a.get(f0().u);
        if (fjoVar instanceof z5p) {
            ((z5p) fjoVar).addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public abstract void q0(Bundle bundle);

    public abstract void r0(Bundle bundle);

    public final void s0(cie cieVar) {
        LinearLayout linearLayout = this.E;
        LayoutInflater.from(linearLayout.getContext()).inflate(2131558745, (ViewGroup) linearLayout, true);
        WeakHashMap weakHashMap = r5n.a;
        String strC = aik.c(((TextView) ((View) m5n.f(linearLayout, 2131361982))).getText());
        TextView textView = (TextView) ((View) m5n.f(linearLayout, 2131361981));
        String str = cieVar.D;
        if (str == null) {
            str = "";
        }
        boolean z = (TextUtils.isEmpty(str) || strC.equals(str)) ? false : true;
        textView.setText(str);
        textView.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.ya2
    public final void t() {
        u0g u0gVar = new u0g();
        Bundle bundle = new Bundle();
        u0gVar.put(2131362883, bundle);
        r0(bundle);
        Z().a = u0gVar;
    }
}
