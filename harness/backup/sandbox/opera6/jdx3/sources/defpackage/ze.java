package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ze implements h8f {
    public final int a;

    public ze(int i) {
        this.a = i;
    }

    @Override // defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) throws fva {
        if (i != 0) {
            throw new fva("Illegal source");
        }
        if (g8fVar == g8f.a) {
            Intent intentB = mdb.b(context);
            intentB.setAction("android.intent.action.MAIN");
            intentB.addCategory("android.intent.category.LAUNCHER");
            intentB.putExtra("ACTION_DEEPLINK_ID", (int) v0g.b(this.a));
            intentB.setAction("ACTION_DEEPLINK_ACTION");
            context.startActivity(intentB);
        }
    }
}
