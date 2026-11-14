package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum bnb {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(d54.class, d54.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class a;
    public final Serializable b;

    bnb(Class cls, Serializable serializable) {
        this.a = cls;
        this.b = serializable;
    }
}
