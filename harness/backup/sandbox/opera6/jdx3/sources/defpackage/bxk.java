package defpackage;

import J.N;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.webkit.WebViewStartUpConfig;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.ads.interactivemedia.v3.impl.data.zzbn;
import com.google.ads.interactivemedia.v3.internal.zzdv;
import com.google.ads.interactivemedia.v3.internal.zzeg;
import com.google.ads.interactivemedia.v3.internal.zzel;
import com.google.ads.interactivemedia.v3.internal.zzem;
import com.google.ads.interactivemedia.v3.internal.zzet;
import com.google.ads.interactivemedia.v3.internal.zzeu;
import com.google.ads.interactivemedia.v3.internal.zzex;
import com.google.ads.interactivemedia.v3.internal.zzfa;
import com.google.ads.interactivemedia.v3.internal.zzsx;
import com.google.ads.interactivemedia.v3.internal.zztd;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.settings.SettingsManager;
import com.opera.android.webaiassistant.WebAiAssistantSheetContentWrapper;
import com.opera.hype.image.editor.TextBoxEditText;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Charsets;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;

/* loaded from: classes.dex */
public final class bxk implements vc3, OnCompleteListener, uam, w7e, bpm, hti, nj8, WebViewStartUpConfigBoundaryInterface, ylo, fqp, jrp, ph, evp {
    public final /* synthetic */ byte a;
    public final Object b;

    public bxk(byte b) {
        this.a = b;
        switch (b) {
            case 8:
                this.b = new qq8();
                break;
            case 17:
                this.b = new AtomicReference(null);
                break;
            default:
                this.b = z4c.b(new thk(this));
                break;
        }
    }

    public bxk(InputStream inputStream) {
        this.a = (byte) 7;
        this.b = new eu4(inputStream, Charsets.UTF_8);
    }

    public /* synthetic */ bxk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public bxk(ByteBuffer byteBuffer) {
        this.a = (byte) 19;
        this.b = byteBuffer.slice();
    }

