package ads_mobile_sdk;

import defpackage.avj;
import defpackage.cpo;
import defpackage.fjp;
import defpackage.flp;
import defpackage.hzo;
import defpackage.o95;
import defpackage.r1p;
import defpackage.yso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class sd2 extends ozb implements Function1 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ae2 b;
    public final /* synthetic */ av2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(ArrayList arrayList, ae2 ae2Var, av2 av2Var, long j, String str, String str2, String str3) {
        super(1);
        this.a = arrayList;
        this.b = ae2Var;
        this.c = av2Var;
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final Object invoke(Object obj) {
        av2 av2Var;
        boolean z;
        int i;
        Object next;
        h6 h6Var;
        rg3 rg3VarA;
        h1 h1Var;
        av2 av2Var2;
        int i2;
        boolean z2;
        Object objRemove;
        Object next2;
        Object next3;
        fe2 fe2Var;
        h1 h1Var2 = (h1) obj;
        ArrayList arrayList = this.a;
        arrayList.clear();
        av2 av2Var3 = this.c;
        String strName = av2Var3.name();
        ds0 ds0VarP = (ds0) h1Var2.u().get(strName);
        if (ds0VarP == null) {
            ds0VarP = ds0.p();
        }
        Map mapO = ds0VarP.o();
        ae2 ae2Var = this.b;
        long j = this.d;
        LinkedHashMap linkedHashMapA = ae2Var.a(mapO, j, arrayList);
        hzo hzoVar = (hzo) h1Var2.n();
        if (linkedHashMapA.isEmpty()) {
            hzoVar.e();
            hzoVar.b(strName);
        } else {
            hzoVar.e();
            yso ysoVarR = ds0.r();
            ysoVarR.e();
            ysoVarR.b$1();
            ((ds0) ysoVarR.b).q().putAll(linkedHashMapA);
            hzoVar.c(strName, (ds0) ysoVarR.a());
        }
        h1 h1VarA = (h1) hzoVar.a();
        boolean z3 = true;
        int iA = ae2Var.a(av2Var3) - 1;
        String strName2 = av2Var3.name();
        ds0 ds0Var = (ds0) h1VarA.u().get(strName2);
        fw0 fw0Var = fw0.CUI_NAME_PERSISTENT_CACHE_EVICT;
        if (ds0Var == null) {
            av2Var = av2Var3;
            z = true;
            i = 0;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(ds0Var.o());
            while (true) {
                Iterator it = linkedHashMap.values().iterator();
                int iQ = 0;
                while (it.hasNext()) {
                    iQ = ((h6) it.next()).q() + iQ;
                }
                if (iQ <= iA || linkedHashMap.isEmpty()) {
                    break;
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long jP = ((h6) ((Map.Entry) next).getValue()).p();
                        do {
                            Object next4 = it2.next();
                            long jP2 = ((h6) ((Map.Entry) next4).getValue()).p();
                            if (jP > jP2) {
                                next = next4;
                                jP = jP2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry = (Map.Entry) next;
                String str = entry != null ? (String) entry.getKey() : null;
                if (str == null || (h6Var = (h6) linkedHashMap.get(str)) == null) {
                    break;
                }
                WeakHashMap weakHashMap = hh3.a;
                rg3VarA = hh3.a(fw0Var, l08.a, z3);
                try {
                    if (h6Var.q() > 0) {
                        Iterator<E> it3 = h6Var.r().iterator();
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                long jP3 = ((c6) next2).p();
                                do {
                                    Object next5 = it3.next();
                                    long jP4 = ((c6) next5).p();
                                    if (jP3 > jP4) {
                                        next2 = next5;
                                        jP3 = jP4;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        z2 = z3;
                        c6 c6Var = (c6) next2;
                        flp flpVarR = h6Var.r();
                        h1Var = h1VarA;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<E> it4 = flpVarR.iterator();
                        while (true) {
                            av2Var2 = av2Var3;
                            if (!it4.hasNext()) {
                                break;
                            }
                            Object next6 = it4.next();
                            int i3 = iA;
                            if (((c6) next6) != c6Var) {
                                arrayList2.add(next6);
                            }
                            av2Var3 = av2Var2;
                            iA = i3;
                        }
                        i2 = iA;
                        if (arrayList2.isEmpty()) {
                            linkedHashMap.remove(str);
                        } else {
                            r1p r1pVar = (r1p) h6Var.n();
                            r1pVar.f();
                            r1pVar.e();
                            r1pVar.f();
                            r1pVar.c(arrayList2);
                            linkedHashMap.put(str, (h6) r1pVar.a());
                        }
                        objRemove = c6Var != null ? Boolean.valueOf(arrayList.add(c6Var.q())) : null;
                    } else {
                        h1Var = h1VarA;
                        av2Var2 = av2Var3;
                        i2 = iA;
                        z2 = z3;
                        objRemove = linkedHashMap.remove(str);
                    }
                    if (objRemove instanceof av0) {
                        xh3.a((av0) objRemove, false);
                    }
                    rg3VarA.close();
                    z3 = z2;
                    h1VarA = h1Var;
                    av2Var3 = av2Var2;
                    iA = i2;
                } catch (Throwable th) {
                    try {
                        rg3VarA.b(th);
                        if (th instanceof iyo) {
                            throw th;
                        }
                        rg3VarA.a(th);
                        if (th instanceof kql) {
                            throw new uw0((kql) th);
                        }
                        if (th instanceof CancellationException) {
                            throw new ou0(th);
                        }
                        if (th instanceof mv0) {
                            throw th;
                        }
                        throw new tu0(th);
                    } finally {
                    }
                }
            }
            av2Var = av2Var3;
            z = z3;
            i = 0;
            hzo hzoVar2 = (hzo) h1VarA.n();
            if (linkedHashMap.isEmpty()) {
                hzoVar2.e();
                hzoVar2.b(strName2);
            } else {
                hzoVar2.e();
                yso ysoVar = (yso) ds0Var.n();
                ysoVar.e();
                ysoVar.b$1();
                ((ds0) ysoVar.b).q().clear();
                ysoVar.e();
                ysoVar.b$1();
                ((ds0) ysoVar.b).q().putAll(linkedHashMap);
                hzoVar2.c(strName2, (ds0) ysoVar.a());
            }
            h1VarA = (h1) hzoVar2.a();
        }
        fjp fjpVar = ae2Var.c;
        fjpVar.getClass();
        int i4 = 10;
        int iIntValue = ((Number) fjpVar.a("gads:pc:max_total_cached_ads", (Object) 10, (Function1) fo.a$11)).intValue() - 1;
        while (true) {
            Iterator it5 = h1VarA.u().values().iterator();
            int i5 = i;
            while (it5.hasNext()) {
                Iterator it6 = ((ds0) it5.next()).o().values().iterator();
                int iQ2 = i;
                while (it6.hasNext()) {
                    iQ2 += ((h6) it6.next()).q();
                }
                i5 += iQ2;
            }
            if (i5 <= iIntValue) {
                break;
            }
            Set<Map.Entry> setEntrySet = h1VarA.u().entrySet();
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry2 : setEntrySet) {
                String str2 = (String) entry2.getKey();
                Set<Map.Entry> setEntrySet2 = ((ds0) entry2.getValue()).o().entrySet();
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry3 : setEntrySet2) {
                    String str3 = (String) entry3.getKey();
                    flp flpVarR2 = ((h6) entry3.getValue()).r();
                    int i6 = iIntValue;
                    ArrayList arrayList5 = new ArrayList(k95.o(flpVarR2, i4));
                    Iterator<E> it7 = flpVarR2.iterator();
                    while (it7.hasNext()) {
                        arrayList5.add(new j7m(str2, str3, (c6) it7.next()));
                    }
                    o95.t(arrayList5, arrayList4);
                    iIntValue = i6;
                    i4 = 10;
                }
                o95.t(arrayList4, arrayList3);
                i4 = 10;
            }
            int i7 = iIntValue;
            Iterator it8 = arrayList3.iterator();
            if (it8.hasNext()) {
                next3 = it8.next();
                if (it8.hasNext()) {
                    long jP5 = ((c6) ((j7m) next3).c).p();
                    do {
                        Object next7 = it8.next();
                        long jP6 = ((c6) ((j7m) next7).c).p();
                        if (jP5 > jP6) {
                            next3 = next7;
                            jP5 = jP6;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next3 = null;
            }
            j7m j7mVar = (j7m) next3;
            if (j7mVar == null) {
                fe2Var = null;
            } else {
                String strQ = ((c6) j7mVar.c).q();
                String str4 = (String) j7mVar.a;
                avj avjVar = av2.b;
                fe2Var = new fe2(strQ, (av2) Enum.valueOf(av2.class, str4), (String) j7mVar.b);
            }
            if (fe2Var == null) {
                break;
            }
            String str5 = fe2Var.a;
            WeakHashMap weakHashMap2 = hh3.a;
            boolean z4 = z;
            rg3VarA = hh3.a(fw0Var, l08.a, z4);
            try {
                h1VarA = ae2.a(h1VarA, fe2Var.b.name(), fe2Var.c, str5);
                arrayList.add(str5);
                rg3VarA.close();
                z = z4;
                iIntValue = i7;
                i = 0;
                i4 = 10;
            } catch (Throwable th2) {
                try {
                    rg3VarA.b(th2);
                    if (th2 instanceof iyo) {
                        throw th2;
                    }
                    rg3VarA.a(th2);
                    if (th2 instanceof kql) {
                        throw new uw0((kql) th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new ou0(th2);
                    }
                    if (th2 instanceof mv0) {
                        throw th2;
                    }
                    throw new tu0(th2);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }
        String strName3 = av2Var.name();
        ds0 ds0VarP2 = (ds0) h1VarA.u().get(strName3);
        if (ds0VarP2 == null) {
            ds0VarP2 = ds0.p();
        }
        cpo cpoVarS = c6.s();
        cpoVarS.b$1();
        ((c6) cpoVarS.b).c(this.f);
        cpoVarS.b$1();
        c6 c6Var2 = (c6) cpoVarS.b;
        c6Var2.bitField0_ |= 2;
        c6Var2.createTimeMs_ = j;
        cpoVarS.b$1();
        ((c6) cpoVarS.b).b(this.g);
        cpoVarS.b(2);
        c6 c6Var3 = (c6) cpoVarS.a();
        hzo hzoVar3 = (hzo) h1VarA.n();
        hzoVar3.e();
        yso ysoVar2 = (yso) ds0VarP2.n();
        Map mapE = ysoVar2.e();
        String str6 = this.e;
        h6 h6VarO = (h6) mapE.get(str6);
        if (h6VarO == null) {
            h6VarO = h6.o();
        }
        ysoVar2.e();
        r1p r1pVar2 = (r1p) h6VarO.n();
        r1pVar2.f();
        r1pVar2.b$1();
        ((h6) r1pVar2.b).a(c6Var3);
        r1pVar2.b(j);
        ysoVar2.c(str6, (h6) r1pVar2.a());
        hzoVar3.c(strName3, (ds0) ysoVar2.a());
        return (h1) hzoVar3.a();
    }
}
