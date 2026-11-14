package defpackage;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import com.leanplum.internal.Util;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.bookmarks.BookmarksBridge;
import com.opera.android.browser.BrowserContainer;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final /* synthetic */ class qj2 implements ni {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qj2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [android.app.Activity, com.opera.android.BrowserActivity, fp1, t5d] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    @Override // defpackage.ni
    public final void a(int i, Intent intent) throws SecurityException, IllegalArgumentException {
        String stringExtra;
        Object next;
        Size size;
        byte b = this.a;
        Uri data = null;
        data = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                sj2 sj2Var = (sj2) obj;
                rj2 rj2Var = (rj2) sj2Var.d;
                if (i == -1) {
                    rj2Var.Y();
                    sj2Var.i();
                    break;
                } else {
                    rj2Var.c0();
                    break;
                }
            case 1:
                im3 im3Var = (im3) obj;
                if (i != 0 && intent != null) {
                    Uri data2 = intent.getData();
                    if (i != -1 || data2 == null || (intent.getFlags() & 2) != 2) {
                        im3Var.n.f(new glj(2132018970, 5000));
                        break;
                    } else {
                        qim qimVar = q9n.o(im3Var.getActivity()).o;
                        Objects.requireNonNull(qimVar);
                        String string = data2.toString();
                        wx wxVar = new wx((Object) im3Var, (Object) qimVar, (byte) 18);
                        i7f i7fVar = BookmarksBridge.a;
                        N.M6usCwUF(string, wxVar);
                        break;
                    }
                }
                break;
            case 2:
                ilm ilmVar = (ilm) obj;
                int i2 = BrowserActivity.E1;
                ilmVar.run(Boolean.valueOf(i == -1));
                break;
            case 3:
                d2b d2bVar = (d2b) obj;
                if (i == -1) {
                    d2bVar.invoke();
                    break;
                }
                break;
            case 4:
                p2b p2bVar = (p2b) obj;
                if (i == -1) {
                    p2bVar.invoke();
                    break;
                }
                break;
            case 5:
                p2b p2bVar2 = (p2b) obj;
                if (i == -1) {
                    p2bVar2.invoke();
                    break;
                }
                break;
            case 6:
                p2b p2bVar3 = (p2b) obj;
                if (i == -1) {
                    p2bVar3.invoke();
                    break;
                }
                break;
            case 7:
                f3b f3bVar = (f3b) obj;
                if (i == -1) {
                    f3bVar.invoke();
                    break;
                }
                break;
            case 8:
                fge fgeVar = (fge) obj;
                if (i == -1 && intent != null && intent.getData() != null && "content".equals(intent.getScheme())) {
                    Uri data3 = intent.getData();
                    fgeVar.r.getContentResolver().takePersistableUriPermission(data3, 1);
                    fgeVar.H0(data3, null);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((hpd) obj).run();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                f6g f6gVar = (f6g) obj;
                if (i != 0 && intent != null) {
                    if ((intent.getFlags() & 2) == 2 && i == -1) {
                        data = intent.getData();
                    }
                    bjf bjfVar = f6gVar.y;
                    if (data != null) {
                        f6gVar.J0().g.getClass();
                        N.MK6CSGnD(data.toString(), bjfVar);
                        break;
                    } else {
                        bjfVar.a(false);
                        break;
                    }
                }
                break;
            case 11:
                ((vdf) obj).run();
                break;
            case 12:
                hv3 hv3Var = (hv3) obj;
                if (i == -1 && intent != null) {
                    Bundle bundleExtra = intent.getBundleExtra("scan-result");
                    byte b2 = 8;
                    if (bundleExtra != null) {
                        String string2 = bundleExtra.getString("raw-value");
                        if (string2 == null) {
                            string2 = "";
                        }
                        hmi hmiVarE = y4h.e(string2, bundleExtra.getInt("value-type"), (gmi) gmi.d.get(bundleExtra.getInt("format")));
                        ?? r9 = hv3Var.a;
                        fmi fmiVar = hmiVarE.d;
                        gmi gmiVar = hmiVarE.c;
                        if (fmiVar instanceof bmi) {
                            gbf gbfVar = r9.M;
                            if (gbfVar == null) {
                                gbfVar = null;
                            }
                            gbfVar.m(false);
                            String str = ((bmi) fmiVar).a;
                            if (c.q(str, "fido:/", true)) {
                                try {
                                    r9.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                } catch (ActivityNotFoundException unused) {
                                }
                                hv3Var.a(2, gmiVar, 8);
                            }
                        } else if (fmiVar instanceof emi) {
                            gbf gbfVar2 = r9.M;
                            if (gbfVar2 == null) {
                                gbfVar2 = null;
                            }
                            gbfVar2.m(false);
                            l1o l1oVar = ((emi) fmiVar).b;
                            if (Build.VERSION.SDK_INT >= 30) {
                                try {
                                    t0h.r(l1oVar, (Activity) r9);
                                    hv3Var.a(2, gmiVar, 9);
                                } catch (IllegalArgumentException | IllegalStateException unused2) {
                                }
                            }
                        } else if (fmiVar instanceof cmi) {
                            cmi cmiVar = (cmi) fmiVar;
                            r9.d0.K(cmiVar.a, 7, false, 1, false, null);
                            hv3Var.a(3, gmiVar, cmiVar.b);
                        } else if (!(fmiVar instanceof dmi)) {
                            h9o.p();
                            break;
                        } else {
                            umi umiVar = r9.x;
                            String str2 = ((dmi) fmiVar).a;
                            if (c09.t((Context) r9, umiVar, str2, true, new iu2(hv3Var, (byte) 7))) {
                                gbf gbfVar3 = r9.M;
                                if (gbfVar3 == null) {
                                    gbfVar3 = null;
                                }
                                gbfVar3.m(false);
                                hv3Var.a(2, gmiVar, 8);
                            } else {
                                ulg ulgVar = (ulg) r9.Y0.getValue();
                                String str3 = ((aml) ulgVar.b.i()).e;
                                if (!str3.isEmpty() && str3.startsWith("https://") && str2.startsWith(str3)) {
                                    String str4 = (String) ulgVar.d.get();
                                    if (str4 == null) {
                                        ulgVar.f = null;
                                        vml.c(new q2g(ulgVar, "Error: No leanplum token, are Opera notifications disabled?", (byte) 6));
                                    } else {
                                        RealCall realCall = ulgVar.f;
                                        if (realCall != null) {
                                            realCall.cancel();
                                        }
                                        t9f t9fVar = (t9f) ulgVar.a.get();
                                        fvh fvhVar = new fvh();
                                        fvhVar.h(str2);
                                        fvhVar.d("leanplum-fcm-token", str4);
                                        fvhVar.d("leanplum-id", ulgVar.c.b());
                                        fvhVar.d("leanplum-app-id", "app_sxoB1f2yjpKREigcunDkrki2Lxy1KG5wdgEe6QsHmnk");
                                        fvhVar.d("leanplum-device-model", Util.getDeviceModel());
                                        RealCall realCallC = t9fVar.c(new kvh(fvhVar));
                                        ulgVar.f = realCallC;
                                        realCallC.enqueue(ulgVar);
                                    }
                                    gbf gbfVar4 = r9.M;
                                    if (gbfVar4 == null) {
                                        gbfVar4 = null;
                                    }
                                    gbfVar4.m(false);
                                    hv3Var.a(2, gmiVar, 8);
                                } else {
                                    gbf gbfVar5 = r9.M;
                                    if (gbfVar5 == null) {
                                        gbfVar5 = null;
                                    }
                                    gbfVar5.k(str2);
                                    xbf xbfVarG = gbfVar5.t.y().g();
                                    sko.s(((esk) xbfVarG.e).get());
                                    wbf wbfVar = new wbf(xbfVarG, rkk.b, 0, lqm.i);
                                    wbfVar.b();
                                    int iOrdinal = wbfVar.d.ordinal();
                                    hv3Var.a(iOrdinal != 1 ? iOrdinal != 2 ? 1 : 3 : 2, gmiVar, 8);
                                }
                            }
                        }
                    }
                    byte[] byteArrayExtra = intent.getByteArrayExtra("google-lens-image-data");
                    if (byteArrayExtra != null) {
                        int intExtra = intent.getIntExtra("google-lens-image-width", 0);
                        int intExtra2 = intent.getIntExtra("google-lens-image-height", 0);
                        hv3Var.getClass();
                        ?? r92 = hv3Var.a;
                        String[] strArr = OperaApplication.K;
                        Iterator it = Collections.unmodifiableList(((OperaApplication) r92.getApplication()).I().a).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                eri eriVar = (eri) next;
                                q6e q6eVar = eti.a;
                                if (!(eriVar == null ? false : eriVar instanceof f1a) || !eriVar.c()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        eri eriVar2 = (eri) next;
                        int i3 = BrowserActivity.E1;
                        b2l b2lVarW0 = r92.w0();
                        if (b2lVarW0 != null && eriVar2 != null) {
                            Size size2 = new Size(intExtra, intExtra2);
                            new Size(intExtra, intExtra2);
                            BrowserContainer browserContainer = r92.B;
                            if ((browserContainer != null ? browserContainer : null).isLaidOut()) {
                                dtl dtlVar = (dtl) r92.e0().b.a.b;
                                int i4 = dtlVar.a + dtlVar.c;
                                float f = r92.getResources().getDisplayMetrics().density;
                                size = new Size((int) Math.ceil(r7.getWidth() / f), (int) Math.ceil((r7.getHeight() - i4) / f));
                            } else {
                                size = new Size(0, 0);
                            }
                            lsc lscVarG = eriVar2.g(byteArrayExtra, size2, size, "");
                            d7l d7lVarI0 = r92.i0(((d7l) b2lVarW0).j.m(), b2lVarW0, false, lqm.l, null);
                            if (lscVarG.i != null && ic4.v(Uri.parse(lscVarG.a))) {
                                d7lVarI0.F(new qz(lscVarG, b2));
                            }
                            d7lVarI0.Z(lscVarG);
                            String[] strArr2 = OperaApplication.K;
                            ((OperaApplication) r92.getApplication()).L().c.S(32);
                            break;
                        }
                    }
                } else if (i == 1 && intent != null && (stringExtra = intent.getStringExtra("error-message")) != null) {
                    joh.h(hv3Var.a.J0(), new qxh(stringExtra));
                    break;
                }
                break;
            case 13:
                Callback callback = (Callback) obj;
                if (i == -1 && intent != null && intent.getData() != null) {
                    callback.run(intent.getData());
                    break;
                }
                break;
            case 14:
                iyk iykVar = (iyk) obj;
                if (i == -1 && intent != null) {
                    ArrayList arrayList = new ArrayList();
                    ClipData clipData = intent.getClipData();
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i5 = 0; i5 < itemCount; i5++) {
                            Uri uri = clipData.getItemAt(i5).getUri();
                            if (uri != null) {
                                arrayList.add(uri);
                            }
                        }
                    } else {
                        Uri data4 = intent.getData();
                        if (data4 != null) {
                            arrayList.add(data4);
                        }
                    }
                    iykVar.run(arrayList);
                    break;
                }
                break;
            case 15:
                o32 o32Var = (o32) obj;
                if (i == -1) {
                    o32Var.run();
                    break;
                }
                break;
            default:
                Function1 function1 = (Function1) obj;
                if (i == -1) {
                    ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("android.speech.extra.RESULTS") : null;
                    function1.invoke(stringArrayListExtra != null ? (String) CollectionsKt.firstOrNull(stringArrayListExtra) : null);
                    break;
                } else {
                    function1.invoke((Object) null);
                    break;
                }
        }
    }
}
