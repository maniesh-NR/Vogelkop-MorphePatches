package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class v44 implements Iterable, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final v44 EMPTY = new h(ifb.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<v44> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final z44 byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    public class a extends c {
        private final int limit;
        private int position = 0;

        public a() {
            this.limit = v44.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        @Override // v44.c, defpackage.b54
        public byte nextByte() {
            int i = this.position;
            if (i < this.limit) {
                this.position = i + 1;
                return v44.this.internalByteAt(i);
            }
            t3p.y();
            return (byte) 0;
        }
    }

    public class b implements Comparator {
        @Override // java.util.Comparator
        public int compare(v44 v44Var, v44 v44Var2) {
            b54 it = v44Var.iterator();
            b54 it2 = v44Var2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompare = Integer.compare(v44.toInt(it.nextByte()), v44.toInt(it2.nextByte()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(v44Var.size(), v44Var2.size());
        }
    }

    public static abstract class c implements b54 {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // defpackage.b54
        public abstract /* synthetic */ byte nextByte();

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements z44 {
        private d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // defpackage.z44
        public byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class e extends g {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;
        private final int length;
        private final int offset;

        public e(byte[] bArr, int i, int i2) {
            super(null);
            v44.checkRange(i, i + i2, bArr.length);
            this.bytes = bArr;
            this.offset = i;
            this.length = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // defpackage.v44
        public ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, this.offset, this.length).asReadOnlyBuffer();
        }

        @Override // defpackage.v44
        public List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // defpackage.v44
        public byte byteAt(int i) {
            v44.checkIndex(i, size());
            return this.bytes[this.offset + i];
        }

        @Override // defpackage.v44
        public void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, this.offset, this.length);
        }

        @Override // defpackage.v44
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, this.offset + i, bArr, i2, i3);
        }

        @Override // defpackage.v44
        public boolean equalsInternal(v44 v44Var) {
            return ((v44Var instanceof h) || (v44Var instanceof e)) ? equalsRange(v44Var, 0, size()) : v44Var.equalsInternal(this);
        }

        @Override // v44.g
        public boolean equalsRange(v44 v44Var, int i, int i2) {
            if (i2 > v44Var.size()) {
                h9o.f(i2, size());
                return false;
            }
            int i3 = i + i2;
            if (i3 > v44Var.size()) {
                h9o.q(v44Var.size(), sko.o(i, i2, "Ran off end of other: ", ", ", ", "));
                return false;
            }
            if (v44Var instanceof h) {
                return v44.subArrayEquals(this.bytes, this.offset, ((h) v44Var).bytes, i, i2);
            }
            if (v44Var instanceof e) {
                e eVar = (e) v44Var;
                return v44.subArrayEquals(this.bytes, this.offset, eVar.bytes, eVar.offset + i, i2);
            }
            v44 v44VarSubstringNoCopy = v44Var.substringNoCopy(i, i3);
            int i4 = this.offset;
            return v44VarSubstringNoCopy.equals(substringNoCopy(i4, i2 + i4));
        }

        @Override // defpackage.v44
        public byte internalByteAt(int i) {
            return this.bytes[this.offset + i];
        }

        @Override // defpackage.v44
        public boolean isValidUtf8() {
            byte[] bArr = this.bytes;
            int i = this.offset;
            return nym.isValidUtf8(bArr, i, this.length + i);
        }

        @Override // defpackage.v44
        public r75 newCodedInput() {
            return r75.newInstance(this.bytes, this.offset, this.length, true);
        }

        @Override // defpackage.v44
        public InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, this.offset, this.length);
        }

        @Override // defpackage.v44
        public int partialHash(int i, int i2, int i3) {
            return ifb.partialHash(i, this.bytes, this.offset + i2, i3);
        }

        @Override // defpackage.v44
        public int size() {
            return this.length;
        }

        @Override // defpackage.v44
        public v44 substring(int i, int i2) {
            int iCheckRange = v44.checkRange(i, i2, this.length);
            return iCheckRange == 0 ? v44.EMPTY : new e(this.bytes, this.offset + i, iCheckRange);
        }

        @Override // defpackage.v44
        public v44 substringNoCopy(int i, int i2) {
            int iCheckRange = v44.checkRange(i, i2, this.length);
            return iCheckRange == 0 ? v44.EMPTY : new e(this.bytes, this.offset + i, iCheckRange);
        }

        @Override // defpackage.v44
        public String toStringInternal(Charset charset) {
            return new String(this.bytes, this.offset, this.length, charset);
        }

        public Object writeReplace() {
            return v44.wrap(toByteArray());
        }

        @Override // defpackage.v44
        public void writeTo(a44 a44Var) {
            a44Var.writeLazy(this.bytes, this.offset, this.length);
        }

        @Override // defpackage.v44
        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // defpackage.v44
        public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, this.offset + i, i2);
        }
    }

    public static final class f {
        private final byte[] buffer;
        private final y75 output;

        private f(int i) {
            byte[] bArr = new byte[i];
            this.buffer = bArr;
            this.output = y75.newInstance(bArr);
        }

        public /* synthetic */ f(int i, a aVar) {
            this(i);
        }

        public v44 build() {
            this.output.checkNoSpaceLeft();
            return new h(this.buffer);
        }

        public y75 getCodedOutput() {
            return this.output;
        }
    }

    public static abstract class g extends v44 {
        private static final long serialVersionUID = 1;

        private g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        public abstract boolean equalsRange(v44 v44Var, int i, int i2);

        @Override // defpackage.v44
        public final int getTreeDepth() {
            return 0;
        }

        @Override // defpackage.v44
        public final boolean isBalanced() {
            return true;
        }

        @Override // defpackage.v44, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // defpackage.v44
        public void writeToReverse(a44 a44Var) {
            writeTo(a44Var);
        }
    }

    public static final class h extends g {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        public h(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // defpackage.v44
        public ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes).asReadOnlyBuffer();
        }

        @Override // defpackage.v44
        public List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // defpackage.v44
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // defpackage.v44
        public void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes);
        }

        @Override // defpackage.v44
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // defpackage.v44
        public final boolean equalsInternal(v44 v44Var) {
            return v44Var instanceof h ? Arrays.equals(this.bytes, ((h) v44Var).bytes) : v44Var instanceof e ? equalsRange(v44Var, 0, size()) : v44Var.equalsInternal(this);
        }

        @Override // v44.g
        public boolean equalsRange(v44 v44Var, int i, int i2) {
            if (i2 > v44Var.size()) {
                h9o.f(i2, size());
                return false;
            }
            int i3 = i + i2;
            if (i3 > v44Var.size()) {
                h9o.q(v44Var.size(), sko.o(i, i2, "Ran off end of other: ", ", ", ", "));
                return false;
            }
            if (v44Var instanceof h) {
                return v44.subArrayEquals(this.bytes, 0, ((h) v44Var).bytes, i, i2);
            }
            if (!(v44Var instanceof e)) {
                return v44Var.substringNoCopy(i, i3).equals(substringNoCopy(0, i2));
            }
            e eVar = (e) v44Var;
            return v44.subArrayEquals(this.bytes, 0, eVar.bytes, eVar.offset + i, i2);
        }

        @Override // defpackage.v44
        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        @Override // defpackage.v44
        public boolean isValidUtf8() {
            return nym.isValidUtf8(this.bytes);
        }

        @Override // defpackage.v44
        public r75 newCodedInput() {
            return r75.newInstance(this.bytes, 0, size(), true);
        }

        @Override // defpackage.v44
        public InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, 0, size());
        }

        @Override // defpackage.v44
        public int partialHash(int i, int i2, int i3) {
            return ifb.partialHash(i, this.bytes, i2, i3);
        }

        @Override // defpackage.v44
        public int size() {
            return this.bytes.length;
        }

        @Override // defpackage.v44
        public v44 substring(int i, int i2) {
            int iCheckRange = v44.checkRange(i, i2, size());
            return iCheckRange == 0 ? v44.EMPTY : new e(this.bytes, i, iCheckRange);
        }

        @Override // defpackage.v44
        public v44 substringNoCopy(int i, int i2) {
            int iCheckRange = v44.checkRange(i, i2, size());
            return iCheckRange == 0 ? v44.EMPTY : new e(this.bytes, i, iCheckRange);
        }

        @Override // defpackage.v44
        public String toStringInternal(Charset charset) {
            return new String(this.bytes, charset);
        }

        @Override // defpackage.v44
        public void writeTo(a44 a44Var) {
            a44Var.writeLazy(this.bytes, 0, size());
        }

        @Override // defpackage.v44
        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // defpackage.v44
        public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, i, i2);
        }
    }

    public static final class i extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<v44> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public i(int i) {
            if (i < 0) {
                qp2.o("Buffer size < 0");
                throw null;
            }
            this.initialCapacity = i;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i];
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new h(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new h(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new h(Arrays.copyOf(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized v44 toByteString() {
            flushLastBuffer();
            return v44.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            Locale locale = Locale.ROOT;
            return "<ByteString.Output@" + Integer.toHexString(System.identityHashCode(this)) + " size=" + size() + ">";
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.bufferPos;
            this.bufferPos = i2 + 1;
            bArr[i2] = (byte) i;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.buffer;
            int length = bArr2.length;
            int i3 = this.bufferPos;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.bufferPos += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                flushFullBuffer(i4);
                System.arraycopy(bArr, i + length2, this.buffer, 0, i4);
                this.bufferPos = i4;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            int i;
            v44[] v44VarArr;
            byte[] bArr;
            int i2;
            synchronized (this) {
                v44VarArr = (v44[]) this.flushedBuffers.toArray(new v44[0]);
                bArr = this.buffer;
                i2 = this.bufferPos;
            }
            for (v44 v44Var : v44VarArr) {
                v44Var.writeTo(outputStream);
            }
            outputStream.write(Arrays.copyOf(bArr, i2));
        }
    }

    public static final class j implements z44 {
        private j() {
        }

        public /* synthetic */ j(a aVar) {
            this();
        }

        @Override // defpackage.z44
        public byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        byteArrayCopier = m21.isOnAndroidDevice() ? new j(aVar) : new d(aVar);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new b();
    }

    private static v44 balancedConcat(Iterator<v44> it, int i2) {
        if (i2 < 1) {
            Locale locale = Locale.ROOT;
            qp2.o(p3p.i(i2, "length (", ") must be >= 1"));
            return null;
        }
        if (i2 == 1) {
            return it.next();
        }
        int i3 = i2 >>> 1;
        return balancedConcat(it, i3).concat(balancedConcat(it, i2 - i3));
    }

    public static void checkIndex(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 >= 0) {
                throw new ArrayIndexOutOfBoundsException(sko.h(i2, i3, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(sko.i(i2, "Index < 0: "));
        }
    }

    public static int checkRange(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            h9o.u(p3p.i(i2, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i3 < i2) {
            h9o.u(sko.h(i2, i3, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        h9o.u(sko.h(i3, i4, "End index: ", " >= "));
        return 0;
    }

    public static v44 copyFrom(Iterable<v44> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator<v44> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? EMPTY : balancedConcat(iterable.iterator(), size);
    }

    @Deprecated
    public static v44 copyFrom(String str, String str2) {
        return str.isEmpty() ? EMPTY : new h(str.getBytes(str2));
    }

    public static v44 copyFrom(String str, Charset charset) {
        return str.isEmpty() ? EMPTY : new h(str.getBytes(charset));
    }

    public static v44 copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static v44 copyFrom(ByteBuffer byteBuffer, int i2) {
        if (i2 == 0) {
            return EMPTY;
        }
        checkRange(0, i2, byteBuffer.remaining());
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return new h(bArr);
    }

    public static v44 copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static v44 copyFrom(byte[] bArr, int i2, int i3) {
        try {
            return copyFrom(bArr, i2, i3, false);
        } catch (bjb e2) {
            h9o.v("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
            return null;
        }
    }

    public static v44 copyFrom(byte[] bArr, int i2, int i3, boolean z) throws bjb {
        if (i3 == 0) {
            return EMPTY;
        }
        checkRange(i2, i2 + i3, bArr.length);
        byte[] bArrCopyFrom = byteArrayCopier.copyFrom(bArr, i2, i3);
        if (!z || nym.isValidUtf8(bArrCopyFrom)) {
            return new h(bArrCopyFrom);
        }
        throw bjb.invalidUtf8();
    }

    public static v44 copyFromUtf8(String str) {
        return str.isEmpty() ? EMPTY : new h(str.getBytes(StandardCharsets.UTF_8));
    }

    public static final v44 empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i2) {
        int iHexDigit = hexDigit(str.charAt(i2));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        StringBuilder sbS = p3p.s("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        sbS.append(str.charAt(i2));
        sbS.append(" at index ");
        sbS.append(i2);
        throw new NumberFormatException(sbS.toString());
    }

    public static v44 fromHex(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sbS = p3p.s("Invalid hexString ", str, " of length ");
            sbS.append(str.length());
            sbS.append(" must be even.");
            throw new NumberFormatException(sbS.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            bArr[i2] = (byte) ((extractHexDigit(str, i3) << 4) | extractHexDigit(str, i3 + 1));
        }
        return new h(bArr);
    }

    private static int hexDigit(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 < 'a' || c2 > 'f') {
            return -1;
        }
        return c2 - 'W';
    }

    public static f newCodedBuilder(int i2) {
        return new f(i2, null);
    }

    public static i newOutput() {
        return new i(128);
    }

    public static i newOutput(int i2) {
        return new i(i2);
    }

    private static v44 readChunk(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        if (i3 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i3);
    }

    public static v44 readFrom(InputStream inputStream) {
        return readFrom(inputStream, 256, MAX_READ_FROM_CHUNK_SIZE);
    }

    public static v44 readFrom(InputStream inputStream, int i2) {
        return readFrom(inputStream, i2, i2);
    }

    public static v44 readFrom(InputStream inputStream, int i2, int i3) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            v44 chunk = readChunk(inputStream, i2);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i2 = Math.min(i2 << 1, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean subArrayEquals(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i2 + i4;
        checkRange(i2, i5, bArr.length);
        checkRange(i3, i4 + i3, bArr2.length);
        while (i2 < i5) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b2) {
        return b2 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return qil.escapeBytes(this);
        }
        return qil.escapeBytes(substringNoCopy(0, 47)) + "...";
    }

    public static Comparator<v44> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static v44 wrap(ByteBuffer byteBuffer) {
        try {
            return wrap(byteBuffer, false);
        } catch (bjb e2) {
            h9o.v("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
            return null;
        }
    }

    public static v44 wrap(ByteBuffer byteBuffer, boolean z) throws bjb {
        if (byteBuffer.remaining() == 0) {
            return EMPTY;
        }
        if (z && !nym.isValidUtf8(byteBuffer)) {
            throw bjb.invalidUtf8();
        }
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byte[] bArr = new byte[byteBufferSlice.remaining()];
        byteBufferSlice.get(bArr);
        return new h(bArr);
    }

    public static v44 wrap(byte[] bArr) {
        try {
            return wrap(bArr, false);
        } catch (bjb e2) {
            h9o.v("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
            return null;
        }
    }

    public static v44 wrap(byte[] bArr, int i2, int i3) {
        try {
            return wrap(bArr, i2, i3, false);
        } catch (bjb e2) {
            h9o.v("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
            return null;
        }
    }

    public static v44 wrap(byte[] bArr, int i2, int i3, boolean z) throws bjb {
        if (!z || nym.isValidUtf8(bArr, i2, i2 + i3)) {
            return new e(bArr, i2, i3);
        }
        throw bjb.invalidUtf8();
    }

    public static v44 wrap(byte[] bArr, boolean z) throws bjb {
        if (bArr.length == 0) {
            return EMPTY;
        }
        if (!z || nym.isValidUtf8(bArr)) {
            return new h(bArr);
        }
        throw bjb.invalidUtf8();
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i2);

    public final v44 concat(v44 v44Var) {
        if (Integer.MAX_VALUE - size() >= v44Var.size()) {
            return z7i.concatenate(this, v44Var);
        }
        t14.f("ByteString would be too long: ", size(), v44Var.size(), "+");
        return null;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i2) {
        copyTo(bArr, 0, i2, size());
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i2, int i3, int i4) {
        checkRange(i2, i2 + i4, size());
        checkRange(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            copyToInternal(bArr, i2, i3, i4);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i2, int i3, int i4);

    public final boolean endsWith(v44 v44Var) {
        return size() >= v44Var.size() && substringNoCopy(size() - v44Var.size()).equals(v44Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v44)) {
            return false;
        }
        v44 v44Var = (v44) obj;
        int size = size();
        if (size != v44Var.size()) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = v44Var.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsInternal(v44Var);
        }
        return false;
    }

    public abstract boolean equalsInternal(v44 v44Var);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i2);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public b54 iterator() {
        return new a();
    }

    public abstract r75 newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i2, int i3, int i4);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(v44 v44Var) {
        return size() >= v44Var.size() && substringNoCopy(0, v44Var.size()).equals(v44Var);
    }

    public final v44 substring(int i2) {
        return substring(i2, size());
    }

    public abstract v44 substring(int i2, int i3);

    public final v44 substringNoCopy(int i2) {
        return substringNoCopy(i2, size());
    }

    public abstract v44 substringNoCopy(int i2, int i3);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return ifb.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        return z1m.l(sko.p(size, "<ByteString@", hexString, " size=", " contents=\""), truncateAndEscapeForDisplay(), "\">");
    }

    @Deprecated
    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e2) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e2);
            throw unsupportedEncodingException;
        }
    }

    public final String toString(Charset charset) {
        return isEmpty() ? "" : toStringInternal(charset);
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(StandardCharsets.UTF_8);
    }

    public abstract void writeTo(a44 a44Var);

    public abstract void writeTo(OutputStream outputStream);

    public final void writeTo(OutputStream outputStream, int i2, int i3) {
        checkRange(i2, i2 + i3, size());
        if (i3 > 0) {
            writeToInternal(outputStream, i2, i3);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i2, int i3);

    public abstract void writeToReverse(a44 a44Var);
}
