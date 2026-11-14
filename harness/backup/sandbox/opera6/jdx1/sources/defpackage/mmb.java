package defpackage;

import java.nio.Buffer;

/* loaded from: classes.dex */
public final class mmb {
    private mmb() {
    }

    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void mark(Buffer buffer) {
        buffer.mark();
    }

    public static void position(Buffer buffer, int i) {
        buffer.position(i);
    }

    public static void reset(Buffer buffer) {
        buffer.reset();
    }
}
