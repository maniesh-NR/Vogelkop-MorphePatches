package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class ygo extends i7c {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ygo(byte b) {
        super((byte) 1);
        this.d = b;
    }

    @Override // defpackage.i7c
    public final Object c() {
        switch (this.d) {
            case 0:
                return Boolean.TRUE;
            default:
                ezo.a();
                gxo gxoVar = gxo.c;
                File fileC = sjo.c(2, "omsdk_v2.js");
                if (fileC == null) {
                    return null;
                }
                if (fileC.exists()) {
                    return mzg.b(fileC);
                }
                gxo.c(new koj((byte) 12));
                return null;
        }
    }
}
