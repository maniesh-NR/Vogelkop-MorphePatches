package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class ql implements dkj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sl b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ql(sl slVar, Context context, byte b) {
        this.a = b;
        this.b = slVar;
        this.c = context;
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        Context context = this.c;
        sl slVar = this.b;
        switch (b) {
            case 0:
                zhj.a(new am(new c4(slVar, (byte) 6), new rl(slVar, (byte) 0)), 0).c(context);
                break;
            default:
                zhj.a(new am(new c4(slVar, (byte) 6), new xa(slVar, context, (byte) 3)), 0).c(context);
                break;
        }
    }
}
