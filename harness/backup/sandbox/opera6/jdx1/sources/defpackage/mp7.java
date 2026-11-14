package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class mp7 implements lp7 {
    public final DynamicRangeProfiles a;

    public mp7(DynamicRangeProfiles dynamicRangeProfiles) {
        this.a = dynamicRangeProfiles;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return v08.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ip7 ip7Var = (ip7) jp7.a.get(Long.valueOf(((Number) it.next()).longValue()));
            if (ip7Var != null) {
                linkedHashSet.add(ip7Var);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // defpackage.lp7
    public final Set a() {
        return d(this.a.getSupportedProfiles());
    }

    @Override // defpackage.lp7
    public final DynamicRangeProfiles b() {
        return this.a;
    }

    @Override // defpackage.lp7
    public final Set c(ip7 ip7Var) {
        LinkedHashMap linkedHashMap = jp7.a;
        Long lA = jp7.a(ip7Var, this.a);
        if (lA != null) {
            return d(this.a.getProfileCaptureRequestConstraints(lA.longValue()));
        }
        odf.i(ip7Var, "DynamicRange is not supported: ");
        return null;
    }
}