    public bxk(k8n k8nVar, byte[][] bArr) {
        this.a = (byte) 11;
        if (k8nVar == null) {
            t3p.q("params == null");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                t3p.q("publicKey byte array == null");
                throw null;
            }
        }
        if (bArr.length != k8nVar.c) {
            qp2.o("wrong publicKey size");
            throw null;
        }
        for (byte[] bArr3 : bArr) {
            if (bArr3.length != k8nVar.a) {
                qp2.o("wrong publicKey format");
                throw null;
            }
        }
        this.b = dbh.m(bArr);
    }

    @Override // defpackage.nj8
    public final void F() {
        ((mqn) this.b).g0();
    }

    @Override // defpackage.nj8
    public final void K() {
        y83 y83Var = ((mqn) this.b).S;
        if (y83Var == null) {
            y83Var = null;
        }
        ((WebAiAssistantSheetContentWrapper) y83Var.c).e();
    }

    @Override // defpackage.nj8
    public final void U(float f) {
        int i = 255 - ((int) (f * 255.0f));
        Drawable background = ((mqn) this.b).k.getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
    }

    @Override // defpackage.nj8
    public final void W() {
        y83 y83Var = ((mqn) this.b).S;
        if (y83Var == null) {
            y83Var = null;
        }
        ((WebAiAssistantSheetContentWrapper) y83Var.c).e();
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return new dlo((olo) ((vlo) this.b).a());
    }

    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer byteBufferSlice;
        synchronized (((ByteBuffer) this.b)) {
            int i2 = (int) j;
            ((ByteBuffer) this.b).position(i2);
            ((ByteBuffer) this.b).limit(i2 + i);
            byteBufferSlice = ((ByteBuffer) this.b).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    public final yb6 c(Uri uri) {
        return new mb2((ContentResolver) this.b, uri, (byte) 1);
    }

    @Override // defpackage.vc3
    public final boolean d(int i) {
        m2l m2lVar = (m2l) ((z5l) this.b).v.H(i);
        if (m2lVar != null) {
            return (m2lVar instanceof u2l) || (m2lVar instanceof g2l);
        }
        return false;
    }

    @Override // defpackage.uam
    public final void e(int i, String str) {
        ((TextBoxEditText) this.b).setTypeface((Typeface) null, i);
    }

    public final long f(long j) {
        qq8 qq8Var = (qq8) this.b;
        if (i1n.b(j) <= 0.0f || i1n.c(j) <= 0.0f) {
            a8b.b("maximumVelocity should be a positive value. You specified=".concat(i1n.g(j)));
        }
        return w0h.a(((k1n) qq8Var.b).c(i1n.b(j)), ((k1n) qq8Var.c).c(i1n.c(j)));
    }

    public final int g() {
        return cs5.t(((SettingsManager) this.b).n("default_webpage_zoom"), 50, MessageTemplateConstants.Values.CENTER_POPUP_WIDTH);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public final Executor getBackgroundExecutor() {
        return ((WebViewStartUpConfig) this.b).getBackgroundExecutor();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public final Set getProfileNamesToLoad() {
        return ((WebViewStartUpConfig) this.b).getProfilesToLoadDuringStartup();
    }

    public final void h(int i) {
        int iT = cs5.t(i, 50, MessageTemplateConstants.Values.CENTER_POPUP_WIDTH);
        ((SettingsManager) this.b).V(iT, "default_webpage_zoom");
        double dN0 = oup.n0(iT);
        N.MNh9C30M((OperaBrowserContextHandle) N.M4QvXpDD(), dN0);
        N.MNh9C30M((OperaBrowserContextHandle) N.MGWafL4o(), dN0);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
    public final void k(Object obj) {
        ?? r5 = (ProxyBillingActivityV2) this.b;
        oh ohVar = (oh) obj;
        Intent intent = ohVar.b;
        int i = ohVar.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzo("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjn.zzbv.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = zzc.zzi(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = r5.i;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            zzc.zzo("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            zzc.zzo("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        r5.finish();
    }

    @Override // defpackage.nj8
    public final void n0(float f) {
    }

    public final void onComplete(Task task) {
        List<String> list;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                nh4 nh4Var = (nh4) obj;
                Exception exception = task.getException();
                if (exception == null) {
                    if (task.isCanceled()) {
                        nh4Var.d((Throwable) null);
                        break;
                    } else {
                        p0i p0iVar = t0i.b;
                        nh4Var.resumeWith(task.getResult());
                        break;
                    }
                } else {
                    p0i p0iVar2 = t0i.b;
                    nh4Var.resumeWith(new q0i(exception));
                    break;
                }
            default:
                ha6 ha6Var = (ha6) obj;
                final zzfa zzfaVar = (zzfa) ha6Var.m;
                zzbn zzbnVar = (zzbn) task.getResult();
                boolean z = zzbnVar.enableInstrumentation;
                zzeg zzegVar = (zzeg) ha6Var.p;
                ConcurrentLinkedQueue concurrentLinkedQueue = zzegVar.a;
                if (z) {
                    zzegVar.c = (byte) 2;
                    for (wmb wmbVar = (wmb) concurrentLinkedQueue.poll(); wmbVar != null; wmbVar = (wmb) concurrentLinkedQueue.poll()) {
                        zzegVar.b.a(wmbVar);
                    }
                } else {
                    zzegVar.c = (byte) 3;
                    concurrentLinkedQueue.clear();
                }
                Integer num = zzbnVar.espAdapterTimeoutMs;
                if (num != null && (list = zzbnVar.espAdapters) != null) {
                    zzfaVar.a(list, num);
                    Task task2 = zzfaVar.b.getTask();
                    zzex zzexVar = new zzex();
                    zzsx zzsxVar = zzfaVar.e;
                    task2.continueWith(zzsxVar, zzexVar).continueWithTask(zzsxVar, new zzet(zzfaVar)).continueWith(zzsxVar, new zzeu()).continueWith(zzsxVar, new Continuation() { // from class: com.google.ads.interactivemedia.v3.internal.zzey
                        public final Object then(Task task3) {
                            zzfa zzfaVar2 = zzfaVar;
                            zzfaVar2.c.trySetResult(zzfaVar2.a);
                            return null;
                        }
                    });
                    zzfaVar.c.getTask();
                }
                zzem zzemVar = (zzem) ha6Var.l;
                Integer num2 = zzbnVar.platformSignalCollectorTimeoutMs;
                final TaskCompletionSource taskCompletionSource = zzemVar.e;
                if (zzemVar.c == null || num2 == null) {
                    taskCompletionSource.setResult((Object) null);
                } else {
                    mbi mbiVar = zzemVar.a;
                    zzsx zzsxVar2 = zzemVar.b;
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    zzsxVar2.execute(new ypp(taskCompletionSource2, mbiVar, (byte) 4));
                    Task taskWithTimeout = Tasks.withTimeout(taskCompletionSource2.getTask(), num2.intValue(), TimeUnit.MILLISECONDS);
                    taskWithTimeout.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzek
                        public final void onSuccess(Object obj2) {
                            taskCompletionSource.setResult((Map) obj2);
                        }
                    });
                    taskWithTimeout.addOnFailureListener(new zzel(zzemVar));
                }
                ha6Var.r = new zzdv((mbi) ha6Var.a, zzbnVar, zzegVar);
                ((zztd) ha6Var.b).e(zzbnVar);
                break;
        }
    }

    public final void p(String str) {
        ((ndn) this.b).f.filter(str);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public final boolean shouldRunUiThreadStartUpTasks() {
        return ((WebViewStartUpConfig) this.b).shouldRunUiThreadStartUpTasks();
    }

    public final void v(String str) {
        ((ndn) this.b).f.filter(str);
    }

    public final v7e w(d5o d5oVar) {
        return new cpm(this);
    }

    public final long zza() {
        return ((ByteBuffer) this.b).capacity();
    }

    @Override // defpackage.jrp
    /* renamed from: zza, reason: collision with other method in class */
    public final Object mo1zza() {
        Context context = ((h61) ((z4k) this.b).b).a;
        return new jqp(context, context.getPackageName());
    }

    /* renamed from: zza, reason: collision with other method in class */
    public final void m2zza() {
        top topVar = (top) this.b;
        topVar.a("split-install-errors", new dcl(topVar));
    }
}
