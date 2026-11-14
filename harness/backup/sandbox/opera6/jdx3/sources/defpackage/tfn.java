package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class tfn {
    public final long a;
    public final int b;
    public final String[] c;

    public tfn() {
        this.a = 0L;
        this.b = 0;
        this.c = null;
    }

    public tfn(izd izdVar) throws IOException {
        this.a = izdVar.k();
        this.b = izdVar.readUnsignedShort();
        if (izdVar.available() <= 0) {
            this.c = null;
            return;
        }
        int unsignedByte = izdVar.readUnsignedByte();
        this.c = new String[unsignedByte];
        for (int i = 0; i < unsignedByte; i++) {
            String strH = izdVar.h();
            this.c[i] = strH != null ? "sha256/".concat(strH) : "";
        }
    }
}
