package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class ijo extends ejo {
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final RelativeLayout f;
    public final LinearLayout g;

    public ijo(RelativeLayout relativeLayout) {
        this.a = relativeLayout;
        f();
        this.b = (ImageView) relativeLayout.findViewById(2131361956);
        this.c = (TextView) relativeLayout.findViewById(2131361957);
        this.d = (TextView) relativeLayout.findViewById(2131361954);
        this.f = (RelativeLayout) relativeLayout.findViewById(2131361953);
        this.g = (LinearLayout) relativeLayout.findViewById(2131361958);
        this.e = (TextView) relativeLayout.findViewById(2131361952);
    }

    @Override // defpackage.ejo
    public final void b() {
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(0);
    }
}
