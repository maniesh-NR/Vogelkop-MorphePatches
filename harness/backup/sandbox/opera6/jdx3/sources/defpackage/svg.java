package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class svg {
    public final int a;
    public final int[] b;

    public svg() {
        this.a = 0;
        this.b = new int[0];
    }

    public svg(izd izdVar) throws IOException {
        this.a = izdVar.readInt();
        if (izdVar.available() <= 0) {
            this.b = new int[0];
            return;
        }
        int i = izdVar.readByte();
        this.b = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = izdVar.readByte();
        }
    }

    public final boolean a(int i) {
        return (this.a & i) != 0;
    }
}
