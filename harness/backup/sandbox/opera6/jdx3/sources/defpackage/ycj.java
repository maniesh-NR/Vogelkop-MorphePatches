package defpackage;

import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class ycj implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zcj b;
    public final /* synthetic */ Intent c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ ycj(zcj zcjVar, Intent intent, HashMap map, byte b) {
        this.a = b;
        this.b = zcjVar;
        this.c = intent;
        this.d = map;
    }

    public final Object get() {
        byte b = this.a;
        HashMap map = this.d;
        Intent intent = this.c;
        zcj zcjVar = this.b;
        switch (b) {
            case 0:
                oji ojiVar = zcjVar.d;
                zcjVar.b(intent, map);
                return ojiVar.F(map, "priority DESC", null, true);
            default:
                oji ojiVar2 = zcjVar.d;
                zcjVar.b(intent, map);
                return ojiVar2.F(map, "time DESC", "time > 0", false);
        }
    }
}
