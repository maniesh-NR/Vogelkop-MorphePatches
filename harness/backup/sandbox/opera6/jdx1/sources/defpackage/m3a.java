package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class m3a {
    public final ef2 a = c26.k(new gak(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Removed duplicated region for block: B:65:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.m3a r19, defpackage.y10 r20, defpackage.v40 r21, defpackage.gw2 r22, defpackage.o79 r23, java.util.List r24, java.util.List r25, java.util.List r26, java.lang.Boolean r27, java.lang.Boolean r28, java.lang.Boolean r29, int r30) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m3a.b(m3a, y10, v40, gw2, o79, java.util.List, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }

    public final LinkedHashMap a() {
        gak gakVar = (gak) this.a.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        y10 y10Var = gakVar.a;
        if (y10Var != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(y10Var.a));
        }
        v40 v40Var = gakVar.b;
        if (v40Var != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(v40Var.a));
        }
        gw2 gw2Var = gakVar.c;
        if (gw2Var != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(gw2Var.a));
        }
        o79 o79Var = gakVar.d;
        if (o79Var != null) {
            linkedHashMap.put(CaptureRequest.FLASH_MODE, Integer.valueOf(o79Var.a));
        }
        List list = gakVar.e;
        if (list != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_REGIONS, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = gakVar.f;
        if (list2 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_REGIONS, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = gakVar.g;
        if (list3 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_REGIONS, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = gakVar.h;
        if (bool != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_LOCK, bool);
        }
        Boolean bool2 = gakVar.j;
        if (bool2 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_LOCK, bool2);
        }
        return linkedHashMap;
    }
}
