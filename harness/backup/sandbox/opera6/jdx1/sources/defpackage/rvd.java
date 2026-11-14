package defpackage;

import java.io.OutputStream;

/* loaded from: classes.dex */
public interface rvd extends svd {
    @Override // defpackage.svd
    /* synthetic */ rvd getDefaultInstanceForType();

    p1g getParserForType();

    int getSerializedSize();

    @Override // defpackage.svd
    /* synthetic */ boolean isInitialized();

    qvd newBuilderForType();

    qvd toBuilder();

    byte[] toByteArray();

    v44 toByteString();

    void writeDelimitedTo(OutputStream outputStream);

    void writeTo(OutputStream outputStream);

    void writeTo(y75 y75Var);
}
