package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class ten implements dkj, fkj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w7j b;
    public final /* synthetic */ sdn c;

    public /* synthetic */ ten(w7j w7jVar, sdn sdnVar, byte b) {
        this.a = b;
        this.b = w7jVar;
        this.c = sdnVar;
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        sdn sdnVar = this.c;
        w7j w7jVar = this.b;
        switch (b) {
            case 0:
                sdnVar.run(Boolean.valueOf(yi4.y((sz4) w7jVar.b)));
                break;
            default:
                yi4.R((BrowserActivity) w7jVar.a, (sz4) w7jVar.b, (BrowserActivity) w7jVar.c, new iyk(w7jVar, sdnVar, (byte) 9));
                break;
        }
    }

    @Override // defpackage.fkj
    public final void e(gkj gkjVar, hjm hjmVar) {
        if (hjmVar == hjm.b) {
            this.c.run(Boolean.valueOf(yi4.y((sz4) this.b.b)));
        }
    }
}
