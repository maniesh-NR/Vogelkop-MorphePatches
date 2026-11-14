package defpackage;

import J.N;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.FileUriExposedException;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.TransactionTooLargeException;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.vpn.LocationButton;
import com.opera.hype.image.editor.EditImage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.url.GURL;
import org.chromium.url.Parsed;

/* loaded from: classes.dex */
public class bpd implements im, acf, vg3, qxd, hm6, sog, nxi, k4b, fkk {
    public static final String[] d = {"com.google.android.instantapps.START", "com.google.android.instantapps.nmr1.INSTALL", "com.google.android.instantapps.nmr1.VIEW"};
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public bpd(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                break;
            case 20:
                this.b = new Object();
                this.c = new ArrayList();
                break;
            case 24:
                this.c = new ArrayDeque();
                break;
            case 29:
                this.c = new float[64];
                break;
            default:
                this.b = new f1p(new ix5((byte) 17));
                this.c = new f1p(new wu5());
                break;
        }
    }

    public /* synthetic */ bpd(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    public bpd(Context context) {
        this.a = (byte) 26;
        this.c = new nrl((byte) 26);
        this.b = w1h.l(context, vml.d, "night_mode", new a00(this, (byte) 6));
    }

    public bpd(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = (byte) 0;
        ComponentName componentName2 = null;
        if (TextUtils.isEmpty(str)) {
            qp2.o("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = dsd.a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else if (listQueryBroadcastReceivers.size() > 1) {
                w7d.K("More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = componentName2;
            if (componentName == null) {
                w7d.G("Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        xod xodVar = new xod(context, str, bundle);
        this.b = xodVar;
        Looper looperMyLooper = Looper.myLooper();
        R(new qod(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        xodVar.a.setMediaButtonReceiver(pendingIntent);
        wub wubVar = new wub();
        Collections.synchronizedSet(new HashSet());
        wubVar.a = new lhd(context, xodVar.c);
        this.c = wubVar;
    }

    public bpd(TextView textView) {
        this.a = (byte) 4;
        this.b = textView;
        eq6 eq6Var = new eq6();
        eq6Var.a = new hz7(textView);
        this.c = eq6Var;
    }

    public bpd(LocationButton locationButton) {
        this.a = (byte) 22;
        this.b = new qxc(this);
        this.c = locationButton;
        q9n.e(locationButton, new lzb(this, (byte) 8));
        q9n.g(locationButton, new z61(this, (byte) 15));
    }

    public bpd(EditImage editImage) {
        this.a = (byte) 13;
        this.b = editImage;
        this.c = new i97((PointF) null, 7);
    }

    public bpd(csh cshVar, int[] iArr) {
        this.a = (byte) 25;
        this.b = h1b.s(cshVar);
        this.c = iArr;
    }

    public bpd(gbf gbfVar) {
        this.a = (byte) 27;
        this.c = gbfVar;
    }

    public bpd(hd6 hd6Var) {
        this.a = (byte) 7;
        this.b = hd6Var;
    }

    public bpd(hwb hwbVar, hwb hwbVar2) {
        this.a = (byte) 8;
        jpo.j(hwbVar.a <= hwbVar2.a);
        this.b = hwbVar;
        this.c = hwbVar2;
    }

    public /* synthetic */ bpd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public bpd(String str) {
        this.a = (byte) 5;
        this.b = str;
        this.c = null;
    }

    public bpd(mlf mlfVar) {
        this.a = (byte) 1;
        this.b = mlfVar;
        mlfVar.f().getClass();
    }

    public bpd(plh plhVar) {
        this.a = (byte) 18;
        this.b = qbe.t(new z78(plhVar, (byte) 3));
        this.c = qbe.t(new z78(plhVar, (byte) 4));
    }

    public bpd(qim qimVar) {
        this.a = (byte) 16;
        this.c = new ArrayList();
        this.b = qimVar;
    }

    public bpd(tn tnVar, bp bpVar, bo boVar) {
        this.a = (byte) 2;
        this.b = bpVar;
        this.c = boVar;
    }

    public bpd(zid zidVar) {
        this.a = (byte) 23;
        this.b = zidVar;
        this.c = new ArrayList();
    }

    public bpd(zpa zpaVar, hm0 hm0Var) {
        this.a = (byte) 3;
        this.b = zpaVar;
        this.c = hm0Var;
        z4c.b(new pa(this, (byte) 8));
    }

    public bpd(byte[] bArr) {
        this.a = (byte) 5;
        this.b = null;
        this.c = bArr;
    }

    public static String A(GURL gurl, Intent intent) {
        return (!vqm.a(gurl) || intent.getData() == null) ? gurl.f() : intent.getData().getScheme();
    }

    public static ArrayList C(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && (intentFilter.countDataAuthorities() != 0 || intentFilter.countDataPaths() != 0)) {
                    Iterator<IntentFilter.AuthorityEntry> itAuthoritiesIterator = intentFilter.authoritiesIterator();
                    while (itAuthoritiesIterator != null && itAuthoritiesIterator.hasNext()) {
                        if ("*".equals(itAuthoritiesIterator.next().getHost())) {
                            break;
                        }
                    }
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null) {
                        arrayList.add(activityInfo.packageName);
                    } else {
                        arrayList.add("");
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean H(tm8 tm8Var) {
        iqh iqhVar = (iqh) tm8Var.g.b;
        return ((tm8Var.e & 134217728) != 0 && tm8Var.f) || (iqhVar.g.c && !iqhVar.b);
    }

    public static boolean I(Intent intent) {
        if (intent.getData() == null) {
            return false;
        }
        String lastPathSegment = intent.getData().getLastPathSegment();
        return (lastPathSegment != null && lastPathSegment.endsWith(".pdf")) || "application/pdf".equals(intent.getType());
    }

    public static void M(Intent intent) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("org.chromium.chrome.browser.eenp");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        joh.q("MobileExternalNavigationDispatched");
    }

    public static boolean O(List list, List list2) {
        if (list2 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            hashSet.add(new ComponentName(activityInfo.packageName, activityInfo.name));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ActivityInfo activityInfo2 = ((ResolveInfo) it2.next()).activityInfo;
            if (!hashSet.contains(new ComponentName(activityInfo2.packageName, activityInfo2.name))) {
                return false;
            }
        }
        return true;
    }

    public static String s(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class";
    }

    public static boolean t() {
        return N.MRiRQ_Ey(N.MWCIEpVs(0));
    }

    public static ea6 u(Context context, Intent intent) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                try {
                    t();
                    context.startActivity(intent);
                    M(intent);
                    return new ea6(0, 0);
                } catch (FileUriExposedException | SecurityException unused) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return ea6.b();
                } catch (AndroidRuntimeException unused2) {
                    intent.toString();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return ea6.b();
                }
            } catch (ActivityNotFoundException unused3) {
                t();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                return ea6.b();
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof TransactionTooLargeException)) {
                    throw e;
                }
                intent.toString();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                return ea6.b();
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void v(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = bpd.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public final isj B() {
        isj isjVarA;
        ArrayList arrayList = (ArrayList) this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fm8 fm8Var = ((em8) arrayList.get(size)).b;
            if (fm8Var != null && (isjVarA = fm8Var.a()) != null) {
                return isjVarA;
            }
        }
        return null;
    }

    public final String D() {
        CharSequence text = ((OperaTextView) this.b).getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final ydn E() {
        Context context = ((LocationButton) this.c).getContext();
        String[] strArr = OperaApplication.K;
        return context.getApplicationContext().R();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ea6 F(defpackage.tm8 r6, org.chromium.url.GURL r7, boolean r8) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.net.URISyntaxException {
        /*
            r5 = this;
            java.lang.String r0 = r7.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            ea6 r5 = defpackage.ea6.b()
            return r5
        Ld:
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L91
            boolean r8 = H(r6)
            boolean r8 = r5.W(r6, r8)
            r2 = 0
            if (r8 != 0) goto L8b
            boolean r8 = r6.b
            if (r8 != 0) goto L52
            java.lang.String r8 = r7.g()     // Catch: java.lang.Exception -> L4f
            android.content.Intent r8 = android.content.Intent.parseUri(r8, r0)     // Catch: java.lang.Exception -> L4f
            int r3 = r8.getFlags()     // Catch: java.lang.Exception -> L4f
            r4 = 1007171600(0x3c083810, float:0.008314148)
            r3 = r3 & r4
            r8.setFlags(r3)     // Catch: java.lang.Exception -> L4f
            java.lang.String r3 = "android.intent.category.BROWSABLE"
            r8.addCategory(r3)     // Catch: java.lang.Exception -> L4f
            r8.setComponent(r2)     // Catch: java.lang.Exception -> L4f
            r8.setSelector(r2)     // Catch: java.lang.Exception -> L4f
            qm8 r3 = new qm8     // Catch: java.lang.Exception -> L4f
            r3.<init>(r5, r8)     // Catch: java.lang.Exception -> L4f
            boolean r8 = r5.J(r3, r8, r6)     // Catch: java.lang.Exception -> L4f
            if (r8 == 0) goto L52
            ea6 r8 = new ea6     // Catch: java.lang.Exception -> L4f
            r8.<init>(r1, r1)     // Catch: java.lang.Exception -> L4f
            return r8
        L4f:
            t()
        L52:
            java.lang.String r8 = "play.google.com"
            java.lang.String r3 = r7.c()
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L7a
            java.lang.String r8 = r7.e()
            java.lang.String r3 = "/store/apps/details"
            boolean r8 = r8.startsWith(r3)
            if (r8 == 0) goto L7a
            java.util.ArrayList r8 = vqm.a
            java.lang.String r8 = "id"
            java.lang.Object r8 = J.N.MDzOlV_T(r7, r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 == 0) goto L7b
        L7a:
            r8 = r2
        L7b:
            if (r8 == 0) goto L91
            ea6 r5 = r5.P(r8, r2, r6, r7)
            byte r6 = r5.b
            if (r6 != 0) goto L8a
            ea6 r5 = new ea6
            r5.<init>(r1, r1)
        L8a:
            return r5
        L8b:
            java.lang.String r5 = "Context is not allowed to launch an external app."
            defpackage.t3p.u(r5)
            return r2
        L91:
            t()
            ea6 r5 = new ea6
            r5.<init>(r0, r1)
            r5.c = r7
            r5.d = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpd.F(tm8, org.chromium.url.GURL, boolean):ea6");
    }

    public final bs4 G() {
        return ma9.b((f99) ((zyk) ((i3j) this.c).d).getValue(), new zp6((byte) 3, (mt5) null, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012e A[EDGE_INSN: B:134:0x012e->B:91:0x012e BREAK  A[LOOP:0: B:30:0x006f->B:33:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(qm8 r16, android.content.Intent r17, defpackage.tm8 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpd.J(qm8, android.content.Intent, tm8):boolean");
    }

    public final void K(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((TextView) this.b).getContext().obtainStyledAttributes(attributeSet, zhh.j, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((gyg) ((eq6) this.c).a).T(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void L(java.lang.String r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpd.L(java.lang.String, java.util.ArrayList):void");
    }

    public final boolean N(List list) {
        String packageName = ((mlf) this.b).e().getPackageName();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            if (activityInfo != null && packageName.equals(activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public final ea6 P(String str, String str2, tm8 tm8Var, GURL gurl) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        boolean z;
        Uri.Builder builderEncodedQuery;
        GURL gurl2 = tm8Var.d;
        Uri.Builder builderAuthority = new Uri.Builder().scheme("market").authority("details");
        if (gurl.a.isEmpty()) {
            builderEncodedQuery = builderAuthority.appendQueryParameter("id", str);
            z = false;
        } else {
            ArrayList arrayList = vqm.a;
            z = !TextUtils.isEmpty((String) N.MDzOlV_T(gurl, "referrer"));
            Parsed parsed = gurl.c;
            builderEncodedQuery = builderAuthority.encodedQuery(gurl.b(parsed.m, parsed.n));
        }
        if (!z) {
            builderEncodedQuery = builderEncodedQuery.appendQueryParameter("referrer", str2 != null ? str2 : t8.a.getPackageName());
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderEncodedQuery.build());
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        if (!gurl2.a.isEmpty()) {
            intent.putExtra("android.intent.extra.REFERRER", Uri.parse(gurl2.g()));
        }
        List listA = qvf.a(65600, intent);
        if (listA == null || listA.isEmpty()) {
            t();
            return ea6.b();
        }
        if (!tm8Var.b) {
            Y(intent, tm8Var, false, null, null, null, null);
            t();
            return new ea6(0, 0);
        }
        if (Z(tm8Var, intent, gurl)) {
            t();
            return ea6.a();
        }
        t();
        return ea6.b();
    }

    public final void Q(boolean z) {
        ((gyg) ((eq6) this.c).a).S(z);
    }

    public final void R(r22 r22Var, Handler handler) {
        xod xodVar = (xod) this.b;
        synchronized (xodVar.d) {
            xodVar.l = r22Var;
            xodVar.a.setCallback((tod) r22Var.b, handler);
            synchronized (r22Var.a) {
                try {
                    r22Var.c = new WeakReference(xodVar);
                    ue2 ue2Var = (ue2) r22Var.d;
                    if (ue2Var != null) {
                        ue2Var.removeCallbacksAndMessages(null);
                    }
                    r22Var.d = new ue2((Object) r22Var, handler.getLooper(), (byte) 11);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void S(xjd xjdVar) {
        xod xodVar = (xod) this.b;
        xodVar.i = xjdVar;
        MediaSession mediaSession = xodVar.a;
        Bundle bundle = xjdVar.a;
        MediaMetadata mediaMetadataBuild = xjdVar.b;
        if (mediaMetadataBuild == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) xjd.c.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            mediaMetadataBuild = builder.build();
            xjdVar.b = mediaMetadataBuild;
        }
        mediaSession.setMetadata(mediaMetadataBuild);
    }

    public final void T(vhg vhgVar) {
        RemoteCallbackList remoteCallbackList;
        xod xodVar = (xod) this.b;
        xodVar.g = vhgVar;
        synchronized (xodVar.d) {
            int iBeginBroadcast = xodVar.f.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = xodVar.f;
                if (iBeginBroadcast < 0) {
                    break;
                }
                try {
                    ((nsa) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).e(vhgVar);
                } catch (RemoteException | SecurityException e) {
                    w7d.r("Dead object in setPlaybackState.", e);
                }
                iBeginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = xodVar.a;
        PlaybackState playbackStateBuild = vhgVar.l;
        if (playbackStateBuild == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(vhgVar.a, vhgVar.b, vhgVar.d, vhgVar.h);
            builder.setBufferedPosition(vhgVar.c);
            builder.setActions(vhgVar.e);
            builder.setErrorMessage(vhgVar.g);
            for (uhg uhgVar : vhgVar.i) {
                uhgVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(uhgVar.a, uhgVar.b, uhgVar.c);
                builder2.setExtras(uhgVar.d);
                PlaybackState.CustomAction customActionBuild = builder2.build();
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(vhgVar.j);
            builder.setExtras(vhgVar.k);
            playbackStateBuild = builder.build();
            vhgVar.l = playbackStateBuild;
        }
        mediaSession.setPlaybackState(playbackStateBuild);
    }

    public final void U(ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                long j = ((zod) obj).b;
                if (hashSet.contains(Long.valueOf(j))) {
                    w7d.r(p3p.l(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        xod xodVar = (xod) this.b;
        MediaSession mediaSession = xodVar.a;
        xodVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            zod zodVar = (zod) obj2;
            MediaSession.QueueItem queueItem = zodVar.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(zodVar.a.a(), zodVar.b);
                zodVar.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public void V(pxh pxhVar) {
        OperaTextView operaTextView = (OperaTextView) this.b;
        CharSequence charSequenceA = pxhVar != null ? pxhVar.a(((OperaListItem) this.c).getResources()) : null;
        operaTextView.setVisibility((charSequenceA == null || charSequenceA.length() == 0) ? 8 : 0);
        operaTextView.setText(charSequenceA);
    }

    public final boolean W(tm8 tm8Var, boolean z) {
        if (!tm8Var.k && !tm8Var.l) {
            t();
            return true;
        }
        if (!z) {
            if (ApplicationStatus.getStateForApplication() != 1) {
                t();
                return true;
            }
            if (tm8Var.i && !tm8Var.j) {
                t();
                return true;
            }
        }
        if ((tm8Var.e & 16777216) == 0) {
            return false;
        }
        t();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0267, code lost:
    
        if (s9g.h.g(lag.g, r3.d().g(), false) != kag.b) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ea6 X(final defpackage.tm8 r34) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 2468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpd.X(tm8):ea6");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ea6 Y(android.content.Intent r15, defpackage.tm8 r16, boolean r17, qm8 r18, rm8 r19, org.chromium.url.GURL r20, org.chromium.url.GURL r21) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpd.Y(android.content.Intent, tm8, boolean, qm8, rm8, org.chromium.url.GURL, org.chromium.url.GURL):ea6");
    }

    public final boolean Z(final tm8 tm8Var, final Intent intent, final GURL gurl) {
        Map map;
        Boolean bool;
        mlf mlfVar = (mlf) this.b;
        Context contextE = mlfVar.e();
        aeb aebVar = (aeb) mlfVar.b;
        if (aebVar.a.h() || t8.d(contextE) == null) {
            return false;
        }
        Callback callback = new Callback() { // from class: im8
            public final void onResult(Object obj) throws Resources.NotFoundException, PackageManager.NameNotFoundException, URISyntaxException {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bpd bpdVar = this.a;
                tm8 tm8Var2 = tm8Var;
                if (zBooleanValue && bpdVar.Y(intent, tm8Var2, false, null, null, null, null).b != 3) {
                    d23 d23Var = tm8Var2.u;
                    if (d23Var != null) {
                        d23Var.onResult(sm8.a(tm8Var2, !((aeb) ((mlf) bpdVar.b).b).a.h()));
                        return;
                    }
                    return;
                }
                if (tm8Var2.u == null) {
                    return;
                }
                ea6 ea6VarF = bpdVar.F(tm8Var2, gurl, false);
                byte b = ea6VarF.b;
                d23 d23Var2 = tm8Var2.u;
                if (b == 1) {
                    d23Var2.onResult(sm8.b((GURL) ea6VarF.c, tm8Var2));
                } else {
                    d23Var2.onResult(sm8.c());
                }
            }
        };
        ChromiumContent chromiumContent = aebVar.a;
        if (chromiumContent.t) {
            vl8 vl8Var = vl8.b;
            String strH = chromiumContent.m().d().h();
            String str = (String) mlfVar.c;
            String[] strArr = aik.a;
            String str2 = str == null ? "" : str;
            String str3 = (String) mlfVar.d;
            String str4 = str3 == null ? "" : str3;
            mlfVar.c = null;
            mlfVar.d = null;
            vl8Var.getClass();
            int iA = vep.A((TextUtils.isEmpty(strH) || (map = (Map) vl8Var.a.get(strH)) == null || (bool = (Boolean) map.get(Pair.create(str2, str4))) == null) ? 1 : bool.booleanValue() ? 2 : 3);
            if (iA != 0) {
                if (iA == 1) {
                    vml.c(new bi2(callback, Boolean.TRUE, (byte) 22));
                    return true;
                }
                if (iA == 2) {
                    vml.c(new bi2(callback, Boolean.FALSE, (byte) 22));
                    return true;
                }
            } else if (!mlfVar.h(2132018999, new uf(vl8Var, strH, str2, str4, callback, (byte) 1))) {
                vml.c(new bi2(callback, Boolean.FALSE, (byte) 22));
                return true;
            }
        } else if (!mlfVar.h(2132019000, new bm8(callback, (byte) 1))) {
            vml.c(new bi2(callback, Boolean.FALSE, (byte) 22));
        }
        return true;
    }

    @Override // defpackage.vg3
    public final ListenableFuture a(Uri uri) {
        Uri uri2;
        qb7 qb7Var = (qb7) this.c;
        if (qb7Var != null && (uri2 = (Uri) qb7Var.b) != null && uri2.equals(uri)) {
            ListenableFuture listenableFuture = (ListenableFuture) ((qb7) this.c).c;
            listenableFuture.getClass();
            return listenableFuture;
        }
        ListenableFuture listenableFutureA = ((hd6) this.b).a(uri);
        qb7 qb7Var2 = new qb7();
        qb7Var2.a = null;
        qb7Var2.b = uri;
        qb7Var2.c = listenableFutureA;
        this.c = qb7Var2;
        return listenableFutureA;
    }

    public final void a0() {
        ydn ydnVarE = E();
        LocationButton locationButton = (LocationButton) this.c;
        ((StylingTextView) locationButton.a.e).setText(ydnVarE.k());
        ((StylingTextView) locationButton.a.d).setText(ydnVarE.l());
        b0();
    }

    @Override // defpackage.fkk
    public final gkk apply() {
        return ((z3c) this.b).e(this.c);
    }

    public final tog b(tog togVar) {
        k5o k5oVar = (k5o) this.b;
        d38 d38Var = togVar instanceof d38 ? (d38) togVar : null;
        if (d38Var != null && d38Var.a == k5oVar && d38Var.b != null) {
            return d38Var;
        }
        nq7 nq7VarQ = ((nq7) this.c).q((xf8) ((isd) k5oVar.c).b);
        d38 d38Var2 = new d38();
        d38Var2.a = k5oVar;
        d38Var2.b = nq7VarQ;
        return d38Var2;
    }

    public final void b0() {
        ydn ydnVarE = E();
        int iJ = ydnVarE.j();
        LocationButton locationButton = (LocationButton) this.c;
        if (iJ != 0) {
            ((StylingImageView) locationButton.a.c).setImageDrawable(ddh.o(locationButton.isEnabled(), locationButton.getContext(), 0, iJ));
            return;
        }
        boolean zIsEnabled = locationButton.isEnabled();
        Context context = locationButton.getContext();
        fdn fdnVarI = ydnVarE.i();
        ((StylingImageView) locationButton.a.c).setImageDrawable(ddh.o(zIsEnabled, context, fdnVarI.h, fdnVarI.i));
    }

    @Override // defpackage.im
    public final void c() {
        vml.e(new sn((bp) this.b, (byte) 1));
    }

    public final boolean c0(Function1 function1) {
        i97 i97Var = (i97) this.c;
        if (!i97Var.c((EditImage) this.b)) {
            return false;
        }
        function1.invoke(i97Var);
        return true;
    }

    @Override // defpackage.fkk
    public final void cancel() {
    }

    public final int d(int i) {
        TextPaint textPaint = (TextPaint) this.c;
        CharSequence charSequence = (CharSequence) this.b;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        if (textRunCursor == -1 || ((TextPaint) this.c).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override // defpackage.k4b
    public final void e(g07 g07Var) {
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (Intrinsics.a(((l4b) obj).b, g07Var)) {
                    g07Var.a();
                }
            }
        }
    }

    @Override // defpackage.vg3
    public final ListenableFuture f(vjd vjdVar) {
        Uri uri;
        byte[] bArr;
        qb7 qb7Var = (qb7) this.c;
        if (qb7Var != null && (((uri = (Uri) qb7Var.b) != null && uri.equals(vjdVar.m)) || ((bArr = (byte[]) qb7Var.a) != null && Arrays.equals(bArr, vjdVar.k)))) {
            ListenableFuture listenableFuture = (ListenableFuture) ((qb7) this.c).c;
            listenableFuture.getClass();
            return listenableFuture;
        }
        ListenableFuture listenableFutureF = ((hd6) this.b).f(vjdVar);
        if (listenableFutureF == null) {
            return null;
        }
        qb7 qb7Var2 = new qb7();
        qb7Var2.a = vjdVar.k;
        qb7Var2.b = vjdVar.m;
        qb7Var2.c = listenableFutureF;
        this.c = qb7Var2;
        return listenableFutureF;
    }

    public final int g(int i) {
        TextPaint textPaint = (TextPaint) this.c;
        CharSequence charSequence = (CharSequence) this.b;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    public final int h(int i) {
        TextPaint textPaint = (TextPaint) this.c;
        CharSequence charSequence = (CharSequence) this.b;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.fkk
    public final boolean i(mgf mgfVar) {
        return true;
    }

    @Override // defpackage.fkk
    public final boolean j() {
        return true;
    }

    public final void k() {
        ((mm6) this.c).g(new jm6(km6.d, (String) this.b));
    }

    @Override // defpackage.im
    public final void l(qq qqVar) {
        ap apVarP = ao.p(qqVar);
        if (apVarP == null) {
            return;
        }
        vml.e(new k3((bo) this.c, apVarP, (bp) this.b, (byte) 2));
    }

    @Override // defpackage.vg3
    public final ListenableFuture m(byte[] bArr) {
        byte[] bArr2;
        qb7 qb7Var = (qb7) this.c;
        if (qb7Var != null && (bArr2 = (byte[]) qb7Var.a) != null && Arrays.equals(bArr2, bArr)) {
            ListenableFuture listenableFuture = (ListenableFuture) ((qb7) this.c).c;
            listenableFuture.getClass();
            return listenableFuture;
        }
        ListenableFuture listenableFutureM = ((hd6) this.b).m(bArr);
        qb7 qb7Var2 = new qb7();
        qb7Var2.a = bArr;
        qb7Var2.b = null;
        qb7Var2.c = listenableFutureM;
        this.c = qb7Var2;
        return listenableFutureM;
    }

    public final void n(hjm hjmVar) {
        String str = (String) this.b;
        mm6 mm6Var = (mm6) this.c;
        ac0 ac0Var = ac0.d;
        if (hjmVar == hjm.b) {
            mm6Var.c(vb0.d, ac0Var, str);
        } else {
            mm6Var.c(vb0.c, ac0Var, str);
        }
    }

    @Override // defpackage.k4b
    public final void o() {
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l4b l4bVar = (l4b) obj;
                l4bVar.c.l(l4bVar.a, null);
                l4bVar.b.a();
            }
            ((ArrayList) this.c).clear();
        }
    }

    @Override // defpackage.im
    public final void onAdClicked() {
        vml.e(new sn((bp) this.b, (byte) 0));
    }

    public final er7 p() throws GeneralSecurityException {
        ECPoint eCPoint;
        ir7 ir7Var = (ir7) this.b;
        if (ir7Var == null) {
            t3p.w("Cannot build without a ecdsa public key");
            return null;
        }
        qie qieVar = (qie) this.c;
        if (qieVar == null) {
            t3p.w("Cannot build without a private value");
            return null;
        }
        BigInteger bigInteger = (BigInteger) qieVar.b;
        ECPoint eCPoint2 = ir7Var.g;
        zq7 zq7Var = ir7Var.f.b;
        BigInteger order = zq7Var.b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            t3p.w("Invalid private value");
            return null;
        }
        ECParameterSpec eCParameterSpec = zq7Var.b;
        if (!nx7.f(eCParameterSpec, nx7.a) && !nx7.f(eCParameterSpec, nx7.b) && !nx7.f(eCParameterSpec, nx7.c)) {
            t3p.w("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            t3p.w("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            t3p.w("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        nx7.b(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerD = nx7.d(curve);
        mx7 mx7VarG = nx7.g(ECPoint.POINT_INFINITY, bigIntegerD);
        mx7 mx7VarG2 = nx7.g(generator, bigIntegerD);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                mx7VarG = nx7.a(mx7VarG, mx7VarG2, a, bigIntegerD);
                mx7VarG2 = nx7.c(mx7VarG2, a, bigIntegerD);
            } else {
                mx7VarG2 = nx7.a(mx7VarG, mx7VarG2, a, bigIntegerD);
                mx7VarG = nx7.c(mx7VarG, a, bigIntegerD);
            }
        }
        if (mx7VarG.c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = mx7VarG.c.modInverse(bigIntegerD);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerD);
            eCPoint = new ECPoint(mx7VarG.a.multiply(bigIntegerMod).mod(bigIntegerD), mx7VarG.b.multiply(bigIntegerMod).mod(bigIntegerD).multiply(bigIntegerModInverse).mod(bigIntegerD));
        }
        nx7.b(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new er7((ir7) this.b, (qie) this.c);
        }
        t3p.w("Invalid private value");
        return null;
    }

    @Override // defpackage.k4b
    public final void q(int i, g07 g07Var, nd4 nd4Var) {
        synchronized (this.b) {
            ((ArrayList) this.c).add(new l4b(i, g07Var, nd4Var));
        }
    }

    public final int r(int i) {
        TextPaint textPaint = (TextPaint) this.c;
        CharSequence charSequence = (CharSequence) this.b;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        if (textRunCursor == -1 || ((TextPaint) this.c).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    public final String toString() {
        switch (this.a) {
            case 10:
                return ((Map) this.b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i6f w(defpackage.eam r8, boolean r9) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpd.w(eam, boolean):i6f");
    }

    public final bqd x() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = ((xod) this.b).a.getCurrentControllerInfo();
        bqd bqdVar = new bqd();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            t3p.q("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            qp2.o("packageName should be nonempty");
            return null;
        }
        bqdVar.a = new dqd(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return bqdVar;
    }

    public final upm y() {
        upm upmVar = (upm) this.b;
        return upmVar != null ? upmVar : ((gbf) this.c).j;
    }

    public final InputFilter[] z(InputFilter[] inputFilterArr) {
        return ((gyg) ((eq6) this.c).a).A(inputFilterArr);
    }
}
