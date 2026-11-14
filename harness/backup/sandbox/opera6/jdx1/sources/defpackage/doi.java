package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class doi extends n1 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable H0(int i, g1g g1gVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(g1gVar.u()));
        }
        if (i == 1) {
            return Boolean.valueOf(g1gVar.A() == 1);
        }
        if (i == 2) {
            return J0(g1gVar);
        }
        if (i != 3) {
            if (i == 8) {
                return I0(g1gVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(g1gVar.u()));
                g1gVar.O(2);
                return date;
            }
            int iE = g1gVar.E();
            ArrayList arrayList = new ArrayList(iE);
            for (int i2 = 0; i2 < iE; i2++) {
                Serializable serializableH0 = H0(g1gVar.A(), g1gVar);
                if (serializableH0 != null) {
                    arrayList.add(serializableH0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strJ0 = J0(g1gVar);
            int iA = g1gVar.A();
            if (iA == 9) {
                return map;
            }
            Serializable serializableH02 = H0(iA, g1gVar);
            if (serializableH02 != null) {
                map.put(strJ0, serializableH02);
            }
        }
    }

    public static HashMap I0(g1g g1gVar) {
        int iE = g1gVar.E();
        HashMap map = new HashMap(iE);
        for (int i = 0; i < iE; i++) {
            String strJ0 = J0(g1gVar);
            Serializable serializableH0 = H0(g1gVar.A(), g1gVar);
            if (serializableH0 != null) {
                map.put(strJ0, serializableH0);
            }
        }
        return map;
    }

    public static String J0(g1g g1gVar) {
        int iH = g1gVar.H();
        int i = g1gVar.b;
        g1gVar.O(iH);
        return new String(g1gVar.a, i, iH);
    }
}
