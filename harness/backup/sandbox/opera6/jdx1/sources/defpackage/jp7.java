package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class jp7 {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
        ip7 ip7Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b = linkedHashMap2;
        ip7 ip7Var2 = ip7.d;
        linkedHashMap.put(1L, ip7Var2);
        linkedHashMap2.put(ip7Var2, Collections.singletonList(1L));
        linkedHashMap.put(2L, ip7.e);
        linkedHashMap2.put(linkedHashMap.get(2L), Collections.singletonList(2L));
        ip7 ip7Var3 = ip7.f;
        linkedHashMap.put(4L, ip7Var3);
        linkedHashMap2.put(ip7Var3, Collections.singletonList(4L));
        ip7 ip7Var4 = ip7.g;
        linkedHashMap.put(8L, ip7Var4);
        linkedHashMap2.put(ip7Var4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ip7Var = ip7.h;
            if (!zHasNext) {
                break;
            }
            a.put(Long.valueOf(((Number) it.next()).longValue()), ip7Var);
        }
        b.put(ip7Var, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            ip7 ip7Var5 = ip7.i;
            if (!zHasNext2) {
                b.put(ip7Var5, listAsList2);
                return;
            } else {
                a.put(Long.valueOf(((Number) it2.next()).longValue()), ip7Var5);
            }
        }
    }

    public static Long a(ip7 ip7Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List list = (List) b.get(ip7Var);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
                return Long.valueOf(jLongValue);
            }
        }
        return null;
    }
}
