package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.ads.interactivemedia.v3.impl.ImaSdkSettingsImpl;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.impl.data.zzbn;
import com.google.ads.interactivemedia.v3.internal.zzog;
import com.google.ads.interactivemedia.v3.internal.zzoh;
import com.google.ads.interactivemedia.v3.internal.zzpn;
import com.google.ads.interactivemedia.v3.internal.zztt;
import com.google.ads.interactivemedia.v3.internal.zzvt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.leanplum.core.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class wpp {
    public final mbi g;
    public final String h;
    public final plk i;
    public final float k;
    public final ExecutorService l;
    public final TestingConfiguration m;
    public final TaskCompletionSource n;
    public final TaskCompletionSource o;
    public oam p;
    public rqp q;
    public long r;
    public boolean s;
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ConcurrentLinkedQueue j = new ConcurrentLinkedQueue();

    public wpp(plk plkVar, mbi mbiVar, Uri uri, ImaSdkSettingsImpl imaSdkSettingsImpl, ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.n = taskCompletionSource;
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        this.o = taskCompletionSource2;
        this.s = false;
        this.g = mbiVar;
        this.k = mbiVar.getResources().getDisplayMetrics().density;
        boolean zB = axn.b("WEB_MESSAGE_LISTENER");
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("sdk_version", "a.3.31.0").appendQueryParameter("hl", imaSdkSettingsImpl.getLanguage()).appendQueryParameter("omv", "1.4.8-google_20230803").appendQueryParameter("app", mbiVar.getApplicationContext().getPackageName());
        builderAppendQueryParameter.appendQueryParameter("mt", true != zB ? BuildConfig.BUILD_NUMBER : "4");
        if (imaSdkSettingsImpl.getTestingConfig() != null) {
            zztt zzttVar = new zztt();
            zzttVar.d.add(new zzoh());
            zzog zzogVar = new zzog();
            zzvt zzvtVar = zzttVar.a;
            zzvt zzvtVarC = zzvtVar.c();
            ArrayList arrayList = new ArrayList(zzvtVar.a);
            zzvtVarC.a = arrayList;
            arrayList.add(zzogVar);
            zzttVar.a = zzvtVarC;
            builderAppendQueryParameter.appendQueryParameter("tcnfp", zzttVar.a().d(imaSdkSettingsImpl.getTestingConfig()));
        }
        this.h = builderAppendQueryParameter.build().toString();
        this.m = imaSdkSettingsImpl.getTestingConfig();
        this.i = plkVar;
        plkVar.c = this;
        this.l = executorService;
        Tasks.whenAllComplete(new Task[]{taskCompletionSource2.getTask(), taskCompletionSource.getTask()}).addOnCompleteListener(new ppp(this));
    }

    public final void a(wmb wmbVar) {
        wmbVar.a.name();
        wmbVar.d.name();
        ConcurrentLinkedQueue concurrentLinkedQueue = this.j;
        concurrentLinkedQueue.add(wmbVar);
        if (this.s) {
            for (wmb wmbVar2 = (wmb) concurrentLinkedQueue.poll(); wmbVar2 != null; wmbVar2 = (wmb) concurrentLinkedQueue.poll()) {
                plk plkVar = this.i;
                plkVar.getClass();
                ((Handler) plkVar.b).post(new wr9(plkVar, wmbVar2, (byte) 29));
            }
        }
    }

    public final void b(JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel, JavaScriptMessage$MsgType javaScriptMessage$MsgType, String str, zzbn zzbnVar) {
        Timer timer;
        String str2;
        mjd mjdVar;
        Timer timer2;
        kqp kqpVar = (kqp) this.f.get(str);
        if (kqpVar == null) {
            String.valueOf(javaScriptMessage$MsgChannel);
            String.valueOf(javaScriptMessage$MsgType);
            return;
        }
        vsp vspVar = kqpVar.e;
        t9l t9lVar = kqpVar.a;
        zzpn zzpnVar = kqpVar.f;
        jn jnVar = (jn) zzpnVar.get(javaScriptMessage$MsgChannel);
        int iOrdinal = javaScriptMessage$MsgType.ordinal();
        boolean z = true;
        if (iOrdinal != 34) {
            byte b = 17;
            int i = 0;
            if (iOrdinal == 43) {
                if (zzbnVar == null || (str2 = zzbnVar.videoUrl) == null) {
                    kqpVar.b.p(new jvg(new dm(1, 1, "Load message must contain video url."), b));
                    return;
                }
                vspVar.c = true;
                jn jnVar2 = new jn();
                zzpnVar.j(javaScriptMessage$MsgChannel, jnVar2);
                t9lVar.a = jnVar2;
                ujo ujoVar = (ujo) t9lVar.b;
                qjd qjdVar = qjd.h;
                fjd fjdVar = new fjd();
                ijd ijdVar = new ijd();
                List list = Collections.EMPTY_LIST;
                a1b a1bVar = h1b.b;
                csh cshVar = csh.e;
                kjd kjdVar = new kjd();
                njd njdVar = njd.d;
                Uri uri = Uri.parse(str2);
                if (((Uri) ijdVar.e) != null && ((UUID) ijdVar.d) == null) {
                    z = false;
                }
                z4o.H(z);
                if (uri != null) {
                    mjdVar = new mjd(uri, (String) null, ((UUID) ijdVar.d) != null ? new jjd(ijdVar) : null, (djd) null, list, (String) null, cshVar, -9223372036854775807L);
                } else {
                    mjdVar = null;
                }
                qjd qjdVar2 = new qjd("", new hjd(fjdVar), mjdVar, new ljd(kjdVar), vjd.K, njdVar);
                qi8 qi8Var = ujoVar.a;
                qi8Var.E(qjdVar2);
                qi8Var.a();
                ujoVar.c = (short) 4;
                ((n9h) t9lVar.d).c = jnVar2;
                return;
            }
            if (iOrdinal != 73) {
                if (iOrdinal == 53) {
                    if (((jn) t9lVar.a) == jnVar) {
                        ujo ujoVar2 = (ujo) t9lVar.b;
                        qi8 qi8Var2 = ujoVar2.a;
                        if ((ujoVar2.c & 1) != 0 && qi8Var2.e0()) {
                            qi8Var2.setPlayWhenReady(false);
                            ujoVar2.g = qi8Var2.getCurrentPosition();
                            n9h n9hVar = ujoVar2.d;
                            if (n9hVar != null && ((jn) n9hVar.c) != null) {
                                ArrayList arrayList = (ArrayList) n9hVar.b;
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    vsp vspVar2 = (vsp) obj;
                                    jn jnVar3 = (jn) n9hVar.c;
                                    if (vspVar2.c) {
                                        vspVar2.a(JavaScriptMessage$MsgType.pause, jnVar3, (Object) null);
                                    }
                                }
                            }
                            ujoVar2.c = (short) 33;
                        }
                        d7h d7hVar = (d7h) t9lVar.c;
                        if (d7hVar == null || (timer2 = (Timer) d7hVar.b) == null) {
                            return;
                        }
                        timer2.cancel();
                        ((Timer) d7hVar.b).purge();
                        d7hVar.b = null;
                        return;
                    }
                    return;
                }
                if (iOrdinal == 54) {
                    if (((jn) t9lVar.a) == jnVar) {
                        ujo ujoVar3 = (ujo) t9lVar.b;
                        if ((ujoVar3.c & 1) != 0) {
                            ujoVar3.a.setPlayWhenReady(true);
                            if (ujoVar3.g <= 0) {
                                n9h n9hVar2 = ujoVar3.d;
                                if (n9hVar2 != null && ((jn) n9hVar2.c) != null) {
                                    ArrayList arrayList2 = (ArrayList) n9hVar2.b;
                                    int size2 = arrayList2.size();
                                    while (i < size2) {
                                        Object obj2 = arrayList2.get(i);
                                        i++;
                                        ((vsp) obj2).getClass();
                                    }
                                }
                            } else {
                                ujoVar3.g = 0L;
                                n9h n9hVar3 = ujoVar3.d;
                                if (n9hVar3 != null && ((jn) n9hVar3.c) != null) {
                                    ArrayList arrayList3 = (ArrayList) n9hVar3.b;
                                    int size3 = arrayList3.size();
                                    while (i < size3) {
                                        Object obj3 = arrayList3.get(i);
                                        i++;
                                        vsp vspVar3 = (vsp) obj3;
                                        jn jnVar4 = (jn) n9hVar3.c;
                                        if (vspVar3.c) {
                                            vspVar3.a(JavaScriptMessage$MsgType.play, jnVar4, (Object) null);
                                        }
                                    }
                                }
                            }
                            ujoVar3.c = (short) 17;
                        }
                        d7h d7hVar2 = (d7h) t9lVar.c;
                        if (d7hVar2 == null) {
                            d7hVar2 = new d7h(new dgo(t9lVar, (byte) 2));
                            t9lVar.c = d7hVar2;
                        }
                        if (((Timer) d7hVar2.b) == null) {
                            d7hVar2.b = new Timer();
                            ((Timer) d7hVar2.b).schedule(new u71(d7hVar2, (byte) 1), 250L, 250L);
                        }
                    }
                    vspVar.c = true;
                    return;
                }
                return;
            }
        }
        if (((jn) t9lVar.a) == jnVar) {
            d7h d7hVar3 = (d7h) t9lVar.c;
            if (d7hVar3 != null && (timer = (Timer) d7hVar3.b) != null) {
                timer.cancel();
                ((Timer) d7hVar3.b).purge();
                d7hVar3.b = null;
            }
            ujo ujoVar4 = (ujo) t9lVar.b;
            if ((ujoVar4.c & 1) != 0) {
                ujoVar4.a.stop();
                ujoVar4.c = (short) 128;
            }
        }
        zzpnVar.remove(javaScriptMessage$MsgChannel);
    }
}
