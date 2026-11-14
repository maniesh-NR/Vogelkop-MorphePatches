package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class bzo implements mro {
    public final Context a;
    public bn b = rbe.B;
    public ltm c;
    public w06 d;
    public double e;
    public fio f;
    public final String g;
    public final pqo h;
    public final mhk i;
    public String j;
    public String k;
    public String l;
    public String m;
    public ArrayList n;

    public bzo(Context context, String str, dro droVar) {
        pqo pqoVar = new pqo();
        pqoVar.e = (byte) 7;
        pqoVar.f = true;
        this.h = pqoVar;
        this.i = (mhk) phf.a.b;
        this.a = context.getApplicationContext();
        this.g = str;
        pqoVar.a = str;
        pqoVar.d = droVar;
    }

    public l0p a() {
        return new ga6((Object) this, (byte) 21);
    }

    public abstract boolean b(vho vhoVar, pqo pqoVar);

    public qyo c(pqo pqoVar) {
        qyo qyoVar = new qyo(this);
        qyoVar.a = new e1p(this.a, this.i, a());
        return qyoVar;
    }

    public final void d(double d, double d2) {
        pqo pqoVar = this.h;
        pqoVar.c = d;
        pqoVar.b = d2;
        if (TextUtils.isEmpty(g1p.h)) {
            tfp tfpVar = (tfp) phf.a.c;
            HandlerThread handlerThread = tfpVar.a;
            if (handlerThread == null || !handlerThread.isAlive()) {
                HandlerThread handlerThread2 = new HandlerThread("GeoLocationHandlerThread");
                tfpVar.a = handlerThread2;
                handlerThread2.start();
                tfpVar.b = new xy0(tfpVar.a.getLooper(), tfpVar);
            } else {
                xy0 xy0Var = tfpVar.b;
                if (xy0Var != null && xy0Var.hasMessages(1000)) {
                    tfpVar.b.removeMessages(1000);
                }
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1000;
            messageObtain.obj = new double[]{d, d2};
            tfpVar.b.sendMessageDelayed(messageObtain, 0L);
        }
    }

    public final void e(ltm ltmVar) {
        String defaultUserAgent;
        String str;
        Context context = this.a;
        this.c = ltmVar;
        gxo gxoVar = gxo.c;
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (RuntimeException unused) {
            defaultUserAgent = null;
        }
        if (TextUtils.isEmpty(defaultUserAgent)) {
            List list = sjo.a;
            try {
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder(" OPR/");
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception unused2) {
                    str = "";
                }
                sb.append(str);
                String str2 = Build.VERSION.RELEASE;
                String str3 = Build.MODEL;
                String str4 = Build.ID;
            } catch (RuntimeException unused3) {
            }
        }
        String strK = this.c.k();
        if (TextUtils.isEmpty(strK) || strK.equals(g1p.g)) {
            return;
        }
        g1p.g = strK;
    }
}
