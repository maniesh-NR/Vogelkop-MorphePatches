package defpackage;

import android.util.LongSparseArray;
import com.opera.api.Callback;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class d1h extends dca {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1h(long j, Callback callback, byte b) {
        super(callback, j);
        this.e = b;
    }

    @Override // defpackage.dca
    public final Object c(List list, LongSparseArray longSparseArray, long j) {
        long j2;
        rqm rqmVar;
        Iterator it;
        switch (this.e) {
            case 0:
                HashMap map = new HashMap();
                Iterator it2 = list.iterator();
                while (true) {
                    int i = 1;
                    if (!it2.hasNext()) {
                        ArrayList arrayList = new ArrayList(map.values());
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            tqm tqmVar = (tqm) obj;
                            tqmVar.a(new vk2((byte) 23));
                            tqmVar.a(new vk2((byte) 22));
                            tqmVar.a(new vk2((byte) 24));
                            ArrayDeque arrayDequeB = tqmVar.b();
                            while (true) {
                                if (arrayDequeB.isEmpty()) {
                                    j2 = -1;
                                } else {
                                    kqm kqmVar = (kqm) arrayDequeB.pop();
                                    boolean zIsEmpty = kqmVar.b.isEmpty();
                                    ArrayList arrayList3 = kqmVar.b;
                                    if (!zIsEmpty) {
                                        j2 = -1;
                                        if (kqmVar.d.b == -1) {
                                            ListIterator listIterator = arrayList3.listIterator();
                                            kqm kqmVar2 = (kqm) listIterator.next();
                                            while (listIterator.hasNext()) {
                                                kqm kqmVar3 = (kqm) listIterator.next();
                                                if (kqmVar3.h > kqmVar2.h) {
                                                    kqmVar2 = kqmVar3;
                                                }
                                            }
                                            tqmVar.c = kqmVar2;
                                        } else {
                                            if (arrayList3.size() > i) {
                                                int size2 = arrayList3.size();
                                                int i3 = 0;
                                                while (i3 < size2) {
                                                    Object obj2 = arrayList3.get(i3);
                                                    i3++;
                                                    kqmVar.g += ((kqm) obj2).g;
                                                }
                                                arrayList3.clear();
                                            } else {
                                                kqm kqmVar4 = (kqm) arrayList3.get(0);
                                                if (kqmVar.g < kqmVar4.g) {
                                                    kqm kqmVar5 = kqmVar.e;
                                                    if (kqmVar5 == null) {
                                                        kqmVar4.e = null;
                                                        tqmVar.c(kqmVar4);
                                                    } else {
                                                        kqmVar5.b(kqmVar4);
                                                        sfe.A0(kqmVar5.b, new f15(new crk(kqmVar, (byte) 27), (byte) 7));
                                                    }
                                                } else {
                                                    arrayList3.clear();
                                                }
                                            }
                                            i = 1;
                                        }
                                    }
                                }
                            }
                            ipm ipmVar = tqmVar.c.d;
                            kqm kqmVar6 = (ipmVar.b == j2 || ipmVar.b() < 3) ? null : tqmVar.c;
                            if (kqmVar6 != null) {
                                arrayList2.add(kqmVar6);
                            }
                            i = 1;
                        }
                        Collections.sort(arrayList2, new c9((byte) 27));
                        ArrayList arrayList4 = new ArrayList();
                        while (!arrayList2.isEmpty()) {
                            kqm kqmVar7 = (kqm) vep.r(1, arrayList2);
                            rqm rqmVar2 = (rqm) longSparseArray.get(kqmVar7.d.b);
                            arrayList4.add(new rca(kqmVar7.d.b(), rqmVar2.h, rqmVar2.b, rqmVar2.g, kqmVar7.f));
                        }
                        return arrayList4;
                    }
                    wan wanVar = (wan) it2.next();
                    if (dca.a(wanVar) && (rqmVar = (rqm) longSparseArray.get(wanVar.a)) != null) {
                        String str = rqmVar.f;
                        tqm tqmVar2 = (tqm) map.get(str);
                        if (tqmVar2 == null) {
                            tqmVar2 = new tqm(str, j);
                            map.put(str, tqmVar2);
                        }
                        String str2 = rqmVar.b;
                        long j3 = wanVar.a;
                        long j4 = wanVar.b;
                        boolean z = wanVar.d;
                        LongSparseArray longSparseArray2 = tqmVar2.a;
                        kqm kqmVar8 = (kqm) longSparseArray2.get(j3);
                        if (kqmVar8 != null) {
                            ipm ipmVar2 = kqmVar8.d;
                            ipmVar2.a.add(Long.valueOf(j4));
                            ipmVar2.d = true;
                            if (z) {
                                ipmVar2.f++;
                            }
                            it = it2;
                        } else {
                            it = it2;
                            kqm kqmVar9 = new kqm(str2, j3, tqmVar2.b);
                            ipm ipmVar3 = kqmVar9.d;
                            ipmVar3.a.add(Long.valueOf(j4));
                            ipmVar3.d = true;
                            if (z) {
                                ipmVar3.f++;
                            }
                            kqm kqmVar10 = tqmVar2.c;
                            if (kqmVar10.c(kqmVar9) || kqmVar9.c(kqmVar10) || !kqmVar10.a.equals(str2)) {
                                kqm kqmVar11 = tqmVar2.c;
                                ListIterator listIterator2 = kqmVar11.b.listIterator();
                                while (listIterator2.hasNext()) {
                                    kqm kqmVar12 = (kqm) listIterator2.next();
                                    char c = kqmVar12.c(kqmVar9) ? (char) 3 : kqmVar9.c(kqmVar12) ? (char) 4 : kqmVar12.a.equals(kqmVar9.a) ? (char) 2 : (char) 1;
                                    if (c == 3) {
                                        listIterator2 = kqmVar12.b.listIterator();
                                        kqmVar11 = kqmVar12;
                                    } else if (c == 4) {
                                        kqmVar9.b(kqmVar12);
                                        listIterator2.remove();
                                    }
                                }
                                longSparseArray2.append(ipmVar3.b, kqmVar9);
                                kqmVar11.b(kqmVar9);
                            } else {
                                tqmVar2.c(kqmVar9);
                            }
                        }
                        it2 = it;
                    }
                }
                break;
            default:
                HashMap map2 = new HashMap(longSparseArray.size());
                HashMap map3 = new HashMap(longSparseArray.size());
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    wan wanVar2 = (wan) it3.next();
                    boolean zA = dca.a(wanVar2);
                    long j5 = wanVar2.a;
                    if (zA && ((rqm) longSparseArray.get(j5)) != null) {
                        if (wanVar2.d) {
                            map2.put(Long.valueOf(j5), Long.valueOf(map2.containsKey(Long.valueOf(j5)) ? ((Long) map2.get(Long.valueOf(j5))).longValue() + 1 : 1L));
                        }
                        map3.put(Long.valueOf(j5), Long.valueOf(map3.containsKey(Long.valueOf(j5)) ? 1 + ((Long) map3.get(Long.valueOf(j5))).longValue() : 1L));
                    }
                }
                ArrayList arrayList5 = new ArrayList(map2.entrySet());
                Collections.sort(arrayList5, new vd3(map3, (byte) 6));
                ArrayList arrayList6 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                    rqm rqmVar3 = (rqm) longSparseArray.get(((Long) ((Map.Entry) arrayList5.get(i4)).getKey()).longValue());
                    String str3 = rqmVar3.b;
                    long j6 = rqmVar3.a;
                    String str4 = rqmVar3.f;
                    boolean zEquals = str3.equals(str4);
                    if (hashSet.add(str4)) {
                        String str5 = rqmVar3.b;
                        String str6 = rqmVar3.g;
                        ((Long) map2.get(Long.valueOf(j6))).longValue();
                        arrayList6.add(new rca(((Long) map3.get(Long.valueOf(j6))).longValue(), rqmVar3.h, str5, str6, zEquals));
                    }
                }
                return arrayList6;
        }
    }
}
