package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nmo extends kuk implements Function2 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Context v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmo(Context context, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = context;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        nmo nmoVar = new nmo(this.v, mt5Var);
        nmoVar.u = obj;
        return nmoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        AdvertisingIdClient.Info q0iVar;
        px5 px5Var = px5.a;
        boolean z = this.t;
        try {
            if (!z) {
                ybh.y(obj);
                Context context = this.v;
                p0i p0iVar = t0i.b;
                on7 on7Var = pn7.b;
                long jX0 = cs5.x0(10, un7.e);
                fmo fmoVar = new fmo(context, null);
                this.t = true;
                obj = uyg.x(jX0, fmoVar, this);
                if (obj == px5Var) {
                    return px5Var;
                }
            } else {
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
            }
            q0iVar = (AdvertisingIdClient.Info) obj;
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (q0iVar == null) {
            throw new IOException("GMS advertising ID connection timed out");
        }
        p0i p0iVar3 = t0i.b;
        uyg.h(q0iVar);
        Context context2 = this.v;
        Throwable thD = t0i.d(q0iVar);
        if (thD != null) {
            try {
                ContentResolver contentResolver = context2.getContentResolver();
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                if (string == null) {
                    throw thD;
                }
                String str = string.length() > 0 ? string : null;
                if (str == null) {
                    throw thD;
                }
                q0iVar = new AdvertisingIdClient.Info(str, Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
            } catch (Throwable th2) {
                p0i p0iVar4 = t0i.b;
                q0iVar = new q0i(th2);
            }
        }
        if (!(q0iVar instanceof q0i)) {
            epo.a = q0iVar;
        }
        return new t0i(q0iVar);
    }
}
