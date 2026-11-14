package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class jp4 extends lze {
    public final hb6 c;
    public final ip4 d;

    public jp4(Context context, ip4 ip4Var) {
        super(ip4Var);
        this.c = new hb6(context, (byte) 0);
        this.d = ip4Var;
    }

    @Override // defpackage.lze
    public final void b(Object obj) throws JSONException {
        fp4 fp4Var = (fp4) obj;
        hb6 hb6Var = this.c;
        d5o d5oVarD = hb6Var.d();
        SharedPreferences sharedPreferences = hb6Var.a;
        if (d5oVarD != null) {
            d(fp4Var, d5oVarD);
            sharedPreferences.edit().remove("categories").remove("subscribed_categories").apply();
        }
        d5o d5oVarB = hb6Var.b();
        if (d5oVarB != null) {
            d(fp4Var, d5oVarB);
            sharedPreferences.edit().remove("ordered_all_categories").remove("user_reordered_category_codes").remove("user_subscribed_category_codes").remove("user_subscribed_unlisted_category_codes").remove("user_unsubscribed_category_codes").apply();
        }
    }

    public final void d(fp4 fp4Var, d5o d5oVar) {
        yqe yqeVar;
        ArrayList arrayList = (ArrayList) d5oVar.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        HashSet hashSet = (HashSet) d5oVar.b;
        HashSet hashSet2 = new HashSet(hashSet.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Iterator it = fp4Var.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    yqeVar = (yqe) it.next();
                    if (yqeVar.a.equals(str)) {
                        break;
                    }
                } else {
                    yqeVar = null;
                    break;
                }
            }
            if (yqeVar != null) {
                arrayList2.add(yqeVar);
                if (hashSet.contains(str)) {
                    hashSet2.add(yqeVar);
                }
            }
        }
        for (yqe yqeVar2 : fp4Var.e) {
            if (yqeVar2.c && !((Set) d5oVar.c).contains(yqeVar2.a)) {
                hashSet2.add(yqeVar2);
            }
        }
        this.d.g(arrayList2, hashSet2);
    }
}
