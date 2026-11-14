package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class av implements h8f {
    public final /* synthetic */ byte a;

    public /* synthetic */ av(byte b) {
        this.a = b;
    }

    @Override // defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) throws fva, eva {
        switch (this.a) {
            case 0:
                if (g8fVar == g8f.a) {
                    Intent intentB = mdb.b(context);
                    intentB.setAction("android.intent.action.MAIN");
                    intentB.addCategory("android.intent.category.LAUNCHER");
                    intentB.setAction("ACTION_ADD_SPEED_DIAL");
                    context.startActivity(intentB);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("ofa_cb");
                String string = str != null ? StringsKt.l0(str).toString() : null;
                if (string == null || string.length() == 0) {
                    throw new eva("ofa_cb argument missing");
                }
                if (g8fVar == g8f.a) {
                    ac8.b(new sk5(string));
                    return;
                }
                return;
            case 2:
                if (i != 0) {
                    throw new fva(sko.i(i, "Invalid deep link source: "));
                }
                boolean zEquals = "true".equals(map.get("activate"));
                if (g8fVar == g8f.a) {
                    Intent intentB2 = mdb.b(context);
                    intentB2.setAction("android.intent.action.MAIN");
                    intentB2.addCategory("android.intent.category.LAUNCHER");
                    intentB2.setAction("com.opera.android.FREE_DATA");
                    intentB2.putExtra("com.opera.android.EXTRA_ENABLE_COMPRESSION", zEquals);
                    context.startActivity(intentB2);
                    return;
                }
                return;
            case 3:
                if (g8fVar == g8f.a) {
                    vml.c(new et2(btb.c(9, (String) map.get("source"), (String) map.get("campaign")), (byte) 3));
                    return;
                }
                return;
            case 4:
                String str2 = (String) map.get("cat");
                boolean z = Boolean.parseBoolean((String) map.get("enable_news"));
                if (g8fVar == g8f.a) {
                    ac8.a(new aqe(str2, z));
                    return;
                }
                return;
            default:
                if (g8fVar == g8f.a) {
                    Intent intentB3 = mdb.b(context);
                    intentB3.setAction("android.intent.action.MAIN");
                    intentB3.addCategory("android.intent.category.LAUNCHER");
                    intentB3.setAction("ACTION_SHOW_OMNIBAR");
                    context.startActivity(intentB3);
                    return;
                }
                return;
        }
    }
}
