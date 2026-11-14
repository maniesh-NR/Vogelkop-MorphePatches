package ads_mobile_sdk;

import defpackage.ybh;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class bn3 extends kuk implements Function2 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ bz0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bn3(Map map, bz0 bz0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = map;
        this.b = bz0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        bz0 bz0Var = this.b;
        Map map = this.a;
        switch (b) {
            case 0:
                return new bn3(map, bz0Var, mt5Var, (byte) 0);
            default:
                return new bn3(map, bz0Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        bz0 bz0Var = this.b;
        Map map = this.a;
        switch (b) {
            case 0:
                return new bn3(map, bz0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new bn3(map, bz0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        switch (this.t) {
            case 0:
                cd5 cd5Var = this.b.e;
                px5 px5Var = px5.a;
                ybh.y(obj);
                Map map = this.a;
                String str = (String) map.get("src");
                if (str != null && !StringsKt.N(str)) {
                    cd5Var.j0(str);
                    break;
                } else {
                    xh3.a("Src parameter missing from video GMSG: " + map, null, 6);
                    cd5Var.j0((Object) null);
                    break;
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                String str2 = (String) this.a.get("currentTime");
                if (str2 != null) {
                    try {
                        bz0 bz0Var = this.b;
                        Float.parseFloat(str2);
                        synchronized (bz0Var.f) {
                        }
                    } catch (NumberFormatException e) {
                        xh3.a("Could not parse currentTime from timeupdate video GMSG: ".concat(str2), e, 4);
                    }
                    break;
                } else {
                    xh3.a("CurrentTime parameter missing from timeupdate video GMSG: " + this.a, null, 6);
                    break;
                }
        }
        return Unit.a;
    }
}
