package defpackage;

import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.opera.android.BrowserActivity;
import com.opera.android.flow.MyFlowMessageRoot;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class xb9 extends ab2 {
    public final BrowserActivity d;
    public final tcl e;
    public final String f;
    public final rn9 g;
    public final MyFlowMessageRoot h;
    public final TextView i;
    public long j;
    public final q65 k;
    public ob9 l;

    public xb9(BrowserActivity browserActivity, tcl tclVar, View view, String str, rn9 rn9Var) {
        super(view);
        this.k = new q65(this, (byte) 2);
        this.d = browserActivity;
        this.e = tclVar;
        this.f = str;
        this.g = rn9Var;
        this.h = (MyFlowMessageRoot) view;
        WeakHashMap weakHashMap = r5n.a;
        this.i = (TextView) ((View) m5n.f(view, 2131364755));
    }

    @Override // defpackage.ab2
    public void V(ja2 ja2Var, boolean z) {
        hb9 hb9Var = (hb9) ja2Var;
        boolean zH0 = h0(hb9Var);
        int iC0 = c0(hb9Var);
        MyFlowMessageRoot myFlowMessageRoot = this.h;
        myFlowMessageRoot.b(iC0);
        rn9 rn9Var = this.g;
        boolean zBooleanValue = true;
        if (hb9Var == ((ja2) rn9Var.d) && rn9Var.b) {
            rn9Var.b = false;
            myFlowMessageRoot.a(false, false);
            z = true;
        }
        Boolean bool = (Boolean) ((HashMap) rn9Var.c).get(Long.valueOf(hb9Var.b));
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (!zH0 && hb9Var != ((ja2) rn9Var.d)) {
            zBooleanValue = false;
        }
        myFlowMessageRoot.a(zBooleanValue, z);
        myFlowMessageRoot.setOnClickListener(new dv2(this, ja2Var, hb9Var, (byte) 2));
        myFlowMessageRoot.setOnLongClickListener(new ys2(this, ja2Var, (byte) 3));
    }

    @Override // defpackage.ab2
    public void Y() {
        this.k.S();
    }

    public final void b0(TextView textView) {
        int i;
        ob9 ob9Var = new ob9(textView);
        ob9 ob9Var2 = this.l;
        MyFlowMessageRoot myFlowMessageRoot = this.h;
        if (ob9Var2 != null) {
            myFlowMessageRoot.c.c(ob9Var2);
            this.l = null;
        }
        this.l = ob9Var;
        if (myFlowMessageRoot.c.b(ob9Var) && (ob9Var.a != (i = myFlowMessageRoot.i) || !ob9Var.c)) {
            ob9Var.c = true;
            ob9Var.a = i;
            View view = (View) ob9Var.b.get();
            if (view != null) {
                ob9.b(i, view);
            }
        }
        q9n.e(textView, ob9Var);
    }

    public int c0(hb9 hb9Var) {
        return TextUtils.equals(this.f, hb9Var.d) ? 1 : 0;
    }

    public boolean e0(ja2 ja2Var) {
        return false;
    }

    public void f0(ja2 ja2Var) {
        nej nejVarF = a4h.f(this.d);
        xq3 xq3Var = new xq3((byte) 3, this, ja2Var, false);
        nejVarF.getClass();
        nejVarF.b(xq3Var, ijm.b);
    }

    public final void g0(long j) {
        long j2 = this.j;
        if (j2 == 0 || j2 >= j) {
            this.j = j;
            this.k.B0(this.e, j - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public boolean h0(hb9 hb9Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = hb9Var.c;
        long j2 = hb9Var.c;
        long j3 = jCurrentTimeMillis - j;
        TextView textView = this.i;
        if (j3 < 60000) {
            textView.setText(2132018611);
            g0(j2 + 60000);
            return false;
        }
        if (j3 < 3600000) {
            textView.setText(DateUtils.getRelativeTimeSpanString(j, jCurrentTimeMillis, 60000L, 262144));
            g0(TimeUnit.MINUTES.toMillis((j3 / 60000) + 1) + j2);
            return false;
        }
        if (j3 >= 43200000) {
            textView.setText(DateFormat.getTimeInstance(3).format(new Date(j2)));
            return false;
        }
        textView.setText(DateUtils.getRelativeTimeSpanString(j, jCurrentTimeMillis, 3600000L, 262144));
        g0(TimeUnit.HOURS.toMillis((j3 / 3600000) + 1) + j2);
        return false;
    }

    @Override // defpackage.ab2
    public final void onDestroy() {
        ob9 ob9Var = this.l;
        if (ob9Var != null) {
            this.h.c.c(ob9Var);
            this.l = null;
        }
    }
}
