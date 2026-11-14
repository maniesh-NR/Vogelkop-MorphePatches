package defpackage;

import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cq extends cej {
    public final /* synthetic */ byte a = 1;
    public String b;
    public final Object c;
    public final Serializable d;
    public final Object e;
    public final Object f;

    public cq(Intent intent, ArrayList arrayList, qn qnVar, dcj dcjVar) {
        this.c = intent;
        this.d = arrayList;
        this.e = qnVar;
        this.f = dcjVar;
    }

    public cq(mq mqVar, String str, String str2, String str3, List list) {
        this.c = mqVar;
        this.b = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        byte b = this.a;
        Object obj = this.e;
        Serializable serializable = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new dq(mejVar, (mq) obj2, this.b, (String) serializable, (String) obj, (List) this.f);
            default:
                return new vcj(mejVar, (Intent) obj2, (ArrayList) serializable, (qn) obj, new rii((Object) this, (byte) 3));
        }
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        switch (this.a) {
            case 1:
                dcj dcjVar = (dcj) this.f;
                if (dcjVar != null) {
                    dcjVar.b(this, this.b);
                    break;
                }
                break;
            default:
                super.onFinished(hjmVar);
                break;
        }
    }
}
