package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class ws extends i {
    public final vs b;
    public final zs c;
    public ts d;

    public ws(ViewGroup viewGroup, zs zsVar) {
        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131558446, null, false);
        int i = 2131362112;
        View viewJ = w1h.j(2131362112, constraintLayoutN);
        if (viewJ != null) {
            i = 2131363183;
            ImageView imageView = (ImageView) w1h.j(2131363183, constraintLayoutN);
            if (imageView != null) {
                i = 2131363525;
                OperaTextView operaTextViewJ = w1h.j(2131363525, constraintLayoutN);
                if (operaTextViewJ != null) {
                    ConstraintLayout constraintLayout = constraintLayoutN;
                    vs vsVar = new vs((ViewGroup) constraintLayout, viewJ, (Object) imageView, (Object) operaTextViewJ, (byte) 0);
                    super(constraintLayout);
                    this.b = vsVar;
                    this.c = zsVar;
                    constraintLayout.setOnClickListener(new gf((Object) this, (byte) 3));
                    u7 u7Var = new u7(this, (byte) 6);
                    dll dllVarS = q9n.s(constraintLayout);
                    if (dllVarS == null) {
                        return;
                    }
                    u8n.b(dllVarS, constraintLayout, u7Var);
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
        throw null;
    }
}
