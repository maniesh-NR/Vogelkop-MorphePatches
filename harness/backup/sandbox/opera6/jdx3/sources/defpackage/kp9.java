package defpackage;

import androidx.fragment.app.w;

/* loaded from: classes.dex */
public final /* synthetic */ class kp9 implements eua {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kp9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((pf) obj3).b = true;
                ((ydn) ((lp9) obj2).a.b.get()).C(true);
                ((d7l) ((b2l) obj)).b();
                break;
            default:
                xih.v((w) obj3, (db) obj2, "password-section", new mni((tmi) obj, (byte) 11));
                break;
        }
    }
}
