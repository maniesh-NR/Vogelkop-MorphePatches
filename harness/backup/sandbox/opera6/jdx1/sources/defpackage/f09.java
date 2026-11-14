package defpackage;

import defpackage.j4o;
import defpackage.mgb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class f09 {
    private static final f09 DEFAULT_INSTANCE = new f09(true);
    private final vqj fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public static final class a {
        private vqj fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        private a() {
            this(new vqj());
        }

        public /* synthetic */ a(d09 d09Var) {
            this();
        }

        private a(vqj vqjVar) {
            this.fields = vqjVar;
            this.isMutable = true;
        }

        private f09 buildImpl(boolean z) {
            if (this.fields.isEmpty()) {
                return f09.emptySet();
            }
            this.isMutable = false;
            vqj vqjVarCloneAllFieldsMap = this.fields;
            if (this.hasNestedBuilders) {
                vqjVarCloneAllFieldsMap = f09.cloneAllFieldsMap(vqjVarCloneAllFieldsMap, false, false);
                replaceBuilders(vqjVarCloneAllFieldsMap, z);
            }
            f09 f09Var = new f09(vqjVarCloneAllFieldsMap, null);
            f09Var.hasLazyField = this.hasLazyField;
            return f09Var;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = f09.cloneAllFieldsMap(this.fields, true, false);
            this.isMutable = true;
        }

        public static <T extends e09> a fromFieldSet(f09 f09Var) {
            a aVar = new a(f09.cloneAllFieldsMap(f09Var.fields, true, false));
            aVar.hasLazyField = f09Var.hasLazyField;
            return aVar;
        }

        private void mergeFromField(Map.Entry<e09, Object> entry) {
            e09 key = entry.getKey();
            Object value = entry.getValue();
            boolean z = value instanceof mgb;
            if (key.isRepeated()) {
                if (z) {
                    qp2.n("Lazy fields can not be repeated");
                    return;
                }
                List arrayList = (List) getFieldAllowBuilders(key);
                List list = (List) value;
                int size = list.size();
                if (arrayList == null) {
                    arrayList = new ArrayList(size);
                    this.fields.put(key, (Object) arrayList);
                }
                for (int i = 0; i < size; i++) {
                    arrayList.add(f09.cloneIfMutable(list.get(i)));
                }
                return;
            }
            if (key.getLiteJavaType() != j4o.b.MESSAGE) {
                if (z) {
                    qp2.n("Lazy fields must be message-valued");
                    return;
                } else {
                    this.fields.put(key, f09.cloneIfMutable(value));
                    return;
                }
            }
            Object lazyField = getLazyField(key);
            if (lazyField == null) {
                lazyField = getFieldAllowBuilders(key);
            }
            if (lazyField == null) {
                this.fields.put(key, f09.cloneIfMutable(value));
                if (z) {
                    this.hasLazyField = true;
                    return;
                }
                return;
            }
            if (lazyField instanceof mgb) {
                if (z) {
                    this.fields.put(key, (Object) mgb.mergeFrom((mgb) lazyField, (mgb) value));
                    return;
                }
                lazyField = ((mgb) lazyField).getValue();
            }
            if (z) {
                value = ((mgb) value).getValue();
            }
            if (!key.internalMessageIsImmutable(lazyField)) {
                key.internalMergeFrom(lazyField, value);
                return;
            }
            qvd builder = ((rvd) lazyField).toBuilder();
            key.internalMergeFrom(builder, value);
            this.fields.put(key, (Object) builder.build());
        }

        private static Object replaceBuilder(Object obj, boolean z) {
            if (!(obj instanceof qvd)) {
                return obj;
            }
            qvd qvdVar = (qvd) obj;
            return z ? qvdVar.buildPartial() : qvdVar.build();
        }

        private static <T extends e09> Object replaceBuilders(T t, Object obj, boolean z) {
            if (obj == null || t.getLiteJavaType() != j4o.b.MESSAGE) {
                return obj;
            }
            if (!t.isRepeated()) {
                return replaceBuilder(obj, z);
            }
            if (!(obj instanceof List)) {
                j9h.u(obj.getClass(), "Repeated field should contains a List but actually contains type: ");
                return null;
            }
            List arrayList = (List) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj2 = arrayList.get(i);
                Object objReplaceBuilder = replaceBuilder(obj2, z);
                if (objReplaceBuilder != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i, objReplaceBuilder);
                }
            }
            return arrayList;
        }

        private static <T extends e09> void replaceBuilders(Map.Entry<T, Object> entry, boolean z) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z));
        }

        private static <T extends e09> void replaceBuilders(vqj vqjVar, boolean z) {
            int size = vqjVar.size();
            for (int i = 0; i < size; i++) {
                replaceBuilders(vqjVar.getArrayEntryAt(i), z);
            }
        }

        private void verifyType(e09 e09Var, Object obj) {
            if (f09.isValidType(e09Var.getLiteType(), obj)) {
                return;
            }
            if (e09Var.getLiteType().getJavaType() == j4o.b.MESSAGE && (obj instanceof qvd)) {
                return;
            }
            Locale locale = Locale.ROOT;
            int number = e09Var.getNumber();
            j4o.b javaType = e09Var.getLiteType().getJavaType();
            String name = obj.getClass().getName();
            StringBuilder sb = new StringBuilder("Wrong object type used with protocol message reflection.\nField number: ");
            sb.append(number);
            sb.append(", field java type: ");
            sb.append(javaType);
            sb.append(", value type: ");
            qp2.o(z1m.l(sb, name, "\n"));
        }

        public void addRepeatedField(e09 e09Var, Object obj) {
            List arrayList;
            ensureIsMutable();
            if (!e09Var.isRepeated()) {
                qp2.o("addRepeatedField() can only be called on repeated fields.");
                return;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof qvd);
            verifyType(e09Var, obj);
            Object fieldAllowBuilders = getFieldAllowBuilders(e09Var);
            if (fieldAllowBuilders == null) {
                arrayList = new ArrayList();
                this.fields.put(e09Var, (Object) arrayList);
            } else {
                arrayList = (List) fieldAllowBuilders;
            }
            arrayList.add(obj);
        }

        public f09 build() {
            return buildImpl(false);
        }

        public f09 buildPartial() {
            return buildImpl(true);
        }

        public void clearField(e09 e09Var) {
            ensureIsMutable();
            this.fields.remove(e09Var);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<e09, Object> getAllFields() {
            boolean z = this.hasLazyField;
            vqj vqjVar = this.fields;
            if (!z) {
                boolean zIsImmutable = vqjVar.isImmutable();
                vqj vqjVar2 = this.fields;
                return zIsImmutable ? vqjVar2 : Collections.unmodifiableMap(vqjVar2);
            }
            vqj vqjVarCloneAllFieldsMap = f09.cloneAllFieldsMap(vqjVar, false, true);
            if (this.fields.isImmutable()) {
                vqjVarCloneAllFieldsMap.makeImmutable();
                return vqjVarCloneAllFieldsMap;
            }
            replaceBuilders(vqjVarCloneAllFieldsMap, true);
            return vqjVarCloneAllFieldsMap;
        }

        public Object getField(e09 e09Var) {
            return replaceBuilders(e09Var, getFieldAllowBuilders(e09Var), true);
        }

        public Object getFieldAllowBuilders(e09 e09Var) {
            Object obj = this.fields.get(e09Var);
            return obj instanceof mgb ? ((mgb) obj).getValue() : obj;
        }

        public mgb getLazyField(e09 e09Var) {
            Object obj = this.fields.get(e09Var);
            if (obj instanceof mgb) {
                return (mgb) obj;
            }
            return null;
        }

        public Object getRepeatedField(e09 e09Var, int i) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(e09Var, i), true);
        }

        public Object getRepeatedFieldAllowBuilders(e09 e09Var, int i) {
            if (!e09Var.isRepeated()) {
                qp2.o("getRepeatedField() can only be called on repeated fields.");
                return null;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(e09Var);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i);
            }
            t3p.t();
            return null;
        }

        public int getRepeatedFieldCount(e09 e09Var) {
            if (!e09Var.isRepeated()) {
                qp2.o("getRepeatedFieldCount() can only be called on repeated fields.");
                return 0;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(e09Var);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }

        public boolean hasField(e09 e09Var) {
            if (!e09Var.isRepeated()) {
                return this.fields.get(e09Var) != null;
            }
            qp2.o("hasField() can only be called on non-repeated fields.");
            return false;
        }

        public boolean isInitialized() {
            int size = this.fields.size();
            for (int i = 0; i < size; i++) {
                if (!f09.isInitialized(this.fields.getArrayEntryAt(i))) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(f09 f09Var) {
            ensureIsMutable();
            int size = f09Var.fields.size();
            for (int i = 0; i < size; i++) {
                mergeFromField(f09Var.fields.getArrayEntryAt(i));
            }
        }

        public void setField(e09 e09Var, Object obj) {
            ensureIsMutable();
            if (!e09Var.isRepeated()) {
                verifyType(e09Var, obj);
            } else {
                if (!(obj instanceof List)) {
                    qp2.o("Wrong object type used with protocol message reflection.");
                    return;
                }
                ArrayList arrayList = new ArrayList((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = arrayList.get(i);
                    verifyType(e09Var, obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof qvd);
                }
                obj = arrayList;
            }
            if (obj instanceof mgb) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof qvd);
            this.fields.put(e09Var, obj);
        }

        public void setRepeatedField(e09 e09Var, int i, Object obj) {
            ensureIsMutable();
            if (!e09Var.isRepeated()) {
                qp2.o("getRepeatedField() can only be called on repeated fields.");
                return;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof qvd);
            Object fieldAllowBuilders = getFieldAllowBuilders(e09Var);
            if (fieldAllowBuilders == null) {
                t3p.t();
            } else {
                verifyType(e09Var, obj);
                ((List) fieldAllowBuilders).set(i, obj);
            }
        }
    }

    private f09() {
        this.fields = new vqj();
    }

    private f09(vqj vqjVar) {
        this.fields = vqjVar;
        makeImmutable();
    }

    public /* synthetic */ f09(vqj vqjVar, d09 d09Var) {
        this(vqjVar);
    }

    private f09(boolean z) {
        this(new vqj());
        makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends e09> vqj cloneAllFieldsMap(vqj vqjVar, boolean z, boolean z2) {
        int size = vqjVar.size();
        vqj vqjVar2 = new vqj(size);
        for (int i = 0; i < size; i++) {
            cloneFieldEntry(vqjVar2, vqjVar.getArrayEntryAt(i), z, z2);
        }
        return vqjVar2;
    }

    private static <T extends e09> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z, boolean z2) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof mgb)) {
            map.put(key, ((mgb) value).getValue());
        } else if (z && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int computeElementSize(j4o.a aVar, int i, Object obj) {
        int iComputeTagSize = y75.computeTagSize(i);
        if (aVar == j4o.a.GROUP) {
            iComputeTagSize <<= 1;
        }
        return computeElementSizeNoTag(aVar, obj) + iComputeTagSize;
    }

    public static int computeElementSizeNoTag(j4o.a aVar, Object obj) {
        switch (d09.$SwitchMap$com$google$protobuf$WireFormat$FieldType[aVar.ordinal()]) {
            case 1:
                return y75.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return y75.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return y75.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return y75.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return y75.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return y75.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return y75.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return y75.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return ((rvd) obj).getSerializedSize();
            case 10:
                return obj instanceof mgb ? ((mgb) obj).computeSizeNoTag() : y75.computeMessageSizeNoTag((rvd) obj);
            case 11:
                return obj instanceof v44 ? y75.computeBytesSizeNoTag((v44) obj) : y75.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof v44 ? y75.computeBytesSizeNoTag((v44) obj) : y75.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return y75.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return y75.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return y75.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return y75.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return y75.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof xeb ? y75.computeEnumSizeNoTag(((xeb) obj).getNumber()) : y75.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                h9o.r("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int computeFieldSize(e09 e09Var, Object obj) {
        j4o.a liteType = e09Var.getLiteType();
        int number = e09Var.getNumber();
        if (!e09Var.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!e09Var.isPacked()) {
            int iComputeElementSize = 0;
            while (i < size) {
                iComputeElementSize += computeElementSize(liteType, number, list.get(i));
                i++;
            }
            return iComputeElementSize;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iComputeElementSizeNoTag = 0;
        while (i < size) {
            iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, list.get(i));
            i++;
        }
        return y75.computeUInt32SizeNoTag(iComputeElementSizeNoTag) + y75.computeTagSize(number) + iComputeElementSizeNoTag;
    }

    public static <T extends e09> f09 emptySet() {
        return DEFAULT_INSTANCE;
    }

    private static boolean equals(vqj vqjVar, vqj vqjVar2) {
        if (vqjVar.size() != vqjVar2.size() || !vqjVar.keySet().equals(vqjVar2.keySet())) {
            return false;
        }
        for (Map.Entry<e09, Object> entry : vqjVar.entrySet()) {
            if (!equalsValues(entry.getValue(), vqjVar2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static boolean equalsValues(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (!(obj instanceof mgb) && (obj2 instanceof mgb)) {
            return obj2.equals(obj);
        }
        return obj.equals(obj2);
    }

    private int getMessageSetSerializedSize(Map.Entry<e09, Object> entry) {
        e09 key = entry.getKey();
        Object value = entry.getValue();
        return (key.getLiteJavaType() != j4o.b.MESSAGE || key.isRepeated() || key.isPacked()) ? computeFieldSize(key, value) : value instanceof mgb ? ((mgb) value).computeMessageSetExtensionSize(entry.getKey().getNumber()) : y75.computeMessageSetExtensionSize(entry.getKey().getNumber(), (rvd) value);
    }

    public static int getWireFormatForFieldType(j4o.a aVar, boolean z) {
        if (z) {
            return 2;
        }
        return aVar.getWireType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends e09> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != j4o.b.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return isMessageFieldValueInitialized(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!isMessageFieldValueInitialized(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof svd) {
            return ((svd) obj).isInitialized();
        }
        if (obj instanceof mgb) {
            return true;
        }
        qp2.o("Wrong object type used with protocol message reflection.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(j4o.a aVar, Object obj) {
        ifb.checkNotNull(obj);
        switch (d09.$SwitchMap$com$google$protobuf$WireFormat$JavaType[aVar.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof v44) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof xeb)) {
                }
                break;
            case 9:
                if ((obj instanceof rvd) || (obj instanceof mgb)) {
                }
                break;
        }
        return false;
    }

    private void mergeFromField(Map.Entry<e09, Object> entry) {
        e09 key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof mgb;
        if (key.isRepeated()) {
            if (z) {
                qp2.n("Lazy fields can not be repeated");
                return;
            }
            Object field = getField(key);
            List list = (List) value;
            int size = list.size();
            if (field == null) {
                field = new ArrayList(size);
            }
            List list2 = (List) field;
            for (int i = 0; i < size; i++) {
                list2.add(cloneIfMutable(list.get(i)));
            }
            this.fields.put(key, field);
            return;
        }
        if (key.getLiteJavaType() != j4o.b.MESSAGE) {
            if (z) {
                qp2.n("Lazy fields must be message-valued");
                return;
            } else {
                this.fields.put(key, cloneIfMutable(value));
                return;
            }
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put(key, cloneIfMutable(value));
            if (z) {
                this.hasLazyField = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((mgb) value).getValue();
        }
        if (!key.internalMessageIsImmutable(field2)) {
            key.internalMergeFrom(field2, value);
            return;
        }
        qvd builder = ((rvd) field2).toBuilder();
        key.internalMergeFrom(builder, value);
        this.fields.put(key, (Object) builder.build());
    }

    public static <T extends e09> a newBuilder() {
        return new a((d09) null);
    }

    public static <T extends e09> f09 newFieldSet() {
        return new f09();
    }

    public static Object readPrimitiveField(r75 r75Var, j4o.a aVar, boolean z) {
        return z ? r75Var.readPrimitiveField(aVar, j4o.c.STRICT) : r75Var.readPrimitiveField(aVar, j4o.c.LOOSE);
    }

    private void verifyType(e09 e09Var, Object obj) {
        if (isValidType(e09Var.getLiteType(), obj)) {
            return;
        }
        yt7.j("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(e09Var.getNumber()), e09Var.getLiteType().getJavaType(), obj.getClass().getName()});
    }

    public static void writeElement(y75 y75Var, j4o.a aVar, int i, Object obj) {
        if (aVar == j4o.a.GROUP) {
            y75Var.writeGroup(i, (rvd) obj);
        } else {
            y75Var.writeTag(i, getWireFormatForFieldType(aVar, false));
            writeElementNoTag(y75Var, aVar, obj);
        }
    }

    public static void writeElementNoTag(y75 y75Var, j4o.a aVar, Object obj) {
        switch (d09.$SwitchMap$com$google$protobuf$WireFormat$FieldType[aVar.ordinal()]) {
            case 1:
                y75Var.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                y75Var.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                y75Var.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                y75Var.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                y75Var.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                y75Var.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                y75Var.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                y75Var.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                y75Var.writeGroupNoTag((rvd) obj);
                break;
            case 10:
                y75Var.writeMessageNoTag((rvd) obj);
                break;
            case 11:
                if (!(obj instanceof v44)) {
                    y75Var.writeStringNoTag((String) obj);
                    break;
                } else {
                    y75Var.writeBytesNoTag((v44) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof v44)) {
                    y75Var.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    y75Var.writeBytesNoTag((v44) obj);
                    break;
                }
            case 13:
                y75Var.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                y75Var.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                y75Var.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                y75Var.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                y75Var.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof xeb)) {
                    y75Var.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    y75Var.writeEnumNoTag(((xeb) obj).getNumber());
                    break;
                }
        }
    }

    public static void writeField(e09 e09Var, Object obj, y75 y75Var) {
        j4o.a liteType = e09Var.getLiteType();
        int number = e09Var.getNumber();
        if (!e09Var.isRepeated()) {
            if (obj instanceof mgb) {
                writeElement(y75Var, liteType, number, ((mgb) obj).getValue());
                return;
            } else {
                writeElement(y75Var, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!e09Var.isPacked()) {
            while (i < size) {
                writeElement(y75Var, liteType, number, list.get(i));
                i++;
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            y75Var.writeTag(number, 2);
            int iComputeElementSizeNoTag = 0;
            for (int i2 = 0; i2 < size; i2++) {
                iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, list.get(i2));
            }
            y75Var.writeUInt32NoTag(iComputeElementSizeNoTag);
            while (i < size) {
                writeElementNoTag(y75Var, liteType, list.get(i));
                i++;
            }
        }
    }

    private void writeMessageSetTo(Map.Entry<e09, Object> entry, y75 y75Var) {
        e09 key = entry.getKey();
        if (key.getLiteJavaType() != j4o.b.MESSAGE || key.isRepeated() || key.isPacked()) {
            writeField(key, entry.getValue(), y75Var);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof mgb)) {
            y75Var.writeMessageSetExtension(entry.getKey().getNumber(), (rvd) value);
        } else {
            y75Var.writeRawMessageSetExtension(entry.getKey().getNumber(), ((mgb) value).toByteString());
        }
    }

    public void addRepeatedField(e09 e09Var, Object obj) {
        List arrayList;
        if (!e09Var.isRepeated()) {
            qp2.o("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        verifyType(e09Var, obj);
        Object field = getField(e09Var);
        if (field == null) {
            arrayList = new ArrayList();
            this.fields.put(e09Var, (Object) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(e09 e09Var) {
        this.fields.remove(e09Var);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f09 m13clone() {
        f09 f09VarNewFieldSet = newFieldSet();
        int size = this.fields.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<e09, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            f09VarNewFieldSet.setField(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        f09VarNewFieldSet.hasLazyField = this.hasLazyField;
        return f09VarNewFieldSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f09) {
            return equals(this.fields, ((f09) obj).fields);
        }
        return false;
    }

    public Map<e09, Object> getAllFields() {
        boolean z = this.hasLazyField;
        vqj vqjVar = this.fields;
        if (!z) {
            boolean zIsImmutable = vqjVar.isImmutable();
            vqj vqjVar2 = this.fields;
            return zIsImmutable ? vqjVar2 : Collections.unmodifiableMap(vqjVar2);
        }
        vqj vqjVarCloneAllFieldsMap = cloneAllFieldsMap(vqjVar, false, true);
        if (this.fields.isImmutable()) {
            vqjVarCloneAllFieldsMap.makeImmutable();
        }
        return vqjVarCloneAllFieldsMap;
    }

    public Object getField(e09 e09Var) {
        Object obj = this.fields.get(e09Var);
        return obj instanceof mgb ? ((mgb) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        int size = this.fields.size();
        int messageSetSerializedSize = 0;
        for (int i = 0; i < size; i++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i));
        }
        return messageSetSerializedSize;
    }

    public Object getRepeatedField(e09 e09Var, int i) {
        if (!e09Var.isRepeated()) {
            qp2.o("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object field = getField(e09Var);
        if (field != null) {
            return ((List) field).get(i);
        }
        t3p.t();
        return null;
    }

    public int getRepeatedFieldCount(e09 e09Var) {
        if (!e09Var.isRepeated()) {
            qp2.o("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object field = getField(e09Var);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        int size = this.fields.size();
        int iComputeFieldSize = 0;
        for (int i = 0; i < size; i++) {
            Map.Entry<e09, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(e09 e09Var) {
        if (!e09Var.isRepeated()) {
            return this.fields.get(e09Var) != null;
        }
        qp2.o("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        int size = this.fields.size();
        for (int i = 0; i < size; i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<e09, Object>> iterator() {
        if (isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.hasLazyField;
        vqj vqjVar = this.fields;
        return z ? new mgb.b(vqjVar.entrySet().iterator()) : vqjVar.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        int size = this.fields.size();
        int i = 0;
        while (true) {
            vqj vqjVar = this.fields;
            if (i >= size) {
                vqjVar.makeImmutable();
                this.isImmutable = true;
                return;
            } else {
                Object value = vqjVar.getArrayEntryAt(i).getValue();
                if (value instanceof gv9) {
                    ((gv9) value).makeImmutable();
                }
                i++;
            }
        }
    }

    public void mergeFrom(f09 f09Var) {
        int size = f09Var.fields.size();
        for (int i = 0; i < size; i++) {
            mergeFromField(f09Var.fields.getArrayEntryAt(i));
        }
    }

    public void setField(e09 e09Var, Object obj) {
        if (!e09Var.isRepeated()) {
            verifyType(e09Var, obj);
        } else {
            if (!(obj instanceof List)) {
                qp2.o("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                verifyType(e09Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof mgb) {
            this.hasLazyField = true;
        }
        this.fields.put(e09Var, obj);
    }

    public void setRepeatedField(e09 e09Var, int i, Object obj) {
        if (!e09Var.isRepeated()) {
            qp2.o("getRepeatedField() can only be called on repeated fields.");
            return;
        }
        Object field = getField(e09Var);
        if (field == null) {
            t3p.t();
        } else {
            verifyType(e09Var, obj);
            ((List) field).set(i, obj);
        }
    }

    public void writeMessageSetTo(y75 y75Var) {
        int size = this.fields.size();
        for (int i = 0; i < size; i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), y75Var);
        }
    }

    public void writeTo(y75 y75Var) {
        int size = this.fields.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<e09, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField(arrayEntryAt.getKey(), arrayEntryAt.getValue(), y75Var);
        }
    }
}
