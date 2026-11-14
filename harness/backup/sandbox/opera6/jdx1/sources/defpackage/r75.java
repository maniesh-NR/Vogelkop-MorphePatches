package defpackage;

import androidx.core.app.NotificationCompat;
import defpackage.j4o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r75 {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    private static f varintExperiment = f.CONTROL;
    int groupDepth;
    int messageDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    Object wrapper;

    public static abstract class a extends r75 {
        private final byte[] buffer;
        private final int bufferLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private a(byte[] bArr, int i, int i2, boolean z) {
            super(null);
            this.currentLimit = r75.DEFAULT_SIZE_LIMIT;
            this.buffer = bArr;
            int i3 = i2 + i;
            this.bufferLimit = i3;
            this.limit = i3;
            this.pos = i;
            this.startPos = i;
            this.immutable = z;
        }

        public /* synthetic */ a(byte[] bArr, int i, int i2, boolean z, m75 m75Var) {
            this(bArr, i, i2, z);
        }

        private void popLimitAfterMessage(int i) throws bjb {
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw bjb.truncatedMessage();
            }
            popLimit(i);
        }

        private int pushLimitBeforeMessage() throws bjb {
            int rawVarint32Expected5BytesMax = readRawVarint32Expected5BytesMax();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32Expected5BytesMax);
            this.messageDepth++;
            return iPushLimit;
        }

        private v44 readBytesInternal(boolean z) {
            int rawVarint32Expected5BytesMax = readRawVarint32Expected5BytesMax();
            if (rawVarint32Expected5BytesMax > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32Expected5BytesMax <= i - i2) {
                    v44 v44VarWrap = (this.immutable && this.enableAliasing) ? v44.wrap(this.buffer, i2, rawVarint32Expected5BytesMax, z) : v44.copyFrom(this.buffer, i2, rawVarint32Expected5BytesMax, z);
                    this.pos += rawVarint32Expected5BytesMax;
                    return v44VarWrap;
                }
            }
            return rawVarint32Expected5BytesMax == 0 ? v44.EMPTY : v44.wrap(readRawBytes(rawVarint32Expected5BytesMax), z);
        }

        private int readRawVarint32NewFast() throws bjb {
            int i = this.pos;
            byte[] bArr = this.buffer;
            int i2 = i + 1;
            int i3 = bArr[i];
            if (i3 < 0) {
                int i4 = i + 2;
                int i5 = i3 ^ (bArr[i2] << 7);
                if (i5 < 0) {
                    i3 = i5 ^ (-128);
                } else {
                    i2 = i + 3;
                    int i6 = i5 ^ (bArr[i4] << 14);
                    if (i6 >= 0) {
                        i3 = i6 ^ 16256;
                    } else {
                        i4 = i + 4;
                        int i7 = i6 ^ (bArr[i2] << 21);
                        if (i7 < 0) {
                            i3 = i7 ^ (-2080896);
                        } else {
                            i2 = i + 5;
                            int i8 = bArr[i4];
                            i3 = (i7 ^ (i8 << 28)) ^ 266354560;
                            if (i8 < 0) {
                                i4 = i + 6;
                                if (bArr[i2] < 0) {
                                    i2 = i + 7;
                                    if (bArr[i4] < 0) {
                                        i4 = i + 8;
                                        if (bArr[i2] < 0) {
                                            i2 = i + 9;
                                            if (bArr[i4] < 0) {
                                                int i9 = i + 10;
                                                if (bArr[i2] < 0) {
                                                    throw bjb.malformedVarint();
                                                }
                                                i2 = i9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i4;
            }
            this.pos = i2;
            return i3;
        }

        private void setCurrentLimit(int i) {
            this.currentLimit = i;
            int i2 = this.bufferLimit;
            if (i <= i2) {
                this.limit = i;
            } else {
                this.limit = i2;
            }
        }

        private void skipRawVarint() throws bjb {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws bjb {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw bjb.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws bjb {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw bjb.malformedVarint();
        }

        @Override // defpackage.r75
        public void checkLastTagWas(int i) throws bjb {
            if (this.lastTag != i) {
                throw bjb.invalidEndTag();
            }
        }

        @Override // defpackage.r75
        public void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        @Override // defpackage.r75
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == r75.DEFAULT_SIZE_LIMIT) {
                return -1;
            }
            return i - this.pos;
        }

        @Override // defpackage.r75
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // defpackage.r75
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // defpackage.r75
        public boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // defpackage.r75
        public void popLimit(int i) {
            setCurrentLimit(i);
        }

        @Override // defpackage.r75
        public int pushLimit(int i) throws bjb {
            if (i < 0) {
                throw bjb.negativeSize();
            }
            int i2 = this.pos;
            int i3 = i2 + i;
            if (i3 < 0) {
                int i4 = i2 - this.startPos;
                i3 = r75.DEFAULT_SIZE_LIMIT;
                if (i > r75.DEFAULT_SIZE_LIMIT - i4) {
                    throw bjb.sizeLimitExceeded();
                }
            }
            int i5 = this.currentLimit;
            if (i3 > i5) {
                throw bjb.truncatedMessage();
            }
            setCurrentLimit(i3);
            return i5;
        }

        @Override // defpackage.r75
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // defpackage.r75
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32Expected5BytesMax());
        }

        @Override // defpackage.r75
        public ByteBuffer readByteBuffer() throws bjb {
            int rawVarint32Expected5BytesMax = readRawVarint32Expected5BytesMax();
            if (rawVarint32Expected5BytesMax > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32Expected5BytesMax <= i - i2) {
                    ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32Expected5BytesMax)) : ByteBuffer.wrap(this.buffer, i2, rawVarint32Expected5BytesMax).slice();
                    this.pos += rawVarint32Expected5BytesMax;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32Expected5BytesMax == 0) {
                return ifb.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32Expected5BytesMax < 0) {
                throw bjb.negativeSize();
            }
            throw bjb.truncatedMessage();
        }

        @Override // defpackage.r75
        public v44 readBytes() {
            return readBytesInternal(false);
        }

        @Override // defpackage.r75
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // defpackage.r75
        public int readEnum() {
            return readRawVarint32Expected10BytesMax();
        }

        @Override // defpackage.r75
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // defpackage.r75
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // defpackage.r75
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // defpackage.r75
        public <T extends rvd> T readGroup(int i, p1g p1gVar, yk8 yk8Var) throws bjb {
            checkRecursionLimit();
            this.groupDepth++;
            T t = (T) p1gVar.parsePartialFrom(this, yk8Var);
            checkLastTagWas(j4o.makeTag(i, 4));
            this.groupDepth--;
            return t;
        }

        @Override // defpackage.r75
        public void readGroup(int i, qvd qvdVar, yk8 yk8Var) throws bjb {
            checkRecursionLimit();
            this.groupDepth++;
            qvdVar.mergeFrom(this, yk8Var);
            checkLastTagWas(j4o.makeTag(i, 4));
            this.groupDepth--;
        }

        @Override // defpackage.r75
        public int readInt32() {
            return readRawVarint32Expected10BytesMax();
        }

        @Override // defpackage.r75
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // defpackage.r75
        public <T extends rvd> T readMessage(p1g p1gVar, yk8 yk8Var) throws bjb {
            int iPushLimitBeforeMessage = pushLimitBeforeMessage();
            T t = (T) p1gVar.parsePartialFrom(this, yk8Var);
            popLimitAfterMessage(iPushLimitBeforeMessage);
            return t;
        }

        @Override // defpackage.r75
        public void readMessage(qvd qvdVar, yk8 yk8Var) throws bjb {
            int iPushLimitBeforeMessage = pushLimitBeforeMessage();
            qvdVar.mergeFrom(this, yk8Var);
            popLimitAfterMessage(iPushLimitBeforeMessage);
        }

        @Override // defpackage.r75
        public byte readRawByte() throws bjb {
            int i = this.pos;
            if (i == this.limit) {
                throw bjb.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // defpackage.r75
        public byte[] readRawBytes(int i) throws bjb {
            if (i <= 0) {
                if (i == 0) {
                    return ifb.EMPTY_BYTE_ARRAY;
                }
                throw bjb.negativeSize();
            }
            int i2 = this.limit;
            int i3 = this.pos;
            if (i > i2 - i3) {
                throw bjb.truncatedMessage();
            }
            int i4 = i + i3;
            this.pos = i4;
            return Arrays.copyOfRange(this.buffer, i3, i4);
        }

        @Override // defpackage.r75
        public int readRawLittleEndian32() throws bjb {
            int i = this.pos;
            if (this.limit - i < 4) {
                throw bjb.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        @Override // defpackage.r75
        public long readRawLittleEndian64() throws bjb {
            int i = this.pos;
            if (this.limit - i < 8) {
                throw bjb.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
        }

        @Override // defpackage.r75
        public int readRawVarint32() {
            return readRawVarint32Expected10BytesMax();
        }

        public abstract int readRawVarint32Expected10BytesMax();

        public abstract int readRawVarint32Expected5BytesMax();

        public int readRawVarint32New() throws bjb {
            try {
                int rawVarint32NewFast = readRawVarint32NewFast();
                if (this.pos <= this.limit) {
                    return rawVarint32NewFast;
                }
                throw bjb.truncatedMessage();
            } catch (bjb e) {
                if (this.pos > this.limit) {
                    throw bjb.truncatedMessage();
                }
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw bjb.truncatedMessage();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        
            if (r2[r3] < 0) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32Old() {
            /*
                r6 = this;
                int r0 = r6.pos
                int r1 = r6.limit
                if (r1 == r0) goto L68
                byte[] r2 = r6.buffer
                int r3 = r0 + 1
                r4 = r2[r0]
                if (r4 < 0) goto L11
                r6.pos = r3
                return r4
            L11:
                int r1 = r1 - r3
                r5 = 9
                if (r1 < r5) goto L68
                int r1 = r0 + 2
                r3 = r2[r3]
                int r3 = r3 << 7
                r4 = r4 ^ r3
                if (r4 >= 0) goto L22
                r4 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L6e
            L22:
                int r3 = r0 + 3
                r1 = r2[r1]
                int r1 = r1 << 14
                r4 = r4 ^ r1
                if (r4 < 0) goto L2f
                r4 = r4 ^ 16256(0x3f80, float:2.278E-41)
            L2d:
                r1 = r3
                goto L6e
            L2f:
                int r1 = r0 + 4
                r3 = r2[r3]
                int r3 = r3 << 21
                r4 = r4 ^ r3
                if (r4 >= 0) goto L3d
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r4 = r4 ^ r0
                goto L6e
            L3d:
                int r3 = r0 + 5
                r1 = r2[r1]
                int r5 = r1 << 28
                r4 = r4 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r4 = r4 ^ r5
                if (r1 >= 0) goto L2d
                int r1 = r0 + 6
                r3 = r2[r3]
                if (r3 >= 0) goto L6e
                int r3 = r0 + 7
                r1 = r2[r1]
                if (r1 >= 0) goto L2d
                int r1 = r0 + 8
                r3 = r2[r3]
                if (r3 >= 0) goto L6e
                int r3 = r0 + 9
                r1 = r2[r1]
                if (r1 >= 0) goto L2d
                int r1 = r0 + 10
                r0 = r2[r3]
                if (r0 >= 0) goto L6e
            L68:
                long r0 = r6.readRawVarint64SlowPath()
                int r6 = (int) r0
                return r6
            L6e:
                r6.pos = r1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: r75.a.readRawVarint32Old():int");
        }

        @Override // defpackage.r75
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.pos = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i2 + 3;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j3 = i8 ^ 16256;
                        } else {
                            i5 = i2 + 4;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                int i10 = i2 + 5;
                                long j4 = i9 ^ (bArr[i5] << 28);
                                if (j4 >= 0) {
                                    j2 = 266354560;
                                } else {
                                    i5 = i2 + 6;
                                    long j5 = j4 ^ (bArr[i10] << 35);
                                    if (j5 < 0) {
                                        j = -34093383808L;
                                    } else {
                                        i10 = i2 + 7;
                                        j4 = j5 ^ (bArr[i5] << 42);
                                        if (j4 >= 0) {
                                            j2 = 4363953127296L;
                                        } else {
                                            i5 = i2 + 8;
                                            j5 = j4 ^ (bArr[i10] << 49);
                                            if (j5 < 0) {
                                                j = -558586000294016L;
                                            } else {
                                                i10 = i2 + 9;
                                                j4 = j5 ^ (bArr[i5] << 56);
                                                if (j4 >= 0) {
                                                    j2 = 71499008037633920L;
                                                } else {
                                                    i5 = i2 + 10;
                                                    j5 = j4 ^ (bArr[i10] << 63);
                                                    if (j5 >= 0) {
                                                        j = -9151873028817141888L;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j3 = j5 ^ j;
                                }
                                j3 = j4 ^ j2;
                                i5 = i10;
                            }
                        }
                        this.pos = i5;
                        return j3;
                    }
                    i = i6 ^ (-128);
                    j3 = i;
                    this.pos = i5;
                    return j3;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // defpackage.r75
        public long readRawVarint64SlowPath() throws bjb {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw bjb.malformedVarint();
        }

        @Override // defpackage.r75
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // defpackage.r75
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // defpackage.r75
        public int readSInt32() {
            return r75.decodeZigZag32(readRawVarint32Expected5BytesMax());
        }

        @Override // defpackage.r75
        public long readSInt64() {
            return r75.decodeZigZag64(readRawVarint64());
        }

        @Override // defpackage.r75
        public String readString() throws bjb {
            int rawVarint32Expected5BytesMax = readRawVarint32Expected5BytesMax();
            if (rawVarint32Expected5BytesMax > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32Expected5BytesMax <= i - i2) {
                    String str = new String(this.buffer, i2, rawVarint32Expected5BytesMax, StandardCharsets.UTF_8);
                    this.pos += rawVarint32Expected5BytesMax;
                    return str;
                }
            }
            if (rawVarint32Expected5BytesMax == 0) {
                return "";
            }
            if (rawVarint32Expected5BytesMax < 0) {
                throw bjb.negativeSize();
            }
            throw bjb.truncatedMessage();
        }

        @Override // defpackage.r75
        public String readStringRequireUtf8() throws bjb {
            int rawVarint32Expected5BytesMax = readRawVarint32Expected5BytesMax();
            if (rawVarint32Expected5BytesMax > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32Expected5BytesMax <= i - i2) {
                    String strDecodeUtf8 = nym.decodeUtf8(this.buffer, i2, rawVarint32Expected5BytesMax);
                    this.pos += rawVarint32Expected5BytesMax;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32Expected5BytesMax == 0) {
                return "";
            }
            if (rawVarint32Expected5BytesMax <= 0) {
                throw bjb.negativeSize();
            }
            throw bjb.truncatedMessage();
        }

        @Override // defpackage.r75
        public int readTag() throws bjb {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32Expected5BytesMax = readRawVarint32Expected5BytesMax();
            this.lastTag = rawVarint32Expected5BytesMax;
            if (j4o.getTagFieldNumber(rawVarint32Expected5BytesMax) != 0) {
                return this.lastTag;
            }
            throw bjb.invalidTag();
        }

        @Override // defpackage.r75
        public int readUInt32() {
            return readRawVarint32Expected5BytesMax();
        }

        @Override // defpackage.r75
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // defpackage.r75
        @Deprecated
        public void readUnknownGroup(int i, qvd qvdVar) throws bjb {
            readGroup(i, qvdVar, yk8.getEmptyRegistry());
        }

        @Override // defpackage.r75
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // defpackage.r75
        public boolean skipField(int i) throws bjb {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32Expected5BytesMax());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(j4o.makeTag(j4o.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // defpackage.r75
        public boolean skipField(int i, y75 y75Var) throws bjb {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                y75Var.writeUInt32NoTag(i);
                y75Var.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                y75Var.writeUInt32NoTag(i);
                y75Var.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                v44 bytes = readBytes();
                y75Var.writeUInt32NoTag(i);
                y75Var.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                y75Var.writeUInt32NoTag(i);
                skipMessage(y75Var);
                int iMakeTag = j4o.makeTag(j4o.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                y75Var.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            y75Var.writeUInt32NoTag(i);
            y75Var.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // defpackage.r75
        public void skipRawBytes(int i) throws bjb {
            if (i < 0) {
                throw bjb.negativeSize();
            }
            int i2 = this.limit;
            int i3 = this.pos;
            if (i > i2 - i3) {
                throw bjb.truncatedMessage();
            }
            this.pos = i3 + i;
        }

        @Override // defpackage.r75
        public int streamRawBytes(byte[] bArr, int i, int i2) {
            r75.checkStreamingReadArgs(bArr, i, i2);
            if (i2 == 0) {
                return 0;
            }
            int iMin = Math.min(i2, this.limit - this.pos);
            if (iMin == 0) {
                return -1;
            }
            System.arraycopy(this.buffer, this.pos, bArr, i, iMin);
            this.pos += iMin;
            return iMin;
        }
    }

    public static final class b extends a {
        private b(byte[] bArr, int i, int i2, boolean z) {
            super(bArr, i, i2, z, null);
        }

        public /* synthetic */ b(byte[] bArr, int i, int i2, boolean z, m75 m75Var) {
            this(bArr, i, i2, z);
        }

        @Override // r75.a
        public int readRawVarint32Expected10BytesMax() {
            return super.readRawVarint32New();
        }

        @Override // r75.a
        public int readRawVarint32Expected5BytesMax() {
            return super.readRawVarint32New();
        }
    }

    public static final class c extends a {
        private c(byte[] bArr, int i, int i2, boolean z) {
            super(bArr, i, i2, z, null);
        }

        public /* synthetic */ c(byte[] bArr, int i, int i2, boolean z, m75 m75Var) {
            this(bArr, i, i2, z);
        }

        @Override // r75.a
        public int readRawVarint32Expected10BytesMax() {
            return super.readRawVarint32Old();
        }

        @Override // r75.a
        public int readRawVarint32Expected5BytesMax() {
            return super.readRawVarint32New();
        }
    }

    public static final class d extends a {
        private d(byte[] bArr, int i, int i2, boolean z) {
            super(bArr, i, i2, z, null);
        }

        public /* synthetic */ d(byte[] bArr, int i, int i2, boolean z, m75 m75Var) {
            this(bArr, i, i2, z);
        }

        @Override // r75.a
        public int readRawVarint32Expected10BytesMax() {
            return super.readRawVarint32Old();
        }

        @Override // r75.a
        public int readRawVarint32Expected5BytesMax() {
            return super.readRawVarint32Old();
        }
    }

    public static final class e extends r75 {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private p75 refillCallback;
        private int totalBytesRetired;

        private e(InputStream inputStream, int i) {
            super(null);
            this.currentLimit = r75.DEFAULT_SIZE_LIMIT;
            ifb.checkNotNull(inputStream, "input");
            i = i < 8 ? 8 : i;
            this.input = inputStream;
            this.buffer = new byte[i];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        public /* synthetic */ e(InputStream inputStream, int i, m75 m75Var) {
            this(inputStream, i);
        }

        private static int available(InputStream inputStream) throws bjb {
            try {
                return inputStream.available();
            } catch (bjb e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static boolean isBeyondLimit(int i, int i2, int i3) {
            return i3 < i || i2 > i3 - i;
        }

        private void popLimitAfterMessage(int i) throws bjb {
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw bjb.truncatedMessage();
            }
            popLimit(i);
        }

        private int pushLimitBeforeMessage() throws bjb {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            return iPushLimit;
        }

        private static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws bjb {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (bjb e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private v44 readBytesInternal(boolean z) throws bjb {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                v44 v44VarCopyFrom = v44.copyFrom(this.buffer, i2, rawVarint32, z);
                this.pos += rawVarint32;
                return v44VarCopyFrom;
            }
            if (rawVarint32 == 0) {
                return v44.EMPTY;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32, z);
            }
            throw bjb.negativeSize();
        }

        private v44 readBytesSlowPath(int i, boolean z) throws bjb {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (rawBytesSlowPathOneChunk != null) {
                return v44.copyFrom(rawBytesSlowPathOneChunk, 0, rawBytesSlowPathOneChunk.length, z);
            }
            int i2 = this.pos;
            int i3 = this.bufferSize;
            int length = i3 - i2;
            this.totalBytesRetired += i3;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, i2, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            if (!z || nym.isValidUtf8(bArr)) {
                return v44.wrap(bArr);
            }
            throw bjb.invalidUtf8();
        }

        private byte[] readRawBytesSlowPath(int i, boolean z) throws bjb {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (rawBytesSlowPathOneChunk != null) {
                return z ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i2 = this.pos;
            int i3 = this.bufferSize;
            int length = i3 - i2;
            this.totalBytesRetired += i3;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, i2, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i) throws bjb {
            if (i == 0) {
                return ifb.EMPTY_BYTE_ARRAY;
            }
            if (i < 0) {
                throw bjb.negativeSize();
            }
            int i2 = this.totalBytesRetired + this.pos;
            if (isBeyondLimit(i2, i, this.sizeLimit)) {
                throw bjb.sizeLimitExceeded();
            }
            if (isBeyondLimit(i2, i, this.currentLimit)) {
                int i3 = this.currentLimit;
                if (i3 >= i2) {
                    skipRawBytes(i3 - i2);
                }
                throw bjb.truncatedMessage();
            }
            int i4 = this.bufferSize - this.pos;
            int i5 = i - i4;
            if (i5 >= 4096 && i5 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i4 < i) {
                int i6 = read(this.input, bArr, i4, i - i4);
                if (i6 == -1) {
                    throw bjb.truncatedMessage();
                }
                this.totalBytesRetired += i6;
                i4 += i6;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i) throws bjb {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = read(this.input, bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw bjb.truncatedMessage();
                    }
                    this.totalBytesRetired += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i;
            int i2 = this.totalBytesRetired + i;
            int i3 = this.currentLimit;
            if (i2 <= i3) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i4 = i2 - i3;
            this.bufferSizeAfterLimit = i4;
            this.bufferSize = i - i4;
        }

        private void refillBuffer(int i) throws bjb {
            if (tryRefillBuffer(i)) {
                return;
            }
            if (i <= (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw bjb.truncatedMessage();
            }
            throw bjb.sizeLimitExceeded();
        }

        private static long skip(InputStream inputStream, long j) throws bjb {
            try {
                return inputStream.skip(j);
            } catch (bjb e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void skipRawBytesSlowPath(int i) throws bjb {
            if (i < 0) {
                throw bjb.negativeSize();
            }
            int i2 = this.totalBytesRetired + this.pos;
            if (isBeyondLimit(i2, i, this.sizeLimit)) {
                throw bjb.sizeLimitExceeded();
            }
            if (isBeyondLimit(i2, i, this.currentLimit)) {
                int i3 = this.currentLimit;
                if (i3 >= i2) {
                    skipRawBytes(i3 - i2);
                }
                throw bjb.truncatedMessage();
            }
            int i4 = this.totalBytesRetired;
            int i5 = this.pos;
            this.totalBytesRetired = i4 + i5;
            int i6 = this.bufferSize - i5;
            this.bufferSize = 0;
            this.pos = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jSkip = skip(this.input, j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i6 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } finally {
                    this.totalBytesRetired += i6;
                    recomputeBufferSizeAfterLimit();
                }
            }
            if (i6 >= i) {
                return;
            }
            int i7 = this.bufferSize;
            int i8 = i7 - this.pos;
            this.pos = i7;
            refillBuffer(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.bufferSize;
                if (i9 <= i10) {
                    this.pos = i9;
                    return;
                } else {
                    i8 += i10;
                    this.pos = i10;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws bjb {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws bjb {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw bjb.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws bjb {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw bjb.malformedVarint();
        }

        private boolean tryRefillBuffer(int i) throws bjb {
            int i2 = this.pos;
            if (i2 + i <= this.bufferSize) {
                qp2.n(p3p.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i3 = this.totalBytesRetired + i2;
            if (isBeyondLimit(i3, i, this.sizeLimit) || isBeyondLimit(i3, i, this.currentLimit)) {
                return false;
            }
            int i4 = this.pos;
            if (i4 > 0) {
                int i5 = this.bufferSize;
                if (i5 > i4) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.totalBytesRetired += i4;
                this.bufferSize -= i4;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i6 = this.bufferSize;
            int i7 = read(inputStream, bArr2, i6, Math.min(bArr2.length - i6, (this.sizeLimit - this.totalBytesRetired) - i6));
            if (i7 != 0 && i7 >= -1 && i7 <= this.buffer.length) {
                if (i7 <= 0) {
                    return false;
                }
                this.bufferSize += i7;
                recomputeBufferSizeAfterLimit();
                return this.bufferSize >= i || tryRefillBuffer(i);
            }
            throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
        }

        @Override // defpackage.r75
        public void checkLastTagWas(int i) throws bjb {
            if (this.lastTag != i) {
                throw bjb.invalidEndTag();
            }
        }

        @Override // defpackage.r75
        public void enableAliasing(boolean z) {
        }

        @Override // defpackage.r75
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == r75.DEFAULT_SIZE_LIMIT) {
                return -1;
            }
            return i - (this.totalBytesRetired + this.pos);
        }

        @Override // defpackage.r75
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // defpackage.r75
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // defpackage.r75
        public boolean isAtEnd() {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // defpackage.r75
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // defpackage.r75
        public int pushLimit(int i) throws bjb {
            if (i < 0) {
                throw bjb.negativeSize();
            }
            int i2 = this.totalBytesRetired + this.pos;
            if (i > r75.DEFAULT_SIZE_LIMIT - i2) {
                throw bjb.sizeLimitExceeded();
            }
            if (isBeyondLimit(i2, i, this.currentLimit)) {
                throw bjb.truncatedMessage();
            }
            int i3 = this.currentLimit;
            this.currentLimit = i2 + i;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        @Override // defpackage.r75
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // defpackage.r75
        public byte[] readByteArray() throws bjb {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return readRawBytesSlowPath(rawVarint32, false);
                }
                throw bjb.negativeSize();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // defpackage.r75
        public ByteBuffer readByteBuffer() throws bjb {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32));
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return ifb.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw bjb.negativeSize();
        }

        @Override // defpackage.r75
        public v44 readBytes() {
            return readBytesInternal(false);
        }

        @Override // defpackage.r75
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // defpackage.r75
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // defpackage.r75
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // defpackage.r75
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // defpackage.r75
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // defpackage.r75
        public <T extends rvd> T readGroup(int i, p1g p1gVar, yk8 yk8Var) throws bjb {
            checkRecursionLimit();
            this.groupDepth++;
            T t = (T) p1gVar.parsePartialFrom(this, yk8Var);
            checkLastTagWas(j4o.makeTag(i, 4));
            this.groupDepth--;
            return t;
        }

        @Override // defpackage.r75
        public void readGroup(int i, qvd qvdVar, yk8 yk8Var) throws bjb {
            checkRecursionLimit();
            this.groupDepth++;
            qvdVar.mergeFrom(this, yk8Var);
            checkLastTagWas(j4o.makeTag(i, 4));
            this.groupDepth--;
        }

        @Override // defpackage.r75
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // defpackage.r75
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // defpackage.r75
        public <T extends rvd> T readMessage(p1g p1gVar, yk8 yk8Var) throws bjb {
            int iPushLimitBeforeMessage = pushLimitBeforeMessage();
            T t = (T) p1gVar.parsePartialFrom(this, yk8Var);
            popLimitAfterMessage(iPushLimitBeforeMessage);
            return t;
        }

        @Override // defpackage.r75
        public void readMessage(qvd qvdVar, yk8 yk8Var) throws bjb {
            int iPushLimitBeforeMessage = pushLimitBeforeMessage();
            qvdVar.mergeFrom(this, yk8Var);
            popLimitAfterMessage(iPushLimitBeforeMessage);
        }

        @Override // defpackage.r75
        public byte readRawByte() throws bjb {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // defpackage.r75
        public byte[] readRawBytes(int i) {
            int i2 = this.pos;
            if (i > this.bufferSize - i2 || i <= 0) {
                return readRawBytesSlowPath(i, false);
            }
            int i3 = i + i2;
            this.pos = i3;
            return Arrays.copyOfRange(this.buffer, i2, i3);
        }

        @Override // defpackage.r75
        public int readRawLittleEndian32() throws bjb {
            int i = this.pos;
            if (this.bufferSize - i < 4) {
                refillBuffer(4);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        @Override // defpackage.r75
        public long readRawLittleEndian64() throws bjb {
            int i = this.pos;
            if (this.bufferSize - i < 8) {
                refillBuffer(8);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        
            if (r2[r3] < 0) goto L32;
         */
        @Override // defpackage.r75
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() {
            /*
                r6 = this;
                int r0 = r6.pos
                int r1 = r6.bufferSize
                if (r1 == r0) goto L68
                byte[] r2 = r6.buffer
                int r3 = r0 + 1
                r4 = r2[r0]
                if (r4 < 0) goto L11
                r6.pos = r3
                return r4
            L11:
                int r1 = r1 - r3
                r5 = 9
                if (r1 < r5) goto L68
                int r1 = r0 + 2
                r3 = r2[r3]
                int r3 = r3 << 7
                r4 = r4 ^ r3
                if (r4 >= 0) goto L22
                r4 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L6e
            L22:
                int r3 = r0 + 3
                r1 = r2[r1]
                int r1 = r1 << 14
                r4 = r4 ^ r1
                if (r4 < 0) goto L2f
                r4 = r4 ^ 16256(0x3f80, float:2.278E-41)
            L2d:
                r1 = r3
                goto L6e
            L2f:
                int r1 = r0 + 4
                r3 = r2[r3]
                int r3 = r3 << 21
                r4 = r4 ^ r3
                if (r4 >= 0) goto L3d
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r4 = r4 ^ r0
                goto L6e
            L3d:
                int r3 = r0 + 5
                r1 = r2[r1]
                int r5 = r1 << 28
                r4 = r4 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r4 = r4 ^ r5
                if (r1 >= 0) goto L2d
                int r1 = r0 + 6
                r3 = r2[r3]
                if (r3 >= 0) goto L6e
                int r3 = r0 + 7
                r1 = r2[r1]
                if (r1 >= 0) goto L2d
                int r1 = r0 + 8
                r3 = r2[r3]
                if (r3 >= 0) goto L6e
                int r3 = r0 + 9
                r1 = r2[r1]
                if (r1 >= 0) goto L2d
                int r1 = r0 + 10
                r0 = r2[r3]
                if (r0 >= 0) goto L6e
            L68:
                long r0 = r6.readRawVarint64SlowPath()
                int r6 = (int) r0
                return r6
            L6e:
                r6.pos = r1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: r75.e.readRawVarint32():int");
        }

        @Override // defpackage.r75
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.pos;
            int i3 = this.bufferSize;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.pos = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i2 + 3;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j3 = i8 ^ 16256;
                        } else {
                            i5 = i2 + 4;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                int i10 = i2 + 5;
                                long j4 = i9 ^ (bArr[i5] << 28);
                                if (j4 >= 0) {
                                    j2 = 266354560;
                                } else {
                                    i5 = i2 + 6;
                                    long j5 = j4 ^ (bArr[i10] << 35);
                                    if (j5 < 0) {
                                        j = -34093383808L;
                                    } else {
                                        i10 = i2 + 7;
                                        j4 = j5 ^ (bArr[i5] << 42);
                                        if (j4 >= 0) {
                                            j2 = 4363953127296L;
                                        } else {
                                            i5 = i2 + 8;
                                            j5 = j4 ^ (bArr[i10] << 49);
                                            if (j5 < 0) {
                                                j = -558586000294016L;
                                            } else {
                                                i10 = i2 + 9;
                                                j4 = j5 ^ (bArr[i5] << 56);
                                                if (j4 >= 0) {
                                                    j2 = 71499008037633920L;
                                                } else {
                                                    i5 = i2 + 10;
                                                    j5 = j4 ^ (bArr[i10] << 63);
                                                    if (j5 >= 0) {
                                                        j = -9151873028817141888L;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j3 = j5 ^ j;
                                }
                                j3 = j4 ^ j2;
                                i5 = i10;
                            }
                        }
                        this.pos = i5;
                        return j3;
                    }
                    i = i6 ^ (-128);
                    j3 = i;
                    this.pos = i5;
                    return j3;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // defpackage.r75
        public long readRawVarint64SlowPath() throws bjb {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw bjb.malformedVarint();
        }

        @Override // defpackage.r75
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // defpackage.r75
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // defpackage.r75
        public int readSInt32() {
            return r75.decodeZigZag32(readRawVarint32());
        }

        @Override // defpackage.r75
        public long readSInt64() {
            return r75.decodeZigZag64(readRawVarint64());
        }

        @Override // defpackage.r75
        public String readString() throws bjb {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.bufferSize;
                int i2 = this.pos;
                if (rawVarint32 <= i - i2) {
                    String str = new String(this.buffer, i2, rawVarint32, StandardCharsets.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw bjb.negativeSize();
            }
            if (rawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(rawVarint32, false), StandardCharsets.UTF_8);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.buffer, this.pos, rawVarint32, StandardCharsets.UTF_8);
            this.pos += rawVarint32;
            return str2;
        }

        @Override // defpackage.r75
        public String readStringRequireUtf8() throws bjb {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i = this.pos;
            int i2 = this.bufferSize;
            if (rawVarint32 <= i2 - i && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw bjb.negativeSize();
                }
                i = 0;
                if (rawVarint32 <= i2) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return nym.decodeUtf8(rawBytesSlowPath, i, rawVarint32);
        }

        @Override // defpackage.r75
        public int readTag() throws bjb {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (j4o.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw bjb.invalidTag();
        }

        @Override // defpackage.r75
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // defpackage.r75
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // defpackage.r75
        @Deprecated
        public void readUnknownGroup(int i, qvd qvdVar) throws bjb {
            readGroup(i, qvdVar, yk8.getEmptyRegistry());
        }

        @Override // defpackage.r75
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // defpackage.r75
        public boolean skipField(int i) throws bjb {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(j4o.makeTag(j4o.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // defpackage.r75
        public boolean skipField(int i, y75 y75Var) throws bjb {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                y75Var.writeUInt32NoTag(i);
                y75Var.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                y75Var.writeUInt32NoTag(i);
                y75Var.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                v44 bytes = readBytes();
                y75Var.writeUInt32NoTag(i);
                y75Var.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                y75Var.writeUInt32NoTag(i);
                skipMessage(y75Var);
                int iMakeTag = j4o.makeTag(j4o.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                y75Var.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            y75Var.writeUInt32NoTag(i);
            y75Var.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // defpackage.r75
        public void skipRawBytes(int i) throws bjb {
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (i > i2 - i3 || i < 0) {
                skipRawBytesSlowPath(i);
            } else {
                this.pos = i3 + i;
            }
        }

        @Override // defpackage.r75
        public int streamRawBytes(byte[] bArr, int i, int i2) throws bjb {
            r75.checkStreamingReadArgs(bArr, i, i2);
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.bufferSize;
            int i4 = this.pos;
            if (i3 - i4 > 0) {
                int iMin = Math.min(i2, i3 - i4);
                System.arraycopy(this.buffer, this.pos, bArr, i, iMin);
                this.pos += iMin;
                return iMin;
            }
            int iMin2 = Math.min(i2, (this.currentLimit - this.totalBytesRetired) - i4);
            if (iMin2 <= 0) {
                return -1;
            }
            int i5 = read(this.input, bArr, i, iMin2);
            if (i5 != -1) {
                this.totalBytesRetired += i5;
            }
            return i5;
        }
    }

    public enum f {
        CONTROL,
        NEW_ALL_CASES,
        NEW_TAGS_LENGTHS_UNSIGNED_ONLY
    }

    private r75() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = DEFAULT_SIZE_LIMIT;
        this.shouldDiscardUnknownFields = false;
    }

    public /* synthetic */ r75(m75 m75Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkStreamingReadArgs(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            t3p.t();
        }
    }

    public static int decodeZigZag32(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long decodeZigZag64(long j) {
        return (j >>> 1) ^ (-(j & 1));
    }

    public static r75 newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static r75 newInstance(InputStream inputStream, int i) {
        m75 m75Var = null;
        if (i > 0) {
            return inputStream == null ? newInstance(ifb.EMPTY_BYTE_ARRAY) : new e(inputStream, i, m75Var);
        }
        qp2.o("bufferSize must be > 0");
        return null;
    }

    public static r75 newInstance(Iterable<ByteBuffer> iterable) {
        return newInstance(iterable, false);
    }

    public static r75 newInstance(Iterable<ByteBuffer> iterable, boolean z) {
        return newInstance(new ylb(iterable));
    }

    public static r75 newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static r75 newInstance(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }

    public static r75 newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static r75 newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    public static r75 newInstance(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        r75 bVar;
        r75 dVar;
        int iOrdinal = varintExperiment.ordinal();
        try {
            if (iOrdinal == 1) {
                i3 = i2;
                bVar = new b(bArr, i, i3, z, null);
            } else {
                if (iOrdinal != 2) {
                    dVar = new d(bArr, i, i2, z, null);
                    i3 = i2;
                    dVar.pushLimit(i3);
                    return dVar;
                }
                i3 = i2;
                bVar = new c(bArr, i, i3, z, null);
            }
            dVar.pushLimit(i3);
            return dVar;
        } catch (bjb e2) {
            t3p.n(e2);
            return null;
        }
        dVar = bVar;
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw bjb.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw bjb.truncatedMessage();
            }
            if ((i5 & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw bjb.malformedVarint();
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return readRawVarint32(i, inputStream);
        }
        throw bjb.truncatedMessage();
    }

    public static void setVarintExperiment(f fVar) {
        varintExperiment = fVar;
    }

    public abstract void checkLastTagWas(int i);

    public void checkRecursionLimit() throws bjb {
        if (this.messageDepth + this.groupDepth >= this.recursionLimit) {
            throw bjb.recursionLimitExceeded();
        }
    }

    public void checkValidEndTag() {
        if (this.groupDepth == 0) {
            checkLastTagWas(0);
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i);

    public abstract boolean readBool();

    public abstract byte[] readByteArray();

    public abstract ByteBuffer readByteBuffer();

    public abstract v44 readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract <T extends rvd> T readGroup(int i, p1g p1gVar, yk8 yk8Var);

    public abstract void readGroup(int i, qvd qvdVar, yk8 yk8Var);

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract <T extends rvd> T readMessage(p1g p1gVar, yk8 yk8Var);

    public abstract void readMessage(qvd qvdVar, yk8 yk8Var);

    public Object readPrimitiveField(j4o.a aVar, j4o.c cVar) {
        switch (m75.$SwitchMap$com$google$protobuf$WireFormat$FieldType[aVar.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                qp2.o("readPrimitiveField() cannot handle nested groups.");
                break;
            case 17:
                qp2.o("readPrimitiveField() cannot handle embedded messages.");
                break;
            case 18:
                qp2.o("readPrimitiveField() cannot handle enums.");
                break;
            default:
                pza.i(aVar, "Unknown field type: ");
                break;
        }
        return null;
    }

    public abstract byte readRawByte();

    public abstract byte[] readRawBytes(int i);

    public abstract int readRawLittleEndian32();

    public abstract long readRawLittleEndian64();

    public abstract int readRawVarint32();

    public abstract long readRawVarint64();

    public abstract long readRawVarint64SlowPath();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public Object readString(j4o.c cVar) {
        int i = m75.$SwitchMap$com$google$protobuf$WireFormat$Utf8Validation[cVar.ordinal()];
        if (i == 1) {
            return readString();
        }
        if (i == 2) {
            return readStringRequireUtf8();
        }
        if (i == 3) {
            return readBytes();
        }
        pza.i(cVar, "Unknown UTF8 validation: ");
        return null;
    }

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    @Deprecated
    public abstract void readUnknownGroup(int i, qvd qvdVar);

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i) {
        if (i < 0) {
            qp2.o(sko.i(i, "Recursion limit cannot be negative: "));
            return 0;
        }
        int i2 = this.recursionLimit;
        this.recursionLimit = i;
        return i2;
    }

    public final int setSizeLimit(int i) {
        if (i < 0) {
            qp2.o(sko.i(i, "Size limit cannot be negative: "));
            return 0;
        }
        int i2 = this.sizeLimit;
        this.sizeLimit = i;
        return i2;
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i);

    @Deprecated
    public abstract boolean skipField(int i, y75 y75Var);

    public void skipMessage() throws bjb {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.groupDepth++;
            this.groupDepth--;
        } while (skipField(tag));
    }

    public void skipMessage(y75 y75Var) throws bjb {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.groupDepth++;
            this.groupDepth--;
        } while (skipField(tag, y75Var));
    }

    public abstract void skipRawBytes(int i);

    public abstract int streamRawBytes(byte[] bArr, int i, int i2);

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }
}
