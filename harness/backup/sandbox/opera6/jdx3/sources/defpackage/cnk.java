package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class cnk {
    public final Context a;
    public final umi b;
    public final mgh c;
    public List f;
    public oml g;
    public boolean h;
    public final Object e = new Object();
    public final CountDownLatch d = new CountDownLatch(1);

    public cnk(Context context, umi umiVar, mgh mghVar) {
        this.a = context.getApplicationContext();
        this.b = umiVar;
        this.c = mghVar;
        umiVar.c(new xmk(this, (byte) 0)).a(null);
    }

    public static ArrayList c(vpb vpbVar) {
        JSONArray jSONArray = vpbVar.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            orb orbVarC = vpbVar.c(i);
            vpb vpbVarB = orbVarC.b("locations");
            JSONArray jSONArray2 = vpbVarB.a;
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                orb orbVarC2 = vpbVarB.c(i2);
                arrayList2.add(new ank(orbVarC2.e(Constants.Params.NAME), orbVarC2.e("display_name")));
            }
            arrayList.add(new bnk(orbVarC.e("country_code"), orbVarC.e("display_name"), h1b.s(arrayList2)));
        }
        return arrayList;
    }

    public final List a(Map map) throws InterruptedException {
        List list;
        try {
            this.d.await();
            synchronized (this.e) {
                list = this.f;
            }
            if (map == null) {
                return list;
            }
            ArrayList arrayList = null;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                bnk bnkVar = (bnk) list.get(i2);
                String str = bnkVar.a;
                h1b h1bVar = bnkVar.c;
                List list2 = (List) map.get(str);
                if (list2 == null) {
                    list2 = Collections.EMPTY_LIST;
                }
                ArrayList arrayList2 = null;
                for (int i3 = 0; i3 < h1bVar.size(); i3++) {
                    ank ankVar = (ank) h1bVar.get(i3);
                    if (list2.contains(ankVar.a)) {
                        i++;
                        if (arrayList2 != null) {
                            arrayList2.add(ankVar);
                        }
                    } else if (arrayList2 == null) {
                        arrayList2 = new ArrayList((Collection) h1bVar.B(0, i3));
                    }
                }
                if (arrayList2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(list.subList(0, i2));
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new bnk(bnkVar.a, bnkVar.b, h1b.s(arrayList2)));
                    }
                } else if (arrayList != null) {
                    arrayList.add(bnkVar);
                }
            }
            if (i < map.size()) {
                nv6 nv6VarB = ru9.c(this.a).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn.subscription_locations_outdated", true);
                nv6VarB.w();
            }
            return arrayList == null ? list : arrayList;
        } catch (InterruptedException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public final void b() {
        vpb vpbVar;
        umi umiVar = this.b;
        mgh mghVar = this.c;
        String strW = scd.w(Locale.getDefault());
        dnk dnkVar = (dnk) ((hv1) mghVar.b).get();
        if (dnkVar.b.length() == 0) {
            vpbVar = null;
        } else {
            fvh fvhVar = new fvh();
            String string = dnkVar.a.toString();
            rma rmaVar = new rma((byte) 4);
            rmaVar.o(string, null);
            fvhVar.a = rmaVar.d().i("api/v1/vpn/xv/locations").g().d();
            fvhVar.d("Accept-Language", strW);
            fvhVar.d("Authorization", "Token ".concat(dnkVar.b));
            vpbVar = (vpb) vtp.R(((t9f) ((ii) mghVar.c).get()).c(new kvh(fvhVar)), new r4k((byte) 9), new r4k((byte) 10), 0, 0L, 120);
        }
        if (vpbVar == null) {
            ymk ymkVar = new ymk(this, (byte) 1);
            umiVar.getClass();
            umiVar.f(new crk(ymkVar, (byte) 9)).a(null);
            return;
        }
        try {
            List listUnmodifiableList = Collections.unmodifiableList(c(vpbVar));
            umiVar.e(new txi(this, (byte) 21)).a(vpbVar);
            synchronized (this.e) {
                this.f = listUnmodifiableList;
            }
            this.d.countDown();
        } catch (JSONException unused) {
        }
    }
}
