package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.ViewGroup;
import com.google.android.gms.common.GoogleApiAvailability;
import com.leanplum.internal.Constants;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import com.opera.android.crashhandler.MainProcessCrashHandler;
import com.opera.android.esim.ui.EsimActivity;
import com.opera.android.settings.SettingsManager;
import com.opera.android.weather.ui.WeatherWidgetActivity;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class ay extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    public ay(MainProcessCrashHandler mainProcessCrashHandler, OperaApplication operaApplication) {
        this.e = (byte) 7;
        this.f = operaApplication;
    }

    public /* synthetic */ ay(Object obj, byte b) {
        this.e = b;
        this.f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.Lazy
    public final Object d() throws IOException, ClassNotFoundException {
        fc7 fc7Var;
        esd esdVarX;
        byte b = this.e;
        final byte b2 = 2;
        Object[] objArr = 0;
        final byte b3 = 1;
        Object obj = this.f;
        switch (b) {
            case 0:
                cy cyVar = (cy) obj;
                if (((wy) ((tw2) cyVar.c).b).T()) {
                    return new ml(null);
                }
                SharedPreferences sharedPreferences = (SharedPreferences) ((b59) cyVar.d).get();
                long j = sharedPreferences.getLong("controller_config_timestamp", 0L);
                if (j > 0 && System.currentTimeMillis() > j + 1296000000) {
                    cy.a(sharedPreferences);
                    return new ml(null);
                }
                String string = sharedPreferences.getString("controller_config_url", null);
                if (string == null || string.equals(((Uri) ((r9i) ((sy) cyVar.f).get()).b).toString())) {
                    return new ml(cyVar.b());
                }
                cy.a(sharedPreferences);
                return new ml(null);
            case 1:
                return new ocd(((wy) obj).n);
            case 2:
                AutofillPasswordPickerActivity autofillPasswordPickerActivity = (AutofillPasswordPickerActivity) ((d5o) obj).b;
                gjm gjmVar = new gjm(autofillPasswordPickerActivity.getSupportFragmentManager(), autofillPasswordPickerActivity.getLifecycle(), new f32((byte) 9));
                Object[] objArrCopyOf = Arrays.copyOf(new fj[]{new fj((byte) 2)}, 1);
                gjmVar.d.addAll(objArrCopyOf.length > 0 ? Arrays.asList(objArrCopyOf) : l08.a);
                return gjmVar;
            case 3:
                x65 x65Var = (x65) obj;
                r65 r65Var = x65Var.d;
                boolean z = x65Var.m;
                r65Var.getClass();
                return new p65(z, r65Var);
            case 4:
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(((gc7) obj).a.getAssets().open("distribution"));
                    char[] cArr = new char[Constants.Crypt.KEY_LENGTH];
                    int i = inputStreamReader.read(cArr);
                    inputStreamReader.close();
                    String[] strArrSplit = new String(cArr, 0, i).split(":");
                    return new fc7(strArrSplit[0], strArrSplit[1]);
                } catch (IOException unused) {
                    fc7Var = new fc7("IOException", "IOException");
                    return fc7Var;
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    fc7Var = new fc7("ArrayIndexOutOfBoundsException", "ArrayIndexOutOfBoundsException");
                    return fc7Var;
                }
            case 5:
                try {
                    Class.forName((String) ((k8) obj).a, false, qyf.class.getClassLoader());
                    return Boolean.TRUE;
                } catch (ClassNotFoundException unused3) {
                    return Boolean.FALSE;
                }
            case 6:
                final EsimActivity esimActivity = (EsimActivity) obj;
                final Object[] objArr2 = objArr == true ? 1 : 0;
                esk eskVar = new esk() { // from class: v68
                    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, android.content.Context, com.opera.android.esim.ui.EsimActivity, dx3] */
                    public final Object get() {
                        byte b4 = objArr2;
                        ?? r2 = esimActivity;
                        switch (b4) {
                            case 0:
                                ro7 ro7Var = so7.k;
                                return (ro7) ((so7) no7.n(r2.getApplicationContext(), io7.G, so7.l)).i();
                            case 1:
                                return r2.getPackageManager();
                            case 2:
                                String[] strArr = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().c;
                            case 3:
                                String[] strArr2 = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().f;
                            case 4:
                                qim qimVar = r2.o;
                                Objects.requireNonNull(qimVar);
                                return qimVar.c;
                            default:
                                return ru9.c(r2);
                        }
                    }
                };
                esk eskVar2 = new esk() { // from class: v68
                    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, android.content.Context, com.opera.android.esim.ui.EsimActivity, dx3] */
                    public final Object get() {
                        byte b4 = b3;
                        ?? r2 = esimActivity;
                        switch (b4) {
                            case 0:
                                ro7 ro7Var = so7.k;
                                return (ro7) ((so7) no7.n(r2.getApplicationContext(), io7.G, so7.l)).i();
                            case 1:
                                return r2.getPackageManager();
                            case 2:
                                String[] strArr = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().c;
                            case 3:
                                String[] strArr2 = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().f;
                            case 4:
                                qim qimVar = r2.o;
                                Objects.requireNonNull(qimVar);
                                return qimVar.c;
                            default:
                                return ru9.c(r2);
                        }
                    }
                };
                u68 u68Var = new u68(esimActivity, b3);
                final byte b4 = 3;
                final byte b5 = 4;
                final byte b6 = 5;
                vo7 vo7Var = new vo7(eskVar, eskVar2, u68Var, new yqa((Object) new esk() { // from class: v68
                    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, android.content.Context, com.opera.android.esim.ui.EsimActivity, dx3] */
                    public final Object get() {
                        byte b42 = b2;
                        ?? r2 = esimActivity;
                        switch (b42) {
                            case 0:
                                ro7 ro7Var = so7.k;
                                return (ro7) ((so7) no7.n(r2.getApplicationContext(), io7.G, so7.l)).i();
                            case 1:
                                return r2.getPackageManager();
                            case 2:
                                String[] strArr = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().c;
                            case 3:
                                String[] strArr2 = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().f;
                            case 4:
                                qim qimVar = r2.o;
                                Objects.requireNonNull(qimVar);
                                return qimVar.c;
                            default:
                                return ru9.c(r2);
                        }
                    }
                }, (Object) new esk() { // from class: v68
                    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, android.content.Context, com.opera.android.esim.ui.EsimActivity, dx3] */
                    public final Object get() {
                        byte b42 = b4;
                        ?? r2 = esimActivity;
                        switch (b42) {
                            case 0:
                                ro7 ro7Var = so7.k;
                                return (ro7) ((so7) no7.n(r2.getApplicationContext(), io7.G, so7.l)).i();
                            case 1:
                                return r2.getPackageManager();
                            case 2:
                                String[] strArr = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().c;
                            case 3:
                                String[] strArr2 = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().f;
                            case 4:
                                qim qimVar = r2.o;
                                Objects.requireNonNull(qimVar);
                                return qimVar.c;
                            default:
                                return ru9.c(r2);
                        }
                    }
                }, (byte) 13), new kw3((byte) 8), new qq6(new esk() { // from class: v68
                    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, android.content.Context, com.opera.android.esim.ui.EsimActivity, dx3] */
                    public final Object get() {
                        byte b42 = b5;
                        ?? r2 = esimActivity;
                        switch (b42) {
                            case 0:
                                ro7 ro7Var = so7.k;
                                return (ro7) ((so7) no7.n(r2.getApplicationContext(), io7.G, so7.l)).i();
                            case 1:
                                return r2.getPackageManager();
                            case 2:
                                String[] strArr = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().c;
                            case 3:
                                String[] strArr2 = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().f;
                            case 4:
                                qim qimVar = r2.o;
                                Objects.requireNonNull(qimVar);
                                return qimVar.c;
                            default:
                                return ru9.c(r2);
                        }
                    }
                }, (byte) 7), new esk() { // from class: v68
                    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, android.content.Context, com.opera.android.esim.ui.EsimActivity, dx3] */
                    public final Object get() {
                        byte b42 = b6;
                        ?? r2 = esimActivity;
                        switch (b42) {
                            case 0:
                                ro7 ro7Var = so7.k;
                                return (ro7) ((so7) no7.n(r2.getApplicationContext(), io7.G, so7.l)).i();
                            case 1:
                                return r2.getPackageManager();
                            case 2:
                                String[] strArr = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().c;
                            case 3:
                                String[] strArr2 = OperaApplication.K;
                                return ((OperaApplication) r2.getApplication()).L().f;
                            case 4:
                                qim qimVar = r2.o;
                                Objects.requireNonNull(qimVar);
                                return qimVar.c;
                            default:
                                return ru9.c(r2);
                        }
                    }
                });
                esimActivity.getLifecycle().a(vo7Var);
                return vo7Var;
            case 7:
                File cacheDir = ((OperaApplication) obj).getCacheDir();
                pz5 pz5Var = new pz5(cacheDir);
                File file = new File(cacheDir, "crash_dumps");
                if (!file.exists()) {
                    HashSet hashSet = s29.a;
                    file.mkdir();
                }
                File file2 = new File(cacheDir, "Crashpad");
                if (!file2.exists()) {
                    HashSet hashSet2 = s29.a;
                    file2.mkdir();
                }
                return pz5Var;
            case 8:
                gbf gbfVar = (gbf) obj;
                pt3 pt3Var = gbfVar.r;
                fbf fbfVar = new fbf(gbfVar);
                xd5 xd5Var = pt3Var.b;
                int i2 = BrowserActivity.E1;
                xd5Var.getClass();
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) xd5Var.getApplication();
                umi umiVar = xd5Var.x;
                ViewGroup viewGroup = (ViewGroup) xd5Var.findViewById(2131362656);
                j4c j4cVar = xd5Var.w1;
                SettingsManager settingsManagerH0 = xd5Var.H0();
                tw3 tw3Var = xd5Var.y;
                hx3 hx3Var = tw3Var.a;
                iv7 iv7Var = (iv7) hx3Var.l.get();
                k6l k6lVar = xd5Var.V;
                if (k6lVar == null) {
                    k6lVar = null;
                }
                ipk ipkVarL0 = xd5Var.L0();
                wcd wcdVar = (wcd) tw3Var.y0.get();
                ClipboardManager clipboardManager = (ClipboardManager) xd5Var.getSystemService("clipboard");
                pde pdeVar = ((mbf) tw3Var.F.get()).e;
                wt3 wt3Var = new wt3(xd5Var, (byte) 21);
                qim qimVar = xd5Var.o;
                Objects.requireNonNull(qimVar);
                yz9 yz9Var = (yz9) xd5Var.B1.getValue();
                lg lgVarM = xd5Var.M();
                m6m m6mVar = xd5Var.Y;
                s28 s28Var = xd5Var.O;
                gbf gbfVar2 = xd5Var.M;
                if (gbfVar2 == null) {
                    gbfVar2 = null;
                }
                ode odeVar = gbfVar2.A;
                if (odeVar.g() == null) {
                    odeVar.r(gbfVar2.b.a());
                }
                d6j d6jVarL = operaApplication.L();
                xv1 xv1Var = operaApplication.r;
                x5f x5fVar = d6jVarL.c;
                x5f x5fVar2 = operaApplication.L().d;
                gbf gbfVar3 = xd5Var.M;
                if (gbfVar3 == null) {
                    gbfVar3 = null;
                }
                dbf dbfVar = gbfVar3.m;
                qdh qdhVar = (qdh) xv1Var.A0.get();
                br6 br6Var = (br6) xv1Var.h0.get();
                osf osfVar = operaApplication.L().f;
                mdh mdhVarG = operaApplication.G();
                i53 i53VarG = operaApplication.g();
                nr8 nr8VarO = operaApplication.o();
                qr8 qr8Var = (qr8) xd5Var.g0.E(qr8.class);
                nv2 nv2Var = (nv2) hx3Var.m().get();
                gjm gjmVarP0 = xd5Var.P0();
                nwf nwfVar = new nwf(new hv3(xd5Var), new pt3(xd5Var, (byte) 13), (byte) 3);
                m0a m0aVar = (m0a) tw3Var.F0.get();
                hw3 hw3Var = tw3Var.t0;
                ky1 ky1Var = (ky1) tw3Var.s0.get();
                jv3 jv3Var = xd5Var.F0;
                qim qimVar2 = xd5Var.o;
                Objects.requireNonNull(qimVar2);
                return new zqi(umiVar, xd5Var, viewGroup, fbfVar, j4cVar, settingsManagerH0, iv7Var, k6lVar, ipkVarL0, wcdVar, clipboardManager, pdeVar, wt3Var, qimVar, yz9Var, lgVarM, m6mVar, s28Var, odeVar, x5fVar, x5fVar2, dbfVar, qdhVar, br6Var, osfVar, mdhVarG, i53VarG, nr8VarO, qr8Var, nv2Var, gjmVarP0, nwfVar, m0aVar, hw3Var, ky1Var, jv3Var, new x77((Object) qimVar2, (Object) new eme((BrowserActivity) xd5Var), (byte) 9), xd5Var.E0, tw3Var.A0, hx3Var.q, tw3Var.H0);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ArrayList arrayList = new ArrayList(200);
                try {
                    ((ukf) obj).a(arrayList);
                } catch (IOException unused4) {
                    arrayList.clear();
                }
                return arrayList;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                Context context = ((dyf) obj).a;
                String[] strArr2 = OperaApplication.K;
                OperaApplication operaApplication2 = (OperaApplication) context.getApplicationContext();
                cqe cqeVar = bqe.k;
                return new p0c(uup.r(context), operaApplication2.J());
            case 11:
                return Boolean.valueOf(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(((jtg) obj).a) == 0);
            case 12:
                z7 z7Var = (z7) ((mvh) obj).b;
                String str = z7Var.d;
                if (str != null) {
                    String strConcat = str.concat("; charset=UTF-8");
                    Regex regex = esd.e;
                    try {
                        esdVarX = wyh.x(strConcat);
                    } catch (IllegalArgumentException unused5) {
                    }
                } else {
                    esdVarX = null;
                }
                return rvh.create(z7Var.a(), esdVarX);
            case 13:
                return new kze(((qln) obj).j());
            default:
                String[] strArr3 = OperaApplication.K;
                OperaApplication operaApplication3 = (OperaApplication) ((WeatherWidgetActivity) obj).getApplication();
                return new sk6(((lpe) operaApplication3.A.get()).c, operaApplication3.J());
        }
    }
}
