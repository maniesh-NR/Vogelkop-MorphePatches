package defpackage;

import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class mi implements fi {
    public final xm5 D;
    public final j4c E;
    public final hjf a;
    public final umi b;
    public final hi c;
    public final hi d;
    public final hi e = new hi(this, 2);
    public final hi f = new hi(this, 3);
    public final ii g = new ii((byte) 1);
    public final ii h = new ii((byte) 0);
    public final hi i = new hi(this, 4);
    public final hi j = new hi(this, 5);
    public final hi k = new hi(this, 6);
    public final hi l = new hi(this, 7);
    public final hi m = new hi(this, 10);
    public final hi n = new hi(this, 12);
    public final hi o = new hi(this, 13);
    public final hi p = new hi(this, 14);
    public final ii q = new ii((byte) 2);
    public final hi r = new hi(this, 15);
    public final hi s = new hi(this, 16);
    public final ii t = new ii((byte) 3);
    public final hi u = new hi(this, 17);
    public final hi v = new hi(this, 11);
    public final hi w = new hi(this, 18);
    public final hi x = new hi(this, 19);
    public final hi y = new hi(this, 20);
    public final hi z = new hi(this, 21);
    public final hi A = new hi(this, 22);
    public final hi B = new hi(this, 9);
    public final hi C = new hi(this, 8);

    public mi(hjf hjfVar, umi umiVar) {
        this.a = hjfVar;
        this.b = umiVar;
        final byte b = 0;
        this.c = new hi(this, b);
        final byte b2 = 1;
        this.d = new hi(this, b2);
        this.D = new xm5(new esk(this) { // from class: gi
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Activity, hjf] */
            public final Object get() {
                byte b3 = b;
                mi miVar = this.b;
                switch (b3) {
                    case 0:
                        String[] strArr = OperaApplication.K;
                        return ((OperaApplication) miVar.a.getApplication()).B();
                    default:
                        String[] strArr2 = OperaApplication.K;
                        ?? r0 = miVar.a;
                        OperaApplication operaApplication = (OperaApplication) r0.getApplication();
                        SettingsManager settingsManagerA = miVar.a();
                        ikc ikcVar = (ikc) miVar.C.get();
                        rqd rqdVar = z7f.k;
                        return new ctl(r0, settingsManagerA, ikcVar, ipe.E(operaApplication));
                }
            }
        });
        this.E = new j4c(new esk(this) { // from class: gi
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Activity, hjf] */
            public final Object get() {
                byte b3 = b2;
                mi miVar = this.b;
                switch (b3) {
                    case 0:
                        String[] strArr = OperaApplication.K;
                        return ((OperaApplication) miVar.a.getApplication()).B();
                    default:
                        String[] strArr2 = OperaApplication.K;
                        ?? r0 = miVar.a;
                        OperaApplication operaApplication = (OperaApplication) r0.getApplication();
                        SettingsManager settingsManagerA = miVar.a();
                        ikc ikcVar = (ikc) miVar.C.get();
                        rqd rqdVar = z7f.k;
                        return new ctl(r0, settingsManagerA, ikcVar, ipe.E(operaApplication));
                }
            }
        }, (byte) 1);
    }

    public final SettingsManager a() {
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) this.a.getApplication()).J();
    }

    public final xm5 h() {
        return this.D;
    }
}
