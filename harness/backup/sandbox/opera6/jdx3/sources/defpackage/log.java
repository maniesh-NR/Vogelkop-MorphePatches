package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class log extends e55 {
    public static final ir5 h = new ir5();
    public final String b;
    public final evj c;
    public final String d;
    public final kog e;
    public final long f;
    public final List g;

    public log(String str, evj evjVar, String str2, kog kogVar, long j, ArrayList arrayList) {
        this.b = str;
        this.c = evjVar;
        this.d = str2;
        this.e = kogVar;
        this.f = j;
        this.g = Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || log.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((log) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
