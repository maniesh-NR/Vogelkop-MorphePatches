package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class d0a implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tah b;
    public final /* synthetic */ zz9 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ File e;

    public /* synthetic */ d0a(tah tahVar, zz9 zz9Var, String str, File file, byte b) {
        this.a = b;
        this.b = tahVar;
        this.c = zz9Var;
        this.d = str;
        this.e = file;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        File file = this.e;
        String str = this.d;
        zz9 zz9Var = this.c;
        tah tahVar = this.b;
        t12 t12Var = (t12) obj;
        switch (b) {
            case 0:
                int iOrdinal = t12Var.ordinal();
                if (iOrdinal == 0) {
                    tahVar.I(zz9Var, new a0a(str, file, o29.IMAGE, "image/webp"));
                } else if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    h9o.p();
                    break;
                } else {
                    ((f0a) tahVar.g).a(t12Var);
                }
                break;
            default:
                int iOrdinal2 = t12Var.ordinal();
                if (iOrdinal2 == 0) {
                    tahVar.I(zz9Var, new a0a(str, file, o29.IMAGE, "image/webp"));
                } else if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                    h9o.p();
                    break;
                } else {
                    ((f0a) tahVar.g).a(t12Var);
                }
                break;
        }
        return Unit.a;
    }
}
