package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public interface kro {
    public static final kqo a = new kqo((byte) 0);

    default String a() {
        return null;
    }

    default void a(String str) {
    }

    default boolean a(int i) {
        return i == 200;
    }

    Object b(InputStream inputStream);
}
