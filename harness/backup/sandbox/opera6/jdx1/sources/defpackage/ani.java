package defpackage;

import defpackage.g72;

/* loaded from: classes.dex */
public interface ani {
    boolean equals(Object obj, Object obj2);

    int getSerializedSize(Object obj);

    int hashCode(Object obj);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, Object obj2);

    void mergeFrom(Object obj, u75 u75Var, yk8 yk8Var);

    void mergeFrom(Object obj, byte[] bArr, int i, int i2, g72.a aVar);

    Object newInstance();

    void writeTo(Object obj, a85 a85Var);
}
