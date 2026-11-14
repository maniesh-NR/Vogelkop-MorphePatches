package defpackage;

import android.view.GestureDetector;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.tabui2.FadeoutRecyclerView;
import com.opera.android.tabui2.TabUiRootFrameLayout;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0e {
    public final pde a;
    public final pde b;
    public final FadeoutRecyclerView c;
    public final yhe d;
    public final RecyclerView e;
    public final b0e f;
    public final TabUiRootFrameLayout g;
    public tzd h;
    public boolean i;

    public m0e(pde pdeVar, pde pdeVar2, gal galVar, FadeoutRecyclerView fadeoutRecyclerView, yhe yheVar, RecyclerView recyclerView, b0e b0eVar, TabUiRootFrameLayout tabUiRootFrameLayout) {
        this.a = pdeVar;
        this.b = pdeVar2;
        this.c = fadeoutRecyclerView;
        this.d = yheVar;
        this.e = recyclerView;
        this.f = b0eVar;
        this.g = tabUiRootFrameLayout;
        ((z5l) yheVar.b).m = new obc(0, this, m0e.class, "onLargeRecyclerLayoutChanged", "onLargeRecyclerLayoutChanged()V", 0, (byte) 26);
        final byte b = 0;
        a26.T(pdeVar2, pdeVar, new f7f(this) { // from class: k0e
            public final /* synthetic */ m0e b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                m0e m0eVar = this.b;
                switch (b2) {
                    case 0:
                        m0eVar.b();
                        break;
                    default:
                        ((Float) obj).getClass();
                        m0eVar.b();
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T(galVar.g, pdeVar, new f7f(this) { // from class: k0e
            public final /* synthetic */ m0e b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                m0e m0eVar = this.b;
                switch (b22) {
                    case 0:
                        m0eVar.b();
                        break;
                    default:
                        ((Float) obj).getClass();
                        m0eVar.b();
                        break;
                }
            }
        });
        b0eVar.registerAdapterDataObserver(new a83(this, (byte) 10));
        new rn9(this);
        l0e l0eVar = new l0e(this);
        tabUiRootFrameLayout.g.add(new yo7((Object) this, (Object) new GestureDetector(recyclerView.getContext(), l0eVar), (Object) l0eVar, (byte) 16));
    }

    public final int a(float f) {
        txj txjVar = ((eyj) this.b.g()).l;
        if (txjVar == null) {
            return 0;
        }
        int iK = txjVar.f.k(this.e.getContext());
        return zed.b(((txjVar.e.getWidth() + iK) * f) - (iK / 2));
    }

    public final void b() {
        b0e b0eVar = this.f;
        if (((ArrayList) b0eVar.d).isEmpty()) {
            return;
        }
        yhe yheVar = this.d;
        tzd tzdVar = (tzd) nxg.n(((z5l) yheVar.b).f, new n6k((Object) yheVar, (byte) 22));
        if (Intrinsics.a(tzdVar, this.h)) {
            return;
        }
        this.h = tzdVar;
        if (tzdVar != null) {
            boolean z = tzdVar instanceof szd;
            RecyclerView recyclerView = this.e;
            if (z) {
                szd szdVar = (szd) tzdVar;
                Integer num = (Integer) ((Map) ((zyk) b0eVar.m.d).getValue()).get(Integer.valueOf(szdVar.a));
                exg.z(recyclerView, num != null ? num.intValue() : -1, a(szdVar.b));
            } else if (tzdVar instanceof rzd) {
                rzd rzdVar = (rzd) tzdVar;
                Integer num2 = (Integer) ((Map) ((zyk) b0eVar.m.c).getValue()).get(Integer.valueOf(rzdVar.a));
                exg.z(recyclerView, num2 != null ? num2.intValue() : -1, a(rzdVar.b));
            }
        }
    }
}
