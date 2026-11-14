package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum l4o {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(d54.c),
    ENUM(null),
    MESSAGE(null);

    public final Serializable a;

    l4o(Serializable serializable) {
        this.a = serializable;
    }
}
