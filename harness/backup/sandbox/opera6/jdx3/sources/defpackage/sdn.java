package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class sdn implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ydn b;

    public /* synthetic */ sdn(ydn ydnVar, byte b) {
        this.a = b;
        this.b = ydnVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        ydn ydnVar = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    ydnVar.C(false);
                    break;
                } else {
                    if (ydnVar.I != null) {
                        ydnVar.I = null;
                    }
                    ydnVar.e();
                    break;
                }
            case 1:
                efn efnVar = (efn) obj;
                vdn vdnVar = ydnVar.d;
                ydnVar.I(new vdn(ydnVar.p().a && vdnVar.a, ydnVar.c.isEnabled() ? false : vdnVar.b(), efnVar, null));
                break;
            default:
                ydnVar.y((ren) obj);
                break;
        }
    }
}
