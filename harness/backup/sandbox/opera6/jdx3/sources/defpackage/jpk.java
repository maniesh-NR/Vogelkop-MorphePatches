package defpackage;

import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class jpk implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xbf b;

    public /* synthetic */ jpk(xbf xbfVar, byte b) {
        this.a = b;
        this.b = xbfVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        HashSet hashSet;
        ook ookVarA;
        byte b = this.a;
        xbf xbfVar = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                pok pokVar = (pok) obj;
                w6j w6jVar = (w6j) xbfVar.f;
                jpk jpkVar = new jpk(xbfVar, (byte) 1);
                List list = pokVar.a;
                final epk epkVar = (epk) w6jVar.a;
                final byte b3 = 0;
                ArrayList arrayListJ = nb6.J(sfe.p0(sfe.Q(list, new srg() { // from class: dpk
                    public final boolean apply(Object obj2) {
                        byte b4 = b3;
                        return epkVar.test((rca) obj2);
                    }
                }), 10));
                List list2 = pokVar.b;
                final epk epkVar2 = (epk) w6jVar.b;
                final byte b4 = 1;
                jpkVar.run(new pok(arrayListJ, nb6.J(sfe.p0(sfe.Q(list2, new srg() { // from class: dpk
                    public final boolean apply(Object obj2) {
                        byte b42 = b4;
                        return epkVar2.test((rca) obj2);
                    }
                }), 10)), nb6.J(sfe.p0(sfe.Q(pokVar.c, new f15((epk) w6jVar.c, (byte) 3)), 10)), nb6.J(sfe.p0(sfe.Q(pokVar.d, new o00((gpk) w6jVar.d)), 10)), nb6.J(sfe.p0(sfe.Q(pokVar.e, new f15((epk) w6jVar.e, (byte) 4)), 10))));
                break;
            default:
                pok pokVar2 = (pok) obj;
                final eyi eyiVar = (eyi) xbfVar.g;
                Set set = Collections.EMPTY_SET;
                List list3 = pokVar2.a;
                int size = list3.size();
                List list4 = pokVar2.b;
                int size2 = list4.size() + size;
                List list5 = pokVar2.c;
                int size3 = list5.size() + size2;
                List list6 = pokVar2.d;
                ArrayList arrayList = new ArrayList(list6.size() + size3);
                if (set instanceof Collection) {
                    hashSet = new HashSet(set);
                } else {
                    Iterator it = set.iterator();
                    hashSet = new HashSet();
                    ipe.f(hashSet, it);
                }
                int i = 0;
                int i2 = 1;
                for (jn7 jn7Var : pokVar2.e) {
                    epk epkVar3 = (epk) eyiVar.d;
                    String str = jn7Var.b;
                    String str2 = jn7Var.b;
                    arrayList.add(new ook(6, i2, jn7Var.a, str2, (String) epkVar3.apply(str)));
                    hashSet.add(str2);
                    i++;
                    i2++;
                }
                i32 i32Var = (i32) eyiVar.c;
                ArrayList arrayList2 = new ArrayList(3);
                if (eyiVar.b && !list3.isEmpty()) {
                    arrayList2.add(new spk(list3, new rpk() { // from class: qpk
                        @Override // defpackage.rpk
                        public final ook a(double d, int i3, Object obj2) {
                            byte b5 = b2;
                            eyi eyiVar2 = eyiVar;
                            switch (b5) {
                                case 0:
                                    rca rcaVar = (rca) obj2;
                                    String str3 = (String) ((epk) eyiVar2.d).apply(rcaVar.a);
                                    return new ook(rcaVar.c ? 2 : 1, i3, rcaVar.b, rcaVar.a, str3);
                                default:
                                    rca rcaVar2 = (rca) obj2;
                                    String str4 = (String) ((epk) eyiVar2.d).apply(rcaVar2.a);
                                    return new ook(rcaVar2.c ? 5 : 4, i3, rcaVar2.b, rcaVar2.a, str4);
                            }
                        }
                    }, i32Var.l(1)));
                }
                if (eyiVar.b && !list4.isEmpty()) {
                    final byte b5 = 1;
                    arrayList2.add(new spk(list4, new rpk() { // from class: qpk
                        @Override // defpackage.rpk
                        public final ook a(double d, int i3, Object obj2) {
                            byte b52 = b5;
                            eyi eyiVar2 = eyiVar;
                            switch (b52) {
                                case 0:
                                    rca rcaVar = (rca) obj2;
                                    String str3 = (String) ((epk) eyiVar2.d).apply(rcaVar.a);
                                    return new ook(rcaVar.c ? 2 : 1, i3, rcaVar.b, rcaVar.a, str3);
                                default:
                                    rca rcaVar2 = (rca) obj2;
                                    String str4 = (String) ((epk) eyiVar2.d).apply(rcaVar2.a);
                                    return new ook(rcaVar2.c ? 5 : 4, i3, rcaVar2.b, rcaVar2.a, str4);
                            }
                        }
                    }, i32Var.l(2)));
                }
                if (eyiVar.b && !list6.isEmpty()) {
                    arrayList2.add(new spk(list6, new gpk((byte) 1), i32Var.l(5)));
                }
                if (!list5.isEmpty()) {
                    arrayList2.add(new spk(list5, new gpk((byte) 2), i32Var.l(3)));
                }
                while (i < 10 && !arrayList2.isEmpty()) {
                    spk spkVar = (spk) Collections.max(arrayList2, new omj((byte) 9));
                    List list7 = spkVar.a;
                    if (list7.isEmpty()) {
                        ookVarA = null;
                    } else {
                        Object objRemove = list7.remove(0);
                        rpk rpkVar = spkVar.b;
                        int i3 = spkVar.c;
                        spkVar.c = i3 + 1;
                        ookVarA = rpkVar.a(spkVar.e, i3, objRemove);
                    }
                    boolean z = spkVar.d == 3 && !eyiVar.b;
                    if (ookVarA == null) {
                        arrayList2.remove(spkVar);
                    } else {
                        String str3 = ookVarA.b;
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            if (wqm.J(str3, str4, true, false) || (!z && wqm.J(str3, str4, true, true))) {
                                int i4 = spkVar.c;
                                if (i4 != 1) {
                                    spkVar.c = i4 - 1;
                                }
                            }
                        }
                        byte b6 = ookVarA.d;
                        if (b6 != 7 && b6 != 8) {
                            i++;
                        }
                        arrayList.add(ookVarA);
                        hashSet.add(str3);
                        spkVar.e = 0.5d * spkVar.e;
                    }
                }
                ((ode) xbfVar.b).r(arrayList);
                break;
        }
    }
}
