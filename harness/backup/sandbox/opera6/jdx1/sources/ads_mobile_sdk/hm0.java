package ads_mobile_sdk;

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
public final class hm0 {
    public static final hm0 b;
    public static final hm0 c;
    public static final hm0[] d;
    public static final /* synthetic */ hm0[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    hm0 EF0;

    static {
        hj1 hj1Var = hj1.f;
        hm0 hm0Var = new hm0("DOUBLE", 0, 0, 1, hj1Var);
        hj1 hj1Var2 = hj1.e;
        hm0 hm0Var2 = new hm0("FLOAT", 1, 1, 1, hj1Var2);
        hj1 hj1Var3 = hj1.d;
        hm0 hm0Var3 = new hm0("INT64", 2, 2, 1, hj1Var3);
        hm0 hm0Var4 = new hm0("UINT64", 3, 3, 1, hj1Var3);
        hj1 hj1Var4 = hj1.c;
        hm0 hm0Var5 = new hm0("INT32", 4, 4, 1, hj1Var4);
        hm0 hm0Var6 = new hm0("FIXED64", 5, 5, 1, hj1Var3);
        hm0 hm0Var7 = new hm0("FIXED32", 6, 6, 1, hj1Var4);
        hj1 hj1Var5 = hj1.g;
        hm0 hm0Var8 = new hm0("BOOL", 7, 7, 1, hj1Var5);
        hj1 hj1Var6 = hj1.h;
        hm0 hm0Var9 = new hm0("STRING", 8, 8, 1, hj1Var6);
        hj1 hj1Var7 = hj1.k;
        hm0 hm0Var10 = new hm0("MESSAGE", 9, 9, 1, hj1Var7);
        hj1 hj1Var8 = hj1.i;
        hm0 hm0Var11 = new hm0("BYTES", 10, 10, 1, hj1Var8);
        hm0 hm0Var12 = new hm0("UINT32", 11, 11, 1, hj1Var4);
        hj1 hj1Var9 = hj1.j;
        hm0 hm0Var13 = new hm0("ENUM", 12, 12, 1, hj1Var9);
        hm0 hm0Var14 = new hm0("SFIXED32", 13, 13, 1, hj1Var4);
        hm0 hm0Var15 = new hm0("SFIXED64", 14, 14, 1, hj1Var3);
        hm0 hm0Var16 = new hm0("SINT32", 15, 15, 1, hj1Var4);
        hm0 hm0Var17 = new hm0("SINT64", 16, 16, 1, hj1Var3);
        hm0 hm0Var18 = new hm0("GROUP", 17, 17, 1, hj1Var7);
        hm0 hm0Var19 = new hm0("DOUBLE_LIST", 18, 18, 2, hj1Var);
        hm0 hm0Var20 = new hm0("FLOAT_LIST", 19, 19, 2, hj1Var2);
        hm0 hm0Var21 = new hm0("INT64_LIST", 20, 20, 2, hj1Var3);
        hm0 hm0Var22 = new hm0("UINT64_LIST", 21, 21, 2, hj1Var3);
        hm0 hm0Var23 = new hm0("INT32_LIST", 22, 22, 2, hj1Var4);
        hm0 hm0Var24 = new hm0("FIXED64_LIST", 23, 23, 2, hj1Var3);
        hm0 hm0Var25 = new hm0("FIXED32_LIST", 24, 24, 2, hj1Var4);
        hm0 hm0Var26 = new hm0("BOOL_LIST", 25, 25, 2, hj1Var5);
        hm0 hm0Var27 = new hm0("STRING_LIST", 26, 26, 2, hj1Var6);
        hm0 hm0Var28 = new hm0("MESSAGE_LIST", 27, 27, 2, hj1Var7);
        hm0 hm0Var29 = new hm0("BYTES_LIST", 28, 28, 2, hj1Var8);
        hm0 hm0Var30 = new hm0("UINT32_LIST", 29, 29, 2, hj1Var4);
        hm0 hm0Var31 = new hm0("ENUM_LIST", 30, 30, 2, hj1Var9);
        hm0 hm0Var32 = new hm0("SFIXED32_LIST", 31, 31, 2, hj1Var4);
        hm0 hm0Var33 = new hm0("SFIXED64_LIST", 32, 32, 2, hj1Var3);
        hm0 hm0Var34 = new hm0("SINT32_LIST", 33, 33, 2, hj1Var4);
        hm0 hm0Var35 = new hm0("SINT64_LIST", 34, 34, 2, hj1Var3);
        hm0 hm0Var36 = new hm0("DOUBLE_LIST_PACKED", 35, 35, 3, hj1Var);
        b = hm0Var36;
        hm0 hm0Var37 = new hm0("FLOAT_LIST_PACKED", 36, 36, 3, hj1Var2);
        hm0 hm0Var38 = new hm0("INT64_LIST_PACKED", 37, 37, 3, hj1Var3);
        hm0 hm0Var39 = new hm0("UINT64_LIST_PACKED", 38, 38, 3, hj1Var3);
        hm0 hm0Var40 = new hm0("INT32_LIST_PACKED", 39, 39, 3, hj1Var4);
        hm0 hm0Var41 = new hm0("FIXED64_LIST_PACKED", 40, 40, 3, hj1Var3);
        hm0 hm0Var42 = new hm0("FIXED32_LIST_PACKED", 41, 41, 3, hj1Var4);
        hm0 hm0Var43 = new hm0("BOOL_LIST_PACKED", 42, 42, 3, hj1Var5);
        hm0 hm0Var44 = new hm0("UINT32_LIST_PACKED", 43, 43, 3, hj1Var4);
        hm0 hm0Var45 = new hm0("ENUM_LIST_PACKED", 44, 44, 3, hj1Var9);
        hm0 hm0Var46 = new hm0("SFIXED32_LIST_PACKED", 45, 45, 3, hj1Var4);
        hm0 hm0Var47 = new hm0("SFIXED64_LIST_PACKED", 46, 46, 3, hj1Var3);
        hm0 hm0Var48 = new hm0("SINT32_LIST_PACKED", 47, 47, 3, hj1Var4);
        hm0 hm0Var49 = new hm0("SINT64_LIST_PACKED", 48, 48, 3, hj1Var3);
        c = hm0Var49;
        e = new hm0[]{hm0Var, hm0Var2, hm0Var3, hm0Var4, hm0Var5, hm0Var6, hm0Var7, hm0Var8, hm0Var9, hm0Var10, hm0Var11, hm0Var12, hm0Var13, hm0Var14, hm0Var15, hm0Var16, hm0Var17, hm0Var18, hm0Var19, hm0Var20, hm0Var21, hm0Var22, hm0Var23, hm0Var24, hm0Var25, hm0Var26, hm0Var27, hm0Var28, hm0Var29, hm0Var30, hm0Var31, hm0Var32, hm0Var33, hm0Var34, hm0Var35, hm0Var36, hm0Var37, hm0Var38, hm0Var39, hm0Var40, hm0Var41, hm0Var42, hm0Var43, hm0Var44, hm0Var45, hm0Var46, hm0Var47, hm0Var48, hm0Var49, new hm0("GROUP_LIST", 49, 49, 2, hj1Var7), new hm0("MAP", 50, 50, 4, hj1.b)};
        hm0[] hm0VarArrValues = values();
        d = new hm0[hm0VarArrValues.length];
        for (hm0 hm0Var50 : hm0VarArrValues) {
            d[hm0Var50.a] = hm0Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hm0(String str, int i, int i2, int i3, hj1 hj1Var) {
        this.a = i2;
        int iA = zwg.a(i3);
        if (iA == 1 || iA == 3) {
            hj1Var.getClass();
        }
        if (i3 == 1) {
            hj1Var.ordinal();
        }
    }

    public static hm0[] values() {
        return (hm0[]) e.clone();
    }
}
