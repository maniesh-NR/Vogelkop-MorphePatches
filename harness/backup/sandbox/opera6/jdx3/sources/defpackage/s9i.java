package defpackage;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Icon;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.Lazy;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.esim.ui.EsimActivity;
import com.opera.android.favorites.PushedSpeedDialFavorite;
import com.opera.android.favorites.f;
import com.opera.android.webcore.WebcoreRpcBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.WebContents;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class s9i implements xyn, bn, ssf, gln, xan {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public s9i(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.b = new int[10];
                this.c = new int[10];
                this.d = new int[10];
                this.e = new int[10];
                break;
            case 21:
                this.d = new d8e(this, (byte) 1);
                break;
        }
    }

    public s9i(Context context) {
        this.a = (byte) 4;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        zpa zpaVar = new zpa((byte) 20);
        this.c = zpaVar;
        this.d = new xq0(zpaVar);
        this.e = new a5f((ActivityManager) applicationContext.getSystemService("activity"), zpaVar);
    }

    public s9i(Context context, g77 g77Var) {
        this.a = (byte) 12;
        this.d = new vr9(this);
        this.b = context.getApplicationContext();
        this.c = new ga6((Object) g77Var, (byte) 5);
    }

    public s9i(Context context, umi umiVar) {
        this.a = (byte) 15;
        i32 i32Var = new i32(this, context, umiVar);
        this.b = i32Var;
        this.c = umiVar;
        i32Var.h();
    }

    public s9i(Path path) {
        this.a = (byte) 28;
        this.b = path;
        this.c = new Path();
        this.d = new Matrix();
        this.e = new PointF();
    }

    public s9i(AudioTrack audioTrack, u59 u59Var) {
        this.a = (byte) 5;
        this.b = audioTrack;
        this.c = u59Var;
        Handler handlerP = tym.p((Handler.Callback) null);
        this.d = handlerP;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: qh2
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                s9i s9iVar = this.a;
                if (((qh2) s9iVar.e) == null) {
                    return;
                }
                f03.p().execute(new xa(s9iVar, audioRouting, (byte) 27));
            }
        };
        this.e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerP);
    }

    public s9i(FrameLayout frameLayout) {
        this.a = (byte) 17;
        this.d = new tba(this, (byte) 0);
        this.e = new tba(this, (byte) 1);
        this.b = frameLayout;
    }

    public s9i(EsimActivity esimActivity, WebContents webContents, ala alaVar) {
        this.a = (byte) 0;
        this.b = alaVar;
        qq8 qq8Var = new qq8(new tu(this, (byte) 7));
        this.c = qq8Var;
        this.d = new WebcoreRpcBridge(3, webContents, this);
        this.e = new s98(qq8Var);
        esimActivity.getLifecycle().a(new rz(this, (byte) 3));
    }

    public s9i(ie6 ie6Var, List list) {
        this.a = (byte) 10;
        this.e = ie6Var;
        this.b = new pfe();
        this.c = new cd5();
        this.d = CollectionsKt.k0(list);
    }

    public /* synthetic */ s9i(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj;
    }

    public /* synthetic */ s9i(Object obj, Object obj2, Object obj3, Object obj4, byte b, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public s9i(kwf kwfVar) {
        this.a = (byte) 23;
        this.e = kwfVar;
        this.b = kwfVar.v.a(new qz(this, (byte) 17));
        sbf sbfVar = new sbf(this, (byte) 1);
        this.c = sbfVar;
        ((i7f) kwfVar.y.b).b(sbfVar);
        d8d d8dVar = new d8d(kwfVar, (byte) 19);
        this.d = d8dVar;
        kze kzeVar = kwfVar.D;
        if (kzeVar != null) {
            kzeVar.k(d8dVar);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.content.Context, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r8v20 */
    public s9i(l1f l1fVar) {
        String str;
        String str2;
        int i;
        Bundle[] bundleArr;
        ArrayList arrayList;
        String str3;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4;
        int i5;
        this.a = (byte) 22;
        this.e = new Bundle();
        this.d = l1fVar;
        Context context = l1fVar.a;
        ArrayList arrayList3 = l1fVar.d;
        this.b = context;
        Notification.Builder builder = new Notification.Builder(context, l1fVar.D);
        this.c = builder;
        Notification notification = l1fVar.G;
        ?? r8 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(l1fVar.e).setContentText(l1fVar.f).setContentInfo(null).setContentIntent(l1fVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0).setNumber(l1fVar.i).setProgress(l1fVar.o, l1fVar.p, l1fVar.q);
        IconCompat iconCompat = l1fVar.h;
        builder.setLargeIcon(iconCompat == null ? null : fr3.f0(iconCompat, context));
        builder.setSubText(l1fVar.n).setUsesChronometer(l1fVar.l).setPriority(l1fVar.j);
        ArrayList arrayList4 = l1fVar.b;
        int size = arrayList4.size();
        int i6 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            str2 = "";
            if (i6 >= size) {
                break;
            }
            Object obj = arrayList4.get(i6);
            int i7 = i6 + 1;
            d1f d1fVar = (d1f) obj;
            IconCompat iconCompatD = d1fVar.b;
            if (iconCompatD == null && (i5 = d1fVar.j) != 0) {
                iconCompatD = IconCompat.d((Resources) r8, "", i5);
                d1fVar.b = iconCompatD;
            }
            int i8 = d1fVar.f;
            boolean z = d1fVar.d;
            Bundle bundle = d1fVar.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompatD != null ? fr3.f0(iconCompatD, (Context) r8) : r8, d1fVar.k, d1fVar.l);
            ith[] ithVarArr = d1fVar.c;
            if (ithVarArr != null) {
                int length = ithVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                arrayList2 = arrayList4;
                i3 = size;
                int i9 = 0;
                while (i9 < ithVarArr.length) {
                    ith ithVar = ithVarArr[i9];
                    int i10 = i9;
                    int i11 = i7;
                    RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(ithVar.a).setLabel(ithVar.b).setChoices(ithVar.c).setAllowFreeFormInput(ithVar.d).addExtras(ithVar.f);
                    HashSet hashSet = ithVar.g;
                    if (hashSet != null) {
                        for (Iterator it = hashSet.iterator(); it.hasNext(); it = it) {
                            builderAddExtras.setAllowDataType((String) it.next(), true);
                            ithVarArr = ithVarArr;
                        }
                    }
                    builderAddExtras.setEditChoicesBeforeSending(ithVar.e);
                    remoteInputArr[i10] = builderAddExtras.build();
                    i9 = i10 + 1;
                    i7 = i11;
                    ithVarArr = ithVarArr;
                }
                i4 = i7;
                for (int i12 = 0; i12 < length; i12++) {
                    builder2.addRemoteInput(remoteInputArr[i12]);
                }
            } else {
                arrayList2 = arrayList4;
                i3 = size;
                i4 = i7;
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i8);
            builder2.setSemanticAction(i8);
            builder2.setContextual(d1fVar.g);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 31) {
                m41.H(builder2, d1fVar.m);
            }
            if (i13 >= 37) {
                x8.h(builder2, d1fVar.h);
                x8.k(builder2, d1fVar.i);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", d1fVar.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder2.build());
            arrayList4 = arrayList2;
            size = i3;
            i6 = i4;
            r8 = 0;
        }
        Bundle bundle3 = l1fVar.x;
        if (bundle3 != null) {
            ((Bundle) this.e).putAll(bundle3);
        }
        ((Notification.Builder) this.c).setShowWhen(l1fVar.k);
        ((Notification.Builder) this.c).setLocalOnly(l1fVar.t);
        ((Notification.Builder) this.c).setGroup(l1fVar.r);
        ((Notification.Builder) this.c).setSortKey(null);
        ((Notification.Builder) this.c).setGroupSummary(l1fVar.s);
        ((Notification.Builder) this.c).setCategory(l1fVar.w);
        ((Notification.Builder) this.c).setColor(l1fVar.y);
        ((Notification.Builder) this.c).setVisibility(l1fVar.z);
        ((Notification.Builder) this.c).setPublicVersion(l1fVar.A);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList5 = l1fVar.I;
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            int size2 = arrayList5.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList5.get(i14);
                i14++;
                ((Notification.Builder) this.c).addPerson((String) obj2);
            }
        }
        if (arrayList3.size() > 0) {
            Bundle bundle4 = l1fVar.x;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                l1fVar.x = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i15 = 0;
            while (i15 < arrayList3.size()) {
                String string = Integer.toString(i15);
                d1f d1fVar2 = (d1f) arrayList3.get(i15);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatD2 = d1fVar2.b;
                if (iconCompatD2 == null && (i2 = d1fVar2.j) != 0) {
                    iconCompatD2 = IconCompat.d((Resources) null, str2, i2);
                    d1fVar2.b = iconCompatD2;
                }
                Bundle bundle9 = d1fVar2.a;
                bundle8.putInt("icon", iconCompatD2 != null ? iconCompatD2.e() : 0);
                bundle8.putCharSequence("title", d1fVar2.k);
                bundle8.putParcelable("actionIntent", d1fVar2.l);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean(str, d1fVar2.d);
                bundle8.putBundle("extras", bundle10);
                ith[] ithVarArr2 = d1fVar2.c;
                if (ithVarArr2 == null) {
                    arrayList = arrayList3;
                    str3 = str;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[ithVarArr2.length];
                    arrayList = arrayList3;
                    str3 = str;
                    int i16 = 0;
                    while (i16 < ithVarArr2.length) {
                        ith ithVar2 = ithVarArr2[i16];
                        int i17 = i16;
                        Bundle bundle11 = new Bundle();
                        int i18 = i15;
                        String str4 = str2;
                        bundle11.putString("resultKey", ithVar2.a);
                        bundle11.putCharSequence("label", ithVar2.b);
                        bundle11.putCharSequenceArray("choices", ithVar2.c);
                        bundle11.putBoolean("allowFreeFormInput", ithVar2.d);
                        bundle11.putBundle("extras", ithVar2.f);
                        HashSet hashSet2 = ithVar2.g;
                        if (hashSet2 != null && !hashSet2.isEmpty()) {
                            ArrayList<String> arrayList6 = new ArrayList<>(hashSet2.size());
                            Iterator it2 = hashSet2.iterator();
                            while (it2.hasNext()) {
                                arrayList6.add((String) it2.next());
                            }
                            bundle11.putStringArrayList("allowedDataTypes", arrayList6);
                        }
                        bundleArr[i17] = bundle11;
                        i16 = i17 + 1;
                        i15 = i18;
                        str2 = str4;
                    }
                }
                int i19 = i15;
                String str5 = str2;
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", d1fVar2.e);
                bundle8.putInt("semanticAction", d1fVar2.f);
                bundle7.putBundle(string, bundle8);
                i15 = i19 + 1;
                arrayList3 = arrayList;
                str = str3;
                str2 = str5;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle12 = l1fVar.x;
            Bundle bundle13 = bundle12;
            if (bundle12 == null) {
                Bundle bundle14 = new Bundle();
                l1fVar.x = bundle14;
                bundle13 = bundle14;
            }
            bundle13.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        Icon icon = l1fVar.H;
        if (icon != null) {
            ((Notification.Builder) this.c).setSmallIcon(icon);
        }
        ((Notification.Builder) this.c).setExtras(l1fVar.x);
        ((Notification.Builder) this.c).setRemoteInputHistory(null);
        RemoteViews remoteViews = l1fVar.B;
        if (remoteViews != null) {
            ((Notification.Builder) this.c).setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = l1fVar.C;
        if (remoteViews2 != null) {
            ((Notification.Builder) this.c).setCustomBigContentView(remoteViews2);
        }
        ((Notification.Builder) this.c).setBadgeIconType(l1fVar.E ? 1 : 0);
        ((Notification.Builder) this.c).setSettingsText(null);
        ((Notification.Builder) this.c).setShortcutId(null);
        ((Notification.Builder) this.c).setTimeoutAfter(0L);
        ((Notification.Builder) this.c).setGroupAlertBehavior(0);
        if (l1fVar.v) {
            ((Notification.Builder) this.c).setColorized(l1fVar.u);
        }
        if (TextUtils.isEmpty(l1fVar.D)) {
            i = 0;
        } else {
            i = 0;
            ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        ArrayList arrayList7 = l1fVar.c;
        int size3 = arrayList7.size();
        int i20 = i;
        while (i20 < size3) {
            Object obj3 = arrayList7.get(i20);
            i20++;
            ecg ecgVar = (ecg) obj3;
            Notification.Builder builder3 = (Notification.Builder) this.c;
            ecgVar.getClass();
            builder3.addPerson(ic4.O(ecgVar));
        }
        ((Notification.Builder) this.c).setAllowSystemGeneratedContextualActions(l1fVar.F);
        ((Notification.Builder) this.c).setBubbleMetadata(null);
        if (Build.VERSION.SDK_INT >= 36) {
            u8.q((Notification.Builder) this.c);
        }
    }

    public s9i(n7h n7hVar, hnl hnlVar, unb unbVar) {
        this.a = (byte) 7;
        this.b = n7hVar;
        this.c = hnlVar;
        this.d = unbVar;
        this.e = f03.g(new r3((byte) 11, (mt5) null, this));
    }

    public s9i(ns8 ns8Var, tq8 tq8Var) {
        this.a = (byte) 14;
        this.e = ns8Var;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.b = tq8Var;
    }

    public s9i(WebContents webContents, ta7 ta7Var) {
        this.a = (byte) 19;
        this.b = ta7Var;
        qq8 qq8Var = new qq8(new y0a(this, (byte) 15));
        this.c = qq8Var;
        this.e = new nv6(qq8Var);
        this.d = new WebcoreRpcBridge(1, webContents, this);
    }

    public s9i(pde pdeVar, k6l k6lVar) {
        this.a = (byte) 29;
        this.b = k6lVar;
        this.c = new pde(new LinkedHashSet());
        this.d = new pde(oyi.a);
        this.e = u3l.c;
        ryi ryiVar = new ryi(this);
        qz qzVar = new qz(this, (byte) 24);
        a26.V(k6lVar, pdeVar, ryiVar);
        a26.V(k6lVar.s, pdeVar, qzVar);
    }

    public s9i(pxh pxhVar, pxh pxhVar2) {
        this.a = (byte) 27;
        rxh rxhVar = new rxh(2132020613);
        rxh rxhVar2 = new rxh(2132020043);
        this.b = pxhVar;
        this.c = pxhVar2;
        this.d = rxhVar;
        this.e = rxhVar2;
    }

    public s9i(pza pzaVar, ni6 ni6Var, vzk vzkVar) {
        this.a = (byte) 26;
        this.d = Collections.newSetFromMap(new WeakHashMap());
        this.b = new i16((Object) pzaVar, (Object) ni6Var, (byte) 22);
        this.c = vzkVar;
        vzkVar.h(new rx(this, (byte) 5));
    }

    public s9i(smg smgVar) {
        this.a = (byte) 25;
        this.e = smgVar;
        this.c = qmg.a;
    }

    public s9i(u06 u06Var, w3b w3bVar, gvf gvfVar, gvf gvfVar2) {
        this.a = (byte) 2;
        this.d = u06Var;
        this.e = w3bVar;
        this.b = gvfVar;
        this.c = gvfVar2;
    }

    public s9i(x79 x79Var, jc9 jc9Var, cxj cxjVar, Map map, ydp ydpVar) {
        this.a = (byte) 20;
        this.b = x79Var;
        this.c = jc9Var;
        this.d = cxjVar;
        this.e = map;
    }

    public static s9i E(u06 u06Var, w3b w3bVar, gvf gvfVar, gvf gvfVar2) {
        if (gvfVar == gvf.d) {
            qp2.o("Impression owner is none");
            return null;
        }
        u06 u06Var2 = u06.b;
        gvf gvfVar3 = gvf.b;
        if ((u06Var != u06Var2 || gvfVar != gvfVar3) && (w3bVar != w3b.b || gvfVar != gvfVar3)) {
            return new s9i(u06Var, w3bVar, gvfVar, gvfVar2);
        }
        qp2.o("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }

    public final void A(zc7 zc7Var) {
        l0(zc7Var);
    }

    public final void B(f75 f75Var) {
        l0(f75Var);
    }

    public final void C(kvj kvjVar) {
        l0(kvjVar);
    }

    public final void D(iva ivaVar) {
        l0(ivaVar);
    }

    public final void F(k66 k66Var) {
        l0(k66Var);
    }

    public final void G(nj3 nj3Var) {
        l0(nj3Var);
    }

    @Override // defpackage.ssf
    public final void H(ByteArrayOutputStream byteArrayOutputStream, rsf rsfVar) throws IOException {
        x56 x56Var = ((g11) rsfVar).b;
        int i = xq0.d;
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(2);
            xq0.g4(dataOutputStream, x56Var);
        } finally {
            dataOutputStream.close();
        }
    }

    @Override // defpackage.bn
    public final void I() {
        ((p00) this.d).W();
    }

    public final void J(Iterable iterable) {
        pde pdeVar = (pde) this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) pdeVar.g());
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (Z((b2l) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        o95.t(arrayList, linkedHashSet2);
        if (linkedHashSet.removeAll(linkedHashSet2)) {
            pdeVar.r(linkedHashSet);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r0 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(long r9, long r11, nt5 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.cle
            if (r0 == 0) goto L14
            r0 = r13
            cle r0 = (defpackage.cle) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.v = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            cle r0 = new cle
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.t
            px5 r1 = px5.a
            int r2 = r13.v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            ybh.y(r0)
            goto L73
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r3
        L33:
            ybh.y(r0)
            goto L58
        L37:
            ybh.y(r0)
            java.lang.Object r0 = r8.b
            hle r0 = (hle) r0
            if (r0 == 0) goto L45
            hle r0 = r0.U0()
            goto L46
        L45:
            r0 = r3
        L46:
            r6 = 0
            if (r0 != 0) goto L5d
            java.lang.Object r8 = r8.c
            hle r8 = (hle) r8
            if (r8 == 0) goto L77
            r13.v = r5
            java.lang.Object r0 = r8.B0(r9, r11, r13)
            if (r0 == r1) goto L72
        L58:
            i1n r0 = (i1n) r0
            long r6 = r0.a
            goto L77
        L5d:
            java.lang.Object r8 = r8.b
            hle r8 = (hle) r8
            if (r8 == 0) goto L67
            hle r3 = r8.U0()
        L67:
            r8 = r3
            if (r8 == 0) goto L77
            r13.v = r4
            java.lang.Object r0 = r8.B0(r9, r11, r13)
            if (r0 != r1) goto L73
        L72:
            return r1
        L73:
            i1n r0 = (i1n) r0
            long r6 = r0.a
        L77:
            i1n r8 = new i1n
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9i.K(long, long, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(long r6, nt5 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dle
            if (r0 == 0) goto L13
            r0 = r8
            dle r0 = (defpackage.dle) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dle r0 = new dle
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r8)
            goto L46
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L2e:
            ybh.y(r8)
            java.lang.Object r5 = r5.b
            hle r5 = (hle) r5
            if (r5 == 0) goto L3b
            hle r3 = r5.U0()
        L3b:
            if (r3 == 0) goto L4b
            r0.v = r4
            java.lang.Object r8 = r3.f0(r6, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            i1n r8 = (i1n) r8
            long r5 = r8.a
            goto L4d
        L4b:
            r5 = 0
        L4d:
            i1n r7 = new i1n
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9i.L(long, nt5):java.lang.Object");
    }

    public final void M(fmg fmgVar, boolean z) {
        smg smgVar = (smg) this.e;
        List list = fmgVar.a;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (((lmg) list.get(i)).c()) {
                g0(fmgVar);
                return;
            }
        }
        wye wyeVar = (wye) this.b;
        if (wyeVar == null) {
            qp2.n("layoutCoordinates not set");
            return;
        }
        gyg.W(fmgVar, wyeVar.U(0L), new vvf(this, smgVar, (byte) 4), false);
        if (((qmg) this.c) == qmg.b) {
            if (z) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((lmg) list.get(i2)).a();
                }
            }
            rn9 rn9Var = fmgVar.b;
            if (rn9Var != null) {
                rn9Var.b = !smgVar.d;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r8 != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r8 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(nt5 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            ie6 r0 = (ie6) r0
            boolean r1 = r8 instanceof defpackage.sd6
            if (r1 == 0) goto L17
            r1 = r8
            sd6 r1 = (defpackage.sd6) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            sd6 r1 = new sd6
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.t
            px5 r2 = px5.a
            int r3 = r1.v
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L39
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            ybh.y(r8)
            goto L59
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r4
        L35:
            ybh.y(r8)
            goto L66
        L39:
            ybh.y(r8)
            java.lang.Object r8 = r7.d
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L5c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L5c
            ylj r8 = r0.c()
            vd6 r3 = new vd6
            r3.<init>(r0, r7, r4)
            r1.v = r5
            java.lang.Object r8 = r8.b(r3, r1)
            if (r8 == r2) goto L65
        L59:
            jb6 r8 = (jb6) r8
            goto L68
        L5c:
            r1.v = r6
            r7 = 0
            java.lang.Object r8 = r0.h(r7, r1)
            if (r8 != r2) goto L66
        L65:
            return r2
        L66:
            jb6 r8 = (jb6) r8
        L68:
            je6 r7 = r0.h
            r7.c(r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9i.N(nt5):java.lang.Object");
    }

    public final void O() {
        cxj cxjVar = (cxj) this.d;
        StringBuilder sb = cxjVar.a;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        cxjVar.a('\n');
    }

    public final Path P(PointF pointF) {
        Matrix matrix = (Matrix) this.d;
        Path path = (Path) this.c;
        PointF pointF2 = (PointF) this.e;
        if (pointF2.equals(pointF)) {
            return path;
        }
        pointF2.set(pointF);
        matrix.setScale(pointF.x, pointF.y);
        path.reset();
        path.set((Path) this.b);
        path.transform(matrix);
        return path;
    }

    public final nx5 Q() {
        nx5 nx5Var = (nx5) ((Function0) this.d).invoke();
        if (nx5Var != null) {
            return nx5Var;
        }
        qp2.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final int R(int i) {
        tq8 tq8Var = (tq8) this.b;
        if (i >= tq8Var.e.size()) {
            return ((gyj) ((ArrayList) this.d).get(i - tq8Var.e.size())).a;
        }
        hq8 hq8VarU = tq8Var.u(i);
        if (hq8VarU instanceof qok) {
            return 2131362856;
        }
        if (hq8VarU instanceof PushedSpeedDialFavorite) {
            return 2131362855;
        }
        return hq8VarU.j() ? 2131362849 : 2131362851;
    }

    public final void S(xoi xoiVar, long j) {
        ro9 ro9Var = (ro9) this.c;
        ro9Var.b = 2;
        ((ExtendedFloatingActionButton) ro9Var.d).animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setStartDelay(j).withStartAction((tba) this.d).withEndAction((tba) this.e).start();
    }

    public final void T() {
        ro9 ro9Var = (ro9) this.c;
        if (ro9Var == null) {
            return;
        }
        ((ExtendedFloatingActionButton) ro9Var.d).animate().cancel();
        ((FrameLayout) this.b).removeView((ExtendedFloatingActionButton) ((ro9) this.c).d);
        xoi xoiVar = (xoi) ((ro9) this.c).c;
        x5f x5fVar = xoiVar.d;
        boolean z = xoiVar.f;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            be0 be0Var = new be0(2443, -1, 2);
            be0Var.r(1, 1, z);
            be0Var.q(0, 1, ce0.b);
            x56 x56VarF = zpa.F();
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(9);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 9, am2.q(xb0VarX, 9, 1)) : new hf0(xb0VarX, 9, list)).add(be0Var);
            x5fVar.U0(x56VarF);
        }
        xoiVar.f = false;
        this.c = null;
    }

    public final void U(xoi xoiVar) {
        ro9 ro9Var = (ro9) this.c;
        if (ro9Var == null || !((xoi) ro9Var.c).equals(xoiVar)) {
            return;
        }
        ro9 ro9Var2 = (ro9) this.c;
        int i = ro9Var2.b;
        if (i == 2) {
            ((ExtendedFloatingActionButton) ro9Var2.d).animate().cancel();
            S(xoiVar, 0L);
        } else if (i == 1) {
            T();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3 A[Catch: i3k -> 0x0109, TRY_ENTER, TryCatch #0 {i3k -> 0x0109, blocks: (B:14:0x002e, B:41:0x00ff, B:37:0x00e3), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(java.lang.String r10, nt5 r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9i.V(java.lang.String, nt5):java.lang.Object");
    }

    public final boolean W() {
        qyi qyiVar = (qyi) ((pde) this.d).g();
        return (qyiVar instanceof pyi) && ((pyi) qyiVar).a == ((LinkedHashSet) ((pde) this.c).g()).size();
    }

    public final boolean X(Collection collection) {
        return ((LinkedHashSet) ((pde) this.c).g()).containsAll(collection);
    }

    public final boolean Y() {
        return !Intrinsics.a(((pde) this.d).g(), oyi.a);
    }

    public final boolean Z(b2l b2lVar) {
        if (Y()) {
            return ((u3l) this.e).a(b2lVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(DialogTitle dialogTitle, StylingTextView stylingTextView, Button button, Button button2) {
        na2.S(dialogTitle, ((pxh) this.b).a(dialogTitle.getResources()));
        na2.S(stylingTextView, ((pxh) this.c).a(stylingTextView.getResources()));
        button.setText(((rxh) this.d).a(button.getResources()));
        button2.setText(((rxh) this.e).a(button2.getResources()));
    }

    public final int a0() {
        return ((cxj) this.d).a.length();
    }

    @Override // defpackage.ssf
    public final rsf b() {
        return new g11(this, zpa.F());
    }

    public final void b0() {
        k6l k6lVar = (k6l) this.b;
        pde pdeVar = (pde) this.d;
        if (Y() && ((ArrayList) k6lVar.d.b).isEmpty()) {
            qyi qyiVar = (qyi) pdeVar.g();
            pdeVar.r(new pyi(exg.p(k6lVar, (u3l) this.e, y6l.a).size(), (u3l) this.e, !qyiVar.equals(oyi.a) && ((pyi) qyiVar).c));
        }
    }

    public final void c(nel nelVar) {
        l0(nelVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(nt5 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            cd5 r0 = (cd5) r0
            boolean r1 = r9 instanceof defpackage.xbi
            if (r1 == 0) goto L17
            r1 = r9
            xbi r1 = (defpackage.xbi) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.w = r2
            goto L1c
        L17:
            xbi r1 = new xbi
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r1.u
            px5 r2 = px5.a
            int r3 = r1.w
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L37
            if (r3 != r4) goto L31
            pfe r8 = r1.t
            ybh.y(r9)     // Catch: java.lang.Throwable -> L79
            goto L70
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r6
        L37:
            pfe r3 = r1.t
            ybh.y(r9)
            r9 = r3
            goto L58
        L3e:
            ybh.y(r9)
            boolean r9 = r0.h0()
            if (r9 == 0) goto L4a
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L4a:
            java.lang.Object r9 = r8.b
            pfe r9 = (pfe) r9
            r1.t = r9
            r1.w = r5
            java.lang.Object r3 = r9.i(r1)
            if (r3 == r2) goto L6e
        L58:
            boolean r3 = r0.h0()     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L64
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L7b
            r9.l(r6)
            return r8
        L64:
            r1.t = r9     // Catch: java.lang.Throwable -> L7b
            r1.w = r4     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r8.N(r1)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r2) goto L6f
        L6e:
            return r2
        L6f:
            r8 = r9
        L70:
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L79
            r0.j0(r9)     // Catch: java.lang.Throwable -> L79
            r8.l(r6)
            return r9
        L79:
            r9 = move-exception
            goto L7f
        L7b:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L7f:
            r8.l(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9i.c0(nt5):java.lang.Object");
    }

    public final void d(bsf bsfVar) {
        l0(bsfVar);
    }

    public final void d0(Iterable iterable) {
        pde pdeVar = (pde) this.c;
        LinkedHashSet linkedHashSet = (LinkedHashSet) pdeVar.g();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        List listUnmodifiableList = Collections.unmodifiableList(((k6l) this.b).b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listUnmodifiableList) {
            b2l b2lVar = (b2l) obj;
            if (linkedHashSet.contains(b2lVar) || CollectionsKt.E(iterable, b2lVar)) {
                arrayList.add(obj);
            }
        }
        linkedHashSet2.addAll(arrayList);
        if (Intrinsics.a(linkedHashSet, linkedHashSet2)) {
            return;
        }
        pdeVar.r(linkedHashSet2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gln
    public final void e(ArrayList arrayList) {
        Object obj;
        uk5 uk5Var = (uk5) this.d;
        Set set = (Set) this.b;
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        Object[] objArr = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((aln) obj2).getId());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : set) {
            if (!arrayList2.contains((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        if (!arrayList3.isEmpty()) {
            ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, 10));
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj4 = arrayList3.get(i);
                i++;
                arrayList4.add(new jjb((String) obj4));
            }
            uk5Var.run(new rw7(arrayList4));
            return;
        }
        String str = (String) CollectionsKt.firstOrNull((ffb) this.c);
        if (str != null) {
            qln qlnVar = (qln) ((Lazy) ((zy9) this.e).a).get();
            int size3 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i3);
                i3++;
                if (Intrinsics.a(((aln) obj).getId(), vq8.m(str))) {
                    break;
                }
            }
            aln alnVar = (aln) obj;
            iu2 iu2Var = new iu2(uk5Var, (byte) 21);
            if (alnVar == null) {
                qlnVar.getClass();
                iu2Var.run(new zmn(objArr == true ? 1 : 0));
            } else {
                rgh rghVar = qlnVar.m;
                o2c o2cVar = new o2c(false, (((Resources) rghVar.b).getDisplayMetrics().widthPixels * 90) / 100, ((((Resources) rghVar.b).getDisplayMetrics().heightPixels - ((Context) rghVar.a).getResources().getDimensionPixelSize(2131165344)) * 90) / 100, false);
                new qjn(qlnVar.g, alnVar.c(qlnVar.a, o2cVar), iu2Var, o2cVar);
            }
        }
    }

    public final void e0(int i, Object obj) {
        cxj cxjVar = (cxj) this.d;
        StringBuilder sb = cxjVar.a;
        int length = sb.length();
        if (obj != null) {
            int length2 = sb.length();
            if (length <= i || i < 0 || length > length2) {
                return;
            }
            cxj.d(cxjVar, obj, i, length);
        }
    }

    public final void f(k73 k73Var) {
        if (((k73) k73Var.f) != null) {
            O();
            ((cxj) this.d).a('\n');
        }
    }

    public final void f0(Class cls, int i) {
        x79 x79Var = (x79) this.b;
        rj3 rj3Var = (rj3) ((pw1) x79Var.e).a.get(cls);
        if (rj3Var != null) {
            e0(i, rj3Var.a(x79Var, (jc9) this.c));
        }
    }

    public final void g(k9a k9aVar) {
        l0(k9aVar);
    }

    public final void g0(fmg fmgVar) {
        if (((qmg) this.c) == qmg.b) {
            wye wyeVar = (wye) this.b;
            if (wyeVar == null) {
                qp2.n("layoutCoordinates not set");
                return;
            }
            gyg.W(fmgVar, wyeVar.U(0L), new rmg((smg) this.e, (byte) 0), true);
        }
        this.c = qmg.c;
    }

    public final void h(mma mmaVar) {
        l0(mmaVar);
    }

    public final void h0() {
        if (Y()) {
            ((pde) this.c).r(new LinkedHashSet());
            ((pde) this.d).r(oyi.a);
        }
    }

    @Override // defpackage.bn
    public final void i() {
        cie cieVar = (cie) this.b;
        w06 w06Var = cieVar.d;
        q00 q00Var = (q00) this.e;
        if (s00.q(w06Var, 1)) {
            q00Var.h(cieVar, (String) this.c, (p00) this.d);
            return;
        }
        v50 v50VarP = s00.p(w06Var);
        q00Var.b(false, "Unsupported type #" + ((int) v50VarP.a), false, v50VarP, null);
    }

    public final boolean i0() {
        tq8 tq8Var = (tq8) this.b;
        return (tq8Var instanceof ydh) || (tq8Var instanceof f);
    }

    public final void j(tik tikVar) {
        l0(tikVar);
    }

    public final void j0(b2l b2lVar) {
        if (((LinkedHashSet) ((pde) this.c).g()).contains(b2lVar)) {
            J(Collections.singletonList(b2lVar));
        } else {
            d0(Collections.singletonList(b2lVar));
        }
    }

    public final void k(bll bllVar) {
        l0(bllVar);
    }

    public final void k0(boolean z) {
        tq8 tq8Var = (tq8) this.b;
        if (tq8Var instanceof ydh) {
            ydh ydhVar = (ydh) tq8Var;
            if (ydhVar.m != z) {
                ydhVar.m = z;
                ydhVar.D();
            }
        }
        ArrayList arrayList = new ArrayList();
        sfe.z(arrayList, new zlb((ArrayList) this.c, new o00((byte) 5), (byte) 0));
        j87 j87VarK = uup.k(new js8(this, arrayList), true);
        this.d = arrayList;
        j87VarK.a(new xm5(this));
    }

    public final void l(xy8 xy8Var) {
        l0(xy8Var);
    }

    public final void l0(k73 k73Var) {
        xbd xbdVar = (xbd) ((Map) this.e).get(k73Var.getClass());
        if (xbdVar != null) {
            xbdVar.a(this, k73Var);
        } else {
            m0(k73Var);
        }
    }

    @Override // defpackage.bn
    public final void m(bm bmVar) {
        ((q00) this.e).b(bmVar == bm.d, bmVar.c, false, null, null);
    }

    public final void m0(k73 k73Var) {
        k73 k73Var2 = (k73) k73Var.c;
        while (k73Var2 != null) {
            k73 k73Var3 = (k73) k73Var2.f;
            k73Var2.a(this);
            k73Var2 = k73Var3;
        }
    }

    public final void n(qz7 qz7Var) {
        l0(qz7Var);
    }

    public final void o(kal kalVar) {
        l0(kalVar);
    }

    @Override // defpackage.bn
    public final void onAdClicked() {
        ((p00) this.d).V();
    }

    @Override // defpackage.gln
    public final void onFailure() {
        ((uk5) this.d).run(new rw7(Collections.singletonList(xle.b)));
    }

    public final void p(l7a l7aVar) {
        l0(l7aVar);
    }

    public final void q(szf szfVar) {
        l0(szfVar);
    }

    public final void r(mfc mfcVar) {
        l0(mfcVar);
    }

    public final void s(phc phcVar) {
        l0(phcVar);
    }

    @Override // defpackage.xyn
    public final void t(String str) {
        switch (this.a) {
            case 0:
                try {
                    ((qq8) this.c).j(new orb(str));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            default:
                try {
                    ((qq8) this.c).j(new orb(str));
                    break;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }

    public final void u(xfc xfcVar) {
        l0(xfcVar);
    }

    @Override // defpackage.ssf
    public final rsf v(ByteArrayInputStream byteArrayInputStream) throws IOException {
        x56 x56VarF = zpa.F();
        xq0 xq0Var = (xq0) this.d;
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            xq0Var.K2(dataInputStream);
            xq0Var.b1(dataInputStream, x56VarF, dataInputStream.readShort());
            dataInputStream.close();
            return new g11(this, x56VarF);
        } catch (Throwable th) {
            dataInputStream.close();
            throw th;
        }
    }

    @Override // defpackage.xyn
    public final void w(String str, ilm ilmVar) {
        switch (this.a) {
            case 0:
                try {
                    y55.z(new orb(str), (ala) this.b, new isd((Object) ilmVar, (byte) 20));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            default:
                try {
                    qs7.z(new orb(str), (ta7) this.b, new qq6(ilmVar, (byte) 26));
                    break;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }

    public final void x(h14 h14Var) {
        l0(h14Var);
    }

    public final void y(yma ymaVar) {
        l0(ymaVar);
    }

    public final void z(u5b u5bVar) {
        l0(u5bVar);
    }
}
