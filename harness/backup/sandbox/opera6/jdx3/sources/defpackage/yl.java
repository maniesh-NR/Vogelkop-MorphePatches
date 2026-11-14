package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class yl extends n1 {
    public final /* synthetic */ byte c = 1;
    public final Object d;
    public final Object e;

    public yl(Context context, ks3 ks3Var, i5o i5oVar) {
        super(ks3Var, (byte) 28);
        this.d = new ukf(context);
        this.e = i5oVar;
    }

    public yl(Context context, umi umiVar, tx txVar) {
        super(txVar, (byte) 28);
        this.d = new jec(100);
        xl xlVar = new xl(this, context, umiVar);
        this.e = xlVar;
        xlVar.h();
    }

    public final void H0(orb orbVar) throws JSONException {
        vpb vpbVar = new vpb();
        ((xl) this.e).i();
        jec jecVar = (jec) this.d;
        int size = jecVar.a.size();
        Iterator it = jecVar.iterator();
        while (it.hasNext()) {
            wl wlVar = (wl) it.next();
            orb orbVar2 = new orb();
            orbVar2.p(tl.a(wlVar.a), "timestamp");
            orbVar2.p(wlVar.b, "placementId");
            orbVar2.p(wlVar.c.a, "provider");
            orbVar2.p(wlVar.d, "title");
            String str = wlVar.e;
            if (str != null) {
                orbVar2.p(str, "clickUrl");
            }
            String str2 = wlVar.f;
            if (str2 != null) {
                orbVar2.p(str2, "responseId");
            }
            size--;
            try {
                vpbVar.a.put(size, orb.t(orbVar2));
            } catch (JSONException e) {
                t3p.n(e);
                return;
            }
        }
        orbVar.p(vpbVar, "adImpressions");
    }

    public final void I0(gu9 gu9Var, List list, String str) {
        int i;
        i5o i5oVar = (i5o) this.e;
        yo yoVar = yo.ADMOB;
        if (!"adx".equals(gu9Var.t)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i5oVar.j((String) it.next(), (ly) null);
            }
            return;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            String str2 = (String) it2.next();
            Uri uri = Uri.parse(str2);
            String[] strArr = wqm.a;
            String host = uri.getHost();
            if (host != null ? wqm.y(host, "opera.com") : false) {
                arrayList.add(uri.buildUpon().appendQueryParameter(str, strValueOf).build().toString());
            } else {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i5oVar.j((String) obj, (ly) null);
        }
    }

    @Override // defpackage.n1
    public final void k(yz yzVar, dl dlVar) {
        switch (this.c) {
            case 1:
                if (yzVar instanceof gu9) {
                    gu9 gu9Var = (gu9) yzVar;
                    ((ukf) this.d).b(gu9Var, 2);
                    I0(gu9Var, gu9Var.v, "clickts");
                }
                super.k(yzVar, dlVar);
                break;
            default:
                super.k(yzVar, dlVar);
                break;
        }
    }

    @Override // defpackage.n1
    public final void p(yz yzVar, dl dlVar, boolean z) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                super.p(yzVar, dlVar, z);
                xl xlVar = (xl) this.e;
                xlVar.i();
                jec jecVar = (jec) obj;
                jecVar.add(new wl(System.currentTimeMillis(), yzVar.g, yzVar.i, yzVar.n(), yzVar.f(), yzVar.l()));
                xlVar.g(CollectionsKt.k0(jecVar));
                break;
            default:
                if (yzVar instanceof gu9) {
                    gu9 gu9Var = (gu9) yzVar;
                    ((ukf) obj).b(gu9Var, 1);
                    I0(gu9Var, gu9Var.u, "impressionts");
                }
                super.p(yzVar, dlVar, z);
                break;
        }
    }
}
