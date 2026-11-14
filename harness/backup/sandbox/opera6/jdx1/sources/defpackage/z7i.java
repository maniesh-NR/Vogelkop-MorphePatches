package defpackage;

import defpackage.v44;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class z7i extends v44 {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final v44 left;
    private final int leftLength;
    private final v44 right;
    private final int totalLength;
    private final int treeDepth;

    public class a extends v44.c {
        b54 current = nextPiece();
        final c pieces;

        public a() {
            this.pieces = new c(z7i.this, null);
        }

        private b54 nextPiece() {
            if (this.pieces.hasNext()) {
                return this.pieces.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current != null;
        }

        @Override // v44.c, defpackage.b54
        public byte nextByte() {
            b54 b54Var = this.current;
            if (b54Var == null) {
                t3p.y();
                return (byte) 0;
            }
            byte bNextByte = b54Var.nextByte();
            if (!this.current.hasNext()) {
                this.current = nextPiece();
            }
            return bNextByte;
        }
    }

    public static class b {
        private final ArrayDeque<v44> prefixesStack;

        private b() {
            this.prefixesStack = new ArrayDeque<>();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public v44 balance(v44 v44Var, v44 v44Var2) {
            doBalance(v44Var);
            doBalance(v44Var2);
            v44 v44VarPop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                v44VarPop = new z7i(this.prefixesStack.pop(), v44VarPop, null);
            }
            return v44VarPop;
        }

        private void doBalance(v44 v44Var) {
            if (v44Var.isBalanced()) {
                insert(v44Var);
            } else {
                if (!(v44Var instanceof z7i)) {
                    t3p.i(v44Var.getClass(), "Has a new type of ByteString been created? Found ");
                    return;
                }
                z7i z7iVar = (z7i) v44Var;
                doBalance(z7iVar.left);
                doBalance(z7iVar.right);
            }
        }

        private int getDepthBinForLength(int i) {
            int iBinarySearch = Arrays.binarySearch(z7i.minLengthByDepth, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void insert(v44 v44Var) {
            a aVar;
            int depthBinForLength = getDepthBinForLength(v44Var.size());
            int iMinLength = z7i.minLength(depthBinForLength + 1);
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength) {
                this.prefixesStack.push(v44Var);
                return;
            }
            int iMinLength2 = z7i.minLength(depthBinForLength);
            v44 v44VarPop = this.prefixesStack.pop();
            while (true) {
                aVar = null;
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength2) {
                    break;
                } else {
                    v44VarPop = new z7i(this.prefixesStack.pop(), v44VarPop, aVar);
                }
            }
            z7i z7iVar = new z7i(v44VarPop, v44Var, aVar);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= z7i.minLength(getDepthBinForLength(z7iVar.size()) + 1)) {
                    break;
                } else {
                    z7iVar = new z7i(this.prefixesStack.pop(), z7iVar, aVar);
                }
            }
            this.prefixesStack.push(z7iVar);
        }
    }

    public static final class c implements Iterator {
        private final ArrayDeque<z7i> breadCrumbs;
        private v44.g next;

        private c(v44 v44Var) {
            if (!(v44Var instanceof z7i)) {
                this.breadCrumbs = null;
                this.next = (v44.g) v44Var;
                return;
            }
            z7i z7iVar = (z7i) v44Var;
            ArrayDeque<z7i> arrayDeque = new ArrayDeque<>(z7iVar.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(z7iVar);
            this.next = getLeafByLeft(z7iVar.left);
        }

        public /* synthetic */ c(v44 v44Var, a aVar) {
            this(v44Var);
        }

        private v44.g getLeafByLeft(v44 v44Var) {
            while (v44Var instanceof z7i) {
                z7i z7iVar = (z7i) v44Var;
                this.breadCrumbs.push(z7iVar);
                v44Var = z7iVar.left;
            }
            return (v44.g) v44Var;
        }

        private v44.g getNextNonEmptyLeaf() {
            v44.g leafByLeft;
            do {
                ArrayDeque<z7i> arrayDeque = this.breadCrumbs;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public v44.g next() {
            v44.g gVar = this.next;
            if (gVar != null) {
                this.next = getNextNonEmptyLeaf();
                return gVar;
            }
            t3p.y();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class d extends InputStream {
        private v44.g currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private c pieceIterator;

        public d() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i = this.currentPieceIndex;
                int i2 = this.currentPieceSize;
                if (i == i2) {
                    this.currentPieceOffsetInRope += i2;
                    this.currentPieceIndex = 0;
                    if (!this.pieceIterator.hasNext()) {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    } else {
                        v44.g next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    }
                }
            }
        }

        private int availableInternal() {
            return z7i.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        private void initialize() {
            c cVar = new c(z7i.this, null);
            this.pieceIterator = cVar;
            v44.g next = cVar.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private int readSkipInternal(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int iMin = Math.min(this.currentPieceSize - this.currentPieceIndex, i3);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, iMin);
                    i += iMin;
                }
                this.currentPieceIndex += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int available() {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            advanceIfCurrentPieceFullyRead();
            v44.g gVar = this.currentPiece;
            if (gVar == null) {
                return -1;
            }
            int i = this.currentPieceIndex;
            this.currentPieceIndex = i + 1;
            return gVar.byteAt(i) & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                t3p.t();
                return 0;
            }
            int skipInternal = readSkipInternal(bArr, i, i2);
            if (skipInternal != 0 || (i2 <= 0 && availableInternal() != 0)) {
                return skipInternal;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                t3p.t();
                return 0L;
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j);
        }
    }

    private z7i(v44 v44Var, v44 v44Var2) {
        this.left = v44Var;
        this.right = v44Var2;
        int size = v44Var.size();
        this.leftLength = size;
        this.totalLength = v44Var2.size() + size;
        this.treeDepth = Math.max(v44Var.getTreeDepth(), v44Var2.getTreeDepth()) + 1;
    }

    public /* synthetic */ z7i(v44 v44Var, v44 v44Var2, a aVar) {
        this(v44Var, v44Var2);
    }

    private boolean allPiecesValidUtf8() {
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            if (!cVar.next().isValidUtf8()) {
                return false;
            }
        }
        return true;
    }

    public static v44 concatenate(v44 v44Var, v44 v44Var2) {
        if (v44Var2.size() == 0) {
            return v44Var;
        }
        if (v44Var.size() == 0) {
            return v44Var2;
        }
        int size = v44Var2.size() + v44Var.size();
        if (size < 128) {
            return concatenateBytes(v44Var, v44Var2);
        }
        if (v44Var instanceof z7i) {
            z7i z7iVar = (z7i) v44Var;
            if (v44Var2.size() + z7iVar.right.size() < 128) {
                return new z7i(z7iVar.left, concatenateBytes(z7iVar.right, v44Var2));
            }
            if (z7iVar.left.getTreeDepth() > z7iVar.right.getTreeDepth() && z7iVar.getTreeDepth() > v44Var2.getTreeDepth()) {
                return new z7i(z7iVar.left, new z7i(z7iVar.right, v44Var2));
            }
        }
        return size >= minLength(Math.max(v44Var.getTreeDepth(), v44Var2.getTreeDepth()) + 1) ? new z7i(v44Var, v44Var2) : new b(null).balance(v44Var, v44Var2);
    }

    private static v44 concatenateBytes(v44 v44Var, v44 v44Var2) {
        int size = v44Var.size();
        int size2 = v44Var2.size();
        byte[] bArr = new byte[size + size2];
        v44Var.copyTo(bArr, 0, 0, size);
        v44Var2.copyTo(bArr, 0, size, size2);
        return v44.wrap(bArr);
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static z7i newInstanceForTest(v44 v44Var, v44 v44Var2) {
        return new z7i(v44Var, v44Var2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.v44
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // defpackage.v44
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // defpackage.v44
    public byte byteAt(int i) {
        v44.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // defpackage.v44
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // defpackage.v44
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.v44
    public boolean equalsInternal(v44 v44Var) {
        a aVar = null;
        c cVar = new c(this, aVar);
        v44.g gVar = (v44.g) cVar.next();
        c cVar2 = new c(v44Var, aVar);
        v44.g gVar2 = (v44.g) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = gVar.size() - i;
            int size2 = gVar2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? gVar.equalsRange(gVar2, i2, iMin) : gVar2.equalsRange(gVar, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                h9o.e();
                return false;
            }
            if (iMin == size) {
                i = 0;
                gVar = (v44.g) cVar.next();
            } else {
                i += iMin;
                gVar = gVar;
            }
            if (iMin == size2) {
                gVar2 = (v44.g) cVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // defpackage.v44
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // defpackage.v44
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        return i < i2 ? this.left.internalByteAt(i) : this.right.internalByteAt(i - i2);
    }

    @Override // defpackage.v44
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // defpackage.v44
    public boolean isValidUtf8() {
        if (allPiecesValidUtf8()) {
            return true;
        }
        return nym.isValidUtf8(toByteArray());
    }

    @Override // defpackage.v44, java.lang.Iterable
    public b54 iterator() {
        return new a();
    }

    @Override // defpackage.v44
    public r75 newCodedInput() {
        return r75.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // defpackage.v44
    public InputStream newInput() {
        return new d();
    }

    @Override // defpackage.v44
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.v44
    public int size() {
        return this.totalLength;
    }

    @Override // defpackage.v44
    public v44 substring(int i, int i2) {
        return substringNoCopy(i, i2);
    }

    @Override // defpackage.v44
    public v44 substringNoCopy(int i, int i2) {
        int iCheckRange = v44.checkRange(i, i2, this.totalLength);
        if (iCheckRange == 0) {
            return v44.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        return i2 <= i3 ? this.left.substring(i, i2) : i >= i3 ? this.right.substring(i - i3, i2 - i3) : new z7i(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    @Override // defpackage.v44
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return v44.wrap(toByteArray());
    }

    @Override // defpackage.v44
    public void writeTo(a44 a44Var) {
        this.left.writeTo(a44Var);
        this.right.writeTo(a44Var);
    }

    @Override // defpackage.v44
    public void writeTo(OutputStream outputStream) {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // defpackage.v44
    public void writeToInternal(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // defpackage.v44
    public void writeToReverse(a44 a44Var) {
        this.right.writeToReverse(a44Var);
        this.left.writeToReverse(a44Var);
    }
}
