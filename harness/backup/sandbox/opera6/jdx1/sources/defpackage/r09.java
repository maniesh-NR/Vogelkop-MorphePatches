package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class r09 {
    public static final r09 b;
    public static final r09 c;
    public static final r09[] d;
    public static final /* synthetic */ r09[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    r09 EF0;

    static {
        bnb bnbVar = bnb.DOUBLE;
        r09 r09Var = new r09("DOUBLE", 0, 0, 1, bnbVar);
        bnb bnbVar2 = bnb.FLOAT;
        r09 r09Var2 = new r09("FLOAT", 1, 1, 1, bnbVar2);
        bnb bnbVar3 = bnb.LONG;
        r09 r09Var3 = new r09("INT64", 2, 2, 1, bnbVar3);
        r09 r09Var4 = new r09("UINT64", 3, 3, 1, bnbVar3);
        bnb bnbVar4 = bnb.INT;
        r09 r09Var5 = new r09("INT32", 4, 4, 1, bnbVar4);
        r09 r09Var6 = new r09("FIXED64", 5, 5, 1, bnbVar3);
        r09 r09Var7 = new r09("FIXED32", 6, 6, 1, bnbVar4);
        bnb bnbVar5 = bnb.BOOLEAN;
        r09 r09Var8 = new r09("BOOL", 7, 7, 1, bnbVar5);
        bnb bnbVar6 = bnb.STRING;
        r09 r09Var9 = new r09("STRING", 8, 8, 1, bnbVar6);
        bnb bnbVar7 = bnb.MESSAGE;
        r09 r09Var10 = new r09("MESSAGE", 9, 9, 1, bnbVar7);
        bnb bnbVar8 = bnb.BYTE_STRING;
        r09 r09Var11 = new r09("BYTES", 10, 10, 1, bnbVar8);
        r09 r09Var12 = new r09("UINT32", 11, 11, 1, bnbVar4);
        bnb bnbVar9 = bnb.ENUM;
        r09 r09Var13 = new r09("ENUM", 12, 12, 1, bnbVar9);
        r09 r09Var14 = new r09("SFIXED32", 13, 13, 1, bnbVar4);
        r09 r09Var15 = new r09("SFIXED64", 14, 14, 1, bnbVar3);
        r09 r09Var16 = new r09("SINT32", 15, 15, 1, bnbVar4);
        r09 r09Var17 = new r09("SINT64", 16, 16, 1, bnbVar3);
        r09 r09Var18 = new r09("GROUP", 17, 17, 1, bnbVar7);
        r09 r09Var19 = new r09("DOUBLE_LIST", 18, 18, 2, bnbVar);
        r09 r09Var20 = new r09("FLOAT_LIST", 19, 19, 2, bnbVar2);
        r09 r09Var21 = new r09("INT64_LIST", 20, 20, 2, bnbVar3);
        r09 r09Var22 = new r09("UINT64_LIST", 21, 21, 2, bnbVar3);
        r09 r09Var23 = new r09("INT32_LIST", 22, 22, 2, bnbVar4);
        r09 r09Var24 = new r09("FIXED64_LIST", 23, 23, 2, bnbVar3);
        r09 r09Var25 = new r09("FIXED32_LIST", 24, 24, 2, bnbVar4);
        r09 r09Var26 = new r09("BOOL_LIST", 25, 25, 2, bnbVar5);
        r09 r09Var27 = new r09("STRING_LIST", 26, 26, 2, bnbVar6);
        r09 r09Var28 = new r09("MESSAGE_LIST", 27, 27, 2, bnbVar7);
        r09 r09Var29 = new r09("BYTES_LIST", 28, 28, 2, bnbVar8);
        r09 r09Var30 = new r09("UINT32_LIST", 29, 29, 2, bnbVar4);
        r09 r09Var31 = new r09("ENUM_LIST", 30, 30, 2, bnbVar9);
        r09 r09Var32 = new r09("SFIXED32_LIST", 31, 31, 2, bnbVar4);
        r09 r09Var33 = new r09("SFIXED64_LIST", 32, 32, 2, bnbVar3);
        r09 r09Var34 = new r09("SINT32_LIST", 33, 33, 2, bnbVar4);
        r09 r09Var35 = new r09("SINT64_LIST", 34, 34, 2, bnbVar3);
        r09 r09Var36 = new r09("DOUBLE_LIST_PACKED", 35, 35, 3, bnbVar);
        b = r09Var36;
        r09 r09Var37 = new r09("FLOAT_LIST_PACKED", 36, 36, 3, bnbVar2);
        r09 r09Var38 = new r09("INT64_LIST_PACKED", 37, 37, 3, bnbVar3);
        r09 r09Var39 = new r09("UINT64_LIST_PACKED", 38, 38, 3, bnbVar3);
        r09 r09Var40 = new r09("INT32_LIST_PACKED", 39, 39, 3, bnbVar4);
        r09 r09Var41 = new r09("FIXED64_LIST_PACKED", 40, 40, 3, bnbVar3);
        r09 r09Var42 = new r09("FIXED32_LIST_PACKED", 41, 41, 3, bnbVar4);
        r09 r09Var43 = new r09("BOOL_LIST_PACKED", 42, 42, 3, bnbVar5);
        r09 r09Var44 = new r09("UINT32_LIST_PACKED", 43, 43, 3, bnbVar4);
        r09 r09Var45 = new r09("ENUM_LIST_PACKED", 44, 44, 3, bnbVar9);
        r09 r09Var46 = new r09("SFIXED32_LIST_PACKED", 45, 45, 3, bnbVar4);
        r09 r09Var47 = new r09("SFIXED64_LIST_PACKED", 46, 46, 3, bnbVar3);
        r09 r09Var48 = new r09("SINT32_LIST_PACKED", 47, 47, 3, bnbVar4);
        r09 r09Var49 = new r09("SINT64_LIST_PACKED", 48, 48, 3, bnbVar3);
        c = r09Var49;
        e = new r09[]{r09Var, r09Var2, r09Var3, r09Var4, r09Var5, r09Var6, r09Var7, r09Var8, r09Var9, r09Var10, r09Var11, r09Var12, r09Var13, r09Var14, r09Var15, r09Var16, r09Var17, r09Var18, r09Var19, r09Var20, r09Var21, r09Var22, r09Var23, r09Var24, r09Var25, r09Var26, r09Var27, r09Var28, r09Var29, r09Var30, r09Var31, r09Var32, r09Var33, r09Var34, r09Var35, r09Var36, r09Var37, r09Var38, r09Var39, r09Var40, r09Var41, r09Var42, r09Var43, r09Var44, r09Var45, r09Var46, r09Var47, r09Var48, r09Var49, new r09("GROUP_LIST", 49, 49, 2, bnbVar7), new r09("MAP", 50, 50, 4, bnb.VOID)};
        r09[] r09VarArrValues = values();
        d = new r09[r09VarArrValues.length];
        for (r09 r09Var50 : r09VarArrValues) {
            d[r09Var50.a] = r09Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r09(String str, int i, int i2, int i3, bnb bnbVar) {
        this.a = i2;
        int iA = vep.A(i3);
        if (iA == 1 || iA == 3) {
            Class cls = bnbVar.a;
        }
        if (i3 == 1) {
            bnbVar.ordinal();
        }
    }

    public static r09 valueOf(String str) {
        return (r09) Enum.valueOf(r09.class, str);
    }

    public static r09[] values() {
        return (r09[]) e.clone();
    }
}
