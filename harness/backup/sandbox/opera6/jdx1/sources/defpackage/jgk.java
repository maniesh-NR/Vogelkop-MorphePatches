package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class jgk {
    public static final an2 a = new an2("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final u9d b;
    public static final u9d c;

    static {
        u9d u9dVar = new u9d();
        int i = Build.VERSION.SDK_INT;
        ssm ssmVar = ssm.d;
        ssm ssmVar2 = ssm.a;
        ssm ssmVar3 = ssm.b;
        if (i >= 33) {
            ssm ssmVar4 = ssm.f;
            ssm ssmVar5 = ssm.c;
            u9dVar.put(4L, e82.E(new ssm[]{ssmVar3, ssmVar4, ssmVar5}));
            u9dVar.put(1L, e82.E(new ssm[]{ssmVar3, ssmVar4, ssmVar5}));
            u9dVar.put(2L, Collections.singleton(ssmVar2));
            u9dVar.put(3L, Collections.singleton(ssmVar));
        }
        b = u9dVar.g();
        u9d u9dVar2 = new u9d();
        if (i >= 33) {
            u9dVar2.put(4L, e82.E(new ssm[]{ssmVar3, ssmVar2, ssmVar}));
            u9dVar2.put(3L, e82.E(new ssm[]{ssmVar3, ssmVar}));
        }
        c = u9dVar2.g();
    }

    public static boolean a(ge4 ge4Var, List list) {
        if (Build.VERSION.SDK_INT >= 33) {
            long[] jArr = (long[]) ((ma4) ge4Var).c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains(Long.valueOf(((itk) it.next()).c.a))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static eb4 b(tj5 tj5Var, Long l) {
        an2 an2Var = a;
        if (tj5Var.g(an2Var) && Intrinsics.a(tj5Var.i(an2Var), l)) {
            return null;
        }
        fee feeVarL = fee.l(tj5Var);
        feeVarL.s(an2Var, l);
        return new eb4(feeVarL);
    }

    public static boolean c(ssm ssmVar, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (ssmVar != ssm.e) {
            Long lValueOf = Long.valueOf(j);
            u9d u9dVar = b;
            return u9dVar.containsKey(lValueOf) && ((Set) u9dVar.get(Long.valueOf(j))).contains(ssmVar);
        }
        Long lValueOf2 = Long.valueOf(j);
        u9d u9dVar2 = c;
        if (!u9dVar2.containsKey(lValueOf2)) {
            return false;
        }
        Set set = (Set) u9dVar2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((ssm) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(ge4 ge4Var) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        long[] jArr = (long[]) ((ma4) ge4Var).c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public static boolean e(tj5 tj5Var, ssm ssmVar) {
        if (((Boolean) tj5Var.b(qsm.Qp, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        an2 an2Var = fwa.b;
        if (tj5Var.g(an2Var)) {
            return ssmVar.ordinal() == 0 && ((Number) tj5Var.i(an2Var)).intValue() == 2;
        }
        return false;
    }

    public static boolean f(ge4 ge4Var, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        boolean z;
        boolean z2;
        int i = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList2 = new ArrayList(linkedHashMap.keySet());
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((qm2) obj).f == null) {
                    qp2.n("Required value was null.");
                    return false;
                }
            }
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                Object obj3 = linkedHashMap.get((qsm) obj2);
                if (obj3 == null || ((to2) obj3).f == null) {
                    qp2.n("Required value was null.");
                    return false;
                }
            }
            long[] jArr = (long[]) ((ma4) ge4Var).c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    qm2 qm2Var = (qm2) it.next();
                    tj5 tj5Var = qm2Var.f;
                    an2 an2Var = eb4.i;
                    if (!tj5Var.g(an2Var) || ((Number) qm2Var.f.i(an2Var)).longValue() == 0) {
                        z = false;
                        z2 = true;
                    } else {
                        z2 = false;
                        z = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj4 = arrayList2.get(i4);
                    i4++;
                    qsm qsmVar = (qsm) obj4;
                    an2 an2Var2 = eb4.i;
                    if (qsmVar.g(an2Var2)) {
                        long jLongValue = ((Number) qsmVar.i(an2Var2)).longValue();
                        if (jLongValue != 0) {
                            if (z2) {
                                qp2.o("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            linkedHashSet.add(Long.valueOf(jLongValue));
                            z = true;
                        } else if (z) {
                            qp2.o("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        qp2.o("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((Number) it2.next()).longValue()))) {
                        }
                    }
                    int size4 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size4) {
                        Object obj5 = arrayList.get(i5);
                        i5++;
                        qm2 qm2Var2 = (qm2) obj5;
                        tj5 tj5Var2 = qm2Var2.f;
                        eb4 eb4VarB = b(tj5Var2, (Long) tj5Var2.i(eb4.i));
                        if (eb4VarB != null) {
                            ne5 ne5VarA = to2.a(qm2Var2.c);
                            ne5VarA.d = Integer.valueOf(qm2Var2.g);
                            Range range = qm2Var2.h;
                            if (range == null) {
                                t3p.q("Null expectedFrameRateRange");
                                return false;
                            }
                            ne5VarA.e = range;
                            ip7 ip7Var = qm2Var2.d;
                            if (ip7Var == null) {
                                t3p.q("Null dynamicRange");
                                return false;
                            }
                            ne5VarA.c = ip7Var;
                            ne5VarA.f = eb4VarB;
                            linkedHashMap2.put(qm2Var2, ne5VarA.p());
                        }
                    }
                    int size5 = arrayList2.size();
                    while (i < size5) {
                        Object obj6 = arrayList2.get(i);
                        i++;
                        qsm qsmVar2 = (qsm) obj6;
                        to2 to2Var = (to2) linkedHashMap.get(qsmVar2);
                        eb4 eb4Var = to2Var.f;
                        eb4 eb4VarB2 = b(eb4Var, (Long) eb4Var.i(eb4.i));
                        if (eb4VarB2 != null) {
                            ne5 ne5VarB = to2Var.b();
                            ne5VarB.f = eb4VarB2;
                            linkedHashMap.put(qsmVar2, ne5VarB.p());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
