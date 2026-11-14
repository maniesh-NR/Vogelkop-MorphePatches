package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class kgg extends und {
    public static final ArrayList s;
    public static final ArrayList t;
    public final ez9 i;
    public final MediaRouter j;
    public final hod k;
    public final iod l;
    public final MediaRouter.RouteCategory m;
    public int n;
    public boolean o;
    public boolean p;
    public final ArrayList q;
    public final ArrayList r;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        s = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        t = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public kgg(Context context, ez9 ez9Var) {
        super(context, new lld(new ComponentName("android", kgg.class.getName()), (byte) 1));
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.i = ez9Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.j = mediaRouter;
        this.k = new hod(this);
        this.l = new iod(this);
        this.m = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2132019853), false);
        s();
    }

    public static ngg m(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof ngg) {
            return (ngg) tag;
        }
        return null;
    }

    public static void t(ngg nggVar) {
        MediaRouter.UserRouteInfo userRouteInfo = nggVar.b;
        cod codVar = nggVar.a;
        userRouteInfo.setName(codVar.d);
        userRouteInfo.setPlaybackType(codVar.l);
        userRouteInfo.setPlaybackStream(codVar.m);
        userRouteInfo.setVolume(codVar.p);
        userRouteInfo.setVolumeMax(codVar.q);
        userRouteInfo.setVolumeHandling((!codVar.e() || dod.h()) ? codVar.o : 0);
        userRouteInfo.setDescription(codVar.e);
    }

    @Override // defpackage.und
    public final snd b(String str) {
        int iJ = j(str);
        if (iJ >= 0) {
            return new lgg(((mgg) this.q.get(iJ)).a);
        }
        return null;
    }

    @Override // defpackage.und
    public final void e(dnd dndVar) {
        boolean zB;
        int i = 0;
        if (dndVar != null) {
            dndVar.a();
            ArrayList arrayListC = dndVar.c.c();
            int size = arrayListC.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) arrayListC.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            zB = dndVar.b();
            i = i2;
        } else {
            zB = false;
        }
        if (this.n == i && this.o == zB) {
            return;
        }
        this.n = i;
        this.o = zB;
        s();
    }

    public final boolean h(MediaRouter.RouteInfo routeInfo) {
        String str;
        if (m(routeInfo) != null || i(routeInfo) >= 0) {
            return false;
        }
        String str2 = this.j.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(l(routeInfo).hashCode()));
        if (j(str2) >= 0) {
            int i = 2;
            while (true) {
                Locale locale = Locale.US;
                str = str2 + "_" + i;
                if (j(str) < 0) {
                    break;
                }
                i++;
            }
            str2 = str;
        }
        mgg mggVar = new mgg(routeInfo, str2);
        r(mggVar);
        this.q.add(mggVar);
        return true;
    }

    public final int i(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((mgg) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int j(String str) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((mgg) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int k(cod codVar) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ngg) arrayList.get(i)).a == codVar) {
                return i;
            }
        }
        return -1;
    }

    public final String l(MediaRouter.RouteInfo routeInfo) {
        Context context = this.a;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return "";
        }
        int deviceType = routeInfo.getDeviceType();
        return context.getString(deviceType != 1 ? deviceType != 2 ? deviceType != 3 ? 2132019851 : 2132019848 : 2132019849 : 2132019850);
    }

    public final void n(cod codVar) {
        und undVarC = codVar.c();
        MediaRouter mediaRouter = this.j;
        if (undVarC == this) {
            int i = i(mediaRouter.getSelectedRoute(8388611));
            if (i < 0 || !((mgg) this.q.get(i)).b.equals(codVar.b)) {
                return;
            }
            codVar.l(false);
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.m);
        ngg nggVar = new ngg(codVar, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(nggVar);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.l);
        t(nggVar);
        this.r.add(nggVar);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    public final void o(cod codVar) {
        int iK;
        if (codVar.c() == this || (iK = k(codVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((ngg) this.r.remove(iK)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.j.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void p(cod codVar) {
        if (codVar.g()) {
            und undVarC = codVar.c();
            MediaRouter mediaRouter = this.j;
            if (undVarC != this) {
                int iK = k(codVar);
                if (iK >= 0) {
                    mediaRouter.selectRoute(8388611, ((ngg) this.r.get(iK)).b);
                    return;
                }
                return;
            }
            int iJ = j(codVar.b);
            if (iJ >= 0) {
                mediaRouter.selectRoute(8388611, ((mgg) this.q.get(iJ)).a);
            }
        }
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.q;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            bnd bndVar = ((mgg) arrayList2.get(i)).c;
            if (bndVar == null) {
                qp2.o("route must not be null");
                return;
            } else {
                if (arrayList.contains(bndVar)) {
                    qp2.o("route descriptor already added");
                    return;
                }
                arrayList.add(bndVar);
            }
        }
        f(new mi9(arrayList, false));
    }

    public final void r(mgg mggVar) {
        String str = mggVar.b;
        MediaRouter.RouteInfo routeInfo = mggVar.a;
        igi igiVar = new igi(str, l(routeInfo));
        Bundle bundle = (Bundle) igiVar.b;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            igiVar.b(s);
        }
        if ((supportedTypes & 2) != 0) {
            igiVar.b(t);
        }
        bundle.putInt("playbackType", routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (routeInfo.isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString(NotificationCompat.CATEGORY_STATUS, description.toString());
        }
        bundle.putInt("deviceType", routeInfo.getDeviceType());
        mggVar.c = igiVar.i();
    }

    public final void s() {
        boolean z = this.p;
        hod hodVar = this.k;
        MediaRouter mediaRouter = this.j;
        if (z) {
            mediaRouter.removeCallback(hodVar);
        }
        this.p = true;
        mediaRouter.addCallback(this.n, hodVar, (this.o ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zH = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zH |= h((MediaRouter.RouteInfo) obj);
        }
        if (zH) {
            q();
        }
    }
}
