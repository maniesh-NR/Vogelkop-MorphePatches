package androidx.camera.core.internal.compat.quirk;

import defpackage.ewa;
import defpackage.qrm;
import defpackage.qsm;
import defpackage.ssm;
import defpackage.swg;
import defpackage.tgh;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements tgh {
    public static final HashSet a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                qrm qrmVar = (qrm) it.next();
                if (qrmVar instanceof swg) {
                    z = true;
                } else if (qrmVar instanceof ewa) {
                    z3 = true;
                } else if (qrmVar.h.g(qsm.Sp)) {
                    z2 = qrmVar.h.C() == ssm.d;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
