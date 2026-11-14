package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class tho extends nr9 implements Function0 {
    public final /* synthetic */ tcc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tho(tcc tccVar) {
        super(0, aib.class, "doUpgrade", "tryUpgradeToProcessLifecycleProvider$lambda$3$doUpgrade(Landroidx/lifecycle/Lifecycle;Lcom/opera/ads/internal/lifecycle/AppLifecycle;)V", 0);
        ejo ejoVar = fko.a;
        this.a = tccVar;
    }

    public final Object invoke() {
        fko.c(this.a);
        return Unit.a;
    }
}
