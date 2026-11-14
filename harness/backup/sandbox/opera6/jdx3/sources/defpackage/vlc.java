package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class vlc implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wlc b;
    public final /* synthetic */ List c;

    public /* synthetic */ vlc(wlc wlcVar, List list, byte b) {
        this.a = b;
        this.b = wlcVar;
        this.c = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.c;
        wlc wlcVar = this.b;
        osk oskVar = (osk) obj;
        switch (b) {
            case 0:
                wlcVar.b.P(oskVar, list);
                break;
            default:
                wlcVar.g.P(oskVar, list);
                break;
        }
        return Unit.a;
    }
}
