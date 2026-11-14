package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class lab implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mab b;
    public final /* synthetic */ x5f c;

    public /* synthetic */ lab(mab mabVar, x5f x5fVar, byte b) {
        this.a = b;
        this.b = mabVar;
        this.c = x5fVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        x5f x5fVar = this.c;
        mab mabVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                x5fVar.R(4, "Install fail: " + str);
                mabVar.requireActivity().J();
                break;
            default:
                x5fVar.R(4, "Install fail: " + str);
                mabVar.requireActivity().J();
                break;
        }
    }
}
