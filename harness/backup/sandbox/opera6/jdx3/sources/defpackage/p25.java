package defpackage;

import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class p25 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu2 b;
    public final /* synthetic */ s25 c;

    public /* synthetic */ p25(iu2 iu2Var, s25 s25Var, byte b) {
        this.a = b;
        this.b = iu2Var;
        this.c = s25Var;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        byte b = this.a;
        s25 s25Var = this.c;
        iu2 iu2Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                iu2Var.run(num.intValue() == 0 ? s25Var.a.getString(2132021321) : s25Var.a.getResources().getQuantityString(2131886107, num.intValue(), num));
                break;
            default:
                iu2Var.run(num.intValue() == 0 ? s25Var.a.getString(2132021334) : s25Var.a.getResources().getQuantityString(2131886110, num.intValue(), num));
                break;
        }
    }
}
