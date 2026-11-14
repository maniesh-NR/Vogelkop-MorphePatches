package defpackage;

import defpackage.gv9;
import defpackage.j4o;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class g72 {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    public static final class a {
        public final yk8 extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        public a() {
            this.extensionRegistry = yk8.getEmptyRegistry();
        }

        public a(yk8 yk8Var) {
            yk8Var.getClass();
            this.extensionRegistry = yk8Var;
        }
    }

    private g72() {
    }

    private static void checkRecursionLimit(int i) throws bjb {
        if (i >= recursionLimit) {
            throw bjb.recursionLimitExceeded();
        }
    }

    public static int decodeBoolList(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        ln3 ln3Var = (ln3) ffbVar;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, aVar);
        ln3Var.addBoolean(aVar.long1 != 0);
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, aVar);
            ln3Var.addBoolean(aVar.long1 != 0);
        }
        return iDecodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i, a aVar) throws bjb {
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        if (i2 == 0) {
            aVar.object1 = v44.EMPTY;
            return iDecodeVarint32;
        }
        aVar.object1 = v44.copyFrom(bArr, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    public static int decodeBytesList(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) throws bjb {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, aVar);
        int i4 = aVar.int1;
        if (i4 < 0) {
            throw bjb.negativeSize();
        }
        if (i4 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        if (i4 == 0) {
            ffbVar.add(v44.EMPTY);
        } else {
            ffbVar.add(v44.copyFrom(bArr, iDecodeVarint32, i4));
            iDecodeVarint32 += i4;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, aVar);
            int i5 = aVar.int1;
            if (i5 < 0) {
                throw bjb.negativeSize();
            }
            if (i5 > bArr.length - iDecodeVarint32) {
                throw bjb.truncatedMessage();
            }
            if (i5 == 0) {
                ffbVar.add(v44.EMPTY);
            } else {
                ffbVar.add(v44.copyFrom(bArr, iDecodeVarint32, i5));
                iDecodeVarint32 += i5;
            }
        }
        return iDecodeVarint32;
    }

    public static double decodeDouble(byte[] bArr, int i) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i));
    }

    public static int decodeDoubleList(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        ee7 ee7Var = (ee7) ffbVar;
        ee7Var.addDouble(decodeDouble(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, aVar);
            if (i != aVar.int1) {
                break;
            }
            ee7Var.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int i, byte[] bArr, int i2, int i3, gv9.c cVar, gv9.e eVar, bmm bmmVar, a aVar) throws bjb {
        int i4;
        int i5;
        f09 f09Var = cVar.extensions;
        int i6 = i >>> 3;
        if (eVar.descriptor.isRepeated() && eVar.descriptor.isPacked()) {
            switch (e72.$SwitchMap$com$google$protobuf$WireFormat$FieldType[eVar.getLiteType().ordinal()]) {
                case 1:
                    ee7 ee7Var = new ee7();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i2, ee7Var, aVar);
                    f09Var.setField(eVar.descriptor, ee7Var);
                    return iDecodePackedDoubleList;
                case 2:
                    q89 q89Var = new q89();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i2, q89Var, aVar);
                    f09Var.setField(eVar.descriptor, q89Var);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    m0d m0dVar = new m0d();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i2, m0dVar, aVar);
                    f09Var.setField(eVar.descriptor, m0dVar);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    nbb nbbVar = new nbb();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i2, nbbVar, aVar);
                    f09Var.setField(eVar.descriptor, nbbVar);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    m0d m0dVar2 = new m0d();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i2, m0dVar2, aVar);
                    f09Var.setField(eVar.descriptor, m0dVar2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    nbb nbbVar2 = new nbb();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i2, nbbVar2, aVar);
                    f09Var.setField(eVar.descriptor, nbbVar2);
                    return iDecodePackedFixed32List;
                case 11:
                    ln3 ln3Var = new ln3();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i2, ln3Var, aVar);
                    f09Var.setField(eVar.descriptor, ln3Var);
                    return iDecodePackedBoolList;
                case 12:
                    nbb nbbVar3 = new nbb();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i2, nbbVar3, aVar);
                    f09Var.setField(eVar.descriptor, nbbVar3);
                    return iDecodePackedSInt32List;
                case 13:
                    m0d m0dVar3 = new m0d();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i2, m0dVar3, aVar);
                    f09Var.setField(eVar.descriptor, m0dVar3);
                    return iDecodePackedSInt64List;
                case 14:
                    nbb nbbVar4 = new nbb();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i2, nbbVar4, aVar);
                    fni.filterUnknownEnumList(cVar, i6, nbbVar4, eVar.descriptor.getEnumType(), (Object) null, bmmVar);
                    f09Var.setField(eVar.descriptor, nbbVar4);
                    return iDecodePackedVarint32List2;
                default:
                    j9h.u(eVar.descriptor.getLiteType(), "Type cannot be packed: ");
                    return 0;
            }
        }
        Object objValueOf = null;
        if (eVar.getLiteType() == j4o.a.ENUM) {
            i2 = decodeVarint32(bArr, i2, aVar);
            xeb xebVarFindValueByNumber = eVar.descriptor.getEnumType().findValueByNumber(aVar.int1);
            int i7 = aVar.int1;
            if (xebVarFindValueByNumber == null) {
                fni.storeUnknownEnum(cVar, i6, i7, null, bmmVar);
                return i2;
            }
            objValueOf = Integer.valueOf(i7);
        } else {
            switch (e72.$SwitchMap$com$google$protobuf$WireFormat$FieldType[eVar.getLiteType().ordinal()]) {
                case 1:
                    i4 = i2;
                    objValueOf = Double.valueOf(decodeDouble(bArr, i4));
                    i2 = i4 + 8;
                    break;
                case 2:
                    i5 = i2;
                    objValueOf = Float.valueOf(decodeFloat(bArr, i5));
                    i2 = i5 + 4;
                    break;
                case 3:
                case 4:
                    i2 = decodeVarint64(bArr, i2, aVar);
                    objValueOf = Long.valueOf(aVar.long1);
                    break;
                case 5:
                case 6:
                    i2 = decodeVarint32(bArr, i2, aVar);
                    objValueOf = Integer.valueOf(aVar.int1);
                    break;
                case 7:
                case 8:
                    i4 = i2;
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i4));
                    i2 = i4 + 8;
                    break;
                case 9:
                case 10:
                    i5 = i2;
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i5));
                    i2 = i5 + 4;
                    break;
                case 11:
                    i2 = decodeVarint64(bArr, i2, aVar);
                    objValueOf = Boolean.valueOf(aVar.long1 != 0);
                    break;
                case 12:
                    i2 = decodeVarint32(bArr, i2, aVar);
                    objValueOf = Integer.valueOf(r75.decodeZigZag32(aVar.int1));
                    break;
                case 13:
                    i2 = decodeVarint64(bArr, i2, aVar);
                    objValueOf = Long.valueOf(r75.decodeZigZag64(aVar.long1));
                    break;
                case 14:
                    qp2.n("Shouldn't reach here.");
                    return 0;
                case 15:
                    i2 = decodeBytes(bArr, i2, aVar);
                    objValueOf = aVar.object1;
                    break;
                case 16:
                    i2 = decodeString(bArr, i2, aVar);
                    objValueOf = aVar.object1;
                    break;
                case 17:
                    int i8 = (i6 << 3) | 4;
                    ani aniVarSchemaFor = x6h.getInstance().schemaFor(((gv9) eVar.getMessageDefaultInstance()).getClass());
                    if (eVar.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(aniVarSchemaFor, bArr, i2, i3, i8, aVar);
                        f09Var.addRepeatedField(eVar.descriptor, aVar.object1);
                        return iDecodeGroupField;
                    }
                    Object field = f09Var.getField(eVar.descriptor);
                    if (field == null) {
                        field = aniVarSchemaFor.newInstance();
                        f09Var.setField(eVar.descriptor, field);
                    }
                    return mergeGroupField(field, aniVarSchemaFor, bArr, i2, i3, i8, aVar);
                case 18:
                    ani aniVarSchemaFor2 = x6h.getInstance().schemaFor(((gv9) eVar.getMessageDefaultInstance()).getClass());
                    if (eVar.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(aniVarSchemaFor2, bArr, i2, i3, aVar);
                        f09Var.addRepeatedField(eVar.descriptor, aVar.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = f09Var.getField(eVar.descriptor);
                    if (field2 == null) {
                        field2 = aniVarSchemaFor2.newInstance();
                        f09Var.setField(eVar.descriptor, field2);
                    }
                    return mergeMessageField(field2, aniVarSchemaFor2, bArr, i2, i3, aVar);
            }
        }
        boolean zIsRepeated = eVar.isRepeated();
        gv9.d dVar = eVar.descriptor;
        if (zIsRepeated) {
            f09Var.addRepeatedField(dVar, objValueOf);
            return i2;
        }
        f09Var.setField(dVar, objValueOf);
        return i2;
    }

    public static int decodeExtensionOrUnknownField(int i, byte[] bArr, int i2, int i3, Object obj, rvd rvdVar, bmm bmmVar, a aVar) {
        gv9.e eVarFindLiteExtensionByNumber = aVar.extensionRegistry.findLiteExtensionByNumber(rvdVar, i >>> 3);
        if (eVarFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i, bArr, i2, i3, qwd.getMutableUnknownFields(obj), aVar);
        }
        gv9.c cVar = (gv9.c) obj;
        cVar.ensureExtensionsAreMutable();
        return decodeExtension(i, bArr, i2, i3, cVar, eVarFindLiteExtensionByNumber, bmmVar, aVar);
    }

    public static int decodeFixed32(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int decodeFixed32List(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        nbb nbbVar = (nbb) ffbVar;
        nbbVar.addInt(decodeFixed32(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, aVar);
            if (i != aVar.int1) {
                break;
            }
            nbbVar.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 4;
        }
        return i4;
    }

    public static long decodeFixed64(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int decodeFixed64List(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        m0d m0dVar = (m0d) ffbVar;
        m0dVar.addLong(decodeFixed64(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, aVar);
            if (i != aVar.int1) {
                break;
            }
            m0dVar.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 8;
        }
        return i4;
    }

    public static float decodeFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i));
    }

    public static int decodeFloatList(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        q89 q89Var = (q89) ffbVar;
        q89Var.addFloat(decodeFloat(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, aVar);
            if (i != aVar.int1) {
                break;
            }
            q89Var.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 4;
        }
        return i4;
    }

    public static <T> int decodeGroupField(ani aniVar, byte[] bArr, int i, int i2, int i3, a aVar) throws bjb {
        Object objNewInstance = aniVar.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, aniVar, bArr, i, i2, i3, aVar);
        aniVar.makeImmutable(objNewInstance);
        aVar.object1 = objNewInstance;
        return iMergeGroupField;
    }

    public static int decodeGroupList(ani aniVar, int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) throws bjb {
        int i4 = (i & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(aniVar, bArr, i2, i3, i4, aVar);
        ffbVar.add(aVar.object1);
        while (iDecodeGroupField < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(aniVar, bArr, iDecodeVarint32, i3, i4, aVar);
            ffbVar.add(aVar.object1);
        }
        return iDecodeGroupField;
    }

    public static <T> int decodeMessageField(ani aniVar, byte[] bArr, int i, int i2, a aVar) throws bjb {
        Object objNewInstance = aniVar.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, aniVar, bArr, i, i2, aVar);
        aniVar.makeImmutable(objNewInstance);
        aVar.object1 = objNewInstance;
        return iMergeMessageField;
    }

    public static int decodeMessageList(ani aniVar, int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) throws bjb {
        int iDecodeMessageField = decodeMessageField(aniVar, bArr, i2, i3, aVar);
        ffbVar.add(aVar.object1);
        while (iDecodeMessageField < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(aniVar, bArr, iDecodeVarint32, i3, aVar);
            ffbVar.add(aVar.object1);
        }
        return iDecodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        ln3 ln3Var = (ln3) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = i2 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, aVar);
            ln3Var.addBoolean(aVar.long1 != 0);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        ee7 ee7Var = (ee7) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = iDecodeVarint32 + i2;
        ee7Var.ensureCapacity((i2 / 8) + ee7Var.size());
        while (iDecodeVarint32 < i3) {
            ee7Var.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        nbb nbbVar = (nbb) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = iDecodeVarint32 + i2;
        nbbVar.ensureCapacity((i2 / 4) + nbbVar.size());
        while (iDecodeVarint32 < i3) {
            nbbVar.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        m0d m0dVar = (m0d) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = iDecodeVarint32 + i2;
        m0dVar.ensureCapacity((i2 / 8) + m0dVar.size());
        while (iDecodeVarint32 < i3) {
            m0dVar.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        q89 q89Var = (q89) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = iDecodeVarint32 + i2;
        q89Var.ensureCapacity((i2 / 4) + q89Var.size());
        while (iDecodeVarint32 < i3) {
            q89Var.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        nbb nbbVar = (nbb) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = i2 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, aVar);
            nbbVar.addInt(r75.decodeZigZag32(aVar.int1));
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        m0d m0dVar = (m0d) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = i2 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, aVar);
            m0dVar.addLong(r75.decodeZigZag64(aVar.long1));
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        nbb nbbVar = (nbb) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = i2 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, aVar);
            nbbVar.addInt(aVar.int1);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i, ffb ffbVar, a aVar) throws bjb {
        m0d m0dVar = (m0d) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i3 = i2 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, aVar);
            m0dVar.addLong(aVar.long1);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw bjb.truncatedMessage();
    }

    public static int decodeSInt32List(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        nbb nbbVar = (nbb) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, aVar);
        nbbVar.addInt(r75.decodeZigZag32(aVar.int1));
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, aVar);
            nbbVar.addInt(r75.decodeZigZag32(aVar.int1));
        }
        return iDecodeVarint32;
    }

    public static int decodeSInt64List(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        m0d m0dVar = (m0d) ffbVar;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, aVar);
        m0dVar.addLong(r75.decodeZigZag64(aVar.long1));
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, aVar);
            m0dVar.addLong(r75.decodeZigZag64(aVar.long1));
        }
        return iDecodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i, a aVar) throws bjb {
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 == 0) {
            aVar.object1 = "";
            return iDecodeVarint32;
        }
        aVar.object1 = new String(bArr, iDecodeVarint32, i2, StandardCharsets.UTF_8);
        return iDecodeVarint32 + i2;
    }

    public static int decodeStringList(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) throws bjb {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, aVar);
        int i4 = aVar.int1;
        if (i4 < 0) {
            throw bjb.negativeSize();
        }
        if (i4 == 0) {
            ffbVar.add("");
        } else {
            ffbVar.add(new String(bArr, iDecodeVarint32, i4, StandardCharsets.UTF_8));
            iDecodeVarint32 += i4;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, aVar);
            int i5 = aVar.int1;
            if (i5 < 0) {
                throw bjb.negativeSize();
            }
            if (i5 == 0) {
                ffbVar.add("");
            } else {
                ffbVar.add(new String(bArr, iDecodeVarint32, i5, StandardCharsets.UTF_8));
                iDecodeVarint32 += i5;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringListRequireUtf8(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) throws bjb {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, aVar);
        int i4 = aVar.int1;
        if (i4 < 0) {
            throw bjb.negativeSize();
        }
        if (i4 == 0) {
            ffbVar.add("");
        } else {
            int i5 = iDecodeVarint32 + i4;
            if (!nym.isValidUtf8(bArr, iDecodeVarint32, i5)) {
                throw bjb.invalidUtf8();
            }
            ffbVar.add(new String(bArr, iDecodeVarint32, i4, StandardCharsets.UTF_8));
            iDecodeVarint32 = i5;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, aVar);
            int i6 = aVar.int1;
            if (i6 < 0) {
                throw bjb.negativeSize();
            }
            if (i6 == 0) {
                ffbVar.add("");
            } else {
                int i7 = iDecodeVarint32 + i6;
                if (!nym.isValidUtf8(bArr, iDecodeVarint32, i7)) {
                    throw bjb.invalidUtf8();
                }
                ffbVar.add(new String(bArr, iDecodeVarint32, i6, StandardCharsets.UTF_8));
                iDecodeVarint32 = i7;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i, a aVar) throws bjb {
        int iDecodeVarint32 = decodeVarint32(bArr, i, aVar);
        int i2 = aVar.int1;
        if (i2 < 0) {
            throw bjb.negativeSize();
        }
        if (i2 == 0) {
            aVar.object1 = "";
            return iDecodeVarint32;
        }
        aVar.object1 = nym.decodeUtf8(bArr, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    public static int decodeUnknownField(int i, byte[] bArr, int i2, int i3, dmm dmmVar, a aVar) throws bjb {
        if (j4o.getTagFieldNumber(i) == 0) {
            throw bjb.invalidTag();
        }
        int tagWireType = j4o.getTagWireType(i);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i2, aVar);
            dmmVar.storeField(i, Long.valueOf(aVar.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            dmmVar.storeField(i, Long.valueOf(decodeFixed64(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i2, aVar);
            int i4 = aVar.int1;
            if (i4 < 0) {
                throw bjb.negativeSize();
            }
            if (i4 > bArr.length - iDecodeVarint32) {
                throw bjb.truncatedMessage();
            }
            if (i4 == 0) {
                dmmVar.storeField(i, v44.EMPTY);
            } else {
                dmmVar.storeField(i, v44.copyFrom(bArr, iDecodeVarint32, i4));
            }
            return iDecodeVarint32 + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw bjb.invalidTag();
            }
            dmmVar.storeField(i, Integer.valueOf(decodeFixed32(bArr, i2)));
            return i2 + 4;
        }
        dmm dmmVarNewInstance = dmm.newInstance();
        int i5 = (i & (-8)) | 4;
        int i6 = aVar.recursionDepth + 1;
        aVar.recursionDepth = i6;
        checkRecursionLimit(i6);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iDecodeVarint322 = decodeVarint32(bArr, i2, aVar);
            i7 = aVar.int1;
            if (i7 == i5) {
                i2 = iDecodeVarint322;
                break;
            }
            i2 = decodeUnknownField(i7, bArr, iDecodeVarint322, i3, dmmVarNewInstance, aVar);
        }
        aVar.recursionDepth--;
        if (i2 > i3 || i7 != i5) {
            throw bjb.parseFailure();
        }
        dmmVar.storeField(i, dmmVarNewInstance);
        return i2;
    }

    public static int decodeVarint32(int i, byte[] bArr, int i2, a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.int1 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.int1 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.int1 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.int1 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aVar.int1 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int decodeVarint32(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return decodeVarint32(b, bArr, i2, aVar);
        }
        aVar.int1 = b;
        return i2;
    }

    public static int decodeVarint32List(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        nbb nbbVar = (nbb) ffbVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, aVar);
        nbbVar.addInt(aVar.int1);
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, aVar);
            nbbVar.addInt(aVar.int1);
        }
        return iDecodeVarint32;
    }

    public static int decodeVarint64(long j, byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i3;
            i2 = i4;
            b = b2;
        }
        aVar.long1 = j2;
        return i2;
    }

    public static int decodeVarint64(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return decodeVarint64(j, bArr, i2, aVar);
        }
        aVar.long1 = j;
        return i2;
    }

    public static int decodeVarint64List(int i, byte[] bArr, int i2, int i3, ffb ffbVar, a aVar) {
        m0d m0dVar = (m0d) ffbVar;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, aVar);
        m0dVar.addLong(aVar.long1);
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, aVar);
            if (i != aVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, aVar);
            m0dVar.addLong(aVar.long1);
        }
        return iDecodeVarint64;
    }

    public static <T> int mergeGroupField(Object obj, ani aniVar, byte[] bArr, int i, int i2, int i3, a aVar) throws bjb {
        int i4 = aVar.recursionDepth + 1;
        aVar.recursionDepth = i4;
        checkRecursionLimit(i4);
        int message = ((qwd) aniVar).parseMessage(obj, bArr, i, i2, i3, aVar);
        aVar.recursionDepth--;
        aVar.object1 = obj;
        return message;
    }

    public static <T> int mergeMessageField(Object obj, ani aniVar, byte[] bArr, int i, int i2, a aVar) throws bjb {
        int iDecodeVarint32 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iDecodeVarint32 = decodeVarint32(i3, bArr, iDecodeVarint32, aVar);
            i3 = aVar.int1;
        }
        int i4 = iDecodeVarint32;
        if (i3 < 0 || i3 > i2 - i4) {
            throw bjb.truncatedMessage();
        }
        int i5 = aVar.recursionDepth + 1;
        aVar.recursionDepth = i5;
        checkRecursionLimit(i5);
        int i6 = i4 + i3;
        aniVar.mergeFrom(obj, bArr, i4, i6, aVar);
        aVar.recursionDepth--;
        aVar.object1 = obj;
        return i6;
    }

    public static void setRecursionLimit(int i) {
        recursionLimit = i;
    }

    public static int skipField(int i, byte[] bArr, int i2, int i3, a aVar) throws bjb {
        if (j4o.getTagFieldNumber(i) == 0) {
            throw bjb.invalidTag();
        }
        int tagWireType = j4o.getTagWireType(i);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i2, aVar);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i2, aVar) + aVar.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw bjb.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = aVar.recursionDepth + 1;
        aVar.recursionDepth = i5;
        checkRecursionLimit(i5);
        int i6 = 0;
        while (i2 < i3) {
            i2 = decodeVarint32(bArr, i2, aVar);
            i6 = aVar.int1;
            if (i6 == i4) {
                break;
            }
            i2 = skipField(i6, bArr, i2, i3, aVar);
        }
        aVar.recursionDepth--;
        if (i2 > i3 || i6 != i4) {
            throw bjb.parseFailure();
        }
        return i2;
    }
}
