package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class fkg implements eig {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fkg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.eig
    public final void c(dig digVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (digVar.a.a(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                    Handler handler = ((gkg) obj).f;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                        break;
                    }
                }
                break;
            default:
                tah tahVar = (tah) obj;
                ((ijk) tahVar.h).a();
                ((jjk) tahVar.i).a();
                ((eo7) tahVar.j).e();
                ((sea) tahVar.k).a();
                break;
        }
    }
}
