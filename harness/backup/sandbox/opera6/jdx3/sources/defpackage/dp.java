package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingTextView;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dp extends dej {
    public static final bp[] f = {new bp(wz.a, 2132017310), new bp(wz.b, 2132017309), new bp(wz.c, 2132017312), new bp(wz.d, 2132017308)};
    public final mq c;
    public final int d;
    public final List e;

    public dp(mej mejVar, mq mqVar, int i, List list) {
        super(mejVar);
        this.c = mqVar;
        this.d = i;
        this.e = list;
    }

    @Override // defpackage.dej
    public final View a(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View viewInflate = layoutInflaterFrom.inflate(2131558439, (ViewGroup) null, false);
        int i = 2131363780;
        LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) w1h.j(2131363780, viewInflate);
        if (layoutDirectionLinearLayout != null) {
            i = 2131363525;
            yq1 yq1Var = (StylingTextView) w1h.j(2131363525, viewInflate);
            if (yq1Var != null) {
                LayoutDirectionLinearLayout layoutDirectionLinearLayout2 = (LayoutDirectionLinearLayout) viewInflate;
                yq1Var.setText(this.d);
                HashMap map = new HashMap();
                for (xz xzVar : this.e) {
                    map.put(xzVar.a, xzVar);
                }
                for (int i2 = 0; i2 < 4; i2++) {
                    bp bpVar = f[i2];
                    xz xzVar2 = (xz) map.get((wz) bpVar.b);
                    if (xzVar2 != null) {
                        View viewInflate2 = layoutInflaterFrom.inflate(2131558440, (ViewGroup) layoutDirectionLinearLayout, false);
                        WeakHashMap weakHashMap = r5n.a;
                        ((TextView) ((View) m5n.f(viewInflate2, 2131363525))).setText(bpVar.a);
                        viewInflate2.setOnClickListener(new nf(this, xzVar2, (byte) 3));
                        layoutDirectionLinearLayout.addView(viewInflate2);
                    }
                }
                return layoutDirectionLinearLayout2;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
