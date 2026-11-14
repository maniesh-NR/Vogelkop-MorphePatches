package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class bul {
    public final String a;
    public final AtomicInteger b;
    public final AtomicLong c;

    public bul(String str) {
        this.b = new AtomicInteger();
        this.c = new AtomicLong(-1L);
        this.a = str;
    }

    public bul(String str, int i, long j) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.b = atomicInteger;
        AtomicLong atomicLong = new AtomicLong(-1L);
        this.c = atomicLong;
        this.a = str;
        atomicInteger.set(i);
        atomicLong.set(j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bul) {
            return this.a.equals(((bul) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
