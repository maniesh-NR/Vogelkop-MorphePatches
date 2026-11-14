package defpackage;

import android.content.Intent;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.ads.interactivemedia.v3.impl.data.zzbg;
import com.google.ads.interactivemedia.v3.impl.data.zzbn;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class ppp implements OnCompleteListener, ph, cpp {
    public final Object a;

    public /* synthetic */ ppp(Object obj) {
        this.a = obj;
    }

    public final HashMap a(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        Map map2 = (Map) this.a;
        for (String str : map2.keySet()) {
            if (map2.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) map2.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.EMPTY_SET;
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
    public final void k(Object obj) {
        ?? r4 = (ProxyBillingActivityV2) this.a;
        oh ohVar = (oh) obj;
        Intent intent = ohVar.b;
        int i = zzc.zzi(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = r4.k;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = ohVar.a;
        if (i2 != -1 || i != 0) {
            zzc.zzo("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        r4.finish();
    }

    public final void onComplete(Task task) {
        wpp wppVar = (wpp) this.a;
        wppVar.p = new oam(wppVar, wppVar.l, ((zzbn) wppVar.o.getTask().getResult()).enableGks ? new iuh(wppVar.g, (zzbg) wppVar.n.getTask().getResult()) : new tmj((byte) 18));
    }

    @Override // defpackage.cpp, defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        return new tup(((n0c) ((uto) this.a).b).a);
    }
}
