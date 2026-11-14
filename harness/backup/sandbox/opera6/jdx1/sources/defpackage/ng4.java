package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class ng4 {
    public static final ng4 a = new ng4();

    public void a(fwa fwaVar, pyl pylVar) {
        int i;
        ai4 ai4Var = (ai4) fwaVar.b(qsm.Ip, null);
        wrf wrfVar = wrf.c;
        an2 an2Var = ai4.f;
        HashSet hashSet = new HashSet();
        fee feeVarK = fee.k();
        ArrayList arrayList = new ArrayList();
        bfe bfeVarA = bfe.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        wrf wrfVarF = wrf.f(feeVarK);
        ArrayList arrayList3 = new ArrayList(arrayList);
        hbl hblVar = hbl.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = bfeVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        new ai4(arrayList2, wrfVarF, -1, arrayList3, new hbl(arrayMap));
        if (ai4Var != null) {
            int i2 = ai4Var.c;
            pylVar.c(ai4Var.d);
            wrf wrfVar2 = ai4Var.b;
            ((bfe) pylVar.f).a.putAll((Map) ai4Var.e.a);
            Iterator it = Collections.unmodifiableList(ai4Var.a).iterator();
            while (it.hasNext()) {
                ((HashSet) pylVar.c).add((g07) it.next());
            }
            i = i2;
            wrfVar = wrfVar2;
        } else {
            i = -1;
        }
        pylVar.d = fee.l(wrfVar);
        pylVar.b = ((Number) fwaVar.b(eb4.e, Integer.valueOf(i))).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) fwaVar.b(eb4.h, null);
        if (captureCallback != null) {
            pylVar.d(new lg4(captureCallback));
        }
        tw2 tw2Var = new tw2((byte) 16);
        fwaVar.c(new xj(tw2Var, fwaVar, (byte) 25));
        pylVar.f(new zy9(wrf.f((fee) tw2Var.b)));
    }
}
