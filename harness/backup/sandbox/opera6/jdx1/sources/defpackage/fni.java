package defpackage;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class fni {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final bmm UNKNOWN_FIELD_SET_LITE_SCHEMA = new gmm();

    private fni() {
    }

    @Deprecated
    public static int computeGroupSize(int i, rvd rvdVar, ani aniVar) {
        return computeGroupSizeNoTag(rvdVar, aniVar) + (y75.computeTagSize(i) << 1);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(rvd rvdVar, ani aniVar) {
        return ((w5) rvdVar).getSerializedSize(aniVar);
    }

    public static int computeMessageSize(int i, w5 w5Var, ani aniVar) {
        return computeMessageSizeNoTag(w5Var, aniVar) + y75.computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(w5 w5Var, ani aniVar) {
        return y75.computeLengthDelimitedFieldSize(w5Var.getSerializedSize(aniVar));
    }

    public static int computeSizeBoolList(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return y75.computeBoolSize(i, true) * size;
        }
        return y75.computeLengthDelimitedFieldSize(size) + y75.computeTagSize(i);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i, List<v44> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = y75.computeTagSize(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iComputeTagSize += y75.computeBytesSizeNoTag(list.get(i2));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (!z) {
            return (y75.computeTagSize(i) * size) + iComputeSizeEnumListNoTag;
        }
        return y75.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) + y75.computeTagSize(i);
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nbb)) {
            int iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += y75.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
            return iComputeEnumSizeNoTag;
        }
        nbb nbbVar = (nbb) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i < size) {
            iComputeEnumSizeNoTag2 += y75.computeEnumSizeNoTag(nbbVar.getInt(i));
            i++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int computeSizeFixed32List(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return y75.computeFixed32Size(i, 0) * size;
        }
        return y75.computeLengthDelimitedFieldSize(size << 2) + y75.computeTagSize(i);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() << 2;
    }

    public static int computeSizeFixed64List(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return y75.computeFixed64Size(i, 0L) * size;
        }
        return y75.computeLengthDelimitedFieldSize(size << 3) + y75.computeTagSize(i);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() << 3;
    }

    public static int computeSizeGroupList(int i, List<rvd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iComputeGroupSize += y75.computeGroupSize(i, list.get(i2));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeGroupList(int i, List<rvd> list, ani aniVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iComputeGroupSize += computeGroupSize(i, list.get(i2), aniVar);
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (!z) {
            return (y75.computeTagSize(i) * size) + iComputeSizeInt32ListNoTag;
        }
        return y75.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) + y75.computeTagSize(i);
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nbb)) {
            int iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += y75.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return iComputeInt32SizeNoTag;
        }
        nbb nbbVar = (nbb) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeInt32SizeNoTag2 += y75.computeInt32SizeNoTag(nbbVar.getInt(i));
            i++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int computeSizeInt64List(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z) {
            return y75.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) + y75.computeTagSize(i);
        }
        return (y75.computeTagSize(i) * list.size()) + iComputeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m0d)) {
            int iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += y75.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return iComputeInt64SizeNoTag;
        }
        m0d m0dVar = (m0d) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeInt64SizeNoTag2 += y75.computeInt64SizeNoTag(m0dVar.getLong(i));
            i++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int computeSizeMessage(int i, Object obj, ani aniVar) {
        return obj instanceof t4c ? ((t4c) obj).computeSize(i) : computeMessageSize(i, (w5) obj, aniVar);
    }

    public static int computeSizeMessageList(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = y75.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iComputeTagSize = (obj instanceof t4c ? ((t4c) obj).computeSizeNoTag() : y75.computeMessageSizeNoTag((rvd) obj)) + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static int computeSizeMessageList(int i, List<?> list, ani aniVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = y75.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iComputeTagSize = (obj instanceof t4c ? ((t4c) obj).computeSizeNoTag() : computeMessageSizeNoTag((w5) obj, aniVar)) + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static int computeSizeSInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (!z) {
            return (y75.computeTagSize(i) * size) + iComputeSizeSInt32ListNoTag;
        }
        return y75.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) + y75.computeTagSize(i);
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nbb)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += y75.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return iComputeSInt32SizeNoTag;
        }
        nbb nbbVar = (nbb) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeSInt32SizeNoTag2 += y75.computeSInt32SizeNoTag(nbbVar.getInt(i));
            i++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int computeSizeSInt64List(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (!z) {
            return (y75.computeTagSize(i) * size) + iComputeSizeSInt64ListNoTag;
        }
        return y75.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) + y75.computeTagSize(i);
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m0d)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += y75.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return iComputeSInt64SizeNoTag;
        }
        m0d m0dVar = (m0d) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeSInt64SizeNoTag2 += y75.computeSInt64SizeNoTag(m0dVar.getLong(i));
            i++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int computeSizeStringList(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = y75.computeTagSize(i) * size;
        if (!(list instanceof d7c)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iComputeTagSize = (obj instanceof v44 ? y75.computeBytesSizeNoTag((v44) obj) : y75.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                i2++;
            }
            return iComputeTagSize;
        }
        d7c d7cVar = (d7c) list;
        while (i2 < size) {
            Object objK = d7cVar.k();
            iComputeTagSize = (objK instanceof v44 ? y75.computeBytesSizeNoTag((v44) objK) : y75.computeStringSizeNoTag((String) objK)) + iComputeTagSize;
            i2++;
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (!z) {
            return (y75.computeTagSize(i) * size) + iComputeSizeUInt32ListNoTag;
        }
        return y75.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) + y75.computeTagSize(i);
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nbb)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += y75.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return iComputeUInt32SizeNoTag;
        }
        nbb nbbVar = (nbb) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeUInt32SizeNoTag2 += y75.computeUInt32SizeNoTag(nbbVar.getInt(i));
            i++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int computeSizeUInt64List(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (!z) {
            return (y75.computeTagSize(i) * size) + iComputeSizeUInt64ListNoTag;
        }
        return y75.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) + y75.computeTagSize(i);
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m0d)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += y75.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return iComputeUInt64SizeNoTag;
        }
        m0d m0dVar = (m0d) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeUInt64SizeNoTag2 += y75.computeUInt64SizeNoTag(m0dVar.getLong(i));
            i++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, afb afbVar, UB ub, bmm bmmVar) {
        if (afbVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!afbVar.isInRange(iIntValue)) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, bmmVar);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (afbVar.isInRange(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, bmmVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, zeb zebVar, UB ub, bmm bmmVar) {
        if (zebVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (zebVar.findValueByNumber(iIntValue) == null) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, bmmVar);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (zebVar.findValueByNumber(iIntValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, bmmVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    private static Class<?> getGeneratedMessageClass() {
        if (m21.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return cnm.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            rqd.p(th);
            return null;
        }
    }

    public static <T, FT extends e09> void mergeExtensions(bl8 bl8Var, T t, T t2) {
        f09 extensions = bl8Var.getExtensions(t2);
        if (extensions.isEmpty()) {
            return;
        }
        bl8Var.getMutableExtensions(t).mergeFrom(extensions);
    }

    public static <T> void mergeMap(had hadVar, T t, T t2, long j) {
        cnm.putObject(t, j, hadVar.mergeFrom(cnm.getObject(t, j), cnm.getObject(t2, j)));
    }

    public static <T, UT, UB> void mergeUnknownFields(bmm bmmVar, T t, T t2) {
        bmmVar.setToMessage(t, bmmVar.merge(bmmVar.getFromMessage(t), bmmVar.getFromMessage(t2)));
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (gv9.class.isAssignableFrom(cls) || m21.assumeLiteRuntime || (cls2 = GENERATED_MESSAGE_CLASS) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        qp2.o("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = i2 - i;
        long j2 = i3;
        return j + 10 <= ((j2 + 3) * 3) + ((j2 << 1) + 3);
    }

    public static boolean shouldUseTableSwitch(b09[] b09VarArr) {
        if (b09VarArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(b09VarArr[0].getFieldNumber(), b09VarArr[b09VarArr.length - 1].getFieldNumber(), b09VarArr.length);
    }

    public static <UT, UB> UB storeUnknownEnum(Object obj, int i, int i2, UB ub, bmm bmmVar) {
        if (ub == null) {
            ub = (UB) bmmVar.getBuilderFromMessage(obj);
        }
        bmmVar.addVarint(ub, i, i2);
        return ub;
    }

    public static String toCamelCase(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    z = true;
                } else if (i != 0 || z) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (z) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            z = false;
        }
        return sb.toString();
    }

    public static bmm unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i, boolean z, a85 a85Var) {
        if (z) {
            a85Var.writeBool(i, true);
        }
    }

    public static void writeBoolList(int i, List<Boolean> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeBoolList(i, list, z);
    }

    public static void writeBytes(int i, v44 v44Var, a85 a85Var) {
        if (v44Var == null || v44Var.isEmpty()) {
            return;
        }
        a85Var.writeBytes(i, v44Var);
    }

    public static void writeBytesList(int i, List<v44> list, a85 a85Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeBytesList(i, list);
    }

    public static void writeDouble(int i, double d, a85 a85Var) {
        if (Double.doubleToRawLongBits(d) != 0) {
            a85Var.writeDouble(i, d);
        }
    }

    public static void writeDoubleList(int i, List<Double> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeDoubleList(i, list, z);
    }

    public static void writeEnum(int i, int i2, a85 a85Var) {
        if (i2 != 0) {
            a85Var.writeEnum(i, i2);
        }
    }

    public static void writeEnumList(int i, List<Integer> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeEnumList(i, list, z);
    }

    public static void writeFixed32(int i, int i2, a85 a85Var) {
        if (i2 != 0) {
            a85Var.writeFixed32(i, i2);
        }
    }

    public static void writeFixed32List(int i, List<Integer> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeFixed32List(i, list, z);
    }

    public static void writeFixed64(int i, long j, a85 a85Var) {
        if (j != 0) {
            a85Var.writeFixed64(i, j);
        }
    }

    public static void writeFixed64List(int i, List<Long> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeFixed64List(i, list, z);
    }

    public static void writeFloat(int i, float f, a85 a85Var) {
        if (Float.floatToRawIntBits(f) != 0) {
            a85Var.writeFloat(i, f);
        }
    }

    public static void writeFloatList(int i, List<Float> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeFloatList(i, list, z);
    }

    public static void writeGroupList(int i, List<?> list, a85 a85Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeGroupList(i, list);
    }

    public static void writeGroupList(int i, List<?> list, a85 a85Var, ani aniVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeGroupList(i, list, aniVar);
    }

    public static void writeInt32(int i, int i2, a85 a85Var) {
        if (i2 != 0) {
            a85Var.writeInt32(i, i2);
        }
    }

    public static void writeInt32List(int i, List<Integer> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeInt32List(i, list, z);
    }

    public static void writeInt64(int i, long j, a85 a85Var) {
        if (j != 0) {
            a85Var.writeInt64(i, j);
        }
    }

    public static void writeInt64List(int i, List<Long> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeInt64List(i, list, z);
    }

    public static void writeLazyFieldList(int i, List<?> list, a85 a85Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((t4c) it.next()).writeTo(a85Var, i);
        }
    }

    public static void writeMessage(int i, Object obj, a85 a85Var) {
        if (obj != null) {
            a85Var.writeMessage(i, obj);
        }
    }

    public static void writeMessageList(int i, List<?> list, a85 a85Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeMessageList(i, list);
    }

    public static void writeMessageList(int i, List<?> list, a85 a85Var, ani aniVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeMessageList(i, list, aniVar);
    }

    public static void writeSFixed32(int i, int i2, a85 a85Var) {
        if (i2 != 0) {
            a85Var.writeSFixed32(i, i2);
        }
    }

    public static void writeSFixed32List(int i, List<Integer> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeSFixed32List(i, list, z);
    }

    public static void writeSFixed64(int i, long j, a85 a85Var) {
        if (j != 0) {
            a85Var.writeSFixed64(i, j);
        }
    }

    public static void writeSFixed64List(int i, List<Long> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeSFixed64List(i, list, z);
    }

    public static void writeSInt32(int i, int i2, a85 a85Var) {
        if (i2 != 0) {
            a85Var.writeSInt32(i, i2);
        }
    }

    public static void writeSInt32List(int i, List<Integer> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeSInt32List(i, list, z);
    }

    public static void writeSInt64(int i, long j, a85 a85Var) {
        if (j != 0) {
            a85Var.writeSInt64(i, j);
        }
    }

    public static void writeSInt64List(int i, List<Long> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeSInt64List(i, list, z);
    }

    public static void writeString(int i, Object obj, a85 a85Var) {
        if (obj instanceof String) {
            writeStringInternal(i, (String) obj, a85Var);
        } else {
            writeBytes(i, (v44) obj, a85Var);
        }
    }

    private static void writeStringInternal(int i, String str, a85 a85Var) {
        if (str == null || str.isEmpty()) {
            return;
        }
        a85Var.writeString(i, str);
    }

    public static void writeStringList(int i, List<String> list, a85 a85Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeStringList(i, list);
    }

    public static void writeUInt32(int i, int i2, a85 a85Var) {
        if (i2 != 0) {
            a85Var.writeUInt32(i, i2);
        }
    }

    public static void writeUInt32List(int i, List<Integer> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeUInt32List(i, list, z);
    }

    public static void writeUInt64(int i, long j, a85 a85Var) {
        if (j != 0) {
            a85Var.writeUInt64(i, j);
        }
    }

    public static void writeUInt64List(int i, List<Long> list, a85 a85Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a85Var.writeUInt64List(i, list, z);
    }
}
