package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class np7 implements lp7 {
    public static final qe6 a = new qe6(new np7(), (byte) 7);
    public static final Set b = Collections.singleton(ip7.d);

    @Override // defpackage.lp7
    public final Set a() {
        return b;
    }

    @Override // defpackage.lp7
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // defpackage.lp7
    public final Set c(ip7 ip7Var) {
        jpo.i("DynamicRange is not supported: " + ip7Var, ip7.d.equals(ip7Var));
        return b;
    }
}
