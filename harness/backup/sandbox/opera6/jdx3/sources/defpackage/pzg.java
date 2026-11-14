package defpackage;

import android.view.View;
import android.widget.TextSwitcher;
import org.chromium.net.GURLUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class pzg implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xzg b;

    public /* synthetic */ pzg(xzg xzgVar, byte b) {
        this.a = b;
        this.b = xzgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        en0 en0Var = en0.h;
        xzg xzgVar = this.b;
        switch (b) {
            case 0:
                s9g.h.c(GURLUtils.getOrigin((String) xzgVar.e.e.g()));
                ysj ysjVar = (ysj) xzgVar.l.get();
                ysjVar.b(am2.i(2132021537, 2500, ysjVar), ijm.b);
                xzgVar.dismiss();
                break;
            case 1:
                xzgVar.j.n0(en0Var);
                String origin = GURLUtils.getOrigin((String) xzgVar.e.e.g());
                xzgVar.dismiss();
                xzgVar.k.e(new c9g(origin), false);
                break;
            case 2:
                xzgVar.j.n0(en0Var);
                String origin2 = GURLUtils.getOrigin((String) xzgVar.e.e.g());
                xzgVar.dismiss();
                xzgVar.k.e(new c9g(origin2), false);
                break;
            case 3:
                xzgVar.getChildFragmentManager().U();
                break;
            default:
                xzgVar.j.n0(en0.k);
                h3m.a(xzgVar.g, (y2m) null);
                ((TextSwitcher) xzgVar.h.i).showNext();
                break;
        }
    }
}
