package defpackage;

/* loaded from: classes.dex */
public final class mel extends a7f {
    public final /* synthetic */ byte c;
    public final /* synthetic */ oel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mel(Object obj, oel oelVar, byte b) {
        super(obj);
        this.c = b;
        this.d = oelVar;
    }

    @Override // defpackage.a7f
    public final void a(Object obj, Object obj2) {
        byte b = this.c;
        oel oelVar = this.d;
        switch (b) {
            case 0:
                oelVar.c(2131363158, Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
                break;
            case 1:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                oelVar.c(2131363160, bool2, bool);
                break;
            case 2:
                oelVar.c(2131363165, Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
                break;
            case 3:
                oelVar.c(2131363159, (nil) obj, (nil) obj2);
                break;
            case 4:
                Boolean bool3 = (Boolean) obj2;
                bool3.getClass();
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                oelVar.c(2131363157, bool4, bool3);
                break;
            default:
                oelVar.c(2131363164, Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
                break;
        }
    }
}
