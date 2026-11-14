package org.chromium.media;

/* loaded from: classes.dex */
public final class HdrMetadata {
    public long a;
    public final Object b = new Object();

    public HdrMetadata(long j) {
        this.a = j;
    }

    public static HdrMetadata create(long j) {
        return new HdrMetadata(j);
    }

    public final void close() {
        synchronized (this.b) {
            this.a = 0L;
        }
    }
}
