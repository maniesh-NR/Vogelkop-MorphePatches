package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class ug3 {
    public static final GmsLogger c = new GmsLogger("StreamingFormatChecker", "");
    public final LinkedList a = new LinkedList();
    public long b = -1;

    public final void a(x8b x8bVar) {
        if (x8bVar.f == -1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long lValueOf = Long.valueOf(jElapsedRealtime);
            LinkedList linkedList = this.a;
            linkedList.add(lValueOf);
            if (linkedList.size() > 5) {
                linkedList.removeFirst();
            }
            if (linkedList.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) linkedList.peekFirst())).longValue() >= 5000) {
                return;
            }
            long j = this.b;
            if (j == -1 || jElapsedRealtime - j >= 5000) {
                this.b = jElapsedRealtime;
                c.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
            }
        }
    }
}
