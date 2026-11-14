package defpackage;

import defpackage.v44;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class w5 implements rvd {
    protected int memoizedHashCode = 0;

    public static abstract class a implements qvd {

        /* renamed from: w5$a$a, reason: collision with other inner class name */
        public static final class C0001a extends FilterInputStream {
            private int limit;

            public C0001a(InputStream inputStream, int i) {
                super(inputStream);
                this.limit = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.limit--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.limit;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.limit -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                int iSkip = (int) super.skip(Math.min(j, this.limit));
                if (iSkip >= 0) {
                    this.limit -= iSkip;
                }
                return iSkip;
            }
        }

        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            ifb.checkNotNull(iterable);
            if (!(iterable instanceof d7c)) {
                if (iterable instanceof yxg) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    addAllCheckingNulls(iterable, list);
                    return;
                }
            }
            List listL = ((d7c) iterable).l();
            d7c d7cVar = (d7c) list;
            int size = list.size();
            for (Object obj : listL) {
                if (obj == null) {
                    String str = "Element at index " + (d7cVar.size() - size) + " is null.";
                    for (int size2 = d7cVar.size() - 1; size2 >= size; size2--) {
                        d7cVar.remove(size2);
                    }
                    t3p.q(str);
                    return;
                }
                if (obj instanceof v44) {
                    d7cVar.N0();
                } else if (obj instanceof byte[]) {
                    v44.copyFrom((byte[]) obj);
                    d7cVar.N0();
                } else {
                    d7cVar.add((String) obj);
                }
            }
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof a7h) {
                    ((a7h) list).ensureCapacity(list.size() + size);
                }
            }
            int size2 = list.size();
            if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        resetListAndThrow(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i = 0; i < size3; i++) {
                a1f a1fVar = (Object) list2.get(i);
                if (a1fVar == null) {
                    resetListAndThrow(list, size2);
                }
                list.add(a1fVar);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public static zkm newUninitializedMessageException(rvd rvdVar) {
            return new zkm(rvdVar);
        }

        private static void resetListAndThrow(List<?> list, int i) {
            String str = "Element at index " + (list.size() - i) + " is null.";
            for (int size = list.size() - 1; size >= i; size--) {
                list.remove(size);
            }
            throw new NullPointerException(str);
        }

        @Override // defpackage.qvd
        public abstract /* synthetic */ rvd build();

        @Override // defpackage.qvd
        public abstract /* synthetic */ rvd buildPartial();

        @Override // defpackage.qvd
        public abstract /* synthetic */ qvd clear();

        @Override // defpackage.qvd
        public abstract a clone();

        @Override // defpackage.qvd, defpackage.svd
        public abstract /* synthetic */ rvd getDefaultInstanceForType();

        public abstract a internalMergeFrom(w5 w5Var);

        @Override // defpackage.qvd, defpackage.svd
        public abstract /* synthetic */ boolean isInitialized();

        @Override // defpackage.qvd
        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, yk8.getEmptyRegistry());
        }

        @Override // defpackage.qvd
        public boolean mergeDelimitedFrom(InputStream inputStream, yk8 yk8Var) throws IOException {
            int i = inputStream.read();
            if (i == -1) {
                return false;
            }
            int rawVarint32 = r75.readRawVarint32(i, inputStream);
            if (rawVarint32 < 0) {
                throw bjb.negativeSize();
            }
            mergeFrom((InputStream) new C0001a(inputStream, rawVarint32), yk8Var);
            return true;
        }

        @Override // defpackage.qvd
        public a mergeFrom(InputStream inputStream) {
            r75 r75VarNewInstance = r75.newInstance(inputStream);
            mergeFrom(r75VarNewInstance);
            r75VarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // defpackage.qvd
        public a mergeFrom(InputStream inputStream, yk8 yk8Var) {
            r75 r75VarNewInstance = r75.newInstance(inputStream);
            mergeFrom(r75VarNewInstance, yk8Var);
            r75VarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // defpackage.qvd
        public a mergeFrom(r75 r75Var) {
            return mergeFrom(r75Var, yk8.getEmptyRegistry());
        }

        @Override // defpackage.qvd
        public abstract a mergeFrom(r75 r75Var, yk8 yk8Var);

        @Override // defpackage.qvd
        public a mergeFrom(rvd rvdVar) {
            return internalMergeFrom((w5) rvdVar);
        }

        @Override // defpackage.qvd
        public a mergeFrom(v44 v44Var) throws bjb {
            try {
                r75 r75VarNewCodedInput = v44Var.newCodedInput();
                mergeFrom(r75VarNewCodedInput);
                r75VarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (bjb e) {
                throw e;
            } catch (IOException e2) {
                h9o.s(getReadingExceptionMessage("ByteString"), e2);
                return null;
            }
        }

        @Override // defpackage.qvd
        public a mergeFrom(v44 v44Var, yk8 yk8Var) throws bjb {
            try {
                r75 r75VarNewCodedInput = v44Var.newCodedInput();
                mergeFrom(r75VarNewCodedInput, yk8Var);
                r75VarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (bjb e) {
                throw e;
            } catch (IOException e2) {
                h9o.s(getReadingExceptionMessage("ByteString"), e2);
                return null;
            }
        }

        @Override // defpackage.qvd
        public a mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        @Override // defpackage.qvd
        public a mergeFrom(byte[] bArr, int i, int i2) throws bjb {
            try {
                r75 r75VarNewInstance = r75.newInstance(bArr, i, i2);
                mergeFrom(r75VarNewInstance);
                r75VarNewInstance.checkLastTagWas(0);
                return this;
            } catch (bjb e) {
                throw e;
            } catch (IOException e2) {
                h9o.s(getReadingExceptionMessage("byte array"), e2);
                return null;
            }
        }

        @Override // defpackage.qvd
        public a mergeFrom(byte[] bArr, int i, int i2, yk8 yk8Var) throws bjb {
            try {
                r75 r75VarNewInstance = r75.newInstance(bArr, i, i2);
                mergeFrom(r75VarNewInstance, yk8Var);
                r75VarNewInstance.checkLastTagWas(0);
                return this;
            } catch (bjb e) {
                throw e;
            } catch (IOException e2) {
                h9o.s(getReadingExceptionMessage("byte array"), e2);
                return null;
            }
        }

        @Override // defpackage.qvd
        public a mergeFrom(byte[] bArr, yk8 yk8Var) {
            return mergeFrom(bArr, 0, bArr.length, yk8Var);
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        a.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(v44 v44Var) {
        if (v44Var.isValidUtf8()) {
            return;
        }
        qp2.o("Byte string is not UTF-8.");
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // defpackage.rvd, defpackage.svd
    public abstract /* synthetic */ rvd getDefaultInstanceForType();

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rvd
    public abstract /* synthetic */ p1g getParserForType();

    @Override // defpackage.rvd
    public abstract /* synthetic */ int getSerializedSize();

    public int getSerializedSize(ani aniVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = aniVar.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // defpackage.rvd, defpackage.svd
    public abstract /* synthetic */ boolean isInitialized();

    @Override // defpackage.rvd
    public abstract /* synthetic */ qvd newBuilderForType();

    public zkm newUninitializedMessageException() {
        return new zkm(this);
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rvd
    public abstract /* synthetic */ qvd toBuilder();

    @Override // defpackage.rvd
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            y75 y75VarNewInstance = y75.newInstance(bArr);
            writeTo(y75VarNewInstance);
            y75VarNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e) {
            h9o.s(getSerializingExceptionMessage("byte array"), e);
            return null;
        }
    }

    @Override // defpackage.rvd
    public v44 toByteString() {
        try {
            v44.f fVarNewCodedBuilder = v44.newCodedBuilder(getSerializedSize());
            writeTo(fVarNewCodedBuilder.getCodedOutput());
            return fVarNewCodedBuilder.build();
        } catch (IOException e) {
            h9o.s(this.getSerializingExceptionMessage("ByteString"), e);
            return null;
        }
    }

    @Override // defpackage.rvd
    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        y75 y75VarNewInstance = y75.newInstance(outputStream, y75.computePreferredBufferSize(y75.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        y75VarNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(y75VarNewInstance);
        y75VarNewInstance.flush();
    }

    @Override // defpackage.rvd
    public void writeTo(OutputStream outputStream) {
        y75 y75VarNewInstance = y75.newInstance(outputStream, y75.computePreferredBufferSize(getSerializedSize()));
        writeTo(y75VarNewInstance);
        y75VarNewInstance.flush();
    }

    @Override // defpackage.rvd
    public abstract /* synthetic */ void writeTo(y75 y75Var);
}
