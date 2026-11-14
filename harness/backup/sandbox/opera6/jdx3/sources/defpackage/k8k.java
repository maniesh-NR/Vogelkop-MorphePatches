package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class k8k extends v5k {
    public final RecyclerView d;
    public final t8k e;
    public final fd f;
    public final tsd g;
    public final pde h;
    public final SettingsManager i;
    public final o4b j;
    public final agm k;

    /* JADX WARN: Illegal instructions before constructor call */
    public k8k(fwf fwfVar, RecyclerView recyclerView, ijc ijcVar, t8k t8kVar, fd fdVar, tsd tsdVar, pde pdeVar, SettingsManager settingsManager, tsd tsdVar2) {
        e6k e6kVar = e6k.e;
        super(g8k.class, ijcVar, e6kVar, 2131559363);
        this.d = recyclerView;
        this.e = t8kVar;
        this.f = fdVar;
        this.g = tsdVar;
        this.h = pdeVar;
        this.i = settingsManager;
        this.j = new o4b(this, e6kVar, (byte) 11);
        this.k = new agm(new s4f(this, tsdVar2, (byte) 27));
        ezg ezgVar = new ezg(this, (byte) 7);
        aib.A(fdVar, fwfVar.getLifecycle(), new yc(this, (byte) 4), new dnj(this, (byte) 12));
        tsdVar.j(fwfVar, new w4i(new n6k(this, (byte) 4), (byte) 11));
        aib.B(settingsManager, fwfVar, ezgVar, new vme((byte) 19));
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.k.r();
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new g8k((byte) 0);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.j;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        if (this.i.i("enable_search_shortcuts")) {
            Rect rect = ((kl5) this.g.g()).b;
            int iOrdinal = ddh.s(rect.height(), this.d.getContext()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    h9o.p();
                    return false;
                }
                int iOrdinal2 = this.e.d.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        pc pcVar = pc.z;
                        fd fdVar = this.f;
                        if ((fdVar.b(pcVar) || fdVar.b(pc.m)) && fdVar.b(pc.A)) {
                            return true;
                        }
                    } else {
                        h9o.p();
                    }
                }
            }
        }
        return false;
    }
}
