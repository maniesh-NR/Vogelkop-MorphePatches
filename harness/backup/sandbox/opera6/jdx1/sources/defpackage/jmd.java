package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jmd extends und {
    public final MediaRouter2 i;
    public final qq6 j;
    public final ArrayMap k;
    public final MediaRouter2$RouteCallback l;
    public final imd m;
    public final emd n;
    public final jj5 o;
    public boolean p;
    public ArrayList q;
    public final ArrayMap r;
    public String s;

    public jmd(Context context, qq6 qq6Var) {
        super(context, null);
        this.k = new ArrayMap();
        this.m = new imd(this);
        this.n = new emd(this);
        this.q = new ArrayList();
        this.r = new ArrayMap();
        this.i = MediaRouter2.getInstance(context);
        this.j = qq6Var;
        this.o = new jj5(new Handler(Looper.getMainLooper()), (byte) 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.l = new hmd(this, (byte) 1);
        } else {
            this.l = new hmd(this, (byte) 0);
        }
    }

    public static Messenger h(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String j(snd sndVar) {
        MediaRouter2.RoutingController routingController;
        if ((sndVar instanceof fmd) && (routingController = ((fmd) sndVar).g) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override // defpackage.und
    public final rnd a(String str, tnd tndVar) {
        Iterator it = this.k.entrySet().iterator();
        while (it.hasNext()) {
            fmd fmdVar = (fmd) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, fmdVar.f)) {
                return fmdVar;
            }
        }
        return null;
    }

    @Override // defpackage.und
    public final snd b(String str) {
        return new gmd((String) this.r.get(str), null);
    }

    @Override // defpackage.und
    public final snd d(String str, String str2) {
        String str3 = (String) this.r.get(str);
        for (fmd fmdVar : this.k.values()) {
            if (TextUtils.equals(str2, fmdVar.p())) {
                return new gmd(str3, fmdVar);
            }
        }
        return new gmd(str3, null);
    }

    @Override // defpackage.und
    public final void e(dnd dndVar) {
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        String str;
        int i = dod.c == null ? 0 : dod.c().D;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.l;
        emd emdVar = this.n;
        imd imdVar = this.m;
        if (i <= 0) {
            this.i.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.i.unregisterTransferCallback(imdVar);
            this.i.unregisterControllerCallback(emdVar);
            return;
        }
        god godVar = dod.c().v;
        boolean z = godVar == null ? false : godVar.d;
        if (dndVar == null) {
            dndVar = new dnd(vnd.c, false);
        }
        dndVar.a();
        ArrayList arrayListC = dndVar.c.c();
        if (!z) {
            arrayListC.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListC.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListC.add("android.media.intent.category.LIVE_AUDIO");
        }
        fv1 fv1Var = new fv1();
        fv1Var.c(arrayListC);
        vnd vndVarD = fv1Var.d();
        boolean zB = dndVar.b();
        if (vndVarD == null) {
            qp2.o("selector must not be null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("selector", vndVarD.a);
        bundle.putBoolean("activeScan", zB);
        MediaRouter2 mediaRouter2 = this.i;
        vndVarD.a();
        if (vndVarD.b.contains(null)) {
            dz0.d();
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean z2 = bundle.getBoolean("activeScan");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListC2 = vndVarD.c();
            int size = arrayListC2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListC2.get(i2);
                i2++;
                str = (String) obj;
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                    case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                        break;
                    case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                        break;
                }
                arrayList.add(str);
            }
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(arrayList, z2).build();
        }
        jj5 jj5Var = this.o;
        mediaRouter2.registerRouteCallback(jj5Var, mediaRouter2$RouteCallback, routeDiscoveryPreferenceBuild);
        this.i.registerTransferCallback(jj5Var, imdVar);
        this.i.registerControllerCallback(jj5Var, emdVar);
    }

    public final MediaRoute2Info i(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MediaRoute2Info mediaRoute2InfoE = uac.e(obj);
            if (TextUtils.equals(mediaRoute2InfoE.getId(), str)) {
                return mediaRoute2InfoE;
            }
        }
        return null;
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.i.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoE = uac.e(it.next());
            if (mediaRoute2InfoE != null && !arraySet.contains(mediaRoute2InfoE) && !mediaRoute2InfoE.isSystemRoute()) {
                if (this.p) {
                    if (mediaRoute2InfoE.getId().startsWith(this.a.getPackageName() + "/")) {
                    }
                }
                arraySet.add(mediaRoute2InfoE);
                arrayList.add(mediaRoute2InfoE);
            }
        }
        if (arrayList.equals(this.q)) {
            return;
        }
        this.q = arrayList;
        ArrayMap arrayMap = this.r;
        arrayMap.clear();
        ArrayList arrayList2 = this.q;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            MediaRoute2Info mediaRoute2InfoE2 = uac.e(obj);
            Bundle extras = mediaRoute2InfoE2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                mediaRoute2InfoE2.toString();
            } else {
                arrayMap.put(mediaRoute2InfoE2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.q;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            bnd bndVarY = r9n.Y(uac.e(obj2));
            if (bndVarY != null) {
                arrayList3.add(bndVarY);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                bnd bndVar = (bnd) obj3;
                if (bndVar == null) {
                    qp2.o("route must not be null");
                    return;
                } else {
                    if (arrayList5.contains(bndVar)) {
                        qp2.o("route descriptor already added");
                        return;
                    }
                    arrayList5.add(bndVar);
                }
            }
        }
        f(new mi9(arrayList5, true));
    }

    public final void l(MediaRouter2.RoutingController routingController) {
        igi igiVar;
        fmd fmdVar = (fmd) this.k.get(routingController);
        if (fmdVar == null) {
            Objects.toString(routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList arrayListW = r9n.w(selectedRoutes);
        bnd bndVarY = r9n.Y(uac.e(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(2132019845);
        bnd bndVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    bndVar = new bnd(null, bundle, Collections.EMPTY_LIST);
                }
            } catch (Exception unused) {
            }
        }
        if (bndVar == null) {
            igiVar = new igi(routingController.getId(), string);
            Bundle bundle2 = (Bundle) igiVar.b;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            igiVar = new igi(bndVar);
        }
        Bundle bundle3 = (Bundle) igiVar.b;
        igiVar.g = routingController.getId();
        bundle3.putInt("volume", routingController.getVolume());
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        ((ArrayList) igiVar.d).clear();
        igiVar.b(bndVarY.b());
        ((ArrayList) igiVar.c).clear();
        igiVar.c(arrayListW);
        bnd bndVarI = igiVar.i();
        ArrayList arrayListW2 = r9n.w(routingController.getSelectableRoutes());
        ArrayList arrayListW3 = r9n.w(routingController.getDeselectableRoutes());
        mi9 mi9Var = this.g;
        if (mi9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<bnd> list = mi9Var.b;
        if (!list.isEmpty()) {
            for (bnd bndVar2 : list) {
                String strD = bndVar2.d();
                arrayList.add(new qnd(bndVar2, arrayListW.contains(strD) ? 3 : 1, arrayListW3.contains(strD), arrayListW2.contains(strD), true));
            }
        }
        fmdVar.o = bndVarI;
        fmdVar.l(bndVarI, arrayList);
    }

    public final void m(String str) {
        MediaRoute2Info mediaRoute2InfoI = i(str);
        if (mediaRoute2InfoI == null) {
            return;
        }
        if (TextUtils.equals(this.s, str)) {
            mediaRoute2InfoI.toString();
        } else {
            this.s = str;
            this.i.transferTo(mediaRoute2InfoI);
        }
    }
}
