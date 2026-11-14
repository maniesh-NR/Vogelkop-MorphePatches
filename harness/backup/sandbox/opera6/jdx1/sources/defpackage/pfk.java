package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class pfk {
    public final nuf a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final yhe c;

    public pfk(StreamConfigurationMap streamConfigurationMap, nuf nufVar) {
        this.a = nufVar;
        this.c = Build.VERSION.SDK_INT >= 34 ? new qfk(streamConfigurationMap, (byte) 25) : new yhe(streamConfigurationMap, (byte) 25);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Size[] a(int r35) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfk.a(int):android.util.Size[]");
    }
}
