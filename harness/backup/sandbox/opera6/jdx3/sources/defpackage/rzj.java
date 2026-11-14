package defpackage;

import com.leanplum.messagetemplates.SubscriptionOffersKt;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class rzj implements Callback {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Callback b;
    public final /* synthetic */ List c;

    public /* synthetic */ rzj(Callback callback, List list) {
        this.b = callback;
        this.c = list;
    }

    public /* synthetic */ rzj(d7h d7hVar, Callback callback, List list) {
        this.b = callback;
        this.c = list;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        List<hq8> list = this.c;
        Callback callback = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (hq8 hq8Var : list) {
                    arrayList.add(new jzj(hq8Var.i(p6l.a), hq8Var.h(), ((Long) map.get(hq8Var.i(r4))).longValue(), hq8Var.g()));
                }
                arrayList.sort(new omj((byte) 6));
                callback.run(arrayList);
                break;
            default:
                SubscriptionOffersKt.verifyOffersApplied$lambda$0(callback, list, (ylk) obj);
                break;
        }
    }
}
