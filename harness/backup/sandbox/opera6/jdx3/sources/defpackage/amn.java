package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class amn implements sni {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ cej c;

    public /* synthetic */ amn(cej cejVar, Context context, byte b) {
        this.a = b;
        this.c = cejVar;
        this.b = context;
    }

    @Override // defpackage.sni
    public final void Y(boolean z) {
        byte b = this.a;
        Context context = this.b;
        cej cejVar = this.c;
        switch (b) {
            case 0:
                ((xq3) cejVar).b(context);
                break;
            default:
                ((og5) cejVar).d(context);
                break;
        }
    }
}
