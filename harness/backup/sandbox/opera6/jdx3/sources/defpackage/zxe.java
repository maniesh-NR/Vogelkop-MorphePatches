package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zxe implements zy {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zxe(bz bzVar, zy zyVar, byte b) {
        this.a = b;
        this.c = bzVar;
        this.b = zyVar;
    }

    public zxe(i5k i5kVar, eof eofVar) {
        this.a = (byte) 2;
        this.b = eofVar;
        Objects.requireNonNull(i5kVar);
        this.c = i5kVar;
    }

    @Override // defpackage.zy
    public final boolean a(yz yzVar) {
        boolean zA;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                zy zyVar = (zy) obj;
                aye ayeVar = (aye) obj2;
                if (!yzVar.q()) {
                    ayeVar.b = false;
                    return zyVar.a(yzVar);
                }
                ayeVar.b = true;
                zyVar.onFailed("Expired");
                return true;
            case 1:
                ((p7h) obj2).l(yzVar);
                if (!((zy) obj).a(yzVar)) {
                    yzVar.b();
                }
                return true;
            default:
                i5k i5kVar = (i5k) obj2;
                mq mqVar = i5kVar.c;
                j5k j5kVar = i5kVar.d;
                if (mqVar != null) {
                    zA = j5kVar.a(yzVar, mqVar, null);
                } else {
                    mq mqVar2 = (mq) j5kVar.b.pollFirst();
                    zA = mqVar2 != null ? j5kVar.a(yzVar, mqVar2, null) : false;
                }
                ((eof) obj).run(Boolean.valueOf(zA));
                return zA;
        }
    }

    @Override // defpackage.zy
    public final void onFailed(String str) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((aye) obj).b = false;
                ((zy) obj2).onFailed(str);
                break;
            case 1:
                ((zy) obj2).onFailed(str);
                break;
            default:
                ((i5k) obj).getClass();
                ((eof) obj2).run(Boolean.FALSE);
                break;
        }
    }
}
