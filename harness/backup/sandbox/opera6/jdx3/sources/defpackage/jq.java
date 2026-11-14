package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jq implements tz {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ dl b;
    public final /* synthetic */ Object c;

    public jq(lhb lhbVar, hl hlVar) {
        this.b = hlVar;
        Objects.requireNonNull(lhbVar);
        this.c = lhbVar;
    }

    public jq(mq mqVar, dl dlVar) {
        this.b = dlVar;
        this.c = mqVar;
    }

    @Override // defpackage.tz
    public final boolean a(yz yzVar) {
        byte b = this.a;
        dl dlVar = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((mq) obj).g.a(yzVar, dlVar);
                break;
            default:
                if (yzVar.t()) {
                    ((lhb) obj).c.a(yzVar, (hl) dlVar);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.tz
    public final boolean b(yz yzVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (yzVar.s()) {
                    ((mq) obj).k();
                    break;
                }
                break;
            default:
                if (yzVar.s()) {
                    ((lhb) obj).c.k(yzVar, (hl) this.b);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.tz
    public final boolean c(yz yzVar) {
        byte b = this.a;
        dl dlVar = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((mq) obj).g.b(yzVar, dlVar);
                break;
            default:
                ((lhb) obj).c.b(yzVar, (hl) dlVar);
                break;
        }
        return true;
    }
}
