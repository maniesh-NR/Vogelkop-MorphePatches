package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.autofill.AutofillId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dv4 {
    public static final nf2[] b = {nf2.SIGNUP_USERNAME, nf2.SIGNUP_PASSWORD, nf2.NAME, nf2.BIRTHDAY};
    public final boolean a;

    public dv4(ArrayList arrayList, s45 s45Var) {
        ujj ujjVar;
        AutofillId autofillId;
        AutofillId autofillId2;
        AutofillId autofillId3;
        AutofillId autofillId4;
        boolean z;
        Serializable serializable;
        Bundle bundle = s45Var.a;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                serializable = t8.z(bundle);
            } else {
                serializable = bundle.getSerializable("com.opera.android.autofill.EXTRA_SIGNUP_DATA");
                if (!ujj.class.isInstance(serializable)) {
                    serializable = null;
                }
            }
            ujjVar = (ujj) serializable;
        } else {
            ujjVar = null;
        }
        if (ujjVar == null) {
            ujjVar = new ujj();
            ujjVar.a = null;
            ujjVar.b = null;
            ujjVar.c = null;
            ujjVar.d = null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o95.t(e82.B(((k2g) obj).b()), arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            nf2 nf2Var = ((vz8) obj2).c;
            Object arrayList3 = linkedHashMap.get(nf2Var);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(nf2Var, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        nf2 nf2Var2 = nf2.PASSWORD;
        l08 l08Var = l08.a;
        List list = (List) linkedHashMap.getOrDefault(nf2Var2, l08Var);
        vz8 vz8Var = (vz8) CollectionsKt.R(list);
        vz8 vz8Var2 = (vz8) CollectionsKt.R((List) linkedHashMap.getOrDefault(nf2.SIGNUP_PASSWORD, l08Var));
        vz8 vz8Var3 = (vz8) CollectionsKt.R((List) linkedHashMap.getOrDefault(nf2.NAME, l08Var));
        vz8 vz8Var4 = (vz8) CollectionsKt.R((List) linkedHashMap.getOrDefault(nf2.BIRTHDAY, l08Var));
        List<Pair> listAsList = Arrays.asList(new Pair(vz8Var2, ujjVar.b), new Pair(vz8Var3, ujjVar.c), new Pair(vz8Var4, ujjVar.d));
        boolean z2 = listAsList instanceof Collection;
        if (!z2 || !listAsList.isEmpty()) {
            Iterator it = listAsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Pair) it.next()).b != null) {
                    if (vz8Var != null && ujjVar.a == null) {
                        ujjVar.a = vz8Var.a.toString();
                        Bundle bundle2 = s45Var.a;
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                            s45Var.a = bundle2;
                        }
                        bundle2.putSerializable("com.opera.android.autofill.EXTRA_SIGNUP_DATA", ujjVar);
                        this.a = true;
                        return;
                    }
                }
            }
        }
        if (!z2 || !listAsList.isEmpty()) {
            for (Pair pair : listAsList) {
                vz8 vz8Var5 = (vz8) pair.a;
                if (vz8Var5 != null && !Intrinsics.a(vz8Var5.a.toString(), pair.b)) {
                    ujjVar.a = (vz8Var == null || (autofillId4 = vz8Var.a) == null) ? null : autofillId4.toString();
                    ujjVar.b = (vz8Var2 == null || (autofillId3 = vz8Var2.a) == null) ? null : autofillId3.toString();
                    ujjVar.c = (vz8Var3 == null || (autofillId2 = vz8Var3.a) == null) ? null : autofillId2.toString();
                    ujjVar.d = (vz8Var4 == null || (autofillId = vz8Var4.a) == null) ? null : autofillId.toString();
                    Bundle bundle3 = s45Var.a;
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                        s45Var.a = bundle3;
                    }
                    bundle3.putSerializable("com.opera.android.autofill.EXTRA_SIGNUP_DATA", ujjVar);
                    this.a = true;
                    return;
                }
            }
        }
        if (!z2 || !listAsList.isEmpty()) {
            Iterator it2 = listAsList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((Pair) it2.next()).a != null) {
                    if (list.size() >= 2) {
                        if (Intrinsics.a(ujjVar.a, String.valueOf(vz8Var != null ? vz8Var.a : null))) {
                            this.a = true;
                            return;
                        }
                    }
                    if (!Intrinsics.a(ujjVar.a, String.valueOf(vz8Var != null ? vz8Var.a : null)) && vz8Var != null && vz8Var.e) {
                        this.a = false;
                        return;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            z = false;
        } else {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                if (e82.o(b, ((vz8) obj3).c)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.a = z;
    }
}
