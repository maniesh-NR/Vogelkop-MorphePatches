package defpackage;

import defpackage.j4o;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes.dex */
public class aad {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final Object key;
    private final a metadata;
    private final Object value;

    public static class a {
        public final Object defaultKey;
        public final Object defaultValue;
        public final j4o.a keyType;
        public final j4o.a valueType;

        public a(j4o.a aVar, Object obj, j4o.a aVar2, Object obj2) {
            this.keyType = aVar;
            this.defaultKey = obj;
            this.valueType = aVar2;
            this.defaultValue = obj2;
        }
    }

    private aad(a aVar, Object obj, Object obj2) {
        this.metadata = aVar;
        this.key = obj;
        this.value = obj2;
    }

    private aad(j4o.a aVar, Object obj, j4o.a aVar2, Object obj2) {
        this.metadata = new a(aVar, obj, aVar2, obj2);
        this.key = obj;
        this.value = obj2;
    }

    public static <K, V> int computeSerializedSize(a aVar, K k, V v) {
        return f09.computeElementSize(aVar.valueType, 2, v) + f09.computeElementSize(aVar.keyType, 1, k);
    }

    public static <K, V> aad newDefaultInstance(j4o.a aVar, K k, j4o.a aVar2, V v) {
        return new aad(aVar, k, aVar2, v);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(r75 r75Var, a aVar, yk8 yk8Var) {
        Object field = aVar.defaultKey;
        Object field2 = aVar.defaultValue;
        while (true) {
            int tag = r75Var.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == j4o.makeTag(1, aVar.keyType.getWireType())) {
                field = parseField(r75Var, yk8Var, aVar.keyType, field);
            } else if (tag == j4o.makeTag(2, aVar.valueType.getWireType())) {
                field2 = parseField(r75Var, yk8Var, aVar.valueType, field2);
            } else if (!r75Var.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    public static <T> T parseField(r75 r75Var, yk8 yk8Var, j4o.a aVar, T t) {
        int i = z9d.$SwitchMap$com$google$protobuf$WireFormat$FieldType[aVar.ordinal()];
        if (i == 1) {
            qvd builder = ((rvd) t).toBuilder();
            r75Var.readMessage(builder, yk8Var);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(r75Var.readEnum());
        }
        if (i != 3) {
            return (T) f09.readPrimitiveField(r75Var, aVar, true);
        }
        h9o.r("Groups are not allowed in maps.");
        return null;
    }

    public static <K, V> void writeTo(y75 y75Var, a aVar, K k, V v) {
        f09.writeElement(y75Var, aVar.keyType, 1, k);
        f09.writeElement(y75Var, aVar.valueType, 2, v);
    }

    public int computeMessageSize(int i, Object obj, Object obj2) {
        return y75.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, obj, obj2)) + y75.computeTagSize(i);
    }

    public Object getKey() {
        return this.key;
    }

    public a getMetadata() {
        return this.metadata;
    }

    public Object getValue() {
        return this.value;
    }

    public Map.Entry<Object, Object> parseEntry(v44 v44Var, yk8 yk8Var) {
        return parseEntry(v44Var.newCodedInput(), this.metadata, yk8Var);
    }

    public void parseInto(fad fadVar, r75 r75Var, yk8 yk8Var) {
        int iPushLimit = r75Var.pushLimit(r75Var.readRawVarint32());
        a aVar = this.metadata;
        Object field = aVar.defaultKey;
        Object field2 = aVar.defaultValue;
        while (true) {
            int tag = r75Var.readTag();
            if (tag == 0) {
                break;
            }
            int iMakeTag = j4o.makeTag(1, this.metadata.keyType.getWireType());
            a aVar2 = this.metadata;
            if (tag == iMakeTag) {
                field = parseField(r75Var, yk8Var, aVar2.keyType, field);
            } else if (tag == j4o.makeTag(2, aVar2.valueType.getWireType())) {
                field2 = parseField(r75Var, yk8Var, this.metadata.valueType, field2);
            } else if (!r75Var.skipField(tag)) {
                break;
            }
        }
        r75Var.checkLastTagWas(0);
        r75Var.popLimit(iPushLimit);
        fadVar.put(field, field2);
    }

    public void serializeTo(y75 y75Var, int i, Object obj, Object obj2) {
        y75Var.writeTag(i, 2);
        y75Var.writeUInt32NoTag(computeSerializedSize(this.metadata, obj, obj2));
        writeTo(y75Var, this.metadata, obj, obj2);
    }
}
