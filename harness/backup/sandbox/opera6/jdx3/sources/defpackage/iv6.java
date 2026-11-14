package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import com.opera.android.custom_views.StylingTextView;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class iv6 extends dej {
    public final String c;
    public final q6e d;
    public d5o e;
    public final r9g f;

    public iv6(mej mejVar, String str, q6e q6eVar, r9g r9gVar) {
        super(mejVar);
        this.f = r9gVar;
        this.c = str;
        this.d = q6eVar;
    }

    @Override // defpackage.dej
    public final View a(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        q5g q5gVarC = q5g.c(layoutInflaterFrom);
        LinearLayout linearLayout = (LinearLayout) q5gVarC.c;
        d5o d5oVar = new d5o();
        d5oVar.c = this;
        d5oVar.a = layoutInflaterFrom;
        d5oVar.b = linearLayout;
        this.e = d5oVar;
        yq1 yq1Var = (StylingTextView) q5gVarC.d;
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            yq1Var.setVisibility(8);
        } else {
            yq1Var.setText(charSequence);
        }
        q6e q6eVar = this.d;
        List<eri> listUnmodifiableList = Collections.unmodifiableList(q6eVar.a);
        eri eriVarB = q6eVar.b();
        for (eri eriVar : listUnmodifiableList) {
            if ((eriVar instanceof l6e) && eriVar.e()) {
                d5o d5oVar2 = this.e;
                boolean z = eriVar == eriVarB;
                LayoutInflater layoutInflater = (LayoutInflater) d5oVar2.a;
                LinearLayout linearLayout2 = (LinearLayout) d5oVar2.b;
                View viewInflate = layoutInflater.inflate(2131559311, (ViewGroup) linearLayout2, false);
                linearLayout2.addView(viewInflate);
                WeakHashMap weakHashMap = r5n.a;
                ImageView imageView = (ImageView) ((View) m5n.f(viewInflate, 2131362594));
                l6e l6eVar = (l6e) eriVar;
                q9n.f(imageView, new vs5(d5oVar2, imageView, l6eVar, (byte) 1));
                ((TextView) ((View) m5n.f(viewInflate, 2131363525))).setText(l6eVar.c);
                viewInflate.findViewById(2131362305).setVisibility(z ? 0 : 4);
                viewInflate.setOnClickListener(new ks8(new hv6((byte) 0, d5oVar2, l6eVar, z), (byte) 2));
            }
        }
        return (LayoutDirectionFrameLayout) q5gVarC.b;
    }
}
