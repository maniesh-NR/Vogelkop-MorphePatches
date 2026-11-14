package ads_mobile_sdk;

import defpackage.pio;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class g {
    public transient int a;

    public abstract int a(pio pioVar);

    public final void a(OutputStream outputStream) {
        ku0 ku0Var = (ku0) this;
        int iA = ku0Var.a((pio) null);
        if (iA > 4096) {
            iA = 4096;
        }
        nv nvVar = new nv(outputStream, iA);
        ku0Var.a(nvVar);
        int i = nvVar.d;
        if (i > 0) {
            outputStream.write(nvVar.b, 0, i);
            nvVar.d = 0;
        }
    }

    public final byte[] a() {
        try {
            int iA = ((ku0) this).a((pio) null);
            byte[] bArr = new byte[iA];
            lv lvVar = new lv(bArr, iA);
            ((ku0) this).a(lvVar);
            if (lvVar.b() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (lvVar.b() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            h9o.s(sko.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
