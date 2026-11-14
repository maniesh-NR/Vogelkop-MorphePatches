package defpackage;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class z34 extends FilterOutputStream {
    public final /* synthetic */ byte a = 2;
    public Object b;
    public final Object c;

    public z34(FileOutputStream fileOutputStream, c5o c5oVar) {
        super(fileOutputStream);
        this.c = c5oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z34(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.c = outputStream;
        this.b = byteOrder;
    }

    public z34(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.c = new DataOutputStream(outputStream);
        this.b = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 2:
                super.close();
                c5o c5oVar = (c5o) this.c;
                c5oVar.getClass();
                f8a f8aVar = f8a.d;
                this.b = w7d.u((MessageDigest) c5oVar.a, ((f8a) c5oVar.b).b);
                break;
            default:
                super.close();
                break;
        }
    }

    public final void h(int i) throws IOException {
        ((DataOutputStream) this.c).write(i);
    }

    public final void k(int i) throws IOException {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                OutputStream outputStream = (OutputStream) obj;
                ByteOrder byteOrder = (ByteOrder) this.b;
                if (byteOrder != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((i >>> 24) & 255);
                        outputStream.write((i >>> 16) & 255);
                        outputStream.write((i >>> 8) & 255);
                        outputStream.write(i & 255);
                        break;
                    }
                } else {
                    outputStream.write(i & 255);
                    outputStream.write((i >>> 8) & 255);
                    outputStream.write((i >>> 16) & 255);
                    outputStream.write((i >>> 24) & 255);
                    break;
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) obj;
                ByteOrder byteOrder2 = (ByteOrder) this.b;
                if (byteOrder2 != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                        dataOutputStream.write((i >>> 24) & 255);
                        dataOutputStream.write((i >>> 16) & 255);
                        dataOutputStream.write((i >>> 8) & 255);
                        dataOutputStream.write(i & 255);
                        break;
                    }
                } else {
                    dataOutputStream.write(i & 255);
                    dataOutputStream.write((i >>> 8) & 255);
                    dataOutputStream.write((i >>> 16) & 255);
                    dataOutputStream.write((i >>> 24) & 255);
                    break;
                }
                break;
        }
    }

    public final void l(short s) throws IOException {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                OutputStream outputStream = (OutputStream) obj;
                ByteOrder byteOrder = (ByteOrder) this.b;
                if (byteOrder != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((s >>> 8) & 255);
                        outputStream.write(s & 255);
                        break;
                    }
                } else {
                    outputStream.write(s & 255);
                    outputStream.write((s >>> 8) & 255);
                    break;
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) obj;
                ByteOrder byteOrder2 = (ByteOrder) this.b;
                if (byteOrder2 != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                        dataOutputStream.write((s >>> 8) & 255);
                        dataOutputStream.write(s & 255);
                        break;
                    }
                } else {
                    dataOutputStream.write(s & 255);
                    dataOutputStream.write((s >>> 8) & 255);
                    break;
                }
                break;
        }
    }

    public final void m(long j) throws IOException {
        if (j <= 4294967295L) {
            k((int) j);
        } else {
            qp2.o("val is larger than the maximum value of a 32-bit unsigned integer");
        }
    }

    public final void n(int i) throws IOException {
        if (i <= 65535) {
            l((short) i);
        } else {
            qp2.o("val is larger than the maximum value of a 16-bit unsigned integer");
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.a) {
            case 2:
                ((FilterOutputStream) this).out.write(i);
                ((MessageDigest) ((c5o) this.c).a).update((byte) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.a) {
            case 0:
                ((OutputStream) this.c).write(bArr);
                break;
            case 1:
                ((DataOutputStream) this.c).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((OutputStream) obj).write(bArr, i, i2);
                break;
            case 1:
                ((DataOutputStream) obj).write(bArr, i, i2);
                break;
            default:
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                ((MessageDigest) ((c5o) obj).a).update(bArr, i, i2);
                break;
        }
    }
}
