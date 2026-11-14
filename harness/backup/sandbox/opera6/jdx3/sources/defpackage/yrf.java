package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public abstract class yrf extends dej {
    public final String c;
    public final boolean d;
    public tn e;

    public yrf(mej mejVar, String str, boolean z) {
        super(mejVar);
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.dej
    public View a(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        q5g q5gVarC = q5g.c(layoutInflaterFrom);
        LinearLayout linearLayout = (LinearLayout) q5gVarC.c;
        tn tnVar = new tn();
        tnVar.d = this;
        tnVar.b = layoutInflaterFrom;
        tnVar.c = linearLayout;
        tnVar.a = this.d;
        this.e = tnVar;
        yq1 yq1Var = (StylingTextView) q5gVarC.d;
        CharSequence charSequence = this.c;
        if (TextUtils.isEmpty(charSequence)) {
            yq1Var.setVisibility(8);
        } else {
            yq1Var.setText(charSequence);
        }
        return (LayoutDirectionFrameLayout) q5gVarC.b;
    }

    public final void d(lrf lrfVar) {
        this.e.t(lrfVar, true);
    }

    public boolean e(lrf lrfVar) {
        return false;
    }

    public void f(lrf lrfVar) {
        Context context = this.b.getContext();
        String[] strArr = OperaApplication.K;
        qq8 qq8Var = ((OperaApplication) context.getApplicationContext()).R().f;
        long j = ((c8g) lrfVar).a;
        qq8Var.getClass();
        qq8Var.n(SystemClock.elapsedRealtime() + j);
        ((ydn) qq8Var.c).D(false);
    }
}
