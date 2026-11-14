package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class xtm implements p5j, mo7 {
    public final xnh a;
    public final SettingsManager b;
    public final qfb c;
    public final x5f d;
    public final osf e;
    public boolean f;

    public xtm(SettingsManager settingsManager, xnh xnhVar, qfb qfbVar, x5f x5fVar, osf osfVar) {
        this.b = settingsManager;
        this.a = xnhVar;
        this.c = qfbVar;
        this.d = x5fVar;
        this.e = osfVar;
        settingsManager.F(this);
        xnhVar.F(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        switch (str) {
            case "personalized_ads":
            case "personalized_news":
            case "process_location":
            case "process_news_topics":
            case "collect_website_categories":
            case "personalized_default":
            case "ga_usage_statistics":
                a();
                break;
        }
    }

    public final void a() {
        x5f x5fVar = this.d;
        zpa zpaVar = x5fVar.d;
        osf osfVar = this.e;
        qie qieVar = osfVar.d;
        umi umiVar = osfVar.a;
        mgh mghVar = osfVar.e;
        psp pspVar = osfVar.b;
        if (this.f) {
            SettingsManager settingsManager = this.b;
            boolean zI = settingsManager.I();
            boolean zU = settingsManager.u("personalized_ads");
            boolean zU2 = settingsManager.u("personalized_news");
            byte b = 1;
            if (zI) {
                if (!((wnh) this.a.i()).a(2)) {
                    x56 x56VarF = zpa.F();
                    x56VarF.x(zpaVar).r(5, 1, zU);
                    x5fVar.U0(x56VarF);
                    t56 t56VarF = psp.f();
                    new yj0(pspVar, t56VarF).a().a.r(5, 1, zU);
                    if (!mghVar.c(t56VarF)) {
                        new rml(Unit.a, umiVar).a(new msf(osfVar, b)).m(qieVar);
                    }
                }
                x56 x56VarF2 = zpa.F();
                x56VarF2.x(zpaVar).r(6, 1, zU2);
                x5fVar.U0(x56VarF2);
                t56 t56VarF2 = psp.f();
                new yj0(pspVar, t56VarF2).a().a.r(6, 1, zU2);
                if (!mghVar.c(t56VarF2)) {
                    new rml(Unit.a, umiVar).a(new msf(osfVar, b)).m(qieVar);
                }
            }
            boolean zI2 = settingsManager.i("ga_usage_statistics");
            boolean zI3 = settingsManager.i("collect_website_categories");
            boolean zI4 = settingsManager.i("process_news_topics");
            boolean zI5 = settingsManager.i("process_location");
            t56 t56VarF3 = psp.f();
            byte b2 = 1;
            new yj0(pspVar, t56VarF3).a().a.r(0, 1, zI2);
            if (!mghVar.c(t56VarF3)) {
                new rml(Unit.a, umiVar).a(new msf(osfVar, b2)).m(qieVar);
            }
            x56 x56VarF3 = zpa.F();
            x56VarF3.x(zpaVar).r(2, 1, zI3);
            x5fVar.U0(x56VarF3);
            t56 t56VarF4 = psp.f();
            new yj0(pspVar, t56VarF4).a().a.r(2, 1, zI3);
            if (!mghVar.c(t56VarF4)) {
                new rml(Unit.a, umiVar).a(new msf(osfVar, b2)).m(qieVar);
            }
            x56 x56VarF4 = zpa.F();
            x56VarF4.x(zpaVar).r(9, 1, zI4);
            x5fVar.U0(x56VarF4);
            t56 t56VarF5 = psp.f();
            new yj0(pspVar, t56VarF5).a().a.r(8, 1, zI4);
            if (!mghVar.c(t56VarF5)) {
                new rml(Unit.a, umiVar).a(new msf(osfVar, b2)).m(qieVar);
            }
            x56 x56VarF5 = zpa.F();
            x56VarF5.x(zpaVar).r(10, 1, zI5);
            x5fVar.U0(x56VarF5);
            t56 t56VarF6 = psp.f();
            new yj0(pspVar, t56VarF6).a().a.r(9, 1, zI5);
            if (!mghVar.c(t56VarF6)) {
                new rml(Unit.a, umiVar).a(new msf(osfVar, b2)).m(qieVar);
            }
            qfb qfbVar = this.c;
            qfbVar.n(1L, zI2);
            qfbVar.n(16L, zI3);
            qfbVar.n(128L, zI4);
            qfbVar.n(256L, zI5);
            if (zI) {
                qfbVar.n(2L, zU);
                qfbVar.n(4L, zU2);
            }
        }
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        this.f = true;
        a();
    }
}
