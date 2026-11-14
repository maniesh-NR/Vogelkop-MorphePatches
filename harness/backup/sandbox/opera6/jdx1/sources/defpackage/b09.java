package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b09 implements Comparable {
    private final Field cachedSizeField;
    private final boolean enforceUtf8;
    private final afb enumVerifier;
    private final Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final pff oneof;
    private final Class<?> oneofStoredType;
    private final Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final o09 type;

    public static final class a {
        private Field cachedSizeField;
        private boolean enforceUtf8;
        private afb enumVerifier;
        private Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private pff oneof;
        private Class<?> oneofStoredType;
        private Field presenceField;
        private int presenceMask;
        private boolean required;
        private o09 type;

        private a() {
        }

        public /* synthetic */ a(a09 a09Var) {
            this();
        }

        public b09 build() {
            pff pffVar = this.oneof;
            if (pffVar != null) {
                return b09.forOneofMemberField(this.fieldNumber, this.type, pffVar, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return b09.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            Field field = this.presenceField;
            if (field != null) {
                boolean z = this.required;
                Field field2 = this.field;
                return z ? b09.forLegacyRequiredField(field2, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : b09.forExplicitPresenceField(field2, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            afb afbVar = this.enumVerifier;
            Field field3 = this.cachedSizeField;
            if (afbVar != null) {
                Field field4 = this.field;
                return field3 == null ? b09.forFieldWithEnumVerifier(field4, this.fieldNumber, this.type, afbVar) : b09.forPackedFieldWithEnumVerifier(field4, this.fieldNumber, this.type, afbVar, field3);
            }
            Field field5 = this.field;
            return field3 == null ? b09.forField(field5, this.fieldNumber, this.type, this.enforceUtf8) : b09.forPackedField(field5, this.fieldNumber, this.type, field3);
        }

        public a withCachedSizeField(Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public a withEnforceUtf8(boolean z) {
            this.enforceUtf8 = z;
            return this;
        }

        public a withEnumVerifier(afb afbVar) {
            this.enumVerifier = afbVar;
            return this;
        }

        public a withField(Field field) {
            if (this.oneof == null) {
                this.field = field;
                return this;
            }
            qp2.n("Cannot set field when building a oneof.");
            return null;
        }

        public a withFieldNumber(int i) {
            this.fieldNumber = i;
            return this;
        }

        public a withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public a withOneof(pff pffVar, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                qp2.n("Cannot set oneof when field or presenceField have been provided");
                return null;
            }
            this.oneof = pffVar;
            this.oneofStoredType = cls;
            return this;
        }

        public a withPresence(Field field, int i) {
            this.presenceField = (Field) ifb.checkNotNull(field, "presenceField");
            this.presenceMask = i;
            return this;
        }

        public a withRequired(boolean z) {
            this.required = z;
            return this;
        }

        public a withType(o09 o09Var) {
            this.type = o09Var;
            return this;
        }
    }

    private b09(Field field, int i, o09 o09Var, Class<?> cls, Field field2, int i2, boolean z, boolean z2, pff pffVar, Class<?> cls2, Object obj, afb afbVar, Field field3) {
        this.field = field;
        this.type = o09Var;
        this.messageClass = cls;
        this.fieldNumber = i;
        this.presenceField = field2;
        this.presenceMask = i2;
        this.required = z;
        this.enforceUtf8 = z2;
        this.oneof = pffVar;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = afbVar;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i) {
        if (i > 0) {
            return;
        }
        qp2.o(sko.i(i, "fieldNumber must be positive: "));
    }

    public static b09 forExplicitPresenceField(Field field, int i, o09 o09Var, Field field2, int i2, boolean z, afb afbVar) {
        checkFieldNumber(i);
        ifb.checkNotNull(field, "field");
        ifb.checkNotNull(o09Var, "fieldType");
        ifb.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i2)) {
            return new b09(field, i, o09Var, null, field2, i2, false, z, null, null, null, afbVar, null);
        }
        qp2.o(sko.i(i2, "presenceMask must have exactly one bit set: "));
        return null;
    }

    public static b09 forField(Field field, int i, o09 o09Var, boolean z) {
        checkFieldNumber(i);
        ifb.checkNotNull(field, "field");
        ifb.checkNotNull(o09Var, "fieldType");
        if (o09Var != o09.MESSAGE_LIST && o09Var != o09.GROUP_LIST) {
            return new b09(field, i, o09Var, null, null, 0, false, z, null, null, null, null, null);
        }
        qp2.n("Shouldn't be called for repeated message fields.");
        return null;
    }

    public static b09 forFieldWithEnumVerifier(Field field, int i, o09 o09Var, afb afbVar) {
        checkFieldNumber(i);
        ifb.checkNotNull(field, "field");
        return new b09(field, i, o09Var, null, null, 0, false, false, null, null, null, afbVar, null);
    }

    public static b09 forLegacyRequiredField(Field field, int i, o09 o09Var, Field field2, int i2, boolean z, afb afbVar) {
        checkFieldNumber(i);
        ifb.checkNotNull(field, "field");
        ifb.checkNotNull(o09Var, "fieldType");
        ifb.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i2)) {
            return new b09(field, i, o09Var, null, field2, i2, true, z, null, null, null, afbVar, null);
        }
        qp2.o(sko.i(i2, "presenceMask must have exactly one bit set: "));
        return null;
    }

    public static b09 forMapField(Field field, int i, Object obj, afb afbVar) {
        ifb.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i);
        ifb.checkNotNull(field, "field");
        return new b09(field, i, o09.MAP, null, null, 0, false, true, null, null, obj, afbVar, null);
    }

    public static b09 forOneofMemberField(int i, o09 o09Var, pff pffVar, Class<?> cls, boolean z, afb afbVar) {
        checkFieldNumber(i);
        ifb.checkNotNull(o09Var, "fieldType");
        ifb.checkNotNull(pffVar, "oneof");
        ifb.checkNotNull(cls, "oneofStoredType");
        if (o09Var.isScalar()) {
            return new b09(null, i, o09Var, null, null, 0, false, z, pffVar, cls, null, afbVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + o09Var);
    }

    public static b09 forPackedField(Field field, int i, o09 o09Var, Field field2) {
        checkFieldNumber(i);
        ifb.checkNotNull(field, "field");
        ifb.checkNotNull(o09Var, "fieldType");
        if (o09Var != o09.MESSAGE_LIST && o09Var != o09.GROUP_LIST) {
            return new b09(field, i, o09Var, null, null, 0, false, false, null, null, null, null, field2);
        }
        qp2.n("Shouldn't be called for repeated message fields.");
        return null;
    }

    public static b09 forPackedFieldWithEnumVerifier(Field field, int i, o09 o09Var, afb afbVar, Field field2) {
        checkFieldNumber(i);
        ifb.checkNotNull(field, "field");
        return new b09(field, i, o09Var, null, null, 0, false, false, null, null, null, afbVar, field2);
    }

    public static b09 forRepeatedMessageField(Field field, int i, o09 o09Var, Class<?> cls) {
        checkFieldNumber(i);
        ifb.checkNotNull(field, "field");
        ifb.checkNotNull(o09Var, "fieldType");
        ifb.checkNotNull(cls, "messageClass");
        return new b09(field, i, o09Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public static a newBuilder() {
        return new a(null);
    }

    @Override // java.lang.Comparable
    public int compareTo(b09 b09Var) {
        return this.fieldNumber - b09Var.fieldNumber;
    }

    public Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public afb getEnumVerifier() {
        return this.enumVerifier;
    }

    public Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i = a09.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i == 3 || i == 4) {
            return this.messageClass;
        }
        return null;
    }

    public pff getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public o09 getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }
}
