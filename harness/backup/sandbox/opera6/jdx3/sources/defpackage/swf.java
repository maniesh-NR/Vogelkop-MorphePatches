package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.internal.j;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class swf {
    public final ni6 a;
    public final x5f b;
    public final bf9 c;
    public final SettingsManager d;
    public ArrayList e;
    public final HashSet f;
    public final i7f g;

    public swf(ni6 ni6Var, x5f x5fVar, bf9 bf9Var, SettingsManager settingsManager) throws NumberFormatException {
        yqa yqaVar;
        Object next;
        this.a = ni6Var;
        this.b = x5fVar;
        this.c = bf9Var;
        this.d = settingsManager;
        byte b = 2;
        this.e = wxe.C(bf9Var.t() && bf9Var.r() >= 2 && settingsManager.i("my_flow_visible"));
        qwf[] qwfVarArr = {qwf.o};
        HashSet hashSet = new HashSet(qbd.a(1));
        e82.A(qwfVarArr, hashSet);
        this.f = hashSet;
        this.g = new i7f();
        b59 b59Var = ni6Var.a;
        String string = ((SharedPreferences) b59Var.get()).getString("order", "");
        if (TextUtils.isEmpty(string)) {
            yqaVar = null;
        } else {
            String[] strArrSplit = string.split(";");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            HashSet hashSet2 = new HashSet();
            try {
                for (String str : strArrSplit) {
                    int i = Integer.parseInt(str);
                    int iAbs = Math.abs(i);
                    Iterator it = Arrays.asList(qwf.values()).iterator();
                    it.getClass();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((qwf) next).b == iAbs) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    qwf qwfVar = (qwf) next;
                    if (qwfVar != null) {
                        arrayList.add(qwfVar);
                        if (i < 0 && qwf.k(qwfVar)) {
                            hashSet2.add(qwfVar);
                        }
                    }
                }
                yqaVar = new yqa(arrayList, hashSet2);
            } catch (NumberFormatException unused) {
                j.a((SharedPreferences) b59Var.get(), "order");
            }
        }
        uk0 uk0Var = uk0.b;
        if (yqaVar != null) {
            HashSet hashSet3 = this.f;
            Set set = (Set) yqaVar.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set) {
                if (this.e.contains((qwf) obj)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayListA = !arrayList2.isEmpty() ? arrayList2 : null;
            arrayListA = arrayListA == null ? a() : arrayListA;
            hashSet3.clear();
            hashSet3.addAll(arrayListA);
            ni6Var.c(this.e, arrayListA);
            if (!b()) {
                x5fVar.E0(uk0Var);
            }
        } else {
            x5fVar.E0(uk0Var);
        }
        this.g.b(new hw9(this, (byte) 1));
        this.c.F(new j99(this, b));
    }

    public final ArrayList a() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (this.f.contains((qwf) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final boolean b() {
        if (!a().isEmpty()) {
            r16 r16Var = qhj.e;
            qwf qwfVar = (qwf) CollectionsKt.K(a());
            r16Var.getClass();
            qhj[] qhjVarArrValues = qhj.values();
            int iA = qbd.a(qhjVarArrValues.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (qhj qhjVar : qhjVarArrValues) {
                linkedHashMap.put(qhjVar.a, qhjVar);
            }
            if (linkedHashMap.containsKey(qwfVar)) {
                r16 r16Var2 = qhj.e;
                qwf qwfVar2 = (qwf) CollectionsKt.K(a());
                r16Var2.getClass();
                this.b.E0(r16.p(qwfVar2).d);
                return true;
            }
        }
        return false;
    }
}
