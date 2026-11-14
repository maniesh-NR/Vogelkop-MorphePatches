package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class hod extends MediaRouter.Callback {
    public final kgg a;

    public hod(kgg kggVar) {
        this.a = kggVar;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        kgg kggVar = this.a;
        if (kggVar.h(routeInfo)) {
            kggVar.q();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        kgg kggVar = this.a;
        kggVar.getClass();
        if (kgg.m(routeInfo) != null || (i = kggVar.i(routeInfo)) < 0) {
            return;
        }
        kggVar.r((mgg) kggVar.q.get(i));
        kggVar.q();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        kgg kggVar = this.a;
        int i = kggVar.i(routeInfo);
        if (i >= 0) {
            mgg mggVar = (mgg) kggVar.q.get(i);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != mggVar.c.a.getInt("presentationDisplayId", -1)) {
                bnd bndVar = mggVar.c;
                if (bndVar == null) {
                    qp2.o("descriptor must not be null");
                    return;
                }
                Bundle bundle = new Bundle(bndVar.a);
                ArrayList arrayListC = bndVar.c();
                ArrayList arrayListB = bndVar.b();
                HashSet hashSetA = bndVar.a();
                List list = bndVar.c;
                String str = bndVar.b;
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                mggVar.c = new bnd(str, bundle, list);
                kggVar.q();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        kgg kggVar = this.a;
        kggVar.getClass();
        if (kgg.m(routeInfo) != null || (i = kggVar.i(routeInfo)) < 0) {
            return;
        }
        kggVar.q.remove(i);
        kggVar.q();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        cod codVarA;
        kgg kggVar = this.a;
        if (routeInfo == kggVar.j.getSelectedRoute(8388611)) {
            ngg nggVarM = kgg.m(routeInfo);
            if (nggVarM != null) {
                nggVarM.a.l(false);
                return;
            }
            int i2 = kggVar.i(routeInfo);
            if (i2 >= 0) {
                mgg mggVar = (mgg) kggVar.q.get(i2);
                ez9 ez9Var = kggVar.i;
                String str = mggVar.b;
                ez9Var.a.removeMessages(262);
                bod bodVarD = ez9Var.d(ez9Var.t);
                if (bodVarD == null || (codVarA = bodVarD.a(str)) == null) {
                    return;
                }
                ez9Var.l(codVarA, 3, 2, false);
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        kgg kggVar = this.a;
        kggVar.getClass();
        if (kgg.m(routeInfo) != null || (i = kggVar.i(routeInfo)) < 0) {
            return;
        }
        mgg mggVar = (mgg) kggVar.q.get(i);
        int volume = routeInfo.getVolume();
        if (volume != mggVar.c.a.getInt("volume")) {
            bnd bndVar = mggVar.c;
            if (bndVar == null) {
                qp2.o("descriptor must not be null");
                return;
            }
            Bundle bundle = new Bundle(bndVar.a);
            ArrayList arrayListC = bndVar.c();
            ArrayList arrayListB = bndVar.b();
            HashSet hashSetA = bndVar.a();
            List list = bndVar.c;
            String str = bndVar.b;
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
            mggVar.c = new bnd(str, bundle, list);
            kggVar.q();
        }
    }
}
