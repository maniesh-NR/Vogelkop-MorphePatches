package defpackage;

import com.leanplum.internal.Clock;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class gy extends no7 {
    public static final rbe k = new rbe((byte) 15);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static ey t(izd izdVar) throws IOException {
        List arrayList;
        long jK = izdVar.k();
        int unsignedByte = izdVar.readUnsignedByte();
        int unsignedShort = izdVar.readUnsignedShort();
        izdVar.readUnsignedShort();
        if (izdVar.available() > 0) {
            TimeUnit.HOURS.toMillis(izdVar.readUnsignedShort());
            izdVar.readUnsignedByte();
            int unsignedByte2 = izdVar.readUnsignedByte();
            arrayList = new ArrayList(unsignedByte2);
            while (true) {
                int i = unsignedByte2 - 1;
                if (unsignedByte2 <= 0) {
                    break;
                }
                int unsignedByte3 = izdVar.readUnsignedByte();
                if (unsignedByte3 == 66) {
                    arrayList.add(fy.a);
                } else if (unsignedByte3 == 68) {
                    arrayList.add(fy.c);
                } else if (unsignedByte3 == 83) {
                    arrayList.add(fy.b);
                }
                unsignedByte2 = i;
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return new ey(jK, unsignedByte, TimeUnit.MINUTES.toMillis(unsignedShort), arrayList);
    }

    @Override // defpackage.no7
    public final Object h() {
        return new ey(35L, 2, Clock.DAY_MILLIS, Collections.EMPTY_LIST);
    }

    @Override // defpackage.no7
    public final /* bridge */ /* synthetic */ Object k(izd izdVar) {
        return t(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return t(new izd(new ByteArrayInputStream(bArr)));
    }
}
