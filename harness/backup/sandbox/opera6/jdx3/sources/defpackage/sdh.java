package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.android.favorites.PushedSpeedDialFavorite;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sdh extends ns8 {
    public final mdh B;
    public final qdh C;
    public final orm D;
    public final skm E;
    public final tlg F;

    public sdh(mdh mdhVar, qdh qdhVar, tq8 tq8Var, SettingsManager settingsManager, tta ttaVar, boolean z, orm ormVar, skm skmVar, qr8 qr8Var, nv2 nv2Var, tlg tlgVar, p6l p6lVar) {
        super(tq8Var, settingsManager, false, null, ttaVar, true, z, skmVar, qr8Var, nv2Var, tlgVar, null, p6lVar);
        this.B = mdhVar;
        this.C = qdhVar;
        this.D = ormVar;
        this.E = skmVar;
        this.F = tlgVar;
    }

    @Override // defpackage.ns8
    public final List H(Context context, final hq8 hq8Var) {
        if (hq8Var == null) {
            return null;
        }
        if (hq8Var instanceof kdh) {
            final byte b = 0;
            return Collections.singletonList(new gtd(new rxh(2132020200), new lxh(2131231967), new View.OnClickListener(this) { // from class: rdh
                public final /* synthetic */ sdh b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    lqm lqmVar = lqm.f;
                    hq8 hq8Var2 = hq8Var;
                    sdh sdhVar = this.b;
                    switch (b2) {
                        case 0:
                            sdhVar.P(hq8Var2, lqmVar);
                            sdhVar.b0(hq8Var2);
                            break;
                        default:
                            sdhVar.P(hq8Var2, lqmVar);
                            sdhVar.b0(hq8Var2);
                            break;
                    }
                }
            }));
        }
        if (!(hq8Var instanceof PushedSpeedDialFavorite)) {
            return null;
        }
        final byte b2 = 1;
        return Arrays.asList(new gtd(new rxh(2132020200), new lxh(2131231967), new View.OnClickListener(this) { // from class: rdh
            public final /* synthetic */ sdh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                lqm lqmVar = lqm.f;
                hq8 hq8Var2 = hq8Var;
                sdh sdhVar = this.b;
                switch (b22) {
                    case 0:
                        sdhVar.P(hq8Var2, lqmVar);
                        sdhVar.b0(hq8Var2);
                        break;
                    default:
                        sdhVar.P(hq8Var2, lqmVar);
                        sdhVar.b0(hq8Var2);
                        break;
                }
            }
        }), new gtd(new rxh(2132018535), new lxh(2131232064), new dv2(this, context, hq8Var, (byte) 6)));
    }

    @Override // defpackage.ns8
    public final void I(Context context, hq8 hq8Var) {
        if (hq8Var instanceof PushedSpeedDialFavorite) {
            PushedSpeedDialFavorite pushedSpeedDialFavorite = (PushedSpeedDialFavorite) hq8Var;
            sfe.u0(this.E, pushedSpeedDialFavorite.e, sfe.W(pushedSpeedDialFavorite), 0L, 4);
            x5f x5fVar = (x5f) this.D;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                am2.g(zpaVar, x56VarF).b.p(38, 1, 1L);
                x5fVar.U0(x56VarF);
            }
            mdh mdhVar = this.B;
            pdh pdhVar = mdhVar.b;
            h42 h42Var = mdhVar.h;
            pdhVar.b(pushedSpeedDialFavorite.e.a);
            l08 l08Var = (List) h42Var.g();
            if (l08Var == null) {
                l08Var = l08.a;
            }
            if (Intrinsics.a(l08Var, Collections.singletonList(pushedSpeedDialFavorite))) {
                pdhVar.c();
                mdhVar.c();
            }
            h42Var.r(mdhVar.a());
            mdhVar.c.e();
        }
    }

    @Override // defpackage.ns8
    public final void M(e eVar, hq8 hq8Var) {
        b0(hq8Var);
        eVar.k(hq8Var);
    }

    @Override // defpackage.ns8
    public final void T() {
        if (this.c.i0()) {
            tlg tlgVar = this.F;
            tlgVar.g.p(this.v);
            tlgVar.i.p(this.w);
        }
    }

    @Override // defpackage.ns8
    public final void W() {
        if (this.c.i0()) {
            tlg tlgVar = this.F;
            tlgVar.g.k(this.v);
            tlgVar.i.k(this.w);
        }
    }

    public final void b0(hq8 hq8Var) {
        if (hq8Var != null) {
            if (hq8Var instanceof kdh) {
                ArrayList arrayList = ((kdh) hq8Var).e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    b0((hq8) obj);
                }
                return;
            }
            if (hq8Var instanceof PushedSpeedDialFavorite) {
                PushedSpeedDialFavorite pushedSpeedDialFavorite = (PushedSpeedDialFavorite) hq8Var;
                tqi tqiVar = pushedSpeedDialFavorite.e;
                qdh qdhVar = this.C;
                qdhVar.getClass();
                qdhVar.a(tqiVar, idh.a);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sfe.u0(this.E, pushedSpeedDialFavorite.e, sfe.W(pushedSpeedDialFavorite), jCurrentTimeMillis, 2);
            }
        }
    }
}
