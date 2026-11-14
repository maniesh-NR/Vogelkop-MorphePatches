package com.opera.android.browser;

import defpackage.sko;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class SessionRestore$State {
    public final long a;
    public final n9g b;

    public SessionRestore$State(n9g n9gVar, long j) {
        this.b = n9gVar;
        this.a = j;
    }

    public static SessionRestore$State a(DataInputStream dataInputStream, d5o d5oVar, c5o c5oVar) throws IOException {
        BrowserTabState browserTabStateB;
        long jNanoTime = System.nanoTime();
        int i = dataInputStream.readInt();
        if (i != 1) {
            s49.m(p3p.i(i, "Unhandled version ", ", expected 1"));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = dataInputStream.readInt();
        if (i2 > 3) {
            s49.m(p3p.i(i2, "Unhandled version ", ", expected 3"));
            return null;
        }
        if (i2 > 2) {
            dataInputStream.readLong();
        }
        int i3 = dataInputStream.readInt();
        int i4 = dataInputStream.readInt();
        if (i4 <= 0) {
            s49.m(sko.i(i4, "Invalid tab count: "));
            return null;
        }
        int iT = i3;
        for (int i5 = 0; i5 < i4; i5++) {
            int iA = vep.A(i2 > 1 ? vep.B(2)[dataInputStream.read()] : 1);
            if (iA != 0) {
                if (iA == 1) {
                    int i6 = dataInputStream.read();
                    dataInputStream.read();
                    for (int i7 = 0; i7 < i6; i7++) {
                        dataInputStream.read();
                        dataInputStream.readUTF();
                        dataInputStream.readUTF();
                    }
                }
                browserTabStateB = null;
            } else {
                browserTabStateB = BrowserTabState.b(dataInputStream, d5oVar, c5oVar);
            }
            if (browserTabStateB != null) {
                arrayList.add(browserTabStateB);
            } else if (i5 <= i3 && iT > 0) {
                iT--;
            }
        }
        if (!arrayList.isEmpty()) {
            iT = cs5.t(iT, 0, arrayList.size() - 1);
        }
        return new SessionRestore$State(new n9g(iT, arrayList), System.nanoTime() - jNanoTime);
    }

    public static SessionRestore$State b() {
        return new SessionRestore$State(new n9g(0, Collections.EMPTY_LIST), 0L);
    }
}
