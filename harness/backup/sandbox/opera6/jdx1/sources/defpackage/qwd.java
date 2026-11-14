package defpackage;

import defpackage.aad;
import defpackage.bjb;
import defpackage.g72;
import defpackage.j4o;
import defpackage.v44;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class qwd implements ani {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final rvd defaultInstance;
    private final bl8 extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final hhc listFieldSchema;
    private final boolean lite;
    private final had mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final npe newInstanceSchema;
    private final Object[] objects;
    private final int oneofFieldPositionsStart;
    private final bmm unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = cnm.getUnsafe();

    private qwd(int[] iArr, Object[] objArr, int i, int i2, rvd rvdVar, boolean z, int[] iArr2, int i3, int i4, npe npeVar, hhc hhcVar, bmm bmmVar, bl8 bl8Var, had hadVar) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = rvdVar instanceof gv9;
        this.hasExtensions = bl8Var != null && bl8Var.hasExtensions(rvdVar);
        this.useCachedSizeField = z;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.oneofFieldPositionsStart = i4;
        this.newInstanceSchema = npeVar;
        this.listFieldSchema = hhcVar;
        this.unknownFieldSchema = bmmVar;
        this.extensionSchema = bl8Var;
        this.defaultInstance = rvdVar;
        this.mapFieldSchema = hadVar;
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i) {
        return isFieldPresent(obj, i) == isFieldPresent(obj2, i);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return cnm.getBoolean(t, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        qp2.o(rfp.o(obj, "Mutating immutable message: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, aad.a aVar, Map<K, V> map, g72.a aVar2) throws bjb {
        int iDecodeVarint32 = g72.decodeVarint32(bArr, i, aVar2);
        int i3 = aVar2.int1;
        if (i3 < 0 || i3 > i2 - iDecodeVarint32) {
            throw bjb.truncatedMessage();
        }
        int i4 = iDecodeVarint32 + i3;
        Object obj = aVar.defaultKey;
        Object obj2 = aVar.defaultValue;
        while (iDecodeVarint32 < i4) {
            int iDecodeVarint322 = iDecodeVarint32 + 1;
            int i5 = bArr[iDecodeVarint32];
            if (i5 < 0) {
                iDecodeVarint322 = g72.decodeVarint32(i5, bArr, iDecodeVarint322, aVar2);
                i5 = aVar2.int1;
            }
            int i6 = iDecodeVarint322;
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == aVar.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i6, i2, aVar.valueType, aVar.defaultValue.getClass(), aVar2);
                    obj2 = aVar2.object1;
                } else {
                    iDecodeVarint32 = g72.skipField(i5, bArr, i6, i2, aVar2);
                }
            } else if (i8 == aVar.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i6, i2, aVar.keyType, null, aVar2);
                obj = aVar2.object1;
            } else {
                iDecodeVarint32 = g72.skipField(i5, bArr, i6, i2, aVar2);
            }
        }
        if (iDecodeVarint32 != i4) {
            throw bjb.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, j4o.a aVar, Class<?> cls, g72.a aVar2) {
        switch (owd.$SwitchMap$com$google$protobuf$WireFormat$FieldType[aVar.ordinal()]) {
            case 1:
                int iDecodeVarint64 = g72.decodeVarint64(bArr, i, aVar2);
                aVar2.object1 = Boolean.valueOf(aVar2.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return g72.decodeBytes(bArr, i, aVar2);
            case 3:
                aVar2.object1 = Double.valueOf(g72.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                aVar2.object1 = Integer.valueOf(g72.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                aVar2.object1 = Long.valueOf(g72.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                aVar2.object1 = Float.valueOf(g72.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = g72.decodeVarint32(bArr, i, aVar2);
                aVar2.object1 = Integer.valueOf(aVar2.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = g72.decodeVarint64(bArr, i, aVar2);
                aVar2.object1 = Long.valueOf(aVar2.long1);
                return iDecodeVarint642;
            case 14:
                return g72.decodeMessageField(x6h.getInstance().schemaFor(cls), bArr, i, i2, aVar2);
            case 15:
                int iDecodeVarint322 = g72.decodeVarint32(bArr, i, aVar2);
                aVar2.object1 = Integer.valueOf(r75.decodeZigZag32(aVar2.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = g72.decodeVarint64(bArr, i, aVar2);
                aVar2.object1 = Long.valueOf(r75.decodeZigZag64(aVar2.long1));
                return iDecodeVarint643;
            case 17:
                return g72.decodeStringRequireUtf8(bArr, i, aVar2);
            default:
                h9o.r("unsupported field type.");
                return 0;
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return cnm.getDouble(t, j);
    }

    private boolean equalsAtPosition(Object obj, Object obj2, int i, int i2, long j) {
        switch (i2) {
            case 0:
                if (!arePresentForEquals(obj, obj2, i) || Double.doubleToLongBits(cnm.getDouble(obj, j)) != Double.doubleToLongBits(cnm.getDouble(obj2, j))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(obj, obj2, i) || Float.floatToIntBits(cnm.getFloat(obj, j)) != Float.floatToIntBits(cnm.getFloat(obj2, j))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getLong(obj, j) != cnm.getLong(obj2, j)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getLong(obj, j) != cnm.getLong(obj2, j)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getInt(obj, j) != cnm.getInt(obj2, j)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getLong(obj, j) != cnm.getLong(obj2, j)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getInt(obj, j) != cnm.getInt(obj2, j)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getBoolean(obj, j) != cnm.getBoolean(obj2, j)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(obj, obj2, i) || !fni.safeEquals(cnm.getObject(obj, j), cnm.getObject(obj2, j))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(obj, obj2, i) || !fni.safeEquals(cnm.getObject(obj, j), cnm.getObject(obj2, j))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(obj, obj2, i) || !fni.safeEquals(cnm.getObject(obj, j), cnm.getObject(obj2, j))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getInt(obj, j) != cnm.getInt(obj2, j)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getInt(obj, j) != cnm.getInt(obj2, j)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getInt(obj, j) != cnm.getInt(obj2, j)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getLong(obj, j) != cnm.getLong(obj2, j)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getInt(obj, j) != cnm.getInt(obj2, j)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(obj, obj2, i) || cnm.getLong(obj, j) != cnm.getLong(obj2, j)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(obj, obj2, i) || !fni.safeEquals(cnm.getObject(obj, j), cnm.getObject(obj2, j))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(obj, obj2, i) || !fni.safeEquals(cnm.getObject(obj, j), cnm.getObject(obj2, j))) {
                }
                break;
        }
        return true;
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, bmm bmmVar, Object obj2) {
        afb enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object object = cnm.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, bmmVar, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, afb afbVar, UB ub, bmm bmmVar, Object obj) {
        aad.a aVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!afbVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = (UB) bmmVar.getBuilderFromMessage(obj);
                }
                v44.f fVarNewCodedBuilder = v44.newCodedBuilder(aad.computeSerializedSize(aVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    aad.writeTo(fVarNewCodedBuilder.getCodedOutput(), aVarForMapMetadata, next.getKey(), next.getValue());
                    bmmVar.addLengthDelimited(ub, i2, fVarNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    rqd.p(e);
                    return null;
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return cnm.getFloat(t, j);
    }

    private afb getEnumFieldVerifier(int i) {
        return (afb) this.objects[((i / 3) << 1) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) << 1];
    }

    private ani getMessageFieldSchema(int i) {
        int i2 = (i / 3) << 1;
        ani aniVar = (ani) this.objects[i2];
        if (aniVar != null) {
            return aniVar;
        }
        ani aniVarSchemaFor = x6h.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = aniVarSchemaFor;
        return aniVarSchemaFor;
    }

    public static dmm getMutableUnknownFields(Object obj) {
        gv9 gv9Var = (gv9) obj;
        dmm dmmVar = gv9Var.unknownFields;
        if (dmmVar != dmm.getDefaultInstance()) {
            return dmmVar;
        }
        dmm dmmVarNewInstance = dmm.newInstance();
        gv9Var.unknownFields = dmmVarNewInstance;
        return dmmVarNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(bmm bmmVar, Object obj) {
        return bmmVar.getSerializedSize(bmmVar.getFromMessage(obj));
    }

    private static <T> int intAt(T t, long j) {
        return cnm.getInt(t, j);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(Object obj, int i) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (cnm.getInt(obj, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(cnm.getDouble(obj, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(cnm.getFloat(obj, jOffset)) != 0;
            case 2:
                return cnm.getLong(obj, jOffset) != 0;
            case 3:
                return cnm.getLong(obj, jOffset) != 0;
            case 4:
                return cnm.getInt(obj, jOffset) != 0;
            case 5:
                return cnm.getLong(obj, jOffset) != 0;
            case 6:
                return cnm.getInt(obj, jOffset) != 0;
            case 7:
                return cnm.getBoolean(obj, jOffset);
            case 8:
                Object object = cnm.getObject(obj, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                    break;
                } else {
                    if (!(object instanceof v44)) {
                        return throwIllegalArgumentException();
                    }
                    zEquals = v44.EMPTY.equals(object);
                    break;
                }
            case 9:
                return cnm.getObject(obj, jOffset) != null;
            case 10:
                zEquals = v44.EMPTY.equals(cnm.getObject(obj, jOffset));
                break;
            case 11:
                return cnm.getInt(obj, jOffset) != 0;
            case 12:
                return cnm.getInt(obj, jOffset) != 0;
            case 13:
                return cnm.getInt(obj, jOffset) != 0;
            case 14:
                return cnm.getLong(obj, jOffset) != 0;
            case 15:
                return cnm.getInt(obj, jOffset) != 0;
            case 16:
                return cnm.getLong(obj, jOffset) != 0;
            case 17:
                return cnm.getObject(obj, jOffset) != null;
            default:
                return throwIllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean isFieldPresent(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? isFieldPresent(obj, i) : (i3 & i4) != 0;
    }

    private static boolean isInitialized(Object obj, int i, ani aniVar) {
        return aniVar.isInitialized(cnm.getObject(obj, offset(i)));
    }

    private static boolean isLegacyEnumIsClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) cnm.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        ani messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i, int i2) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(cnm.getObject(obj, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != j4o.b.MESSAGE) {
            return true;
        }
        ani aniVarSchemaFor = null;
        for (Object obj2 : mapForMapData.values()) {
            if (aniVarSchemaFor == null) {
                aniVarSchemaFor = x6h.getInstance().schemaFor(((gv9) obj2).getClass());
            }
            if (!aniVarSchemaFor.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof gv9) {
            return ((gv9) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return cnm.getInt(obj, jPresenceMaskAndOffsetAt) == cnm.getInt(obj2, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(Object obj, int i, int i2) {
        return cnm.getInt(obj, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t, long j) {
        return cnm.getLong(t, j);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends defpackage.e09> void mergeFromHelper(defpackage.bmm r18, defpackage.bl8 r19, java.lang.Object r20, defpackage.u75 r21, defpackage.yk8 r22) {
        /*
            Method dump skipped, instructions count: 1996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.mergeFromHelper(bmm, bl8, java.lang.Object, u75, yk8):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, yk8 yk8Var, u75 u75Var) throws bjb.a {
        long jOffset = offset(typeAndOffsetAt(i));
        Object object = cnm.getObject(obj, jOffset);
        had hadVar = this.mapFieldSchema;
        if (object == null) {
            object = hadVar.newMapField(obj2);
            cnm.putObject(obj, jOffset, object);
        } else if (hadVar.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            cnm.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        u75Var.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), yk8Var);
    }

    private void mergeMessage(Object obj, Object obj2, int i) {
        if (isFieldPresent(obj2, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, jOffset);
            if (object == null) {
                rqd.c(numberAt(i), obj2);
                return;
            }
            ani messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(obj, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOffset, object);
                }
                setFieldPresent(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(obj2, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, jOffset);
            if (object == null) {
                rqd.c(numberAt(i), obj2);
                return;
            }
            ani messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(obj, iNumberAt, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOffset, object);
                }
                setOneofPresent(obj, iNumberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(Object obj, Object obj2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i)) {
                    cnm.putDouble(obj, jOffset, cnm.getDouble(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(obj2, i)) {
                    cnm.putFloat(obj, jOffset, cnm.getFloat(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(obj2, i)) {
                    cnm.putLong(obj, jOffset, cnm.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(obj2, i)) {
                    cnm.putLong(obj, jOffset, cnm.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(obj2, i)) {
                    cnm.putInt(obj, jOffset, cnm.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(obj2, i)) {
                    cnm.putLong(obj, jOffset, cnm.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(obj2, i)) {
                    cnm.putInt(obj, jOffset, cnm.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(obj2, i)) {
                    cnm.putBoolean(obj, jOffset, cnm.getBoolean(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(obj2, i)) {
                    cnm.putObject(obj, jOffset, cnm.getObject(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 9:
                mergeMessage(obj, obj2, i);
                break;
            case 10:
                if (isFieldPresent(obj2, i)) {
                    cnm.putObject(obj, jOffset, cnm.getObject(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(obj2, i)) {
                    cnm.putInt(obj, jOffset, cnm.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(obj2, i)) {
                    cnm.putInt(obj, jOffset, cnm.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(obj2, i)) {
                    cnm.putInt(obj, jOffset, cnm.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(obj2, i)) {
                    cnm.putLong(obj, jOffset, cnm.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(obj2, i)) {
                    cnm.putInt(obj, jOffset, cnm.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(obj2, i)) {
                    cnm.putLong(obj, jOffset, cnm.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 17:
                mergeMessage(obj, obj2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, jOffset);
                break;
            case 50:
                fni.mergeMap(this.mapFieldSchema, obj, obj2, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(obj2, iNumberAt, i)) {
                    cnm.putObject(obj, jOffset, cnm.getObject(obj2, jOffset));
                    setOneofPresent(obj, iNumberAt, i);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(obj, obj2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(obj2, iNumberAt, i)) {
                    cnm.putObject(obj, jOffset, cnm.getObject(obj2, jOffset));
                    setOneofPresent(obj, iNumberAt, i);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(obj, obj2, i);
                break;
        }
    }

    private Object mutableMessageFieldForMerge(Object obj, int i) {
        ani messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(obj, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object mutableOneofMessageFieldForMerge(Object obj, int i, int i2) {
        ani messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(obj, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> qwd newSchema(Class<T> cls, mvd mvdVar, npe npeVar, hhc hhcVar, bmm bmmVar, bl8 bl8Var, had hadVar) {
        if (UNSAFE != null) {
            return mvdVar instanceof dkh ? newSchemaForRawMessageInfo((dkh) mvdVar, npeVar, hhcVar, bmmVar, bl8Var, hadVar) : newSchemaForMessageInfo((vik) mvdVar, npeVar, hhcVar, bmmVar, bl8Var, hadVar);
        }
        h9o.r("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
        return null;
    }

    private static <T> qwd newSchemaForMessageInfo(vik vikVar, npe npeVar, hhc hhcVar, bmm bmmVar, bl8 bl8Var, had hadVar) {
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        b09[] fields = vikVar.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length << 1];
        HashSet hashSet = new HashSet();
        int i = 0;
        int i2 = 0;
        for (b09 b09Var : fields) {
            if (b09Var.getType() == o09.MAP) {
                i++;
            } else {
                pff oneof = b09Var.getOneof();
                if (oneof != null && !hashSet.add(Integer.valueOf(oneof.getId()))) {
                    i2++;
                }
            }
        }
        int[] iArr3 = i > 0 ? new int[i] : EMPTY_INT_ARRAY;
        int[] iArr4 = i2 > 0 ? new int[i2] : EMPTY_INT_ARRAY;
        hashSet.clear();
        int[] checkInitialized = vikVar.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < fields.length) {
            b09 b09Var2 = fields[i3];
            int fieldNumber3 = b09Var2.getFieldNumber();
            storeFieldData(b09Var2, iArr2, i4, objArr);
            b09[] b09VarArr = fields;
            if (i5 < checkInitialized.length && checkInitialized[i5] == fieldNumber3) {
                checkInitialized[i5] = i4;
                i5++;
            }
            if (b09Var2.getType() == o09.MAP) {
                iArr3[i6] = i4;
                i6++;
            } else {
                pff oneof2 = b09Var2.getOneof();
                if (oneof2 != null && !hashSet.add(Integer.valueOf(oneof2.getId()))) {
                    iArr4[i7] = i4;
                    i7++;
                }
            }
            i3++;
            i4 += 3;
            fields = b09VarArr;
        }
        int length2 = checkInitialized.length + iArr3.length + iArr4.length;
        if (length2 > 0) {
            iArr = new int[length2];
            System.arraycopy(checkInitialized, 0, iArr, 0, checkInitialized.length);
            System.arraycopy(iArr3, 0, iArr, checkInitialized.length, iArr3.length);
            System.arraycopy(iArr4, 0, iArr, checkInitialized.length + iArr3.length, iArr4.length);
        } else {
            iArr = EMPTY_INT_ARRAY;
        }
        return new qwd(iArr2, objArr, fieldNumber, fieldNumber2, vikVar.getDefaultInstance(), true, iArr, checkInitialized.length, checkInitialized.length + iArr3.length, npeVar, hhcVar, bmmVar, bl8Var, hadVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0376  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> defpackage.qwd newSchemaForRawMessageInfo(defpackage.dkh r32, defpackage.npe r33, defpackage.hhc r34, defpackage.bmm r35, defpackage.bl8 r36, defpackage.had r37) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.newSchemaForRawMessageInfo(dkh, npe, hhc, bmm, bl8, had):qwd");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) cnm.getObject(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) cnm.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) cnm.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) cnm.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) cnm.getObject(t, j)).longValue();
    }

    private <K, V> int parseMapField(Object obj, byte[] bArr, int i, int i2, int i3, long j, g72.a aVar) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), aVar);
    }

    private int parseOneofField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, g72.a aVar) throws bjb {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(g72.decodeDouble(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(g72.decodeFloat(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint64 = g72.decodeVarint64(bArr, i, aVar);
                unsafe.putObject(obj, j, Long.valueOf(aVar.long1));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint32 = g72.decodeVarint32(bArr, i, aVar);
                unsafe.putObject(obj, j, Integer.valueOf(aVar.int1));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(g72.decodeFixed64(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(g72.decodeFixed32(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint642 = g72.decodeVarint64(bArr, i, aVar);
                unsafe.putObject(obj, j, Boolean.valueOf(aVar.long1 != 0));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint642;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iDecodeVarint322 = g72.decodeVarint32(bArr, i, aVar);
                int i13 = aVar.int1;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & ENFORCE_UTF8_MASK) != 0 && !nym.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i13)) {
                        throw bjb.invalidUtf8();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iDecodeVarint322, i13, StandardCharsets.UTF_8));
                    iDecodeVarint322 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint322;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i4, i8);
                int iMergeMessageField = g72.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, aVar);
                storeOneofMessageField(obj, i4, i8, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iDecodeBytes = g72.decodeBytes(bArr, i, aVar);
                unsafe.putObject(obj, j, aVar.object1);
                unsafe.putInt(obj, j2, i4);
                return iDecodeBytes;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint323 = g72.decodeVarint32(bArr, i, aVar);
                int i14 = aVar.int1;
                afb enumFieldVerifier = getEnumFieldVerifier(i8);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i14)) {
                    getMutableUnknownFields(obj).storeField(i3, Long.valueOf(i14));
                    return iDecodeVarint323;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint323;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint324 = g72.decodeVarint32(bArr, i, aVar);
                unsafe.putObject(obj, j, Integer.valueOf(r75.decodeZigZag32(aVar.int1)));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint324;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint643 = g72.decodeVarint64(bArr, i, aVar);
                unsafe.putObject(obj, j, Long.valueOf(r75.decodeZigZag64(aVar.long1)));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint643;
            case 68:
                if (i5 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i4, i8);
                    int iMergeGroupField = g72.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, aVar);
                    storeOneofMessageField(obj, i4, i8, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, g72.a aVar) throws bjb {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        ffb ffbVarMutableCopyWithCapacity = (ffb) unsafe.getObject(obj, j2);
        if (!ffbVarMutableCopyWithCapacity.isModifiable()) {
            ffbVarMutableCopyWithCapacity = ffbVarMutableCopyWithCapacity.mutableCopyWithCapacity(ffbVarMutableCopyWithCapacity.size() << 1);
            unsafe.putObject(obj, j2, ffbVarMutableCopyWithCapacity);
        }
        ffb ffbVar = ffbVarMutableCopyWithCapacity;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return g72.decodePackedDoubleList(bArr, i, ffbVar, aVar);
                }
                if (i5 == 1) {
                    return g72.decodeDoubleList(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return g72.decodePackedFloatList(bArr, i, ffbVar, aVar);
                }
                if (i5 == 5) {
                    return g72.decodeFloatList(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return g72.decodePackedVarint64List(bArr, i, ffbVar, aVar);
                }
                if (i5 == 0) {
                    return g72.decodeVarint64List(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return g72.decodePackedVarint32List(bArr, i, ffbVar, aVar);
                }
                if (i5 == 0) {
                    return g72.decodeVarint32List(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return g72.decodePackedFixed64List(bArr, i, ffbVar, aVar);
                }
                if (i5 == 1) {
                    return g72.decodeFixed64List(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return g72.decodePackedFixed32List(bArr, i, ffbVar, aVar);
                }
                if (i5 == 5) {
                    return g72.decodeFixed32List(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return g72.decodePackedBoolList(bArr, i, ffbVar, aVar);
                }
                if (i5 == 0) {
                    return g72.decodeBoolList(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? g72.decodeStringList(i3, bArr, i, i2, ffbVar, aVar) : g72.decodeStringListRequireUtf8(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return g72.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return g72.decodeBytesList(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iDecodeVarint32List = g72.decodeVarint32List(i3, bArr, i, i2, ffbVar, aVar);
                    }
                    return i;
                }
                iDecodeVarint32List = g72.decodePackedVarint32List(bArr, i, ffbVar, aVar);
                fni.filterUnknownEnumList(obj, i4, ffbVar, getEnumFieldVerifier(i6), (Object) null, this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return g72.decodePackedSInt32List(bArr, i, ffbVar, aVar);
                }
                if (i5 == 0) {
                    return g72.decodeSInt32List(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return g72.decodePackedSInt64List(bArr, i, ffbVar, aVar);
                }
                if (i5 == 0) {
                    return g72.decodeSInt64List(i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return g72.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, ffbVar, aVar);
                }
                return i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, u75 u75Var, ani aniVar, yk8 yk8Var) throws bjb.a {
        u75Var.readGroupList(this.listFieldSchema.mutableListAt(obj, j), aniVar, yk8Var);
    }

    private <E> void readMessageList(Object obj, int i, u75 u75Var, ani aniVar, yk8 yk8Var) throws bjb.a {
        u75Var.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), aniVar, yk8Var);
    }

    private void readString(Object obj, int i, u75 u75Var) {
        if (isEnforceUtf8(i)) {
            cnm.putObject(obj, offset(i), u75Var.readStringRequireUtf8());
        } else if (this.lite) {
            cnm.putObject(obj, offset(i), u75Var.readString());
        } else {
            cnm.putObject(obj, offset(i), u75Var.readBytes());
        }
    }

    private void readStringList(Object obj, int i, u75 u75Var) throws bjb.a {
        boolean zIsEnforceUtf8 = isEnforceUtf8(i);
        hhc hhcVar = this.listFieldSchema;
        if (zIsEnforceUtf8) {
            u75Var.readStringListRequireUtf8(hhcVar.mutableListAt(obj, offset(i)));
        } else {
            u75Var.readStringList(hhcVar.mutableListAt(obj, offset(i)));
        }
    }

    private static Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbS = p3p.s("Field ", str, " for ");
            sbS.append(cls.getName());
            sbS.append(" not found. Known fields are ");
            sbS.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbS.toString(), e);
        }
    }

    private void setFieldPresent(Object obj, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        cnm.putInt(obj, j, cnm.getInt(obj, j) | (1 << (iPresenceMaskAndOffsetAt >>> 20)));
    }

    private void setOneofPresent(Object obj, int i, int i2) {
        cnm.putInt(obj, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iNumberAt = numberAt(i4);
            if (i == iNumberAt) {
                return i4;
            }
            if (i < iNumberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(defpackage.b09 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            pff r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            o09 r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = defpackage.cnm.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = defpackage.cnm.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            o09 r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = defpackage.cnm.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = defpackage.cnm.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = defpackage.cnm.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r6 = r6 | r1
            int r2 = r2 << 20
            r6 = r6 | r2
            r6 = r6 | r3
            r9[r5] = r6
            int r1 = r10 + 2
            int r4 = r4 << 20
            r4 = r4 | r0
            r9[r1] = r4
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 << 1
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Laf:
            afb r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            afb r8 = r8.getEnumVerifier()
            r11[r10] = r8
            return
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 << 1
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Lc9:
            afb r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 << 1
            int r10 = r10 + 1
            afb r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.storeFieldData(b09, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(Object obj, int i, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i)), obj2);
        setFieldPresent(obj, i);
    }

    private void storeOneofMessageField(Object obj, int i, int i2, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i2)), obj2);
        setOneofPresent(obj, i, i2);
    }

    private boolean throwIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    private <K, V> void writeMapHelper(a85 a85Var, int i, Object obj, int i2) {
        if (obj != null) {
            a85Var.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, a85 a85Var) {
        if (obj instanceof String) {
            a85Var.writeString(i, (String) obj);
        } else {
            a85Var.writeBytes(i, (v44) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(bmm bmmVar, Object obj, a85 a85Var) {
        bmmVar.writeTo(bmmVar.getFromMessage(obj), a85Var);
    }

    @Override // defpackage.ani
    public boolean equals(Object obj, Object obj2) {
        qwd qwdVar;
        Object obj3;
        Object obj4;
        int length = this.buffer.length;
        int i = 0;
        while (i < length) {
            int iTypeAndOffsetAt = this.typeAndOffsetAt(i);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 50 || iType >= 69) {
                long jOffset = offset(iTypeAndOffsetAt);
                qwdVar = this;
                obj3 = obj;
                obj4 = obj2;
                if (!qwdVar.equalsAtPosition(obj3, obj4, i, iType, jOffset)) {
                    return false;
                }
            } else {
                qwdVar = this;
                obj3 = obj;
                obj4 = obj2;
            }
            i += 3;
            this = qwdVar;
            obj = obj3;
            obj2 = obj4;
        }
        qwd qwdVar2 = this;
        Object obj5 = obj;
        Object obj6 = obj2;
        int i2 = qwdVar2.oneofFieldPositionsStart;
        while (true) {
            int[] iArr = qwdVar2.intArray;
            if (i2 >= iArr.length) {
                if (!qwdVar2.unknownFieldSchema.getFromMessage(obj5).equals(qwdVar2.unknownFieldSchema.getFromMessage(obj6))) {
                    return false;
                }
                if (qwdVar2.hasExtensions) {
                    return qwdVar2.extensionSchema.getExtensions(obj5).equals(qwdVar2.extensionSchema.getExtensions(obj6));
                }
                return true;
            }
            int i3 = iArr[i2];
            if (!qwdVar2.isOneofCaseEqual(obj5, obj6, i3)) {
                return false;
            }
            if (!qwdVar2.isOneofPresent(obj5, 0, i3)) {
                long jOffset2 = offset(qwdVar2.typeAndOffsetAt(i3));
                if (!fni.safeEquals(cnm.getObject(obj5, jOffset2), cnm.getObject(obj6, jOffset2))) {
                    return false;
                }
            }
            i2++;
        }
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0553 A[PHI: r0 r1
      0x0553: PHI (r0v6 qwd) = 
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v30 qwd)
      (r0v36 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
      (r0v1 qwd)
     binds: [B:21:0x005a, B:247:0x0549, B:214:0x04a2, B:245:0x053f, B:241:0x052e, B:187:0x0415, B:164:0x032c, B:158:0x030e, B:152:0x02f0, B:146:0x02d2, B:140:0x02b4, B:134:0x0296, B:128:0x0278, B:122:0x025a, B:116:0x023c, B:110:0x021f, B:104:0x0202, B:98:0x01e5, B:92:0x01c8, B:85:0x01a6, B:80:0x0172, B:77:0x0166, B:74:0x0156, B:71:0x0146, B:68:0x0136, B:65:0x012a, B:62:0x011e, B:59:0x0111, B:52:0x00f1, B:49:0x00de, B:46:0x00cd, B:43:0x00be, B:40:0x00af, B:37:0x00a4, B:34:0x0099, B:31:0x008a, B:28:0x007b, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r1v2 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v3 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
     binds: [B:21:0x005a, B:247:0x0549, B:214:0x04a2, B:245:0x053f, B:241:0x052e, B:187:0x0415, B:164:0x032c, B:158:0x030e, B:152:0x02f0, B:146:0x02d2, B:140:0x02b4, B:134:0x0296, B:128:0x0278, B:122:0x025a, B:116:0x023c, B:110:0x021f, B:104:0x0202, B:98:0x01e5, B:92:0x01c8, B:85:0x01a6, B:80:0x0172, B:77:0x0166, B:74:0x0156, B:71:0x0146, B:68:0x0136, B:65:0x012a, B:62:0x011e, B:59:0x0111, B:52:0x00f1, B:49:0x00de, B:46:0x00cd, B:43:0x00be, B:40:0x00af, B:37:0x00a4, B:34:0x0099, B:31:0x008a, B:28:0x007b, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ani
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getSerializedSize(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.getSerializedSize(java.lang.Object):int");
    }

    @Override // defpackage.ani
    public int hashCode(Object obj) {
        int i;
        int iHashLong;
        int length = this.buffer.length;
        int iHashCode = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i2);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 50 || iType >= 69) {
                long jOffset = offset(iTypeAndOffsetAt);
                int iHashCode2 = 37;
                switch (iType) {
                    case 0:
                        i = iHashCode * 53;
                        iHashLong = ifb.hashLong(Double.doubleToLongBits(cnm.getDouble(obj, jOffset)));
                        iHashCode = i + iHashLong;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iHashLong = Float.floatToIntBits(cnm.getFloat(obj, jOffset));
                        iHashCode = i + iHashLong;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        iHashLong = ifb.hashLong(cnm.getLong(obj, jOffset));
                        iHashCode = i + iHashLong;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        iHashLong = ifb.hashLong(cnm.getLong(obj, jOffset));
                        iHashCode = i + iHashLong;
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iHashLong = cnm.getInt(obj, jOffset);
                        iHashCode = i + iHashLong;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        iHashLong = ifb.hashLong(cnm.getLong(obj, jOffset));
                        iHashCode = i + iHashLong;
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iHashLong = cnm.getInt(obj, jOffset);
                        iHashCode = i + iHashLong;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        iHashLong = ifb.hashBoolean(cnm.getBoolean(obj, jOffset));
                        iHashCode = i + iHashLong;
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iHashLong = ((String) cnm.getObject(obj, jOffset)).hashCode();
                        iHashCode = i + iHashLong;
                        break;
                    case 9:
                        Object object = cnm.getObject(obj, jOffset);
                        if (object != null) {
                            iHashCode2 = object.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iHashLong = cnm.getObject(obj, jOffset).hashCode();
                        iHashCode = i + iHashLong;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iHashLong = cnm.getInt(obj, jOffset);
                        iHashCode = i + iHashLong;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iHashLong = cnm.getInt(obj, jOffset);
                        iHashCode = i + iHashLong;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iHashLong = cnm.getInt(obj, jOffset);
                        iHashCode = i + iHashLong;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        iHashLong = ifb.hashLong(cnm.getLong(obj, jOffset));
                        iHashCode = i + iHashLong;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iHashLong = cnm.getInt(obj, jOffset);
                        iHashCode = i + iHashLong;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        iHashLong = ifb.hashLong(cnm.getLong(obj, jOffset));
                        iHashCode = i + iHashLong;
                        break;
                    case 17:
                        Object object2 = cnm.getObject(obj, jOffset);
                        if (object2 != null) {
                            iHashCode2 = object2.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i = iHashCode * 53;
                        iHashLong = cnm.getObject(obj, jOffset).hashCode();
                        iHashCode = i + iHashLong;
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iHashLong = cnm.getObject(obj, jOffset).hashCode();
                        iHashCode = i + iHashLong;
                        break;
                }
            }
        }
        int i3 = this.oneofFieldPositionsStart;
        while (true) {
            int[] iArr = this.intArray;
            if (i3 >= iArr.length) {
                int iHashCode3 = this.unknownFieldSchema.getFromMessage(obj).hashCode() + (iHashCode * 53);
                if (!this.hasExtensions) {
                    return iHashCode3;
                }
                return this.extensionSchema.getExtensions(obj).hashCode() + (iHashCode3 * 53);
            }
            int i4 = iArr[i3];
            if (!isOneofPresent(obj, 0, i4)) {
                iHashCode = cnm.getObject(obj, offset(typeAndOffsetAt(i4))).hashCode() + (iHashCode * 53);
            }
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    @Override // defpackage.ani
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r13.checkInitializedCount
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r13.intArray
            r9 = r5[r2]
            int r5 = r13.typeAndOffsetAt(r9)
            int[] r7 = r13.buffer
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L2e
            if (r8 == r0) goto L2b
            sun.misc.Unsafe r3 = defpackage.qwd.UNSAFE
            long r6 = (long) r8
            int r4 = r3.getInt(r14, r6)
        L2b:
            r11 = r4
            r10 = r8
            goto L30
        L2e:
            r10 = r3
            r11 = r4
        L30:
            boolean r3 = isRequired(r5)
            r7 = r13
            r8 = r14
            if (r3 == 0) goto L3f
            boolean r13 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r13 != 0) goto L3f
            return r1
        L3f:
            int r13 = type(r5)
            r14 = 9
            if (r13 == r14) goto L82
            r14 = 17
            if (r13 == r14) goto L82
            r14 = 27
            if (r13 == r14) goto L7b
            r14 = 60
            if (r13 == r14) goto L66
            r14 = 68
            if (r13 == r14) goto L66
            r14 = 49
            if (r13 == r14) goto L7b
            r14 = 50
            if (r13 != r14) goto L93
            boolean r13 = r7.isMapInitialized(r8, r5, r9)
            if (r13 != 0) goto L93
            return r1
        L66:
            int r13 = r7.numberAt(r9)
            boolean r13 = r7.isOneofPresent(r8, r13, r9)
            if (r13 == 0) goto L93
            ani r13 = r7.getMessageFieldSchema(r9)
            boolean r13 = isInitialized(r8, r5, r13)
            if (r13 != 0) goto L93
            return r1
        L7b:
            boolean r13 = r7.isListInitialized(r8, r5, r9)
            if (r13 != 0) goto L93
            return r1
        L82:
            boolean r13 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L93
            ani r13 = r7.getMessageFieldSchema(r9)
            boolean r13 = isInitialized(r8, r5, r13)
            if (r13 != 0) goto L93
            return r1
        L93:
            int r2 = r2 + 1
            r13 = r7
            r14 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r13
            r8 = r14
            boolean r13 = r7.hasExtensions
            if (r13 == 0) goto Lae
            bl8 r13 = r7.extensionSchema
            f09 r13 = r13.getExtensions(r8)
            boolean r13 = r13.isInitialized()
            if (r13 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // defpackage.ani
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void makeImmutable(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = isMutable(r8)
            if (r0 == 0) goto L8c
            boolean r0 = r8 instanceof defpackage.gv9
            if (r0 == 0) goto L16
            r0 = r8
            gv9 r0 = (defpackage.gv9) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L16:
            int[] r0 = r7.buffer
            int r0 = r0.length
            r1 = 0
        L1a:
            if (r1 >= r0) goto L7e
            int r2 = r7.typeAndOffsetAt(r1)
            long r3 = offset(r2)
            int r2 = type(r2)
            r5 = 9
            if (r2 == r5) goto L68
            r5 = 60
            if (r2 == r5) goto L50
            r5 = 68
            if (r2 == r5) goto L50
            switch(r2) {
                case 17: goto L68;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                case 32: goto L4a;
                case 33: goto L4a;
                case 34: goto L4a;
                case 35: goto L4a;
                case 36: goto L4a;
                case 37: goto L4a;
                case 38: goto L4a;
                case 39: goto L4a;
                case 40: goto L4a;
                case 41: goto L4a;
                case 42: goto L4a;
                case 43: goto L4a;
                case 44: goto L4a;
                case 45: goto L4a;
                case 46: goto L4a;
                case 47: goto L4a;
                case 48: goto L4a;
                case 49: goto L4a;
                case 50: goto L38;
                default: goto L37;
            }
        L37:
            goto L7b
        L38:
            sun.misc.Unsafe r2 = defpackage.qwd.UNSAFE
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7b
            had r6 = r7.mapFieldSchema
            java.lang.Object r5 = r6.toImmutable(r5)
            r2.putObject(r8, r3, r5)
            goto L7b
        L4a:
            hhc r2 = r7.listFieldSchema
            r2.makeImmutableListAt(r8, r3)
            goto L7b
        L50:
            int r2 = r7.numberAt(r1)
            boolean r2 = r7.isOneofPresent(r8, r2, r1)
            if (r2 == 0) goto L7b
            ani r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = defpackage.qwd.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
            goto L7b
        L68:
            boolean r2 = r7.isFieldPresent(r8, r1)
            if (r2 == 0) goto L7b
            ani r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = defpackage.qwd.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
        L7b:
            int r1 = r1 + 3
            goto L1a
        L7e:
            bmm r0 = r7.unknownFieldSchema
            r0.makeImmutable(r8)
            boolean r0 = r7.hasExtensions
            if (r0 == 0) goto L8c
            bl8 r7 = r7.extensionSchema
            r7.makeImmutable(r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.makeImmutable(java.lang.Object):void");
    }

    @Override // defpackage.ani
    public void mergeFrom(Object obj, Object obj2) {
        checkMutable(obj);
        ifb.checkNotNull(obj2);
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(obj, obj2, i);
        }
        fni.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            fni.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // defpackage.ani
    public void mergeFrom(Object obj, u75 u75Var, yk8 yk8Var) {
        ifb.checkNotNull(yk8Var);
        checkMutable(obj);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, u75Var, yk8Var);
    }

    @Override // defpackage.ani
    public void mergeFrom(Object obj, byte[] bArr, int i, int i2, g72.a aVar) {
        parseMessage(obj, bArr, i, i2, 0, aVar);
    }

    @Override // defpackage.ani
    public Object newInstance() {
        return this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x042d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int parseMessage(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, g72.a r32) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.parseMessage(java.lang.Object, byte[], int, int, int, g72$a):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    @Override // defpackage.ani
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeTo(java.lang.Object r19, defpackage.a85 r20) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.writeTo(java.lang.Object, a85):void");
    }
}
