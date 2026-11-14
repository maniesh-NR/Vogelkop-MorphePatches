package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class kh8 extends FilterOutputStream {
    public static final byte[] g = "Exif\u0000\u0000".getBytes(sg8.d);
    public final zg8 a;
    public final byte[] b;
    public final ByteBuffer c;
    public byte d;
    public int e;
    public int f;

    public kh8(ByteArrayOutputStream byteArrayOutputStream, zg8 zg8Var) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.d = (byte) 0;
        this.a = zg8Var;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0342, code lost:
    
        if (r3 <= 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0344, code lost:
    
        ((java.io.FilterOutputStream) r17).out.write(r18, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0349, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh8.write(byte[], int, int):void");
    }
}
