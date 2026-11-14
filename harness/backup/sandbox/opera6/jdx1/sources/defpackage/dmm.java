package defpackage;

import defpackage.bjb;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dmm {
    private static final dmm DEFAULT_INSTANCE = new dmm(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private dmm() {
        this(0, new int[8], new Object[8], true);
    }

    private dmm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.memoizedSerializedSize = -1;
        this.count = i;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z;
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.tags;
        if (i > iArr.length) {
            int i2 = this.count;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.tags = Arrays.copyOf(iArr, i);
            this.objects = Arrays.copyOf(this.objects, i);
        }
    }

    public static dmm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int hashCode(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    private dmm mergeFrom(r75 r75Var) {
        int tag;
        do {
            tag = r75Var.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, r75Var));
        return this;
    }

    public static dmm mutableCopyOf(dmm dmmVar, dmm dmmVar2) {
        int i = dmmVar.count + dmmVar2.count;
        int[] iArrCopyOf = Arrays.copyOf(dmmVar.tags, i);
        System.arraycopy(dmmVar2.tags, 0, iArrCopyOf, dmmVar.count, dmmVar2.count);
        Object[] objArrCopyOf = Arrays.copyOf(dmmVar.objects, i);
        System.arraycopy(dmmVar2.objects, 0, objArrCopyOf, dmmVar.count, dmmVar2.count);
        return new dmm(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static dmm newInstance() {
        return new dmm();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i, Object obj, a85 a85Var) {
        int tagFieldNumber = j4o.getTagFieldNumber(i);
        int tagWireType = j4o.getTagWireType(i);
        if (tagWireType == 0) {
            a85Var.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            a85Var.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            a85Var.writeBytes(tagFieldNumber, (v44) obj);
            return;
        }
        if (tagWireType == 3) {
            a85Var.writeStartGroup(tagFieldNumber);
            ((dmm) obj).writeTo(a85Var);
            a85Var.writeEndGroup(tagFieldNumber);
        } else if (tagWireType == 5) {
            a85Var.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
        } else {
            rqd.p(bjb.invalidWireType());
        }
    }

    public void checkMutable() {
        if (this.isMutable) {
            return;
        }
        t3p.o();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dmm)) {
            return false;
        }
        dmm dmmVar = (dmm) obj;
        int i = this.count;
        return i == dmmVar.count && tagsEquals(this.tags, dmmVar.tags, i) && objectsEquals(this.objects, dmmVar.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = 0;
        for (int i2 = 0; i2 < this.count; i2++) {
            int i3 = this.tags[i2];
            int tagFieldNumber = j4o.getTagFieldNumber(i3);
            int tagWireType = j4o.getTagWireType(i3);
            if (tagWireType == 0) {
                iComputeUInt64Size = y75.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i2]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = y75.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i2]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = y75.computeBytesSize(tagFieldNumber, (v44) this.objects[i2]);
            } else if (tagWireType == 3) {
                serializedSize = ((dmm) this.objects[i2]).getSerializedSize() + (y75.computeTagSize(tagFieldNumber) << 1) + serializedSize;
            } else {
                if (tagWireType != 5) {
                    h9o.o(bjb.invalidWireType());
                    return 0;
                }
                iComputeUInt64Size = y75.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i2]).intValue());
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.memoizedSerializedSize = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i2 = 0; i2 < this.count; i2++) {
            iComputeRawMessageSetExtensionSize += y75.computeRawMessageSetExtensionSize(j4o.getTagFieldNumber(this.tags[i2]), (v44) this.objects[i2]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int hashCode() {
        int i = this.count;
        return ((((527 + i) * 31) + hashCode(this.tags, i)) * 31) + hashCode(this.objects, this.count);
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    public boolean mergeFieldFrom(int i, r75 r75Var) throws bjb {
        checkMutable();
        int tagFieldNumber = j4o.getTagFieldNumber(i);
        int tagWireType = j4o.getTagWireType(i);
        if (tagWireType == 0) {
            storeField(i, Long.valueOf(r75Var.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(i, Long.valueOf(r75Var.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(i, r75Var.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                r75Var.checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            storeField(i, Integer.valueOf(r75Var.readFixed32()));
            return true;
        }
        r75Var.checkRecursionLimit();
        r75Var.groupDepth++;
        dmm dmmVar = new dmm();
        dmmVar.mergeFrom(r75Var);
        r75Var.groupDepth--;
        r75Var.checkLastTagWas(j4o.makeTag(tagFieldNumber, 4));
        storeField(i, dmmVar);
        return true;
    }

    public dmm mergeFrom(dmm dmmVar) {
        if (dmmVar.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i = this.count + dmmVar.count;
        ensureCapacity(i);
        System.arraycopy(dmmVar.tags, 0, this.tags, this.count, dmmVar.count);
        System.arraycopy(dmmVar.objects, 0, this.objects, this.count, dmmVar.count);
        this.count = i;
        return this;
    }

    public dmm mergeLengthDelimitedField(int i, v44 v44Var) {
        checkMutable();
        if (i != 0) {
            storeField(j4o.makeTag(i, 2), v44Var);
            return this;
        }
        qp2.o("Zero is not a valid field number.");
        return null;
    }

    public dmm mergeVarintField(int i, int i2) {
        checkMutable();
        if (i != 0) {
            storeField(j4o.makeTag(i, 0), Long.valueOf(i2));
            return this;
        }
        qp2.o("Zero is not a valid field number.");
        return null;
    }

    public final void printWithIndent(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            vvd.printField(sb, i, String.valueOf(j4o.getTagFieldNumber(this.tags[i2])), this.objects[i2]);
        }
    }

    public void storeField(int i, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i2 = this.count;
        iArr[i2] = i;
        this.objects[i2] = obj;
        this.count = i2 + 1;
    }

    public void writeAsMessageSetTo(a85 a85Var) {
        for (int i = 0; i < this.count; i++) {
            a85Var.writeMessageSetItem(j4o.getTagFieldNumber(this.tags[i]), this.objects[i]);
        }
    }

    public void writeAsMessageSetTo(y75 y75Var) {
        for (int i = 0; i < this.count; i++) {
            y75Var.writeRawMessageSetExtension(j4o.getTagFieldNumber(this.tags[i]), (v44) this.objects[i]);
        }
    }

    public void writeTo(a85 a85Var) {
        if (this.count != 0) {
            for (int i = 0; i < this.count; i++) {
                writeField(this.tags[i], this.objects[i], a85Var);
            }
        }
    }

    public void writeTo(y75 y75Var) throws bjb.a {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.tags[i];
            int tagFieldNumber = j4o.getTagFieldNumber(i2);
            int tagWireType = j4o.getTagWireType(i2);
            if (tagWireType == 0) {
                y75Var.writeUInt64(tagFieldNumber, ((Long) this.objects[i]).longValue());
            } else if (tagWireType == 1) {
                y75Var.writeFixed64(tagFieldNumber, ((Long) this.objects[i]).longValue());
            } else if (tagWireType == 2) {
                y75Var.writeBytes(tagFieldNumber, (v44) this.objects[i]);
            } else if (tagWireType == 3) {
                y75Var.writeTag(tagFieldNumber, 3);
                ((dmm) this.objects[i]).writeTo(y75Var);
                y75Var.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw bjb.invalidWireType();
                }
                y75Var.writeFixed32(tagFieldNumber, ((Integer) this.objects[i]).intValue());
            }
        }
    }
}
