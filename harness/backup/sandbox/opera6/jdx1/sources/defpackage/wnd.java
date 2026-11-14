package defpackage;

/* loaded from: classes.dex */
public abstract class wnd {
    public void onProviderAdded(dod dodVar, bod bodVar) {
    }

    public void onProviderChanged(dod dodVar, bod bodVar) {
    }

    public void onProviderRemoved(dod dodVar, bod bodVar) {
    }

    public void onRouteAdded(dod dodVar, cod codVar) {
    }

    public void onRouteChanged(dod dodVar, cod codVar) {
    }

    public void onRouteConnected(dod dodVar, cod codVar, cod codVar2) {
    }

    public void onRouteDisconnected(dod dodVar, cod codVar, cod codVar2, int i) {
    }

    public void onRoutePresentationDisplayChanged(dod dodVar, cod codVar) {
    }

    public void onRouteRemoved(dod dodVar, cod codVar) {
    }

    @Deprecated
    public void onRouteSelected(dod dodVar, cod codVar) {
    }

    public void onRouteSelected(dod dodVar, cod codVar, int i) {
        onRouteSelected(dodVar, codVar);
    }

    public void onRouteSelected(dod dodVar, cod codVar, int i, cod codVar2) {
        onRouteSelected(dodVar, codVar, i);
    }

    public void onRouteSelected(dod dodVar, cod codVar, cod codVar2, jzi jziVar) {
        onRouteSelected(dodVar, codVar, jziVar.a, codVar2);
    }

    @Deprecated
    public void onRouteUnselected(dod dodVar, cod codVar) {
    }

    public void onRouteUnselected(dod dodVar, cod codVar, int i) {
        onRouteUnselected(dodVar, codVar);
    }

    public void onRouteVolumeChanged(dod dodVar, cod codVar) {
    }

    public void onRouterParamsChanged(dod dodVar, god godVar) {
    }
}
