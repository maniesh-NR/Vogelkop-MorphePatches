package defpackage;

import android.util.SparseArray;
import com.leanplum.utils.SizeUtil;
import com.opera.android.suggestion.Suggestion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class oqk {
    public final x5f a;
    public final brk b;
    public final dbf c;
    public cl0 d = cl0.b;

    public oqk(x5f x5fVar, brk brkVar, dbf dbfVar) {
        this.a = x5fVar;
        this.b = brkVar;
        this.c = dbfVar;
    }

    public static bl0 b(Suggestion suggestion) {
        int i = suggestion.a;
        if (i == 33) {
            return bl0.p;
        }
        switch (i) {
            case 0:
            case 1:
                return bl0.g;
            case 2:
            case 3:
                return bl0.h;
            case 4:
            case 5:
            case 6:
            case 7:
                return bl0.f;
            default:
                switch (i) {
                    case 16:
                        return bl0.d;
                    case 17:
                        return bl0.e;
                    case SizeUtil.textSize0_1 /* 18 */:
                        return bl0.b;
                    case 19:
                        return bl0.c;
                    default:
                        switch (i) {
                            case 21:
                            case SizeUtil.textSize1 /* 22 */:
                                return bl0.i;
                            case 23:
                                return bl0.j;
                            case SizeUtil.textSize2 /* 24 */:
                                return bl0.k;
                            case 25:
                                return bl0.o;
                            case 26:
                                return bl0.m;
                            default:
                                return null;
                        }
                }
        }
    }

    public final void a(Suggestion suggestion, cl0 cl0Var) {
        int i;
        if0 if0Var;
        SparseArray sparseArray = new SparseArray();
        List list = (List) this.b.invoke();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (b((Suggestion) it.next()) != null) {
                break;
            } else {
                i2++;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i2 != -1) {
            int size = list.size();
            i = 0;
            for (int i3 = i2; i3 < size; i3++) {
                Suggestion suggestion2 = (Suggestion) list.get(i3);
                bl0 bl0VarB = b(suggestion2);
                if (bl0VarB != null) {
                    Integer num = (Integer) linkedHashMap.get(bl0VarB);
                    int iIntValue = (num != null ? num.intValue() : 0) + 1;
                    linkedHashMap.put(bl0VarB, Integer.valueOf(iIntValue));
                    int i4 = (i3 - i2) + 1;
                    sparseArray.put(i4, new kbf(bl0VarB, iIntValue));
                    if (suggestion2.equals(suggestion)) {
                        i = i4;
                    }
                }
            }
        } else {
            i = 0;
        }
        if (cl0Var != cl0.i && cl0Var != cl0.h) {
            i = 0;
        }
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            zk0 zk0Var = new zk0(2443, -1, 3);
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list2 = (List) qd0VarB.n(20);
            ((list2 == null || list2.isEmpty()) ? new hf0(qd0VarB, 20, vep.t(qd0VarB, 20, 1)) : new hf0(qd0VarB, 20, list2)).add(zk0Var);
            zk0Var.q(0, 1, cl0Var);
            if (i > 0) {
                String strValueOf = String.valueOf(i);
                zk0Var.q(1, strValueOf == null ? 0 : 1, strValueOf);
            }
            int size2 = sparseArray.size();
            for (int i5 = 0; i5 < size2; i5++) {
                kbf kbfVar = (kbf) sparseArray.valueAt(i5);
                al0 al0Var = new al0(2443, -1, 2);
                al0Var.q(0, 1, kbfVar.a);
                al0Var.p(1, 1, kbfVar.b);
                Map map = (Map) zk0Var.n(2);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    zk0Var.q(2, 1, map2);
                    if0Var = new if0(zk0Var, 2, map2);
                } else {
                    if0Var = new if0(zk0Var, 2, map);
                }
                if0Var.put(String.valueOf(sparseArray.keyAt(i5)), al0Var);
            }
            x5fVar.U0(x56VarF);
        }
    }
}
