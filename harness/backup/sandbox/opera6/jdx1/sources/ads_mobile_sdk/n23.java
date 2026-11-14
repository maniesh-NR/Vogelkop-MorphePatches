package ads_mobile_sdk;

import android.content.Intent;
import defpackage.ato;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class n23 implements ato {
    public final ax0 a;

    public n23(ax0 ax0Var) {
        this.a = ax0Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("text");
        String str2 = (String) map.get("title");
        if (str == null || StringsKt.N(str)) {
            return Unit.a;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null && !StringsKt.N(str2)) {
            intent.putExtra("android.intent.extra.TITLE", str2);
        }
        this.a.a(intent);
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 43;
    }
}
