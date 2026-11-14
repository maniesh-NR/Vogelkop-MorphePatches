package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class q37 implements h8f {
    public final int a;
    public final int[] b;

    public q37(int i, int... iArr) {
        this.a = i;
        this.b = iArr;
    }

    @Override // defpackage.h8f
    public void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) {
        if (g8fVar == g8f.a) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            Intent intentB = mdb.b(context);
            intentB.setAction("android.intent.action.MAIN");
            intentB.addCategory("android.intent.category.LAUNCHER");
            intentB.putExtras(bundle);
            int[] iArr = this.b;
            if (iArr.length > 0) {
                intentB.putExtra("VIEWS_TO_HIGHLIGHT", iArr);
            }
            intentB.putExtra("DESTINATION_VIEW_ID", (int) j7c.f(this.a));
            intentB.setAction("ACTION_DESTINATION_VIEW");
            context.startActivity(intentB);
        }
    }
}
