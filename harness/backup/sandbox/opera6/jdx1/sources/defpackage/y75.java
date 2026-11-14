package defpackage;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class y75 extends a44 {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    Object wrapper;

    public static final class a extends y75 {
        private final byte[] buffer;
        private final b flusher;
        private final int limit;
        private final int offset;
        private int position;

        public a(byte[] bArr, int i, int i2) {
            this(bArr, i, i2, null);
        }

        public a(byte[] bArr, int i, int i2, b bVar) {
            super();
            if (bArr == null) {
                t3p.q("buffer");
                throw null;
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                Locale locale = Locale.US;
                h9o.q(i2, sko.o(bArr.length, i, "Array range is invalid. Buffer.length=", ", offset=", ", length="));
                throw null;
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i3;
            this.flusher = bVar;
        }

        @Override // defpackage.y75
        public void flush() {
            b bVar = this.flusher;
            if (bVar != null) {
                bVar.flush(this);
            }
        }

        @Override // defpackage.y75
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // defpackage.y75
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // defpackage.y75, defpackage.a44
        public final void write(byte b) throws d {
            int i = this.position;
            try {
                int i2 = i + 1;
                try {
                    this.buffer[i] = b;
                    this.position = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i2;
                    throw new d(i, this.limit, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
            }
        }

        @Override // defpackage.y75, defpackage.a44
        public final void write(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new d(this.position, this.limit, iRemaining, (Throwable) e);
            }
        }

        @Override // defpackage.y75, defpackage.a44
        public final void write(byte[] bArr, int i, int i2) throws d {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new d(this.position, this.limit, i2, (Throwable) e);
            }
        }

        @Override // defpackage.y75
        public final void writeBool(int i, boolean z) throws d {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // defpackage.y75
        public final void writeByteArray(int i, byte[] bArr) throws d {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // defpackage.y75
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws d {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        @Override // defpackage.y75
        public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws d {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // defpackage.y75
        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) throws d {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // defpackage.y75
        public final void writeBytes(int i, v44 v44Var) throws d {
            writeTag(i, 2);
            writeBytesNoTag(v44Var);
        }

        @Override // defpackage.y75
        public final void writeBytesNoTag(v44 v44Var) throws d {
            writeUInt32NoTag(v44Var.size());
            v44Var.writeTo(this);
        }

        @Override // defpackage.y75
        public final void writeFixed32(int i, int i2) throws d {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // defpackage.y75
        public final void writeFixed32NoTag(int i) throws d {
            int i2 = this.position;
            try {
                byte[] bArr = this.buffer;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                bArr[i2 + 3] = (byte) (i >> 24);
                this.position = i2 + 4;
            } catch (IndexOutOfBoundsException e) {
                throw new d(i2, this.limit, 4, (Throwable) e);
            }
        }

        @Override // defpackage.y75
        public final void writeFixed64(int i, long j) throws d {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // defpackage.y75
        public final void writeFixed64NoTag(long j) throws d {
            int i = this.position;
            try {
                byte[] bArr = this.buffer;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                bArr[i + 7] = (byte) (j >> 56);
                this.position = i + 8;
            } catch (IndexOutOfBoundsException e) {
                throw new d(i, this.limit, 8, (Throwable) e);
            }
        }

        @Override // defpackage.y75
        public final void writeInt32(int i, int i2) throws d {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // defpackage.y75
        public final void writeInt32NoTag(int i) throws d {
            if (i >= 0) {
                writeUInt32NoTag(i);
                return;
            }
            long j = i;
            int i2 = this.position;
            try {
                byte[] bArr = this.buffer;
                int i3 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    int i4 = i2 + 2;
                    try {
                        bArr[i3] = (byte) (((int) (j >>> 7)) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        int i5 = i2 + 3;
                        bArr[i4] = (byte) (((int) (j >>> 14)) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        i4 = i2 + 4;
                        bArr[i5] = (byte) (((int) (j >>> 21)) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        int i6 = i2 + 5;
                        bArr[i4] = (byte) (((int) (j >>> 28)) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        int i7 = i2 + 6;
                        try {
                            bArr[i6] = -1;
                            int i8 = i2 + 7;
                            bArr[i7] = -1;
                            i7 = i2 + 8;
                            bArr[i8] = -1;
                            i3 = i2 + 9;
                            bArr[i7] = -1;
                            i2 += 10;
                            bArr[i3] = 1;
                            this.position = i2;
                        } catch (IndexOutOfBoundsException e) {
                            int i9 = i7;
                            e = e;
                            i2 = i9;
                            throw new d(i2, this.limit, 10, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        i2 = i4;
                    }
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i2 = i3;
                }
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
            }
        }

        @Override // defpackage.y75, defpackage.a44
        public final void writeLazy(ByteBuffer byteBuffer) throws d {
            write(byteBuffer);
        }

        @Override // defpackage.y75, defpackage.a44
        public final void writeLazy(byte[] bArr, int i, int i2) throws d {
            write(bArr, i, i2);
        }

        @Override // defpackage.y75
        public final void writeMessage(int i, rvd rvdVar) throws d {
            writeTag(i, 2);
            writeMessageNoTag(rvdVar);
        }

        @Override // defpackage.y75
        public final void writeMessageNoTag(rvd rvdVar) throws d {
            writeUInt32NoTag(rvdVar.getSerializedSize());
            rvdVar.writeTo(this);
        }

        @Override // defpackage.y75
        public final void writeMessageSetExtension(int i, rvd rvdVar) throws d {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, rvdVar);
            writeTag(1, 4);
        }

        @Override // defpackage.y75
        public final void writeRawBytes(ByteBuffer byteBuffer) throws d {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            mmb.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // defpackage.y75
        public final void writeRawMessageSetExtension(int i, v44 v44Var) throws d {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, v44Var);
            writeTag(1, 4);
        }

        @Override // defpackage.y75
        public final void writeString(int i, String str) throws d {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // defpackage.y75
        public final void writeStringNoTag(String str) throws d {
            int i = this.position;
            try {
                int iComputeUInt32SizeNoTag = y75.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = y75.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(nym.encodedLength(str));
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = nym.encode(str, bArr, i2, bArr.length - i2);
                    return;
                }
                int i3 = i + iComputeUInt32SizeNoTag2;
                this.position = i3;
                byte[] bArr2 = this.buffer;
                int iEncode = nym.encode(str, bArr2, i3, bArr2.length - i3);
                this.position = i;
                writeUInt32NoTag((iEncode - i) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } catch (IndexOutOfBoundsException e) {
                throw new d(e);
            }
        }

        @Override // defpackage.y75
        public final void writeTag(int i, int i2) throws d {
            writeUInt32NoTag(j4o.makeTag(i, i2));
        }

        @Override // defpackage.y75
        public final void writeUInt32(int i, int i2) throws d {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // defpackage.y75
        public final void writeUInt32NoTag(int i) throws d {
            int i2 = this.position;
            int i3 = i & (-128);
            try {
                byte[] bArr = this.buffer;
                try {
                    if (i3 == 0) {
                        int i4 = i2 + 1;
                        bArr[i2] = (byte) i;
                        this.position = i4;
                        return;
                    }
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (i | NotificationCompat.FLAG_HIGH_PRIORITY);
                    int i6 = i >>> 7;
                    if ((i6 & (-128)) == 0) {
                        int i7 = i2 + 2;
                        bArr[i5] = (byte) i6;
                        this.position = i7;
                        return;
                    }
                    int i8 = i2 + 2;
                    try {
                        bArr[i5] = (byte) (i6 | NotificationCompat.FLAG_HIGH_PRIORITY);
                        int i9 = i >>> 14;
                        if ((i9 & (-128)) == 0) {
                            int i10 = i2 + 3;
                            bArr[i8] = (byte) i9;
                            this.position = i10;
                            return;
                        }
                        int i11 = i2 + 3;
                        try {
                            bArr[i8] = (byte) (i9 | NotificationCompat.FLAG_HIGH_PRIORITY);
                            int i12 = i >>> 21;
                            if ((i12 & (-128)) == 0) {
                                int i13 = i2 + 4;
                                bArr[i11] = (byte) i12;
                                this.position = i13;
                            } else {
                                i8 = i2 + 4;
                                bArr[i11] = (byte) (i12 | NotificationCompat.FLAG_HIGH_PRIORITY);
                                int i14 = i2 + 5;
                                bArr[i8] = (byte) (i >>> 28);
                                this.position = i14;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            e = e;
                            i2 = i11;
                            throw new d(i2, this.limit, 1, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        i2 = i8;
                    }
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i2 = i3;
                }
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
            }
        }

        @Override // defpackage.y75
        public final void writeUInt64(int i, long j) throws d {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // defpackage.y75
        public final void writeUInt64NoTag(long j) throws d {
            int i = this.position;
            long j2 = j & (-128);
            try {
                byte[] bArr = this.buffer;
                if (j2 == 0) {
                    bArr[i] = (byte) j;
                    this.position = i + 1;
                    return;
                }
                bArr[i] = (byte) (((int) j) | NotificationCompat.FLAG_HIGH_PRIORITY);
                long j3 = j >>> 7;
                if ((j3 & (-128)) == 0) {
                    bArr[i + 1] = (byte) j3;
                    this.position = i + 2;
                    return;
                }
                bArr[i + 1] = (byte) (((int) j3) | NotificationCompat.FLAG_HIGH_PRIORITY);
                long j4 = j >>> 14;
                if ((j4 & (-128)) == 0) {
                    bArr[i + 2] = (byte) j4;
                    this.position = i + 3;
                    return;
                }
                bArr[i + 2] = (byte) (((int) j4) | NotificationCompat.FLAG_HIGH_PRIORITY);
                long j5 = j >>> 21;
                if ((j5 & (-128)) == 0) {
                    bArr[i + 3] = (byte) j5;
                    this.position = i + 4;
                    return;
                }
                bArr[i + 3] = (byte) (((int) j5) | NotificationCompat.FLAG_HIGH_PRIORITY);
                long j6 = j >>> 28;
                if ((j6 & (-128)) == 0) {
                    bArr[i + 4] = (byte) j6;
                    this.position = i + 5;
                    return;
                }
                bArr[i + 4] = (byte) (((int) j6) | NotificationCompat.FLAG_HIGH_PRIORITY);
                long j7 = j >>> 35;
                if ((j7 & (-128)) == 0) {
                    bArr[i + 5] = (byte) j7;
                    this.position = i + 6;
                    return;
                }
                bArr[i + 5] = (byte) (((int) j7) | NotificationCompat.FLAG_HIGH_PRIORITY);
                long j8 = j >>> 42;
                if ((j8 & (-128)) == 0) {
                    bArr[i + 6] = (byte) j8;
                    this.position = i + 7;
                    return;
                }
                bArr[i + 6] = (byte) (((int) j8) | NotificationCompat.FLAG_HIGH_PRIORITY);
                long j9 = j >>> 49;
                if ((j9 & (-128)) == 0) {
                    bArr[i + 7] = (byte) j9;
                    this.position = i + 8;
                    return;
                }
                bArr[i + 7] = (byte) (((int) j9) | NotificationCompat.FLAG_HIGH_PRIORITY);
                long j10 = j >>> 56;
                if (((-128) & j10) == 0) {
                    bArr[i + 8] = (byte) j10;
                    this.position = i + 9;
                } else {
                    bArr[i + 8] = (byte) (((int) j10) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    bArr[i + 9] = (byte) (j >>> 63);
                    this.position = i + 10;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new d(i, this.limit, 1, (Throwable) e);
            }
        }
    }

    public static final class b {
        private final ByteBuffer byteBuffer;
        private final int initialPosition;

        public b(ByteBuffer byteBuffer) {
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        public void flush(a aVar) {
            mmb.position(this.byteBuffer, aVar.getTotalBytesWritten() + this.initialPosition);
        }
    }

    public static final class c extends y75 {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        public c(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws d {
            try {
                nym.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e) {
                throw new d(e);
            }
        }

        @Override // defpackage.y75
        public void flush() {
            mmb.position(this.originalBuffer, this.buffer.position());
        }

        @Override // defpackage.y75
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // defpackage.y75
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // defpackage.y75, defpackage.a44
        public void write(byte b) throws d {
            try {
                this.buffer.put(b);
            } catch (BufferOverflowException e) {
                throw new d(this.buffer.position(), this.buffer.limit(), 1, (Throwable) e);
            }
        }

        @Override // defpackage.y75, defpackage.a44
        public void write(ByteBuffer byteBuffer) throws d {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new d(e);
            }
        }

        @Override // defpackage.y75, defpackage.a44
        public void write(byte[] bArr, int i, int i2) throws d {
            try {
                this.buffer.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new d(e);
            } catch (BufferOverflowException e2) {
                throw new d(e2);
            }
        }

        @Override // defpackage.y75
        public void writeBool(int i, boolean z) throws d {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // defpackage.y75
        public void writeByteArray(int i, byte[] bArr) throws d {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // defpackage.y75
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws d {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        @Override // defpackage.y75
        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws d {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // defpackage.y75
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws d {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // defpackage.y75
        public void writeBytes(int i, v44 v44Var) throws d {
            writeTag(i, 2);
            writeBytesNoTag(v44Var);
        }

        @Override // defpackage.y75
        public void writeBytesNoTag(v44 v44Var) throws d {
            writeUInt32NoTag(v44Var.size());
            v44Var.writeTo(this);
        }

        @Override // defpackage.y75
        public void writeFixed32(int i, int i2) throws d {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // defpackage.y75
        public void writeFixed32NoTag(int i) throws d {
            try {
                this.buffer.putInt(i);
            } catch (BufferOverflowException e) {
                throw new d(this.buffer.position(), this.buffer.limit(), 4, (Throwable) e);
            }
        }

        @Override // defpackage.y75
        public void writeFixed64(int i, long j) throws d {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // defpackage.y75
        public void writeFixed64NoTag(long j) throws d {
            try {
                this.buffer.putLong(j);
            } catch (BufferOverflowException e) {
                throw new d(this.buffer.position(), this.buffer.limit(), 8, (Throwable) e);
            }
        }

        @Override // defpackage.y75
        public void writeInt32(int i, int i2) throws d {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // defpackage.y75
        public void writeInt32NoTag(int i) throws d {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // defpackage.y75, defpackage.a44
        public void writeLazy(ByteBuffer byteBuffer) throws d {
            write(byteBuffer);
        }

        @Override // defpackage.y75, defpackage.a44
        public void writeLazy(byte[] bArr, int i, int i2) throws d {
            write(bArr, i, i2);
        }

        @Override // defpackage.y75
        public void writeMessage(int i, rvd rvdVar) throws d {
            writeTag(i, 2);
            writeMessageNoTag(rvdVar);
        }

        @Override // defpackage.y75
        public void writeMessageNoTag(rvd rvdVar) throws d {
            writeUInt32NoTag(rvdVar.getSerializedSize());
            rvdVar.writeTo(this);
        }

        @Override // defpackage.y75
        public void writeMessageSetExtension(int i, rvd rvdVar) throws d {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, rvdVar);
            writeTag(1, 4);
        }

        @Override // defpackage.y75
        public void writeRawBytes(ByteBuffer byteBuffer) throws d {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            mmb.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // defpackage.y75
        public void writeRawMessageSetExtension(int i, v44 v44Var) throws d {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, v44Var);
            writeTag(1, 4);
        }

        @Override // defpackage.y75
        public void writeString(int i, String str) throws d {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // defpackage.y75
        public void writeStringNoTag(String str) throws d {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = y75.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = y75.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(nym.encodedLength(str));
                    encode(str);
                    return;
                }
                int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                mmb.position(this.buffer, iPosition2);
                encode(str);
                int iPosition3 = this.buffer.position();
                mmb.position(this.buffer, iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                mmb.position(this.buffer, iPosition3);
            } catch (IllegalArgumentException e) {
                throw new d(e);
            }
        }

        @Override // defpackage.y75
        public void writeTag(int i, int i2) throws d {
            writeUInt32NoTag(j4o.makeTag(i, i2));
        }

        @Override // defpackage.y75
        public void writeUInt32(int i, int i2) throws d {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // defpackage.y75
        public void writeUInt32NoTag(int i) throws d {
            while (true) {
                int i2 = i & (-128);
                try {
                    ByteBuffer byteBuffer = this.buffer;
                    if (i2 == 0) {
                        byteBuffer.put((byte) i);
                        return;
                    } else {
                        byteBuffer.put((byte) (i | NotificationCompat.FLAG_HIGH_PRIORITY));
                        i >>>= 7;
                    }
                } catch (BufferOverflowException e) {
                    throw new d(e);
                }
            }
        }

        @Override // defpackage.y75
        public void writeUInt64(int i, long j) throws d {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // defpackage.y75
        public void writeUInt64NoTag(long j) throws d {
            while (true) {
                long j2 = (-128) & j;
                try {
                    ByteBuffer byteBuffer = this.buffer;
                    if (j2 == 0) {
                        byteBuffer.put((byte) j);
                        return;
                    } else {
                        byteBuffer.put((byte) (((int) j) | NotificationCompat.FLAG_HIGH_PRIORITY));
                        j >>>= 7;
                    }
                } catch (BufferOverflowException e) {
                    throw new d(e);
                }
            }
        }
    }

    public static class d extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public d() {
            super(MESSAGE);
        }

        public d(int i, int i2, int i3) {
            this(i, i2, i3, (Throwable) null);
        }

        public d(int i, int i2, int i3, Throwable th) {
            this(i, i2, i3, th);
        }

        public d(long j, long j2, int i) {
            this(j, j2, i, (Throwable) null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(long j, long j2, int i, Throwable th) {
            Locale locale = Locale.US;
            StringBuilder sbQ = p3p.q(j, "Pos: ", ", limit: ");
            sbQ.append(j2);
            sbQ.append(", len: ");
            sbQ.append(i);
            this(sbQ.toString(), th);
        }

        public d(String str) {
            super(sko.j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public d(String str, Throwable th) {
            super(sko.j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public d(Throwable th) {
            super(MESSAGE, th);
        }
    }

    public static final class e extends y75 {
        private final byte[] buffer;
        private final int limit;
        private final OutputStream out;
        private int position;
        private int totalBytesWritten;

        public e(OutputStream outputStream, int i) {
            super();
            if (outputStream == null) {
                t3p.q("out");
                throw null;
            }
            this.out = outputStream;
            if (i < 0) {
                qp2.o("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i) throws IOException {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        public final void buffer(byte b) {
            int i = this.position;
            this.buffer[i] = b;
            this.position = i + 1;
            this.totalBytesWritten++;
        }

        public final void bufferFixed32NoTag(int i) {
            int i2 = this.position;
            byte[] bArr = this.buffer;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.position = i2 + 4;
            this.totalBytesWritten += 4;
        }

        public final void bufferFixed64NoTag(long j) {
            int i = this.position;
            byte[] bArr = this.buffer;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.position = i + 8;
            this.totalBytesWritten += 8;
        }

        public final void bufferInt32NoTag(int i) {
            if (i >= 0) {
                bufferUInt32NoTag(i);
            } else {
                bufferUInt64NoTag(i);
            }
        }

        public final void bufferTag(int i, int i2) {
            bufferUInt32NoTag(j4o.makeTag(i, i2));
        }

        public final void bufferUInt32NoTag(int i) {
            int i2 = this.position;
            int i3 = this.totalBytesWritten;
            int i4 = i & (-128);
            byte[] bArr = this.buffer;
            if (i4 == 0) {
                bArr[i2] = (byte) i;
                this.position = i2 + 1;
                this.totalBytesWritten = i3 + 1;
                return;
            }
            bArr[i2] = (byte) (i | NotificationCompat.FLAG_HIGH_PRIORITY);
            int i5 = i >>> 7;
            if ((i5 & (-128)) == 0) {
                bArr[i2 + 1] = (byte) i5;
                this.position = i2 + 2;
                this.totalBytesWritten = i3 + 2;
                return;
            }
            bArr[i2 + 1] = (byte) (i5 | NotificationCompat.FLAG_HIGH_PRIORITY);
            int i6 = i >>> 14;
            if ((i6 & (-128)) == 0) {
                bArr[i2 + 2] = (byte) i6;
                this.position = i2 + 3;
                this.totalBytesWritten = i3 + 3;
                return;
            }
            bArr[i2 + 2] = (byte) (i6 | NotificationCompat.FLAG_HIGH_PRIORITY);
            int i7 = i >>> 21;
            if ((i7 & (-128)) == 0) {
                bArr[i2 + 3] = (byte) i7;
                this.position = i2 + 4;
                this.totalBytesWritten = i3 + 4;
            } else {
                bArr[i2 + 3] = (byte) (i7 | NotificationCompat.FLAG_HIGH_PRIORITY);
                bArr[i2 + 4] = (byte) (i >>> 28);
                this.position = i2 + 5;
                this.totalBytesWritten = i3 + 5;
            }
        }

        public final void bufferUInt64NoTag(long j) {
            int i = this.position;
            int i2 = this.totalBytesWritten;
            long j2 = j & (-128);
            byte[] bArr = this.buffer;
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.position = i + 1;
                this.totalBytesWritten = i2 + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | NotificationCompat.FLAG_HIGH_PRIORITY);
            long j3 = j >>> 7;
            if ((j3 & (-128)) == 0) {
                bArr[i + 1] = (byte) j3;
                this.position = i + 2;
                this.totalBytesWritten = i2 + 2;
                return;
            }
            bArr[i + 1] = (byte) (((int) j3) | NotificationCompat.FLAG_HIGH_PRIORITY);
            long j4 = j >>> 14;
            if ((j4 & (-128)) == 0) {
                bArr[i + 2] = (byte) j4;
                this.position = i + 3;
                this.totalBytesWritten = i2 + 3;
                return;
            }
            bArr[i + 2] = (byte) (((int) j4) | NotificationCompat.FLAG_HIGH_PRIORITY);
            long j5 = j >>> 21;
            if ((j5 & (-128)) == 0) {
                bArr[i + 3] = (byte) j5;
                this.position = i + 4;
                this.totalBytesWritten = i2 + 4;
                return;
            }
            bArr[i + 3] = (byte) (((int) j5) | NotificationCompat.FLAG_HIGH_PRIORITY);
            long j6 = j >>> 28;
            if ((j6 & (-128)) == 0) {
                bArr[i + 4] = (byte) j6;
                this.position = i + 5;
                this.totalBytesWritten = i2 + 5;
                return;
            }
            bArr[i + 4] = (byte) (((int) j6) | NotificationCompat.FLAG_HIGH_PRIORITY);
            long j7 = j >>> 35;
            if ((j7 & (-128)) == 0) {
                bArr[i + 5] = (byte) j7;
                this.position = i + 6;
                this.totalBytesWritten = i2 + 6;
                return;
            }
            bArr[i + 5] = (byte) (((int) j7) | NotificationCompat.FLAG_HIGH_PRIORITY);
            long j8 = j >>> 42;
            if ((j8 & (-128)) == 0) {
                bArr[i + 6] = (byte) j8;
                this.position = i + 7;
                this.totalBytesWritten = i2 + 7;
                return;
            }
            bArr[i + 6] = (byte) (((int) j8) | NotificationCompat.FLAG_HIGH_PRIORITY);
            long j9 = j >>> 49;
            if ((j9 & (-128)) == 0) {
                bArr[i + 7] = (byte) j9;
                this.position = i + 8;
                this.totalBytesWritten = i2 + 8;
                return;
            }
            bArr[i + 7] = (byte) (((int) j9) | NotificationCompat.FLAG_HIGH_PRIORITY);
            long j10 = j >>> 56;
            if (((-128) & j10) == 0) {
                bArr[i + 8] = (byte) j10;
                this.position = i + 9;
                this.totalBytesWritten = i2 + 9;
            } else {
                bArr[i + 8] = (byte) (((int) j10) | NotificationCompat.FLAG_HIGH_PRIORITY);
                bArr[i + 9] = (byte) (j >>> 63);
                this.position = i + 10;
                this.totalBytesWritten = i2 + 10;
            }
        }

        @Override // defpackage.y75
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // defpackage.y75
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // defpackage.y75
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        @Override // defpackage.y75, defpackage.a44
        public void write(byte b) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b);
        }

        @Override // defpackage.y75, defpackage.a44
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.limit;
            int i2 = this.position;
            int i3 = i - i2;
            byte[] bArr = this.buffer;
            if (i3 >= iRemaining) {
                byteBuffer.get(bArr, i2, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i4 = i - i2;
            byteBuffer.get(bArr, i2, i4);
            int i5 = iRemaining - i4;
            this.position = this.limit;
            this.totalBytesWritten += i4;
            doFlush();
            while (true) {
                int i6 = this.limit;
                byte[] bArr2 = this.buffer;
                if (i5 <= i6) {
                    byteBuffer.get(bArr2, 0, i5);
                    this.position = i5;
                    this.totalBytesWritten += i5;
                    return;
                } else {
                    byteBuffer.get(bArr2, 0, i6);
                    this.out.write(this.buffer, 0, this.limit);
                    int i7 = this.limit;
                    i5 -= i7;
                    this.totalBytesWritten += i7;
                }
            }
        }

        @Override // defpackage.y75, defpackage.a44
        public void write(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.limit;
            int i4 = this.position;
            int i5 = i3 - i4;
            byte[] bArr2 = this.buffer;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.position += i2;
                this.totalBytesWritten += i2;
                return;
            }
            int i6 = i3 - i4;
            System.arraycopy(bArr, i, bArr2, i4, i6);
            int i7 = i + i6;
            int i8 = i2 - i6;
            this.position = this.limit;
            this.totalBytesWritten += i6;
            doFlush();
            if (i8 <= this.limit) {
                System.arraycopy(bArr, i7, this.buffer, 0, i8);
                this.position = i8;
            } else {
                this.out.write(bArr, i7, i8);
            }
            this.totalBytesWritten += i8;
        }

        @Override // defpackage.y75
        public void writeBool(int i, boolean z) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer(z ? (byte) 1 : (byte) 0);
        }

        @Override // defpackage.y75
        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // defpackage.y75
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        @Override // defpackage.y75
        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // defpackage.y75
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // defpackage.y75
        public void writeBytes(int i, v44 v44Var) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(v44Var);
        }

        @Override // defpackage.y75
        public void writeBytesNoTag(v44 v44Var) throws IOException {
            writeUInt32NoTag(v44Var.size());
            v44Var.writeTo(this);
        }

        @Override // defpackage.y75
        public void writeFixed32(int i, int i2) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i2);
        }

        @Override // defpackage.y75
        public void writeFixed32NoTag(int i) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        @Override // defpackage.y75
        public void writeFixed64(int i, long j) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j);
        }

        @Override // defpackage.y75
        public void writeFixed64NoTag(long j) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j);
        }

        @Override // defpackage.y75
        public void writeInt32(int i, int i2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i2);
        }

        @Override // defpackage.y75
        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // defpackage.y75, defpackage.a44
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // defpackage.y75, defpackage.a44
        public void writeLazy(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // defpackage.y75
        public void writeMessage(int i, rvd rvdVar) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(rvdVar);
        }

        @Override // defpackage.y75
        public void writeMessageNoTag(rvd rvdVar) throws IOException {
            writeUInt32NoTag(rvdVar.getSerializedSize());
            rvdVar.writeTo(this);
        }

        @Override // defpackage.y75
        public void writeMessageSetExtension(int i, rvd rvdVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, rvdVar);
            writeTag(1, 4);
        }

        @Override // defpackage.y75
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            mmb.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // defpackage.y75
        public void writeRawMessageSetExtension(int i, v44 v44Var) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, v44Var);
            writeTag(1, 4);
        }

        @Override // defpackage.y75
        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // defpackage.y75
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = y75.computeUInt32SizeNoTag(length);
            int i = iComputeUInt32SizeNoTag + length;
            int i2 = this.limit;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iEncode = nym.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i > i2 - this.position) {
                doFlush();
            }
            int iComputeUInt32SizeNoTag2 = y75.computeUInt32SizeNoTag(str.length());
            int i3 = this.position;
            try {
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i4 = i3 + iComputeUInt32SizeNoTag2;
                    this.position = i4;
                    int iEncode2 = nym.encode(str, this.buffer, i4, this.limit - i4);
                    this.position = i3;
                    iEncodedLength = (iEncode2 - i3) - iComputeUInt32SizeNoTag2;
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = iEncode2;
                } else {
                    iEncodedLength = nym.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = nym.encode(str, this.buffer, this.position, iEncodedLength);
                }
                this.totalBytesWritten += iEncodedLength;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new d(e);
            }
        }

        @Override // defpackage.y75
        public void writeTag(int i, int i2) throws IOException {
            writeUInt32NoTag(j4o.makeTag(i, i2));
        }

        @Override // defpackage.y75
        public void writeUInt32(int i, int i2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i2);
        }

        @Override // defpackage.y75
        public void writeUInt32NoTag(int i) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i);
        }

        @Override // defpackage.y75
        public void writeUInt64(int i, long j) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j);
        }

        @Override // defpackage.y75
        public void writeUInt64NoTag(long j) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j);
        }
    }

    private y75() {
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeBoolSizeNoTag(z) + computeTagSize(i);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i, v44 v44Var) {
        return computeBytesSizeNoTag(v44Var) + computeTagSize(i);
    }

    public static int computeBytesSizeNoTag(v44 v44Var) {
        return computeLengthDelimitedFieldSize(v44Var.size());
    }

    public static int computeDoubleSize(int i, double d2) {
        return computeDoubleSizeNoTag(d2) + computeTagSize(i);
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeEnumSizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeFixed32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64Size(int i, long j) {
        return computeFixed64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeFloatSizeNoTag(f) + computeTagSize(i);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i, rvd rvdVar) {
        return rvdVar.getSerializedSize() + (computeTagSize(i) << 1);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(rvd rvdVar) {
        return rvdVar.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeInt32SizeNoTag(int i) {
        return computeUInt64SizeNoTag(i);
    }

    public static int computeInt64Size(int i, long j) {
        return computeInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    @Deprecated
    public static int computeLazyFieldMessageSetExtensionSize(int i, t4c t4cVar) {
        return t4cVar.computeMessageSetExtensionSize(i);
    }

    @Deprecated
    public static int computeLazyFieldSize(int i, t4c t4cVar) {
        return t4cVar.computeSize(i);
    }

    @Deprecated
    public static int computeLazyFieldSizeNoTag(t4c t4cVar) {
        return t4cVar.computeSizeNoTag();
    }

    public static int computeLengthDelimitedFieldSize(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    public static int computeMessageSetExtensionSize(int i, rvd rvdVar) {
        return computeMessageSize(3, rvdVar) + computeUInt32Size(2, i) + (computeTagSize(1) << 1);
    }

    public static int computeMessageSize(int i, rvd rvdVar) {
        return computeMessageSizeNoTag(rvdVar) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(rvd rvdVar) {
        return computeLengthDelimitedFieldSize(rvdVar.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int computeRawMessageSetExtensionSize(int i, v44 v44Var) {
        return computeBytesSize(3, v44Var) + computeUInt32Size(2, i) + (computeTagSize(1) << 1);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeSFixed32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeSFixed64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeSInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeSInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeStringSize(int i, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i);
    }

    public static int computeStringSizeNoTag(String str) {
        return computeLengthDelimitedFieldSize(nym.encodedLength(str));
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(j4o.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeUInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return p3p.e(i, 9, 352) >>> 6;
    }

    public static int computeUInt64Size(int i, long j) {
        return computeUInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return p3p.f(9, 640, j) >>> 6;
    }

    public static int encodeZigZag32(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static long encodeZigZag64(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static y75 newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static y75 newInstance(OutputStream outputStream, int i) {
        return new e(outputStream, i);
    }

    public static y75 newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            qp2.o("ByteBuffer is read-only");
            return null;
        }
        if (byteBuffer.hasArray()) {
            return new a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), new b(byteBuffer));
        }
        if (byteBuffer.isDirect()) {
            return new c(byteBuffer);
        }
        qp2.o("ByteBuffer mut be either direct or array");
        return null;
    }

    @Deprecated
    public static y75 newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }

    public static y75 newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static y75 newInstance(byte[] bArr, int i, int i2) {
        return new a(bArr, i, i2);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() > 0) {
            qp2.n("Did not write as much data as expected.");
        } else {
            if (spaceLeft() >= 0) {
                return;
            }
            qp2.n("Wrote more data than expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // defpackage.a44
    public abstract void write(byte b2);

    @Override // defpackage.a44
    public abstract void write(ByteBuffer byteBuffer);

    @Override // defpackage.a44
    public abstract void write(byte[] bArr, int i, int i2);

    public abstract void writeBool(int i, boolean z);

    public final void writeBoolNoTag(boolean z) {
        write(z ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i, byte[] bArr);

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i, int i2);

    public abstract void writeByteBuffer(int i, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i, v44 v44Var);

    public abstract void writeBytesNoTag(v44 v44Var);

    public final void writeDouble(int i, double d2) {
        writeFixed64(i, Double.doubleToRawLongBits(d2));
    }

    public final void writeDoubleNoTag(double d2) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d2));
    }

    public final void writeEnum(int i, int i2) {
        writeInt32(i, i2);
    }

    public final void writeEnumNoTag(int i) {
        writeInt32NoTag(i);
    }

    public abstract void writeFixed32(int i, int i2);

    public abstract void writeFixed32NoTag(int i);

    public abstract void writeFixed64(int i, long j);

    public abstract void writeFixed64NoTag(long j);

    public final void writeFloat(int i, float f) {
        writeFixed32(i, Float.floatToRawIntBits(f));
    }

    public final void writeFloatNoTag(float f) {
        writeFixed32NoTag(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void writeGroup(int i, rvd rvdVar) {
        writeTag(i, 3);
        writeGroupNoTag(rvdVar);
        writeTag(i, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(rvd rvdVar) {
        rvdVar.writeTo(this);
    }

    public abstract void writeInt32(int i, int i2);

    public abstract void writeInt32NoTag(int i);

    public final void writeInt64(int i, long j) {
        writeUInt64(i, j);
    }

    public final void writeInt64NoTag(long j) {
        writeUInt64NoTag(j);
    }

    @Override // defpackage.a44
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // defpackage.a44
    public abstract void writeLazy(byte[] bArr, int i, int i2);

    public abstract void writeMessage(int i, rvd rvdVar);

    public abstract void writeMessageNoTag(rvd rvdVar);

    public abstract void writeMessageSetExtension(int i, rvd rvdVar);

    public final void writeRawByte(byte b2) {
        write(b2);
    }

    public final void writeRawByte(int i) {
        write((byte) i);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(v44 v44Var) {
        v44Var.writeTo(this);
    }

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i) {
        writeFixed32NoTag(i);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j) {
        writeFixed64NoTag(j);
    }

    public abstract void writeRawMessageSetExtension(int i, v44 v44Var);

    @Deprecated
    public final void writeRawVarint32(int i) {
        writeUInt32NoTag(i);
    }

    @Deprecated
    public final void writeRawVarint64(long j) {
        writeUInt64NoTag(j);
    }

    public final void writeSFixed32(int i, int i2) {
        writeFixed32(i, i2);
    }

    public final void writeSFixed32NoTag(int i) {
        writeFixed32NoTag(i);
    }

    public final void writeSFixed64(int i, long j) {
        writeFixed64(i, j);
    }

    public final void writeSFixed64NoTag(long j) {
        writeFixed64NoTag(j);
    }

    public final void writeSInt32(int i, int i2) {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSInt32NoTag(int i) {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSInt64(int i, long j) {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSInt64NoTag(long j) {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public abstract void writeString(int i, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i, int i2);

    public abstract void writeUInt32(int i, int i2);

    public abstract void writeUInt32NoTag(int i);

    public abstract void writeUInt64(int i, long j);

    public abstract void writeUInt64NoTag(long j);
}
