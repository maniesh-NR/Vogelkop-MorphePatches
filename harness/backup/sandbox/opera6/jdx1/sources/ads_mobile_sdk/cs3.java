package ads_mobile_sdk;

import defpackage.gop;
import defpackage.slo;
import defpackage.wmp;
import defpackage.xpo;

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
public class cs3 {
    public static final cs3 c;
    public static final wmp d;
    public static final gop e;
    public static final slo f;
    public static final /* synthetic */ cs3[] g;
    public final ds3 a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    cs3 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    cs3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    cs3 EF2;

    static {
        cs3 cs3Var = new cs3("DOUBLE", 0, ds3.e, 1);
        cs3 cs3Var2 = new cs3("FLOAT", 1, ds3.d, 5);
        ds3 ds3Var = ds3.c;
        cs3 cs3Var3 = new cs3("INT64", 2, ds3Var, 0);
        cs3 cs3Var4 = new cs3("UINT64", 3, ds3Var, 0);
        ds3 ds3Var2 = ds3.b;
        cs3 cs3Var5 = new cs3("INT32", 4, ds3Var2, 0);
        cs3 cs3Var6 = new cs3("FIXED64", 5, ds3Var, 1);
        cs3 cs3Var7 = new cs3("FIXED32", 6, ds3Var2, 5);
        cs3 cs3Var8 = new cs3("BOOL", 7, ds3.f, 0);
        c = cs3Var8;
        wmp wmpVar = new wmp("STRING", 8, ds3.g, 2);
        d = wmpVar;
        ds3 ds3Var3 = ds3.j;
        gop gopVar = new gop("GROUP", 9, ds3Var3, 3);
        e = gopVar;
        slo sloVar = new slo("MESSAGE", 10, ds3Var3, 2);
        f = sloVar;
        g = new cs3[]{cs3Var, cs3Var2, cs3Var3, cs3Var4, cs3Var5, cs3Var6, cs3Var7, cs3Var8, wmpVar, gopVar, sloVar, new xpo("BYTES", 11, ds3.h, 2), new cs3("UINT32", 12, ds3Var2, 0), new cs3("ENUM", 13, ds3.i, 0), new cs3("SFIXED32", 14, ds3Var2, 5), new cs3("SFIXED64", 15, ds3Var, 1), new cs3("SINT32", 16, ds3Var2, 0), new cs3("SINT64", 17, ds3Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cs3(String str, int i, ds3 ds3Var, int i2) {
        this.a = ds3Var;
        this.b = i2;
    }

    public static cs3[] values() {
        return (cs3[]) g.clone();
    }
}
