package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class au1 implements Application.ActivityLifecycleCallbacks, p5j {
    public final SettingsManager a;
    public final td2 b;
    public int c;
    public final Context d;
    public final ox3 e;
    public final f4b f;
    public final j4c g;

    public au1(SettingsManager settingsManager, umi umiVar, Context context, ox3 ox3Var, f4b f4bVar, j4c j4cVar) {
        this.a = settingsManager;
        this.b = new td2(umiVar);
        this.d = context;
        this.e = ox3Var;
        this.f = f4bVar;
        this.g = j4cVar;
        settingsManager.F(this);
    }

    public static dq0 a(kag kagVar) {
        int iOrdinal = kagVar.ordinal();
        if (iOrdinal == 0) {
            return dq0.b;
        }
        if (iOrdinal == 1) {
            return dq0.d;
        }
        if (iOrdinal == 2) {
            return dq0.c;
        }
        hai.d();
        return null;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (!"eula_accepted.gdpr".equals(str) || this.c <= 0) {
            return;
        }
        b(this.d, null, 1);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(97:4|(1:6)|7|(1:9)|10|(1:12)|13|(1:(1:16))(1:17)|18|(1:20)(1:21)|22|(1:24)|25|(1:(2:28|(1:30))(1:31))(1:32)|33|(1:(2:36|(1:38))(1:39))(1:40)|41|(2:43|(1:45))|46|(2:48|(1:(1:(1:52))(1:53))(1:54))(1:55)|56|(1:(1:59))(1:60)|61|(1:(1:64))(1:65)|66|(1:68)|69|(2:71|(1:73)(1:74))|75|(1:77)|78|(1:80)|81|(1:83)(1:84)|85|(1:87)|88|2cf|(2:93|(1:95))|96|(1:(2:99|(1:101))(1:102))(1:103)|104|(1:106)|107|(1:109)|110|(1:112)|113|(1:115)|116|(1:118)(1:119)|(1:121)(2:122|(1:(2:125|(1:127)(2:128|129))(1:130))(1:131))|132|(1:136)(1:137)|(1:139)(2:140|141)|153|(1:155)|156|(1:(2:159|(1:161))(1:162))(1:163)|164|(1:166)|167|(1:169)|170|(1:172)(2:173|(1:175)(1:176))|177|(1:179)(1:180)|181|(1:183)|184|(1:186)(3:187|(1:(2:190|(2:192|(1:194)(2:195|196))(1:197))(1:198))(1:199)|200)|201|(1:(2:204|(1:206)(2:207|208))(1:209))(1:210)|211|(1:213)|214|(1:216)|217|(1:(1:222))(2:223|(1:225))|226|(1:(1:231))(17:232|(0)(1:235)|236|(1:238)|(3:240|(1:242)(1:243)|(3:245|(1:250)(1:249)|251))|252|298|253|(1:255)(1:257)|258|(7:264|(1:266)|(1:268)|(1:270)|(1:272)|(1:274)|275)|276|(1:280)|281|(1:283)(2:284|(1:286)(1:287))|288|(2:290|303)(2:291|292))|234|236|(0)|(0)|252|298|253|(0)(0)|258|(7:264|(0)|(0)|(0)|(0)|(0)|275)(0)|276|(1:280)|281|(0)(0)|288|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0719 A[Catch: RuntimeException -> 0x071e, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x071e, blocks: (B:253:0x070f, B:255:0x0719), top: B:298:0x070f }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0873  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r17, android.app.Activity r18, int r19) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au1.b(android.content.Context, android.app.Activity, int):void");
    }

    public final void c(x5f x5fVar, int i) {
        String str;
        if (i == 1) {
            str = "com_appboy_default_notification_channel";
        } else if (i == 2) {
            str = "news";
        } else if (i == 3) {
            str = "livescore";
        } else {
            if (i != 4) {
                qp2.o(sko.i(i, "Unknown notification channel: "));
                return;
            }
            str = "weather_forecast";
        }
        int iM = wbh.m(this.d, str);
        if (iM == -1) {
            if (x5fVar.h) {
                x5fVar.T0(new z91(i, vd0.d));
            }
        } else if (iM == 0) {
            if (x5fVar.h) {
                x5fVar.T0(new z91(i, vd0.c));
            }
        } else if (iM == 1 && x5fVar.h) {
            x5fVar.T0(new z91(i, vd0.b));
        }
    }

    public final void d(x5f x5fVar, int i, String str) {
        h7j h7jVarJ = this.a.j(str);
        x5fVar.M0(i, h7jVarJ.b, h7jVarJ.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.c == 0) {
            b(activity, activity, 1);
        }
        this.c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            b(activity, activity, activity.isFinishing() ? 3 : 2);
        }
    }
}
