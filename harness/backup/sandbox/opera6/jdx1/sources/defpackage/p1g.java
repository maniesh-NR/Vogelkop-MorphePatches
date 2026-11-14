package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface p1g {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, yk8 yk8Var);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, yk8 yk8Var);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, yk8 yk8Var);

    Object parseFrom(r75 r75Var);

    Object parseFrom(r75 r75Var, yk8 yk8Var);

    Object parseFrom(v44 v44Var);

    Object parseFrom(v44 v44Var, yk8 yk8Var);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, int i, int i2);

    Object parseFrom(byte[] bArr, int i, int i2, yk8 yk8Var);

    Object parseFrom(byte[] bArr, yk8 yk8Var);

    Object parsePartialDelimitedFrom(InputStream inputStream);

    Object parsePartialDelimitedFrom(InputStream inputStream, yk8 yk8Var);

    Object parsePartialFrom(InputStream inputStream);

    Object parsePartialFrom(InputStream inputStream, yk8 yk8Var);

    Object parsePartialFrom(r75 r75Var);

    Object parsePartialFrom(r75 r75Var, yk8 yk8Var);

    Object parsePartialFrom(v44 v44Var);

    Object parsePartialFrom(v44 v44Var, yk8 yk8Var);

    Object parsePartialFrom(byte[] bArr);

    Object parsePartialFrom(byte[] bArr, int i, int i2);

    Object parsePartialFrom(byte[] bArr, int i, int i2, yk8 yk8Var);

    Object parsePartialFrom(byte[] bArr, yk8 yk8Var);
}
