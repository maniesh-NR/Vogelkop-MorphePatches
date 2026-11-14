package defpackage;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.webkit.Profile;
import java.lang.reflect.InvocationHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.OriginMatchedHeaderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* loaded from: classes.dex */
public final class g4h implements Profile {
    public final ProfileBoundaryInterface a;

    public g4h(ProfileBoundaryInterface profileBoundaryInterface) {
        this.a = profileBoundaryInterface;
    }

    public final HashSet a(String str, String str2) {
        HashSet hashSet = new HashSet();
        Iterator<InvocationHandler> it = this.a.getOriginMatchedHeaders(str, str2).iterator();
        while (it.hasNext()) {
            OriginMatchedHeaderBoundaryInterface originMatchedHeaderBoundaryInterface = (OriginMatchedHeaderBoundaryInterface) fr3.m(OriginMatchedHeaderBoundaryInterface.class, it.next());
            hashSet.add(new d56(originMatchedHeaderBoundaryInterface.getName(), originMatchedHeaderBoundaryInterface.getValue(), originMatchedHeaderBoundaryInterface.getRules()));
        }
        return hashSet;
    }

    @Override // androidx.webkit.Profile
    public final void addCustomHeader(d56 d56Var) {
        if (!axn.E.a()) {
            throw axn.a();
        }
        this.a.addOriginMatchedHeader(d56Var.a, d56Var.b, d56Var.c);
    }

    @Override // androidx.webkit.Profile
    public final void addQuicHints(Set set) {
        if (!axn.G.a()) {
            throw axn.a();
        }
        this.a.addQuicHints(set);
    }

    @Override // androidx.webkit.Profile
    public final void clearAllCustomHeaders() {
        if (!axn.E.a()) {
            throw axn.a();
        }
        this.a.clearAllOriginMatchedHeaders();
    }

    @Override // androidx.webkit.Profile
    public final void clearAllOriginMatchedHeaders() {
        if (!axn.D.a()) {
            throw axn.a();
        }
        this.a.clearAllOriginMatchedHeaders();
    }

    @Override // androidx.webkit.Profile
    public final void clearCustomHeader(String str) {
        if (!axn.E.a()) {
            throw axn.a();
        }
        this.a.clearOriginMatchedHeader(str, null);
    }

    @Override // androidx.webkit.Profile
    public final void clearCustomHeader(String str, String str2) {
        if (!axn.E.a()) {
            throw axn.a();
        }
        this.a.clearOriginMatchedHeader(str, str2);
    }

    @Override // androidx.webkit.Profile
    public final void clearOriginMatchedHeader(String str) {
        if (!axn.D.a()) {
            throw axn.a();
        }
        this.a.clearOriginMatchedHeader(str);
    }

    @Override // androidx.webkit.Profile
    public final void clearPrefetchAsync(String str, Executor executor, gtf gtfVar) {
        if (!axn.s.a()) {
            throw axn.a();
        }
        this.a.clearPrefetch(str, executor, new er3(new wsg(gtfVar)));
    }

    @Override // androidx.webkit.Profile
    public final CookieManager getCookieManager() {
        if (axn.q.a()) {
            return this.a.getCookieManager();
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders() {
        if (axn.E.a()) {
            return a(null, null);
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders(String str) {
        if (axn.E.a()) {
            return a(str, null);
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders(String str, String str2) {
        if (axn.E.a()) {
            return a(str, str2);
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final GeolocationPermissions getGeolocationPermissions() {
        if (axn.q.a()) {
            return this.a.getGeoLocationPermissions();
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final String getName() {
        if (axn.q.a()) {
            return this.a.getName();
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final ServiceWorkerController getServiceWorkerController() {
        if (axn.q.a()) {
            return this.a.getServiceWorkerController();
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final WebStorage getWebStorage() {
        if (axn.q.a()) {
            return this.a.getWebStorage();
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final boolean hasCustomHeader(String str) {
        if (axn.E.a()) {
            return this.a.hasOriginMatchedHeader(str);
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final boolean hasOriginMatchedHeader(String str) {
        if (axn.D.a()) {
            return this.a.hasOriginMatchedHeader(str);
        }
        throw axn.a();
    }

    @Override // androidx.webkit.Profile
    public final void preconnect(String str) {
        if (!axn.F.a()) {
            throw axn.a();
        }
        this.a.preconnect(str);
    }

    @Override // androidx.webkit.Profile
    public final void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, gtf gtfVar) {
        if (!axn.s.a()) {
            throw axn.a();
        }
        this.a.prefetchUrl(str, cancellationSignal, executor, new er3(new wsg(gtfVar)));
    }

    @Override // androidx.webkit.Profile
    public final void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, lyj lyjVar, gtf gtfVar) {
        if (!axn.s.a()) {
            throw axn.a();
        }
        this.a.prefetchUrl(str, cancellationSignal, executor, new er3(new ioj((byte) 1)), new er3(new wsg(gtfVar)));
    }

    @Override // androidx.webkit.Profile
    public final void setOriginMatchedHeader(String str, String str2, Set set) {
        if (!axn.D.a()) {
            throw axn.a();
        }
        this.a.setOriginMatchedHeader(str, str2, set);
    }

    @Override // androidx.webkit.Profile
    public final void setSpeculativeLoadingConfig(kyj kyjVar) {
        if (!axn.x.a()) {
            throw axn.a();
        }
        this.a.setSpeculativeLoadingConfig(new er3(new tmj((byte) 1)));
    }

    @Override // androidx.webkit.Profile
    public final void warmUpRendererProcess() {
        if (!axn.C.a()) {
            throw axn.a();
        }
        this.a.warmUpRendererProcess();
    }
}
