package defpackage;

import android.content.Context;
import android.content.Intent;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class ny1 {
    public final Context a;
    public final umi b;

    public ny1(Context context, umi umiVar) {
        this.a = context;
        this.b = umiVar;
    }

    public final void a(final Context context, final Callback callback) {
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").setType("*/*").addCategory("android.intent.category.OPENABLE").putExtra("android.intent.extra.MIME_TYPES", (String[]) u92.e.toArray(new String[0])).putExtra("android.intent.extra.LOCAL_ONLY", true);
        ((hjf) oi.d(context)).D(intentPutExtra, new ni() { // from class: my1
            @Override // defpackage.ni
            public final void a(int i, Intent intent) {
                if (i != -1 || intent == null || intent.getData() == null) {
                    return;
                }
                new rml(intent.getData(), this.a.b).b(new iv0(context, (byte) 2)).t(new z3((Object) callback, (byte) 26)).l();
            }
        });
    }
}
