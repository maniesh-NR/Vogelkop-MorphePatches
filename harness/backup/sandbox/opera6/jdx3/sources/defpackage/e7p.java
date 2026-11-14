package defpackage;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.text.b;

/* loaded from: classes.dex */
public final class e7p extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ c4p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7p(c4p c4pVar, byte b) {
        super(0);
        this.i = b;
        this.j = c4pVar;
    }

    public final Object invoke() {
        Object next;
        k4p k4pVar;
        Object next2;
        j5p j5pVar;
        d5p d5pVar;
        Object next3;
        q4p q4pVar;
        Object next4;
        q4p q4pVar2;
        Object next5;
        k4p k4pVar2;
        Object next6;
        k4p k4pVar3;
        String str;
        Double dF;
        Object next7;
        k4p k4pVar4;
        byte b = this.i;
        ArrayList arrayList = null;
        c4p c4pVar = this.j;
        switch (b) {
            case 0:
                List list = (List) c4pVar.g.getValue();
                if (list == null) {
                    return null;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((n4p) next).b == 8) {
                        }
                    } else {
                        next = null;
                    }
                }
                n4p n4pVar = (n4p) next;
                if (n4pVar == null || (k4pVar = n4pVar.c) == null) {
                    return null;
                }
                return k4pVar.b;
            case 1:
                List list2 = (List) c4pVar.h.getValue();
                if (list2 == null) {
                    return null;
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (((m5p) next2).b == 9) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                m5p m5pVar = (m5p) next2;
                if (m5pVar == null || (j5pVar = m5pVar.c) == null) {
                    return null;
                }
                return j5pVar.a;
            case 2:
                ehc ehcVarB = a.b();
                ehcVarB.addAll(c4p.a(c4pVar.d, u4p.IMPRESSION));
                List list3 = c4pVar.e;
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list3) {
                        if (URLUtil.isNetworkUrl((String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    ehcVarB.addAll(arrayList2);
                }
                return a.a(ehcVarB);
            case 3:
                return c4p.a(c4pVar.d, u4p.VIEWABLE_MRC50);
            case 4:
                List list4 = c4pVar.a.c;
                if (list4 == null) {
                    return l08.a;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list4) {
                    if (URLUtil.isNetworkUrl((String) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 5:
                List list5 = c4pVar.c;
                if (list5 != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list5) {
                        if (obj3 instanceof t4p) {
                            arrayList.add(obj3);
                        }
                    }
                }
                return arrayList;
            case 6:
                List list6 = c4pVar.c;
                if (list6 != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list6) {
                        if (obj4 instanceof n4p) {
                            arrayList.add(obj4);
                        }
                    }
                }
                return arrayList;
            case 7:
                List list7 = c4pVar.c;
                if (list7 != null) {
                    arrayList = new ArrayList();
                    for (Object obj5 : list7) {
                        if (obj5 instanceof m5p) {
                            arrayList.add(obj5);
                        }
                    }
                }
                return arrayList;
            case 8:
                List list8 = c4pVar.c;
                if (list8 == null) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : list8) {
                    if (obj6 instanceof g5p) {
                        arrayList4.add(obj6);
                    }
                }
                g5p g5pVar = (g5p) CollectionsKt.firstOrNull(arrayList4);
                if (g5pVar == null || (d5pVar = g5pVar.c) == null) {
                    return null;
                }
                return d5pVar.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                List list9 = (List) c4pVar.f.getValue();
                if (list9 == null) {
                    return null;
                }
                Iterator it3 = list9.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next3 = it3.next();
                        if (((t4p) next3).b == 2) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                t4p t4pVar = (t4p) next3;
                if (t4pVar == null || (q4pVar = t4pVar.c) == null) {
                    return null;
                }
                return q4pVar.b;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                List list10 = (List) c4pVar.f.getValue();
                if (list10 == null) {
                    return null;
                }
                Iterator it4 = list10.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next4 = it4.next();
                        if (((t4p) next4).b == 3) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                t4p t4pVar2 = (t4p) next4;
                if (t4pVar2 == null || (q4pVar2 = t4pVar2.c) == null) {
                    return null;
                }
                return q4pVar2.b;
            case 11:
                List list11 = (List) c4pVar.g.getValue();
                if (list11 == null) {
                    return null;
                }
                Iterator it5 = list11.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next5 = it5.next();
                        if (((n4p) next5).b == 4) {
                        }
                    } else {
                        next5 = null;
                    }
                }
                n4p n4pVar2 = (n4p) next5;
                if (n4pVar2 == null || (k4pVar2 = n4pVar2.c) == null) {
                    return null;
                }
                return k4pVar2.b;
            case 12:
                List list12 = (List) c4pVar.g.getValue();
                if (list12 == null) {
                    return null;
                }
                Iterator it6 = list12.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next6 = it6.next();
                        if (((n4p) next6).b == 5) {
                        }
                    } else {
                        next6 = null;
                    }
                }
                n4p n4pVar3 = (n4p) next6;
                if (n4pVar3 == null || (k4pVar3 = n4pVar3.c) == null || (str = k4pVar3.b) == null || (dF = b.f(str)) == null) {
                    return null;
                }
                double dDoubleValue = dF.doubleValue();
                if (dDoubleValue <= 0.0d || dDoubleValue > 5.0d) {
                    return null;
                }
                return dF;
            default:
                List list13 = (List) c4pVar.g.getValue();
                if (list13 == null) {
                    return null;
                }
                Iterator it7 = list13.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        next7 = it7.next();
                        if (((n4p) next7).b == 6) {
                        }
                    } else {
                        next7 = null;
                    }
                }
                n4p n4pVar4 = (n4p) next7;
                if (n4pVar4 == null || (k4pVar4 = n4pVar4.c) == null) {
                    return null;
                }
                return k4pVar4.b;
        }
    }
}
