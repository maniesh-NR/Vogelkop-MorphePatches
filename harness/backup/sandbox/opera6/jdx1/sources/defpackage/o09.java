package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class o09 {
    private static final /* synthetic */ o09[] $VALUES;
    public static final o09 BOOL;
    public static final o09 BOOL_LIST;
    public static final o09 BOOL_LIST_PACKED;
    public static final o09 BYTES;
    public static final o09 BYTES_LIST;
    public static final o09 DOUBLE;
    public static final o09 DOUBLE_LIST;
    public static final o09 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final o09 ENUM;
    public static final o09 ENUM_LIST;
    public static final o09 ENUM_LIST_PACKED;
    public static final o09 FIXED32;
    public static final o09 FIXED32_LIST;
    public static final o09 FIXED32_LIST_PACKED;
    public static final o09 FIXED64;
    public static final o09 FIXED64_LIST;
    public static final o09 FIXED64_LIST_PACKED;
    public static final o09 FLOAT;
    public static final o09 FLOAT_LIST;
    public static final o09 FLOAT_LIST_PACKED;
    public static final o09 GROUP;
    public static final o09 GROUP_LIST;
    public static final o09 INT32;
    public static final o09 INT32_LIST;
    public static final o09 INT32_LIST_PACKED;
    public static final o09 INT64;
    public static final o09 INT64_LIST;
    public static final o09 INT64_LIST_PACKED;
    public static final o09 MAP;
    public static final o09 MESSAGE;
    public static final o09 MESSAGE_LIST;
    public static final o09 SFIXED32;
    public static final o09 SFIXED32_LIST;
    public static final o09 SFIXED32_LIST_PACKED;
    public static final o09 SFIXED64;
    public static final o09 SFIXED64_LIST;
    public static final o09 SFIXED64_LIST_PACKED;
    public static final o09 SINT32;
    public static final o09 SINT32_LIST;
    public static final o09 SINT32_LIST_PACKED;
    public static final o09 SINT64;
    public static final o09 SINT64_LIST;
    public static final o09 SINT64_LIST_PACKED;
    public static final o09 STRING;
    public static final o09 STRING_LIST;
    public static final o09 UINT32;
    public static final o09 UINT32_LIST;
    public static final o09 UINT32_LIST_PACKED;
    public static final o09 UINT64;
    public static final o09 UINT64_LIST;
    public static final o09 UINT64_LIST_PACKED;
    private static final o09[] VALUES;
    private final a collection;
    private final Class<?> elementType;
    private final int id;
    private final anb javaType;
    private final boolean primitiveScalar;

    public enum a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        a(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    private static /* synthetic */ o09[] $values() {
        return new o09[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        a aVar = a.SCALAR;
        anb anbVar = anb.DOUBLE;
        DOUBLE = new o09("DOUBLE", 0, 0, aVar, anbVar);
        anb anbVar2 = anb.FLOAT;
        FLOAT = new o09("FLOAT", 1, 1, aVar, anbVar2);
        anb anbVar3 = anb.LONG;
        INT64 = new o09("INT64", 2, 2, aVar, anbVar3);
        UINT64 = new o09("UINT64", 3, 3, aVar, anbVar3);
        anb anbVar4 = anb.INT;
        INT32 = new o09("INT32", 4, 4, aVar, anbVar4);
        FIXED64 = new o09("FIXED64", 5, 5, aVar, anbVar3);
        FIXED32 = new o09("FIXED32", 6, 6, aVar, anbVar4);
        anb anbVar5 = anb.BOOLEAN;
        BOOL = new o09("BOOL", 7, 7, aVar, anbVar5);
        anb anbVar6 = anb.STRING;
        STRING = new o09("STRING", 8, 8, aVar, anbVar6);
        anb anbVar7 = anb.MESSAGE;
        MESSAGE = new o09("MESSAGE", 9, 9, aVar, anbVar7);
        anb anbVar8 = anb.BYTE_STRING;
        BYTES = new o09("BYTES", 10, 10, aVar, anbVar8);
        UINT32 = new o09("UINT32", 11, 11, aVar, anbVar4);
        anb anbVar9 = anb.ENUM;
        ENUM = new o09("ENUM", 12, 12, aVar, anbVar9);
        SFIXED32 = new o09("SFIXED32", 13, 13, aVar, anbVar4);
        SFIXED64 = new o09("SFIXED64", 14, 14, aVar, anbVar3);
        SINT32 = new o09("SINT32", 15, 15, aVar, anbVar4);
        SINT64 = new o09("SINT64", 16, 16, aVar, anbVar3);
        GROUP = new o09("GROUP", 17, 17, aVar, anbVar7);
        a aVar2 = a.VECTOR;
        DOUBLE_LIST = new o09("DOUBLE_LIST", 18, 18, aVar2, anbVar);
        FLOAT_LIST = new o09("FLOAT_LIST", 19, 19, aVar2, anbVar2);
        INT64_LIST = new o09("INT64_LIST", 20, 20, aVar2, anbVar3);
        UINT64_LIST = new o09("UINT64_LIST", 21, 21, aVar2, anbVar3);
        INT32_LIST = new o09("INT32_LIST", 22, 22, aVar2, anbVar4);
        FIXED64_LIST = new o09("FIXED64_LIST", 23, 23, aVar2, anbVar3);
        FIXED32_LIST = new o09("FIXED32_LIST", 24, 24, aVar2, anbVar4);
        BOOL_LIST = new o09("BOOL_LIST", 25, 25, aVar2, anbVar5);
        STRING_LIST = new o09("STRING_LIST", 26, 26, aVar2, anbVar6);
        MESSAGE_LIST = new o09("MESSAGE_LIST", 27, 27, aVar2, anbVar7);
        BYTES_LIST = new o09("BYTES_LIST", 28, 28, aVar2, anbVar8);
        UINT32_LIST = new o09("UINT32_LIST", 29, 29, aVar2, anbVar4);
        ENUM_LIST = new o09("ENUM_LIST", 30, 30, aVar2, anbVar9);
        SFIXED32_LIST = new o09("SFIXED32_LIST", 31, 31, aVar2, anbVar4);
        SFIXED64_LIST = new o09("SFIXED64_LIST", 32, 32, aVar2, anbVar3);
        SINT32_LIST = new o09("SINT32_LIST", 33, 33, aVar2, anbVar4);
        SINT64_LIST = new o09("SINT64_LIST", 34, 34, aVar2, anbVar3);
        a aVar3 = a.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new o09("DOUBLE_LIST_PACKED", 35, 35, aVar3, anbVar);
        FLOAT_LIST_PACKED = new o09("FLOAT_LIST_PACKED", 36, 36, aVar3, anbVar2);
        INT64_LIST_PACKED = new o09("INT64_LIST_PACKED", 37, 37, aVar3, anbVar3);
        UINT64_LIST_PACKED = new o09("UINT64_LIST_PACKED", 38, 38, aVar3, anbVar3);
        INT32_LIST_PACKED = new o09("INT32_LIST_PACKED", 39, 39, aVar3, anbVar4);
        FIXED64_LIST_PACKED = new o09("FIXED64_LIST_PACKED", 40, 40, aVar3, anbVar3);
        FIXED32_LIST_PACKED = new o09("FIXED32_LIST_PACKED", 41, 41, aVar3, anbVar4);
        BOOL_LIST_PACKED = new o09("BOOL_LIST_PACKED", 42, 42, aVar3, anbVar5);
        UINT32_LIST_PACKED = new o09("UINT32_LIST_PACKED", 43, 43, aVar3, anbVar4);
        ENUM_LIST_PACKED = new o09("ENUM_LIST_PACKED", 44, 44, aVar3, anbVar9);
        SFIXED32_LIST_PACKED = new o09("SFIXED32_LIST_PACKED", 45, 45, aVar3, anbVar4);
        SFIXED64_LIST_PACKED = new o09("SFIXED64_LIST_PACKED", 46, 46, aVar3, anbVar3);
        SINT32_LIST_PACKED = new o09("SINT32_LIST_PACKED", 47, 47, aVar3, anbVar4);
        SINT64_LIST_PACKED = new o09("SINT64_LIST_PACKED", 48, 48, aVar3, anbVar3);
        GROUP_LIST = new o09("GROUP_LIST", 49, 49, aVar2, anbVar7);
        MAP = new o09("MAP", 50, 50, a.MAP, anb.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new Type[0];
        o09[] o09VarArrValues = values();
        VALUES = new o09[o09VarArrValues.length];
        for (o09 o09Var : o09VarArrValues) {
            VALUES[o09Var.id] = o09Var;
        }
    }

    private o09(String str, int i, int i2, a aVar, anb anbVar) {
        int i3;
        this.id = i2;
        this.collection = aVar;
        this.javaType = anbVar;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            this.elementType = anbVar.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (aVar != a.SCALAR || (i3 = h09.$SwitchMap$com$google$protobuf$JavaType[anbVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static o09 forId(int i) {
        if (i < 0) {
            return null;
        }
        o09[] o09VarArr = VALUES;
        if (i < o09VarArr.length) {
            return o09VarArr[i];
        }
        return null;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                h9o.r("Unable to identify parameter type for List<T>");
                return null;
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    Type type = actualTypeArguments[i2];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            h9o.r("Type array mismatch");
                            return null;
                        }
                        for (int i3 = 0; i3 < typeParameters.length; i3++) {
                            if (type == typeParameters[i3]) {
                                actualTypeArguments[i2] = typeArr[i3];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static o09 valueOf(String str) {
        return (o09) Enum.valueOf(o09.class, str);
    }

    public static o09[] values() {
        return (o09[]) $VALUES.clone();
    }

    public anb getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == a.MAP;
    }

    public boolean isPacked() {
        return a.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == a.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return a.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
