package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.android.custom_views.DropShadowFrameLayout;
import com.opera.android.settings.SettingsManager;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a7k extends v5k implements p5j, q8k {
    public static final List m = Arrays.asList(e6k.h, e6k.i);
    public final Context d;
    public final SettingsManager e;
    public final u8k f;
    public final pde g;
    public final tsd h;
    public final mgh i;
    public final p6l j;
    public final o4b k;
    public final qzg l;

    /* JADX WARN: Illegal instructions before constructor call */
    public a7k(Context context, ijc ijcVar, SettingsManager settingsManager, u8k u8kVar, pde pdeVar, tsd tsdVar, mgh mghVar, p6l p6lVar) {
        e6k e6kVar = e6k.c;
        super(x6k.class, ijcVar, e6kVar, 2131559360);
        this.d = context;
        this.e = settingsManager;
        this.f = u8kVar;
        this.g = pdeVar;
        this.h = tsdVar;
        this.i = mghVar;
        this.j = p6lVar;
        this.k = new o4b(this, e6kVar, (byte) 10);
        qzg qzgVar = new qzg(this, (byte) 17);
        this.l = qzgVar;
        settingsManager.F(this);
        u8kVar.g.b(this);
        tsdVar.k(qzgVar);
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        View viewN = j7c.n(viewGroup, 2131559360, viewGroup, false);
        ImageView imageView = (ImageView) w1h.j(2131363361, viewN);
        if (imageView == null) {
            t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(2131363361)));
            return null;
        }
        return new z6k(new b7k((byte) 0, (DropShadowFrameLayout) viewN, imageView), this.k.c, this.g, new dnj(this, (byte) 11));
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (str.equals("enable_start_page_opera_logo")) {
            A();
        }
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        this.e.H(this);
        this.f.g.c(this);
        this.h.p(this.l);
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new x6k((byte) 0);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.k;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        throw null;
    }
}
