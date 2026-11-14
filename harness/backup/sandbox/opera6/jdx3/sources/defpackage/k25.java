package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class k25 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu2 b;
    public final /* synthetic */ s25 c;

    public /* synthetic */ k25(iu2 iu2Var, s25 s25Var, byte b) {
        this.a = b;
        this.b = iu2Var;
        this.c = s25Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        s25 s25Var = this.c;
        iu2 iu2Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                iu2Var.run(num.intValue() == 0 ? s25Var.a.getString(2132021315) : s25Var.a.getResources().getQuantityString(2131886081, num.intValue(), num));
                break;
            default:
                int iIntValue = num.intValue();
                iu2Var.run(iIntValue == 0 ? s25Var.a.getString(2132021336) : s25Var.a.getResources().getQuantityString(2131886107, iIntValue, num));
                break;
        }
    }
}
