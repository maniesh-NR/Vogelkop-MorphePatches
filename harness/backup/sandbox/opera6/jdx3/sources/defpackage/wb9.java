package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.opera.android.BrowserActivity;
import com.opera.android.annotations.WeakOwner;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class wb9 extends xb9 {

    @NonNull
    @WeakOwner
    private final TextView m;
    public final vk2 n;
    public final tw2 o;
    public final vwj p;

    public wb9(BrowserActivity browserActivity, tcl tclVar, View view, String str, rn9 rn9Var, vk2 vk2Var) {
        super(browserActivity, tclVar, view, str, rn9Var);
        this.o = new tw2(this, (byte) 1);
        this.p = new vwj(new yk4(this, (byte) 25), new zt(this, (byte) 6));
        WeakHashMap weakHashMap = r5n.a;
        TextView textView = (TextView) ((View) m5n.f(view, 2131363485));
        this.m = textView;
        b0(textView);
        this.n = vk2Var;
    }

    @Override // defpackage.xb9, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        this.m.setMovementMethod(this.p);
        TextView textView = this.m;
        String str = ((kb9) ja2Var).e;
        Pattern pattern = bgc.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = bgc.a.matcher(spannableStringBuilder);
        while (matcher.find()) {
            String strGroup = matcher.group();
            matcher.group();
            tw2 tw2Var = this.o;
            tw2Var.getClass();
            spannableStringBuilder.setSpan(new ub9(tw2Var, ((wb9) tw2Var.b).m.getContext(), strGroup), matcher.start(), matcher.end(), 17);
        }
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        vwj.a(textView);
    }

    @Override // defpackage.xb9
    public final void f0(ja2 ja2Var) {
        nej nejVarF = a4h.f(this.d);
        vb9 vb9Var = new vb9(this, ja2Var, (byte) 0);
        nejVarF.getClass();
        nejVarF.b(vb9Var, ijm.b);
    }
}
