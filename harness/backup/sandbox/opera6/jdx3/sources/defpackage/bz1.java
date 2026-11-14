package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.telephony.euicc.EuiccManager;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.firebase.OperaFirebaseMessagingService;
import com.opera.android.gcm.NewPushNotificationWorker;
import com.opera.android.settings.SettingsManager;
import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBufferEntry;
import com.usercentrics.sdk.services.deviceStorage.models.StorageSessionEntry;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bz1 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz1(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz1(mt5 mt5Var, u07 u07Var) {
        super(2, mt5Var);
        this.t = (byte) 6;
        this.u = u07Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                return new bz1((byte) 0, mt5Var, (dz1) obj2);
            case 1:
                return new bz1((byte) 1, mt5Var, (ztl) obj2);
            case 2:
                return new bz1((byte) 2, mt5Var, (rf3) obj2);
            case 3:
                return new bz1((byte) 3, mt5Var, (dk4) obj2);
            case 4:
                return new bz1((byte) 4, mt5Var, (vn5) obj2);
            case 5:
                return new bz1((byte) 5, mt5Var, (qe6) obj2);
            case 6:
                return new bz1(mt5Var, (u07) obj2);
            case 7:
                return new bz1((byte) 7, mt5Var, (fa7) obj2);
            case 8:
                return new bz1((byte) 8, mt5Var, (Function0) obj2);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new bz1((byte) 9, mt5Var, (k73) obj2);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new bz1((byte) 10, mt5Var, (x77) obj2);
            case 11:
                return new bz1((byte) 11, mt5Var, (k5o) obj2);
            case 12:
                return new bz1((byte) 12, mt5Var, (ia8) obj2);
            case 13:
                return new bz1((byte) 13, mt5Var, (n79) obj2);
            case 14:
                return new bz1((byte) 14, mt5Var, (Bitmap) obj2);
            case 15:
                return new bz1((byte) 15, mt5Var, (pjb) obj2);
            case 16:
                return new bz1((byte) 16, mt5Var, (v3e) obj2);
            case 17:
                return new bz1((byte) 17, mt5Var, (x3e) obj2);
            case SizeUtil.textSize0_1 /* 18 */:
                return new bz1((byte) 18, mt5Var, (v5e) obj2);
            case 19:
                return new bz1((byte) 19, mt5Var, (a6e) obj2);
            case SizeUtil.textSize0 /* 20 */:
                return new bz1((byte) 20, mt5Var, (NewPushNotificationWorker) obj2);
            case 21:
                return new bz1((byte) 21, mt5Var, (sdf) obj2);
            case SizeUtil.textSize1 /* 22 */:
                return new bz1((byte) 22, mt5Var, (kg9) obj2);
            case 23:
                return new bz1((byte) 23, mt5Var, (wgg) obj2);
            case SizeUtil.textSize2 /* 24 */:
                return new bz1((byte) 24, mt5Var, (pqh) obj2);
            case 25:
                return new bz1((byte) 25, mt5Var, (n9h) obj2);
            case 26:
                return new bz1((byte) 26, mt5Var, (xri) obj2);
            case 27:
                return new bz1((byte) 27, mt5Var, (OperaFirebaseMessagingService) obj2);
            case 28:
                return new bz1((byte) 28, mt5Var, (u3j) obj2);
            default:
                return new bz1((byte) 29, mt5Var, (s6k) obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objD;
        String str;
        int i;
        String str2;
        s3j s3jVar;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                ((dz1) this.u).getClass();
                return aw3.a.invoke();
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ((ztl) this.u).a();
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                long jC = new ch6().c();
                rf3 rf3Var = (rf3) this.u;
                cwm cwmVar = rf3Var.b;
                List<StorageSessionEntry> listH = cwmVar.h();
                cwmVar.m(v08.a);
                for (StorageSessionEntry storageSessionEntry : listH) {
                    owm owmVar = rf3Var.d;
                    long j = storageSessionEntry.c;
                    String str3 = storageSessionEntry.a;
                    if (j == 0 || jC - j <= 604800000) {
                        int i2 = storageSessionEntry.d;
                        if (i2 >= 5) {
                            owmVar.d("Dropping buffered session for settingsId: " + str3 + " after " + i2 + " retries.", (Throwable) null);
                        } else {
                            rf3Var.c.a(str3, new of3(rf3Var, storageSessionEntry, (byte) 0));
                        }
                    } else {
                        owmVar.d("Dropping expired buffered session for settingsId: " + str3 + ".", (Throwable) null);
                    }
                }
                return Unit.a;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                ((dk4) this.u).f(true);
                return Unit.a;
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                vn5 vn5Var = (vn5) this.u;
                Iterator it = CollectionsKt.c0(new yg9((byte) 21), vn5Var.d.d().a).iterator();
                while (it.hasNext()) {
                    vn5Var.a(((ConsentsBufferEntry) it.next()).b);
                }
                return Unit.a;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                EuiccManager euiccManager = (EuiccManager) ((qe6) this.u).b;
                return (euiccManager == null || !euiccManager.isEnabled()) ? ea8.c : ea8.b;
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                ism ismVar = ((u07) this.u).c;
                if (ismVar != null) {
                    ismVar.close();
                }
                return Unit.a;
            case 7:
                px5 px5Var8 = px5.a;
                ybh.y(obj);
                fa7 fa7Var = (fa7) this.u;
                synchronized (fa7Var.h) {
                    if (!fa7Var.m || fa7Var.n) {
                        return Unit.a;
                    }
                    try {
                        fa7Var.s();
                    } catch (IOException unused) {
                        fa7Var.o = true;
                    }
                    try {
                        if ((fa7Var.j >= 2000 ? 1 : 0) != 0) {
                            fa7Var.D();
                        }
                    } catch (IOException unused2) {
                        fa7Var.p = true;
                        fa7Var.k = new slh(new gh3());
                    }
                    return Unit.a;
                }
            case 8:
                px5 px5Var9 = px5.a;
                ybh.y(obj);
                ((Function0) this.u).invoke();
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                px5 px5Var10 = px5.a;
                ybh.y(obj);
                k73 k73Var = (k73) this.u;
                try {
                    String str4 = (String) k73Var.b;
                    FutureTask futureTask = pd6.a;
                    izd izdVar = new izd(new BufferedInputStream(new FileInputStream(pd6.a(17, str4))));
                    try {
                        if (izdVar.readUnsignedByte() > 0) {
                            throw new IOException("");
                        }
                        if (izdVar.skipBytes(4) != 4) {
                            throw new EOFException("Unexpected end of file while skipping bytes.");
                        }
                        Object objD2 = izdVar.readInt() <= 0 ? k73Var.d() : k73Var.r(izdVar);
                        izdVar.close();
                        return objD2;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            vtp.v(izdVar, th);
                            throw th2;
                        }
                    }
                } catch (FileNotFoundException unused3) {
                    ((AtomicBoolean) k73Var.f).set(true);
                    objD = k73Var.d();
                    return objD;
                } catch (Throwable unused4) {
                    objD = k73Var.d();
                    return objD;
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                px5 px5Var11 = px5.a;
                ybh.y(obj);
                String str5 = (String) ((zyk) ((x77) this.u).d).getValue();
                if (str5 == null || str5.length() == 0) {
                    return null;
                }
                return str5;
            case 11:
                px5 px5Var12 = px5.a;
                ybh.y(obj);
                return Boolean.valueOf("com.android.vending".equals(r9n.l((Context) ((k5o) this.u).c)));
            case 12:
                px5 px5Var13 = px5.a;
                ybh.y(obj);
                ia8 ia8Var = (ia8) this.u;
                d61 d61Var = ia8Var.a;
                List listC = d61Var.c("");
                if (listC == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listC) {
                    if (!Intrinsics.a((String) obj2, ia8Var.a())) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    d61Var.d((String) obj3);
                }
                return Unit.a;
            case 13:
                px5 px5Var14 = px5.a;
                ybh.y(obj);
                cwa cwaVar = ((n79) this.u).h;
                if (cwaVar != null) {
                    cwaVar.clear();
                }
                return Unit.a;
            case 14:
                px5 px5Var15 = px5.a;
                ybh.y(obj);
                int i3 = ok3.m;
                return rk3.a((Bitmap) this.u, 24);
            case 15:
                px5 px5Var16 = px5.a;
                ybh.y(obj);
                ((pjb) this.u).e.incrementAndGet();
                return Unit.a;
            case 16:
                px5 px5Var17 = px5.a;
                ybh.y(obj);
                v3e v3eVar = (v3e) this.u;
                BrowserActivity browserActivity = v3eVar.c;
                yl6 yl6Var = v3eVar.b;
                if (browserActivity != null && yl6Var != null) {
                    yl6Var.e(browserActivity, null);
                }
                return Unit.a;
            case 17:
                px5 px5Var18 = px5.a;
                ybh.y(obj);
                return ((e59) ((x3e) this.u).a.get()).b(d59.g);
            case SizeUtil.textSize0_1 /* 18 */:
                px5 px5Var19 = px5.a;
                ybh.y(obj);
                v5e v5eVar = (v5e) this.u;
                return new lzd(r9n.D(v5eVar.b, "com.opera.minipay"), ((Boolean) v5eVar.c.getValue()).booleanValue());
            case 19:
                px5 px5Var20 = px5.a;
                ybh.y(obj);
                a6e a6eVar = (a6e) this.u;
                zyk zykVar = a6eVar.d;
                zyk zykVar2 = a6eVar.c;
                if (((String) zykVar2.getValue()).length() > 0) {
                    str = (String) zykVar2.getValue();
                } else if (((String) zykVar.getValue()).length() > 0) {
                    str = (String) zykVar.getValue();
                } else {
                    str = ((cj9) a6eVar.b.i()).a;
                    if (str == null) {
                        str = "";
                    }
                }
                return str.toLowerCase(Locale.ROOT);
            case SizeUtil.textSize0 /* 20 */:
                px5 px5Var21 = px5.a;
                ybh.y(obj);
                hd.o(((ajc) ((NewPushNotificationWorker) this.u)).a);
                return Unit.a;
            case 21:
                px5 px5Var22 = px5.a;
                ybh.y(obj);
                sdf sdfVar = (sdf) this.u;
                bef befVar = (bef) sdfVar.c.get();
                if (befVar.j()) {
                    SettingsManager settingsManager = sdfVar.a;
                    if (!wyh.A(sdfVar.a(), 1) && !wyh.A(sdfVar.b(), 1) && settingsManager.i("collect_website_categories")) {
                        sdfVar.c(1);
                    }
                    if (!wyh.A(sdfVar.a(), 8) && !wyh.A(sdfVar.b(), 8) && settingsManager.i("process_news_topics")) {
                        sdfVar.c(8);
                    }
                    if (befVar.c()) {
                        if (!wyh.A(sdfVar.a(), 16) && !wyh.A(sdfVar.b(), 16) && settingsManager.i("process_location")) {
                            sdfVar.c(16);
                        }
                        i = 25;
                    } else {
                        i = 9;
                    }
                    if (befVar.i()) {
                        if (!wyh.A(sdfVar.a(), 96) && !wyh.A(sdfVar.b(), 96) && (settingsManager.u("personalized_news") || settingsManager.u("personalized_ads"))) {
                            sdfVar.c(96);
                        }
                        i |= 96;
                    }
                } else {
                    i = 0;
                }
                int i4 = i & (~sdfVar.b());
                i = wyh.A(i4, 9) ? i4 : 0;
                int iA = sdfVar.a();
                int i5 = i | iA;
                if (i5 != iA) {
                    udf udfVar = sdfVar.b;
                    int iK = wyh.K(i5);
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) udfVar.a.get()).edit();
                    editorEdit.putInt("pending.consents", iK);
                    editorEdit.apply();
                }
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                px5 px5Var23 = px5.a;
                ybh.y(obj);
                kg9.a((kg9) this.u);
                return Unit.a;
            case 23:
                px5 px5Var24 = px5.a;
                ybh.y(obj);
                wgg wggVar = (wgg) this.u;
                Context context = wggVar.b;
                myi myiVar = wggVar.c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = myiVar.ordinal();
                if (iOrdinal == 0) {
                    str2 = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        h9o.p();
                        return null;
                    }
                    str2 = "textview";
                }
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str2).build());
                wggVar.f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            case SizeUtil.textSize2 /* 24 */:
                px5 px5Var25 = px5.a;
                ybh.y(obj);
                ((pqh) this.u).a = null;
                return Unit.a;
            case 25:
                px5 px5Var26 = px5.a;
                ybh.y(obj);
                return Unit.a;
            case 26:
                px5 px5Var27 = px5.a;
                ybh.y(obj);
                i06 i06Var = ych.i;
                xri xriVar = (xri) this.u;
                i06Var.getClass();
                return f8a.e.b(xriVar.toByteArray());
            case 27:
                px5 px5Var28 = px5.a;
                ybh.y(obj);
                String[] strArr = OperaApplication.K;
                return ((OperaApplication) ((OperaFirebaseMessagingService) this.u).getApplicationContext()).G.get();
            case 28:
                px5 px5Var29 = px5.a;
                ybh.y(obj);
                u3j u3jVar = (u3j) this.u;
                if (u3jVar != null && (s3jVar = u3jVar.f) != null) {
                    s3jVar.a(u3jVar);
                }
                return Unit.a;
            default:
                px5 px5Var30 = px5.a;
                ybh.y(obj);
                pz6 pz6Var = (pz6) ((s6k) this.u).d.e;
                na2.B(pz6Var.a, (CoroutineContext) null, (rx5) null, new rf4((byte) 3, (mt5) null, pz6Var), 3);
                return Unit.a;
        }
    }
}
