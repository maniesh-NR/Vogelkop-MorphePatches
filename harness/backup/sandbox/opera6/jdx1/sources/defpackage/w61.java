package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class w61 implements go9 {
    public final TotalCaptureResult a;
    public final x61 b;
    public final Map c;

    public w61(TotalCaptureResult totalCaptureResult, String str) {
        ArrayMap arrayMap;
        this.a = totalCaptureResult;
        this.b = new x61(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            Map<String, CaptureResult> mapS = Build.VERSION.SDK_INT >= 31 ? m41.s(totalCaptureResult) : totalCaptureResult.getPhysicalCameraResults();
            if (mapS == null || mapS.isEmpty()) {
                arrayMap = n08.a;
            } else {
                arrayMap = new ArrayMap(mapS.size());
                for (Map.Entry<String, CaptureResult> entry : mapS.entrySet()) {
                    String key = entry.getKey();
                    sd4.a(key);
                    arrayMap.put(new sd4(key), new x61(entry.getValue(), key));
                }
            }
            Trace.endSection();
            this.c = arrayMap;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        boolean zEquals = s15Var.equals(uqh.a(CaptureResult.class));
        TotalCaptureResult totalCaptureResult = this.a;
        if (zEquals) {
            return totalCaptureResult;
        }
        if (!s15Var.equals(uqh.a(TotalCaptureResult.class)) || totalCaptureResult == null) {
            return null;
        }
        return totalCaptureResult;
    }

    @Override // defpackage.go9
    public final x61 getMetadata() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
        x61 x61Var = this.b;
        sb.append((Object) sd4.b(x61Var.b));
        sb.append(", frameNumber: ");
        sb.append(x61Var.a.getFrameNumber());
        sb.append(')');
        return sb.toString();
    }
}
