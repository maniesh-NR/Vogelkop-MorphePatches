package defpackage;

import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tlg extends lim {
    public final nr8 a;
    public final SettingsManager b;
    public final e8k c;
    public final u59 d;
    public final mdh e;
    public final u8k f;
    public final kze g = new kze(Boolean.FALSE);
    public final kze h = new kze(Boolean.TRUE);
    public final kze i;
    public final wq8 j;
    public final s9 k;
    public boolean l;

    public tlg(nr8 nr8Var, SettingsManager settingsManager, e8k e8kVar, u59 u59Var, mdh mdhVar, u8k u8kVar) {
        this.a = nr8Var;
        this.b = settingsManager;
        this.c = e8kVar;
        this.d = u59Var;
        this.e = mdhVar;
        this.f = u8kVar;
        u8kVar.b();
        this.i = new kze(pzj.b);
        this.j = new wq8(this, (byte) 1);
        this.k = new s9(this, (byte) 29);
    }

    public final void R() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.d.H().b;
        on7 on7Var = pn7.b;
        e8k e8kVar = this.c;
        long jF = pn7.f(cs5.x0(((Number) e8kVar.d.g()).intValue(), un7.g));
        this.b.R(((jF <= 0 || 0 > jCurrentTimeMillis || jCurrentTimeMillis > jF) && ((Boolean) e8kVar.e.g()).booleanValue()) ? 1 : 0, "speed_dial.plus_button");
    }

    public final void S() {
        boolean z = false;
        if (((Boolean) this.c.f.g()).booleanValue() && this.l && ((e) this.a).f.e.size() <= 0) {
            if (((List) this.e.h.g()) != null ? !r0.isEmpty() : false) {
                z = true;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        this.g.r(boolValueOf);
        this.h.r(Boolean.valueOf(!((Boolean) r1.g()).booleanValue()));
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.a.f(new q2g(this, ndcVar, (byte) 5));
        final byte b = 0;
        final byte b2 = 4;
        this.e.h.j(ndcVar, new t7d(new Function1(this) { // from class: slg
            public final /* synthetic */ tlg b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b;
                tlg tlgVar = this.b;
                switch (b3) {
                    case 0:
                        tlgVar.S();
                        break;
                    case 1:
                        tlgVar.S();
                        break;
                    case 2:
                        tlgVar.R();
                        break;
                    case 3:
                        tlgVar.R();
                        break;
                    default:
                        kze kzeVar = tlgVar.i;
                        tlgVar.f.b();
                        xf8.G0(kzeVar, pzj.b);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 4));
        this.b.F(this.k);
        e8k e8kVar = this.c;
        final byte b3 = 1;
        e8kVar.f.j(ndcVar, new t7d(new Function1(this) { // from class: slg
            public final /* synthetic */ tlg b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b3;
                tlg tlgVar = this.b;
                switch (b32) {
                    case 0:
                        tlgVar.S();
                        break;
                    case 1:
                        tlgVar.S();
                        break;
                    case 2:
                        tlgVar.R();
                        break;
                    case 3:
                        tlgVar.R();
                        break;
                    default:
                        kze kzeVar = tlgVar.i;
                        tlgVar.f.b();
                        xf8.G0(kzeVar, pzj.b);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 4));
        final byte b4 = 2;
        e8kVar.d.j(ndcVar, new t7d(new Function1(this) { // from class: slg
            public final /* synthetic */ tlg b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b4;
                tlg tlgVar = this.b;
                switch (b32) {
                    case 0:
                        tlgVar.S();
                        break;
                    case 1:
                        tlgVar.S();
                        break;
                    case 2:
                        tlgVar.R();
                        break;
                    case 3:
                        tlgVar.R();
                        break;
                    default:
                        kze kzeVar = tlgVar.i;
                        tlgVar.f.b();
                        xf8.G0(kzeVar, pzj.b);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 4));
        final byte b5 = 3;
        e8kVar.e.j(ndcVar, new t7d(new Function1(this) { // from class: slg
            public final /* synthetic */ tlg b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b5;
                tlg tlgVar = this.b;
                switch (b32) {
                    case 0:
                        tlgVar.S();
                        break;
                    case 1:
                        tlgVar.S();
                        break;
                    case 2:
                        tlgVar.R();
                        break;
                    case 3:
                        tlgVar.R();
                        break;
                    default:
                        kze kzeVar = tlgVar.i;
                        tlgVar.f.b();
                        xf8.G0(kzeVar, pzj.b);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 4));
        R();
        this.f.d.j(ndcVar, new t7d(new Function1(this) { // from class: slg
            public final /* synthetic */ tlg b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b2;
                tlg tlgVar = this.b;
                switch (b32) {
                    case 0:
                        tlgVar.S();
                        break;
                    case 1:
                        tlgVar.S();
                        break;
                    case 2:
                        tlgVar.R();
                        break;
                    case 3:
                        tlgVar.R();
                        break;
                    default:
                        kze kzeVar = tlgVar.i;
                        tlgVar.f.b();
                        xf8.G0(kzeVar, pzj.b);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 4));
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        if (this.l) {
            ((e) this.a).f.H(this.j);
            this.l = false;
        }
        this.b.H(this.k);
    }
}
