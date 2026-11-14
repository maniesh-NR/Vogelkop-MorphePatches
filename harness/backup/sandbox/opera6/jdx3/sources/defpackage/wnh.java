package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wnh {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final int f;

    public wnh() {
        this.a = 24;
        this.f = 4096;
        this.b = 0L;
        this.c = 100L;
        this.d = 1000L;
        this.e = "";
    }

    public wnh(izd izdVar) throws IOException {
        int i = izdVar.readByte() & 255;
        HashSet hashSet = new HashSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(izdVar.h());
        }
        Collections.unmodifiableSet(hashSet);
        int i3 = izdVar.readInt();
        if (izdVar.available() > 0) {
            this.b = TimeUnit.MINUTES.toMillis(izdVar.readUnsignedShort());
        } else {
            this.b = 0L;
        }
        if (izdVar.available() > 0) {
            this.a = i3;
            this.c = izdVar.readInt();
            this.d = izdVar.readInt();
        } else {
            this.a = i3 | 24;
            this.c = 100L;
            this.d = 1000L;
        }
        if (izdVar.available() > 0) {
            String strH = izdVar.h();
            String[] strArr = aik.a;
            this.e = strH != null ? strH : "";
        } else {
            this.e = "";
        }
        if (izdVar.available() > 0) {
            this.f = izdVar.readInt();
        } else {
            this.f = 4096;
        }
        if (izdVar.available() > 0) {
            izdVar.h();
        }
    }

    public final boolean a(int i) {
        return (this.a & i) != 0;
    }

    public final boolean b(int i) {
        return (this.f & i) != 0;
    }
}
