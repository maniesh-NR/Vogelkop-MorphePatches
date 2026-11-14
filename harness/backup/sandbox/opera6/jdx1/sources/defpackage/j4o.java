package defpackage;

/* loaded from: classes.dex */
public final class j4o {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
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
    public static class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BOOL;
        public static final a BYTES;
        public static final a ENUM;
        public static final a FIXED32;
        public static final a FIXED64;
        public static final a GROUP;
        public static final a INT32;
        public static final a INT64;
        public static final a MESSAGE;
        public static final a SFIXED32;
        public static final a SFIXED64;
        public static final a SINT32;
        public static final a SINT64;
        public static final a STRING;
        public static final a UINT32;
        public static final a UINT64;
        private final b javaType;
        private final int wireType;
        public static final a DOUBLE = new a("DOUBLE", 0, b.DOUBLE, 1);
        public static final a FLOAT = new a("FLOAT", 1, b.FLOAT, 5);

        /* renamed from: j4o$a$a, reason: collision with other inner class name */
        public enum C0000a extends a {
            public C0000a(String str, int i, b bVar, int i2) {
                super(str, i, bVar, i2);
            }

            @Override // j4o.a
            public boolean isPackable() {
                return false;
            }
        }

        public enum b extends a {
            public b(String str, int i, b bVar, int i2) {
                super(str, i, bVar, i2);
            }

            @Override // j4o.a
            public boolean isPackable() {
                return false;
            }
        }

        public enum c extends a {
            public c(String str, int i, b bVar, int i2) {
                super(str, i, bVar, i2);
            }

            @Override // j4o.a
            public boolean isPackable() {
                return false;
            }
        }

        public enum d extends a {
            public d(String str, int i, b bVar, int i2) {
                super(str, i, bVar, i2);
            }

            @Override // j4o.a
            public boolean isPackable() {
                return false;
            }
        }

        private static /* synthetic */ a[] $values() {
            return new a[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
        }

        static {
            b bVar = b.LONG;
            INT64 = new a("INT64", 2, bVar, 0);
            UINT64 = new a("UINT64", 3, bVar, 0);
            b bVar2 = b.INT;
            INT32 = new a("INT32", 4, bVar2, 0);
            FIXED64 = new a("FIXED64", 5, bVar, 1);
            FIXED32 = new a("FIXED32", 6, bVar2, 5);
            BOOL = new a("BOOL", 7, b.BOOLEAN, 0);
            STRING = new C0000a("STRING", 8, b.STRING, 2);
            b bVar3 = b.MESSAGE;
            GROUP = new b("GROUP", 9, bVar3, 3);
            MESSAGE = new c("MESSAGE", 10, bVar3, 2);
            BYTES = new d("BYTES", 11, b.BYTE_STRING, 2);
            UINT32 = new a("UINT32", 12, bVar2, 0);
            ENUM = new a("ENUM", 13, b.ENUM, 0);
            SFIXED32 = new a("SFIXED32", 14, bVar2, 5);
            SFIXED64 = new a("SFIXED64", 15, bVar, 1);
            SINT32 = new a("SINT32", 16, bVar2, 0);
            SINT64 = new a("SINT64", 17, bVar, 0);
            $VALUES = $values();
        }

        private a(String str, int i, b bVar, int i2) {
            this.javaType = bVar;
            this.wireType = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public b getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }
    }

    public enum b {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(v44.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        b(Object obj) {
            this.defaultDefault = obj;
        }

        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    public enum c {
        LOOSE,
        STRICT,
        LAZY
    }

    private j4o() {
    }

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    public static int getTagWireType(int i) {
        return i & 7;
    }

    public static int makeTag(int i, int i2) {
        return (i << 3) | i2;
    }
}
