package defpackage;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qfk extends yhe {
    public final Integer[] i() {
        Integer[] numArrI = super.i();
        if (d77.a(PixelJpegRSupportedQuirk.class) == null) {
            return numArrI;
        }
        if (numArrI == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArrI) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    public final long j(int i, Size size) {
        if (i != 4101 || d77.a(PixelJpegRSupportedQuirk.class) == null) {
            return super.j(i, size);
        }
        return 0L;
    }

    public final Size[] l(int i) {
        if (i != 4101 || d77.a(PixelJpegRSupportedQuirk.class) == null) {
            return super.l(i);
        }
        return null;
    }
}
