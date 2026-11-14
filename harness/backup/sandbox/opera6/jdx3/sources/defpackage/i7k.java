package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.settings.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i7k extends v5k {
    public final RecyclerView d;
    public final tsd e;
    public final SettingsManager f;
    public final bvl g;
    public final r22 h;
    public final ss8 i;
    public final agm j;

    /* JADX WARN: Illegal instructions before constructor call */
    public i7k(fwf fwfVar, RecyclerView recyclerView, ijc ijcVar, tsd tsdVar, pde pdeVar, SettingsManager settingsManager, lg lgVar, fd fdVar, hv3 hv3Var, tsd tsdVar2, mbf mbfVar, bvl bvlVar, r22 r22Var) {
        e6k e6kVar = e6k.f;
        super(g7k.class, ijcVar, e6kVar, 2131559361);
        this.d = recyclerView;
        this.e = tsdVar;
        this.f = settingsManager;
        this.g = bvlVar;
        this.h = r22Var;
        this.i = new ss8(this, mbfVar, e6kVar);
        this.j = new agm(new kkc(this, pdeVar, lgVar, fdVar, hv3Var, tsdVar2));
        ezg ezgVar = new ezg(this, (byte) 6);
        final byte b = 0;
        tsdVar.j(fwfVar, new t7d(new Function1(this) { // from class: f7k
            public final /* synthetic */ i7k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                i7k i7kVar = this.b;
                switch (b2) {
                    case 0:
                        i7kVar.A();
                        break;
                    default:
                        i7kVar.A();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 17));
        aib.B(settingsManager, fwfVar, ezgVar, new vme((byte) 19));
        final byte b2 = 1;
        bvlVar.getState().j(fwfVar, new t7d(new Function1(this) { // from class: f7k
            public final /* synthetic */ i7k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                i7k i7kVar = this.b;
                switch (b22) {
                    case 0:
                        i7kVar.A();
                        break;
                    default:
                        i7kVar.A();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 17));
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.j.r();
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new g7k((byte) 0);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.i;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        if ((!((avl) this.g.getState().g()).b && !this.h.i()) || !this.f.i("enable_search_shortcuts_tablet")) {
            return false;
        }
        int iOrdinal = ddh.t(((kl5) this.e.g()).b.width(), this.d.getContext()).ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return true;
        }
        h9o.p();
        return false;
    }
}
