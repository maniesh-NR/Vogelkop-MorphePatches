package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class epo {
    public static volatile AdvertisingIdClient.Info a;

    public static final Object a(Context context, kuk kukVar) {
        Context applicationContext = context.getApplicationContext();
        cv6 cv6Var = bb7.a;
        Object objZ = na2.Z(mr6.b, new nmo(applicationContext, null), kukVar);
        return objZ == px5.a ? objZ : Unit.a;
    }
}
