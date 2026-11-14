package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class eg4 implements rfb {
    public final Context a;
    public final da6 b;
    public final Object c = new Object();
    public Map d = n08.a;

    public eg4(Context context, da6 da6Var, Set set) throws s7b {
        this.a = context;
        this.b = da6Var;
        try {
            a(CollectionsKt.k0(set));
        } catch (ig4 e) {
            throw new s7b(e);
        }
    }

    @Override // defpackage.rfb
    public final void a(List list) throws ig4 {
        List<String> listK0;
        ua7 ua7Var;
        synchronized (this.c) {
            List list2 = list;
            Set setKeySet = this.d.keySet();
            if (!(setKeySet instanceof Collection)) {
                setKeySet = CollectionsKt.k0(setKeySet);
            }
            Collection collection = setKeySet;
            if (collection.isEmpty()) {
                listK0 = CollectionsKt.k0(list2);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!collection.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                listK0 = arrayList;
            }
        }
        if (!listK0.isEmpty() && gyg.G(3, "CXCP")) {
            Objects.toString(listK0);
        }
        da6 da6Var = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listK0.isEmpty()) {
            try {
                for (String str : listK0) {
                    xc4 xc4VarA = da6Var.a();
                    sd4.a(str);
                    ge4 ge4VarA = xc4VarA.d().c.a(str);
                    gf4 gf4Var = new gf4(ge4VarA, new pfk((StreamConfigurationMap) ((ma4) ge4VarA).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP), new nuf(ge4VarA)));
                    Context context = this.a;
                    i28 i28Var = new i28(str, gf4Var.a());
                    if (Build.VERSION.SDK_INT >= 35) {
                        qe4 qe4Var = (qe4) da6Var.a.d;
                        alo.l(qe4Var);
                        ua7Var = new ua7(ge4VarA, qe4Var, gf4Var, (byte) 11);
                    } else {
                        ua7Var = et8.Zo;
                    }
                    linkedHashMap.put(str, new dtk(context, ge4VarA, i28Var, ua7Var));
                }
            } catch (Exception e) {
                throw new ig4("Failed to build surface combinations", e);
            }
        }
        synchronized (this.c) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (this.d.containsKey(str2)) {
                    linkedHashMap2.put(str2, this.d.get(str2));
                }
            }
            linkedHashMap2.putAll(linkedHashMap);
            this.d = linkedHashMap2;
            if (gyg.G(3, "CXCP")) {
                linkedHashMap2.size();
            }
        }
    }
}
