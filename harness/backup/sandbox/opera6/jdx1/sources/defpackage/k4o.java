package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class k4o {
    public static final f4o c;
    public static final g4o d;
    public static final h4o e;
    public static final /* synthetic */ k4o[] f;
    public final l4o a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    k4o EF0;

    /* JADX INFO: Fake field, exist only in values array */
    k4o EF1;

    /* JADX INFO: Fake field, exist only in values array */
    k4o EF2;

    static {
        k4o k4oVar = new k4o("DOUBLE", 0, l4o.DOUBLE, 1);
        k4o k4oVar2 = new k4o("FLOAT", 1, l4o.FLOAT, 5);
        l4o l4oVar = l4o.LONG;
        k4o k4oVar3 = new k4o("INT64", 2, l4oVar, 0);
        k4o k4oVar4 = new k4o("UINT64", 3, l4oVar, 0);
        l4o l4oVar2 = l4o.INT;
        k4o k4oVar5 = new k4o("INT32", 4, l4oVar2, 0);
        k4o k4oVar6 = new k4o("FIXED64", 5, l4oVar, 1);
        k4o k4oVar7 = new k4o("FIXED32", 6, l4oVar2, 5);
        k4o k4oVar8 = new k4o("BOOL", 7, l4o.BOOLEAN, 0);
        f4o f4oVar = new f4o("STRING", 8, l4o.STRING, 2);
        c = f4oVar;
        l4o l4oVar3 = l4o.MESSAGE;
        g4o g4oVar = new g4o("GROUP", 9, l4oVar3, 3);
        d = g4oVar;
        h4o h4oVar = new h4o("MESSAGE", 10, l4oVar3, 2);
        e = h4oVar;
        f = new k4o[]{k4oVar, k4oVar2, k4oVar3, k4oVar4, k4oVar5, k4oVar6, k4oVar7, k4oVar8, f4oVar, g4oVar, h4oVar, new i4o("BYTES", 11, l4o.BYTE_STRING, 2), new k4o("UINT32", 12, l4oVar2, 0), new k4o("ENUM", 13, l4o.ENUM, 0), new k4o("SFIXED32", 14, l4oVar2, 5), new k4o("SFIXED64", 15, l4oVar, 1), new k4o("SINT32", 16, l4oVar2, 0), new k4o("SINT64", 17, l4oVar, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k4o(String str, int i, l4o l4oVar, int i2) {
        this.a = l4oVar;
        this.b = i2;
    }

    public static k4o valueOf(String str) {
        return (k4o) Enum.valueOf(k4o.class, str);
    }

    public static k4o[] values() {
        return (k4o[]) f.clone();
    }
}
