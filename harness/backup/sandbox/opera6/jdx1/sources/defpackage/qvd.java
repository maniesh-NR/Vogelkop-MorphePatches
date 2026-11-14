package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public interface qvd extends svd, Cloneable {
    rvd build();

    rvd buildPartial();

    qvd clear();

    qvd clone();

    @Override // defpackage.svd
    /* synthetic */ rvd getDefaultInstanceForType();

    @Override // defpackage.svd
    /* synthetic */ boolean isInitialized();

    boolean mergeDelimitedFrom(InputStream inputStream);

    boolean mergeDelimitedFrom(InputStream inputStream, yk8 yk8Var);

    qvd mergeFrom(InputStream inputStream);

    qvd mergeFrom(InputStream inputStream, yk8 yk8Var);

    qvd mergeFrom(r75 r75Var);

    qvd mergeFrom(r75 r75Var, yk8 yk8Var);

    qvd mergeFrom(rvd rvdVar);

    qvd mergeFrom(v44 v44Var);

    qvd mergeFrom(v44 v44Var, yk8 yk8Var);

    qvd mergeFrom(byte[] bArr);

    qvd mergeFrom(byte[] bArr, int i, int i2);

    qvd mergeFrom(byte[] bArr, int i, int i2, yk8 yk8Var);

    qvd mergeFrom(byte[] bArr, yk8 yk8Var);
}
