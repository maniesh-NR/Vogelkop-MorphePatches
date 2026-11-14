package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class mmk implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Callback e;

    public /* synthetic */ mmk(Object obj, String str, long j, Callback callback, byte b) {
        this.a = b;
        this.b = obj;
        this.c = str;
        this.d = j;
        this.e = callback;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        Callback callback = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((tmk) obj2).a((String) obj, this.c, this.d, (eof) callback);
                break;
            case 1:
                ((tmk) obj2).a((String) obj, this.c, this.d, (eof) callback);
                break;
            default:
                slk slkVar = (slk) obj2;
                h0d h0dVar = (h0d) obj;
                tmk tmkVar = slkVar.b;
                eof eofVar = new eof((Object) slkVar, callback, (byte) 22);
                h0d h0dVar2 = h0d.c;
                xbf xbfVar = tmkVar.c;
                String str = this.c;
                long j = this.d;
                if (h0dVar != h0dVar2) {
                    xbfVar.z(new mmk(tmkVar, str, j, eofVar, (byte) 1));
                    break;
                } else {
                    xbfVar.A(new mmk(tmkVar, str, j, eofVar, (byte) 0));
                    break;
                }
        }
    }
}
