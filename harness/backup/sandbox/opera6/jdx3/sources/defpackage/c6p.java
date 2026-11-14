package defpackage;

import android.view.View;
import com.leanplum.internal.RequestBuilder;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c6p extends sc {
    public final euo d;

    public c6p(euo euoVar, String str, oam oamVar) {
        super((View) euoVar, str, oamVar);
        this.d = euoVar;
    }

    @Override // defpackage.sc
    public final void b(int i) {
        if (((qe6) this.c) != null) {
            int i2 = y3p.a[vep.A(i)];
            euo euoVar = this.d;
            switch (i2) {
                case 1:
                    qe6 qe6Var = (qe6) this.c;
                    qoo qooVar = euoVar.e;
                    int duration = 0;
                    if (qooVar != null) {
                        try {
                            duration = qooVar.f.getDuration();
                        } catch (IllegalStateException unused) {
                        }
                    }
                    float f = duration;
                    float f2 = euoVar.t ? 0.0f : 1.0f;
                    uio uioVar = (uio) qe6Var.b;
                    if (f <= 0.0f) {
                        qp2.o("Invalid Media duration");
                        break;
                    } else if (f2 >= 0.0f && f2 <= 1.0f) {
                        zch.c(uioVar);
                        JSONObject jSONObject = new JSONObject();
                        yqo.b(jSONObject, "duration", Float.valueOf(f));
                        yqo.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
                        yqo.b(jSONObject, "deviceVolume", Float.valueOf(w5p.b().b));
                        uioVar.e.d(RequestBuilder.ACTION_START, jSONObject);
                        break;
                    } else {
                        qp2.o("Invalid Media volume");
                        break;
                    }
                    break;
                case 2:
                    uio uioVar2 = (uio) ((qe6) this.c).b;
                    zch.c(uioVar2);
                    uioVar2.e.d("complete", (JSONObject) null);
                    break;
                case 3:
                    uio uioVar3 = (uio) ((qe6) this.c).b;
                    zch.c(uioVar3);
                    uioVar3.e.d("firstQuartile", (JSONObject) null);
                    break;
                case 4:
                    uio uioVar4 = (uio) ((qe6) this.c).b;
                    zch.c(uioVar4);
                    uioVar4.e.d("midpoint", (JSONObject) null);
                    break;
                case 5:
                    uio uioVar5 = (uio) ((qe6) this.c).b;
                    zch.c(uioVar5);
                    uioVar5.e.d("thirdQuartile", (JSONObject) null);
                    break;
                case 6:
                    ((qe6) this.c).Q(skg.COLLAPSED);
                    break;
                case 7:
                    ((qe6) this.c).Q(skg.FULLSCREEN);
                    d(euoVar.f, pp9.a, "full screen");
                    break;
                case 8:
                    ((qe6) this.c).Q(skg.NORMAL);
                    c(euoVar.f);
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    uio uioVar6 = (uio) ((qe6) this.c).b;
                    zch.c(uioVar6);
                    uioVar6.e.d("pause", (JSONObject) null);
                    break;
                case 11:
                    uio uioVar7 = (uio) ((qe6) this.c).b;
                    zch.c(uioVar7);
                    uioVar7.e.d("resume", (JSONObject) null);
                    break;
                case 12:
                    uio uioVar8 = (uio) ((qe6) this.c).b;
                    zch.c(uioVar8);
                    uioVar8.e.d("skipped", (JSONObject) null);
                    break;
                case 13:
                    ((qe6) this.c).V(0.0f);
                    break;
                case 14:
                    ((qe6) this.c).V(1.0f);
                    break;
            }
        }
    }
}
