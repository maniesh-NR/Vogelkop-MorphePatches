package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class cm6 implements h8f {
    public final String a;
    public final nx1 b = new nx1((byte) 1);

    public cm6(String str) {
        this.a = str;
    }

    @Override // defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) throws eva {
        nx1 nx1Var = this.b;
        if (!((yl6) nx1Var.d(context)).g()) {
            throw new eva("Not supported");
        }
        if (((yl6) nx1Var.d(context)).f()) {
            throw new eva("Already active");
        }
        if (g8fVar == g8f.a) {
            Intent intentB = mdb.b(context);
            intentB.setAction("android.intent.action.MAIN");
            intentB.addCategory("android.intent.category.LAUNCHER");
            intentB.setAction(this.a);
            intentB.setData(uri);
            context.startActivity(intentB);
        }
    }

    @Override // defpackage.h8f
    public final Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        return Boolean.valueOf(((yl6) this.b.d(context)).g());
    }

    @Override // defpackage.h8f
    public final Object c(Context context, kk6 kk6Var) {
        return Boolean.valueOf(((yl6) this.b.d(context)).f());
    }
}
