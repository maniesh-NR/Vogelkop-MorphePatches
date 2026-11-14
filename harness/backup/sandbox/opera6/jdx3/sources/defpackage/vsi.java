package defpackage;

import J.N;
import android.os.Handler;
import android.os.Looper;
import com.opera.android.browser.SimpleUrlLoader;
import com.opera.android.browser.obml.Platform;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class vsi {
    public final String a;
    public SimpleUrlLoader c;
    public tsi d;
    public tsi e;
    public int f;
    public int h;
    public final h6e j;
    public int b = 1;
    public long g = 150;
    public final Handler i = new Handler(Looper.myLooper());

    public vsi(String str, h6e h6eVar) {
        int iIndexOf = str.indexOf(124);
        this.a = iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
        this.j = h6eVar;
    }

    public static String b() {
        String language = Platform.getLanguage();
        String country = Platform.getCountry();
        return language.equals("zh") ? country.equals("cn") ? "zh-CN" : country.equals("tw") ? "zh-TW" : "zh-HK" : language.equals("pt") ? country.equals("br") ? "pt-BR" : "pt-PT" : language.equals("en") ? country.equals("gb") ? "en-GB" : language : (language.equals("es") && country.equals("es")) ? "es-ES" : language;
    }

    public static ArrayList d(String str, usi usiVar, boolean z) throws JSONException {
        vpb vpbVar;
        ArrayList arrayList = new ArrayList(10);
        try {
            JSONTokener jSONTokener = new JSONTokener(str);
            jSONTokener.skipPast("\"");
            jSONTokener.nextString('\"');
            jSONTokener.skipTo('[');
            try {
                vpbVar = new vpb(jSONTokener);
            } catch (JSONException unused) {
                vpbVar = null;
            }
            if (vpbVar != null) {
                int length = vpbVar.a.length();
                for (int i = 0; i < length; i++) {
                    dri driVarC = usiVar.c(vpbVar, i, z);
                    if (driVarC != null) {
                        arrayList.add(driVarC);
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return arrayList;
    }

    public static dri e(vpb vpbVar, int i) {
        String str;
        Object objB = vpbVar.b(i);
        if (objB instanceof String) {
            return new dri((String) objB, "", "", "", 0, 0, "");
        }
        if (objB instanceof vpb) {
            vpb vpbVar2 = (vpb) objB;
            int length = vpbVar2.a.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    str = null;
                    break;
                }
                Object objB2 = vpbVar2.b(i2);
                if (objB2 instanceof String) {
                    str = (String) objB2;
                    break;
                }
                i2++;
            }
            if (str != null) {
                return new dri(str, "", "", "", 0, 0, "");
            }
        }
        return null;
    }

    public final void a() {
        if (this.b == 2) {
            return;
        }
        SimpleUrlLoader simpleUrlLoader = this.c;
        if (simpleUrlLoader != null) {
            long j = simpleUrlLoader.a;
            if (j != 0) {
                N.Mnq_7cIN(j);
                simpleUrlLoader.a = 0L;
            }
            this.c = null;
        }
        this.e = null;
        this.d = null;
    }

    public final void c(boolean z) {
        int i = this.h;
        if (i <= 0 || z) {
            this.h = i + 1;
            this.i.postDelayed(new ssi(this, (byte) 0), this.g);
        }
    }

    public final void f(tsi tsiVar) {
        this.d = tsiVar;
        this.e = null;
        SimpleUrlLoader simpleUrlLoaderA = SimpleUrlLoader.a(tsiVar.d.toString(), "", null);
        long j = simpleUrlLoaderA.a;
        if (j != 0) {
            N.M71SD119(j, 20);
        }
        this.c = simpleUrlLoaderA;
        N.MpBW0XH2(simpleUrlLoaderA.a, tsiVar.b, new m25(this, simpleUrlLoaderA, tsiVar, (byte) 1), new eb((Object) this, (Object) simpleUrlLoaderA, (byte) 6));
    }
}
